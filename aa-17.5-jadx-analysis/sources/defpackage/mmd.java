package defpackage;

import android.support.v4.app.Fragment;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.display.CarDisplayId;

/* loaded from: classes.dex */
public final /* synthetic */ class mmd implements kix {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mmd(CarWindowLayoutParams carWindowLayoutParams, mrv mrvVar, int i) {
        this.c = i;
        this.b = carWindowLayoutParams;
        this.a = mrvVar;
    }

    @Override // defpackage.kix
    public final Object a() {
        int i = this.c;
        if (i == 0) {
            yph yphVar = mme.a;
            mki.a.g();
            return ols.y((qrn) this.a, (String) this.b, "");
        }
        if (i == 1) {
            kzm kzmVar = new kzm();
            nog nogVarB = nsh.b((CarWindowLayoutParams) this.b, "com.google.android.projection.gearhead/AssistantScrim", kzmVar, lbh.d());
            nogVarB.e = this.a;
            nogVarB.f = 643;
            return nogVarB.a();
        }
        if (i != 2) {
            mki.a.g();
            boolean zL = oxu.l(ols.w(kio.b().e(), (CarDisplayId) this.b));
            ((oxu) this.a).b = zL;
            return Boolean.valueOf(zL);
        }
        Object obj = this.a;
        Object obj2 = this.b;
        yph yphVar2 = mry.a;
        return nsh.b((CarWindowLayoutParams) obj2, "ClusterSliver", (Fragment) obj, lbh.d()).a();
    }

    public /* synthetic */ mmd(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
