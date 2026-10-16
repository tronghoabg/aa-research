package defpackage;

/* loaded from: classes3.dex */
public final class ajbg implements afck, afdb {
    private final afck a;
    private final afco b;

    public ajbg(afck afckVar, afco afcoVar) {
        this.a = afckVar;
        this.b = afcoVar;
    }

    @Override // defpackage.afdb
    public final StackTraceElement ea() {
        return null;
    }

    @Override // defpackage.afdb
    public final afdb eb() {
        afck afckVar = this.a;
        if (afckVar instanceof afdb) {
            return (afdb) afckVar;
        }
        return null;
    }

    @Override // defpackage.afck
    public final afco hH() {
        return this.b;
    }

    @Override // defpackage.afck
    public final void w(Object obj) {
        this.a.w(obj);
    }
}
