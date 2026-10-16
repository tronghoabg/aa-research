package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zje {
    public final android.content.Context a;
    public final java.lang.String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final java.lang.String g;
    public final int h;
    public final defpackage.vae i;

    public zje(android.content.Context context, java.lang.String str, boolean z, boolean z2, boolean z3, int i, java.lang.String str2, defpackage.vae vaeVar, int i2) {
        this.a = context;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = i;
        this.g = str2;
        this.i = vaeVar;
        this.h = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        defpackage.vae vaeVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.zje) {
            defpackage.zje zjeVar = (defpackage.zje) obj;
            android.content.Context context = this.a;
            if (context != null ? context.equals(zjeVar.a) : zjeVar.a == null) {
                java.lang.String str2 = this.b;
                if (str2 != null ? str2.equals(zjeVar.b) : zjeVar.b == null) {
                    if (this.c == zjeVar.c && this.d == zjeVar.d && this.e == zjeVar.e && this.f == zjeVar.f && ((str = this.g) != null ? str.equals(zjeVar.g) : zjeVar.g == null) && ((vaeVar = this.i) != null ? vaeVar.equals(zjeVar.i) : zjeVar.i == null) && this.h == zjeVar.h) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        android.content.Context context = this.a;
        int iHashCode = context == null ? 0 : context.hashCode();
        java.lang.String str = this.b;
        int iHashCode2 = (((((((((((((((iHashCode ^ 1000003) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003;
        int i = this.f;
        java.lang.String str2 = this.g;
        int iHashCode3 = (((iHashCode2 ^ i) * 583896283) ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        defpackage.vae vaeVar = this.i;
        return this.h ^ ((iHashCode3 ^ (vaeVar != null ? vaeVar.hashCode() : 0)) * 1000003);
    }

    public final java.lang.String toString() {
        defpackage.vae vaeVar = this.i;
        return "CronetConfig{context=" + java.lang.String.valueOf(this.a) + ", storagePath=" + this.b + ", enableQuic=" + this.c + ", enableBrotli=false, enableCertificateCache=" + this.d + ", enableHttpCache=false, enableNetworkQualityEstimator=" + this.e + ", enablePrimesMonitoring=false, diskCacheSizeBytes=" + this.f + ", inMemoryFallbackCacheSizeBytes=0, libraryLoader=null, experimentalOptions=" + this.g + ", cronetEngineBuilderFactory=" + java.lang.String.valueOf(vaeVar) + ", threadPriority=" + this.h + "}";
    }

    public zje() {
        throw null;
    }
}
