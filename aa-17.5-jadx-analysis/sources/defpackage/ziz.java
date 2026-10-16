package defpackage;

/* loaded from: classes3.dex */
public final class ziz {
    public final adlx a;
    public final adjn b;
    public final adjn c;
    public final adjn d;

    public ziz(adlx adlxVar, adjn adjnVar, adjn adjnVar2, adjn adjnVar3) {
        this.a = adlxVar;
        this.b = adjnVar;
        this.c = adjnVar2;
        this.d = adjnVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ziz)) {
            return false;
        }
        ziz zizVar = (ziz) obj;
        return affa.f(this.a, zizVar.a) && affa.f(this.b, zizVar.b) && affa.f(this.c, zizVar.c) && affa.f(this.d, zizVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ParcelableOverMetadataKeys(metadataKey=" + this.a + ", requestKey=" + this.b + ", responseHeaderKey=" + this.c + ", responseTrailerKey=" + this.d + ")";
    }
}
