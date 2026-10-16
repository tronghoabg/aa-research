package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import androidx.car.app.ICarApp;
import java.security.InvalidParameterException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final /* synthetic */ class glt implements gdn {
    public final /* synthetic */ gmg a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ glt(gmg gmgVar, Object obj, int i) {
        this.c = i;
        this.a = gmgVar;
        this.b = obj;
    }

    @Override // defpackage.gdn
    public final void a(Object obj, glf glfVar) throws RemoteException {
        if (this.c == 0) {
            gmg gmgVar = this.a;
            ((ICarApp) obj).onNewIntent((Intent) this.b, new glv(gmgVar, gmgVar.g, glfVar));
            return;
        }
        ICarApp iCarApp = (ICarApp) obj;
        epq epqVar = epr.Companion;
        gmg gmgVar2 = this.a;
        Object obj2 = this.b;
        int iOrdinal = ((epr) obj2).ordinal();
        if (iOrdinal == 1) {
            if (gmgVar2.a) {
                gmgVar2.b.removeMessages(1);
            }
            iCarApp.onAppStart(new gej(gmgVar2.g, glfVar));
            return;
        }
        if (iOrdinal == 2) {
            iCarApp.onAppResume(new gej(gmgVar2.g, glfVar));
            return;
        }
        if (iOrdinal == 3) {
            iCarApp.onAppPause(new gej(gmgVar2.g, glfVar));
            return;
        }
        if (iOrdinal != 4) {
            throw new InvalidParameterException("Received unexpected lifecycle event: ".concat(String.valueOf(String.valueOf(obj2))));
        }
        if (gmgVar2.a) {
            Handler handler = gmgVar2.b;
            handler.removeMessages(1);
            handler.removeMessages(2);
            Message messageObtainMessage = handler.obtainMessage(1);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            gmgVar2.g.i();
            handler.sendMessageDelayed(messageObtainMessage, 180000L);
        }
        iCarApp.onAppStop(new gej(gmgVar2.g, glfVar));
    }
}
