package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class axe {
    public defpackage.azx b;
    public boolean c;
    public float e;
    public int a = -1;
    public int d = -1;

    public static final int b(defpackage.axo axoVar, boolean z) {
        java.util.List list = axoVar.j;
        return z ? ((defpackage.axp) defpackage.afga.aE(list)).a + 1 : ((defpackage.axp) defpackage.afga.az(list)).a - 1;
    }

    public final void a() {
        this.a = -1;
        defpackage.azx azxVar = this.b;
        if (azxVar != null) {
            azxVar.a();
        }
        this.b = null;
    }
}
