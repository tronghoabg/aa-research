package defpackage;

import defpackage.zeu;

/* loaded from: classes.dex */
public final class zgi extends zeu.f implements Runnable {
    private zgp a;

    public zgi(zgp zgpVar) {
        this.a = zgpVar;
    }

    @Override // defpackage.zeu
    protected final void b() {
        this.a = null;
    }

    @Override // defpackage.zeu
    protected final String fO() {
        zgp zgpVar = this.a;
        if (zgpVar != null) {
            return a.bW(zgpVar, "delegate=[", "]");
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zgp zgpVar = this.a;
        if (zgpVar != null) {
            r(zgpVar);
        }
    }
}
