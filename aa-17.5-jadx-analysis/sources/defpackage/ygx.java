package defpackage;

/* loaded from: classes3.dex */
final class ygx extends yga {
    final /* synthetic */ ygz a;

    public ygx(ygz ygzVar) {
        this.a = ygzVar;
    }

    @Override // defpackage.ygr, defpackage.yfg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final yno iterator() {
        return d().listIterator(0);
    }

    @Override // defpackage.yga
    public final yfy h() {
        return this.a;
    }

    @Override // defpackage.ygr
    public final yfq k() {
        return new ygw(this);
    }

    @Override // defpackage.yga, defpackage.ygr, defpackage.yfg
    public Object writeReplace() {
        return super.writeReplace();
    }
}
