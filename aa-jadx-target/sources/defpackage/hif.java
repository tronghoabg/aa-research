package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class hif implements java.lang.Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ hif(int i, nvh nvhVar, int i2) {
        this.c = i2;
        this.a = i;
        this.b = nvhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v47, types: [java.lang.Object, pax] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, jde] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, jde] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, jde] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 2;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                int i2 = this.a;
                java.lang.Object obj = this.b;
                ((hig) obj).a.n("dismissAlert", new defpackage.hif(obj, i2, i));
                return;
            case 1:
                ((defpackage.ebl) this.b).a(this.a);
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                gdr gdrVarL = ((hig) this.b).a.a.l(gdr.class);
                gdrVarL.getClass();
                gdrVarL.d(this.a);
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.isc) this.b).a.l().l(10, java.util.concurrent.TimeUnit.SECONDS)).ai(1252)).w("frame sent outside session. size: %d", this.a);
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                this.b.a(this.a);
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                this.b.a(this.a);
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                this.b.b(this.a);
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.jqb jqbVar = ((defpackage.jqa) this.b).a;
                int i3 = this.a;
                java.util.Set set = jqbVar.d;
                synchronized (set) {
                    java.util.Iterator it = set.iterator();
                    while (it.hasNext()) {
                        defpackage.qxc qxcVar = (defpackage.qxc) it.next();
                        try {
                            qxcVar.b(i3);
                        } catch (android.os.RemoteException unused) {
                            ((defpackage.yqj) ((defpackage.yqj) defpackage.jqb.a.f()).ai(2585)).y("RemoteException notifying listener %s onConnected.", new defpackage.zkf(defpackage.zke.a, qxcVar));
                            it.remove();
                        }
                    }
                    break;
                }
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.jqb jqbVar2 = ((defpackage.jqa) this.b).a;
                jqbVar2.i.set(-1, false);
                int i4 = this.a;
                java.util.Set set2 = jqbVar2.d;
                synchronized (set2) {
                    java.util.Iterator it2 = set2.iterator();
                    while (it2.hasNext()) {
                        defpackage.qxc qxcVar2 = (defpackage.qxc) it2.next();
                        try {
                            qxcVar2.a(i4);
                        } catch (android.os.RemoteException unused2) {
                            ((defpackage.yqj) ((defpackage.yqj) defpackage.jqb.a.f()).ai(2584)).y("RemoteException notifying listener %s onCarConnectionFailure.", new defpackage.zkf(defpackage.zke.a, qxcVar2));
                            it2.remove();
                        }
                    }
                    break;
                }
                return;
            case 9:
                defpackage.nuz.b().g("APPHOST", this.a, ((jys) this.b).b.getPackageName());
                return;
            case 10:
                com.google.android.apps.auto.sdk.ui.CarLayoutManager carLayoutManager = ((com.google.android.apps.auto.sdk.ui.PagedListView) ((com.google.android.apps.auto.components.apphost.view.widgets.common.RowListView) this.b).c()).g;
                if (carLayoutManager.i) {
                    carLayoutManager.a = true;
                    carLayoutManager.O();
                }
                carLayoutManager.Q(this.a, oxx.b);
                return;
            case 11:
                ((defpackage.kzk) this.b).b(this.a);
                return;
            case 12:
                int i5 = this.a;
                defpackage.liu liuVar = (defpackage.liu) this.b;
                liuVar.j = i5;
                liuVar.a();
                return;
            case 13:
                int i6 = defpackage.mbg.a;
                defpackage.nuz.b().j("AlarmNotificationHandler", this.a, (nvh) this.b);
                return;
            case 14:
                if (defpackage.ler.c().g()) {
                    int i7 = this.a;
                    defpackage.muc mucVar = (defpackage.muc) this.b;
                    mucVar.d.m(java.lang.Boolean.FALSE);
                    defpackage.yqm yqmVar = defpackage.muc.b;
                    yqmVar.l().w("onDragEnded(%s)", i7);
                    mua muaVarD = mucVar.d();
                    if (muaVarD.b == null) {
                        ((defpackage.yqj) yqmVar.f()).u("onDragEnded after shade finished");
                        return;
                    }
                    int i8 = muaVarD.h;
                    if (i7 > i8) {
                        muaVarD.i = true;
                    } else if (i7 < i8) {
                        muaVarD.i = false;
                    }
                    muaVarD.h = i7;
                    muaVarD.c(i7);
                    defpackage.nth nthVarL = muaVarD.a.l();
                    defpackage.ygw ygwVar = nthVarL != null ? nthVarL.e : null;
                    mucVar.e.m(java.lang.Boolean.valueOf(ygwVar != null && i7 == defpackage.afga.ab(ygwVar)));
                    if (ygwVar != null) {
                        mty.a.a().c(((java.lang.Integer) ygwVar.get(i7)).intValue());
                    }
                    if (i7 == 0) {
                        if (!muaVarD.g) {
                            yqmVar.l().u("Dashboard collapsed by drag, already closed");
                            return;
                        }
                        ((defpackage.yqj) yqmVar.f()).u("Dashboard collapsed by drag");
                        muaVarD.g = false;
                        muaVarD.b(defpackage.mui.b);
                        return;
                    }
                    if (i7 > 0) {
                        if (muaVarD.g) {
                            yqmVar.l().w("Dashboard expanded by drag to %s, already expanded", i7);
                            return;
                        }
                        ((defpackage.yqj) yqmVar.f()).u("Dashboard expanded by drag");
                        muaVarD.d = true;
                        muaVarD.g = true;
                        muaVarD.b(defpackage.mui.a);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                com.google.android.apps.auto.components.ui.media.MediaPlaybackView mediaPlaybackView = (com.google.android.apps.auto.components.ui.media.MediaPlaybackView) this.b;
                boolean z = mediaPlaybackView.c;
                int i9 = this.a;
                if (z) {
                    defpackage.ksb ksbVarA = defpackage.kru.a(i9);
                    defpackage.kry kryVar = defpackage.kry.w;
                    mediaPlaybackView.d(kryVar.a(mediaPlaybackView.getContext(), ksbVarA), defpackage.kry.D.a(mediaPlaybackView.getContext(), ksbVarA), defpackage.kry.q.a(mediaPlaybackView.getContext(), ksbVarA), defpackage.kry.s.a(mediaPlaybackView.getContext(), ksbVarA), defpackage.kry.v.a(mediaPlaybackView.getContext(), ksbVarA), kryVar.a(mediaPlaybackView.getContext(), ksbVarA), defpackage.kry.o.a(mediaPlaybackView.getContext(), ksbVarA));
                }
                mediaPlaybackView.b(i9);
                return;
            case 16:
                int i10 = ozx.g;
                if (defpackage.adax.aX()) {
                    return;
                }
                ((ozy) this.b).j.remove(java.lang.Integer.valueOf(this.a));
                return;
            case 17:
                ((defpackage.pcg) this.b).a.h.c(defpackage.pbd.a(this.a), android.os.Bundle.EMPTY);
                return;
            case 18:
                this.b.f(this.a);
                return;
            case 19:
                int i11 = this.a;
                boolean z2 = (i11 & 4) == 0 && (i11 & 1) == 0;
                int i12 = i11 & 6;
                defpackage.mpp mppVarE = defpackage.mpr.e();
                mppVarE.f(z2);
                mppVarE.o();
                java.lang.Object obj2 = this.b;
                mppVarE.n();
                defpackage.nte nteVarC = defpackage.nte.c();
                com.google.android.gms.car.display.CarRegionId carRegionId = ((defpackage.raw) obj2).a;
                if (nteVarC.a(carRegionId.h).k(carRegionId) == defpackage.nta.d) {
                    mppVarE.i(i12 == 0);
                    return;
                }
                return;
            default:
                com.google.android.gearhead.appdecor.CarUiEntry.-$$Nest$fgetsearchController(((qgk) this.b).a).p((this.a & 2) == 0);
                return;
        }
    }

    public hif(defpackage.ebl eblVar, int i, int i2) {
        this.c = i2;
        this.b = eblVar;
        this.a = i;
    }

    public /* synthetic */ hif(java.lang.Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    public hif(defpackage.jqa jqaVar, int i, int i2) {
        this.c = i2;
        this.a = i;
        this.b = jqaVar;
    }
}
