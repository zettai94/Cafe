import React from 'react';

function Hero() {
    return(
        <header className='header p-5'>
            <div className='header-content'>
                <div className="row align-items-center">

                    {/* Text column */}
                    <div className="col-md text-start">
                        <h1 className="display-6 fw-bold">
                            Welcome to Indie Bites
                        </h1>
                        <p className="lead p-1">
                            Serving homemade baked goods and specialty coffee with love and care. Order online for pickup or delivery!
                        </p>
                    </div>

                    {/* Image column */}
                    <div className="col-md-6 text-center">
                        <div className="header-image-placeholder">
                            <img src='#' alt='insert image for later' className='img-fluid rounded'/>
                        </div>
                    </div>
                </div>
            </div>
        </header>
    );
}

export default Hero; 