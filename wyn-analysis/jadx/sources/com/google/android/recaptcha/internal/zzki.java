package com.google.android.recaptcha.internal;

import com.google.android.gms.internal.consent_sdk.a;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
final class zzki {
    private static final zzki zzb = new zzki(true);
    final zzmu zza = new zzmn(16);
    private boolean zzc;
    private boolean zzd;

    private zzki() {
    }

    public static int zza(zzkh zzkhVar, Object obj) {
        int iZzd;
        int iZzx;
        zznm zznmVarZzd = zzkhVar.zzd();
        int iZza = zzkhVar.zza();
        zzkhVar.zzg();
        int iZzx2 = zzjg.zzx(iZza << 3);
        if (zznmVarZzd == zznm.zzj) {
            byte[] bArr = zzla.zzb;
            if (((zzlx) obj) instanceof zzih) {
                throw null;
            }
            iZzx2 += iZzx2;
        }
        zznn zznnVar = zznn.INT;
        int iZzy = 4;
        switch (zznmVarZzd.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iZzy = 8;
                return iZzx2 + iZzy;
            case 1:
                ((Float) obj).getClass();
                return iZzx2 + iZzy;
            case 2:
                iZzy = zzjg.zzy(((Long) obj).longValue());
                return iZzx2 + iZzy;
            case 3:
                iZzy = zzjg.zzy(((Long) obj).longValue());
                return iZzx2 + iZzy;
            case 4:
                iZzy = zzjg.zzy(((Integer) obj).intValue());
                return iZzx2 + iZzy;
            case 5:
                ((Long) obj).getClass();
                iZzy = 8;
                return iZzx2 + iZzy;
            case 6:
                ((Integer) obj).getClass();
                return iZzx2 + iZzy;
            case 7:
                ((Boolean) obj).getClass();
                iZzy = 1;
                return iZzx2 + iZzy;
            case 8:
                if (!(obj instanceof zziv)) {
                    iZzy = zzjg.zzw((String) obj);
                    return iZzx2 + iZzy;
                }
                iZzd = ((zziv) obj).zzd();
                iZzx = zzjg.zzx(iZzd);
                iZzy = iZzx + iZzd;
                return iZzx2 + iZzy;
            case 9:
                iZzy = ((zzlx) obj).zzn();
                return iZzx2 + iZzy;
            case 10:
                if (!(obj instanceof zzlh)) {
                    iZzy = zzjg.zzu((zzlx) obj);
                    return iZzx2 + iZzy;
                }
                iZzd = ((zzlh) obj).zza();
                iZzx = zzjg.zzx(iZzd);
                iZzy = iZzx + iZzd;
                return iZzx2 + iZzy;
            case 11:
                if (obj instanceof zziv) {
                    iZzd = ((zziv) obj).zzd();
                    iZzx = zzjg.zzx(iZzd);
                } else {
                    iZzd = ((byte[]) obj).length;
                    iZzx = zzjg.zzx(iZzd);
                }
                iZzy = iZzx + iZzd;
                return iZzx2 + iZzy;
            case 12:
                iZzy = zzjg.zzx(((Integer) obj).intValue());
                return iZzx2 + iZzy;
            case 13:
                iZzy = obj instanceof zzku ? zzjg.zzy(((zzku) obj).zza()) : zzjg.zzy(((Integer) obj).intValue());
                return iZzx2 + iZzy;
            case 14:
                ((Integer) obj).getClass();
                return iZzx2 + iZzy;
            case 15:
                ((Long) obj).getClass();
                iZzy = 8;
                return iZzx2 + iZzy;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iZzy = zzjg.zzx((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iZzx2 + iZzy;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iZzy = zzjg.zzy((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iZzx2 + iZzy;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static zzki zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzmc) {
            return ((zzmc) obj).zzd();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzm(Map.Entry entry) {
        zzlx zzlxVarZzj;
        zzkh zzkhVar = (zzkh) entry.getKey();
        Object value = entry.getValue();
        boolean z2 = value instanceof zzlh;
        zzkhVar.zzg();
        if (zzkhVar.zze() != zznn.MESSAGE) {
            if (z2) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(zzkhVar, zzl(value));
            return;
        }
        Object objZze = zze(zzkhVar);
        if (objZze == null) {
            this.zza.put(zzkhVar, zzl(value));
            if (z2) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (z2) {
            throw null;
        }
        if (objZze instanceof zzmc) {
            zzlxVarZzj = zzkhVar.zzc((zzmc) objZze, (zzmc) value);
        } else {
            zzlw zzlwVarZzab = ((zzlx) objZze).zzab();
            zzkhVar.zzb(zzlwVarZzab, (zzlx) value);
            zzlxVarZzj = zzlwVarZzab.zzj();
        }
        this.zza.put(zzkhVar, zzlxVarZzj);
    }

    private static boolean zzn(Map.Entry entry) {
        zzkh zzkhVar = (zzkh) entry.getKey();
        if (zzkhVar.zze() != zznn.MESSAGE) {
            return true;
        }
        zzkhVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzly) {
            return ((zzly) value).zzo();
        }
        if (value instanceof zzlh) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        int i5;
        int iZzx;
        int iZzu;
        zzkh zzkhVar = (zzkh) entry.getKey();
        Object value = entry.getValue();
        if (zzkhVar.zze() != zznn.MESSAGE) {
            return zza(zzkhVar, value);
        }
        zzkhVar.zzg();
        zzkhVar.zzf();
        if (value instanceof zzlh) {
            int iZza = ((zzkh) entry.getKey()).zza();
            int iZzx2 = zzjg.zzx(8);
            i5 = iZzx2 + iZzx2;
            iZzx = zzjg.zzx(iZza) + zzjg.zzx(16);
            int iZzx3 = zzjg.zzx(24);
            int iZza2 = ((zzlh) value).zza();
            iZzu = a.D(iZza2, iZza2, iZzx3);
        } else {
            int iZza3 = ((zzkh) entry.getKey()).zza();
            int iZzx4 = zzjg.zzx(8);
            i5 = iZzx4 + iZzx4;
            iZzx = zzjg.zzx(iZza3) + zzjg.zzx(16);
            iZzu = zzjg.zzu((zzlx) value) + zzjg.zzx(24);
        }
        return i5 + iZzx + iZzu;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzki) {
            return this.zza.equals(((zzki) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int iZzo = 0;
        for (int i5 = 0; i5 < this.zza.zzb(); i5++) {
            iZzo += zzo(this.zza.zzg(i5));
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            iZzo += zzo((Map.Entry) it.next());
        }
        return iZzo;
    }

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzki clone() {
        zzki zzkiVar = new zzki();
        for (int i5 = 0; i5 < this.zza.zzb(); i5++) {
            Map.Entry entryZzg = this.zza.zzg(i5);
            zzkiVar.zzi((zzkh) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzkiVar.zzi((zzkh) entry.getKey(), entry.getValue());
        }
        zzkiVar.zzd = this.zzd;
        return zzkiVar;
    }

    public final Object zze(zzkh zzkhVar) {
        Object obj = this.zza.get(zzkhVar);
        if (obj instanceof zzlh) {
            throw null;
        }
        return obj;
    }

    public final Iterator zzf() {
        return this.zzd ? new zzlg(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        for (int i5 = 0; i5 < this.zza.zzb(); i5++) {
            Map.Entry entryZzg = this.zza.zzg(i5);
            if (entryZzg.getValue() instanceof zzks) {
                ((zzks) entryZzg.getValue()).zzD();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzki zzkiVar) {
        for (int i5 = 0; i5 < zzkiVar.zza.zzb(); i5++) {
            zzm(zzkiVar.zza.zzg(i5));
        }
        Iterator it = zzkiVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzm((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if ((r7 instanceof com.google.android.recaptcha.internal.zzku) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if ((r7 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        if (r1 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if ((r7 instanceof com.google.android.recaptcha.internal.zzlh) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(com.google.android.recaptcha.internal.zzkh r6, java.lang.Object r7) {
        /*
            r5 = this;
            r0 = 1
            r6.zzg()
            com.google.android.recaptcha.internal.zznm r1 = r6.zzd()
            byte[] r2 = com.google.android.recaptcha.internal.zzla.zzb
            r7.getClass()
            com.google.android.recaptcha.internal.zznm r2 = com.google.android.recaptcha.internal.zznm.zza
            com.google.android.recaptcha.internal.zznn r2 = com.google.android.recaptcha.internal.zznn.INT
            com.google.android.recaptcha.internal.zznn r1 = r1.zza()
            int r1 = r1.ordinal()
            switch(r1) {
                case 0: goto L47;
                case 1: goto L44;
                case 2: goto L41;
                case 3: goto L3e;
                case 4: goto L3b;
                case 5: goto L38;
                case 6: goto L2f;
                case 7: goto L26;
                case 8: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L57
        L1d:
            boolean r1 = r7 instanceof com.google.android.recaptcha.internal.zzlx
            if (r1 != 0) goto L4b
            boolean r1 = r7 instanceof com.google.android.recaptcha.internal.zzlh
            if (r1 == 0) goto L57
            goto L4b
        L26:
            boolean r1 = r7 instanceof java.lang.Integer
            if (r1 != 0) goto L4b
            boolean r1 = r7 instanceof com.google.android.recaptcha.internal.zzku
            if (r1 == 0) goto L57
            goto L4b
        L2f:
            boolean r1 = r7 instanceof com.google.android.recaptcha.internal.zziv
            if (r1 != 0) goto L4b
            boolean r1 = r7 instanceof byte[]
            if (r1 == 0) goto L57
            goto L4b
        L38:
            boolean r1 = r7 instanceof java.lang.String
            goto L49
        L3b:
            boolean r1 = r7 instanceof java.lang.Boolean
            goto L49
        L3e:
            boolean r1 = r7 instanceof java.lang.Double
            goto L49
        L41:
            boolean r1 = r7 instanceof java.lang.Float
            goto L49
        L44:
            boolean r1 = r7 instanceof java.lang.Long
            goto L49
        L47:
            boolean r1 = r7 instanceof java.lang.Integer
        L49:
            if (r1 == 0) goto L57
        L4b:
            boolean r1 = r7 instanceof com.google.android.recaptcha.internal.zzlh
            if (r1 == 0) goto L51
            r5.zzd = r0
        L51:
            com.google.android.recaptcha.internal.zzmu r0 = r5.zza
            r0.put(r6, r7)
            return
        L57:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            int r2 = r6.zza()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.recaptcha.internal.zznm r6 = r6.zzd()
            com.google.android.recaptcha.internal.zznn r6 = r6.zza()
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            r3[r0] = r6
            r6 = 2
            r3[r6] = r7
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r6 = java.lang.String.format(r6, r3)
            r1.<init>(r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzki.zzi(com.google.android.recaptcha.internal.zzkh, java.lang.Object):void");
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        for (int i5 = 0; i5 < this.zza.zzb(); i5++) {
            if (!zzn(this.zza.zzg(i5))) {
                return false;
            }
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzn((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzki(boolean z2) {
        zzg();
        zzg();
    }
}
