package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLException;
import javax.net.ssl.TrustManager;

/* loaded from: classes.dex */
public final class rth extends ruq implements rtg {
    private boolean A;
    public String c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public final Object g;
    public final Queue h;
    public rtd i;
    public rta j;
    public rux k;
    private final rtf t;
    private final rvg u;
    private final rte v;
    private final Context w;
    private final rtu x;
    private final ArrayList y;
    private final List z;
    private static final ypf q = ols.R("CAR.GAL.GAL");
    private static final ypf r = ols.R("CAR.GAL.AUDIO");
    private static final rux s = new rux(1, 6);
    static final rux a = new rux(1, 7);
    static final rux b = new rux(6, 1);

    public rth(Context context, rtf rtfVar, rte rteVar, rtu rtuVar, rtx rtxVar) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, KeyManagementException, InvalidAlgorithmParameterException {
        super(1, null, rtuVar, 0);
        Object obj = new Object();
        this.g = obj;
        this.k = new rux(0, 0);
        this.A = false;
        this.w = context;
        this.x = rtuVar;
        this.t = rtfVar;
        this.v = rteVar;
        synchronized (obj) {
            this.y = new ArrayList();
            this.h = new ArrayDeque();
            this.z = new ArrayList();
        }
        rvg rvgVar = new rvg(context);
        this.u = rvgVar;
        vqk vqkVar = rsm.a;
        rlc.a(vqkVar);
        try {
            rvh rvhVar = rvgVar.i;
            SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
            rlc.a(vqkVar);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            ypf ypfVar = rvg.a;
            ypfVar.l().ai(8394).M("Using %s from %s", "AES/CBC/PKCS5Padding", cipher.getProvider());
            byte[] bArr = new byte[48];
            roc.aQ(rvhVar.a().getBytes(StandardCharsets.UTF_8), bArr, rvhVar.c());
            roc.aQ("-----BEGIN CERTIFICATE-----\nMIIDiTCCAnGgAwIBAgIJAMFO56WkVE1CMA0GCSqGSIb3DQEBBQUAMFsxCzAJBgNV\nBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3VudGFpbiBW\naWV3MR8wHQYDVQQKDBZHb29nbGUgQXV0b21vdGl2ZSBMaW5rMB4XDTE0MDYwNjE4\nMjgxOVoXDTQ0MDYwNTE4MjgxOVowWzELMAkGA1UEBhMCVVMxEzARBgNVBAgMCkNh\nbGlmb3JuaWExFjAUBgNVBAcMDU1vdW50YWluIFZpZXcxHzAdBgNVBAoMFkdvb2ds\nZSBBdXRvbW90aXZlIExpbmswggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIB\nAQDUH+iIbwwVb74NdI5eBv/ACFmh4ml/NOW7gUVWdYX50n8uQQsHHLCNIhk5VV2H\nhanvAZ/XXHPuVAPadE2HpnNqePKF/RDo4eJo/+rOief8gBYq/Z+OQTZeLdNm+GoI\nHBrEjU4Ms8IdLuFW0jF8LlIRgekjLHpc7duUl3QpwBlmAWQK40T/SZjprlmhyqfJ\ng1rxFdnGbrSibmCsTmb3m6WZyZUyrcwmd7t6q3pHbMABO+o02asPG/YPj/SJo4+i\nfb5/Nk56f3hH9pBiPKQXJnVUdVLKMXSRgydDBsGSBol4C0JL77MNDrMR5jdafJ4j\nmWmsa2+mnzoAv9AxEL9T0LiNAgMBAAGjUDBOMB0GA1UdDgQWBBS5dqvv8DPQiwrM\nfgn8xKR91k7wgjAfBgNVHSMEGDAWgBS5dqvv8DPQiwrMfgn8xKR91k7wgjAMBgNV\nHRMEBTADAQH/MA0GCSqGSIb3DQEBBQUAA4IBAQDKcnBsrbB0Jbz2VGJKP2lwYB6P\ndCTCCpQu7dVp61UQOX+zWfd2hnNMnLs/r1xPO+eyN0vmw7sD05phaIhbXVauKWZi\n9WqWHTaR+9s6CTyBOc1Mye0DMj+4vHt+WLmf0lYjkYUVYvR1EImX8ktXzkVmOqn+\ne30siqlZ8pQpsOgegIKfJ+pNQM8c3eXVv3KFMUgjZW33SziZL8IMsLvSO+1LtH37\nKqbTEMP6XUwVuZopgGvaHU74eT/WSRGlL7vX4OL5/UXXP4qsGH2Zp7uQlErv4H9j\nkMs37UL1vGb4M8RM7Eyu9/RulepSmqZUF+3i+3eby8iGq/3OWk9wgJf7AXnx\n-----END CERTIFICATE-----\n".getBytes(StandardCharsets.UTF_8), bArr, rvhVar.c());
            for (int i = 0; i < 7; i++) {
                roc.aQ(bArr, bArr, rvhVar.c());
            }
            byte[] bArr2 = new byte[32];
            System.arraycopy(bArr, 0, bArr2, 0, 32);
            cipher.init(2, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(bArr, 32, 16));
            PrivateKey privateKeyN = roc.n(cipher.doFinal(rvhVar.b()));
            rlc.a(vqkVar);
            rve rveVar = new rve(privateKeyN, rvhVar.a(), 0);
            sSLContext.init(new KeyManager[]{rveVar}, new TrustManager[]{rveVar.a}, null);
            ypfVar.f().ai(8372).M("Successfully initialized SSL context for protocol: %s using provider: %s", sSLContext.getProtocol(), sSLContext.getProvider().getName());
            rvgVar.k = sSLContext;
            SSLEngine sSLEngineCreateSSLEngine = rvgVar.k.createSSLEngine();
            sSLEngineCreateSSLEngine.getClass();
            rvgVar.l = sSLEngineCreateSSLEngine;
            sSLEngineCreateSSLEngine.setUseClientMode(false);
            sSLEngineCreateSSLEngine.setNeedClientAuth(true);
            rvgVar.m = sSLEngineCreateSSLEngine.getSession().getPacketBufferSize();
            rvgVar.n = sSLEngineCreateSSLEngine.getSession().getApplicationBufferSize();
            rvgVar.h = 1;
            rlc.a(rsm.a);
            rtf rtfVar2 = this.t;
            synchronized (((run) rtfVar2).b) {
                ((run) rtfVar2).d = this;
            }
            ((rsi) this.v).b = this;
            if (rtxVar != null) {
                this.k = new rux(rtxVar.a, rtxVar.b);
                this.A = true;
            }
        } catch (Exception e) {
            rvg.a.g().p(e).ai(8405).u("Exception initializing SSL engine");
            rlc.a(rsm.a);
            q.g().ai(8261).u("Failed to initialize ssl library!");
        }
    }

