package defpackage;

import android.content.ComponentName;
import android.os.RemoteException;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes2.dex */
public final class qhf extends owb {
    private static final yph b = yph.c("ADU.ToastController");
    public qtu a;
    private final CarRegionId c;

    public qhf(CarRegionId carRegionId) {
        this.c = carRegionId;
    }

    @Override // defpackage.owc
    public final void e(CharSequence charSequence, int i) {
        f(charSequence, i, null);
    }

    @Override // defpackage.owc
    public final void f(CharSequence charSequence, int i, ComponentName componentName) {
        qtu qtuVar = this.a;
        if (qtuVar == null) {
            ((ype) ((ype) b.g()).ai((char) 7250)).u("AppDecorService is not connected. Can't show toasts.");
            return;
        }
        try {
            CarRegionId carRegionId = this.c;
            rab rabVarG = qtuVar.g(carRegionId.h.b, carRegionId.g);
            if (rabVarG == null) {
                ((ype) ((ype) b.g()).ai(7249)).u("No SystemUiService available, unable to show toast");
            } else {
                rabVarG.g(charSequence, i, componentName);
            }
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) b.g()).p(e)).ai((char) 7248)).u("RemoteException while showing toast: ");
        }
    }
}
