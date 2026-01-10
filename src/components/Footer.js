import React from 'react';
import OrderButton from './OrderButton';

function Footer() {
    return(
        <section className="footer-wrapper">
            <div className="footer-content">
                <p>&copy; 2025 The Indie Bites Kch - created by Silvia. All rights reserved.</p>
            </div>
            <div className="footer-content">
                <OrderButton variant="footer-order-btn" />
            </div>
        </section>
    );
}

export default Footer;