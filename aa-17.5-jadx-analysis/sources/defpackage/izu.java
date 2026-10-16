package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import j$.util.Optional;
import j$.util.OptionalInt;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.net.ssl.SSLEngine;

/* loaded from: classes.dex */
public final class izu extends jbj implements izt {
    public static final ypf a = ols.R("CAR.GAL.GAL");
    public static final ypf b = ols.R("CAR.GAL.AUDIO");
    public static final jbq c = new jbq(1, 6);
    public static final jbq d = new jbq(1, 7);
    public static final jbq e = new jbq(6, 1);
    private final izr A;
    private final jae B;
    private final xiv C;
    private final jbu D;
    private final izz E;
    private boolean F;
    public String f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public String j;
    public final Context k;
    public final Object l;
    public final ArrayList m;
    public final List n;
    public izp o;
    public final Queue p;
    public volatile izq q;
    public izl r;
    public jbq s;
    private final izs y;
    private final jca z;

    public izu(Context context, izs izsVar, izr izrVar, jae jaeVar, String str, String str2, xiv xivVar, jbu jbuVar, izz izzVar) {
        super(1, null, jaeVar, 0);
        Object obj = new Object();
        this.l = obj;
        this.s = new jbq(0, 0);
        this.F = false;
        this.k = context;
        this.B = jaeVar;
        this.y = izsVar;
        this.A = izrVar;
        this.j = str2;
        this.C = xivVar;
        this.D = jbuVar;
        this.E = izzVar;
        synchronized (obj) {
            this.m = new ArrayList();
            this.p = new ArrayDeque();
            this.n = new ArrayList();
        }
        jca jcaVar = new jca(context);
        this.z = jcaVar;
        try {
            jcaVar.l = jca.d(jcaVar.i, jcaVar.j, str);
            SSLEngine sSLEngineCreateSSLEngine = jcaVar.l.createSSLEngine();
            sSLEngineCreateSSLEngine.getClass();
            jcaVar.m = sSLEngineCreateSSLEngine;
            sSLEngineCreateSSLEngine.setUseClientMode(false);
            sSLEngineCreateSSLEngine.setNeedClientAuth(true);
            jcaVar.n = sSLEngineCreateSSLEngine.getSession().getPacketBufferSize();
            jcaVar.o = sSLEngineCreateSSLEngine.getSession().getApplicationBufferSize();
            jcaVar.h = 1;
            izsVar.a(this);
            ((iyl) izrVar).b = this;
        } finally {
            try {
            } catch (Exception e2) {
            }
        }
    }

