package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.car.e;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class l3 {
    public final CarScreen a;
    public final e b;
    public View c;
    public s8 d;
    public String e;
    public final c1 f = new c1(this, 2);
    public String g = "";

    public l3(CarScreen carScreen, e eVar) {
        this.a = carScreen;
        this.b = eVar;
    }

    public final View a(cd cdVar) {
        CarScreen carScreen = this.a;
        String strG = xc.g(carScreen, "playerStyle", "pill");
        this.e = strG;
        s8 s8VarE = k1.e(carScreen, strG, cdVar);
        this.d = s8VarE;
        this.c = s8VarE.a(cdVar, this.f);
        if (!this.g.isEmpty()) {
            this.d.e(this.g);
        }
        return this.c;
    }

    public final FrameLayout.LayoutParams b(cd cdVar) {
        if (this.d == null) {
            CarScreen carScreen = this.a;
            this.d = k1.e(carScreen, xc.g(carScreen, "playerStyle", "pill"), cdVar);
        }
        return this.d.b(cdVar);
    }
}
