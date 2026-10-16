package defpackage;

/* loaded from: classes2.dex */
public abstract class fcg implements fbk {
    public final fbl f;
    public final String g;
    public boolean h;

    public fcg(fbl fblVar, String str) {
        this.f = fblVar;
        this.g = str;
    }

    @Override // defpackage.fbk
    public /* synthetic */ boolean m() {
        return b(0) != 0;
    }

    protected final void n() {
        if (this.h) {
            dan.k(21, "statement is closed");
            throw new aezp();
        }
    }

    protected final void o() {
        this.h = true;
    }
}
