import "../Navbar.css"
function Navbar() {

  return (
   <div className='navbar'>
    <div className='container'>
      <div className="main-logo-container">

      <img src="/main-logo.png" alt="" srcset="" className='main-logo' />
      </div>
      <div className="nav-right-container">
        <div className="about-container">
            <a href="#" className="about-link">About</a>
        </div>
        <div className="main-page-container">
            <a href="#" className="main-page-link">Main Page</a>
        </div>
        <div className="settings-container">
            <a href="#" className="settings-link">Settings</a>
        </div>
      </div>
    </div>
   </div>
  )
}

export default Navbar