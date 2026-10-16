package com.google.android.recaptcha.internal;

import Bf.a;
import ff.m;
import ff.o;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zzew implements zzfe {

    @NotNull
    public static final zzew zza = new zzew();

    private zzew() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i5, @NotNull zzek zzekVar, @NotNull zzrr... zzrrVarArr) throws zzby {
        String strW0;
        String str;
        if (zzrrVarArr.length != 1) {
            throw new zzby(4, 3, null);
        }
        int i10 = 0;
        Object objZza = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (objZza instanceof Object)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzby(4, 5, null);
        }
        if (objZza instanceof int[]) {
            int[] iArr = (int[]) objZza;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((CharSequence) "[");
            int length = iArr.length;
            int i11 = 0;
            while (i10 < length) {
                int i12 = iArr[i10];
                i11++;
                if (i11 > 1) {
                    sb2.append((CharSequence) ",");
                }
                sb2.append((CharSequence) String.valueOf(i12));
                i10++;
            }
            sb2.append((CharSequence) "]");
            strW0 = sb2.toString();
        } else {
            if (objZza instanceof byte[]) {
                str = new String((byte[]) objZza, a.f1670a);
            } else if (objZza instanceof long[]) {
                long[] jArr = (long[]) objZza;
                StringBuilder sb3 = new StringBuilder();
                sb3.append((CharSequence) "[");
                int length2 = jArr.length;
                int i13 = 0;
                while (i10 < length2) {
                    long j8 = jArr[i10];
                    i13++;
                    if (i13 > 1) {
                        sb3.append((CharSequence) ",");
                    }
                    sb3.append((CharSequence) String.valueOf(j8));
                    i10++;
                }
                sb3.append((CharSequence) "]");
                strW0 = sb3.toString();
            } else if (objZza instanceof short[]) {
                short[] sArr = (short[]) objZza;
                StringBuilder sb4 = new StringBuilder();
                sb4.append((CharSequence) "[");
                int length3 = sArr.length;
                int i14 = 0;
                while (i10 < length3) {
                    short s10 = sArr[i10];
                    i14++;
                    if (i14 > 1) {
                        sb4.append((CharSequence) ",");
                    }
                    sb4.append((CharSequence) String.valueOf((int) s10));
                    i10++;
                }
                sb4.append((CharSequence) "]");
                strW0 = sb4.toString();
            } else if (objZza instanceof float[]) {
                float[] fArr = (float[]) objZza;
                StringBuilder sb5 = new StringBuilder();
                sb5.append((CharSequence) "[");
                int length4 = fArr.length;
                int i15 = 0;
                while (i10 < length4) {
                    float f10 = fArr[i10];
                    i15++;
                    if (i15 > 1) {
                        sb5.append((CharSequence) ",");
                    }
                    sb5.append((CharSequence) String.valueOf(f10));
                    i10++;
                }
                sb5.append((CharSequence) "]");
                strW0 = sb5.toString();
            } else if (objZza instanceof double[]) {
                double[] dArr = (double[]) objZza;
                StringBuilder sb6 = new StringBuilder();
                sb6.append((CharSequence) "[");
                int length5 = dArr.length;
                int i16 = 0;
                while (i10 < length5) {
                    double d3 = dArr[i10];
                    i16++;
                    if (i16 > 1) {
                        sb6.append((CharSequence) ",");
                    }
                    sb6.append((CharSequence) String.valueOf(d3));
                    i10++;
                }
                sb6.append((CharSequence) "]");
                strW0 = sb6.toString();
            } else if (objZza instanceof char[]) {
                str = new String((char[]) objZza);
            } else if (objZza instanceof Object[]) {
                strW0 = m.A0((Object[]) objZza, ",", "[", "]", null, 56);
            } else {
                if (!(objZza instanceof Collection)) {
                    throw new zzby(4, 5, null);
                }
                strW0 = o.w0((Iterable) objZza, ",", "[", "]", null, 56);
            }
            strW0 = str;
        }
        zzekVar.zzc().zze(i5, strW0);
    }
}
