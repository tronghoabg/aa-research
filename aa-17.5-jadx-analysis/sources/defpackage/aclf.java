package defpackage;

import android.graphics.Matrix;
import android.util.Log;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public final class aclf {
    public static volatile admf a;
    public static volatile admf b;
    public static volatile admf c;
    public static volatile admf d;
    public static volatile admf e;

    private aclf() {
    }

    public static acle a(adix adixVar) {
        return (acle) acle.b(new zkr(3), adixVar);
    }

    public static final void b(Object obj, acku ackuVar, LinkedHashMap linkedHashMap) {
        linkedHashMap.put(obj, ackuVar);
    }

    public static /* synthetic */ Object c(Object obj) throws abon {
        byte[] bArr = (byte[]) obj;
        abnv abnvVarD = abnv.D(abru.a, bArr, 0, bArr.length, abnj.a);
        abnv.U(abnvVarD);
        return (abru) abnvVarD;
    }

    public static /* synthetic */ Object d(Object obj) throws abon {
        byte[] bArr = (byte[]) obj;
        abnv abnvVarD = abnv.D(abrt.a, bArr, 0, bArr.length, abnj.a);
        abnv.U(abnvVarD);
        return (abrt) abnvVarD;
    }

    public static Object e(Object obj, Class cls) {
        boolean z;
        if (!(obj instanceof ackl)) {
            if (obj instanceof ackm) {
                return e(((ackm) obj).a(), cls);
            }
            throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), ackl.class, ackm.class));
        }
        if (obj instanceof ackn) {
            Annotation[] annotations = cls.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                if (annotations[i].annotationType().getCanonicalName().contentEquals("dagger.hilt.android.EarlyEntryPoint")) {
                    z = true;
                    break;
                }
                i++;
            }
            Object[] objArr = {cls.getCanonicalName()};
            if (z) {
                throw new IllegalStateException(String.format("Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", objArr));
            }
        }
        return cls.cast(obj);
    }

    public static Matrix f(String str) {
        float fFloatValue;
        int i;
        Matrix matrix = new Matrix();
        String strReplaceFirst = str;
        while (true) {
            boolean zStartsWith = strReplaceFirst.startsWith("matrix(");
            float fFloatValue2 = BitmapDescriptorFactory.HUE_RED;
            if (zStartsWith) {
                ArrayList arrayList = (ArrayList) l(strReplaceFirst.substring(7)).a;
                if (arrayList.size() == 6) {
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{((Float) arrayList.get(0)).floatValue(), ((Float) arrayList.get(2)).floatValue(), ((Float) arrayList.get(4)).floatValue(), ((Float) arrayList.get(1)).floatValue(), ((Float) arrayList.get(3)).floatValue(), ((Float) arrayList.get(5)).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f});
                    matrix.preConcat(matrix2);
                }
            } else if (strReplaceFirst.startsWith("translate(")) {
                ArrayList arrayList2 = (ArrayList) l(strReplaceFirst.substring(10)).a;
                if (arrayList2.size() > 0) {
                    float fFloatValue3 = ((Float) arrayList2.get(0)).floatValue();
                    if (arrayList2.size() > 1) {
                        fFloatValue2 = ((Float) arrayList2.get(1)).floatValue();
                    }
                    matrix.preTranslate(fFloatValue3, fFloatValue2);
                }
            } else if (strReplaceFirst.startsWith("scale(")) {
                ArrayList arrayList3 = (ArrayList) l(strReplaceFirst.substring(6)).a;
                if (arrayList3.size() > 0) {
                    float fFloatValue4 = ((Float) arrayList3.get(0)).floatValue();
                    matrix.preScale(fFloatValue4, arrayList3.size() > 1 ? ((Float) arrayList3.get(1)).floatValue() : fFloatValue4);
                }
            } else if (strReplaceFirst.startsWith("skewX(")) {
                if (((ArrayList) l(strReplaceFirst.substring(6)).a).size() > 0) {
                    matrix.preSkew((float) Math.tan(((Float) r2.get(0)).floatValue()), BitmapDescriptorFactory.HUE_RED);
                }
            } else if (strReplaceFirst.startsWith("skewY(")) {
                if (((ArrayList) l(strReplaceFirst.substring(6)).a).size() > 0) {
                    matrix.preSkew(BitmapDescriptorFactory.HUE_RED, (float) Math.tan(((Float) r2.get(0)).floatValue()));
                }
            } else if (strReplaceFirst.startsWith("rotate(")) {
                ArrayList arrayList4 = (ArrayList) l(strReplaceFirst.substring(7)).a;
                if (arrayList4.size() > 0) {
                    float fFloatValue5 = ((Float) arrayList4.get(0)).floatValue();
                    if (arrayList4.size() > 2) {
                        fFloatValue2 = ((Float) arrayList4.get(1)).floatValue();
                        fFloatValue = ((Float) arrayList4.get(2)).floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                    matrix.preTranslate(fFloatValue2, fFloatValue);
                    matrix.preRotate(fFloatValue5);
                    matrix.preTranslate(-fFloatValue2, -fFloatValue);
                }
            } else {
                Log.w("SVG", a.bq(strReplaceFirst, "Invalid transform (", ")"));
            }
            int iIndexOf = strReplaceFirst.indexOf(")");
            if (iIndexOf <= 0 || strReplaceFirst.length() <= (i = iIndexOf + 1)) {
                break;
            }
            strReplaceFirst = strReplaceFirst.substring(i).replaceFirst("[\\s,]*", "");
        }
        return matrix;
    }

    public static String g(String str) {
        return str.replaceAll("\"", "&quot;").replaceAll("'", "&apos").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("&", "&amp;");
    }

    public static String h(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                return attributes.getValue(i);
            }
        }
        return null;
    }

    public static int i(acju acjuVar, boolean z) {
        int i = z ? acjuVar.c : acjuVar.b;
        int i2 = z ? acjuVar.b : acjuVar.c;
        byte[][] bArr = acjuVar.a;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            byte b2 = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                byte b3 = z ? bArr[i4][i6] : bArr[i6][i4];
                if (b3 == b2) {
                    i5++;
                } else {
                    if (i5 >= 5) {
                        i3 += i5 - 2;
                    }
                    i5 = 1;
                    b2 = b3;
                }
            }
            if (i5 >= 5) {
                i3 += i5 - 2;
            }
        }
        return i3;
    }

    public static boolean j(byte[] bArr, int i, int i2) {
        if (i < 0 || bArr.length < i2) {
            return false;
        }
        while (i < i2) {
            if (bArr[i] == 1) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean k(byte[][] bArr, int i, int i2, int i3) {
        if (i2 < 0 || bArr.length < i3) {
            return false;
        }
        while (i2 < i3) {
            if (bArr[i2][i] == 1) {
                return false;
            }
            i2++;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0012 A[PHI: r5
  0x0012: PHI (r5v10 int) = (r5v1 int), (r5v1 int), (r5v2 int) binds: [B:4:0x0010, B:7:0x0018, B:24:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.erb l(java.lang.String r10) {
        /*
            int r0 = r10.length()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 1
            r3 = 0
            r4 = r2
            r5 = r3
            r6 = r5
        Le:
            if (r4 >= r0) goto L6a
            if (r6 == 0) goto L14
        L12:
            r6 = r3
            goto L67
        L14:
            char r6 = r10.charAt(r4)
            switch(r6) {
                case 9: goto L3b;
                case 10: goto L3b;
                case 32: goto L3b;
                case 41: goto L1c;
                case 44: goto L3b;
                case 45: goto L3b;
                case 65: goto L1c;
                case 67: goto L1c;
                case 72: goto L1c;
                case 76: goto L1c;
                case 77: goto L1c;
                case 81: goto L1c;
                case 83: goto L1c;
                case 84: goto L1c;
                case 86: goto L1c;
                case 90: goto L1c;
                case 97: goto L1c;
                case 99: goto L1c;
                case 104: goto L1c;
                case 108: goto L1c;
                case 109: goto L1c;
                case 113: goto L1c;
                case 115: goto L1c;
                case 116: goto L1c;
                case 118: goto L1c;
                case 122: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L12
        L1c:
            java.lang.String r10 = r10.substring(r5, r4)
            java.lang.String r0 = r10.trim()
            int r0 = r0.length()
            if (r0 <= 0) goto L35
            float r10 = java.lang.Float.parseFloat(r10)
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            r1.add(r10)
        L35:
            erb r10 = new erb
            r10.<init>(r1)
            return r10
        L3b:
            int r7 = r4 + 1
            java.lang.String r8 = r10.substring(r5, r4)
            java.lang.String r9 = r8.trim()
            int r9 = r9.length()
            if (r9 <= 0) goto L64
            float r5 = java.lang.Float.parseFloat(r8)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r1.add(r5)
            r5 = 45
            if (r6 != r5) goto L5c
            r8 = r3
            goto L5d
        L5c:
            r8 = r2
        L5d:
            if (r6 != r5) goto L61
            r5 = r4
            goto L62
        L61:
            r5 = r7
        L62:
            r6 = r8
            goto L67
        L64:
            int r5 = r5 + 1
            goto L12
        L67:
            int r4 = r4 + 1
            goto Le
        L6a:
            java.lang.String r0 = r10.substring(r5)
            int r2 = r0.length()
            if (r2 <= 0) goto L82
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L7f
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L7f
            r1.add(r0)     // Catch: java.lang.NumberFormatException -> L7f
        L7f:
            r10.length()
        L82:
            erb r10 = new erb
            r10.<init>(r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aclf.l(java.lang.String):erb");
    }
}
