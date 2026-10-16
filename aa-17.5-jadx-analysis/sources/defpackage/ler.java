package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.car.libs.cakewalk.bottomsheets.BottomSheetView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public class ler extends ep {
    protected BottomSheetView m;

    protected final void A() {
        setTheme(R.style.BottomSheetTheme);
        setTheme(R.style.BottomSheetTheme);
        setContentView(R.layout.car_bottom_sheet_fragment);
        this.m = (BottomSheetView) findViewById(R.id.bottom_sheet);
        getLayoutInflater().inflate(R.layout.deep_link_bottom_sheet, (ViewGroup) this.m, true);
        this.m.b(getWindowManager().getDefaultDisplay(), new leq(this), findViewById(R.id.bottom_sheet_fragment_background));
        this.m.a(true);
        if (Build.VERSION.SDK_INT >= 29) {
            ols.d(this.m);
        }
    }

    @Override // defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ols.c(getWindow(), null);
    }
}
