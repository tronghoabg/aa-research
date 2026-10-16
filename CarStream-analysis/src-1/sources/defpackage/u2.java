package defpackage;

import android.graphics.Bitmap;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.phone.ActivateActivity;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class u2 implements ub, y5 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ Object c;

    public u2(ActivateActivity activateActivity, String str, i iVar) {
        this.a = activateActivity;
        this.b = str;
        this.c = iVar;
    }

    @Override // defpackage.ub
    public void a(Bitmap bitmap) {
        if (bitmap != null) {
            ((y4) this.a).h = bitmap;
            ((CarScreen) this.c).home.c((ArrayList) this.b);
        }
    }

    @Override // defpackage.y5
    public void c(z5 z5Var) {
        if (z5Var.a) {
            xc.p((ActivateActivity) this.a, "licenseKey", ((String) this.b).trim());
        }
        ((i) this.c).c(z5Var);
    }

    public u2(CarScreen carScreen, y4 y4Var, ArrayList arrayList) {
        this.c = carScreen;
        this.a = y4Var;
        this.b = arrayList;
    }
}
