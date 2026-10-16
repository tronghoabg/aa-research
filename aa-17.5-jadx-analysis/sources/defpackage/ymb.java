package defpackage;

/* loaded from: classes3.dex */
final class ymb extends yfq {
    final /* synthetic */ ymc a;

    public ymb(ymc ymcVar) {
        this.a = ymcVar;
    }

    @Override // defpackage.yfg
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a.j(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.f();
    }

    @Override // defpackage.yfq, defpackage.yfg
    public Object writeReplace() {
        return super.writeReplace();
    }
}
