package com.google.android.recaptcha.internal;

import Bf.a;
import android.support.v4.media.session.b;
import ff.o;
import ff.p;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import zf.f;
import zf.g;

/* loaded from: classes4.dex */
public final class zzfo implements zzfe {

    @NotNull
    public static final zzfo zza = new zzfo();

    private zzfo() {
    }

    private final Object zzb(Object obj, Object obj2) throws zzby, ArithmeticException {
        boolean z2 = obj instanceof Byte;
        if (z2 && (obj2 instanceof Byte)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z10 = obj instanceof Short;
        if (z10 && (obj2 instanceof Short)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z11 = obj instanceof Integer;
        if (z11 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z12 = obj instanceof Long;
        if (z12 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj).longValue() % ((Number) obj2).longValue());
        }
        boolean z13 = obj instanceof Float;
        if (z13 && (obj2 instanceof Float)) {
            return Float.valueOf(((Number) obj).floatValue() % ((Number) obj2).floatValue());
        }
        boolean z14 = obj instanceof Double;
        if (z14 && (obj2 instanceof Double)) {
            return Double.valueOf(((Number) obj).doubleValue() % ((Number) obj2).doubleValue());
        }
        int i5 = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(a.f1670a);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i5 < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i5] % ((Number) obj2).intValue())));
                    i5++;
                }
                return new String(o.P0(arrayList), a.f1670a);
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i5 < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i5] % ((Number) obj2).intValue()));
                    i5++;
                }
                return o.R0(arrayList2);
            }
        }
        if (z2 && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b5 : bArr) {
                arrayList3.add(Integer.valueOf(b5 % ((Number) obj).intValue()));
            }
            return arrayList3.toArray(new Integer[0]);
        }
        if (z10 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s10 : sArr) {
                arrayList4.add(Integer.valueOf(s10 % ((Number) obj).intValue()));
            }
            return arrayList4.toArray(new Integer[0]);
        }
        if (z11 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i10 : iArr) {
                arrayList5.add(Integer.valueOf(i10 % ((Number) obj).intValue()));
            }
            return arrayList5.toArray(new Integer[0]);
        }
        if (z12 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j8 : jArr) {
                arrayList6.add(Long.valueOf(j8 % ((Number) obj).longValue()));
            }
            return arrayList6.toArray(new Long[0]);
        }
        if (z13 && (obj2 instanceof float[])) {
            float[] fArr = (float[]) obj2;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            for (float f10 : fArr) {
                arrayList7.add(Float.valueOf(f10 % ((Number) obj).floatValue()));
            }
            return arrayList7.toArray(new Float[0]);
        }
        if (z14 && (obj2 instanceof double[])) {
            double[] dArr = (double[]) obj2;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            for (double d3 : dArr) {
                arrayList8.add(Double.valueOf(d3 % ((Number) obj).doubleValue()));
            }
            return arrayList8.toArray(new Double[0]);
        }
        boolean z15 = obj instanceof byte[];
        if (z15 && (obj2 instanceof Byte)) {
            byte[] bArr2 = (byte[]) obj;
            ArrayList arrayList9 = new ArrayList(bArr2.length);
            for (byte b10 : bArr2) {
                arrayList9.add(Integer.valueOf(b10 % ((Number) obj2).intValue()));
            }
            return arrayList9.toArray(new Integer[0]);
        }
        boolean z16 = obj instanceof short[];
        if (z16 && (obj2 instanceof Short)) {
            short[] sArr2 = (short[]) obj;
            ArrayList arrayList10 = new ArrayList(sArr2.length);
            for (short s11 : sArr2) {
                arrayList10.add(Integer.valueOf(s11 % ((Number) obj2).intValue()));
            }
            return arrayList10.toArray(new Integer[0]);
        }
        boolean z17 = obj instanceof int[];
        if (z17 && (obj2 instanceof Integer)) {
            int[] iArr2 = (int[]) obj;
            int length3 = iArr2.length;
            ArrayList arrayList11 = new ArrayList(length3);
            while (i5 < length3) {
                arrayList11.add(Integer.valueOf(iArr2[i5] % ((Number) obj2).intValue()));
                i5++;
            }
            return o.R0(arrayList11);
        }
        boolean z18 = obj instanceof long[];
        if (z18 && (obj2 instanceof Long)) {
            long[] jArr2 = (long[]) obj;
            ArrayList arrayList12 = new ArrayList(jArr2.length);
            for (long j10 : jArr2) {
                arrayList12.add(Long.valueOf(j10 % ((Number) obj2).longValue()));
            }
            return arrayList12.toArray(new Long[0]);
        }
        boolean z19 = obj instanceof float[];
        if (z19 && (obj2 instanceof Float)) {
            float[] fArr2 = (float[]) obj;
            ArrayList arrayList13 = new ArrayList(fArr2.length);
            for (float f11 : fArr2) {
                arrayList13.add(Float.valueOf(f11 % ((Number) obj2).floatValue()));
            }
            return arrayList13.toArray(new Float[0]);
        }
        boolean z20 = obj instanceof double[];
        if (z20 && (obj2 instanceof Double)) {
            double[] dArr2 = (double[]) obj;
            ArrayList arrayList14 = new ArrayList(dArr2.length);
            for (double d5 : dArr2) {
                arrayList14.add(Double.valueOf(d5 % ((Number) obj2).doubleValue()));
            }
            return arrayList14.toArray(new Double[0]);
        }
        if (z15 && (obj2 instanceof byte[])) {
            byte[] bArr3 = (byte[]) obj;
            int length4 = bArr3.length;
            byte[] bArr4 = (byte[]) obj2;
            zzfd.zza(this, length4, bArr4.length);
            g gVarU0 = b.u0(0, length4);
            ArrayList arrayList15 = new ArrayList(p.a0(gVarU0, 10));
            Iterator it = gVarU0.iterator();
            while (((f) it).f48505c) {
                int iA = ((f) it).a();
                arrayList15.add(Integer.valueOf(bArr3[iA] % bArr4[iA]));
            }
            return arrayList15.toArray(new Integer[0]);
        }
        if (z16 && (obj2 instanceof short[])) {
            short[] sArr3 = (short[]) obj;
            int length5 = sArr3.length;
            short[] sArr4 = (short[]) obj2;
            zzfd.zza(this, length5, sArr4.length);
            g gVarU02 = b.u0(0, length5);
            ArrayList arrayList16 = new ArrayList(p.a0(gVarU02, 10));
            Iterator it2 = gVarU02.iterator();
            while (((f) it2).f48505c) {
                int iA2 = ((f) it2).a();
                arrayList16.add(Integer.valueOf(sArr3[iA2] % sArr4[iA2]));
            }
            return arrayList16.toArray(new Integer[0]);
        }
        if (z17 && (obj2 instanceof int[])) {
            int[] iArr3 = (int[]) obj;
            int length6 = iArr3.length;
            int[] iArr4 = (int[]) obj2;
            zzfd.zza(this, length6, iArr4.length);
            g gVarU03 = b.u0(0, length6);
            ArrayList arrayList17 = new ArrayList(p.a0(gVarU03, 10));
            Iterator it3 = gVarU03.iterator();
            while (((f) it3).f48505c) {
                int iA3 = ((f) it3).a();
                arrayList17.add(Integer.valueOf(iArr3[iA3] % iArr4[iA3]));
            }
            return arrayList17.toArray(new Integer[0]);
        }
        if (z18 && (obj2 instanceof long[])) {
            long[] jArr3 = (long[]) obj;
            int length7 = jArr3.length;
            long[] jArr4 = (long[]) obj2;
            zzfd.zza(this, length7, jArr4.length);
            g gVarU04 = b.u0(0, length7);
            ArrayList arrayList18 = new ArrayList(p.a0(gVarU04, 10));
            Iterator it4 = gVarU04.iterator();
            while (((f) it4).f48505c) {
                int iA4 = ((f) it4).a();
                arrayList18.add(Long.valueOf(jArr3[iA4] % jArr4[iA4]));
            }
            return arrayList18.toArray(new Long[0]);
        }
        if (z19 && (obj2 instanceof float[])) {
            float[] fArr3 = (float[]) obj;
            int length8 = fArr3.length;
            float[] fArr4 = (float[]) obj2;
            zzfd.zza(this, length8, fArr4.length);
            g gVarU05 = b.u0(0, length8);
            ArrayList arrayList19 = new ArrayList(p.a0(gVarU05, 10));
            Iterator it5 = gVarU05.iterator();
            while (((f) it5).f48505c) {
                int iA5 = ((f) it5).a();
                arrayList19.add(Float.valueOf(fArr3[iA5] % fArr4[iA5]));
            }
            return arrayList19.toArray(new Float[0]);
        }
        if (!z20 || !(obj2 instanceof double[])) {
            throw new zzby(4, 5, null);
        }
        double[] dArr3 = (double[]) obj;
        int length9 = dArr3.length;
        double[] dArr4 = (double[]) obj2;
        zzfd.zza(this, length9, dArr4.length);
        g gVarU06 = b.u0(0, length9);
        ArrayList arrayList20 = new ArrayList(p.a0(gVarU06, 10));
        Iterator it6 = gVarU06.iterator();
        while (((f) it6).f48505c) {
            int iA6 = ((f) it6).a();
            arrayList20.add(Double.valueOf(dArr3[iA6] % dArr4[iA6]));
        }
        return arrayList20.toArray(new Double[0]);
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i5, @NotNull zzek zzekVar, @NotNull zzrr... zzrrVarArr) throws zzby {
        if (zzrrVarArr.length != 2) {
            throw new zzby(4, 3, null);
        }
        Object objZza = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (objZza instanceof Object)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzby(4, 5, null);
        }
        Object objZza2 = zzekVar.zzc().zza(zzrrVarArr[1]);
        if (true != (objZza2 instanceof Object)) {
            objZza2 = null;
        }
        if (objZza2 == null) {
            throw new zzby(4, 5, null);
        }
        try {
            zzekVar.zzc().zze(i5, zzb(objZza, objZza2));
        } catch (ArithmeticException e7) {
            throw new zzby(4, 6, e7);
        }
    }
}
