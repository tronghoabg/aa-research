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
public final class zzga implements zzfe {

    @NotNull
    public static final zzga zza = new zzga();

    private zzga() {
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
        zzekVar.zzc().zze(i5, zzb(objZza, objZza2));
    }

    @NotNull
    public final Object zzb(@NotNull Object obj, @NotNull Object obj2) throws zzby {
        boolean z2 = obj instanceof Byte;
        if (z2 && (obj2 instanceof Byte)) {
            return Byte.valueOf((byte) (((Number) obj).byteValue() ^ ((Number) obj2).byteValue()));
        }
        boolean z10 = obj instanceof Short;
        if (z10 && (obj2 instanceof Short)) {
            return Short.valueOf((short) (((Number) obj).shortValue() ^ ((Number) obj2).shortValue()));
        }
        boolean z11 = obj instanceof Integer;
        if (z11 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() ^ ((Number) obj2).intValue());
        }
        boolean z12 = obj instanceof Long;
        if (z12 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj2).longValue() ^ ((Number) obj).longValue());
        }
        int i5 = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(a.f1670a);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i5 < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i5] ^ ((Number) obj2).byteValue())));
                    i5++;
                }
                return o.P0(arrayList);
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i5 < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i5] ^ ((Number) obj2).intValue()));
                    i5++;
                }
                return o.R0(arrayList2);
            }
        }
        if (z2 && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b5 : bArr) {
                arrayList3.add(Byte.valueOf((byte) (b5 ^ ((Number) obj).byteValue())));
            }
            return arrayList3.toArray(new Byte[0]);
        }
        if (z10 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s10 : sArr) {
                arrayList4.add(Short.valueOf((short) (s10 ^ ((Number) obj).shortValue())));
            }
            return arrayList4.toArray(new Short[0]);
        }
        if (z11 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i10 : iArr) {
                arrayList5.add(Integer.valueOf(i10 ^ ((Number) obj).intValue()));
            }
            return arrayList5.toArray(new Integer[0]);
        }
        if (z12 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j8 : jArr) {
                arrayList6.add(Long.valueOf(j8 ^ ((Number) obj).longValue()));
            }
            return arrayList6.toArray(new Long[0]);
        }
        boolean z13 = obj instanceof byte[];
        if (z13 && (obj2 instanceof Byte)) {
            byte[] bArr2 = (byte[]) obj;
            ArrayList arrayList7 = new ArrayList(bArr2.length);
            for (byte b10 : bArr2) {
                arrayList7.add(Byte.valueOf((byte) (b10 ^ ((Number) obj2).byteValue())));
            }
            return arrayList7.toArray(new Byte[0]);
        }
        boolean z14 = obj instanceof short[];
        if (z14 && (obj2 instanceof Short)) {
            short[] sArr2 = (short[]) obj;
            ArrayList arrayList8 = new ArrayList(sArr2.length);
            for (short s11 : sArr2) {
                arrayList8.add(Short.valueOf((short) (s11 ^ ((Number) obj2).shortValue())));
            }
            return arrayList8.toArray(new Short[0]);
        }
        boolean z15 = obj instanceof int[];
        if (z15 && (obj2 instanceof Integer)) {
            int[] iArr2 = (int[]) obj;
            ArrayList arrayList9 = new ArrayList(iArr2.length);
            for (int i11 : iArr2) {
                arrayList9.add(Integer.valueOf(i11 ^ ((Number) obj2).intValue()));
            }
            return arrayList9.toArray(new Integer[0]);
        }
        boolean z16 = obj instanceof long[];
        if (z16 && (obj2 instanceof Long)) {
            long[] jArr2 = (long[]) obj;
            ArrayList arrayList10 = new ArrayList(jArr2.length);
            for (long j10 : jArr2) {
                arrayList10.add(Long.valueOf(j10 ^ ((Number) obj2).longValue()));
            }
            return arrayList10.toArray(new Long[0]);
        }
        if (z13 && (obj2 instanceof byte[])) {
            byte[] bArr3 = (byte[]) obj;
            int length3 = bArr3.length;
            byte[] bArr4 = (byte[]) obj2;
            zzfd.zza(this, length3, bArr4.length);
            g gVarU0 = b.u0(0, length3);
            ArrayList arrayList11 = new ArrayList(p.a0(gVarU0, 10));
            Iterator it = gVarU0.iterator();
            while (((f) it).f48505c) {
                int iA = ((f) it).a();
                arrayList11.add(Byte.valueOf((byte) (bArr4[iA] ^ bArr3[iA])));
            }
            return arrayList11.toArray(new Byte[0]);
        }
        if (z14 && (obj2 instanceof short[])) {
            short[] sArr3 = (short[]) obj;
            int length4 = sArr3.length;
            short[] sArr4 = (short[]) obj2;
            zzfd.zza(this, length4, sArr4.length);
            g gVarU02 = b.u0(0, length4);
            ArrayList arrayList12 = new ArrayList(p.a0(gVarU02, 10));
            Iterator it2 = gVarU02.iterator();
            while (((f) it2).f48505c) {
                int iA2 = ((f) it2).a();
                arrayList12.add(Short.valueOf((short) (sArr4[iA2] ^ sArr3[iA2])));
            }
            return arrayList12.toArray(new Short[0]);
        }
        if (z15 && (obj2 instanceof int[])) {
            int[] iArr3 = (int[]) obj;
            int length5 = iArr3.length;
            int[] iArr4 = (int[]) obj2;
            zzfd.zza(this, length5, iArr4.length);
            g gVarU03 = b.u0(0, length5);
            ArrayList arrayList13 = new ArrayList(p.a0(gVarU03, 10));
            Iterator it3 = gVarU03.iterator();
            while (((f) it3).f48505c) {
                int iA3 = ((f) it3).a();
                arrayList13.add(Integer.valueOf(iArr4[iA3] ^ iArr3[iA3]));
            }
            return arrayList13.toArray(new Integer[0]);
        }
        if (!z16 || !(obj2 instanceof long[])) {
            throw new zzby(4, 5, null);
        }
        long[] jArr3 = (long[]) obj;
        int length6 = jArr3.length;
        long[] jArr4 = (long[]) obj2;
        zzfd.zza(this, length6, jArr4.length);
        g gVarU04 = b.u0(0, length6);
        ArrayList arrayList14 = new ArrayList(p.a0(gVarU04, 10));
        Iterator it4 = gVarU04.iterator();
        while (((f) it4).f48505c) {
            int iA4 = ((f) it4).a();
            arrayList14.add(Long.valueOf(jArr3[iA4] ^ jArr4[iA4]));
        }
        return arrayList14.toArray(new Long[0]);
    }
}
