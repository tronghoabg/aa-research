package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bbc implements defpackage.ayz {
    private final /* synthetic */ int a;
    private final java.lang.Object b;

    public bbc(java.lang.Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ayz
    public final int a() {
        int i = this.a;
        java.lang.Object obj = this.b;
        return i != 0 ? java.lang.Math.max(0, ((defpackage.axx) obj).b()) : java.lang.Math.max(0, ((defpackage.bby) obj).f);
    }

    @Override // defpackage.ayz
    public final int b() {
        int i = this.a;
        java.lang.Object obj = this.b;
        return i != 0 ? ((defpackage.axx) obj).l().m : ((defpackage.bby) obj).b();
    }

    @Override // defpackage.ayz
    public final int c() {
        return this.a != 0 ? java.lang.Math.min(b() - 1, ((defpackage.axp) defpackage.afga.aE(((defpackage.axx) this.b).l().j)).a) : java.lang.Math.min(b() - 1, ((defpackage.bba) defpackage.afga.aE(((defpackage.bby) this.b).w().a)).a);
    }

    @Override // defpackage.ayz
    public final int d() {
        int i;
        int i2;
        int i3 = this.a;
        java.lang.Object obj = this.b;
        if (i3 != 0) {
            defpackage.axx axxVar = (defpackage.axx) obj;
            if (axxVar.l().j.isEmpty()) {
                return 0;
            }
            int iAx = defpackage.ca.ax(axxVar.l());
            int iH = defpackage.axd.h(axxVar.l());
            if (iH != 0 && (i2 = iAx / iH) > 0) {
                return i2;
            }
            return 1;
        }
        defpackage.bby bbyVar = (defpackage.bby) obj;
        if (bbyVar.w().a.size() == 0) {
            return 0;
        }
        int iV = defpackage.afw.V(bbyVar.w());
        int i4 = bbyVar.w().b + bbyVar.w().c;
        if (i4 != 0 && (i = iV / i4) > 0) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.ayz
    public final boolean e() {
        int i = this.a;
        java.lang.Object obj = this.b;
        if (i != 0) {
            return !((defpackage.axx) obj).l().j.isEmpty();
        }
        return !((defpackage.bby) obj).w().a.isEmpty();
    }
}
