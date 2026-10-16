package rd;

import A7.RunnableC0280p1;
import ba.C1521a;
import cb.AbstractC1593a;
import cg.C1610B;
import cg.C1618g;
import cg.C1621j;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import md.b0;
import md.j0;
import md.k0;
import od.C3684f0;
import od.EnumC3721s;
import od.Z;
import org.apache.tika.fork.ForkServer;
import pd.m;

/* renamed from: rd.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3973h implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final C1610B f44787a;

    /* renamed from: b, reason: collision with root package name */
    public final C3971f f44788b;

    /* renamed from: c, reason: collision with root package name */
    public final C3968c f44789c;

    public C3973h(C1610B c1610b) {
        this.f44787a = c1610b;
        C3971f c3971f = new C3971f(c1610b);
        this.f44788b = c3971f;
        this.f44789c = new C3968c(c3971f);
    }

    public final boolean a(RunnableC0280p1 runnableC0280p1) throws IOException {
        EnumC3966a enumC3966a;
        k0 k0VarH;
        boolean z2 = false;
        try {
            this.f44787a.require(9L);
            int iA = C3975j.a(this.f44787a);
            if (iA < 0 || iA > 16384) {
                C3975j.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(iA));
                throw null;
            }
            byte b5 = (byte) (this.f44787a.readByte() & ForkServer.ERROR);
            byte b10 = (byte) (this.f44787a.readByte() & ForkServer.ERROR);
            int i5 = this.f44787a.readInt() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            Logger logger = C3975j.f44795a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(AbstractC3972g.a(true, i5, iA, b5, b10));
            }
            switch (b5) {
                case 0:
                    b(runnableC0280p1, iA, b10, i5);
                    return true;
                case 1:
                    h(runnableC0280p1, iA, b10, i5);
                    return true;
                case 2:
                    if (iA != 5) {
                        C3975j.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iA));
                        throw null;
                    }
                    if (i5 == 0) {
                        C3975j.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    C1610B c1610b = this.f44787a;
                    c1610b.readInt();
                    c1610b.readByte();
                    return true;
                case 3:
                    w(runnableC0280p1, iA, i5);
                    return true;
                case 4:
                    y(runnableC0280p1, iA, b10, i5);
                    return true;
                case 5:
                    o(runnableC0280p1, iA, b10, i5);
                    return true;
                case 6:
                    i(runnableC0280p1, iA, b10, i5);
                    return true;
                case 7:
                    if (iA < 8) {
                        C3975j.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(iA));
                        throw null;
                    }
                    if (i5 != 0) {
                        C3975j.c("TYPE_GOAWAY streamId != 0", new Object[0]);
                        throw null;
                    }
                    C1610B c1610b2 = this.f44787a;
                    int i10 = c1610b2.readInt();
                    int i11 = c1610b2.readInt();
                    int i12 = iA - 8;
                    EnumC3966a[] enumC3966aArrValues = EnumC3966a.values();
                    int length = enumC3966aArrValues.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 < length) {
                            enumC3966a = enumC3966aArrValues[i13];
                            if (enumC3966a.f44753a != i11) {
                                i13++;
                            }
                        } else {
                            enumC3966a = null;
                        }
                    }
                    if (enumC3966a == null) {
                        C3975j.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i11));
                        throw null;
                    }
                    C1621j c1621jA = C1621j.f19903d;
                    if (i12 > 0) {
                        c1621jA = c1610b2.a(i12);
                    }
                    ((C1521a) runnableC0280p1.f1021b).C(1, i10, enumC3966a, c1621jA);
                    EnumC3966a enumC3966a2 = EnumC3966a.ENHANCE_YOUR_CALM;
                    m mVar = (m) runnableC0280p1.f1023d;
                    if (enumC3966a == enumC3966a2) {
                        String strT = c1621jA.t();
                        m.f43541Q.log(Level.WARNING, runnableC0280p1 + ": Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: " + strT);
                        if ("too_many_pings".equals(strT)) {
                            mVar.f43551J.run();
                        }
                    }
                    long j8 = enumC3966a.f44753a;
                    Z[] zArr = Z.f41853d;
                    Z z10 = (j8 >= ((long) zArr.length) || j8 < 0) ? null : zArr[(int) j8];
                    if (z10 == null) {
                        k0VarH = k0.d(Z.f41852c.f41856b.f40685a.f40671a).h("Unrecognized HTTP/2 error code: " + j8);
                    } else {
                        k0VarH = z10.f41856b;
                    }
                    k0 k0VarB = k0VarH.b("Received Goaway");
                    if (c1621jA.d() > 0) {
                        k0VarB = k0VarB.b(c1621jA.t());
                    }
                    Map map = m.f43540P;
                    mVar.u(i10, null, k0VarB);
                    return true;
                case 8:
                    if (iA != 4) {
                        C3975j.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iA));
                        throw null;
                    }
                    long j10 = this.f44787a.readInt() & 2147483647L;
                    if (j10 == 0) {
                        C3975j.c("windowSizeIncrement was 0", new Object[0]);
                        throw null;
                    }
                    ((C1521a) runnableC0280p1.f1021b).G(1, i5, j10);
                    if (j10 == 0) {
                        if (i5 == 0) {
                            m.g((m) runnableC0280p1.f1023d, "Received 0 flow control window increment.");
                            return true;
                        }
                        ((m) runnableC0280p1.f1023d).j(i5, k0.f40681m.h("Received 0 flow control window increment."), EnumC3721s.f42082a, false, EnumC3966a.PROTOCOL_ERROR, null);
                        return true;
                    }
                    synchronized (((m) runnableC0280p1.f1023d).k) {
                        try {
                            if (i5 == 0) {
                                ((m) runnableC0280p1.f1023d).f43565j.h(null, (int) j10);
                                return true;
                            }
                            pd.k kVar = (pd.k) ((m) runnableC0280p1.f1023d).f43568n.get(Integer.valueOf(i5));
                            if (kVar != null) {
                                ((m) runnableC0280p1.f1023d).f43565j.h(kVar.f43536n.o(), (int) j10);
                            } else if (!((m) runnableC0280p1.f1023d).o(i5)) {
                                z2 = true;
                            }
                            if (z2) {
                                m.g((m) runnableC0280p1.f1023d, "Received window_update for unknown stream: " + i5);
                            }
                            return true;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                default:
                    this.f44787a.skip(iA);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public final void b(RunnableC0280p1 runnableC0280p1, int i5, byte b5, int i10) throws IOException {
        boolean z2 = (b5 & 1) != 0;
        if ((b5 & 32) != 0) {
            C3975j.c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        short s10 = (b5 & 8) != 0 ? (short) (this.f44787a.readByte() & ForkServer.ERROR) : (short) 0;
        int iB = C3975j.b(i5, b5, s10);
        C1610B c1610b = this.f44787a;
        ((C1521a) runnableC0280p1.f1021b).B(1, i10, c1610b.f19864b, iB, z2);
        pd.k kVarN = ((m) runnableC0280p1.f1023d).n(i10);
        if (kVarN != null) {
            long j8 = iB;
            c1610b.require(j8);
            C1618g c1618g = new C1618g();
            c1618g.E(c1610b.f19864b, j8);
            Xd.c cVar = kVarN.f43536n.f43524I;
            Xd.b.f16226a.getClass();
            synchronized (((m) runnableC0280p1.f1023d).k) {
                kVarN.f43536n.p(i5 - iB, c1618g, z2);
            }
        } else {
            if (!((m) runnableC0280p1.f1023d).o(i10)) {
                m.g((m) runnableC0280p1.f1023d, "Received data for unknown stream: " + i10);
                this.f44787a.skip(s10);
            }
            synchronized (((m) runnableC0280p1.f1023d).k) {
                ((m) runnableC0280p1.f1023d).f43564i.h(i10, EnumC3966a.STREAM_CLOSED);
            }
            c1610b.skip(iB);
        }
        m mVar = (m) runnableC0280p1.f1023d;
        int i11 = mVar.f43573s + i5;
        mVar.f43573s = i11;
        if (i11 >= mVar.f43561f * 0.5f) {
            synchronized (mVar.k) {
                ((m) runnableC0280p1.f1023d).f43564i.o(0, r11.f43573s);
            }
            ((m) runnableC0280p1.f1023d).f43573s = 0;
        }
        this.f44787a.skip(s10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f44787a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        throw new java.io.IOException(ka.AbstractC3256n.g(r4, "Header index too large "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList d(int r3, short r4, byte r5, int r6) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rd.C3973h.d(int, short, byte, int):java.util.ArrayList");
    }

    public final void h(RunnableC0280p1 runnableC0280p1, int i5, byte b5, int i10) throws IOException {
        k0 k0VarH = null;
        boolean z2 = false;
        if (i10 == 0) {
            C3975j.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z10 = (b5 & 1) != 0;
        short s10 = (b5 & 8) != 0 ? (short) (this.f44787a.readByte() & ForkServer.ERROR) : (short) 0;
        if ((b5 & 32) != 0) {
            C1610B c1610b = this.f44787a;
            c1610b.readInt();
            c1610b.readByte();
            i5 -= 5;
        }
        ArrayList arrayListD = d(C3975j.b(i5, b5, s10), s10, b5, i10);
        C1521a c1521a = (C1521a) runnableC0280p1.f1021b;
        if (c1521a.A()) {
            ((Logger) c1521a.f19414b).log((Level) c1521a.f19415c, "INBOUND HEADERS: streamId=" + i10 + " headers=" + arrayListD + " endStream=" + z10);
        }
        if (((m) runnableC0280p1.f1023d).f43552K != Integer.MAX_VALUE) {
            long jD = 0;
            for (int i11 = 0; i11 < arrayListD.size(); i11++) {
                C3967b c3967b = (C3967b) arrayListD.get(i11);
                jD += c3967b.f44760b.d() + c3967b.f44759a.d() + 32;
            }
            int iMin = (int) Math.min(jD, 2147483647L);
            int i12 = ((m) runnableC0280p1.f1023d).f43552K;
            if (iMin > i12) {
                k0 k0Var = k0.k;
                Locale locale = Locale.US;
                StringBuilder sbK = AbstractC1593a.k(i12, "Response ", z10 ? "trailer" : "header", " metadata larger than ", ": ");
                sbK.append(iMin);
                k0VarH = k0Var.h(sbK.toString());
            }
        }
        synchronized (((m) runnableC0280p1.f1023d).k) {
            try {
                pd.k kVar = (pd.k) ((m) runnableC0280p1.f1023d).f43568n.get(Integer.valueOf(i10));
                if (kVar == null) {
                    if (((m) runnableC0280p1.f1023d).o(i10)) {
                        ((m) runnableC0280p1.f1023d).f43564i.h(i10, EnumC3966a.STREAM_CLOSED);
                    } else {
                        z2 = true;
                    }
                } else if (k0VarH == null) {
                    Xd.c cVar = kVar.f43536n.f43524I;
                    Xd.b.f16226a.getClass();
                    kVar.f43536n.q(arrayListD, z10);
                } else {
                    if (!z10) {
                        ((m) runnableC0280p1.f1023d).f43564i.h(i10, EnumC3966a.CANCEL);
                    }
                    kVar.f43536n.g(k0VarH, EnumC3721s.f42082a, false, new b0());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            m.g((m) runnableC0280p1.f1023d, "Received header for unknown stream: " + i10);
        }
    }

    public final void i(RunnableC0280p1 runnableC0280p1, int i5, byte b5, int i10) throws IOException {
        C3684f0 c3684f0 = null;
        if (i5 != 8) {
            C3975j.c("TYPE_PING length != 8: %s", Integer.valueOf(i5));
            throw null;
        }
        if (i10 != 0) {
            C3975j.c("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
        int i11 = this.f44787a.readInt();
        int i12 = this.f44787a.readInt();
        boolean z2 = (b5 & 1) != 0;
        long j8 = (i11 << 32) | (i12 & 4294967295L);
        ((C1521a) runnableC0280p1.f1021b).D(1, j8);
        if (!z2) {
            synchronized (((m) runnableC0280p1.f1023d).k) {
                ((m) runnableC0280p1.f1023d).f43564i.d(true, i11, i12);
            }
            return;
        }
        synchronized (((m) runnableC0280p1.f1023d).k) {
            try {
                m mVar = (m) runnableC0280p1.f1023d;
                C3684f0 c3684f02 = mVar.f43578x;
                if (c3684f02 != null) {
                    long j10 = c3684f02.f41949a;
                    if (j10 == j8) {
                        mVar.f43578x = null;
                        c3684f0 = c3684f02;
                    } else {
                        Logger logger = m.f43541Q;
                        Level level = Level.WARNING;
                        Locale locale = Locale.US;
                        logger.log(level, "Received unexpected ping ack. Expecting " + j10 + ", got " + j8);
                    }
                } else {
                    m.f43541Q.warning("Received unexpected ping ack. No ping outstanding");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c3684f0 != null) {
            c3684f0.b();
        }
    }

    public final void o(RunnableC0280p1 runnableC0280p1, int i5, byte b5, int i10) throws IOException {
        if (i10 == 0) {
            C3975j.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short s10 = (b5 & 8) != 0 ? (short) (this.f44787a.readByte() & ForkServer.ERROR) : (short) 0;
        int i11 = this.f44787a.readInt() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        ArrayList arrayListD = d(C3975j.b(i5 - 4, b5, s10), s10, b5, i10);
        C1521a c1521a = (C1521a) runnableC0280p1.f1021b;
        if (c1521a.A()) {
            ((Logger) c1521a.f19414b).log((Level) c1521a.f19415c, "INBOUND PUSH_PROMISE: streamId=" + i10 + " promisedStreamId=" + i11 + " headers=" + arrayListD);
        }
        synchronized (((m) runnableC0280p1.f1023d).k) {
            ((m) runnableC0280p1.f1023d).f43564i.h(i10, EnumC3966a.PROTOCOL_ERROR);
        }
    }

    public final void w(RunnableC0280p1 runnableC0280p1, int i5, int i10) throws IOException {
        EnumC3966a enumC3966a;
        if (i5 != 4) {
            C3975j.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i5));
            throw null;
        }
        if (i10 == 0) {
            C3975j.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
        int i11 = this.f44787a.readInt();
        EnumC3966a[] enumC3966aArrValues = EnumC3966a.values();
        int length = enumC3966aArrValues.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                enumC3966a = null;
                break;
            }
            enumC3966a = enumC3966aArrValues[i12];
            if (enumC3966a.f44753a == i11) {
                break;
            } else {
                i12++;
            }
        }
        if (enumC3966a == null) {
            C3975j.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i11));
            throw null;
        }
        ((C1521a) runnableC0280p1.f1021b).E(1, i10, enumC3966a);
        k0 k0VarB = m.y(enumC3966a).b("Rst Stream");
        j0 j0Var = k0VarB.f40685a;
        boolean z2 = j0Var == j0.CANCELLED || j0Var == j0.DEADLINE_EXCEEDED;
        synchronized (((m) runnableC0280p1.f1023d).k) {
            try {
                pd.k kVar = (pd.k) ((m) runnableC0280p1.f1023d).f43568n.get(Integer.valueOf(i10));
                if (kVar != null) {
                    Xd.c cVar = kVar.f43536n.f43524I;
                    Xd.b.f16226a.getClass();
                    ((m) runnableC0280p1.f1023d).j(i10, k0VarB, enumC3966a == EnumC3966a.REFUSED_STREAM ? EnumC3721s.f42083b : EnumC3721s.f42082a, z2, null, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        rd.C3975j.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(A7.RunnableC0280p1 r9, int r10, byte r11, int r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rd.C3973h.y(A7.p1, int, byte, int):void");
    }
}
