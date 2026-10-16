package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class wgh {
    public final Uri a;
    public final abow b;
    public final xxh c;
    public final yfq d;
    public final wgu e;
    public final boolean f;

    public wgh(Uri uri, abow abowVar, xxh xxhVar, yfq yfqVar, wgu wguVar, boolean z) {
        this.a = uri;
        this.b = abowVar;
        this.c = xxhVar;
        this.d = yfqVar;
        this.e = wguVar;
        this.f = z;
    }

    public static wgg a() {
        wgg wggVar = new wgg();
        wggVar.a = wgq.a;
        wggVar.b();
        wggVar.b = true;
        wggVar.c = (byte) (1 | wggVar.c);
        return wggVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wgh) {
            wgh wghVar = (wgh) obj;
            if (this.a.equals(wghVar.a) && this.b.equals(wghVar.b) && this.c.equals(wghVar.c) && yrm.W(this.d, wghVar.d) && this.e.equals(wghVar.e) && this.f == wghVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.f ? 1237 : 1231) ^ ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003)) * 1000003) ^ 1237;
    }

    public final String toString() {
        wgu wguVar = this.e;
        yfq yfqVar = this.d;
        xxh xxhVar = this.c;
        abow abowVar = this.b;
        return "ProtoDataStoreConfig{uri=" + String.valueOf(this.a) + ", schema=" + String.valueOf(abowVar) + ", handler=" + String.valueOf(xxhVar) + ", migrations=" + String.valueOf(yfqVar) + ", variantConfig=" + String.valueOf(wguVar) + ", useGeneratedExtensionRegistry=" + this.f + ", enableTracing=false}";
    }

    public wgh() {
        throw null;
    }
}
