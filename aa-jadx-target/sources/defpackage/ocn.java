package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ocn implements defpackage.ocp {
    public static final /* synthetic */ int b = 0;
    private static final defpackage.yqm c = defpackage.yqm.c("GH.ToastController");
    private java.lang.Runnable e;
    private defpackage.noz d = null;
    private final android.os.Handler f = new android.os.Handler(android.os.Looper.getMainLooper());
    public final java.util.Map a = new java.util.LinkedHashMap();
    private final java.lang.Runnable g = new defpackage.jpa(this, 17, null);

    public ocn() {
        ((defpackage.lht) defpackage.mkp.a.i(defpackage.lht.class)).fV(new defpackage.ocm(this));
    }

    public static defpackage.ocn a() {
        return (defpackage.ocn) defpackage.mkp.a.b(defpackage.ocn.class, new defpackage.lga(13));
    }

    public final void b() {
        defpackage.noz nozVar = this.d;
        if (nozVar == null) {
            defpackage.rox.o("GH.ToastController", "Finishing toast fragment that is already destroyed.", new java.lang.Object[0]);
        } else {
            nozVar.d();
            this.d = null;
        }
    }

    public final void c(android.content.Context context, android.content.ComponentName componentName, int i, int i2) {
        e(context, componentName, context.getText(i), i2, null);
    }

    @Override // defpackage.ocp
    public final void d() {
        if (this.d != null) {
            android.os.Handler handler = this.f;
            handler.removeCallbacks(this.g);
            java.lang.Runnable runnable = this.e;
            if (runnable != null) {
                handler.removeCallbacks(runnable);
            }
            b();
        }
    }

    public final void e(android.content.Context context, android.content.ComponentName componentName, java.lang.CharSequence charSequence, int i, defpackage.nta ntaVar) {
        int i2;
        int dimension;
        if (!defpackage.jrj.a()) {
            android.widget.Toast.makeText(context, charSequence, i).show();
            return;
        }
        if (!defpackage.ler.c().fY()) {
            ((defpackage.yqj) ((defpackage.yqj) c.h()).ai((char) 5576)).u("Can't show the toast as lifetime not yet started.");
            return;
        }
        if (defpackage.kmv.b(defpackage.actz.n(), componentName)) {
            if (!componentName.getPackageName().equals("com.google.android.projection.gearhead")) {
                java.util.Map map = this.a;
                if (!map.containsKey(componentName)) {
                    map.put(componentName, new java.util.ArrayDeque());
                }
                defpackage.ojm.a();
                j$.time.Instant instantNow = j$.time.Instant.now();
                if (((java.util.Queue) map.get(componentName)).size() < ((int) defpackage.actz.g())) {
                    ((java.util.Queue) map.get(componentName)).add(instantNow);
                } else {
                    j$.time.Instant instant = (j$.time.Instant) ((java.util.Queue) map.get(componentName)).peek();
                    instant.getClass();
                    if (j$.time.Duration.between(instant, instantNow).toMillis() > defpackage.actz.h()) {
                        ((java.util.Queue) map.get(componentName)).remove();
                        ((java.util.Queue) map.get(componentName)).add(instantNow);
                    }
                }
            }
            try {
                ocq ocqVarA = ocq.a(charSequence);
                try {
                    defpackage.oim oimVarU = defpackage.omf.u();
                    defpackage.yzd yzdVar = defpackage.yzd.GEARHEAD;
                    defpackage.zbe zbeVar = defpackage.zbe.TOAST_CONTEXT;
                    defpackage.rrv rrvVarH = defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.nQ);
                    rrvVarH.p(componentName);
                    oimVarU.F(rrvVarH.l());
                    if (this.d != null) {
                        defpackage.oim oimVarU2 = defpackage.omf.u();
                        defpackage.rrv rrvVarH2 = defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.nR);
                        rrvVarH2.p(componentName);
                        oimVarU2.F(rrvVarH2.l());
                    }
                    d();
                    defpackage.qsh qshVarE = defpackage.kit.b().e();
                    android.content.Context context2 = defpackage.mkp.a.c;
                    android.content.res.Configuration configuration = new android.content.res.Configuration(context2.getResources().getConfiguration());
                    configuration.densityDpi = ((java.lang.Integer) defpackage.kgu.c(new defpackage.kjf(qshVarE, 7), "GH.ToastFragment", zbeVar, defpackage.zbd.nV, true, "Car no longer connected.", new java.lang.Object[0])).intValue();
                    defpackage.pl plVarP = defpackage.ebo.p(context2.createConfigurationContext(configuration));
                    android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(plVarP);
                    defpackage.lem.a();
                    android.widget.TextView textView = (android.widget.TextView) layoutInflaterFrom.inflate(2131624675, (android.view.ViewGroup) null).findViewById(2131429783);
                    textView.setText(ocqVarA.requireArguments().getCharSequence("toast_text_key"));
                    defpackage.mkp.a.g();
                    defpackage.sax saxVarV = defpackage.oml.v(qshVarE, com.google.android.gms.car.display.CarDisplayId.a);
                    saxVarV.getClass();
                    com.google.android.gms.car.display.CarDisplay carDisplay = (com.google.android.gms.car.display.CarDisplay) defpackage.kgu.c(new defpackage.kjf(saxVarV, 6), "GH.ToastFragment", zbeVar, defpackage.zbd.nU, true, "Car no longer connected.", new java.lang.Object[0]);
                    android.graphics.Point point = carDisplay.d;
                    point.getClass();
                    android.util.Size size = new android.util.Size(point.x, point.y);
                    android.graphics.Rect rectA = carDisplay.a();
                    java.util.List listB = carDisplay.b();
                    if (listB != null && !listB.isEmpty()) {
                        android.graphics.Rect rect = (android.graphics.Rect) listB.get(0);
                        rectA = rect.left == 0 ? new android.graphics.Rect(rect.right, rectA.top, rectA.right, rectA.bottom) : new android.graphics.Rect(rectA.left, rectA.top, rect.right - rect.left, rectA.bottom);
                    }
                    android.graphics.Rect rectH = ntaVar == null ? null : defpackage.nte.c().b().h(ntaVar);
                    int width = rectH == null ? (size.getWidth() - rectA.left) - rectA.right : rectH.width();
                    int dimension2 = (int) plVarP.a().getDimension(2131166322);
                    int i3 = width - (dimension2 + dimension2);
                    int dimension3 = (int) plVarP.a().getDimension(2131166323);
                    if (i3 > dimension3) {
                        i3 = dimension3;
                    }
                    textView.measure(android.view.View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec((int) plVarP.a().getDimension(2131166316), Integer.MIN_VALUE));
                    android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    layoutParams.getClass();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                    int measuredWidth = textView.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                    int measuredHeight = textView.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    if (rectH == null) {
                        i2 = ((width - measuredWidth) / 2) + rectA.left;
                        dimension = rectA.bottom + ((int) plVarP.a().getDimension(2131166313));
                    } else {
                        i2 = ((rectH.left + rectH.right) - measuredWidth) / 2;
                        dimension = ((int) plVarP.a().getDimension(2131166317)) + (size.getHeight() - rectH.bottom);
                    }
                    int width2 = (size.getWidth() - measuredWidth) - i2;
                    int height = (size.getHeight() - measuredHeight) - dimension;
                    defpackage.qts qtsVar = new defpackage.qts(measuredWidth, measuredHeight, defpackage.nte.c().a(saxVarV.c).v());
                    qtsVar.a = i2;
                    qtsVar.c = width2;
                    qtsVar.d = dimension;
                    qtsVar.b = height;
                    qtsVar.g = 491;
                    qtsVar.l = true;
                    qtsVar.b(android.R.anim.fade_in);
                    qtsVar.c(android.R.anim.fade_out);
                    qtsVar.m = 64;
                    defpackage.noy noyVarB = defpackage.nsu.b(qtsVar.a(), "com.google.android.projection.gearhead/GhToast", ocqVarA, defpackage.ler.c());
                    noyVarB.e = this;
                    this.d = noyVarB.a();
                    this.f.postDelayed(this.g, i == 0 ? 2000 : 3500);
                    return;
                } catch (defpackage.qst | defpackage.qsu e) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) c.h()).p(e)).ai((char) 5577)).u("Unable to show toast.");
                    return;
                }
            } catch (java.lang.IllegalStateException e2) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) c.h()).p(e2)).ai((char) 5574)).u("Unable to show toast.");
                return;
            }
        }
        ((defpackage.yqj) ((defpackage.yqj) c.f()).ai((char) 5578)).y("App blocked from posting toast: %s", componentName);
        ((defpackage.yqj) c.l().ai((char) 5575)).u("Toast suppressed because it exceeds rate of limit posting.");
        defpackage.oim oimVarU3 = defpackage.omf.u();
        defpackage.rrv rrvVarH3 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.TOAST_CONTEXT, defpackage.zbd.nT);
        rrvVarH3.p(componentName);
        oimVarU3.F(rrvVarH3.l());
    }

    public final void f(android.content.Context context, android.content.ComponentName componentName, int i, int i2) {
        g(context, componentName, context.getResources().getText(i), i2);
    }

    public final void g(android.content.Context context, android.content.ComponentName componentName, java.lang.CharSequence charSequence, int i) {
        e(context, componentName, charSequence, i, defpackage.nta.a);
    }

    public final void h(android.content.Context context, android.content.ComponentName componentName, int i) {
        java.lang.Runnable isxVar = new isx(this, context, componentName, i, 6);
        this.e = isxVar;
        this.f.postDelayed(isxVar, 1000L);
    }
}
