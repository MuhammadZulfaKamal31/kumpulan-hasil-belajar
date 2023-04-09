import { useState, useEffect } from "react";
import { Link } from "react-router-dom";

//jangan di pasang props, soalnya gak bisa masuk
const Coba = () => {
    const [product, setProduct] = useState([]);

    useEffect(() => {
        fetchData()
    }, [])

    const fetchData = async () => {
        const response = await fetch('http://localhost:8181/products')
        const data = await response.json();
        setProduct(data)
    }

    const deleteProduct = async (id) => {
        await fetch(`http://localhost:8181/products/${id}`, {
            method: 'DELETE',
            headers: {
                'Content-Type': 'application/json'
            }
        });
        fetchData();
    }
    return (
        <div>
            <Link to='/add' className="button is-primary">add</Link>
            <table className="table is-striped is-fullwidth">
                <thead>
                    <tr>
                        <th>No</th>
                        <th>Title</th>
                        <th>price</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    {product.map((product, index) => (
                        <tr key={product.id}>
                            <td>{index + 1}</td>
                            <td>{product.title}</td>
                            <td>{product.price}</td>
                            <td>
                                <Link to={`/edit/${product.id}`} className=" button is small is-info">edit</Link>
                                <button onClick={() => deleteProduct(product.id)} className=" button is small is-danger">Delete</button>
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    )
}
export default Coba;