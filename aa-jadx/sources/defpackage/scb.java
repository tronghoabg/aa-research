package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class scb {
    public final boolean a;
    public final boolean b;
    public final defpackage.xyn c;
    public final defpackage.xyn d;
    public final defpackage.xyn e;
    public final defpackage.xyn f;
    private final defpackage.xyn g;

    public scb(boolean z, boolean z2, defpackage.xyn xynVar, defpackage.xyn xynVar2, defpackage.xyn xynVar3, defpackage.xyn xynVar4, defpackage.xyn xynVar5) {
        this.a = z;
        this.b = z2;
        this.c = xynVar;
        this.d = xynVar2;
        this.e = xynVar3;
        this.f = xynVar4;
        this.g = xynVar5;
    }

    static defpackage.sca a() {
        defpackage.sca scaVar = new defpackage.sca();
        scaVar.c(false);
        scaVar.b(false);
        return scaVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.scb) {
            defpackage.scb scbVar = (defpackage.scb) obj;
            if (this.a == scbVar.a && this.b == scbVar.b && this.c.equals(scbVar.c) && this.d.equals(scbVar.d) && this.e.equals(scbVar.e) && this.f.equals(scbVar.f) && this.g.equals(scbVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f.hashCode() ^ (((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003)) * 1000003) ^ 2040732332;
    }

    public final java.lang.String toString() {
        defpackage.xyn xynVar = this.g;
        defpackage.xyn xynVar2 = this.f;
        defpackage.xyn xynVar3 = this.e;
        defpackage.xyn xynVar4 = this.d;
        return "Notification{showNotification=" + this.a + ", dismissNotification=" + this.b + ", title=" + java.lang.String.valueOf(this.c) + ", text=" + java.lang.String.valueOf(xynVar4) + ", priority=" + java.lang.String.valueOf(xynVar3) + ", action=" + java.lang.String.valueOf(xynVar2) + ", pendingIntent=" + java.lang.String.valueOf(xynVar) + "}";
    }

    public scb() {
        throw null;
    }
}
