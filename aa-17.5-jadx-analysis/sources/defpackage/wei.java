package defpackage;

import android.os.Build;
import android.support.v7.widget.Toolbar;
import android.view.View;

/* loaded from: classes3.dex */
public final /* synthetic */ class wei implements eaj {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    private final /* synthetic */ int f;

    public wei(int i, View view, int i2, int i3, int i4, int i5) {
        this.f = i5;
        this.b = i;
        this.a = view;
        this.c = i2;
        this.e = i3;
        this.d = i4;
    }

    @Override // defpackage.eaj
    public final ecy a(View view, ecy ecyVar) {
        int i = this.f;
        if (i == 0) {
            dve dveVarF = ecyVar.f(519);
            this.a.setPadding(this.b + dveVarF.b, this.c + dveVarF.c, this.d + dveVarF.d, this.e + dveVarF.e);
            return ecyVar;
        }
        if (i == 1) {
            dve dveVarF2 = ecyVar.f(519);
            int i2 = dveVarF2.b;
            int i3 = dveVarF2.c;
            int i4 = dveVarF2.d;
            ((Toolbar) this.a).setPadding(this.b + i2, this.c + i3, this.d + i4, this.e);
            ecm eclVar = Build.VERSION.SDK_INT >= 36 ? new ecl(ecyVar) : Build.VERSION.SDK_INT >= 35 ? new eck(ecyVar) : Build.VERSION.SDK_INT >= 34 ? new ecj(ecyVar) : Build.VERSION.SDK_INT >= 31 ? new eci(ecyVar) : Build.VERSION.SDK_INT >= 30 ? new ech(ecyVar) : Build.VERSION.SDK_INT >= 29 ? new ecg(ecyVar) : new ecf(ecyVar);
            eclVar.g(519, dve.e(i2, 0, i4, dveVarF2.e));
            return eclVar.a();
        }
        dve dveVarF3 = ecyVar.f(519);
        int i5 = this.b;
        if (i5 >= 0) {
            View view2 = this.a;
            view2.getLayoutParams().height = i5 + dveVarF3.c;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = this.a;
        view3.setPadding(this.c + dveVarF3.b, this.e + dveVarF3.c, this.d + dveVarF3.d, view3.getPaddingBottom());
        return ecyVar;
    }

    public /* synthetic */ wei(View view, int i, int i2, int i3, int i4, int i5) {
        this.f = i5;
        this.a = view;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }
}
