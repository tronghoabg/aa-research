package defpackage;

import android.support.v4.app.Fragment;
import com.google.android.apps.auto.components.settings.interactivetroubleshooter.ChargeOnlyFragment;
import com.google.android.apps.auto.components.settings.interactivetroubleshooter.ConnectCarFragment;
import com.google.android.apps.auto.components.settings.interactivetroubleshooter.DisableAdbFragment;
import com.google.android.apps.auto.components.settings.interactivetroubleshooter.ErrorPageFragment;
import com.google.android.apps.auto.components.settings.interactivetroubleshooter.ProjectionFragment;
import com.google.android.apps.auto.components.settings.interactivetroubleshooter.UsbConfigFragment;

/* loaded from: classes2.dex */
public final class mlr extends bf {
    private final mlx b;
    private final ohe c;

    public mlr(mlx mlxVar, ohe oheVar) {
        this.b = mlxVar;
        this.c = oheVar;
    }

    @Override // defpackage.bf
    public final Fragment a(ClassLoader classLoader, String str) {
        Class clsC = c(classLoader, str);
        if (clsC == ConnectCarFragment.class) {
            ConnectCarFragment connectCarFragment = new ConnectCarFragment();
            connectCarFragment.h = this.b;
            return connectCarFragment;
        }
        if (clsC == ChargeOnlyFragment.class) {
            ChargeOnlyFragment chargeOnlyFragment = new ChargeOnlyFragment();
            chargeOnlyFragment.k = this.b;
            return chargeOnlyFragment;
        }
        if (clsC == ProjectionFragment.class) {
            ProjectionFragment projectionFragment = new ProjectionFragment();
            projectionFragment.h = this.b;
            return projectionFragment;
        }
        if (clsC == DisableAdbFragment.class) {
            DisableAdbFragment disableAdbFragment = new DisableAdbFragment();
            disableAdbFragment.n = this.b;
            return disableAdbFragment;
        }
        if (clsC == UsbConfigFragment.class) {
            UsbConfigFragment usbConfigFragment = new UsbConfigFragment();
            usbConfigFragment.h = this.b;
            usbConfigFragment.i = this.c;
            return usbConfigFragment;
        }
        if (clsC != ErrorPageFragment.class) {
            return super.a(classLoader, str);
        }
        ErrorPageFragment errorPageFragment = new ErrorPageFragment();
        errorPageFragment.i = this.c;
        return errorPageFragment;
    }
}
