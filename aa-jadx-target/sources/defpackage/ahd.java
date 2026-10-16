package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ahd {
    public final defpackage.aep a;
    public final defpackage.aez b;
    public final int c = 0;

    public ahd(defpackage.aep aepVar, defpackage.aez aezVar) {
        this.a = aepVar;
        this.b = aezVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ahd)) {
            return false;
        }
        defpackage.ahd ahdVar = (defpackage.ahd) obj;
        if (!defpackage.afga.f(this.a, ahdVar.a) || !defpackage.afga.f(this.b, ahdVar.b)) {
            return false;
        }
        int i = ahdVar.c;
        return true;
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
    }

    public final java.lang.String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
