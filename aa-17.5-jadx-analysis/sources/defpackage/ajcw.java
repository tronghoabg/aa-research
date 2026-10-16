package defpackage;

/* loaded from: classes2.dex */
public class ajcw extends aisz implements afdb {
    public final afck c;

    public ajcw(afco afcoVar, afck afckVar) {
        super(afcoVar, true);
        this.c = afckVar;
    }

    @Override // defpackage.afdb
    public final StackTraceElement ea() {
        return null;
    }

    @Override // defpackage.afdb
    public final afdb eb() {
        afck afckVar = this.c;
        if (afckVar instanceof afdb) {
            return (afdb) afckVar;
        }
        return null;
    }

    @Override // defpackage.aisz
    protected void f(Object obj) {
        afck afckVar = this.c;
        afckVar.w(ahng.a(obj, afckVar));
    }

    @Override // defpackage.aivo
    protected void l(Object obj) {
        afck afckVar = this.c;
        ajcb.a(affa.s(afckVar), ahng.a(obj, afckVar));
    }

    @Override // defpackage.aivo
    protected final boolean m() {
        return true;
    }

    public void k() {
    }
}
