package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class juj implements defpackage.eap {
    private final /* synthetic */ int a;

    public /* synthetic */ juj(int i) {
        this.a = i;
    }

    @Override // defpackage.eap
    public final defpackage.edf a(android.view.View view, defpackage.edf edfVar) {
        int i = this.a;
        if (i == 0) {
            int i2 = defpackage.juk.m;
            view.setPadding(edfVar.b(), view.getPaddingTop(), edfVar.c(), view.getPaddingBottom());
            return edfVar;
        }
        if (i == 1) {
            int i3 = androidx.drawerlayout.widget.DrawerLayout.j;
            androidx.drawerlayout.widget.DrawerLayout drawerLayout = (androidx.drawerlayout.widget.DrawerLayout) view;
            int i4 = edfVar.i().c;
            drawerLayout.h = edfVar;
            boolean z = i4 > 0;
            drawerLayout.i = z;
            drawerLayout.setWillNotDraw(!z && drawerLayout.getBackground() == null);
            drawerLayout.requestLayout();
            return edfVar.n();
        }
        if (i == 2) {
            view.setPadding(edfVar.f(519).b, view.getPaddingTop(), edfVar.f(519).d, view.getPaddingBottom());
            return edfVar;
        }
        if (i != 3) {
            defpackage.dvl dvlVarF = edfVar.f(647);
            view.setPadding(dvlVarF.b, dvlVarF.c, dvlVarF.d, dvlVarF.e);
            return defpackage.edf.a;
        }
        int i5 = com.google.android.gms.carsetup.SetupActivityImpl.n;
        defpackage.dvl dvlVarF2 = edfVar.f(519);
        view.setPadding(dvlVarF2.b, dvlVarF2.c, dvlVarF2.d, dvlVarF2.e);
        return defpackage.edf.a;
    }
}
