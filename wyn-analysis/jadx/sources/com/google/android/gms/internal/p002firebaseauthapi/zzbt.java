package com.google.android.gms.internal.p002firebaseauthapi;

import N0.a;
import R8.v;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import com.google.android.gms.internal.p002firebaseauthapi.zzwa;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbt {
    private final zzwa zza;
    private final List<zzca> zzb;
    private final zzng zzc;

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.firebase-auth-api.zzca.<init>(com.google.android.gms.internal.firebase-auth-api.zzbp, com.google.android.gms.internal.firebase-auth-api.zzbr, int, boolean, com.google.android.gms.internal.firebase-auth-api.zzbz):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:291)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:194)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    private static java.util.List<com.google.android.gms.internal.p002firebaseauthapi.zzca> zzc(com.google.android.gms.internal.p002firebaseauthapi.zzwa r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r9.zza()
            r0.<init>(r1)
            java.util.List r1 = r9.zze()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.firebase-auth-api.zzwa$zzb r2 = (com.google.android.gms.internal.firebase-auth-api.zzwa.zzb) r2
            int r6 = r2.zza()
            com.google.android.gms.internal.firebase-auth-api.zzbp r4 = zza(r2)     // Catch: java.security.GeneralSecurityException -> L42
            com.google.android.gms.internal.firebase-auth-api.zzca r3 = new com.google.android.gms.internal.firebase-auth-api.zzca     // Catch: java.security.GeneralSecurityException -> L42
            com.google.android.gms.internal.firebase-auth-api.zzvv r2 = r2.zzc()     // Catch: java.security.GeneralSecurityException -> L42
            com.google.android.gms.internal.firebase-auth-api.zzbr r5 = zza(r2)     // Catch: java.security.GeneralSecurityException -> L42
            int r2 = r9.zzb()     // Catch: java.security.GeneralSecurityException -> L42
            if (r6 != r2) goto L38
            r2 = 1
        L36:
            r7 = r2
            goto L3a
        L38:
            r2 = 0
            goto L36
        L3a:
            r8 = 0
            r3.<init>(r4, r5, r6, r7)     // Catch: java.security.GeneralSecurityException -> L42
            r0.add(r3)     // Catch: java.security.GeneralSecurityException -> L42
            goto L11
        L42:
            r2 = 0
            r0.add(r2)
            goto L11
        L47:
            java.util.List r9 = j$.util.DesugarCollections.unmodifiableList(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzbt.zzc(com.google.android.gms.internal.firebase-auth-api.zzwa):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(zzwa zzwaVar) throws GeneralSecurityException {
        if (zzwaVar == null || zzwaVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final String toString() {
        return zzcs.zza(this.zza).toString();
    }

    private zzbt(zzwa zzwaVar, List<zzca> list) {
        this.zza = zzwaVar;
        this.zzb = list;
        this.zzc = zzng.zza;
    }

    private static zzbp zza(zzwa.zzb zzbVar) throws GeneralSecurityException {
        zzpc zzpcVarZza = zzpc.zza(zzbVar.zzb().zzf(), zzbVar.zzb().zze(), zzbVar.zzb().zzb(), zzbVar.zzf(), zzbVar.zzf() == zzws.RAW ? null : Integer.valueOf(zzbVar.zza()));
        zzof zzofVarZza = zzof.zza();
        zzcn zzcnVarZza = zzcn.zza();
        return !zzofVarZza.zzb(zzpcVarZza) ? new zznc(zzpcVarZza, zzcnVarZza) : zzofVarZza.zza((zzof) zzpcVarZza, zzcnVarZza);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzwa.zzb zzb(zzbp zzbpVar, zzbr zzbrVar, int i5) throws GeneralSecurityException {
        zzvv zzvvVar;
        zzpc zzpcVar = (zzpc) zzof.zza().zza(zzbpVar, zzpc.class, zzcn.zza());
        Integer numZze = zzpcVar.zze();
        if (numZze != null && numZze.intValue() != i5) {
            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
        }
        if (zzbr.zza.equals(zzbrVar)) {
            zzvvVar = zzvv.ENABLED;
        } else if (zzbr.zzb.equals(zzbrVar)) {
            zzvvVar = zzvv.DISABLED;
        } else {
            if (!zzbr.zzc.equals(zzbrVar)) {
                throw new IllegalStateException("Unknown key status");
            }
            zzvvVar = zzvv.DESTROYED;
        }
        return (zzwa.zzb) ((zzajy) zzwa.zzb.zzd().zza(zzvq.zza().zza(zzpcVar.zzf()).zza(zzpcVar.zzd()).zza(zzpcVar.zza())).zza(zzvvVar).zza(i5).zza(zzpcVar.zzb()).zze());
    }

    private zzbt(zzwa zzwaVar, List<zzca> list, zzng zzngVar) {
        this.zza = zzwaVar;
        this.zzb = list;
        this.zzc = zzngVar;
    }

    private static zzbr zza(zzvv zzvvVar) throws GeneralSecurityException {
        int i5 = zzbw.zza[zzvvVar.ordinal()];
        if (i5 == 1) {
            return zzbr.zza;
        }
        if (i5 == 2) {
            return zzbr.zzb;
        }
        if (i5 == 3) {
            return zzbr.zzc;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    public static final zzbt zza(zzwa zzwaVar) throws GeneralSecurityException {
        zzd(zzwaVar);
        return new zzbt(zzwaVar, zzc(zzwaVar));
    }

    public static final zzbt zza(zzbu zzbuVar) throws GeneralSecurityException {
        return new zzbv().zza(new zzby(zzbuVar.zza()).zzb().zza()).zza();
    }

    public final zzwa zzb() {
        return this.zza;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.firebase-auth-api.zzca.<init>(com.google.android.gms.internal.firebase-auth-api.zzbp, com.google.android.gms.internal.firebase-auth-api.zzbr, int, boolean, com.google.android.gms.internal.firebase-auth-api.zzbz):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:291)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:194)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public final com.google.android.gms.internal.p002firebaseauthapi.zzbt zza() throws java.security.GeneralSecurityException {
        /*
            r13 = this;
            com.google.android.gms.internal.firebase-auth-api.zzwa r0 = r13.zza
            if (r0 == 0) goto Ld9
            com.google.android.gms.internal.firebase-auth-api.zzwa$zza r0 = com.google.android.gms.internal.p002firebaseauthapi.zzwa.zzc()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List<com.google.android.gms.internal.firebase-auth-api.zzca> r2 = r13.zzb
            int r2 = r2.size()
            r1.<init>(r2)
            java.util.List<com.google.android.gms.internal.firebase-auth-api.zzca> r2 = r13.zzb
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r4 = r3
        L1b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto Lc0
            java.lang.Object r5 = r2.next()
            com.google.android.gms.internal.firebase-auth-api.zzca r5 = (com.google.android.gms.internal.p002firebaseauthapi.zzca) r5
            if (r5 == 0) goto L5a
            com.google.android.gms.internal.firebase-auth-api.zzbp r6 = r5.zzb()
            boolean r6 = r6 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzck
            if (r6 == 0) goto L5a
            com.google.android.gms.internal.firebase-auth-api.zzbp r6 = r5.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzck r6 = (com.google.android.gms.internal.p002firebaseauthapi.zzck) r6
            com.google.android.gms.internal.firebase-auth-api.zzbp r8 = r6.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzca r7 = new com.google.android.gms.internal.firebase-auth-api.zzca
            com.google.android.gms.internal.firebase-auth-api.zzbr r9 = r5.zzc()
            int r10 = r5.zza()
            boolean r11 = r5.zzd()
            r12 = 0
            r7.<init>(r8, r9, r10, r11)
            com.google.android.gms.internal.firebase-auth-api.zzbr r6 = r5.zzc()
            int r5 = r5.zza()
            com.google.android.gms.internal.firebase-auth-api.zzwa$zzb r5 = zzb(r8, r6, r5)
            goto Lae
        L5a:
            com.google.android.gms.internal.firebase-auth-api.zzwa r5 = r13.zza
            com.google.android.gms.internal.firebase-auth-api.zzwa$zzb r5 = r5.zza(r4)
            com.google.android.gms.internal.firebase-auth-api.zzvq r6 = r5.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzvq$zzb r7 = r6.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzvq$zzb r8 = com.google.android.gms.internal.firebase-auth-api.zzvq.zzb.ASYMMETRIC_PRIVATE
            if (r7 != r8) goto Lb8
            java.lang.String r7 = r6.zzf()
            com.google.android.gms.internal.firebase-auth-api.zzaip r6 = r6.zze()
            com.google.android.gms.internal.firebase-auth-api.zzvq r6 = com.google.android.gms.internal.p002firebaseauthapi.zzco.zza(r7, r6)
            com.google.android.gms.internal.firebase-auth-api.zzajy$zza r5 = r5.zzn()
            com.google.android.gms.internal.firebase-auth-api.zzwa$zzb$zza r5 = (com.google.android.gms.internal.firebase-auth-api.zzwa.zzb.zza) r5
            com.google.android.gms.internal.firebase-auth-api.zzwa$zzb$zza r5 = r5.zza(r6)
            com.google.android.gms.internal.firebase-auth-api.zzalc r5 = r5.zze()
            com.google.android.gms.internal.firebase-auth-api.zzajy r5 = (com.google.android.gms.internal.p002firebaseauthapi.zzajy) r5
            com.google.android.gms.internal.firebase-auth-api.zzwa$zzb r5 = (com.google.android.gms.internal.firebase-auth-api.zzwa.zzb) r5
            com.google.android.gms.internal.firebase-auth-api.zzbp r7 = zza(r5)     // Catch: java.security.GeneralSecurityException -> Lad
            int r9 = r5.zza()     // Catch: java.security.GeneralSecurityException -> Lad
            com.google.android.gms.internal.firebase-auth-api.zzca r6 = new com.google.android.gms.internal.firebase-auth-api.zzca     // Catch: java.security.GeneralSecurityException -> Lad
            com.google.android.gms.internal.firebase-auth-api.zzvv r8 = r5.zzc()     // Catch: java.security.GeneralSecurityException -> Lad
            com.google.android.gms.internal.firebase-auth-api.zzbr r8 = zza(r8)     // Catch: java.security.GeneralSecurityException -> Lad
            com.google.android.gms.internal.firebase-auth-api.zzwa r10 = r13.zza     // Catch: java.security.GeneralSecurityException -> Lad
            int r10 = r10.zzb()     // Catch: java.security.GeneralSecurityException -> Lad
            if (r9 != r10) goto La6
            r10 = 1
            goto La7
        La6:
            r10 = r3
        La7:
            r11 = 0
            r6.<init>(r7, r8, r9, r10)     // Catch: java.security.GeneralSecurityException -> Lad
            r7 = r6
            goto Lae
        Lad:
            r7 = 0
        Lae:
            r0.zza(r5)
            r1.add(r7)
            int r4 = r4 + 1
            goto L1b
        Lb8:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "The keyset contains a non-private key"
            r0.<init>(r1)
            throw r0
        Lc0:
            com.google.android.gms.internal.firebase-auth-api.zzwa r2 = r13.zza
            int r2 = r2.zzb()
            r0.zza(r2)
            com.google.android.gms.internal.firebase-auth-api.zzbt r2 = new com.google.android.gms.internal.firebase-auth-api.zzbt
            com.google.android.gms.internal.firebase-auth-api.zzalc r0 = r0.zze()
            com.google.android.gms.internal.firebase-auth-api.zzajy r0 = (com.google.android.gms.internal.p002firebaseauthapi.zzajy) r0
            com.google.android.gms.internal.firebase-auth-api.zzwa r0 = (com.google.android.gms.internal.p002firebaseauthapi.zzwa) r0
            com.google.android.gms.internal.firebase-auth-api.zzng r3 = r13.zzc
            r2.<init>(r0, r1, r3)
            return r2
        Ld9:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "cleartext keyset is not available"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzbt.zza():com.google.android.gms.internal.firebase-auth-api.zzbt");
    }

    public static final zzbt zza(zzcb zzcbVar, zzbg zzbgVar, byte[] bArr) throws GeneralSecurityException, IOException {
        zzuo zzuoVarZza = zzcbVar.zza();
        if (zzuoVarZza != null && zzuoVarZza.zzc().zzb() != 0) {
            return zza(zza(zzuoVarZza, zzbgVar, bArr));
        }
        throw new GeneralSecurityException("empty keyset");
    }

    private static zzwa zza(zzuo zzuoVar, zzbg zzbgVar, byte[] bArr) throws GeneralSecurityException {
        try {
            zzwa zzwaVarZza = zzwa.zza(zzbgVar.zza(zzuoVar.zzc().zzd(), bArr), zzajk.zza());
            zzd(zzwaVarZza);
            return zzwaVarZza;
        } catch (zzakf unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public final <P> P zza(zzbk zzbkVar, Class<P> cls) throws GeneralSecurityException {
        if (zzbkVar instanceof zzmq) {
            zzmq zzmqVar = (zzmq) zzbkVar;
            Class<?> clsZza = zzmqVar.zza(cls);
            if (clsZza != null) {
                return (P) zza(zzmqVar, cls, clsZza);
            }
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <B, P> P zza(zzmq zzmqVar, Class<P> cls, Class<B> cls2) throws GeneralSecurityException {
        zzcs.zzb(this.zza);
        zzoy zzoyVarZza = zzoz.zza(cls2);
        zzoyVarZza.zza(this.zzc);
        for (int i5 = 0; i5 < this.zzb.size(); i5++) {
            zzwa.zzb zzbVarZza = this.zza.zza(i5);
            if (zzbVarZza.zzc().equals(zzvv.ENABLED)) {
                zzca zzcaVar = this.zzb.get(i5);
                if (zzcaVar != null) {
                    zzbp zzbpVarZzb = zzcaVar.zzb();
                    try {
                        Object objZza = zzmqVar.zza(zzbpVarZzb, cls2);
                        if (zzbVarZza.zza() == this.zza.zzb()) {
                            zzoyVarZza.zzb(objZza, zzbpVarZzb, zzbVarZza);
                        } else {
                            zzoyVarZza.zza(objZza, zzbpVarZzb, zzbVarZza);
                        }
                    } catch (GeneralSecurityException e7) {
                        throw new GeneralSecurityException(v.g("Unable to get primitive ", String.valueOf(cls2), " for key of type ", zzbVarZza.zzb().zzf(), ", see https://developers.google.com/tink/faq/registration_errors"), e7);
                    }
                } else {
                    throw new GeneralSecurityException("Key parsing of key with index " + i5 + " and type_url " + zzbVarZza.zzb().zzf() + " failed, unable to get primitive");
                }
            }
        }
        return (P) zzmqVar.zza(zzoyVarZza.zza(), cls);
    }

    public final void zza(zzce zzceVar) throws GeneralSecurityException, IOException {
        for (zzwa.zzb zzbVar : this.zza.zze()) {
            if (zzbVar.zzb().zzb() == zzvq.zzb.UNKNOWN_KEYMATERIAL || zzbVar.zzb().zzb() == zzvq.zzb.SYMMETRIC || zzbVar.zzb().zzb() == zzvq.zzb.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException(a.h("keyset contains key material of type ", zzbVar.zzb().zzb().name(), " for type url ", zzbVar.zzb().zzf()));
            }
        }
        zzceVar.zza(this.zza);
    }

    public final void zza(zzce zzceVar, zzbg zzbgVar, byte[] bArr) throws GeneralSecurityException, IOException {
        zzwa zzwaVar = this.zza;
        zzceVar.zza((zzuo) ((zzajy) zzuo.zza().zza(zzaip.zza(zzbgVar.zzb(zzwaVar.zzk(), bArr))).zza(zzcs.zza(zzwaVar)).zze()));
    }
}