    private final void i(boolean z, yze yzeVar, yzf yzfVar, String str) {
        this.p.p(yzeVar, yzfVar, str);
        this.j.c(z);
    }

    @Override // defpackage.rtg
    public final void a(xhi xhiVar) {
        r.f().ai(8277).y("sent audio focus request: %s", xhiVar.name());
        abnp abnpVarN = xhh.a.n();
        abnpVarN.t();
        xhh xhhVar = (xhh) abnpVarN.b;
        xhhVar.c = xhiVar.e;
        xhhVar.b |= 1;
        super.o(18, (xhh) abnpVarN.q(), true);
    }

    @Override // defpackage.rtg
    public final void b(xhv xhvVar) {
        q.l().ai(8278).u("send ByeByeRequest");
        abnp abnpVarN = xhw.a.n();
        abnpVarN.t();
        xhw xhwVar = (xhw) abnpVarN.b;
        xhwVar.c = xhvVar.i;
        xhwVar.b |= 1;
        xhw xhwVar2 = (xhw) abnpVarN.q();
        if (this.A) {
            super.o(15, xhwVar2, true);
        } else {
            super.o(15, xhwVar2, false);
        }
    }

    @Override // defpackage.rtg
    public final void c() {
        abnp abnpVarN = xoa.a.n();
        byte[] bArr = this.d;
        if (bArr != null) {
            abms abmsVarV = abms.v(bArr);
            abnpVarN.t();
            xoa xoaVar = (xoa) abnpVarN.b;
            abmsVarV.getClass();
            xoaVar.b |= 1;
            xoaVar.c = abmsVarV;
        }
        byte[] bArr2 = this.e;
        if (bArr2 != null) {
            abms abmsVarV2 = abms.v(bArr2);
            abnpVarN.t();
            xoa xoaVar2 = (xoa) abnpVarN.b;
            abmsVarV2.getClass();
            xoaVar2.b |= 2;
            xoaVar2.d = abmsVarV2;
        }
        byte[] bArr3 = this.f;
        if (bArr3 != null) {
            abms abmsVarV3 = abms.v(bArr3);
            abnpVarN.t();
            xoa xoaVar3 = (xoa) abnpVarN.b;
            abmsVarV3.getClass();
            xoaVar3.b |= 4;
            xoaVar3.e = abmsVarV3;
        }
        String str = this.c;
        if (str != null) {
            abnpVarN.t();
            xoa xoaVar4 = (xoa) abnpVarN.b;
            xoaVar4.b |= 8;
            xoaVar4.f = str;
        }
        this.k.r(s);
        this.d = null;
        this.e = null;
        this.f = null;
        this.c = null;
        ols.L(this.w, "com.google.android.gms.car.SDP_NEGOTIATION", rrx.a, null);
        String str2 = Build.MANUFACTURER;
        String strBJ = Build.MODEL;
        if (!strBJ.startsWith(str2)) {
            strBJ = a.bJ(strBJ, str2, " ");
        }
        abnpVarN.t();
        xoa xoaVar5 = (xoa) abnpVarN.b;
        strBJ.getClass();
        xoaVar5.b |= 16;
        xoaVar5.g = strBJ;
        super.o(5, abnpVarN.q(), true);
    }

