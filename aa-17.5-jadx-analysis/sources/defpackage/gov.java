package defpackage;

/* loaded from: classes2.dex */
public final class gov implements gmw {
    public final hay a;
    public final fwb b;

    public gov(hay hayVar, fwb fwbVar) {
        this.a = hayVar;
        this.b = fwbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gov)) {
            return false;
        }
        gov govVar = (gov) obj;
        return affa.f(this.a, govVar.a) && affa.f(this.b, govVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RoutePreviewContentInternal(contentInternal=" + this.a + ", navigateAction=" + this.b + ")";
    }
}
