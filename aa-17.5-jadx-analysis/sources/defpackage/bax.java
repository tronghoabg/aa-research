package defpackage;

/* loaded from: classes.dex */
public final class bax implements ayu {
    private final /* synthetic */ int a;
    private final Object b;

    public bax(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ayu
    public final int a() {
        int i = this.a;
        Object obj = this.b;
        return i != 0 ? Math.max(0, ((axr) obj).b()) : Math.max(0, ((bbt) obj).f);
    }

    @Override // defpackage.ayu
    public final int b() {
        int i = this.a;
        Object obj = this.b;
        return i != 0 ? ((axr) obj).l().m : ((bbt) obj).b();
    }

    @Override // defpackage.ayu
    public final int c() {
        return this.a != 0 ? Math.min(b() - 1, ((axk) woy.bK(((axr) this.b).l().j)).a) : Math.min(b() - 1, ((bav) woy.bK(((bbt) this.b).x().a)).a);
    }

    @Override // defpackage.ayu
    public final int d() {
        int i;
        int i2;
        int i3 = this.a;
        Object obj = this.b;
        if (i3 != 0) {
            axr axrVar = (axr) obj;
            if (axrVar.l().j.isEmpty()) {
                return 0;
            }
            int iAx = ca.ax(axrVar.l());
            int iH = awx.h(axrVar.l());
            if (iH != 0 && (i2 = iAx / iH) > 0) {
                return i2;
            }
            return 1;
        }
        bbt bbtVar = (bbt) obj;
        if (bbtVar.x().a.size() == 0) {
            return 0;
        }
        int iV = afp.V(bbtVar.x());
        int i4 = bbtVar.x().b + bbtVar.x().c;
        if (i4 != 0 && (i = iV / i4) > 0) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.ayu
    public final boolean e() {
        int i = this.a;
        Object obj = this.b;
        return i != 0 ? !((axr) obj).l().j.isEmpty() : !((bbt) obj).x().a.isEmpty();
    }
}
