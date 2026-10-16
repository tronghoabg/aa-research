package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ag implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ag(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        defpackage.dwh dwhVar;
        java.lang.Object systemService;
        android.content.Context contextA;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                cd.b((java.util.List) this.a, 4);
                break;
            case 1:
                if (defpackage.bt.ac(2)) {
                    android.util.Log.v("FragmentManager", "Transition for all operations has completed");
                }
                java.lang.Object obj = this.a;
                java.util.Iterator it = ((ai) obj).a.iterator();
                while (it.hasNext()) {
                    ((ad) ((aj) it.next())).a.f((cn) obj);
                }
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.afer aferVar = (defpackage.afer) ((defpackage.afgv) this.a).a;
                if (aferVar != null) {
                    aferVar.invoke();
                }
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((android.support.v4.app.Fragment) this.a).m11lambda$performDestroyView$18$androidsupportv4appFragment();
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((android.support.v4.app.Fragment) this.a).onDestroyView();
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((android.support.v4.app.Fragment) this.a).m19lambda$performStop$16$androidsupportv4appFragment();
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((android.support.v4.app.Fragment) this.a).m20lambda$performStop$17$androidsupportv4appFragment();
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((android.support.v4.app.Fragment) this.a).onStop();
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((android.support.v4.app.Fragment) this.a).onDetach();
                break;
            case 9:
                ((android.support.v4.app.Fragment) this.a).m12lambda$performPause$14$androidsupportv4appFragment();
                break;
            case 10:
                ((android.support.v4.app.Fragment) this.a).m13lambda$performPause$15$androidsupportv4appFragment();
                break;
            case 11:
                ((android.support.v4.app.Fragment) this.a).onPause();
                break;
            case 12:
                ((android.support.v4.app.Fragment) this.a).m10lambda$performDestroy$19$androidsupportv4appFragment();
                break;
            case 13:
                ((android.support.v4.app.Fragment) this.a).onDestroy();
                break;
            case 14:
                ((android.support.v4.app.Fragment) this.a).callStartTransitionListener(false);
                break;
            case 15:
                defpackage.cq cqVar = (defpackage.cq) this.a;
                if (!cqVar.b.isEmpty()) {
                    cqVar.e();
                }
                break;
            case 16:
                java.util.ArrayList arrayList = ((defpackage.bt) this.a).j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                }
                break;
            case 17:
                int i2 = defpackage.er.b;
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    android.content.Context context = (android.content.Context) this.a;
                    android.content.ComponentName componentName = new android.content.ComponentName(context, "android.support.v7.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (android.os.Build.VERSION.SDK_INT >= 33) {
                            defpackage.ze zeVar = new defpackage.ze(defpackage.er.f);
                            while (true) {
                                if (zeVar.hasNext()) {
                                    defpackage.er erVar = (defpackage.er) ((java.lang.ref.WeakReference) zeVar.next()).get();
                                    if (erVar != null && (contextA = erVar.a()) != null) {
                                        systemService = contextA.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            if (systemService != null) {
                                dwhVar = new defpackage.dwh(new defpackage.dwi(ag$.ExternalSyntheticApiModelOutline0.m(ag$.ExternalSyntheticApiModelOutline0.m(systemService))));
                            } else {
                                dwhVar = defpackage.dwh.a;
                            }
                        } else {
                            dwhVar = defpackage.er.c;
                            if (dwhVar == null) {
                                dwhVar = defpackage.dwh.a;
                            }
                        }
                        if (dwhVar.f()) {
                            java.lang.String strA = dsu.a(context);
                            java.lang.Object systemService2 = context.getSystemService("locale");
                            if (systemService2 != null) {
                                ag$.ExternalSyntheticApiModelOutline0.m(ag$.ExternalSyntheticApiModelOutline0.m(systemService2), a$.ExternalSyntheticApiModelOutline2.m(strA));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                defpackage.er.e = true;
                break;
            case 18:
                defpackage.ff ffVar = (defpackage.ff) this.a;
                ffVar.s.showAtLocation(ffVar.r, 55, 0, 0);
                ffVar.G();
                if (ffVar.O()) {
                    ffVar.r.setAlpha(0.0f);
                    defpackage.erh erhVarU = defpackage.ebt.u(ffVar.r);
                    erhVarU.E(1.0f);
                    ffVar.J = erhVarU;
                    ffVar.J.G(new et(this));
                } else {
                    ffVar.r.setAlpha(1.0f);
                    ffVar.r.setVisibility(0);
                }
                break;
            case 19:
                android.support.v7.widget.ActionBarOverlayLayout actionBarOverlayLayout = (android.support.v7.widget.ActionBarOverlayLayout) this.a;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.i = actionBarOverlayLayout.c.animate().translationY(0.0f).setListener(actionBarOverlayLayout.j);
                break;
            default:
                android.support.v7.widget.ActionBarOverlayLayout actionBarOverlayLayout2 = (android.support.v7.widget.ActionBarOverlayLayout) this.a;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.i = actionBarOverlayLayout2.c.animate().translationY(-actionBarOverlayLayout2.c.getHeight()).setListener(actionBarOverlayLayout2.j);
                break;
        }
    }

    public ag(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
