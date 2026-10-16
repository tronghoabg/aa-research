package defpackage;

import android.graphics.drawable.Drawable;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.RemoteUtils;
import androidx.lifecycle.Lifecycle;
import com.carstream.tech.launcher.MediaListener;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class a7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a7(Object obj, Object obj2, String str, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = str;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MediaListener.lambda$onNotificationPosted$0((l7) this.c, (Drawable) this.d, this.b, (String) this.e);
                break;
            default:
                RemoteUtils.lambda$dispatchCallFromHost$1((Lifecycle) this.c, (IOnDoneCallback) this.d, this.b, (RemoteUtils.HostCall) this.e);
                break;
        }
    }
}
