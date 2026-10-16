package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class ViewSpline extends SplineSet {
    private static final String TAG = "ViewSpline";

    /* compiled from: WazeSource */
    class AlphaSet extends ViewSpline {
        AlphaSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f2) {
            view.setAlpha(get(f2));
        }
    }

    /* compiled from: WazeSource */
    class ElevationSet extends ViewSpline {
        ElevationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f2) {
            view.setElevation(get(f2));
        }
    }

    /* compiled from: WazeSource */
    public class PathRotate extends ViewSpline {
        public void setPathRotate(View view, float f2, double d2, double d3) {
            view.setRotation(get(f2) + ((float) Math.toDegrees(Math.atan2(d3, d2))));
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f2) {
        }
    }

    /* compiled from: WazeSource */
    class PivotXset extends ViewSpline {
        PivotXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f2) {
            view.setPivotX(get(f2));
        }
    }

    /* compiled from: WazeSource */
    class PivotYset extends ViewSpline {
        PivotYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f2) {
            view.setPivotY(get(f2));
        }
    }

    /* compiled from: WazeSource */
    class ProgressSet extends ViewSpline {
        boolean mNoMethod = false;

        ProgressSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
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
                    Log.e(ViewSpline.TAG, "unable to setProgress", e2);
                } catch (InvocationTargetException e3) {
                    Log.e(ViewSpline.TAG, "unable to setProgress", e3);
                }
            }
        }
    }

    /* compiled from: WazeSource */
    class RotationSet extends ViewSpline {
        RotationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f2) {
            view.setRotation(get(f2));
        }
    }

    /* compiled from: WazeSource */
    class RotationXset extends ViewSpline {
        RotationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f2) {
            view.setRotationX(get(f2));
        }
    }

    /* compiled from: WazeSource */
    class RotationYset extends ViewSpline {
        RotationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f2) {
            view.setRotationY(get(f2));
        }
    }

    /* compiled from: WazeSource */
    class ScaleXset extends ViewSpline {
        ScaleXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f2) {
            view.setScaleX(get(f2));
        }
    }

    /* compiled from: WazeSource */
    class ScaleYset extends ViewSpline {
        ScaleYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f2) {
            view.setScaleY(get(f2));
        }
    }

    /* compiled from: WazeSource */
    class TranslationXset extends ViewSpline {
        TranslationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f2) {
            view.setTranslationX(get(f2));
        }
    }

    /* compiled from: WazeSource */
    class TranslationYset extends ViewSpline {
        TranslationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f2) {
            view.setTranslationY(get(f2));
        }
    }

    /* compiled from: WazeSource */
    class TranslationZset extends ViewSpline {
        TranslationZset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f2) {
            view.setTranslationZ(get(f2));
        }
    }

    public static ViewSpline makeCustomSpline(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new CustomSet(str, sparseArray);
    }

    public static ViewSpline makeSpline(String str) {
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
                if (!str.equals(Key.WAVE_VARIES_BY)) {
                    return null;
                }
                break;
            case -760884510:
                if (str.equals(Key.PIVOT_X)) {
                    return new PivotXset();
                }
                return null;
            case -760884509:
                if (str.equals(Key.PIVOT_Y)) {
                    return new PivotYset();
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
                    return new PathRotate();
                }
                return null;
            case 92909918:
                if (!str.equals("alpha")) {
                    return null;
                }
                break;
            case 156108012:
                if (!str.equals("waveOffset")) {
                    return null;
                }
                break;
            default:
                return null;
        }
        return new AlphaSet();
    }

    public abstract void setProperty(View view, float f2);

    /* compiled from: WazeSource */
    public class CustomSet extends ViewSpline {
        String mAttributeName;
        SparseArray<ConstraintAttribute> mConstraintAttributeList;
        float[] mTempValues;

        public CustomSet(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = sparseArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int i2, float f2) {
            throw new RuntimeException("call of custom attribute setPoint");
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f2) {
            this.mCurveFit.getPos(f2, this.mTempValues);
            CustomSupport.setInterpolatedValue(this.mConstraintAttributeList.valueAt(0), view, this.mTempValues);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int i2) {
            int size = this.mConstraintAttributeList.size();
            int iNumberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.mTempValues = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iNumberOfInterpolatedValues);
            for (int i3 = 0; i3 < size; i3++) {
                int iKeyAt = this.mConstraintAttributeList.keyAt(i3);
                ConstraintAttribute constraintAttributeValueAt = this.mConstraintAttributeList.valueAt(i3);
                dArr[i3] = iKeyAt * 0.01d;
                constraintAttributeValueAt.getValuesToInterpolate(this.mTempValues);
                int i4 = 0;
                while (true) {
                    if (i4 < this.mTempValues.length) {
                        dArr2[i3][i4] = r6[i4];
                        i4++;
                    }
                }
            }
            this.mCurveFit = CurveFit.get(i2, dArr, dArr2);
        }

        public void setPoint(int i2, ConstraintAttribute constraintAttribute) {
            this.mConstraintAttributeList.append(i2, constraintAttribute);
        }
    }
}
