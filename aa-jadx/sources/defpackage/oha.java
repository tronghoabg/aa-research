package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class oha extends defpackage.xyc {
    @Override // defpackage.xyc
    protected final /* bridge */ /* synthetic */ int a(java.lang.Object obj) {
        return j$.util.Objects.hashCode(((defpackage.ohm) obj).asBinder());
    }

    @Override // defpackage.xyc
    protected final /* bridge */ /* synthetic */ boolean b(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Objects.equals(((defpackage.ohm) obj).asBinder(), ((defpackage.ohm) obj2).asBinder());
    }
}
