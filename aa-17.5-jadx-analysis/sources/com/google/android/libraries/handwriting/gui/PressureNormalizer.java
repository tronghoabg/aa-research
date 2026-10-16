package com.google.android.libraries.handwriting.gui;

/* loaded from: classes3.dex */
class PressureNormalizer {
    private static final float ALPHA_OBSERVED = 0.4f;
    private static final float DOCUMENTED_MAX_PRESSURE = 1.0f;
    private static final float DOCUMENTED_MIN_PRESSURE = 0.0f;
    private static final float MAX_DELTA = 0.1f;
    private float observedMinPressure = 0.0f;
    private float observedMaxPressure = DOCUMENTED_MAX_PRESSURE;
    private float minPressure = 0.0f;
    private float maxPressure = DOCUMENTED_MAX_PRESSURE;
    private float lastNormalizedPressure = -1.0f;
    private float minRadius = 2.0f;
    private float maxRadius = 10.0f;
    private float deltaRadius = 8.0f;
    private float densityFactor = DOCUMENTED_MAX_PRESSURE;

    private float getNormalizedPressure(float f) {
        if (f < this.observedMinPressure) {
            this.observedMinPressure = f;
            updateUsedExtrema();
        }
        if (f > this.observedMaxPressure) {
            this.observedMaxPressure = f;
            updateUsedExtrema();
        }
        float f2 = this.minPressure;
        return (f - f2) / (this.maxPressure - f2);
    }

    private float getNormalizedSmoothedPressure(float f) {
        if (f > DOCUMENTED_MAX_PRESSURE) {
            f = 1.0f;
        }
        float normalizedPressure = getNormalizedPressure(f);
        float f2 = this.lastNormalizedPressure;
        if (f2 >= 0.0f) {
            float f3 = f2 - normalizedPressure;
            if (Math.abs(f3) > MAX_DELTA) {
                normalizedPressure = this.lastNormalizedPressure - (Math.signum(f3) * MAX_DELTA);
            }
        }
        this.lastNormalizedPressure = normalizedPressure;
        return normalizedPressure;
    }

    private void updateUsedExtrema() {
        this.minPressure = (this.observedMinPressure * ALPHA_OBSERVED) + 0.0f;
        this.maxPressure = (this.observedMaxPressure * ALPHA_OBSERVED) + 0.6f;
    }

    public float defaultStrokeWidth() {
        return (this.minRadius + this.maxRadius) / 2.0f;
    }

    public float getMaxRadius() {
        return this.maxRadius;
    }

    public float getMinRadius() {
        return this.minRadius;
    }

    public float getRadius(float f) {
        float normalizedSmoothedPressure = getNormalizedSmoothedPressure(f);
        return this.minRadius + (normalizedSmoothedPressure * normalizedSmoothedPressure * this.deltaRadius);
    }

    public float getStrokeWidth(float f) {
        float normalizedSmoothedPressure = getNormalizedSmoothedPressure(f);
        float f2 = this.minRadius + (normalizedSmoothedPressure * normalizedSmoothedPressure * this.deltaRadius);
        return f2 + f2;
    }

    public void resetSmoothing() {
        this.lastNormalizedPressure = -1.0f;
    }

    public void setDensityFactor(float f) {
        this.densityFactor = f;
    }

    public void setMaxRadius(float f) {
        float f2 = f * this.densityFactor;
        this.maxRadius = f2;
        this.deltaRadius = f2 - this.minRadius;
    }

    public void setMinRadius(float f) {
        float f2 = f * this.densityFactor;
        this.minRadius = f2;
        this.deltaRadius = this.maxRadius - f2;
    }
}
