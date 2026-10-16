package defpackage;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.gms.carsetup.SetupActivityImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class onq implements eaj {
    private final /* synthetic */ int a;

    public /* synthetic */ onq(int i) {
        this.a = i;
    }

    @Override // defpackage.eaj
    public final ecy a(View view, ecy ecyVar) {
        int i = this.a;
        if (i == 0) {
            view.setPadding(ecyVar.f(519).b, view.getPaddingTop(), ecyVar.f(519).d, view.getPaddingBottom());
            return ecyVar;
        }
        if (i != 1) {
            if (i != 2) {
                dve dveVarF = ecyVar.f(647);
                view.setPadding(dveVarF.b, dveVarF.c, dveVarF.d, dveVarF.e);
                return ecy.a;
            }
            int i2 = SetupActivityImpl.n;
            dve dveVarF2 = ecyVar.f(519);
            view.setPadding(dveVarF2.b, dveVarF2.c, dveVarF2.d, dveVarF2.e);
            return ecy.a;
        }
        int i3 = DrawerLayout.j;
        DrawerLayout drawerLayout = (DrawerLayout) view;
        int i4 = ecyVar.i().c;
        drawerLayout.h = ecyVar;
        boolean z = i4 > 0;
        drawerLayout.i = z;
        drawerLayout.setWillNotDraw(!z && drawerLayout.getBackground() == null);
        drawerLayout.requestLayout();
        return ecyVar.n();
    }
}
