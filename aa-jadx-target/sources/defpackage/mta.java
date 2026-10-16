package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class mta implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mta(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v9, types: [eqg, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws afbj {
        int i = 8;
        int i2 = 20;
        int i3 = 1;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                java.lang.Object obj = this.a;
                try {
                    ((defpackage.mtc) obj).b().b.eM(((android.support.v4.app.Fragment) obj).getViewLifecycleOwner(), new defpackage.mel(new defpackage.mtb(obj, i3), 6));
                } catch (java.lang.IllegalStateException unused) {
                    return;
                }
                break;
            case 1:
                java.lang.Object obj2 = this.a;
                defpackage.ocn ocnVarA = defpackage.ocn.a();
                android.content.Context context = ((defpackage.msg) obj2).d;
                ocnVarA.c(context, new android.content.ComponentName(context, (java.lang.Class<?>) defpackage.msg.class), 2132083788, 1);
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.muc.b.l().u("onDragStarted()");
                ((defpackage.muc) this.a).d.m(java.lang.Boolean.TRUE);
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ?? r11 = this.a;
                if (!((android.support.v4.app.Fragment) r11).isAdded()) {
                    ((defpackage.yqj) njv.b.h()).u("Trying to set up hotseat and widget while not added");
                } else {
                    defpackage.eqp eqpVar = defpackage.lmp.a.a().e() ? ((defpackage.non) ((njv) r11).q.a()).k : ((defpackage.nnl) ((njv) r11).p.a()).a;
                    eqpVar.getClass();
                    defpackage.tcu.j(defpackage.ebo.e(eqpVar), new defpackage.ncv(2)).eM(r11, new defpackage.mel(new defpackage.njt(r11, 7), 20));
                }
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.afja[] afjaVarArr = njv.a;
                ((android.view.View) this.a).setAlpha(0.67f);
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                java.lang.Object obj3 = this.a;
                com.google.android.apps.auto.components.system.facetbar.hotseat.RailHotseatItemView railHotseatItemView = (com.google.android.apps.auto.components.system.facetbar.hotseat.RailHotseatItemView) obj3;
                defpackage.nne nneVar = railHotseatItemView.d;
                nneVar.getClass();
                railHotseatItemView.e = nneVar;
                defpackage.nne nneVar2 = railHotseatItemView.e;
                if (nneVar2 == null) {
                    defpackage.afga.d("currentHotseatItem");
                    nneVar2 = null;
                }
                defpackage.gjv gjvVar = nneVar2.d;
                if (gjvVar != null) {
                    railHotseatItemView.d(gjvVar);
                } else {
                    hsc.e((android.view.View) obj3).i(railHotseatItemView.h);
                    android.widget.ImageView imageView = railHotseatItemView.c;
                    defpackage.nne nneVar3 = railHotseatItemView.e;
                    if (nneVar3 == null) {
                        defpackage.afga.d("currentHotseatItem");
                        nneVar3 = null;
                    }
                    defpackage.nne nneVar4 = railHotseatItemView.e;
                    if (nneVar4 == null) {
                        defpackage.afga.d("currentHotseatItem");
                        nneVar4 = null;
                    }
                    railHotseatItemView.b(imageView, nneVar3.a, nneVar4.e);
                }
                defpackage.nne nneVar5 = railHotseatItemView.e;
                if (nneVar5 == null) {
                    defpackage.afga.d("currentHotseatItem");
                    nneVar5 = null;
                }
                com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = nneVar5.c;
                if (ghIcon != null) {
                    android.widget.ImageView imageView2 = railHotseatItemView.b;
                    defpackage.lgo.d(imageView2, ghIcon, true, true, false);
                    imageView2.setVisibility(0);
                } else {
                    railHotseatItemView.b.setVisibility(8);
                }
                android.widget.ImageView imageView3 = railHotseatItemView.c;
                imageView3.setOnTouchListener(new jzx(obj3, 6, (byte[]) null));
                imageView3.setOnClickListener(new njs(obj3, 6));
                defpackage.ypu ypuVarL = com.google.android.apps.auto.components.system.facetbar.hotseat.RailHotseatItemView.a.l();
                defpackage.nne nneVar6 = railHotseatItemView.e;
                if (nneVar6 == null) {
                    defpackage.afga.d("currentHotseatItem");
                    nneVar6 = null;
                }
                ypuVarL.M("Successfully set %s as an app for %s", nneVar6, railHotseatItemView.f);
                railHotseatItemView.d = null;
                com.google.android.apps.auto.components.system.facetbar.hotseat.RailHotseatItemView.f(imageView3, 1.0f, 1.0f, new android.view.animation.DecelerateInterpolator(), new defpackage.img(14));
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView railWidgetView = (com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView) this.a;
                railWidgetView.h = false;
                defpackage.nod nodVar = railWidgetView.i;
                if (nodVar != null) {
                    railWidgetView.i = null;
                    railWidgetView.b(nodVar);
                }
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView) this.a).e.animate().alpha(0.0f).setDuration(com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView.b.toMillis() / 2).start();
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView railWidgetView2 = (com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView) this.a;
                railWidgetView2.setVisibility(4);
                railWidgetView2.e.setAlpha(1.0f);
                railWidgetView2.h = false;
                defpackage.nod nodVar2 = railWidgetView2.i;
                if (nodVar2 != null) {
                    railWidgetView2.i = null;
                    railWidgetView2.b(nodVar2);
                }
                break;
            case 9:
                com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView railWidgetView3 = (com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView) this.a;
                railWidgetView3.g = false;
                railWidgetView3.setVisibility(4);
                railWidgetView3.c();
                break;
            case 10:
                java.lang.Object obj4 = this.a;
                nro nroVar = (nro) obj4;
                nri nriVarF = nroVar.f();
                if (nriVarF != null) {
                    nriVarF.e(new defpackage.npq(obj4, i));
                }
                nri nriVarE = nroVar.e();
                if (nriVarE != null) {
                    nriVarE.e(new defpackage.npq(obj4, 9));
                }
                break;
            case 11:
                ((defpackage.yqj) nsl.a.l().ai((char) 5354)).u("Showing irregular activity scrim because notification center opened");
                ((nsl) this.a).g(false);
                break;
            case 12:
                ((defpackage.yqj) nsl.a.l().ai((char) 5355)).u("Hiding irregular activity scrim because notification center closed");
                ((nsl) this.a).d();
                break;
            case 13:
                defpackage.nua nuaVar = ((defpackage.ntz) this.a).a;
                nuaVar.i = null;
                nuaVar.j = false;
                nuaVar.k = false;
                nuaVar.a();
                break;
            case 14:
                int i4 = defpackage.ntz.b;
                ((defpackage.nua) this.a).a();
                break;
            case 15:
                defpackage.nwi nwiVar = (defpackage.nwi) this.a;
                defpackage.ebo.n().I(nwiVar.c);
                nwiVar.b.post(nwiVar.d);
                nwiVar.d = new defpackage.img(i2);
                break;
            case 16:
                ((defpackage.nwi) this.a).c();
                break;
            case 17:
                defpackage.nwz nwzVar = (defpackage.nwz) this.a;
                nwzVar.c = false;
                defpackage.noz nozVar = nwzVar.a;
                if (nozVar != null) {
                    nozVar.d();
                    nwzVar.a = null;
                    if (nwzVar.b) {
                        nwzVar.k = null;
                        nwzVar.b = false;
                    }
                    if (!nwzVar.j.equals(defpackage.nxh.a)) {
                        nwzVar.b();
                    }
                    break;
                }
                break;
            case 18:
                ((defpackage.yqj) defpackage.nxa.f.l().ai((char) 5523)).u("onViewAnimateOutComplete");
                if (defpackage.ler.c().fY()) {
                    defpackage.nxa nxaVar = (defpackage.nxa) this.a;
                    nxaVar.i = false;
                    nxaVar.k();
                    break;
                }
                break;
            case 19:
                ((defpackage.nxa) this.a).i();
                break;
            default:
                java.lang.Object obj5 = this.a;
                defpackage.yqm yqmVar = defpackage.nxa.f;
                defpackage.nxh nxhVar = (defpackage.nxh) obj5;
                defpackage.mcl.C(nxhVar, defpackage.zbd.oe);
                nxhVar.g.run();
                break;
        }
    }
}
