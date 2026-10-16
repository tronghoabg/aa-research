package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class eef implements defpackage.eap {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ eef(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.eap
    public final defpackage.edf a(android.view.View view, defpackage.edf edfVar) {
        int i = this.b;
        if (i == 0) {
            defpackage.dvl dvlVarA = eej.a(edfVar);
            defpackage.dvl dvlVarC = defpackage.dvl.c(edfVar.g(519), edfVar.g(64));
            eej eejVar = (eej) this.a;
            if (!dvlVarA.equals(eejVar.c) || !dvlVarC.equals(eejVar.d)) {
                eejVar.c = dvlVarA;
                eejVar.d = dvlVarC;
                java.util.ArrayList arrayList = eejVar.b;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((eee) arrayList.get(size)).b();
                }
            }
        } else {
            if (i == 1) {
                androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = (androidx.coordinatorlayout.widget.CoordinatorLayout) this.a;
                if (!j$.util.Objects.equals(coordinatorLayout.e, edfVar)) {
                    coordinatorLayout.e = edfVar;
                    boolean z = edfVar.d() > 0;
                    coordinatorLayout.f = z;
                    coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                    if (!edfVar.y()) {
                        int childCount = coordinatorLayout.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            android.view.View childAt = coordinatorLayout.getChildAt(i2);
                            int[] iArr = defpackage.ebt.a;
                            if (childAt.getFitsSystemWindows() && ((defpackage.dsq) childAt.getLayoutParams()).a != null && edfVar.y()) {
                                break;
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                    return edfVar;
                }
            } else {
                if (i != 2) {
                    if (i != 3) {
                        int i3 = edfVar.f(647).c;
                        com.google.android.material.search.SearchView searchView = (com.google.android.material.search.SearchView) this.a;
                        searchView.g(i3);
                        searchView.d.setVisibility(i3 <= 0 ? 8 : 0);
                        return edfVar;
                    }
                    defpackage.wnb wnbVar = (defpackage.wnb) this.a;
                    defpackage.wna wnaVar = wnbVar.f;
                    if (wnaVar != null) {
                        wnbVar.a.E.remove(wnaVar);
                    }
                    wnbVar.f = new defpackage.wna(wnbVar.b, edfVar);
                    wnbVar.f.d(wnbVar.getWindow());
                    wnbVar.a.C(wnbVar.f);
                    return edfVar;
                }
                com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) this.a;
                defpackage.edf edfVar2 = true != appBarLayout.getFitsSystemWindows() ? null : edfVar;
                if (!j$.util.Objects.equals(appBarLayout.c, edfVar2)) {
                    appBarLayout.c = edfVar2;
                    appBarLayout.k();
                    appBarLayout.requestLayout();
                    return edfVar;
                }
            }
        }
        return edfVar;
    }

    public eef(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
