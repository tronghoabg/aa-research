package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tpv implements java.lang.Comparable {
    public final java.lang.String a;
    public final java.lang.String b;
    public final defpackage.abho c;
    public final boolean d;

    public tpv(java.lang.String str, defpackage.abho abhoVar) {
        this(str + "." + abhoVar.name(), str, abhoVar, true);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return this.b.compareTo(((defpackage.tpv) obj).b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.tpv) {
            return j$.util.Objects.equals(this.b, ((defpackage.tpv) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        return this.b;
    }

    public tpv(java.lang.String str, java.lang.String str2, defpackage.abho abhoVar, boolean z) {
        this.b = str;
        this.a = str2;
        this.c = abhoVar;
        this.d = z;
    }
}
