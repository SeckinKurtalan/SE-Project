// src/components/CityPlateList.js
import React from 'react';
import Star from './Star';
import '../CityPlateList.css';
import { Link } from 'react-router-dom';

const citiesAndPlates = [
    { city: 'Adana', plate: 1 },
    { city: 'Adıyaman', plate: 2 },
    { city: 'Ağrı', plate: 4 },
    { city: 'Amasya', plate: 5 },
    { city: 'Ankara', plate: 6 },
    { city: 'Antalya', plate: 7 },
    { city: 'Artvin', plate: 8 },
    { city: 'Aydın', plate: 9 },
    { city: 'Balıkesir', plate: 10 },
    { city: 'Bilecik', plate: 11 },
    { city: 'Bingöl', plate: 12 },
    { city: 'Bitlis', plate: 13 },
    { city: 'Bolu', plate: 14 },
    { city: 'Burdur', plate: 15 },
    { city: 'Bursa', plate: 16 },
    { city: 'Çanakkale', plate: 17 },
    { city: 'Çankırı', plate: 18 },
    { city: 'Çorum', plate: 19 },
    { city: 'Denizli', plate: 20 },
    { city: 'Diyarbakır', plate: 21 },
    { city: 'Edirne', plate: 22 },
    { city: 'Elazığ', plate: 23 },
    { city: 'Erzincan', plate: 24 },
    { city: 'Erzurum', plate: 25 },
    { city: 'Eskişehir', plate: 26 },
    { city: 'Gaziantep', plate: 27 },
    { city: 'Giresun', plate: 28 },
    { city: 'Gümüşhane', plate: 29 },
    { city: 'Hakkari', plate: 30 },
    { city: 'Hatay', plate: 31 },
    { city: 'Isparta', plate: 32 },
    { city: 'Mersin', plate: 33 },
    { city: 'İstanbul', plate: 34 },
    { city: 'İzmir', plate: 35 },
    { city: 'Kars', plate: 36 },
    { city: 'Kastamonu', plate: 37 },
    { city: 'Kayseri', plate: 38 },
    { city: 'Kırklareli', plate: 39 },
    { city: 'Kırşehir', plate: 40 },
    { city: 'Kocaeli', plate: 41 },
    { city: 'Konya', plate: 42 },
    { city: 'Kütahya', plate: 43 },
    { city: 'Malatya', plate: 44 },
    { city: 'Manisa', plate: 45 },
    { city: 'Mardin', plate: 47 },
    { city: 'Muğla', plate: 48 },
    { city: 'Muş', plate: 49 },
    { city: 'Nevşehir', plate: 50 },
    { city: 'Niğde', plate: 51 },
    { city: 'Ordu', plate: 52 },
    { city: 'Rize', plate: 53 },
    { city: 'Sivas', plate: 58 },
    { city: 'Tekirdağ', plate: 59 },
    { city: 'Uşak', plate: 64 },
    { city: 'Van', plate: 65 },
    { city: 'Yozgat', plate: 66 },
    { city: 'Bartın', plate: 74 },
    { city: 'Ardahan', plate: 75 },
    { city: 'Iğdır', plate: 76 },
    { city: 'Yalova', plate: 77 },
    { city: 'Düzce', plate: 81 },
  ];

const CityPlateList = () => {
    const handleCityClick = (city) => {
      // Şehre göre yönlendirme yap
      // Örneğin: İstanbul'a tıklandığında Dashboard'a yönlendir
      if (city === 'İstanbul') {
        // Yönlendirme yapılacak
        // Örneğin: history.push('/dashboard') şeklinde React Router'ı kullanarak yapılabilir
      }
    };
  
    return (
        <div>
          <div class="background-image"></div>
          <div className="background-darkness"></div>
        <div className='container-all'>
          <div className='search-side'>
            search
          </div>
    
          <div className="plate-side">
            <div className="city-plate-list">
              <div className='city-container'>
                {citiesAndPlates.map((item, index) => (
                  <div className='city-and-plate' key={index}>
                    <div className="city-container-inside">
                      <p className="city">{item.city}</p>
                      <div className="plate-container">
                        <p className="plate">{item.plate}</p>
                      </div>
                    </div>
                  </div>
                ))}
              </div>
            </div>
          </div>
    
          <div className="admin-side">
            admin
          </div>
    
        </div>
    
                </div>
      );
  };
  
  export default CityPlateList;