    @Override // defpackage.ruq
    protected final void d(int i, ByteBuffer byteBuffer) throws SSLException, abon {
        xkr xkrVar;
        yze yzeVar;
        yzf yzfVar;
        if (i == 1) {
            rux ruxVar = new rux(byteBuffer.getShort(), byteBuffer.getShort());
            Context context = this.w;
            ols.L(context, "com.google.android.gms.car.VERSION_NEGOTIATION", rrx.a, null);
            ypf ypfVar = q;
            ypfVar.f().ai(8267).y("Car requests protocol version %s", ruxVar);
            xpa xpaVar = xpa.a;
            this.k = ruxVar;
            rux ruxVar2 = a;
            if (ruxVar.compareTo(ruxVar2) > 0) {
                ruxVar2 = b;
            }
            if (xpaVar == null) {
                xkrVar = xkr.STATUS_NO_COMPATIBLE_VERSION;
            } else {
                rux ruxVar3 = b;
                if (!ruxVar3.r(ruxVar)) {
                    ypfVar.h().ai(8282).M("HU requested protocol %s, but maximum supported is %s", ruxVar, ruxVar3);
                }
                xkrVar = xkr.STATUS_SUCCESS;
            }
            ypfVar.f().ai(8280).R("Requested protocol version %s, negotiated protocol version %s (%s)", ruxVar, ruxVar2, xkrVar.name());
            this.k.r(s);
            ByteBuffer byteBufferA = rvj.a.a(8);
            byteBufferA.putShort((short) 2);
            byteBufferA.putShort((short) ruxVar2.a);
            byteBufferA.putShort((short) ruxVar2.b);
            byteBufferA.putShort((short) xkrVar.I);
            m(byteBufferA, false);
            if (xkrVar == xkr.STATUS_SUCCESS) {
                ols.L(context, "com.google.android.gms.car.VERSION_NEGOTIATION", rrx.b, null);
                ypfVar.l().ai(8281).u("Waiting for authentication...");
                return;
            } else {
                ols.L(context, "com.google.android.gms.car.VERSION_NEGOTIATION", rrx.c, null);
                i(true, yze.PROTOCOL_INCOMPATIBLE_VERSION, yzf.BAD_VERSION, "Bad version");
                return;
            }
        }
        if (i == 6) {
            xob xobVar = (xob) abnv.w(xob.a, byteBuffer);
            ols.L(this.w, "com.google.android.gms.car.SDP_NEGOTIATION", rrx.b, null);
            rta rtaVar = this.j;
            rux ruxVar4 = this.k;
            int i2 = ruxVar4.a;
            int i3 = ruxVar4.b;
            ypf ypfVar2 = rta.a;
            ypfVar2.l().ai(8258).u("Found services:");
            Iterator<E> it = xobVar.c.iterator();
            while (it.hasNext()) {
                ypfVar2.l().ai(8259).y("%s", rta.a((xnz) it.next()));
            }
            new sss(Looper.getMainLooper()).post(new jlj(rtaVar, xobVar, i2, i3, 3));
            return;
        }
        if (i == 19) {
            xhg xhgVar = (xhg) abnv.w(xhg.a, byteBuffer);
            xhj xhjVarB = xhj.b(xhgVar.b);
            if (xhjVarB == null) {
                xhjVarB = xhj.AUDIO_FOCUS_STATE_INVALID;
            }
            boolean z = xhgVar.c;
            r.f().ai(8262).y("Got audio focus state from car:%s", xhjVarB.name());
            rtd rtdVar = this.i;
            if (rtdVar != null) {
                rtdVar.f(xhjVarB, z);
                return;
            }
            synchronized (this.g) {
                this.h.add(Pair.create(xhjVarB, Boolean.valueOf(z)));
            }
            return;
        }
        if (i == 24) {
            boolean z2 = ((xhy) abnv.w(xhy.a, byteBuffer)).b;
            yop yopVarAi = q.l().ai(8265);
            Boolean boolValueOf = Boolean.valueOf(z2);
            yopVarAi.y("Call availability status: is call available now? %b", boolValueOf);
            synchronized (this.g) {
                this.z.add(boolValueOf);
            }
            return;
        }
        if (i == 26) {
            xoc xocVar = (xoc) abnv.w(xoc.a, byteBuffer);
            rta rtaVar2 = this.j;
            yop yopVarAi2 = rta.a.l().ai(8260);
            xnz xnzVar = xocVar.c;
            if (xnzVar == null) {
                xnzVar = xnz.a;
            }
            yopVarAi2.y("Updating service: %s", rta.a(xnzVar));
            new sss(Looper.getMainLooper()).post(new rpo(rtaVar2, xocVar, 2, null));
            return;
        }
        if (i == 255) {
            q.g().ai(8275).u("Terminating connection due to unexpected message error.");
            i(false, yze.PROTOCOL_WRONG_MESSAGE, yzf.UNEXPECTED_MESSAGE, "Unexpected message");
            return;
        }
        if (i == 65535) {
            q.g().ai(8276).u("Terminating connection due to framing error.");
            i(false, yze.PROTOCOL_WRONG_MESSAGE, yzf.FRAMING_ERROR, "Framing error");
            return;
        }
        if (i == 3) {
            rvg rvgVar = this.u;
            ByteBuffer byteBufferA2 = rvgVar.a(byteBuffer);
            if (byteBufferA2 != null) {
                n(3, byteBufferA2.array(), false, byteBufferA2.arrayOffset(), byteBufferA2.limit());
                rvj.a.b(byteBufferA2);
            }
            int i4 = rvgVar.h;
            if (i4 == 3) {
                q.l().ai(8264).u("Authentication succeeded! Awaiting auth complete message.");
                return;
            } else {
                if (i4 == 4) {
                    q.g().ai(8263).u("Authentication failed. Terminating connection.");
                    ols.L(this.w, "com.google.android.gms.car.SSL_NEGOTIATION", rrx.c, null);
                    i(false, yze.PROTOCOL_AUTH_FAILED, yzf.AUTH_FAILED, "Auth failed");
                    return;
                }
                return;
            }
        }
        if (i == 4) {
            xkr xkrVarB = xkr.b(((xhk) abnv.w(xhk.a, byteBuffer)).b);
            if (xkrVarB == xkr.STATUS_SUCCESS) {
                ols.L(this.w, "com.google.android.gms.car.SSL_NEGOTIATION", rrx.b, null);
                q.l().ai(8271).u("Remote end reported auth success.");
                rta rtaVar3 = this.j;
                rvg rvgVar2 = this.u;
                rtaVar3.b.f(rvgVar2);
                this.A = true;
                rtu rtuVar = this.x;
                if (rtuVar != null) {
                    rtuVar.a(this, rvgVar2.d, rvgVar2.e, rvgVar2.f, rvgVar2.g);
                    return;
                }
                return;
            }
            q.g().ai(8272).y("Remote end reported an auth failure: %s", xkrVarB);
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
            ols.L(this.w, "com.google.android.gms.car.SSL_NEGOTIATION", rrx.c, null);
            i(false, yzeVar, yzfVar, "Remote auth failure");
            return;
        }
        if (i == 11) {
            rtf rtfVar = this.t;
            xmh xmhVar = (xmh) abnv.w(xmh.a, byteBuffer);
            long j = xmhVar.c;
            run runVar = (run) rtfVar;
            if (runVar.c) {
                run.a.l().ai(8335).u("PingRequest received. Ignoring");
                return;
            }
            synchronized (runVar.b) {
                Object obj = ((run) rtfVar).d;
                if (obj != null) {
                    long j2 = xmhVar.c;
                    abnp abnpVarN = xmi.a.n();
                    abnpVarN.t();
                    xmi xmiVar = (xmi) abnpVarN.b;
                    xmiVar.b |= 1;
                    xmiVar.c = j2;
                    super.o(12, (xmi) abnpVarN.q(), true);
                } else {
                    run.a.f().ai(8334).u("onPingRequest: ControlEndPoint has not been registered");
                }
            }
            return;
        }
        if (i == 12) {
            long j3 = ((xmi) abnv.w(xmi.a, byteBuffer)).c;
            return;
        }
        switch (i) {
            case 14:
                xkw xkwVar = (xkw) abnv.w(xkw.a, byteBuffer);
                yop yopVarAi3 = q.l().ai(8266);
                xky xkyVarB = xky.b(xkwVar.b);
                if (xkyVarB == null) {
                    xkyVarB = xky.NAV_FOCUS_NATIVE;
                }
                yopVarAi3.y("Navigation focus is now: %s", xkyVarB);
                xky xkyVarB2 = xky.b(xkwVar.b);
                if (xkyVarB2 == null) {
                    xkyVarB2 = xky.NAV_FOCUS_NATIVE;
                }
                synchronized (this.g) {
                    this.y.add(xkyVarB2);
                }
                return;
            case 15:
                ypf ypfVar3 = q;
                ypfVar3.l().ai(8273).u("received ByeByeRequest");
                xhw xhwVar = (xhw) abnv.w(xhw.a, byteBuffer);
                rte rteVar = this.v;
                xhv xhvVarB = xhv.b(xhwVar.c);
                if (xhvVarB == null) {
                    xhvVarB = xhv.USER_SELECTION;
                }
                rsi rsiVar = (rsi) rteVar;
                Object obj2 = rsiVar.b;
                if (obj2 != null) {
                    ypfVar3.l().ai(8279).u("send ByeByeResponse");
                    super.o(16, xhx.a, true);
                }
                boolean z3 = rsiVar.e;
                if (xhvVarB == xhv.DEVICE_SWITCH) {
                    rsiVar.j.d();
                    return;
                } else {
                    rsiVar.j.p(yze.PROTOCOL_BYEBYE_REQUESTED_BY_CAR, yzf.BYEBYE_BY_CAR, "reason:".concat(xhvVarB.toString()));
                    ols.M(rsiVar.c, yxi.PROJECTION_ENDED_BYEBYE_BY_CAR);
                    return;
                }
            case 16:
                q.l().ai(8274).u("received ByeByeResponse");
                rte rteVar2 = this.v;
                yxi yxiVar = yxi.PROJECTION_ENDED_BYEBYE_BY_USER;
                rsi rsiVar2 = (rsi) rteVar2;
                if (rsiVar2.d) {
                    rsiVar2.a();
                    rsiVar2.j.p(yze.PROTOCOL_BYEBYE_REQUESTED_BY_USER, yzf.BYEBYE_BY_USER, "user request");
                } else {
                    rsiVar2.j.p(yze.PROTOCOL_WRONG_MESSAGE, yzf.UNEXPECTED_BYEBYE_RESPONSE, "got ByeByeResponse without request");
                    yxiVar = yxi.PROJECTION_ENDED_UNEXPECTED_BYEBYE_RESPONSE;
                }
                ols.M(rsiVar2.c, yxiVar);
                return;
            default:
                q.g().ai(8270).w("Received unexpected message of type %d", i);
                return;
        }
    }

