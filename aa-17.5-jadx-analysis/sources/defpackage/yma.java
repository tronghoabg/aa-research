package defpackage;

/* loaded from: classes3.dex */
final class yma extends yhg {
    final /* synthetic */ ymc a;

    public yma(ymc ymcVar) {
        this.a = ymcVar;
    }

    @Override // defpackage.yfg, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof yni) {
            yni yniVar = (yni) obj;
            Object objA = this.a.a(yniVar.b(), yniVar.a());
            if (objA != null && objA.equals(yniVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yfg
    public final boolean f() {
        return false;
    }

    @Override // defpackage.yhg
    public final /* bridge */ /* synthetic */ Object h(int i) {
        return this.a.i(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.f();
    }

    @Override // defpackage.yhg, defpackage.ygr, defpackage.yfg
    public Object writeReplace() {
        return super.writeReplace();
    }
}
