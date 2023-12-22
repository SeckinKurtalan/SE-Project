// src/components/CityPlateList.js
import React from 'react';
import Star from './Star';
import '../ActivityDetails.css';
import { Link } from 'react-router-dom';
import Navbar from "./Navbar";
import { useNavigate } from 'react-router-dom';

import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faSearch } from "@fortawesome/free-solid-svg-icons";



const ActivityDetails = () => {
  
  
    return (
      <div className='nav-and-search'>
        <Navbar/>
        <div className="search-container">

        <input className="search-input" type="text" placeholder="Search for event artists or venues"/>
        <FontAwesomeIcon icon={faSearch} className="search-icon" />
        </div>

        <div className="container">

        <div className="grid-main">
          <div className='img-container'>
            <div className="img-inside-container">
              <img className='img-detail' src="concert-detail.png" alt="" srcset="" />
            </div>
          </div>

          <div className="detail-content">
          <div className='main-content'>
            <h1>SENA</h1>
            <br />
            sdadsa
            dassdaa
            fdfads

          </div>

          </div>
        </div>
        </div>

      </div>
      );
  };
  
  export default ActivityDetails;