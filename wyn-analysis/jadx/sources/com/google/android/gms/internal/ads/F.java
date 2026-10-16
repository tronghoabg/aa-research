package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class F {
    public static void a(zzma zzmaVar, zzqh zzqhVar) {
        throw new IllegalStateException("onPrepared not implemented");
    }

    public static void b(zzma zzmaVar, zzlz zzlzVar, zzzo zzzoVar, zzabb[] zzabbVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    public static void c(zzma zzmaVar, zzqh zzqhVar) {
        throw new IllegalStateException("onStopped not implemented");
    }

    public static void d(zzma zzmaVar, zzqh zzqhVar) {
        throw new IllegalStateException("onReleased not implemented");
    }

    public static long e(zzma zzmaVar, zzqh zzqhVar) {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    public static boolean f(zzma zzmaVar, zzqh zzqhVar) {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    public static boolean g(zzma zzmaVar, zzlz zzlzVar) {
        long j8 = zzlzVar.zzd;
        throw null;
    }

    public static boolean h(zzma zzmaVar, zzlz zzlzVar) {
        zzbf zzbfVar = zzlzVar.zzb;
        throw null;
    }

    public static boolean i(zzma zzmaVar, zzqh zzqhVar, zzbf zzbfVar, zzxl zzxlVar, long j8) {
        zzeh.zzc("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }
}
