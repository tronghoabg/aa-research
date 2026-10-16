package androidx.dynamicanimation.animation;

import androidx.camera.video.AudioStats;
import androidx.dynamicanimation.animation.DynamicAnimation;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SpringForce implements Force {
    public static final float DAMPING_RATIO_HIGH_BOUNCY = 0.2f;
    public static final float DAMPING_RATIO_LOW_BOUNCY = 0.75f;
    public static final float DAMPING_RATIO_MEDIUM_BOUNCY = 0.5f;
    public static final float DAMPING_RATIO_NO_BOUNCY = 1.0f;
    public static final float STIFFNESS_HIGH = 10000.0f;
    public static final float STIFFNESS_LOW = 200.0f;
    public static final float STIFFNESS_MEDIUM = 1500.0f;
    public static final float STIFFNESS_VERY_LOW = 50.0f;
    private static final double UNSET = Double.MAX_VALUE;
    private static final double VELOCITY_THRESHOLD_MULTIPLIER = 62.5d;
    private double mDampedFreq;
    double mDampingRatio;
    private double mFinalPosition;
    private double mGammaMinus;
    private double mGammaPlus;
    private boolean mInitialized;
    private final DynamicAnimation.MassState mMassState;
    double mNaturalFreq;
    private double mValueThreshold;
    private double mVelocityThreshold;

    public SpringForce(float f2) {
        this.mNaturalFreq = Math.sqrt(1500.0d);
        this.mDampingRatio = 0.5d;
        this.mInitialized = false;
        this.mFinalPosition = UNSET;
        this.mMassState = new DynamicAnimation.MassState();
        this.mFinalPosition = f2;
    }

    private void init() {
        if (this.mInitialized) {
            return;
        }
        if (this.mFinalPosition == UNSET) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d2 = this.mDampingRatio;
        if (d2 > 1.0d) {
            double d3 = this.mNaturalFreq;
            this.mGammaPlus = ((-d2) * d3) + (d3 * Math.sqrt((d2 * d2) - 1.0d));
            double d4 = this.mDampingRatio;
            double d5 = this.mNaturalFreq;
            this.mGammaMinus = ((-d4) * d5) - (d5 * Math.sqrt((d4 * d4) - 1.0d));
        } else if (d2 >= AudioStats.AUDIO_AMPLITUDE_NONE && d2 < 1.0d) {
            this.mDampedFreq = this.mNaturalFreq * Math.sqrt(1.0d - (d2 * d2));
        }
        this.mInitialized = true;
    }

    @Override // androidx.dynamicanimation.animation.Force
    public float getAcceleration(float f2, float f3) {
        float finalPosition = f2 - getFinalPosition();
        double d2 = this.mNaturalFreq;
        return (float) (((-(d2 * d2)) * finalPosition) - (((d2 + d2) * this.mDampingRatio) * f3));
    }

    public float getDampingRatio() {
        return (float) this.mDampingRatio;
    }

    public float getFinalPosition() {
        return (float) this.mFinalPosition;
    }

    public float getStiffness() {
        double d2 = this.mNaturalFreq;
        return (float) (d2 * d2);
    }

    @Override // androidx.dynamicanimation.animation.Force
    public boolean isAtEquilibrium(float f2, float f3) {
        return ((double) Math.abs(f3)) < this.mVelocityThreshold && ((double) Math.abs(f2 - getFinalPosition())) < this.mValueThreshold;
    }

    public SpringForce setDampingRatio(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.mDampingRatio = f2;
        this.mInitialized = false;
        return this;
    }

    public SpringForce setFinalPosition(float f2) {
        this.mFinalPosition = f2;
        return this;
    }

    public SpringForce setStiffness(float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.mNaturalFreq = Math.sqrt(f2);
        this.mInitialized = false;
        return this;
    }

    void setValueThreshold(double d2) {
        double dAbs = Math.abs(d2);
        this.mValueThreshold = dAbs;
        this.mVelocityThreshold = dAbs * VELOCITY_THRESHOLD_MULTIPLIER;
    }

    DynamicAnimation.MassState updateValues(double d2, double d3, long j2) {
        double dPow;
        double dCos;
        init();
        double d4 = d2 - this.mFinalPosition;
        double d5 = this.mDampingRatio;
        double d6 = j2 / 1000.0d;
        if (d5 > 1.0d) {
            double d7 = this.mGammaMinus;
            double d8 = ((d7 * d4) - d3) / (d7 - this.mGammaPlus);
            double d9 = d4 - d8;
            double dPow2 = Math.pow(2.718281828459045d, d7 * d6) * d9;
            double dPow3 = Math.pow(2.718281828459045d, this.mGammaPlus * d6) * d8;
            double d10 = this.mGammaMinus;
            double dPow4 = d9 * d10 * Math.pow(2.718281828459045d, d10 * d6);
            double d11 = this.mGammaPlus;
            dCos = dPow4 + (d8 * d11 * Math.pow(2.718281828459045d, d11 * d6));
            dPow = dPow2 + dPow3;
        } else if (d5 == 1.0d) {
            double d12 = this.mNaturalFreq;
            double d13 = d3 + (d12 * d4);
            double d14 = d4 + (d13 * d6);
            dPow = Math.pow(2.718281828459045d, (-d12) * d6) * d14;
            double dPow5 = d14 * Math.pow(2.718281828459045d, (-this.mNaturalFreq) * d6);
            double d15 = -this.mNaturalFreq;
            dCos = (dPow5 * d15) + (d13 * Math.pow(2.718281828459045d, d6 * d15));
        } else {
            double d16 = 1.0d / this.mDampedFreq;
            double d17 = this.mNaturalFreq;
            double d18 = d16 * ((d5 * d17 * d4) + d3);
            dPow = Math.pow(2.718281828459045d, (-d5) * d17 * d6) * ((Math.cos(this.mDampedFreq * d6) * d4) + (Math.sin(this.mDampedFreq * d6) * d18));
            double d19 = this.mNaturalFreq;
            double d20 = this.mDampingRatio;
            double d21 = (-d19) * dPow * d20;
            double dPow6 = Math.pow(2.718281828459045d, (-d20) * d19 * d6);
            double d22 = this.mDampedFreq;
            double dSin = (-d22) * d4 * Math.sin(d22 * d6);
            double d23 = this.mDampedFreq;
            dCos = d21 + (dPow6 * (dSin + (d18 * d23 * Math.cos(d23 * d6))));
        }
        DynamicAnimation.MassState massState = this.mMassState;
        massState.mValue = (float) (dPow + this.mFinalPosition);
        massState.mVelocity = (float) dCos;
        return massState;
    }

    public SpringForce() {
        this.mNaturalFreq = Math.sqrt(1500.0d);
        this.mDampingRatio = 0.5d;
        this.mInitialized = false;
        this.mFinalPosition = UNSET;
        this.mMassState = new DynamicAnimation.MassState();
    }
}
