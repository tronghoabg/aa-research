package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zic {
    public final Context a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final String g;
    public final int h;
    public final uzj i;

    public zic(Context context, String str, boolean z, boolean z2, boolean z3, int i, String str2, uzj uzjVar, int i2) {
        this.a = context;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = i;
        this.g = str2;
        this.i = uzjVar;
        this.h = i2;
    }

    public final boolean equals(Object obj) {
        String str;
        uzj uzjVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zic) {
            zic zicVar = (zic) obj;
            Context context = this.a;
            if (context != null ? context.equals(zicVar.a) : zicVar.a == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(zicVar.b) : zicVar.b == null) {
                    if (this.c == zicVar.c && this.d == zicVar.d && this.e == zicVar.e && this.f == zicVar.f && ((str = this.g) != null ? str.equals(zicVar.g) : zicVar.g == null) && ((uzjVar = this.i) != null ? uzjVar.equals(zicVar.i) : zicVar.i == null) && this.h == zicVar.h) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Context context = this.a;
        int iHashCode = context == null ? 0 : context.hashCode();
        String str = this.b;
        int iHashCode2 = (((((((((((((((iHashCode ^ 1000003) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003;
        int i = this.f;
        String str2 = this.g;
        int iHashCode3 = (((iHashCode2 ^ i) * 583896283) ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        uzj uzjVar = this.i;
        return this.h ^ ((iHashCode3 ^ (uzjVar != null ? uzjVar.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        uzj uzjVar = this.i;
        return "CronetConfig{context=" + String.valueOf(this.a) + ", storagePath=" + this.b + ", enableQuic=" + this.c + ", enableBrotli=false, enableCertificateCache=" + this.d + ", enableHttpCache=false, enableNetworkQualityEstimator=" + this.e + ", enablePrimesMonitoring=false, diskCacheSizeBytes=" + this.f + ", inMemoryFallbackCacheSizeBytes=0, libraryLoader=null, experimentalOptions=" + this.g + ", cronetEngineBuilderFactory=" + String.valueOf(uzjVar) + ", threadPriority=" + this.h + "}";
    }

    public zic() {
        throw null;
    }
}
