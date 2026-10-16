package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class lew extends defpackage.ep {
    protected com.google.android.gms.car.libs.cakewalk.bottomsheets.BottomSheetView m;

    protected final void A() {
        setTheme(com.google.android.projection.gearhead.R.style.BottomSheetTheme);
        setTheme(com.google.android.projection.gearhead.R.style.BottomSheetTheme);
        setContentView(com.google.android.projection.gearhead.R.layout.car_bottom_sheet_fragment);
        this.m = (com.google.android.gms.car.libs.cakewalk.bottomsheets.BottomSheetView) findViewById(com.google.android.projection.gearhead.R.id.bottom_sheet);
        getLayoutInflater().inflate(com.google.android.projection.gearhead.R.layout.deep_link_bottom_sheet, (android.view.ViewGroup) this.m, true);
        this.m.b(getWindowManager().getDefaultDisplay(), new defpackage.lev(this), findViewById(com.google.android.projection.gearhead.R.id.bottom_sheet_fragment_background));
        this.m.a(true);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            defpackage.oml.d(this.m);
        }
    }

    @Override // defpackage.bc, defpackage.od, defpackage.cs, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        defpackage.oml.c(getWindow(), null);
    }
}
