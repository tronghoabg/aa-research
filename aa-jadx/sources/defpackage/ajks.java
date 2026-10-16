package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ajks {
    public final defpackage.ajkt a;
    public final defpackage.ajkt b;
    public final java.lang.Throwable c;

    public ajks(defpackage.ajkt ajktVar, defpackage.ajkt ajktVar2, java.lang.Throwable th) {
        ajktVar.getClass();
        this.a = ajktVar;
        this.b = ajktVar2;
        this.c = th;
    }

    public final boolean a() {
        return this.b == null && this.c == null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ajks)) {
            return false;
        }
        defpackage.ajks ajksVar = (defpackage.ajks) obj;
        return defpackage.afga.f(this.a, ajksVar.a) && defpackage.afga.f(this.b, ajksVar.b) && defpackage.afga.f(this.c, ajksVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.ajkt ajktVar = this.b;
        int iHashCode2 = (iHashCode + (ajktVar == null ? 0 : ajktVar.hashCode())) * 31;
        java.lang.Throwable th = this.c;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "ConnectResult(plan=" + this.a + ", nextPlan=" + this.b + ", throwable=" + this.c + ")";
    }
}