    @Override // defpackage.ruq
    public final void w(Bundle bundle) {
        if (!this.A || this.c != null) {
            throw new IllegalStateException("Can't suspend ControlEndPoint");
        }
        rvg rvgVar = this.u;
        int i = rvgVar.h;
        if (i != 3) {
            throw new IllegalStateException(a.bn(i, "Can't suspend SslWrapper:", " false"));
        }
        bundle.putString("peer_cert_name", rvgVar.d);
        bundle.putLong("peer_cert_serial_number", rvgVar.e);
        bundle.putString("peer_cert_not_before", rvgVar.f);
        bundle.putString("peer_cert_not_after", rvgVar.g);
        bundle.putInt("net_buffer_size", rvgVar.m);
        bundle.putInt("app_buffer_size", rvgVar.n);
        SSLContext sSLContext = rvgVar.k;
        ypf ypfVar = ruw.a;
        bundle.putBinder("ssl_context", new ruc(sSLContext));
        bundle.putBinder("ssl_engine", new ruc(rvgVar.l));
        synchronized (this.g) {
            Queue queue = this.h;
            if (!queue.isEmpty()) {
                bundle.putBinder("audio_focus_msgs", new ruc(queue));
            }
            ArrayList arrayList = this.y;
            ArrayList<Integer> arrayList2 = new ArrayList<>(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((xky) it.next()).c));
            }
            bundle.putIntegerArrayList("nav_focus_msgs_key", arrayList2);
            List list = this.z;
            boolean[] zArr = new boolean[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                zArr[i2] = ((Boolean) list.get(i2)).booleanValue();
            }
            bundle.putBooleanArray("call_status_msgs_key", zArr);
        }
        bundle.putInt("hu_major_version", this.k.a);
        bundle.putInt("hu_minor_version", this.k.b);
    }

    @Override // defpackage.ruq
    public final void x() {
        rtf rtfVar = this.t;
        synchronized (((run) rtfVar).b) {
            ((run) rtfVar).d = null;
        }
        ((rsi) this.v).b = null;
        rtd rtdVar = this.i;
        if (rtdVar != null) {
            rtdVar.e();
        }
        super.x();
    }

    @Override // defpackage.rsp
    public final void e(int i) {
    }
}
