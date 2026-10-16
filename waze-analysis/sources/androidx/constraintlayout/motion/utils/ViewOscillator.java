package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class ViewOscillator extends KeyCycleOscillator {
    private static final String TAG = "ViewOscillator";

    /* compiled from: WazeSource */
    class AlphaSet extends ViewOscillator {
        AlphaSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f2) {
            view.setAlpha(get(f2));
        }
    }

    /* compiled from: WazeSource */
    class CustomSet extends ViewOscillator {
        protected ConstraintAttribute mCustom;
        float[] mValue = new float[1];

        CustomSet() {
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        protected void setCustom(Object obj) {
            this.mCustom = (ConstraintAttribute) obj;
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f2) {
            this.mValue[0] = get(f2);
            CustomSupport.setInterpolatedValue(this.mCustom, view, this.mValue);
        }
    }

    /* compiled from: WazeSource */
    class ElevationSet extends ViewOscillator {
        ElevationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f2) {
            view.setElevation(get(f2));
        }
    }

    /* compiled from: WazeSource */
    public class PathRotateSet extends ViewOscillator {
        public void setPathRotate(View view, float f2, double d2, double d3) {
            view.setRotation(get(f2) + ((float) Math.toDegrees(Math.atan2(d3, d2))));
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f2) {
        }
    }

    /* compiled from: WazeSource */
    class ProgressSet extends ViewOscillator {
        boolean mNoMethod = false;

        ProgressSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(get(f2));
                return;
            }
            if (this.mNoMethod) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.mNoMethod = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(get(f2)));
                } catch (IllegalAccessException e2) {
                    Log.e(ViewOscillator.TAG, "unable to setProgress", e2);
                } catch (InvocationTargetException e3) {
                    Log.e(ViewOscillator.TAG, "unable to setProgress", e3);
                }
            }
        }
    }

    /* compiled from: WazeSource */
    class RotationSet extends ViewOscillator {
        RotationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f2) {
            view.setRotation(get(f2));
        }
    }

    /* compiled from: WazeSource */
    class RotationXset extends ViewOscillator {
        RotationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f2) {
            view.setRotationX(get(f2));
        }
    }

    /* compiled from: WazeSource */
    class RotationYset extends ViewOscillator {
        RotationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f2) {
            view.setRotationY(get(f2));
        }
    }

    /* compiled from: WazeSource */
    class ScaleXset extends ViewOscillator {
        ScaleXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f2) {
            view.setScaleX(get(f2));
        }
    }

    /* compiled from: WazeSource */
    class ScaleYset extends ViewOscillator {
        ScaleYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f2) {
            view.setScaleY(get(f2));
        }
    }

    /* compiled from: WazeSource */
    class TranslationXset extends ViewOscillator {
        TranslationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f2) {
            view.setTranslationX(get(f2));
        }
    }

    /* compiled from: WazeSource */
    class TranslationYset extends ViewOscillator {
        TranslationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f2) {
            view.setTranslationY(get(f2));
        }
    }

    /* compiled from: WazeSource */
    class TranslationZset extends ViewOscillator {
        TranslationZset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f2) {
            view.setTranslationZ(get(f2));
        }
    }

    public static ViewOscillator makeSpline(String str) {
        if (str.startsWith("CUSTOM")) {
            return new CustomSet();
        }
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    return new RotationXset();
                }
                return null;
            case -1249320805:
                if (str.equals("rotationY")) {
                    return new RotationYset();
                }
                return null;
            case -1225497657:
                if (str.equals("translationX")) {
                    return new TranslationXset();
                }
                return null;
            case -1225497656:
                if (str.equals("translationY")) {
                    return new TranslationYset();
                }
                return null;
            case -1225497655:
                if (str.equals("translationZ")) {
                    return new TranslationZset();
                }
                return null;
            case -1001078227:
                if (str.equals("progress")) {
                    return new ProgressSet();
                }
                return null;
            case -908189618:
                if (str.equals("scaleX")) {
                    return new ScaleXset();
                }
                return null;
            case -908189617:
                if (str.equals("scaleY")) {
                    return new ScaleYset();
                }
                return null;
            case -797520672:
                if (str.equals(Key.WAVE_VARIES_BY)) {
                    return new AlphaSet();
                }
                return null;
            case -40300674:
                if (str.equals(Key.ROTATION)) {
                    return new RotationSet();
                }
                return null;
            case -4379043:
                if (str.equals("elevation")) {
                    return new ElevationSet();
                }
                return null;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    return new PathRotateSet();
                }
                return null;
            case 92909918:
                if (str.equals("alpha")) {
                    return new AlphaSet();
                }
                return null;
            case 156108012:
                if (str.equals("waveOffset")) {
                    return new AlphaSet();
                }
                return null;
            default:
                return null;
        }
    }

    public abstract void setProperty(View view, float f2);
}
