package e.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class dj extends k {
    dj() {
    }

    @Override // e.a.k
    public void a(String str, Throwable th) {
        j().a(str, th);
    }

    @Override // e.a.k
    public final void b() {
        j().b();
    }

    @Override // e.a.k
    public void c(int i2) {
        j().c(i2);
    }

    @Override // e.a.k
    public final boolean i() {
        return j().i();
    }

    protected abstract k j();

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.d("delegate", j());
        return zVarH.toString();
    }
}
