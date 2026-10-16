package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class ocr implements tgr {
    private final /* synthetic */ int a;

    public /* synthetic */ ocr(int i) {
        this.a = i;
    }

    @Override // defpackage.tgr
    public final Object a() {
        int i = this.a;
        if (i == 0) {
            yph yphVar = nso.a;
            return new oct();
        }
        if (i == 1) {
            return new nzj();
        }
        if (i == 2) {
            return new odg();
        }
        if (i == 3) {
            int i2 = qer.g;
            return new lxi();
        }
        if (i == 4) {
            int i3 = qer.g;
            return new lxm();
        }
        if (i != 5) {
            int i4 = qer.g;
            return new lxl();
        }
        int i5 = qer.g;
        return new lxh();
    }
}
