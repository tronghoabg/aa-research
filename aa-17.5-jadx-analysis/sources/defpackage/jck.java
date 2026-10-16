package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class jck extends jbj {
    private static final yph a = yph.c("CAR.MEDIA.BUFFERED");

    public jck(jcj jcjVar, jbn jbnVar) {
        super(21, jcjVar, jbnVar, 0);
    }

    @Override // defpackage.jbj
    public final void a(int i, ByteBuffer byteBuffer) {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 1878)).u("onMessageReceived");
        if (a.aA(i) == 0) {
            ((ype) ((ype) yphVar.h()).ai((char) 1882)).w("Received unknown message id=%d", i);
            return;
        }
        if (i != 4) {
            ((ype) ((ype) yphVar.h()).ai((char) 1879)).w("Received unexpected message type: %d", i);
            return;
        }
        try {
            xmk xmkVar = (xmk) abnv.A(xmk.a, byteBuffer, abnj.a());
            ype ypeVar = (ype) yphVar.l().ai(1880);
            Integer numValueOf = Integer.valueOf(xmkVar.c);
            Long lValueOf = Long.valueOf(xmkVar.d);
            xmj xmjVarB = xmj.b(xmkVar.f);
            if (xmjVarB == null) {
                xmjVarB = xmj.PLAYBACK_STATE_UNKNOWN;
            }
            ypeVar.U("Received playbackStatusNotification: session_id=%d, uid=%d, state=%s, current_position_ms=%d, buffered_position_ms=%d, content_duration_ms=%d", numValueOf, lValueOf, xmjVarB, Long.valueOf(xmkVar.e), Long.valueOf(xmkVar.g), Long.valueOf(xmkVar.h));
            ype ypeVar2 = (ype) itu.a.l().ai(1342);
            Integer numValueOf2 = Integer.valueOf(xmkVar.c);
            Long lValueOf2 = Long.valueOf(xmkVar.d);
            xmj xmjVarB2 = xmj.b(xmkVar.f);
            if (xmjVarB2 == null) {
                xmjVarB2 = xmj.PLAYBACK_STATE_UNKNOWN;
            }
            ypeVar2.U("carservice.onPlaybackStatusNotification: session_id=%d, uid=%d, state=%s, current_position_ms=%d, buffered_position_ms=%d, content_duration_ms=%d", numValueOf2, lValueOf2, xmjVarB2, Long.valueOf(xmkVar.e), Long.valueOf(xmkVar.g), Long.valueOf(xmkVar.h));
            if ((xmkVar.b & 2) != 0) {
                long j = xmkVar.d;
            }
            int i2 = xmkVar.f;
            long j2 = xmkVar.e;
            long j3 = xmkVar.g;
            long j4 = xmkVar.h;
        } catch (abon e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 1881)).u("Failed to parse playback status notification");
        }
    }

    @Override // defpackage.iyx
    public final void b(int i) {
        ((ype) a.l().ai((char) 1883)).u("onMessageSentCallback");
    }
}
