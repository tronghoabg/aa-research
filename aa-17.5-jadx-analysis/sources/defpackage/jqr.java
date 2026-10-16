package defpackage;

/* loaded from: classes2.dex */
public final class jqr implements jbm {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public jqr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.jbm
    public final void a() {
        if (this.b != 0) {
            ((ild) this.a).g.countDown();
        } else {
            ((jkx) ((sji) this.a).c).l(xny.SENSOR_DRIVING_STATUS_DATA.A, 0L);
        }
    }

    @Override // defpackage.jbm
    public final boolean b(int i) {
        return this.b == 0 || ((ild) this.a).d == i;
    }
}
