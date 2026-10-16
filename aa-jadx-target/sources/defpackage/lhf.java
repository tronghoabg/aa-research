package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lhf extends defpackage.eqr {
    private final defpackage.mqg a;
    private final lhg h;

    static {
        defpackage.yqm.c("GH.DefaultAppLD");
    }

    public lhf(defpackage.mqg mqgVar) {
        final int i = 1;
        this.h = new lhg() { // from class: mau
            public final void a(android.content.ComponentName componentName) {
                int i2 = i;
                mav mavVar = this;
                if (i2 != 0) {
                    mavVar.m(componentName);
                } else {
                    mavVar.a();
                }
            }
        };
        this.a = mqgVar;
    }

    @Override // defpackage.eqr, defpackage.eqp
    protected final void c() {
        super.c();
        defpackage.lhh lhhVarA = defpackage.lhc.a();
        defpackage.mqg mqgVar = this.a;
        lhhVarA.c(mqgVar, this.h);
        if (defpackage.kit.b().p()) {
            m(defpackage.lhc.a().a(mqgVar));
        }
    }

    @Override // defpackage.eqr, defpackage.eqp
    protected final void d() {
        defpackage.lhc.a().e(this.a, this.h);
        super.d();
    }
}
