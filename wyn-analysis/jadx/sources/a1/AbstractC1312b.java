package a1;

import E4.n;
import E5.RunnableC0443c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import b1.AbstractC1492a;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.tika.metadata.Font;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: a1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1312b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f17105a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b, reason: collision with root package name */
    public static final float[][] f17106b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f17107c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[][] f17108d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: e, reason: collision with root package name */
    public static final Object f17109e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static Method f17110f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f17111g;

    public static int b(Context context, int i5, int i10) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i5, typedValue, true);
        return typedValue.resourceId != 0 ? i5 : i10;
    }

    public static ColorStateList c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i5 = typedValue.type;
        if (i5 == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        }
        if (i5 >= 28 && i5 <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        ThreadLocal threadLocal = AbstractC1313c.f17112a;
        try {
            return AbstractC1313c.a(resources, resources.getXml(resourceId), theme);
        } catch (Exception e7) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e7);
            return null;
        }
    }

    public static n d(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i5) {
        n nVarF;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i5, typedValue);
            int i10 = typedValue.type;
            if (i10 >= 28 && i10 <= 31) {
                return new n((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                nVarF = n.f(typedArray.getResources(), typedArray.getResourceId(i5, 0), theme);
            } catch (Exception e7) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e7);
                nVarF = null;
            }
            if (nVarF != null) {
                return nVarF;
            }
        }
        return new n((Shader) null, (ColorStateList) null, 0);
    }

    public static String e(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i5) {
        if (f(xmlResourceParser, str)) {
            return typedArray.getString(i5);
        }
        return null;
    }

    public static boolean f(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int g(float f10) {
        if (f10 < 1.0f) {
            return -16777216;
        }
        if (f10 > 99.0f) {
            return -1;
        }
        float f11 = (f10 + 16.0f) / 116.0f;
        float f12 = f10 > 8.0f ? f11 * f11 * f11 : f10 / 903.2963f;
        float f13 = f11 * f11 * f11;
        boolean z2 = f13 > 0.008856452f;
        float f14 = z2 ? f13 : ((f11 * 116.0f) - 16.0f) / 903.2963f;
        if (!z2) {
            f13 = ((f11 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f17107c;
        return AbstractC1492a.a(f14 * fArr[0], f12 * fArr[1], f13 * fArr[2]);
    }

    public static float h(int i5) {
        float f10 = i5 / 255.0f;
        return (f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static TypedArray i(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static InterfaceC1314d l(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            o(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), W0.a.f14936b);
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                o(xmlResourceParser);
            }
            List listM = m(resources, resourceId);
            return new C1317g(new h1.d(string, string2, string3, listM), string4 != null ? new h1.d(string, string2, string4, listM) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals(Font.PREFIX_FONT_META)) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), W0.a.f14937c);
                    int i5 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                    boolean z2 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                    int i10 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                    String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                    int i11 = typedArrayObtainAttributes2.getInt(i10, 0);
                    int i12 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                    int resourceId2 = typedArrayObtainAttributes2.getResourceId(i12, 0);
                    String string7 = typedArrayObtainAttributes2.getString(i12);
                    typedArrayObtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        o(xmlResourceParser);
                    }
                    arrayList.add(new C1316f(z2, i5, string7, i11, string6, resourceId2));
                } else {
                    o(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C1315e((C1316f[]) arrayList.toArray(new C1316f[0]));
    }

    public static List m(Resources resources, int i5) throws Resources.NotFoundException {
        if (i5 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i5);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i10 = 0; i10 < typedArrayObtainTypedArray.length(); i10++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i10, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i5);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void n(android.content.res.Resources.Theme r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            a1.k.a(r6)
            return
        La:
            java.lang.Object r0 = a1.AbstractC1312b.f17109e
            monitor-enter(r0)
            boolean r1 = a1.AbstractC1312b.f17111g     // Catch: java.lang.Throwable -> L23
            r2 = 0
            if (r1 != 0) goto L2f
            r1 = 1
            java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
            java.lang.String r4 = "rebase"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L23 java.lang.NoSuchMethodException -> L25
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Throwable -> L23 java.lang.NoSuchMethodException -> L25
            a1.AbstractC1312b.f17110f = r3     // Catch: java.lang.Throwable -> L23 java.lang.NoSuchMethodException -> L25
            r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L23 java.lang.NoSuchMethodException -> L25
            goto L2d
        L23:
            r6 = move-exception
            goto L48
        L25:
            r3 = move-exception
            java.lang.String r4 = "ResourcesCompat"
            java.lang.String r5 = "Failed to retrieve rebase() method"
            android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L23
        L2d:
            a1.AbstractC1312b.f17111g = r1     // Catch: java.lang.Throwable -> L23
        L2f:
            java.lang.reflect.Method r1 = a1.AbstractC1312b.f17110f     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L46
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L23 java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L3b
            r1.invoke(r6, r2)     // Catch: java.lang.Throwable -> L23 java.lang.reflect.InvocationTargetException -> L39 java.lang.IllegalAccessException -> L3b
            goto L46
        L39:
            r6 = move-exception
            goto L3c
        L3b:
            r6 = move-exception
        L3c:
            java.lang.String r1 = "ResourcesCompat"
            java.lang.String r2 = "Failed to invoke rebase() method via reflection"
            android.util.Log.i(r1, r2, r6)     // Catch: java.lang.Throwable -> L23
            r6 = 0
            a1.AbstractC1312b.f17110f = r6     // Catch: java.lang.Throwable -> L23
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.AbstractC1312b.n(android.content.res.Resources$Theme):void");
    }

    public static void o(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i5 = 1;
        while (i5 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i5++;
            } else if (next == 3) {
                i5--;
            }
        }
    }

    public static float p() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public void a(int i5) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0443c(this, i5, 3));
    }

    public abstract void j(int i5);

    public abstract void k(Typeface typeface);
}
