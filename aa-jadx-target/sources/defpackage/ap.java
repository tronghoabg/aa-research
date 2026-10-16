package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ap implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ap(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                ((android.support.v4.app.Fragment) this.a).m5lambda$performAttach$2$androidsupportv4appFragment();
                return;
            case 1:
                defpackage.ao aoVar = (defpackage.ao) this.a;
                aoVar.a.onDismiss(aoVar.e);
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((android.support.v4.app.Fragment) this.a).onStart();
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((android.support.v4.app.Fragment) this.a).m18lambda$performStart$9$androidsupportv4appFragment();
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((android.support.v4.app.Fragment) this.a).m17lambda$performStart$10$androidsupportv4appFragment();
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((android.support.v4.app.Fragment) this.a).m8lambda$performCreateView$5$androidsupportv4appFragment();
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((android.support.v4.app.Fragment) this.a).onResume();
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((android.support.v4.app.Fragment) this.a).m14lambda$performResume$11$androidsupportv4appFragment();
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((android.support.v4.app.Fragment) this.a).m15lambda$performResume$12$androidsupportv4appFragment();
                return;
            case 9:
                ((android.support.v4.app.Fragment) this.a).m23lambda$restoreViewState$1$androidsupportv4appFragment();
                return;
            case 10:
                ((android.support.v4.app.Fragment) this.a).m7lambda$performCreate$4$androidsupportv4appFragment();
                return;
            case 11:
                ((android.support.v4.app.Fragment) this.a).startPostponedEnterTransition();
                return;
            case 12:
                ((defpackage.bt) this.a).an(true);
                return;
            case 13:
                defpackage.ff ffVar = (defpackage.ff) this.a;
                if ((ffVar.G & 1) != 0) {
                    ffVar.F(0);
                }
                if ((ffVar.G & 4096) != 0) {
                    ffVar.F(108);
                }
                ffVar.F = false;
                ffVar.G = 0;
                return;
            case 14:
                java.lang.Object obj = this.a;
                android.view.Menu menuV = ((defpackage.fm) obj).v();
                android.view.Menu menu = true != (menuV instanceof defpackage.hh) ? null : menuV;
                if (menu != null) {
                    ((defpackage.hh) menu).s();
                }
                try {
                    menuV.clear();
                    android.view.Window.Callback callback = ((defpackage.fm) obj).a;
                    if (!callback.onCreatePanelMenu(0, menuV) || !callback.onPreparePanel(0, null, menuV)) {
                        menuV.clear();
                    }
                    if (menu != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (menu != null) {
                        ((defpackage.hh) menu).r();
                    }
                }
                break;
            case 15:
                ((android.support.v7.widget.RecyclerView) this.a).t = false;
                return;
            case 16:
                android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) this.a;
                if (!recyclerView.s || recyclerView.isLayoutRequested()) {
                    return;
                }
                if (!recyclerView.q) {
                    recyclerView.requestLayout();
                    return;
                } else if (recyclerView.v) {
                    recyclerView.u = true;
                    return;
                } else {
                    recyclerView.z();
                    return;
                }
            case 17:
                android.support.v7.widget.RecyclerView recyclerView2 = (android.support.v7.widget.RecyclerView) this.a;
                defpackage.lz lzVar = recyclerView2.E;
                if (lzVar != null) {
                    lzVar.e();
                }
                recyclerView2.Q = false;
                return;
            case 18:
                android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) this.a;
                java.util.ArrayList arrayList = toolbar.v;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    toolbar.f().removeItem(((android.view.MenuItem) arrayList.get(i)).getItemId());
                }
                android.view.Menu menuF = toolbar.f();
                java.util.ArrayList arrayListI = toolbar.i();
                toolbar.B.j(menuF, toolbar.g());
                java.util.ArrayList arrayListI2 = toolbar.i();
                arrayListI2.removeAll(arrayListI);
                toolbar.v = arrayListI2;
                return;
            case 19:
                ((android.support.v7.widget.Toolbar) this.a).z();
                return;
            default:
                ((defpackage.od) this.a).invalidateOptionsMenu();
                return;
        }
    }

    public ap(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
