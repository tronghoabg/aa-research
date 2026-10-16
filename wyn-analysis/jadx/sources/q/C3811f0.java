package q;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: q.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3811f0 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f43769l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f43770m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f43771a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f43772b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f43773c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f43774d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f43775e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f43776f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f43777g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f43778h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f43779i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f43780j;
    public final C3805c0 k;

    static {
        new ConcurrentHashMap();
    }

    public C3811f0(TextView textView) {
        this.f43779i = textView;
        this.f43780j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.k = new C3807d0();
        } else {
            this.k = new C3805c0();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i5 : iArr) {
                if (i5 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i5)) < 0) {
                    arrayList.add(Integer.valueOf(i5));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i10 = 0; i10 < size; i10++) {
                    iArr2[i10] = ((Integer) arrayList.get(i10)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) throws SecurityException {
        try {
            ConcurrentHashMap concurrentHashMap = f43770m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e7) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e7);
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, new Object[0]);
        } catch (Exception e7) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e7);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f43772b) {
                if (this.f43779i.getMeasuredHeight() <= 0 || this.f43779i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.k.b(this.f43779i) ? 1048576 : (this.f43779i.getMeasuredWidth() - this.f43779i.getTotalPaddingLeft()) - this.f43779i.getTotalPaddingRight();
                int height = (this.f43779i.getHeight() - this.f43779i.getCompoundPaddingBottom()) - this.f43779i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f43769l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f43779i.getTextSize()) {
                            g(fC, 0);
                        }
                    } finally {
                    }
                }
            }
            this.f43772b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f43776f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i5 = length - 1;
        int i10 = 0;
        int i11 = 1;
        while (i11 <= i5) {
            int i12 = (i11 + i5) / 2;
            int i13 = this.f43776f[i12];
            TextView textView = this.f43779i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int iB = Z.b(textView);
            TextPaint textPaint = this.f43778h;
            if (textPaint == null) {
                this.f43778h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f43778h.set(textView.getPaint());
            this.f43778h.setTextSize(i13);
            StaticLayout staticLayoutA = AbstractC3803b0.a(charSequence, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), iB, this.f43779i, this.f43778h, this.k);
            if ((iB == -1 || (staticLayoutA.getLineCount() <= iB && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == charSequence.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i14 = i12 + 1;
                i10 = i11;
                i11 = i14;
            } else {
                i10 = i12 - 1;
                i5 = i10;
            }
        }
        return this.f43776f[i10];
    }

    public final boolean f() {
        return j() && this.f43771a != 0;
    }

    public final void g(float f10, int i5) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Context context = this.f43780j;
        float fApplyDimension = TypedValue.applyDimension(i5, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f43779i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zA = AbstractC3801a0.a(textView);
            if (textView.getLayout() != null) {
                this.f43772b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, new Object[0]);
                    }
                } catch (Exception e7) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e7);
                }
                if (zA) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f43771a == 1) {
            if (!this.f43777g || this.f43776f.length == 0) {
                int iFloor = ((int) Math.floor((this.f43775e - this.f43774d) / this.f43773c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i5 = 0; i5 < iFloor; i5++) {
                    iArr[i5] = Math.round((i5 * this.f43773c) + this.f43774d);
                }
                this.f43776f = b(iArr);
            }
            this.f43772b = true;
        } else {
            this.f43772b = false;
        }
        return this.f43772b;
    }

    public final boolean i() {
        boolean z2 = this.f43776f.length > 0;
        this.f43777g = z2;
        if (z2) {
            this.f43771a = 1;
            this.f43774d = r0[0];
            this.f43775e = r0[r1 - 1];
            this.f43773c = -1.0f;
        }
        return z2;
    }

    public final boolean j() {
        return !(this.f43779i instanceof r);
    }

    public final void k(float f10, float f11, float f12) {
        if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f43771a = 1;
        this.f43774d = f10;
        this.f43775e = f11;
        this.f43773c = f12;
        this.f43777g = false;
    }
}
