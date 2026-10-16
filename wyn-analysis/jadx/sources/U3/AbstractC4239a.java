package u3;

import a1.AbstractC1312b;
import android.R;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import b1.C1496e;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import p7.AbstractC3772b;

/* renamed from: u3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4239a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f46563a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f46564b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f46565c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f46566d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f46567e = {R.attr.drawable};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f46568f = {R.attr.name, R.attr.animation};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f46569g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f46570h = {R.attr.ordering};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f46571i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f46572j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};
    public static final int[] k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    /* JADX WARN: Code restructure failed: missing block: B:209:0x03b0, code lost:
    
        if (r32 == null) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03b2, code lost:
    
        if (r22 == null) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03b4, code lost:
    
        r2 = new android.animation.Animator[r22.size()];
        r3 = r22.iterator();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x03c3, code lost:
    
        if (r3.hasNext() == false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03c5, code lost:
    
        r2[r11] = (android.animation.Animator) r3.next();
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03d1, code lost:
    
        if (r33 != 0) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03d3, code lost:
    
        r32.playTogether(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x03d6, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03d7, code lost:
    
        r32.playSequentially(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03da, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r22 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0382 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0392  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator a(android.content.Context r27, android.content.res.Resources r28, android.content.res.Resources.Theme r29, android.content.res.XmlResourceParser r30, android.util.AttributeSet r31, android.animation.AnimatorSet r32, int r33) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.AbstractC4239a.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.content.res.XmlResourceParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i5, int i10, int i11, String str) {
        PropertyValuesHolder propertyValuesHolderOfFloat;
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        boolean z2 = typedValuePeekValue != null;
        int i12 = z2 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i11);
        boolean z10 = typedValuePeekValue2 != null;
        int i13 = z10 ? typedValuePeekValue2.type : 0;
        if (i5 == 4) {
            i5 = ((z2 && c(i12)) || (z10 && c(i13))) ? 3 : 0;
        }
        boolean z11 = i5 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i5 == 2) {
            String string = typedArray.getString(i10);
            String string2 = typedArray.getString(i11);
            C1496e[] c1496eArrN = AbstractC3772b.n(string);
            C1496e[] c1496eArrN2 = AbstractC3772b.n(string2);
            if (c1496eArrN != null || c1496eArrN2 != null) {
                if (c1496eArrN != null) {
                    C4243e c4243e = new C4243e();
                    if (c1496eArrN2 == null) {
                        return PropertyValuesHolder.ofObject(str, c4243e, c1496eArrN);
                    }
                    if (AbstractC3772b.h(c1496eArrN, c1496eArrN2)) {
                        return PropertyValuesHolder.ofObject(str, c4243e, c1496eArrN, c1496eArrN2);
                    }
                    throw new InflateException(N0.a.h(" Can't morph from ", string, " to ", string2));
                }
                if (c1496eArrN2 != null) {
                    return PropertyValuesHolder.ofObject(str, new C4243e(), c1496eArrN2);
                }
            }
            return null;
        }
        C4244f c4244f = i5 == 3 ? C4244f.f46585a : null;
        if (z11) {
            if (z2) {
                float dimension = i12 == 5 ? typedArray.getDimension(i10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : typedArray.getFloat(i10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (z10) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i13 == 5 ? typedArray.getDimension(i11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : typedArray.getFloat(i11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i13 == 5 ? typedArray.getDimension(i11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : typedArray.getFloat(i11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z2) {
            int dimension2 = i12 == 5 ? (int) typedArray.getDimension(i10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : c(i12) ? typedArray.getColor(i10, 0) : typedArray.getInt(i10, 0);
            if (z10) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2, i13 == 5 ? (int) typedArray.getDimension(i11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : c(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0));
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2);
            }
        } else if (z10) {
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i13 == 5 ? (int) typedArray.getDimension(i11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : c(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0));
        }
        if (propertyValuesHolderOfInt != null && c4244f != null) {
            propertyValuesHolderOfInt.setEvaluator(c4244f);
        }
        return propertyValuesHolderOfInt;
    }

    public static boolean c(int i5) {
        return i5 >= 28 && i5 <= 31;
    }

    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        int resourceId = 0;
        TypedArray typedArrayI = AbstractC1312b.i(resources, theme, attributeSet, f46569g);
        TypedArray typedArrayI2 = AbstractC1312b.i(resources, theme, attributeSet, k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j8 = AbstractC1312b.f(xmlResourceParser, "duration") ? typedArrayI.getInt(1, 300) : 300;
        long j10 = !(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null) ? 0 : typedArrayI.getInt(2, 0);
        int i5 = !(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null) ? 4 : typedArrayI.getInt(7, 4);
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i5 == 4) {
                TypedValue typedValuePeekValue = typedArrayI.peekValue(5);
                boolean z2 = typedValuePeekValue != null;
                int i10 = z2 ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayI.peekValue(6);
                boolean z10 = typedValuePeekValue2 != null;
                i5 = ((z2 && c(i10)) || (z10 && c(z10 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderB = b(typedArrayI, i5, 5, 6, "");
            if (propertyValuesHolderB != null) {
                valueAnimator3.setValues(propertyValuesHolderB);
            }
        }
        valueAnimator3.setDuration(j8);
        valueAnimator3.setStartDelay(j10);
        valueAnimator3.setRepeatCount(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null ? typedArrayI.getInt(3, 0) : 0);
        valueAnimator3.setRepeatMode(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null ? typedArrayI.getInt(4, 1) : 1);
        if (typedArrayI2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String strE = AbstractC1312b.e(typedArrayI2, xmlResourceParser, "pathData", 1);
            if (strE != null) {
                String strE2 = AbstractC1312b.e(typedArrayI2, xmlResourceParser, "propertyXName", 2);
                String strE3 = AbstractC1312b.e(typedArrayI2, xmlResourceParser, "propertyYName", 3);
                if (i5 != 2) {
                }
                if (strE2 == null && strE3 == null) {
                    throw new InflateException(typedArrayI2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path pathO = AbstractC3772b.o(strE);
                PathMeasure pathMeasure = new PathMeasure(pathO, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                float length = 0.0f;
                do {
                    length += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(length));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(pathO, false);
                int iMin = Math.min(100, ((int) (length / 0.5f)) + 1);
                float[] fArr = new float[iMin];
                float[] fArr2 = new float[iMin];
                float[] fArr3 = new float[2];
                float f10 = length / (iMin - 1);
                valueAnimator = valueAnimator3;
                int i11 = 0;
                int i12 = 0;
                float f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                while (true) {
                    if (i11 >= iMin) {
                        break;
                    }
                    int i13 = i11;
                    pathMeasure2.getPosTan(f11 - ((Float) arrayList.get(i12)).floatValue(), fArr3, null);
                    fArr[i13] = fArr3[0];
                    fArr2[i13] = fArr3[1];
                    int i14 = i12 + 1;
                    f11 += f10;
                    if (i14 < arrayList.size() && f11 > ((Float) arrayList.get(i14)).floatValue()) {
                        pathMeasure2.nextContour();
                        i12 = i14;
                    }
                    i11 = i13 + 1;
                }
                PropertyValuesHolder propertyValuesHolderOfFloat = strE2 != null ? PropertyValuesHolder.ofFloat(strE2, fArr) : null;
                PropertyValuesHolder propertyValuesHolderOfFloat2 = strE3 != null ? PropertyValuesHolder.ofFloat(strE3, fArr2) : null;
                if (propertyValuesHolderOfFloat == null) {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                } else if (propertyValuesHolderOfFloat2 == null) {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat);
                } else {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                }
                resourceId = 0;
            } else {
                valueAnimator = valueAnimator3;
                objectAnimator2.setPropertyName(AbstractC1312b.e(typedArrayI2, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
        }
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null) {
            resourceId = typedArrayI.getResourceId(resourceId, resourceId);
        }
        if (resourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArrayI.recycle();
        if (typedArrayI2 != null) {
            typedArrayI2.recycle();
        }
        return valueAnimator2;
    }
}
