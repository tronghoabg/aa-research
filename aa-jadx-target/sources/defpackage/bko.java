package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bko {
    public final defpackage.bkn a;
    public final defpackage.bkn b;
    public final boolean c;

    public bko(defpackage.bkn bknVar, defpackage.bkn bknVar2, boolean z) {
        this.a = bknVar;
        this.b = bknVar2;
        this.c = z;
    }

    public static /* synthetic */ defpackage.bko a(defpackage.bko bkoVar, defpackage.bkn bknVar, defpackage.bkn bknVar2, boolean z, int i) {
        if ((i & 1) != 0) {
            bknVar = bkoVar.a;
        }
        if ((i & 2) != 0) {
            bknVar2 = bkoVar.b;
        }
        return new defpackage.bko(bknVar, bknVar2, z);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bko)) {
            return false;
        }
        defpackage.bko bkoVar = (defpackage.bko) obj;
        return defpackage.afga.f(this.a, bkoVar.a) && defpackage.afga.f(this.b, bkoVar.b) && this.c == bkoVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + defpackage.a.e(this.c);
    }

    public final java.lang.String toString() {
        return "Selection(start=" + this.a + ", end=" + this.b + ", handlesCrossed=" + this.c + ")";
    }
}
