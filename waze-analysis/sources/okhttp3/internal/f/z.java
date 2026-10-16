package okhttp3.internal.f;

import androidx.collection.SieveCacheKt;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class z implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f56247a;

    /* renamed from: b, reason: collision with root package name */
    private final k.j f56248b;

    /* renamed from: c, reason: collision with root package name */
    private final y f56249c;

    /* renamed from: d, reason: collision with root package name */
    private final d f56250d;

    static {
        Logger logger = Logger.getLogger(g.class.getName());
        h.g.b.x.e(logger, "getLogger(...)");
        f56247a = logger;
    }

    public z(k.j jVar) {
        h.g.b.x.f(jVar, "source");
        this.f56248b = jVar;
        y yVar = new y(jVar);
        this.f56249c = yVar;
        this.f56250d = new d(yVar);
    }

    private final List c(int i2, int i3, int i4, int i5) {
        y yVar = this.f56249c;
        yVar.d(i2);
        yVar.e(yVar.b());
        yVar.f(i3);
        yVar.c(i4);
        yVar.g(i5);
        d dVar = this.f56250d;
        dVar.d();
        return dVar.b();
    }

    private final void d() {
        k.j jVar = this.f56248b;
        jVar.e();
        jVar.c();
        byte[] bArr = okhttp3.internal.b.f55955a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(boolean z, o oVar) throws IOException {
        boolean z2;
        Object[] array;
        int iE;
        h.g.b.x.f(oVar, "handler");
        try {
            this.f56248b.O(9L);
            k.j jVar = this.f56248b;
            int iG = okhttp3.internal.b.g(jVar);
            if (iG > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iG);
            }
            int iB = okhttp3.internal.b.B(jVar.c());
            int iB2 = okhttp3.internal.b.B(jVar.c());
            int iE2 = jVar.e();
            int i2 = iE2 & Integer.MAX_VALUE;
            Logger logger = f56247a;
            if (logger.isLoggable(Level.FINE)) {
                k.k kVar = g.f56178a;
                logger.fine(g.b(true, i2, iG, iB, iB2));
            }
            if (!z) {
                switch (iB) {
                    case 0:
                        if (i2 == 0) {
                            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                        }
                        int i3 = iB2 & 1;
                        if ((iB2 & 32) != 0) {
                            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                        }
                        iB = (iB2 & 8) != 0 ? okhttp3.internal.b.B(jVar.c()) : 0;
                        int iH = com.waze.ce.x.h(iG, iB2, iB);
                        h.g.b.x.f(jVar, "source");
                        w wVar = oVar.f56199a;
                        if (w.N(i2)) {
                            wVar.P(i2, jVar, iH);
                        } else {
                            ad adVarN = wVar.n(i2);
                            if (adVarN == null) {
                                wVar.I(i2, b.f56140b);
                                long j2 = iH;
                                wVar.E(j2);
                                jVar.Q(j2);
                            } else {
                                adVarN.v(jVar, iH);
                                if (i3 != 0) {
                                    adVarN.w(okhttp3.internal.b.f55956b, true);
                                }
                            }
                        }
                        jVar.Q(iB);
                        return true;
                    case 1:
                        if (i2 == 0) {
                            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                        }
                        int i4 = iB2 & 32;
                        int i5 = iB2 & 1;
                        int iB3 = (iB2 & 8) != 0 ? okhttp3.internal.b.B(jVar.c()) : 0;
                        if (i4 != 0) {
                            d();
                            iG -= 5;
                        }
                        List listC = c(com.waze.ce.x.h(iG, iB2, iB3), iB3, iB2, i2);
                        h.g.b.x.f(listC, "headerBlock");
                        w wVar2 = oVar.f56199a;
                        if (!w.N(i2)) {
                            synchronized (wVar2) {
                                ad adVarN2 = wVar2.n(i2);
                                if (1 == i5) {
                                    iB = 1;
                                }
                                if (adVarN2 != null) {
                                    adVarN2.w(okhttp3.internal.b.r(listC), iB);
                                    return true;
                                }
                                if (wVar2.f56226f || i2 <= wVar2.a() || (iE2 & 1) == wVar2.b() % 2) {
                                    z2 = true;
                                } else {
                                    z2 = true;
                                    ad adVar = new ad(i2, wVar2, false, iB, okhttp3.internal.b.r(listC));
                                    wVar2.C(i2);
                                    wVar2.h().put(Integer.valueOf(i2), adVar);
                                    wVar2.f56227g.c().l(new l(wVar2.g() + "[" + i2 + "] onStream", wVar2, adVar));
                                }
                                return z2;
                            }
                        }
                        wVar2.Q(i2, listC);
                        break;
                    case 2:
                        if (iG != 5) {
                            throw new IOException("TYPE_PRIORITY length: " + iG + " != 5");
                        }
                        if (i2 == 0) {
                            throw new IOException("TYPE_PRIORITY streamId == 0");
                        }
                        d();
                        break;
                    case 3:
                        if (iG != 4) {
                            throw new IOException("TYPE_RST_STREAM length: " + iG + " != 4");
                        }
                        if (i2 == 0) {
                            throw new IOException("TYPE_RST_STREAM streamId == 0");
                        }
                        int iE3 = jVar.e();
                        b bVar = b.f56139a;
                        b bVarI = com.waze.ce.x.i(iE3);
                        if (bVarI == null) {
                            throw new IOException("TYPE_RST_STREAM unexpected error code: " + iE3);
                        }
                        h.g.b.x.f(bVarI, "errorCode");
                        w wVar3 = oVar.f56199a;
                        if (!w.N(i2)) {
                            ad adVarP = wVar3.p(i2);
                            if (adVarP != null) {
                                adVarP.x(bVarI);
                                break;
                            }
                        } else {
                            wVar3.A(i2, bVarI);
                            break;
                        }
                        break;
                    case 4:
                        break;
                    case 5:
                        if (i2 == 0) {
                            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                        }
                        iB = (iB2 & 8) != 0 ? okhttp3.internal.b.B(jVar.c()) : 0;
                        int iE4 = jVar.e() & Integer.MAX_VALUE;
                        List listC2 = c(com.waze.ce.x.h(iG - 4, iB2, iB), iB, iB2, i2);
                        h.g.b.x.f(listC2, "requestHeaders");
                        oVar.f56199a.z(iE4, listC2);
                        break;
                    case 6:
                        if (iG != 8) {
                            throw new IOException("TYPE_PING length != 8: " + iG);
                        }
                        if (i2 != 0) {
                            throw new IOException("TYPE_PING streamId != 0");
                        }
                        int i6 = iB2 & 1;
                        int iE5 = jVar.e();
                        int iE6 = jVar.e();
                        if (i6 == 0) {
                            w wVar4 = oVar.f56199a;
                            wVar4.f56228h.l(new m(String.valueOf(wVar4.g()).concat(" ping"), wVar4, iE5, iE6));
                            break;
                        } else {
                            w wVar5 = oVar.f56199a;
                            synchronized (wVar5) {
                                if (iE5 == 1) {
                                    wVar5.f56232l++;
                                } else if (iE5 != 2) {
                                    if (iE5 == 3) {
                                        wVar5.o++;
                                        wVar5.notifyAll();
                                    }
                                    break;
                                } else {
                                    wVar5.n++;
                                }
                            }
                        }
                    case 7:
                        if (iG < 8) {
                            throw new IOException("TYPE_GOAWAY length < 8: " + iG);
                        }
                        if (i2 != 0) {
                            throw new IOException("TYPE_GOAWAY streamId != 0");
                        }
                        int i7 = iG - 8;
                        int iE7 = jVar.e();
                        int iE8 = jVar.e();
                        b bVar2 = b.f56139a;
                        b bVarI2 = com.waze.ce.x.i(iE8);
                        if (bVarI2 == null) {
                            throw new IOException("TYPE_GOAWAY unexpected error code: " + iE8);
                        }
                        k.k kVarH = k.k.f50843a;
                        if (i7 > 0) {
                            kVarH = jVar.H(i7);
                        }
                        h.g.b.x.f(bVarI2, "errorCode");
                        h.g.b.x.f(kVarH, "debugData");
                        kVarH.d();
                        w wVar6 = oVar.f56199a;
                        synchronized (wVar6) {
                            array = wVar6.h().values().toArray(new ad[0]);
                            wVar6.f56226f = true;
                        }
                        ad[] adVarArr = (ad[]) array;
                        int length = adVarArr.length;
                        while (iB < length) {
                            ad adVar2 = adVarArr[iB];
                            if (adVar2.a() > iE7 && adVar2.C()) {
                                adVar2.x(b.f56146h);
                                oVar.f56199a.p(adVar2.a());
                            }
                            iB++;
                        }
                        break;
                    case 8:
                        if (iG != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + iG);
                        }
                        long jE = jVar.e() & SieveCacheKt.NodeLinkMask;
                        if (jE == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        if (i2 != 0) {
                            ad adVarN3 = oVar.f56199a.n(i2);
                            if (adVarN3 != null) {
                                synchronized (adVarN3) {
                                    adVarN3.q(jE);
                                    break;
                                }
                            }
                        } else {
                            w wVar7 = oVar.f56199a;
                            synchronized (wVar7) {
                                wVar7.t = wVar7.f() + jE;
                                wVar7.notifyAll();
                                break;
                            }
                        }
                        break;
                    default:
                        jVar.Q(iG);
                        return true;
                }
                return true;
            }
            if (iB != 4) {
                k.k kVar2 = g.f56178a;
                throw new IOException("Expected a SETTINGS frame but was ".concat(String.valueOf(g.a(iB))));
            }
            if (i2 != 0) {
                throw new IOException("TYPE_SETTINGS streamId != 0");
            }
            if ((iB2 & 1) != 0) {
                if (iG != 0) {
                    throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                }
            } else {
                if (iG % 6 != 0) {
                    throw new IOException("TYPE_SETTINGS length % 6 != 0: " + iG);
                }
                com.google.firebase.d.c.b bVar3 = new com.google.firebase.d.c.b((byte[]) null);
                h.k.h hVarT = h.k.n.t(h.k.n.u(0, iG), 6);
                int iA = hVarT.a();
                int iB4 = hVarT.b();
                int iC = hVarT.c();
                if ((iC > 0 && iA <= iB4) || (iC < 0 && iB4 <= iA)) {
                    while (true) {
                        char cL = (char) jVar.L();
                        iE = jVar.e();
                        if (cL != 2) {
                            if (cL == 3) {
                                cL = 4;
                            } else if (cL != 4) {
                                if (cL == 5 && (iE < 16384 || iE > 16777215)) {
                                }
                            } else {
                                if (iE < 0) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                }
                                cL = 7;
                            }
                        } else if (iE != 0 && iE != 1) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                        }
                        bVar3.m(cL, iE);
                        if (iA != iB4) {
                            iA += iC;
                        }
                    }
                    throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + iE);
                }
                h.g.b.x.f(bVar3, "settings");
                w wVar8 = oVar.f56199a;
                wVar8.f56228h.l(new n(String.valueOf(wVar8.g()).concat(" applyAndAckSettings"), oVar, bVar3));
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f56248b.close();
    }
}