    private final void r(yxi yxiVar, yxi yxiVar2) {
        izz izzVar = this.E;
        if (izzVar == null) {
            return;
        }
        int i = izzVar.e;
        if (i != 2) {
            yxiVar = i != 1 ? null : yxiVar2;
        }
        if (yxiVar != null) {
            ols.M(this.k, yxiVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jbj
    public final void a(int i, ByteBuffer byteBuffer) throws abon {
        xkr xkrVar;
        xpb xpbVar;
        yze yzeVar;
        yzf yzfVar;
        par parVar = par.GAL_READ_WRITE_MESSAGE_RAND;
        if (i(i, parVar)) {
            return;
        }
        int i2 = 15;
        int i3 = 11;
        if (this.D.o && !this.F && i != 1 && i != 3 && i != 4 && i != 11 && i != 12 && i != 15 && i != 16 && i != 65535 && i != 255) {
            a.g().ai(1700).w("Terminating connection due to unexpected message %d before SSL handshake complete.", i);
            h(false, yze.PROTOCOL_WRONG_MESSAGE, yzf.UNEXPECTED_MESSAGE, "Unexpected message before SSL");
            return;
        }
        if (i == 1) {
            jbq jbqVar = new jbq(byteBuffer.getShort(), byteBuffer.getShort());
            ols.K(this.k, "com.google.android.gms.car.VERSION_NEGOTIATION", rrx.a.ordinal(), null);
            ypf ypfVar = a;
            ypfVar.f().ai(1688).y("Car requests protocol version %s", jbqVar);
            xpa xpaVar = xpa.a;
            if (i(2, parVar)) {
                return;
            }
            this.s = jbqVar;
            jbq jbqVar2 = d;
            if (jbqVar.compareTo(jbqVar2) > 0) {
                jbqVar2 = e;
            }
            if (xpaVar == null) {
                xkrVar = xkr.STATUS_NO_COMPATIBLE_VERSION;
            } else {
                jbq jbqVar3 = e;
                if (!jbqVar3.s(jbqVar)) {
                    ypfVar.h().ai(1708).M("HU requested protocol %s, but maximum supported is %s", jbqVar, jbqVar3);
                }
                xkrVar = xkr.STATUS_SUCCESS;
            }
            ypfVar.f().ai(1706).R("Requested protocol version %s, negotiated protocol version %s (%s)", jbqVar, jbqVar2, xkrVar.name());
            xiv xivVar = this.C;
            int iE = 8;
            if (!this.s.s(c) || xivVar == null) {
                xpbVar = null;
            } else {
                abnp abnpVarN = xpb.a.n();
                abnpVarN.t();
                xpb xpbVar2 = (xpb) abnpVarN.b;
                xpbVar2.c = xivVar;
                xpbVar2.b |= 1;
                xpbVar = (xpb) abnpVarN.q();
                iE = 8 + xpbVar.e(null);
            }
            jcn jcnVar = new jcn(ByteBuffer.allocate(iE), null, false);
            jcnVar.v((short) 2);
            jcnVar.v((short) jbqVar2.a);
            jcnVar.v((short) jbqVar2.b);
            jcnVar.v((short) xkrVar.I);
            if (xpbVar != null) {
                abnd abndVarH = abnd.H(jcnVar.h());
                try {
                    xpbVar.R(abndVarH);
                    abndVarH.c();
                } catch (IOException e2) {
                    throw new AssertionError("Serializing " + xpbVar.getClass().getName() + " threw an IOException (should never happen)", e2);
                }
            }
            m(jcnVar, false, Optional.empty(), OptionalInt.empty());
            if (xkrVar != xkr.STATUS_SUCCESS) {
                ols.K(this.k, "com.google.android.gms.car.VERSION_NEGOTIATION", rrx.c.ordinal(), null);
                h(true, yze.PROTOCOL_INCOMPATIBLE_VERSION, yzf.BAD_VERSION, "Bad version");
                return;
            } else {
                r(yxi.VERSION_NEGOTIATION_SUCCESS_WIFI, yxi.VERSION_NEGOTIATION_SUCCESS_USB);
                ols.K(this.k, "com.google.android.gms.car.VERSION_NEGOTIATION", rrx.b.ordinal(), null);
                ypfVar.l().ai(1707).u("Waiting for authentication...");
                return;
            }
        }
        if (i == 6) {
            abnv abnvVarC = abnv.C(xob.a, abmw.O(byteBuffer), abnj.a);
            abnv.U(abnvVarC);
            abnv.U(abnvVarC);
            final xob xobVar = (xob) abnvVarC;
            r(yxi.SDP_RESPONSE_RECEIVED_WIFI, yxi.SDP_RESPONSE_RECEIVED_USB);
            ols.K(this.k, "com.google.android.gms.car.SDP_NEGOTIATION", rrx.b.ordinal(), null);
            final izl izlVar = this.r;
            jbq jbqVar4 = this.s;
            final int i4 = jbqVar4.a;
            final int i5 = jbqVar4.b;
            ypf ypfVar2 = izl.a;
            ypfVar2.l().ai(1679).u("Found services:");
            Iterator<E> it = xobVar.c.iterator();
            while (it.hasNext()) {
                ypfVar2.l().ai(1680).y("%s", izl.a((xnz) it.next()));
            }
            new sss(Looper.getMainLooper(), (byte[]) null).post(new Runnable() { // from class: ize
                @Override // java.lang.Runnable
                public final void run() {
                    izl izlVar2 = izlVar;
                    Object obj = izlVar2.z.a;
                    xob xobVar2 = xobVar;
                    aboh<xnz> abohVar = xobVar2.c;
                    jbp jbpVar = (jbp) obj;
                    jbpVar.g = xobVar2;
                    jbpVar.i = new ruv[abohVar.size()];
                    int i6 = 0;
                    for (xnz xnzVar : abohVar) {
                        ruv[] ruvVarArr = jbpVar.i;
                        ruv ruvVar = new ruv();
                        ruvVarArr[i6] = ruvVar;
                        ruvVar.b = xnzVar;
                        ruvVar.a = xnzVar.c;
                        i6++;
                    }
                    int i7 = i5;
                    int i8 = i4;
                    jae jaeVar = izlVar2.s;
                    xobVar2.getClass();
                    joi joiVar = (joi) jaeVar;
                    joiVar.e.post(new joh(joiVar, i8, i7, xobVar2));
                }
            });
            return;
        }
        if (i == 19) {
            abnv abnvVarC2 = abnv.C(xhg.a, abmw.O(byteBuffer), abnj.a);
            abnv.U(abnvVarC2);
            abnv.U(abnvVarC2);
            xhg xhgVar = (xhg) abnvVarC2;
            xhj xhjVarB = xhj.b(xhgVar.b);
            if (xhjVarB == null) {
                xhjVarB = xhj.AUDIO_FOCUS_STATE_INVALID;
            }
            boolean z = xhgVar.c;
            b.f().ai(1683).y("Got audio focus state from car:%s", xhjVarB.name());
            if (this.q != null) {
                this.q.c(xhjVarB, z);
                return;
            } else {
                synchronized (this.l) {
                    this.p.add(Pair.create(xhjVarB, Boolean.valueOf(z)));
                }
                return;
            }
        }
        if (i == 24) {
            abnv abnvVarC3 = abnv.C(xhy.a, abmw.O(byteBuffer), abnj.a);
            abnv.U(abnvVarC3);
            abnv.U(abnvVarC3);
            boolean z2 = ((xhy) abnvVarC3).b;
            yop yopVarAi = a.l().ai(1686);
            Boolean boolValueOf = Boolean.valueOf(z2);
            yopVarAi.y("Call availability status: is call available now? %b", boolValueOf);
            izp izpVar = this.o;
            if (izpVar != null) {
                ((iws) izpVar).m(2, !z2 ? 1 : 0);
                return;
            } else {
                synchronized (this.l) {
                    this.n.add(boolValueOf);
                }
                return;
            }
        }
        if (i == 26) {
            abnv abnvVarC4 = abnv.C(xoc.a, abmw.O(byteBuffer), abnj.a);
            abnv.U(abnvVarC4);
            abnv.U(abnvVarC4);
            xoc xocVar = (xoc) abnvVarC4;
            izl izlVar2 = this.r;
            yop yopVarAi2 = izl.a.l().ai(1681);
            xnz xnzVar = xocVar.c;
            if (xnzVar == null) {
                xnzVar = xnz.a;
            }
            yopVarAi2.y("Updating service: %s", izl.a(xnzVar));
            new sss(Looper.getMainLooper(), (byte[]) null).post(new ino(izlVar2, xocVar, i3));
            return;
        }
        if (i == 255) {
            a.g().ai(1698).u("Terminating connection due to unexpected message error.");
            h(false, yze.PROTOCOL_WRONG_MESSAGE, yzf.UNEXPECTED_MESSAGE, "Unexpected message");
            return;
        }
        if (i == 65535) {
            a.g().ai(1699).u("Terminating connection due to framing error.");
            h(false, yze.PROTOCOL_WRONG_MESSAGE, yzf.FRAMING_ERROR, "Framing error");
            return;
        }
        if (i == 3) {
            jca jcaVar = this.z;
            ByteBuffer byteBufferC = jcaVar.c(byteBuffer);
            if (byteBufferC != null) {
                if (i(3, par.GAL_READ_WRITE_MESSAGE_RAND)) {
                    return;
                } else {
                    n(3, byteBufferC.array(), false, byteBufferC.arrayOffset(), byteBufferC.limit());
                }
            }
            int i6 = jcaVar.h;
            if (i6 == 3) {
                a.l().ai(1685).u("Authentication succeeded! Awaiting auth complete message.");
                return;
            }
            if (i6 != 4) {
                if (i6 != 5) {
                    return;
                } else {
                    i6 = 5;
                }
            }
            a.g().ai(1684).u("Authentication failed. Terminating connection.");
            ols.K(this.k, "com.google.android.gms.car.SSL_NEGOTIATION", rrx.c.ordinal(), null);
            if (i6 == 5) {
                r(yxi.SSL_NEGOTIATION_FAILED_OBSOLETE_SSL_WIFI, yxi.SSL_NEGOTIATION_FAILED_OBSOLETE_SSL_USB);
            }
            h(false, yze.PROTOCOL_AUTH_FAILED, i6 == 4 ? yzf.AUTH_FAILED : yzf.AUTH_FAILED_OBSOLETE_SSL, "Auth failed");
            return;
        }
        if (i == 4) {
            abnv abnvVarC5 = abnv.C(xhk.a, abmw.O(byteBuffer), abnj.a);
            abnv.U(abnvVarC5);
            abnv.U(abnvVarC5);
            xkr xkrVarB = xkr.b(((xhk) abnvVarC5).b);
            if (xkrVarB != xkr.STATUS_SUCCESS) {
                a.g().ai(1695).y("Remote end reported an auth failure: %s", xkrVarB);
                if (xkrVarB == xkr.STATUS_AUTHENTICATION_FAILURE_CERT_EXPIRED) {
                    yzeVar = yze.PROTOCOL_AUTH_FAILED_BY_CAR_CERT_EXPIRED;
                    yzfVar = yzf.AUTH_FAILED_BY_CAR_CERT_EXPIRED;
                } else if (xkrVarB == xkr.STATUS_AUTHENTICATION_FAILURE_CERT_NOT_YET_VALID) {
                    yzeVar = yze.PROTOCOL_AUTH_FAILED_BY_CAR_CERT_NOT_YET_VALID;
                    yzfVar = yzf.AUTH_FAILED_BY_CAR_CERT_NOT_YET_VALID;
                } else {
                    yzeVar = yze.PROTOCOL_AUTH_FAILED_BY_CAR;
                    yzfVar = yzf.AUTH_FAILED_BY_CAR;
                }
                ols.K(this.k, "com.google.android.gms.car.SSL_NEGOTIATION", rrx.c.ordinal(), null);
                h(false, yzeVar, yzfVar, "Remote auth failure");
                return;
            }
            if (this.D.o && this.z.h != 3) {
                a.g().ai(1694).u("Remote end reported auth success but SSL handshake did not complete successfully.");
                ols.K(this.k, "com.google.android.gms.car.SSL_NEGOTIATION", rrx.c.ordinal(), null);
                h(false, yze.PROTOCOL_AUTH_FAILED_BY_CAR, yzf.AUTH_FAILED_BY_CAR, "Auth success received before SSL handshake completed successfully.");
                return;
            }
            r(yxi.SSL_NEGOTIATION_SUCCESS_WIFI, yxi.SSL_NEGOTIATION_SUCCESS_USB);
            ols.K(this.k, "com.google.android.gms.car.SSL_NEGOTIATION", rrx.b.ordinal(), null);
            a.l().ai(1693).u("Remote end reported auth success.");
            izl izlVar3 = this.r;
            jca jcaVar2 = this.z;
            izlVar3.b.f(jcaVar2);
            this.F = true;
            jae jaeVar = this.B;
            if (jaeVar != null) {
                joi joiVar = (joi) jaeVar;
                joiVar.e.post(new jog(joiVar, jcaVar2.d, jcaVar2.e, jcaVar2.f, jcaVar2.g, this));
                return;
            }
            return;
        }
        if (i == 11) {
            izs izsVar = this.y;
            abnv abnvVarC6 = abnv.C(xmh.a, abmw.O(byteBuffer), abnj.a);
            abnv.U(abnvVarC6);
            abnv.U(abnvVarC6);
            izsVar.c((xmh) abnvVarC6);
            return;
        }
        if (i == 12) {
            izs izsVar2 = this.y;
            abnv abnvVarC7 = abnv.C(xmi.a, abmw.O(byteBuffer), abnj.a);
            abnv.U(abnvVarC7);
            abnv.U(abnvVarC7);
            izsVar2.d((xmi) abnvVarC7);
            return;
        }
        switch (i) {
            case 14:
                abnv abnvVarC8 = abnv.C(xkw.a, abmw.O(byteBuffer), abnj.a);
                abnv.U(abnvVarC8);
                abnv.U(abnvVarC8);
                xkw xkwVar = (xkw) abnvVarC8;
                yop yopVarAi3 = a.l().ai(1687);
                xky xkyVarB = xky.b(xkwVar.b);
                if (xkyVarB == null) {
                    xkyVarB = xky.NAV_FOCUS_NATIVE;
                }
                yopVarAi3.y("Navigation focus is now: %s", xkyVarB);
                xky xkyVarB2 = xky.b(xkwVar.b);
                if (xkyVarB2 == null) {
                    xkyVarB2 = xky.NAV_FOCUS_NATIVE;
                }
                izp izpVar2 = this.o;
                if (izpVar2 != null) {
                    izpVar2.b(xkyVarB2 == xky.NAV_FOCUS_PROJECTED);
                    return;
                } else {
                    synchronized (this.l) {
                        this.m.add(xkyVarB2);
                    }
                    return;
                }
            case 15:
                ypf ypfVar3 = a;
                ypfVar3.l().ai(1696).u("received ByeByeRequest");
                abnv abnvVarC9 = abnv.C(xhw.a, abmw.O(byteBuffer), abnj.a);
                abnv.U(abnvVarC9);
                abnv.U(abnvVarC9);
                izr izrVar = this.A;
                xhv xhvVarB = xhv.b(((xhw) abnvVarC9).c);
                if (xhvVarB == null) {
                    xhvVarB = xhv.USER_SELECTION;
                }
                iyl iylVar = (iyl) izrVar;
                izt iztVar = iylVar.b;
                if (iztVar != null) {
                    ypfVar3.l().ai(1705).u("send ByeByeResponse");
                    ((jbj) iztVar).k(16, xhx.a);
                }
                if (iylVar.e && xhvVarB == xhv.DEVICE_SWITCH) {
                    jae jaeVar2 = iylVar.h;
                    ((joi) jaeVar2).e.post(new jgu(jaeVar2, i2));
                    return;
                } else {
                    iylVar.h.aF(yze.PROTOCOL_BYEBYE_REQUESTED_BY_CAR, yzf.BYEBYE_BY_CAR, "reason:".concat(xhvVarB.toString()));
                    ols.M(iylVar.c, yxi.PROJECTION_ENDED_BYEBYE_BY_CAR);
                    return;
                }
            case 16:
                a.l().ai(1697).u("received ByeByeResponse");
                abnv abnvVarC10 = abnv.C(xhx.a, abmw.O(byteBuffer), abnj.a);
                abnv.U(abnvVarC10);
                abnv.U(abnvVarC10);
                izr izrVar2 = this.A;
                yxi yxiVar = yxi.PROJECTION_ENDED_BYEBYE_BY_USER;
                iyl iylVar2 = (iyl) izrVar2;
                if (iylVar2.d) {
                    iylVar2.a();
                    iylVar2.h.aF(yze.PROTOCOL_BYEBYE_REQUESTED_BY_USER, yzf.BYEBYE_BY_USER, "user request");
                } else {
                    iylVar2.h.aF(yze.PROTOCOL_WRONG_MESSAGE, yzf.UNEXPECTED_BYEBYE_RESPONSE, "got ByeByeResponse without request");
                    yxiVar = yxi.PROJECTION_ENDED_UNEXPECTED_BYEBYE_RESPONSE;
                }
                ols.M(iylVar2.c, yxiVar);
                return;
            default:
                a.g().ai(1692).w("Received unexpected message of type %d", i);
                return;
        }
    }

    @Override // defpackage.iyx
    public final void b(int i) {
        if (this.D.k && i == 1) {
            this.q.d();
        }
    }

    @Override // defpackage.izt
    public final void c(xhv xhvVar) {
        a.l().ai(1704).u("send ByeByeRequest");
        abnp abnpVarN = xhw.a.n();
        abnpVarN.t();
        xhw xhwVar = (xhw) abnpVarN.b;
        xhwVar.c = xhvVar.i;
        xhwVar.b |= 1;
        xhw xhwVar2 = (xhw) abnpVarN.q();
        if (this.F) {
            k(15, xhwVar2);
        } else {
            super.o(15, xhwVar2, false, Optional.empty(), OptionalInt.empty());
        }
    }

    @Override // defpackage.izt
    public final void d(long j, boolean z) {
        abnp abnpVarN = xmh.a.n();
        abnpVarN.t();
        xmh xmhVar = (xmh) abnpVarN.b;
        xmhVar.b |= 1;
        xmhVar.c = j;
        abnpVarN.t();
        xmh xmhVar2 = (xmh) abnpVarN.b;
        xmhVar2.b |= 2;
        xmhVar2.d = z;
        k(11, (xmh) abnpVarN.q());
    }

    @Override // defpackage.izt
    public final void e(long j) {
        abnp abnpVarN = xmi.a.n();
        abnpVarN.t();
        xmi xmiVar = (xmi) abnpVarN.b;
        xmiVar.b |= 1;
        xmiVar.c = j;
        k(12, (xmi) abnpVarN.q());
    }

    @Override // defpackage.izt
    public final synchronized void f(int i) {
        abnp abnpVarN = xpi.a.n();
        abnpVarN.t();
        xpi xpiVar = (xpi) abnpVarN.b;
        if (i == 0) {
            throw null;
        }
        xpiVar.c = i;
        xpiVar.b |= 1;
        xpi xpiVar2 = (xpi) abnpVarN.q();
        if (this.q != null) {
            this.q.f(i);
        }
        l(17, xpiVar2, (this.D.k && i == 1) ? OptionalInt.of(1) : OptionalInt.empty());
        if (this.q != null) {
            this.q.e(i);
        }
    }

    @Override // defpackage.jbj
    public final void g() {
        this.y.b();
        ((iyl) this.A).b = null;
        if (this.q != null) {
            this.q.b();
        }
        izp izpVar = this.o;
        if (izpVar != null) {
            synchronized (((iws) izpVar).a) {
                if (((iws) izpVar).b != null) {
                    ((iws) izpVar).h(1);
                    ((iws) izpVar).h(0);
                    ((iws) izpVar).b = null;
                }
                LinkedList linkedList = ((iws) izpVar).d;
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((iwr) it.next()).a();
                }
                linkedList.clear();
                Arrays.fill(((iws) izpVar).c, (Object) null);
            }
        }
        super.g();
    }

    public final void h(boolean z, yze yzeVar, yzf yzfVar, String str) {
        this.x.aF(yzeVar, yzfVar, str);
        this.r.c(z);
    }

    public final boolean i(int i, par parVar) {
        if (!koo.n() || ygr.p(11, 12).contains(Integer.valueOf(i))) {
            return false;
        }
        if (parVar == par.GAL_READ_WRITE_MESSAGE_RAND) {
            koo.m().h(par.GAL_READ_WRITE_MESSAGE_RAND_DELAY);
        }
        return ((Boolean) koo.m().b(parVar, new koe(this, i, 1))).booleanValue();
    }
}
