package defpackage;

/* loaded from: classes3.dex */
public final class umq extends uma implements umg {
    private final boolean a;
    private ump b;
    private boolean c;
    private final too e;

    public umq(utf utfVar, ute uteVar) {
        super(utfVar, uteVar, 0);
        this.e = new too();
        this.a = true;
    }

    @Override // defpackage.umg
    public final synchronized boolean a(umk umkVar, float f) {
        ump umpVar = this.b;
        if (umpVar == null) {
            return false;
        }
        return umpVar.p(umkVar, this.a, this.e) != 1;
    }

    public final synchronized too g() {
        return new too(this.e);
    }

    public final synchronized void k() {
        this.b = null;
    }

    public final synchronized void l(ump umpVar) {
        this.b = umpVar;
        this.c = umpVar.n();
    }

    public final synchronized boolean m() {
        return this.c;
    }
}
