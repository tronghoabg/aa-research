package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class dlz {
    public static int A(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (u(xmlPullParser, str)) {
            return typedArray.getResourceId(i, 0);
        }
        return 0;
    }

    public static final int B(TypedArray typedArray, int i) {
        typedArray.getClass();
        C(typedArray, i);
        return typedArray.getInt(i, 0);
    }

    public static final void C(TypedArray typedArray, int i) {
        if (!typedArray.hasValue(i)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static final String D() {
        return Build.VERSION.SDK_INT >= 34 ? "Android Auto" : "AA-GAL";
    }

    public static String E(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "false");
        } catch (Exception unused) {
            return "false";
        }
    }

    public static final float F(int i, int i2) {
        return i * (i2 / 160.0f);
    }

    public static final float G(int i, int i2) {
        return (i * 160) / i2;
    }

    public static void H(jew jewVar) {
        jewVar.aj();
        jewVar.al();
    }

    public static int I(Integer num) {
        return ((Integer) new ntn(num).i(0)).intValue();
    }

    public static long J(Long l) {
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean K(defpackage.xnz r2, boolean r3) {
        /*
            r0 = 1
            r1 = 0
            if (r3 == 0) goto Lc
            int r2 = r2.b
            r2 = r2 & 32
            if (r2 == 0) goto Lb
            return r0
        Lb:
            return r1
        Lc:
            xko r3 = r2.e
            if (r3 != 0) goto L12
            xko r3 = defpackage.xko.a
        L12:
            int r3 = r3.b
            r3 = r3 & 2
            if (r3 == 0) goto L26
            xko r3 = r2.e
            if (r3 != 0) goto L1e
            xko r3 = defpackage.xko.a
        L1e:
            aboh r3 = r3.f
            int r3 = r3.size()
            if (r3 == 0) goto L2c
        L26:
            int r2 = r2.b
            r2 = r2 & 32
            if (r2 == 0) goto L2d
        L2c:
            return r0
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlz.K(xnz, boolean):boolean");
    }

    public static /* synthetic */ String L(int i) {
        return i != 1 ? i != 2 ? "null" : "CAR_SERVICE_PROXY" : "CAR_SERVICE_DEFAULT";
    }

    public static final boolean M() {
        int iAs;
        return acpf.k() && (iAs = a.as(acpf.d().c)) != 0 && iAs == 5;
    }

    public static final Void a(String str) {
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final void b(String str) {
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public static /* synthetic */ String c(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, afec afecVar, int i) throws IOException {
        StringBuilder sb = new StringBuilder();
        if ((i & 2) != 0) {
            charSequence2 = "";
        }
        sb.append(charSequence2);
        int size = list.size();
        char c = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            char c2 = (i & 8) != 0 ? (char) 65535 : (char) 0;
            afec afecVar2 = null;
            if (i2 >= size) {
                c = c2;
                break;
            }
            Object obj = list.get(i2);
            i3++;
            if (i3 > 1) {
                sb.append(1 != (i & 1) ? charSequence : ", ");
            }
            if (c2 >= 0 && i3 > 0) {
                break;
            }
            if ((i & 32) == 0) {
                afecVar2 = afecVar;
            }
            a.k(sb, obj, afecVar2);
            i2++;
        }
        if (c >= 0 && i3 > 0) {
            sb.append((CharSequence) ((i & 16) != 0 ? "..." : null));
        }
        if ((i & 4) != 0) {
            charSequence3 = "";
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public static final float d(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f) & 8589934591L) / 3)) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final float e(float f, float f2, float f3, float f4, float f5) {
        return f + ((f2 - f) * Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(1.0f, f3 == f4 ? 0.0f : (f5 - f3) / (f4 - f3))));
    }

    public static final float f(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float fE;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            fE = fArr2[iBinarySearch];
        } else {
            int i = -(iBinarySearch + 1);
            int i2 = i - 1;
            int length = fArr.length - 1;
            float f5 = BitmapDescriptorFactory.HUE_RED;
            if (i2 >= length) {
                float f6 = fArr[length];
                return f6 == BitmapDescriptorFactory.HUE_RED ? BitmapDescriptorFactory.HUE_RED : f * (fArr2[length] / f6);
            }
            if (i2 == -1) {
                f2 = fArr[0];
                f3 = fArr2[0];
                f4 = 0.0f;
            } else {
                float f7 = fArr[i2];
                f2 = fArr[i];
                f5 = fArr2[i2];
                f3 = fArr2[i];
                f4 = f7;
            }
            fE = e(f5, f3, f4, f2, fAbs);
        }
        return fSignum * fE;
    }

    public static Object g(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return bundle.getParcelable(str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static ArrayList h(Bundle bundle, String str, Class cls) {
        return Build.VERSION.SDK_INT >= 34 ? bundle.getParcelableArrayList(str, cls) : bundle.getParcelableArrayList(str);
    }

    public static float i(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public static int j(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static float k(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !u(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int l(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static int m(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !u(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static int n(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    public static TypedArray o(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static CharSequence p(TypedArray typedArray, int i, int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    public static String q(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (u(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    public static String r(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    public static boolean s(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    public static boolean t(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !u(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    public static boolean u(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static CharSequence[] v(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    public static int w(TypedArray typedArray, int i, int i2) {
        return typedArray.getInt(i, typedArray.getInt(i2, Alert.DURATION_SHOW_INDEFINITELY));
    }

    public static int x(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (u(xmlPullParser, str)) {
            return typedArray.getColor(i, 0);
        }
        return 0;
    }

    public static ColorStateList y(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!u(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        if (typedValue.type == 2) {
            typedValue.toString();
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: ".concat(typedValue.toString()));
        }
        if (typedValue.type >= 28 && typedValue.type <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        int i = duv.a;
        try {
            return duv.a(resources, resources.getXml(resourceId), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ee, code lost:
    
        if (r0 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f2, code lost:
    
        if (r17 == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f4, code lost:
    
        r0 = new defpackage.rz(r8, r3, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fa, code lost:
    
        r0 = new defpackage.rz(r8, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0200, code lost:
    
        if (r12 == 1) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0203, code lost:
    
        if (r12 == 2) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0205, code lost:
    
        r12 = new android.graphics.LinearGradient(r22, r23, r15, r16, (int[]) r0.b, (float[]) r0.a, defpackage.dtb.b(r21));
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x021f, code lost:
    
        r12 = new android.graphics.SweepGradient(r10, r5, (int[]) r0.b, (float[]) r0.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0230, code lost:
    
        if (r20 <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0232, code lost:
    
        r19 = r5;
        r18 = r10;
        r12 = new android.graphics.RadialGradient(r18, r19, r20, (int[]) r0.b, (float[]) r0.a, defpackage.dtb.b(r21));
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x024d, code lost:
    
        r1 = new defpackage.duw(r12, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x025c, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e5, code lost:
    
        if (r9.size() <= 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e7, code lost:
    
        r0 = new defpackage.rz((java.util.List) r9, (java.util.List) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ed, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.duw z(android.content.res.TypedArray r26, org.xmlpull.v1.XmlPullParser r27, android.content.res.Resources.Theme r28, java.lang.String r29, int r30) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlz.z(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme, java.lang.String, int):duw");
    }
}
