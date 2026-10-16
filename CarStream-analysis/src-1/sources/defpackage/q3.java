package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.carstream.tech.media.ControllerService;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class q3 implements ServiceConnection {
    public final /* synthetic */ s3 a;

    public q3(s3 s3Var) {
        this.a = s3Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder instanceof x3) {
            ControllerService controllerService = ((x3) iBinder).a;
            s3 s3Var = this.a;
            s3Var.g = controllerService;
            s3Var.h();
            s3Var.k();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.g = null;
    }
}
