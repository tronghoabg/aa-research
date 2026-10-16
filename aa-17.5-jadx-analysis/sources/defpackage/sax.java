package defpackage;

import android.os.Looper;
import com.google.android.gms.carsetup.CarSetupServiceImpl;

/* loaded from: classes.dex */
public final class sax implements Runnable {
    public boolean a;
    public final /* synthetic */ CarSetupServiceImpl b;

    public sax(CarSetupServiceImpl carSetupServiceImpl) {
        this.b = carSetupServiceImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = ruy.a().c(this.b.getApplicationContext());
        new sss(Looper.getMainLooper()).post(new rsv(this, 14, null));
    }
}
