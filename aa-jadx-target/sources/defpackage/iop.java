package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iop extends defpackage.inn {
    public final defpackage.jhl F;
    public defpackage.rbr G;
    public android.graphics.Rect H;
    final ioo I;
    private defpackage.rcw K;
    private boolean L;
    private static final defpackage.yqm J = defpackage.yqm.c("CAR.CAM.FALLBACK");
    public static final defpackage.inm E = new defpackage.iox(1);

    public iop(defpackage.ioh iohVar, defpackage.ioi ioiVar, defpackage.jkr jkrVar, com.google.android.gms.car.display.CarRegionId carRegionId, android.graphics.Rect rect, android.graphics.Rect rect2, int i, int i2, int i3, java.util.UUID uuid) {
        super(iohVar, ioiVar, new android.content.ComponentName(iohVar.d, (java.lang.Class<?>) defpackage.iop.class), jkrVar, carRegionId);
        defpackage.jhk iooVar = new ioo(this);
        this.I = iooVar;
        defpackage.jkr jkrVar2 = this.y;
        defpackage.jkj jkjVar = new defpackage.jkj();
        jkjVar.n(carRegionId);
        jkjVar.l(1);
        jkjVar.m(i3);
        jkjVar.d(rect);
        jkjVar.g(new jhq(rect2));
        jkjVar.e(iooVar);
        jkjVar.j(iohVar.m(carRegionId));
        jkjVar.i(i);
        jkjVar.h(i2);
        jkjVar.b(uuid);
        this.F = jkrVar2.j(jkjVar.a());
    }

    private static final int O(android.content.res.Configuration configuration) {
        return (!defpackage.edd.g() || (configuration.uiMode & 48) == 32) ? 2132149922 : 2132149930;
    }

    @Override // defpackage.inn
    public final void A(com.google.android.gms.car.CarActivityLayoutParams carActivityLayoutParams, java.util.UUID uuid) {
        defpackage.ill.d();
        int i = carActivityLayoutParams.c;
        int i2 = carActivityLayoutParams.d;
        android.graphics.Rect rect = new android.graphics.Rect(i, i2, carActivityLayoutParams.a + i, carActivityLayoutParams.b + i2);
        defpackage.jhl jhlVar = this.F;
        jhlVar.ar();
        M();
        this.y.f(jhlVar, rect, new jhq(carActivityLayoutParams.f, carActivityLayoutParams.l), carActivityLayoutParams.j, carActivityLayoutParams.k, carActivityLayoutParams.e, carActivityLayoutParams.a(), uuid, carActivityLayoutParams.g);
        N();
        jhlVar.L();
    }

    @Override // defpackage.inn
    public final void B(android.graphics.Rect rect) {
        defpackage.ill.d();
        this.F.au(rect);
    }

    @Override // defpackage.inn
    public final boolean G() {
        return this.L;
    }

    public final void M() {
        defpackage.rbr rbrVar = this.G;
        if (rbrVar != null) {
            rbrVar.dismiss();
            this.G = null;
        }
        defpackage.rcw rcwVar = this.K;
        if (rcwVar != null) {
            rcwVar.b();
            this.K = null;
        }
    }

    public final void N() {
        ((defpackage.yqj) J.l().ai((char) 824)).u("Creating fallback presentation");
        defpackage.jkr jkrVar = this.y;
        com.google.android.gms.car.display.CarRegionId carRegionId = this.z;
        defpackage.jhl jhlVar = this.F;
        jkrVar.aa(carRegionId, jhlVar);
        defpackage.ioh iohVar = this.b;
        android.content.Context context = iohVar.d;
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display");
        com.google.android.gms.car.DrawingSpec drawingSpecAN = jhlVar.aN();
        drawingSpecAN.getClass();
        defpackage.rcw rcwVar = new defpackage.rcw(displayManager, context.getPackageName(), drawingSpecAN.a, drawingSpecAN.b, drawingSpecAN.c, 0, drawingSpecAN.d, -1, new iom(this));
        this.K = rcwVar;
        android.view.Display display = rcwVar.a;
        defpackage.rbo rboVarA = defpackage.rbp.a();
        rboVarA.h(false);
        rboVarA.g(defpackage.acyc.ay());
        defpackage.rbr rbrVarH = defpackage.rbr.h(context, display, 0, null, true, rboVarA.a());
        this.G = rbrVarH;
        android.graphics.Rect rect = this.H;
        if (rect != null) {
            rbrVarH.v(rect);
        }
        this.G.getContext().setTheme(O(iohVar.c(carRegionId.h)));
        this.G.setContentView(2131624047);
        ((android.widget.ImageView) this.G.findViewById(2131428178)).setImageResource(2131231825);
        this.G.show();
    }

    @Override // defpackage.inn
    public final defpackage.jhl d() {
        return this.F;
    }

    @Override // defpackage.inn
    public final void l() {
        super.l();
        M();
    }

    @Override // defpackage.inn
    public final void r(android.content.res.Configuration configuration, int i) {
        if (this.G == null || !defpackage.edd.g()) {
            return;
        }
        android.content.Context context = this.G.getContext();
        context.setTheme(O(configuration));
        if (defpackage.acyc.ay()) {
            this.G.w(configuration);
        }
        this.G.findViewById(2131428179).setBackground(this.G.getResources().getDrawable(2131231344, context.getTheme()));
        ((android.widget.TextView) this.G.findViewById(2131428177)).setTextColor(defpackage.sqs.bR(context, android.R.attr.textColorPrimary));
        ((android.widget.ImageView) this.G.findViewById(2131428178)).setImageTintList(context.getColorStateList(2131100420));
    }

    @Override // defpackage.inn
    public final void s(defpackage.inn innVar) {
        super.s(innVar);
        this.b.u(this);
    }

    @Override // defpackage.inn
    public final void t() {
        ((defpackage.inh) this.y).ak(this.F, 0);
    }

    @Override // defpackage.inn
    public final void u() {
        super.u();
        M();
        this.L = false;
    }

    @Override // defpackage.inn
    public final void w(defpackage.ioa ioaVar) {
        super.w(ioaVar);
        android.graphics.Rect rect = ioaVar.a.k;
        if (rect != null && this.H == null) {
            this.H = rect;
        }
        defpackage.jhl jhlVar = this.F;
        if (jhlVar.aN() != null && this.G == null) {
            N();
        } else if (jhlVar.aF()) {
            ((defpackage.inh) this.y).ak(jhlVar, 0);
        }
        defpackage.ioh iohVar = this.b;
        iohVar.z(this);
        iohVar.w(this);
    }

    @Override // defpackage.inn
    public final void y(defpackage.inn innVar) {
        super.y(innVar);
        this.L = true;
        defpackage.ioh iohVar = this.b;
        iohVar.u(this);
        ((defpackage.inh) this.y).R(this.F, null, null, true, true, false, null);
        iohVar.A(this);
        if (innVar != null) {
            iohVar.av(this, null);
        }
    }
}
