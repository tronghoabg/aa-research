package androidx.constraintlayout.core.motion.utils;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class StopLogicEngine implements StopEngine {
    private static final float EPSILON = 1.0E-5f;
    private boolean mBackwards = false;
    private boolean mDone = false;
    private float mLastPosition;
    private float mLastTime;
    private int mNumberOfStages;
    private float mStage1Duration;
    private float mStage1EndPosition;
    private float mStage1Velocity;
    private float mStage2Duration;
    private float mStage2EndPosition;
    private float mStage2Velocity;
    private float mStage3Duration;
    private float mStage3EndPosition;
    private float mStage3Velocity;
    private float mStartPosition;
    private String mType;

    private float calcY(float f2) {
        this.mDone = false;
        float f3 = this.mStage1Duration;
        if (f2 <= f3) {
            float f4 = this.mStage1Velocity;
            return (f4 * f2) + ((((this.mStage2Velocity - f4) * f2) * f2) / (f3 + f3));
        }
        int i2 = this.mNumberOfStages;
        if (i2 == 1) {
            return this.mStage1EndPosition;
        }
        float f5 = f2 - f3;
        float f6 = this.mStage2Duration;
        if (f5 < f6) {
            float f7 = this.mStage1EndPosition;
            float f8 = this.mStage2Velocity;
            return f7 + (f8 * f5) + ((((this.mStage3Velocity - f8) * f5) * f5) / (f6 + f6));
        }
        if (i2 == 2) {
            return this.mStage2EndPosition;
        }
        float f9 = f5 - f6;
        float f10 = this.mStage3Duration;
        if (f9 > f10) {
            this.mDone = true;
            return this.mStage3EndPosition;
        }
        float f11 = this.mStage2EndPosition;
        float f12 = this.mStage3Velocity * f9;
        return (f11 + f12) - ((f12 * f9) / (f10 + f10));
    }

    private void setup(float f2, float f3, float f4, float f5, float f6) {
        this.mDone = false;
        this.mStage3EndPosition = f3;
        if (f2 == 0.0f) {
            f2 = 1.0E-4f;
        }
        if (f2 < 0.0f) {
            float fSqrt = (float) Math.sqrt((f3 - ((((-f2) / f4) * f2) / 2.0f)) * f4);
            if (fSqrt < f5) {
                this.mType = "backward accelerate, decelerate";
                this.mNumberOfStages = 2;
                this.mStage1Velocity = f2;
                this.mStage2Velocity = fSqrt;
                this.mStage3Velocity = 0.0f;
                float f7 = (fSqrt - f2) / f4;
                this.mStage1Duration = f7;
                this.mStage2Duration = fSqrt / f4;
                this.mStage1EndPosition = ((f2 + fSqrt) * f7) / 2.0f;
                this.mStage2EndPosition = f3;
                this.mStage3EndPosition = f3;
                return;
            }
            float f8 = f2 + f5;
            this.mType = "backward accelerate cruse decelerate";
            this.mNumberOfStages = 3;
            this.mStage1Velocity = f2;
            this.mStage2Velocity = f5;
            this.mStage3Velocity = f5;
            float f9 = (f5 - f2) / f4;
            this.mStage1Duration = f9;
            float f10 = f5 / f4;
            this.mStage3Duration = f10;
            float f11 = (f8 * f9) / 2.0f;
            float f12 = (f10 * f5) / 2.0f;
            this.mStage2Duration = ((f3 - f11) - f12) / f5;
            this.mStage1EndPosition = f11;
            this.mStage2EndPosition = f3 - f12;
            this.mStage3EndPosition = f3;
            return;
        }
        float f13 = f2 / f4;
        float f14 = (f13 * f2) / 2.0f;
        if (f14 >= f3) {
            this.mType = "hard stop";
            this.mNumberOfStages = 1;
            this.mStage1Velocity = f2;
            this.mStage2Velocity = 0.0f;
            this.mStage1EndPosition = f3;
            this.mStage1Duration = (f3 + f3) / f2;
            return;
        }
        float f15 = f3 - f14;
        float f16 = f15 / f2;
        if (f16 + f13 < f6) {
            this.mType = "cruse decelerate";
            this.mNumberOfStages = 2;
            this.mStage1Velocity = f2;
            this.mStage2Velocity = f2;
            this.mStage3Velocity = 0.0f;
            this.mStage1EndPosition = f15;
            this.mStage2EndPosition = f3;
            this.mStage1Duration = f16;
            this.mStage2Duration = f13;
            return;
        }
        float fSqrt2 = (float) Math.sqrt((f4 * f3) + ((f2 * f2) / 2.0f));
        float f17 = (fSqrt2 - f2) / f4;
        float f18 = fSqrt2 / f4;
        if (fSqrt2 < f5) {
            this.mType = "accelerate decelerate";
            this.mNumberOfStages = 2;
            this.mStage1Velocity = f2;
            this.mStage2Velocity = fSqrt2;
            this.mStage3Velocity = 0.0f;
            this.mStage1Duration = f17;
            this.mStage2Duration = f18;
            this.mStage1EndPosition = ((f2 + fSqrt2) * f17) / 2.0f;
            this.mStage2EndPosition = f3;
            return;
        }
        float f19 = f2 + f5;
        this.mType = "accelerate cruse decelerate";
        this.mNumberOfStages = 3;
        this.mStage1Velocity = f2;
        this.mStage2Velocity = f5;
        this.mStage3Velocity = f5;
        float f20 = (f5 - f2) / f4;
        this.mStage1Duration = f20;
        float f21 = f5 / f4;
        this.mStage3Duration = f21;
        float f22 = (f19 * f20) / 2.0f;
        float f23 = (f21 * f5) / 2.0f;
        this.mStage2Duration = ((f3 - f22) - f23) / f5;
        this.mStage1EndPosition = f22;
        this.mStage2EndPosition = f3 - f23;
        this.mStage3EndPosition = f3;
    }

    public void config(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.mDone = false;
        this.mStartPosition = f2;
        boolean z = f2 > f3;
        this.mBackwards = z;
        if (z) {
            setup(-f4, f2 - f3, f6, f7, f5);
        } else {
            setup(f4, f3 - f2, f6, f7, f5);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String str, float f2) {
        String str2 = str + " ===== " + this.mType + "\n";
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str);
        sb.append(true != this.mBackwards ? "forward " : "backwards");
        sb.append(" time = ");
        sb.append(f2);
        sb.append("  stages ");
        sb.append(this.mNumberOfStages);
        sb.append("\n");
        String str3 = sb.toString() + str + " dur " + this.mStage1Duration + " vel " + this.mStage1Velocity + " pos " + this.mStage1EndPosition + "\n";
        if (this.mNumberOfStages > 1) {
            str3 = str3 + str + " dur " + this.mStage2Duration + " vel " + this.mStage2Velocity + " pos " + this.mStage2EndPosition + "\n";
        }
        if (this.mNumberOfStages > 2) {
            str3 = str3 + str + " dur " + this.mStage3Duration + " vel " + this.mStage3Velocity + " pos " + this.mStage3EndPosition + "\n";
        }
        float f3 = this.mStage1Duration;
        if (f2 <= f3) {
            return str3 + str + "stage 0\n";
        }
        int i2 = this.mNumberOfStages;
        if (i2 == 1) {
            return str3 + str + "end stage 0\n";
        }
        float f4 = f2 - f3;
        float f5 = this.mStage2Duration;
        if (f4 < f5) {
            return str3 + str + " stage 1\n";
        }
        if (i2 == 2) {
            return str3 + str + "end stage 1\n";
        }
        if (f4 - f5 < this.mStage3Duration) {
            return str3 + str + " stage 2\n";
        }
        return str3 + str + " end stage 2\n";
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f2) {
        float fCalcY = calcY(f2);
        this.mLastPosition = fCalcY;
        this.mLastTime = f2;
        boolean z = this.mBackwards;
        float f3 = this.mStartPosition;
        return z ? f3 - fCalcY : f3 + fCalcY;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f2) {
        float f3;
        float f4;
        float f5 = this.mStage1Duration;
        if (f2 <= f5) {
            f3 = this.mStage1Velocity;
            f4 = this.mStage2Velocity;
        } else {
            int i2 = this.mNumberOfStages;
            if (i2 == 1) {
                return 0.0f;
            }
            f2 -= f5;
            f5 = this.mStage2Duration;
            if (f2 >= f5) {
                if (i2 == 2) {
                    return 0.0f;
                }
                float f6 = f2 - f5;
                float f7 = this.mStage3Duration;
                if (f6 >= f7) {
                    return 0.0f;
                }
                float f8 = this.mStage3Velocity;
                return f8 - ((f6 * f8) / f7);
            }
            f3 = this.mStage2Velocity;
            f4 = this.mStage3Velocity;
        }
        return f3 + (((f4 - f3) * f2) / f5);
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        return getVelocity() < EPSILON && Math.abs(this.mStage3EndPosition - this.mLastPosition) < EPSILON;
    }

    /* compiled from: WazeSource */
    public class Decelerate implements StopEngine {
        private float mAcceleration;
        private float mDestination;
        private boolean mDone = false;
        private float mDuration;
        private float mInitialPos;
        private float mInitialVelocity;
        private float mLastVelocity;

        public void config(float f2, float f3, float f4) {
            this.mDone = false;
            this.mDestination = f3;
            this.mInitialVelocity = f4;
            this.mInitialPos = f2;
            float f5 = (f3 - f2) / (f4 / 2.0f);
            this.mDuration = f5;
            this.mAcceleration = (-f4) / f5;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public String debug(String str, float f2) {
            return this.mDuration + " " + this.mLastVelocity;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public float getInterpolation(float f2) {
            if (f2 > this.mDuration) {
                this.mDone = true;
                return this.mDestination;
            }
            getVelocity(f2);
            return this.mInitialPos + ((this.mInitialVelocity + ((this.mAcceleration * f2) / 2.0f)) * f2);
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public float getVelocity(float f2) {
            if (f2 > this.mDuration) {
                return 0.0f;
            }
            float f3 = this.mInitialVelocity + (this.mAcceleration * f2);
            this.mLastVelocity = f3;
            return f3;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public boolean isStopped() {
            return this.mDone;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public float getVelocity() {
            return this.mLastVelocity;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        boolean z = this.mBackwards;
        float velocity = getVelocity(this.mLastTime);
        return z ? -velocity : velocity;
    }
}
