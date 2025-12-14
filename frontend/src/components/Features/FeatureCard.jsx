import { features } from "./Featured";

export default function FeatureCard() { 
  return (
    <section className="features container">
      <div className="features-grid">
        {features.map((item, index) => (
          <div key={index} className="feature-item">
            <h3>{item.title}</h3>
            <p>{item.description}</p>
          </div>
        ))}
      </div>
    </section>
  );
}