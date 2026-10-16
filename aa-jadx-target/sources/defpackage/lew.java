package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class lew extends defpackage.ep {
    protected com.google.android.gms.car.libs.cakewalk.bottomsheets.BottomSheetView m;

    protected final void A() {
        setTheme(2132148670);
        setTheme(2132148670);
        setContentView(2131624045);
        this.m = findViewById(2131427607);
        getLayoutInflater().inflate(2131624131, (android.view.ViewGroup) this.m, true);
        this.m.b(getWindowManager().getDefaultDisplay(), new lev(this), findViewById(2131427611));
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
