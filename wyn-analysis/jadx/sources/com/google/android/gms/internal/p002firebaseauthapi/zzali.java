package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzali<T> implements zzalv<T> {
    private final zzalc zza;
    private final zzamo<?, ?> zzb;
    private final boolean zzc;
    private final zzajm<?> zzd;

    private zzali(zzamo<?, ?> zzamoVar, zzajm<?> zzajmVar, zzalc zzalcVar) {
        this.zzb = zzamoVar;
        this.zzc = zzajmVar.zza(zzalcVar);
        this.zzd = zzajmVar;
        this.zza = zzalcVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final int zza(T t10) {
        zzamo<?, ?> zzamoVar = this.zzb;
        int iZzb = zzamoVar.zzb(zzamoVar.zzd(t10));
        return this.zzc ? iZzb + this.zzd.zza(t10).zza() : iZzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final int zzb(T t10) {
        int iHashCode = this.zzb.zzd(t10).hashCode();
        return this.zzc ? (iHashCode * 53) + this.zzd.zza(t10).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zzd(T t10) {
        this.zzb.zzf(t10);
        this.zzd.zzc(t10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final boolean zze(T t10) {
        return this.zzd.zza(t10).zzg();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final boolean zzb(T t10, T t11) {
        if (!this.zzb.zzd(t10).equals(this.zzb.zzd(t11))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza(t10).equals(this.zzd.zza(t11));
        }
        return true;
    }

    public static <T> zzali<T> zza(zzamo<?, ?> zzamoVar, zzajm<?> zzajmVar, zzalc zzalcVar) {
        return new zzali<>(zzamoVar, zzajmVar, zzalcVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final T zza() {
        zzalc zzalcVar = this.zza;
        if (zzalcVar instanceof zzajy) {
            return (T) ((zzajy) zzalcVar).zzo();
        }
        return (T) zzalcVar.zzq().zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zza(T t10, T t11) {
        zzalx.zza(this.zzb, t10, t11);
        if (this.zzc) {
            zzalx.zza(this.zzd, t10, t11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[LOOP:0: B:46:0x000c->B:54:?, LOOP_END, SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r11, com.google.android.gms.internal.p002firebaseauthapi.zzals r12, com.google.android.gms.internal.p002firebaseauthapi.zzajk r13) throws java.io.IOException {
        /*
            r10 = this;
            com.google.android.gms.internal.firebase-auth-api.zzamo<?, ?> r0 = r10.zzb
            com.google.android.gms.internal.firebase-auth-api.zzajm<?> r1 = r10.zzd
            java.lang.Object r2 = r0.zzc(r11)
            com.google.android.gms.internal.firebase-auth-api.zzajr r3 = r1.zzb(r11)
        Lc:
            int r4 = r12.zzc()     // Catch: java.lang.Throwable -> L35
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L19
            r0.zzb(r11, r2)
            return
        L19:
            int r4 = r12.zzd()     // Catch: java.lang.Throwable -> L35
            r6 = 11
            r7 = 0
            if (r4 == r6) goto L41
            r5 = r4 & 7
            r6 = 2
            if (r5 != r6) goto L3c
            com.google.android.gms.internal.firebase-auth-api.zzalc r5 = r10.zza     // Catch: java.lang.Throwable -> L35
            int r4 = r4 >>> 3
            java.lang.Object r4 = r1.zza(r13, r5, r4)     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L37
            r1.zza(r12, r4, r13, r3)     // Catch: java.lang.Throwable -> L35
            goto L84
        L35:
            r12 = move-exception
            goto L90
        L37:
            boolean r4 = r0.zza(r2, r12, r7)     // Catch: java.lang.Throwable -> L35
            goto L85
        L3c:
            boolean r4 = r12.zzt()     // Catch: java.lang.Throwable -> L35
            goto L85
        L41:
            r4 = 0
            r6 = r4
        L43:
            int r8 = r12.zzc()     // Catch: java.lang.Throwable -> L35
            if (r8 == r5) goto L71
            int r8 = r12.zzd()     // Catch: java.lang.Throwable -> L35
            r9 = 16
            if (r8 != r9) goto L5c
            int r7 = r12.zzj()     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.firebase-auth-api.zzalc r4 = r10.zza     // Catch: java.lang.Throwable -> L35
            java.lang.Object r4 = r1.zza(r13, r4, r7)     // Catch: java.lang.Throwable -> L35
            goto L43
        L5c:
            r9 = 26
            if (r8 != r9) goto L6b
            if (r4 == 0) goto L66
            r1.zza(r12, r4, r13, r3)     // Catch: java.lang.Throwable -> L35
            goto L43
        L66:
            com.google.android.gms.internal.firebase-auth-api.zzaip r6 = r12.zzp()     // Catch: java.lang.Throwable -> L35
            goto L43
        L6b:
            boolean r8 = r12.zzt()     // Catch: java.lang.Throwable -> L35
            if (r8 != 0) goto L43
        L71:
            int r5 = r12.zzd()     // Catch: java.lang.Throwable -> L35
            r8 = 12
            if (r5 != r8) goto L8b
            if (r6 == 0) goto L84
            if (r4 == 0) goto L81
            r1.zza(r6, r4, r13, r3)     // Catch: java.lang.Throwable -> L35
            goto L84
        L81:
            r0.zza(r2, r7, r6)     // Catch: java.lang.Throwable -> L35
        L84:
            r4 = 1
        L85:
            if (r4 != 0) goto Lc
            r0.zzb(r11, r2)
            return
        L8b:
            com.google.android.gms.internal.firebase-auth-api.zzakf r12 = com.google.android.gms.internal.p002firebaseauthapi.zzakf.zzb()     // Catch: java.lang.Throwable -> L35
            throw r12     // Catch: java.lang.Throwable -> L35
        L90:
            r0.zzb(r11, r2)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzali.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzals, com.google.android.gms.internal.firebase-auth-api.zzajk):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        if (r12 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
    
        r6.zza((r11 << 3) | 2, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a9, code lost:
    
        r12 = r13;
        r11 = r3;
        r13 = r5;
        r14 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1 A[EDGE_INSN: B:58:0x00a1->B:35:0x00a1 BREAK  A[LOOP:1: B:18:0x0059->B:63:0x0059], SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.p002firebaseauthapi.zzaik r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.firebase-auth-api.zzajy r0 = (com.google.android.gms.internal.p002firebaseauthapi.zzajy) r0
            com.google.android.gms.internal.firebase-auth-api.zzamn r1 = r0.zzb
            com.google.android.gms.internal.firebase-auth-api.zzamn r2 = com.google.android.gms.internal.p002firebaseauthapi.zzamn.zzc()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.firebase-auth-api.zzamn r1 = com.google.android.gms.internal.p002firebaseauthapi.zzamn.zzd()
            r0.zzb = r1
        L11:
            r6 = r1
            com.google.android.gms.internal.firebase-auth-api.zzajy$zzb r10 = (com.google.android.gms.internal.firebase-auth-api.zzajy.zzb) r10
            r10.zza()
            r10 = 0
            r0 = r10
        L19:
            if (r12 >= r13) goto Laf
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzail.zzc(r11, r12, r14)
            int r2 = r14.zza
            r12 = 11
            r1 = 2
            if (r2 == r12) goto L54
            r12 = r2 & 7
            if (r12 != r1) goto L4c
            com.google.android.gms.internal.firebase-auth-api.zzajm<?> r12 = r9.zzd
            com.google.android.gms.internal.firebase-auth-api.zzajk r0 = r14.zzd
            com.google.android.gms.internal.firebase-auth-api.zzalc r1 = r9.zza
            int r3 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r1, r3)
            r0 = r12
            com.google.android.gms.internal.firebase-auth-api.zzajy$zzd r0 = (com.google.android.gms.internal.firebase-auth-api.zzajy.zzd) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r7 = r14
            int r12 = com.google.android.gms.internal.p002firebaseauthapi.zzail.zza(r2, r3, r4, r5, r6, r7)
            goto L19
        L43:
            com.google.android.gms.internal.p002firebaseauthapi.zzalr.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            r3 = r11
            r5 = r13
            r7 = r14
            int r12 = com.google.android.gms.internal.p002firebaseauthapi.zzail.zza(r2, r3, r4, r5, r7)
            goto L19
        L54:
            r3 = r11
            r5 = r13
            r7 = r14
            r11 = 0
            r12 = r10
        L59:
            if (r4 >= r5) goto La0
            int r13 = com.google.android.gms.internal.p002firebaseauthapi.zzail.zzc(r3, r4, r7)
            int r14 = r7.zza
            int r2 = r14 >>> 3
            r4 = r14 & 7
            if (r2 == r1) goto L81
            r8 = 3
            if (r2 == r8) goto L6b
            goto L97
        L6b:
            if (r0 != 0) goto L78
            if (r4 != r1) goto L97
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzail.zza(r3, r13, r7)
            java.lang.Object r12 = r7.zzc
            com.google.android.gms.internal.firebase-auth-api.zzaip r12 = (com.google.android.gms.internal.p002firebaseauthapi.zzaip) r12
            goto L59
        L78:
            com.google.android.gms.internal.p002firebaseauthapi.zzalr.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L81:
            if (r4 != 0) goto L97
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzail.zzc(r3, r13, r7)
            int r11 = r7.zza
            com.google.android.gms.internal.firebase-auth-api.zzajm<?> r13 = r9.zzd
            com.google.android.gms.internal.firebase-auth-api.zzajk r14 = r7.zzd
            com.google.android.gms.internal.firebase-auth-api.zzalc r0 = r9.zza
            java.lang.Object r13 = r13.zza(r14, r0, r11)
            r0 = r13
            com.google.android.gms.internal.firebase-auth-api.zzajy$zzd r0 = (com.google.android.gms.internal.firebase-auth-api.zzajy.zzd) r0
            goto L59
        L97:
            r2 = 12
            if (r14 == r2) goto La1
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzail.zza(r14, r3, r13, r5, r7)
            goto L59
        La0:
            r13 = r4
        La1:
            if (r12 == 0) goto La9
            int r11 = r11 << 3
            r11 = r11 | r1
            r6.zza(r11, r12)
        La9:
            r12 = r13
            r11 = r3
            r13 = r5
            r14 = r7
            goto L19
        Laf:
            r5 = r13
            if (r12 != r5) goto Lb3
            return
        Lb3:
            com.google.android.gms.internal.firebase-auth-api.zzakf r10 = com.google.android.gms.internal.p002firebaseauthapi.zzakf.zzg()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzali.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.zzaik):void");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zza(T t10, zzanf zzanfVar) throws IOException {
        Iterator itZzd = this.zzd.zza(t10).zzd();
        while (itZzd.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzd.next();
            zzajt zzajtVar = (zzajt) entry.getKey();
            if (zzajtVar.zzc() == zzand.MESSAGE && !zzajtVar.zze() && !zzajtVar.zzd()) {
                if (entry instanceof zzakj) {
                    zzanfVar.zza(zzajtVar.zza(), (Object) ((zzakj) entry).zza().zzb());
                } else {
                    zzanfVar.zza(zzajtVar.zza(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        zzamo<?, ?> zzamoVar = this.zzb;
        zzamoVar.zza((zzamo<?, ?>) zzamoVar.zzd(t10), zzanfVar);
    }
}
