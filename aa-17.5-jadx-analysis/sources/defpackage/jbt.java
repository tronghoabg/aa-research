package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class jbt extends jbj {
    public static final ypf a = ols.R("CAR.GAL.RADIO-EP");
    public final jbs b;
    private final Handler c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbt(jbs jbsVar, jbn jbnVar) {
        super(15, jbsVar, jbnVar, 0);
        Looper looperMyLooper = Looper.myLooper();
        this.b = jbsVar;
        this.c = new sss(looperMyLooper, new jbr(this), null);
    }

    @Override // defpackage.jbj
    public final void a(int i, ByteBuffer byteBuffer) throws abon {
        switch (i) {
            case 32794:
                xmy xmyVar = (xmy) abnv.A(xmy.a, byteBuffer, abnj.a());
                if (xmyVar == null) {
                    a.g().ai(1804).u("Wrong RadioProgramListNotification message");
                    break;
                } else {
                    Handler handler = this.c;
                    handler.sendMessage(handler.obtainMessage(4, xmyVar.b));
                    break;
                }
            case 32795:
                xmx xmxVar = (xmx) abnv.A(xmx.a, byteBuffer, abnj.a());
                if (xmxVar == null) {
                    a.g().ai(1805).u("Wrong RadioProgramInfoNotification message");
                    break;
                } else {
                    Handler handler2 = this.c;
                    boolean z = xmxVar.c;
                    boolean z2 = xmxVar.d;
                    xmw xmwVar = xmxVar.b;
                    if (xmwVar == null) {
                        xmwVar = xmw.a;
                    }
                    handler2.sendMessage(handler2.obtainMessage(3, z ? 1 : 0, z2 ? 1 : 0, xmwVar));
                    break;
                }
            case 32796:
            case 32798:
            default:
                a.l().ai(1803).w("unhandled message type %d", i);
                break;
            case 32797:
                xmt xmtVar = (xmt) abnv.A(xmt.a, byteBuffer, abnj.a());
                if (xmtVar == null) {
                    a.g().ai(1806).u("Wrong RadioMuteResponse message");
                    break;
                } else {
                    Handler handler3 = this.c;
                    handler3.sendMessage(handler3.obtainMessage(1, Boolean.valueOf(xmtVar.b)));
                    break;
                }
            case 32799:
                xng xngVar = (xng) abnv.A(xng.a, byteBuffer, abnj.a());
                if (xngVar == null) {
                    a.g().ai(1807).u("Wrong RadioTuneResponse message");
                    break;
                } else {
                    Handler handler4 = this.c;
                    int iAA = a.aA(xngVar.b);
                    handler4.sendMessage(handler4.obtainMessage(2, iAA != 0 ? iAA : 1, -1));
                    break;
                }
            case 32800:
                xmp xmpVar = (xmp) abnv.A(xmp.a, byteBuffer, abnj.a());
                if (xmpVar == null) {
                    a.g().ai(1808).u("Wrong RadioFavoriteListNotification message");
                    break;
                } else {
                    Handler handler5 = this.c;
                    handler5.sendMessage(handler5.obtainMessage(5, xmpVar.b));
                    break;
                }
        }
    }

    @Override // defpackage.iyx
    public final void b(int i) {
    }
}
