package defpackage;

/* loaded from: classes3.dex */
final class uos extends plb {
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uos(int i, pkz pkzVar, pkx pkxVar, vky vkyVar, int i2) {
        super(i, pkzVar, pkxVar, vkyVar);
        this.b = i2;
    }

    @Override // defpackage.plb
    public final /* bridge */ /* synthetic */ int d(Object obj) {
        uko ukoVarJ = ((rjg) obj).j();
        if (this.b - 1 == 0) {
            return 1;
        }
        if (ukoVarJ == null) {
            return 0;
        }
        return ukoVarJ.a();
    }
}
