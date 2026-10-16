package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class mlw extends mdd {
    final /* synthetic */ mlx a;

    public mlw(mlx mlxVar) {
        this.a = mlxVar;
    }

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("DataSourceImpl");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        mlx mlxVar = this.a;
        if (mlxVar.e == null) {
            mlxVar.e = mlu.a();
        }
        String action = intent.getAction();
        if ("com.google.android.gms.car.PROJECTION_STARTED".equals(action)) {
            mlxVar.e.f(true);
        } else if ("com.google.android.gms.car.PROJECTION_ENDED".equals(action)) {
            mlxVar.e.f(false);
        } else if ("com.google.android.gms.car.FIRST_ACTIVITY".equals(action)) {
            mlxVar.e.d(true);
        } else if ("android.hardware.usb.action.USB_STATE".equals(action)) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return;
            }
            mlxVar.e.e = ryx.c(extras);
        }
        mlxVar.a();
    }
}
