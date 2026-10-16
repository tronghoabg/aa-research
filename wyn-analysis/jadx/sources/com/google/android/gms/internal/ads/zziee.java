package com.google.android.gms.internal.ads;

import cb.AbstractC1593a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class zziee {
    private static final zziee zzd = new zziee(true);
    final zzigx zza = new zzigt();
    boolean zzb;
    boolean zzc;

    private zziee() {
    }

    public static zziee zza() {
        return zzd;
    }

    public static void zzf(zzidu zziduVar, zzihq zzihqVar, int i5, Object obj) throws IOException {
        if (zzihqVar == zzihq.zzj) {
            zziduVar.zzb(i5, 3);
            ((zzifz) obj).zzcX(zziduVar);
            zziduVar.zzb(i5, 4);
            return;
        }
        zziduVar.zzb(i5, zzihqVar.zzb());
        zzihr zzihrVar = zzihr.INT;
        switch (zzihqVar.ordinal()) {
            case 0:
                zziduVar.zzu(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zziduVar.zzs(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zziduVar.zzt(((Long) obj).longValue());
                break;
            case 3:
                zziduVar.zzt(((Long) obj).longValue());
                break;
            case 4:
                zziduVar.zzq(((Integer) obj).intValue());
                break;
            case 5:
                zziduVar.zzu(((Long) obj).longValue());
                break;
            case 6:
                zziduVar.zzs(((Integer) obj).intValue());
                break;
            case 7:
                zziduVar.zzp(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzidl)) {
                    zziduVar.zzw((String) obj);
                    break;
                } else {
                    zziduVar.zzk((zzidl) obj);
                    break;
                }
            case 9:
                ((zzifz) obj).zzcX(zziduVar);
                break;
            case 10:
                zziduVar.zzo((zzifz) obj);
                break;
            case 11:
                if (!(obj instanceof zzidl)) {
                    byte[] bArr = (byte[]) obj;
                    zziduVar.zzl(bArr, 0, bArr.length);
                    break;
                } else {
                    zziduVar.zzk((zzidl) obj);
                    break;
                }
            case 12:
                zziduVar.zzr(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zziet)) {
                    zziduVar.zzq(((Integer) obj).intValue());
                    break;
                } else {
                    zziduVar.zzq(((zziet) obj).zza());
                    break;
                }
            case 14:
                zziduVar.zzs(((Integer) obj).intValue());
                break;
            case 15:
                zziduVar.zzu(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                zziduVar.zzr((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                zziduVar.zzt((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public static int zzh(zzihq zzihqVar, int i5, Object obj) {
        int iZzF = zzidu.zzF(i5 << 3);
        if (zzihqVar == zzihq.zzj) {
            iZzF += iZzF;
        }
        return iZzF + zzi(zzihqVar, obj);
    }

    public static int zzi(zzihq zzihqVar, Object obj) throws zziho {
        int iZzc;
        int iZzF;
        zzihq zzihqVar2 = zzihq.zza;
        zzihr zzihrVar = zzihr.INT;
        switch (zzihqVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i5 = zzidu.zzb;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i10 = zzidu.zzb;
                return 4;
            case 2:
                return zzidu.zzG(((Long) obj).longValue());
            case 3:
                return zzidu.zzG(((Long) obj).longValue());
            case 4:
                return zzidu.zzG(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i11 = zzidu.zzb;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i12 = zzidu.zzb;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i13 = zzidu.zzb;
                return 1;
            case 8:
                if (!(obj instanceof zzidl)) {
                    int i14 = zzidu.zzb;
                    iZzc = zzihp.zzc((String) obj);
                    iZzF = zzidu.zzF(iZzc);
                    break;
                } else {
                    int i15 = zzidu.zzb;
                    iZzc = ((zzidl) obj).zzb();
                    iZzF = zzidu.zzF(iZzc);
                    break;
                }
            case 9:
                return ((zzifz) obj).zzbr();
            case 10:
                if (!(obj instanceof zziff)) {
                    return zzidu.zzH((zzifz) obj);
                }
                iZzc = ((zziff) obj).zzb();
                iZzF = zzidu.zzF(iZzc);
                break;
            case 11:
                if (!(obj instanceof zzidl)) {
                    int i16 = zzidu.zzb;
                    iZzc = ((byte[]) obj).length;
                    iZzF = zzidu.zzF(iZzc);
                    break;
                } else {
                    int i17 = zzidu.zzb;
                    iZzc = ((zzidl) obj).zzb();
                    iZzF = zzidu.zzF(iZzc);
                    break;
                }
            case 12:
                return zzidu.zzF(((Integer) obj).intValue());
            case 13:
                return obj instanceof zziet ? zzidu.zzG(((zziet) obj).zza()) : zzidu.zzG(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i18 = zzidu.zzb;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i19 = zzidu.zzb;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return zzidu.zzF((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return zzidu.zzG((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iZzF + iZzc;
    }

    public static int zzj(zzied zziedVar, Object obj) {
        zzihq zzihqVarZzb = zziedVar.zzb();
        int iZza = zziedVar.zza();
        if (!zziedVar.zzd()) {
            return zzh(zzihqVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i5 = 0;
        if (!zziedVar.zze()) {
            int iZzh = 0;
            while (i5 < size) {
                iZzh += zzh(zzihqVarZzb, iZza, list.get(i5));
                i5++;
            }
            return iZzh;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iZzi = 0;
        while (i5 < size) {
            iZzi += zzi(zzihqVarZzb, list.get(i5));
            i5++;
        }
        return zzidu.zzF(iZzi) + zzidu.zzF(iZza << 3) + iZzi;
    }

    private static boolean zzk(Map.Entry entry) {
        zzied zziedVar = (zzied) entry.getKey();
        if (zziedVar.zzc() != zzihr.MESSAGE) {
            return true;
        }
        if (!zziedVar.zzd()) {
            return zzl(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (!zzl(list.get(i5))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzl(Object obj) {
        if (obj instanceof zziga) {
            return ((zziga) obj).zzbi();
        }
        if (obj instanceof zziff) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(Map.Entry entry) {
        int i5;
        int iZzF;
        int iZzH;
        zzied zziedVar = (zzied) entry.getKey();
        Object value = entry.getValue();
        if (zziedVar.zzc() != zzihr.MESSAGE || zziedVar.zzd() || zziedVar.zze()) {
            return zzj(zziedVar, value);
        }
        if (value instanceof zziff) {
            int iZza = ((zzied) entry.getKey()).zza();
            int iZzF2 = zzidu.zzF(8);
            i5 = iZzF2 + iZzF2;
            iZzF = zzidu.zzF(iZza) + zzidu.zzF(16);
            int iZzF3 = zzidu.zzF(24);
            int iZzb = ((zziff) value).zzb();
            iZzH = AbstractC1593a.a(iZzb, iZzb, iZzF3);
        } else {
            int iZza2 = ((zzied) entry.getKey()).zza();
            int iZzF4 = zzidu.zzF(8);
            i5 = iZzF4 + iZzF4;
            iZzF = zzidu.zzF(iZza2) + zzidu.zzF(16);
            iZzH = zzidu.zzH((zzifz) value) + zzidu.zzF(24);
        }
        return i5 + iZzF + iZzH;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void zzn(com.google.android.gms.internal.ads.zzied r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.ads.zzihq r0 = r4.zzb()
            r5.getClass()
            com.google.android.gms.internal.ads.zzihq r1 = com.google.android.gms.internal.ads.zzihq.zza
            com.google.android.gms.internal.ads.zzihr r1 = com.google.android.gms.internal.ads.zzihr.INT
            com.google.android.gms.internal.ads.zzihr r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L41;
                case 1: goto L3e;
                case 2: goto L3b;
                case 3: goto L38;
                case 4: goto L35;
                case 5: goto L32;
                case 6: goto L29;
                case 7: goto L20;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L46
        L17:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzifz
            if (r0 != 0) goto L1f
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zziff
            if (r0 == 0) goto L46
        L1f:
            return
        L20:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L28
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zziet
            if (r0 == 0) goto L46
        L28:
            return
        L29:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzidl
            if (r0 != 0) goto L31
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L46
        L31:
            return
        L32:
            boolean r0 = r5 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r5 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r5 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r5 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r5 instanceof java.lang.Integer
        L43:
            if (r0 == 0) goto L46
            return
        L46:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r4.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.ads.zzihq r4 = r4.zzb()
            com.google.android.gms.internal.ads.zzihr r4 = r4.zza()
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r4
            r4 = 2
            r2[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zziee.zzn(com.google.android.gms.internal.ads.zzied, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zziee zzieeVar = new zziee();
        zzigx zzigxVar = this.zza;
        int iZzc = zzigxVar.zzc();
        for (int i5 = 0; i5 < iZzc; i5++) {
            Map.Entry entryZzd = zzigxVar.zzd(i5);
            zzieeVar.zzd((zzied) ((zzigu) entryZzd).zza(), entryZzd.getValue());
        }
        for (Map.Entry entry : zzigxVar.zze()) {
            zzieeVar.zzd((zzied) entry.getKey(), entry.getValue());
        }
        zzieeVar.zzc = this.zzc;
        return zzieeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zziee) {
            return this.zza.equals(((zziee) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        zzigx zzigxVar = this.zza;
        int iZzc = zzigxVar.zzc();
        for (int i5 = 0; i5 < iZzc; i5++) {
            Object value = zzigxVar.zzd(i5).getValue();
            if (value instanceof zziep) {
                ((zziep) value).zzbm();
            }
        }
        Iterator it = zzigxVar.zze().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zziep) {
                ((zziep) value2).zzbm();
            }
        }
        zzigxVar.zza();
        this.zzb = true;
    }

    public final Iterator zzc() {
        zzigx zzigxVar = this.zza;
        return zzigxVar.isEmpty() ? Collections.emptyIterator() : this.zzc ? new zzife(zzigxVar.entrySet().iterator()) : zzigxVar.entrySet().iterator();
    }

    public final void zzd(zzied zziedVar, Object obj) {
        if (!zziedVar.zzd()) {
            zzn(zziedVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i5 = 0; i5 < size; i5++) {
                Object obj2 = list.get(i5);
                zzn(zziedVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zziff) {
            this.zzc = true;
        }
        this.zza.put(zziedVar, obj);
    }

    public final boolean zze() {
        zzigx zzigxVar = this.zza;
        int iZzc = zzigxVar.zzc();
        for (int i5 = 0; i5 < iZzc; i5++) {
            if (!zzk(zzigxVar.zzd(i5))) {
                return false;
            }
        }
        Iterator it = zzigxVar.zze().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int zzg() {
        zzigx zzigxVar = this.zza;
        int iZzc = zzigxVar.zzc();
        int iZzm = 0;
        for (int i5 = 0; i5 < iZzc; i5++) {
            iZzm += zzm(zzigxVar.zzd(i5));
        }
        Iterator it = zzigxVar.zze().iterator();
        while (it.hasNext()) {
            iZzm += zzm((Map.Entry) it.next());
        }
        return iZzm;
    }

    private zziee(boolean z2) {
        zzb();
        zzb();
    }
}
