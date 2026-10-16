package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class iyu extends jbj {
    public static final ypf a = ols.R("CAR.GAL.CAR_LOCAL_MEDIA");
    private final iyt b;

    public iyu(iyt iytVar, jbn jbnVar) {
        super(20, iytVar, jbnVar, 0);
        this.b = iytVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, rhr] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, rhr] */
    @Override // defpackage.jbj
    protected final void a(int i, ByteBuffer byteBuffer) throws abon {
        char c;
        String str;
        switch (i) {
            case 32769:
                c = 32769;
                break;
            case 32770:
                c = 32770;
                break;
            case 32771:
                c = 32771;
                break;
            default:
                c = 0;
                break;
        }
        if (c == 0) {
            a.g().ai(1665).w("Received message type that did not match existing CarLocalMediaMessageId: %d", i);
            return;
        }
        switch (c) {
            case 32769:
                xil xilVar = (xil) abnv.A(xil.b, byteBuffer, abnj.a());
                iyt iytVar = this.b;
                synchronized (((ike) iytVar).b) {
                    ((ike) iytVar).d = xilVar;
                    Iterator it = ((ike) iytVar).f.iterator();
                    while (it.hasNext()) {
                        ike.j(((ikf) it.next()).a, xilVar);
                    }
                }
                return;
            case 32770:
                xij xijVar = (xij) abnv.A(xij.a, byteBuffer, abnj.a());
                iyt iytVar2 = this.b;
                synchronized (((ike) iytVar2).b) {
                    ((ike) iytVar2).e = xijVar;
                    Iterator it2 = ((ike) iytVar2).f.iterator();
                    while (it2.hasNext()) {
                        ike.i(((ikf) it2.next()).a, xijVar);
                    }
                }
                return;
            default:
                yop yopVarAi = a.g().ai(1664);
                switch (c) {
                    case 32769:
                        str = "CAR_LOCAL_MEDIA_PLAYBACK_STATUS";
                        break;
                    case 32770:
                        str = "CAR_LOCAL_MEDIA_PLAYBACK_METADATA";
                        break;
                    default:
                        str = "CAR_LOCAL_MEDIA_PLAYBACK_REQUEST";
                        break;
                }
                yopVarAi.y("Received unexpected car local media message %s", str);
                return;
        }
    }

    @Override // defpackage.iyx
    public final void b(int i) {
    }
}
