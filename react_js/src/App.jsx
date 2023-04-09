import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Coba from './components/coba';
import About from './components/About';
import Contact from './components/Contact';
import AddProduct from './components/addProduct';
import EditProduct from './components/EditProduct';

function App() {
  return (
    <div className=' container center'>
      <Router>
        <Routes>
          <Route path='/' element={<Coba />} />
          <Route path='/about' element={<About />} />
          <Route path='/add' element={<AddProduct />} />
          <Route path='/edit/:id' element={< EditProduct />} />
          <Route path='/contact' element={<Contact />} />
        </Routes>
      </Router>

    </div>
  )
}

export default App
