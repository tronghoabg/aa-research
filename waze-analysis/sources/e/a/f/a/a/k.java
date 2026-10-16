package e.a.f.a.a;

import androidx.collection.SieveCacheKt;
import androidx.compose.foundation.style.StylePropertiesKt;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class k implements c {

    /* renamed from: a, reason: collision with root package name */
    final f f47523a;

    /* renamed from: b, reason: collision with root package name */
    private final k.j f47524b;

    /* renamed from: c, reason: collision with root package name */
    private final i f47525c;

    k(k.j jVar) {
        this.f47524b = jVar;
        i iVar = new i(jVar);
        this.f47525c = iVar;
        this.f47523a = new f(iVar);
    }

    private final List b(int i2, short s, byte b2, int i3) throws IOException {
        i iVar = this.f47525c;
        iVar.f47517d = i2;
        iVar.f47514a = i2;
        iVar.f47518e = s;
        iVar.f47515b = b2;
        iVar.f47516c = i3;
        f fVar = this.f47523a;
        fVar.e();
        return fVar.b();
    }

    private final void c() {
        k.j jVar = this.f47524b;
        jVar.e();
        jVar.c();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.a.f.a.a.c
    public final boolean a(b bVar) throws IOException {
        try {
            this.f47524b.O(9L);
            k.j jVar = this.f47524b;
            int iB = m.b(jVar);
            if (iB > 16384) {
                throw m.i("FRAME_SIZE_ERROR: %s", Integer.valueOf(iB));
            }
            byte bC = (byte) (jVar.c() & 255);
            byte bC2 = (byte) (jVar.c() & 255);
            int iE = jVar.e() & Integer.MAX_VALUE;
            if (m.f47531a.isLoggable(Level.FINE)) {
                m.f47531a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Reader", "nextFrame", j.a(true, iE, iB, bC, bC2));
            }
            switch (bC) {
                case 0:
                    boolean z = bC2 & 1;
                    if ((bC2 & StylePropertiesKt.ZIndexId) != 0) {
                        throw m.i("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                    }
                    int iC = (bC2 & 8) != 0 ? jVar.c() & 255 : 0;
                    bVar.a(1 == z, iE, jVar, m.a(iB, bC2, (short) iC), iB);
                    jVar.Q(iC);
                    return true;
                case 1:
                    if (iE == 0) {
                        throw m.i("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                    }
                    boolean z2 = bC2 & 8;
                    boolean z3 = bC2 & StylePropertiesKt.ZIndexId;
                    boolean z4 = bC2 & 1;
                    int iC2 = z2 != 0 ? jVar.c() & 255 : 0;
                    if (z3 != 0) {
                        c();
                        iB -= 5;
                    }
                    short s = (short) iC2;
                    bVar.g(1 == z4, iE, b(m.a(iB, bC2, s), s, bC2, iE));
                    return true;
                case 2:
                    if (iB != 5) {
                        throw m.i("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iB));
                    }
                    if (iE == 0) {
                        throw m.i("TYPE_PRIORITY streamId == 0", new Object[0]);
                    }
                    c();
                    return true;
                case 3:
                    if (iB != 4) {
                        throw m.i("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(iB));
                    }
                    if (iE == 0) {
                        throw m.i("TYPE_RST_STREAM streamId == 0", new Object[0]);
                    }
                    int iE2 = jVar.e();
                    a aVarA = a.a(iE2);
                    if (aVarA == null) {
                        throw m.i("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(iE2));
                    }
                    bVar.e(iE, aVarA);
                    return true;
                case 4:
                    if (iE != 0) {
                        throw m.i("TYPE_SETTINGS streamId != 0", new Object[0]);
                    }
                    if ((bC2 & 1) == 0) {
                        if (iB % 6 != 0) {
                            throw m.i("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(iB));
                        }
                        p pVar = new p();
                        for (int i2 = 0; i2 < iB; i2 += 6) {
                            short sL = jVar.L();
                            int iE3 = jVar.e();
                            switch (sL) {
                                case 1:
                                case 6:
                                    pVar.f(sL, iE3);
                                case 2:
                                    if (iE3 != 0 && iE3 != 1) {
                                        throw m.i("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                    }
                                    pVar.f(sL, iE3);
                                case 3:
                                    sL = 4;
                                    pVar.f(sL, iE3);
                                case 4:
                                    if (iE3 < 0) {
                                        throw m.i("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                    }
                                    sL = 7;
                                    pVar.f(sL, iE3);
                                case 5:
                                    if (iE3 < 16384 || iE3 > 16777215) {
                                        throw m.i("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(iE3));
                                    }
                                    pVar.f(sL, iE3);
                                    break;
                                default:
                            }
                        }
                        bVar.h(pVar);
                        if (pVar.b() >= 0) {
                            this.f47523a.d(pVar.b());
                        }
                    } else if (iB != 0) {
                        throw m.i("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                    }
                    return true;
                case 5:
                    if (iE == 0) {
                        throw m.i("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                    }
                    short sC = (short) ((bC2 & 8) != 0 ? jVar.c() & 255 : 0);
                    bVar.d(iE, jVar.e() & Integer.MAX_VALUE, b(m.a(iB - 4, bC2, sC), sC, bC2, iE));
                    return true;
                case 6:
                    if (iB != 8) {
                        throw m.i("TYPE_PING length != 8: %s", Integer.valueOf(iB));
                    }
                    if (iE != 0) {
                        throw m.i("TYPE_PING streamId != 0", new Object[0]);
                    }
                    bVar.c(1 == (bC2 & 1), jVar.e(), jVar.e());
                    return true;
                case 7:
                    if (iB < 8) {
                        throw m.i("TYPE_GOAWAY length < 8: %s", Integer.valueOf(iB));
                    }
                    if (iE != 0) {
                        throw m.i("TYPE_GOAWAY streamId != 0", new Object[0]);
                    }
                    int i3 = iB - 8;
                    int iE4 = jVar.e();
                    int iE5 = jVar.e();
                    a aVarA2 = a.a(iE5);
                    if (aVarA2 == null) {
                        throw m.i("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(iE5));
                    }
                    k.k kVarH = k.k.f50843a;
                    if (i3 > 0) {
                        kVarH = jVar.H(i3);
                    }
                    bVar.b(iE4, aVarA2, kVarH);
                    return true;
                case 8:
                    if (iB != 4) {
                        throw m.i("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iB));
                    }
                    long jE = jVar.e() & SieveCacheKt.NodeLinkMask;
                    if (jE == 0) {
                        throw m.i("windowSizeIncrement was 0", new Object[0]);
                    }
                    bVar.f(iE, jE);
                    return true;
                default:
                    jVar.Q(iB);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f47524b.close();
    }
}
