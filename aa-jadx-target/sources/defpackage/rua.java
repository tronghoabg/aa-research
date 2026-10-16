package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rua extends defpackage.rvj implements defpackage.rtz {
    private boolean A;
    public java.lang.String c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public final java.lang.Object g;
    public final java.util.Queue h;
    public rtw i;
    public defpackage.rtt j;
    public defpackage.rvq k;
    private final defpackage.rty t;
    private final defpackage.rvz u;
    private final defpackage.rtx v;
    private final android.content.Context w;
    private final defpackage.run x;
    private final java.util.ArrayList y;
    private final java.util.List z;
    private static final defpackage.yqk q = defpackage.omv.n("CAR.GAL.GAL");
    private static final defpackage.yqk r = defpackage.omv.n("CAR.GAL.AUDIO");
    private static final defpackage.rvq s = new defpackage.rvq(1, 6);
    static final defpackage.rvq a = new defpackage.rvq(1, 7);
    static final defpackage.rvq b = new defpackage.rvq(6, 1);

    public rua(android.content.Context context, defpackage.rty rtyVar, defpackage.rtx rtxVar, defpackage.run runVar, defpackage.ruq ruqVar) {
        super(1, null, runVar, 0);
        java.lang.Object obj = new java.lang.Object();
        this.g = obj;
        this.k = new defpackage.rvq(0, 0);
        this.A = false;
        this.w = context;
        this.x = runVar;
        this.t = rtyVar;
        this.v = rtxVar;
        synchronized (obj) {
            this.y = new java.util.ArrayList();
            this.h = new java.util.ArrayDeque();
            this.z = new java.util.ArrayList();
        }
        defpackage.rvz rvzVar = new defpackage.rvz(context);
        this.u = rvzVar;
        defpackage.kwv kwvVar = defpackage.rtg.a;
        defpackage.rly.a(kwvVar);
        try {
            defpackage.rwa rwaVar = rvzVar.i;
            javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLSv1.2");
            defpackage.rly.a(kwvVar);
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
            defpackage.yqk yqkVar = defpackage.rvz.a;
            yqkVar.l().ai(8419).M("Using %s from %s", "AES/CBC/PKCS5Padding", cipher.getProvider());
            byte[] bArr = new byte[48];
            defpackage.tna.ba(rwaVar.a().getBytes(java.nio.charset.StandardCharsets.UTF_8), bArr, rwaVar.c());
            defpackage.tna.ba("-----BEGIN CERTIFICATE-----\nMIIDiTCCAnGgAwIBAgIJAMFO56WkVE1CMA0GCSqGSIb3DQEBBQUAMFsxCzAJBgNV\nBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3VudGFpbiBW\naWV3MR8wHQYDVQQKDBZHb29nbGUgQXV0b21vdGl2ZSBMaW5rMB4XDTE0MDYwNjE4\nMjgxOVoXDTQ0MDYwNTE4MjgxOVowWzELMAkGA1UEBhMCVVMxEzARBgNVBAgMCkNh\nbGlmb3JuaWExFjAUBgNVBAcMDU1vdW50YWluIFZpZXcxHzAdBgNVBAoMFkdvb2ds\nZSBBdXRvbW90aXZlIExpbmswggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIB\nAQDUH+iIbwwVb74NdI5eBv/ACFmh4ml/NOW7gUVWdYX50n8uQQsHHLCNIhk5VV2H\nhanvAZ/XXHPuVAPadE2HpnNqePKF/RDo4eJo/+rOief8gBYq/Z+OQTZeLdNm+GoI\nHBrEjU4Ms8IdLuFW0jF8LlIRgekjLHpc7duUl3QpwBlmAWQK40T/SZjprlmhyqfJ\ng1rxFdnGbrSibmCsTmb3m6WZyZUyrcwmd7t6q3pHbMABO+o02asPG/YPj/SJo4+i\nfb5/Nk56f3hH9pBiPKQXJnVUdVLKMXSRgydDBsGSBol4C0JL77MNDrMR5jdafJ4j\nmWmsa2+mnzoAv9AxEL9T0LiNAgMBAAGjUDBOMB0GA1UdDgQWBBS5dqvv8DPQiwrM\nfgn8xKR91k7wgjAfBgNVHSMEGDAWgBS5dqvv8DPQiwrMfgn8xKR91k7wgjAMBgNV\nHRMEBTADAQH/MA0GCSqGSIb3DQEBBQUAA4IBAQDKcnBsrbB0Jbz2VGJKP2lwYB6P\ndCTCCpQu7dVp61UQOX+zWfd2hnNMnLs/r1xPO+eyN0vmw7sD05phaIhbXVauKWZi\n9WqWHTaR+9s6CTyBOc1Mye0DMj+4vHt+WLmf0lYjkYUVYvR1EImX8ktXzkVmOqn+\ne30siqlZ8pQpsOgegIKfJ+pNQM8c3eXVv3KFMUgjZW33SziZL8IMsLvSO+1LtH37\nKqbTEMP6XUwVuZopgGvaHU74eT/WSRGlL7vX4OL5/UXXP4qsGH2Zp7uQlErv4H9j\nkMs37UL1vGb4M8RM7Eyu9/RulepSmqZUF+3i+3eby8iGq/3OWk9wgJf7AXnx\n-----END CERTIFICATE-----\n".getBytes(java.nio.charset.StandardCharsets.UTF_8), bArr, rwaVar.c());
            for (int i = 0; i < 7; i++) {
                defpackage.tna.ba(bArr, bArr, rwaVar.c());
            }
            byte[] bArr2 = new byte[32];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, 32);
            cipher.init(2, new javax.crypto.spec.SecretKeySpec(bArr2, "AES"), new javax.crypto.spec.IvParameterSpec(bArr, 32, 16));
            java.security.PrivateKey privateKeyX = defpackage.tna.x(cipher.doFinal(rwaVar.b()));
            defpackage.rly.a(kwvVar);
            defpackage.rvx rvxVar = new defpackage.rvx(privateKeyX, rwaVar.a(), 0);
            sSLContext.init(new javax.net.ssl.KeyManager[]{rvxVar}, new javax.net.ssl.TrustManager[]{rvxVar.a}, null);
            yqkVar.f().ai(8397).M("Successfully initialized SSL context for protocol: %s using provider: %s", sSLContext.getProtocol(), sSLContext.getProvider().getName());
            rvzVar.k = sSLContext;
            javax.net.ssl.SSLEngine sSLEngineCreateSSLEngine = rvzVar.k.createSSLEngine();
            sSLEngineCreateSSLEngine.getClass();
            rvzVar.l = sSLEngineCreateSSLEngine;
            sSLEngineCreateSSLEngine.setUseClientMode(false);
            sSLEngineCreateSSLEngine.setNeedClientAuth(true);
            rvzVar.m = sSLEngineCreateSSLEngine.getSession().getPacketBufferSize();
            rvzVar.n = sSLEngineCreateSSLEngine.getSession().getApplicationBufferSize();
            rvzVar.h = 1;
            defpackage.rly.a(defpackage.rtg.a);
            defpackage.rty rtyVar2 = this.t;
            synchronized (((defpackage.rvg) rtyVar2).b) {
                ((defpackage.rvg) rtyVar2).d = this;
            }
            ((defpackage.rtc) this.v).b = this;
            if (ruqVar != null) {
                this.k = new defpackage.rvq(ruqVar.a, ruqVar.b);
                this.A = true;
            }
        } catch (java.lang.Exception e) {
            defpackage.rvz.a.g().p(e).ai(8430).u("Exception initializing SSL engine");
            defpackage.rly.a(defpackage.rtg.a);
            q.g().ai(8286).u("Failed to initialize ssl library!");
        }
    }

    private final void i(boolean z, defpackage.zaj zajVar, defpackage.zak zakVar, java.lang.String str) {
        this.p.p(zajVar, zakVar, str);
        this.j.c(z);
    }

    @Override // defpackage.rtz
    public final void a(defpackage.xij xijVar) {
        r.f().ai(8302).y("sent audio focus request: %s", xijVar.name());
        defpackage.abor aborVarN = defpackage.xii.a.n();
        aborVarN.t();
        defpackage.xii xiiVar = (defpackage.xii) aborVarN.b;
        xiiVar.c = xijVar.e;
        xiiVar.b |= 1;
        super.o(18, (defpackage.xii) aborVarN.q(), true);
    }

    @Override // defpackage.rtz
    public final void b(xiw xiwVar) {
        q.l().ai(8303).u("send ByeByeRequest");
        defpackage.abor aborVarN = xix.a.n();
        aborVarN.t();
        xix xixVar = aborVarN.b;
        xixVar.c = xiwVar.i;
        xixVar.b |= 1;
        xix xixVarQ = aborVarN.q();
        if (this.A) {
            super.o(15, xixVarQ, true);
        } else {
            super.o(15, xixVarQ, false);
        }
    }

    @Override // defpackage.rtz
    public final void c() {
        defpackage.abor aborVarN = defpackage.xpb.a.n();
        byte[] bArr = this.d;
        if (bArr != null) {
            defpackage.abnv abnvVarV = defpackage.abnv.v(bArr);
            aborVarN.t();
            defpackage.xpb xpbVar = (defpackage.xpb) aborVarN.b;
            abnvVarV.getClass();
            xpbVar.b |= 1;
            xpbVar.c = abnvVarV;
        }
        byte[] bArr2 = this.e;
        if (bArr2 != null) {
            defpackage.abnv abnvVarV2 = defpackage.abnv.v(bArr2);
            aborVarN.t();
            defpackage.xpb xpbVar2 = (defpackage.xpb) aborVarN.b;
            abnvVarV2.getClass();
            xpbVar2.b |= 2;
            xpbVar2.d = abnvVarV2;
        }
        byte[] bArr3 = this.f;
        if (bArr3 != null) {
            defpackage.abnv abnvVarV3 = defpackage.abnv.v(bArr3);
            aborVarN.t();
            defpackage.xpb xpbVar3 = (defpackage.xpb) aborVarN.b;
            abnvVarV3.getClass();
            xpbVar3.b |= 4;
            xpbVar3.e = abnvVarV3;
        }
        java.lang.String str = this.c;
        if (str != null) {
            aborVarN.t();
            defpackage.xpb xpbVar4 = (defpackage.xpb) aborVarN.b;
            xpbVar4.b |= 8;
            xpbVar4.f = str;
        }
        this.k.C(s);
        this.d = null;
        this.e = null;
        this.f = null;
        this.c = null;
        defpackage.omv.h(this.w, "com.google.android.gms.car.SDP_NEGOTIATION", defpackage.rsr.a, null);
        java.lang.String str2 = android.os.Build.MANUFACTURER;
        java.lang.String strBI = android.os.Build.MODEL;
        if (!strBI.startsWith(str2)) {
            strBI = defpackage.a.bI(strBI, str2, " ");
        }
        aborVarN.t();
        defpackage.xpb xpbVar5 = (defpackage.xpb) aborVarN.b;
        strBI.getClass();
        xpbVar5.b |= 16;
        xpbVar5.g = strBI;
        super.o(5, aborVarN.q(), true);
    }

    @Override // defpackage.rvj
    protected final void d(int i, java.nio.ByteBuffer byteBuffer) throws defpackage.abpp {
        defpackage.xls xlsVar;
        defpackage.zaj zajVar;
        defpackage.zak zakVar;
        byte[] bArr = null;
        if (i == 1) {
            defpackage.rvq rvqVar = new defpackage.rvq(byteBuffer.getShort(), byteBuffer.getShort());
            android.content.Context context = this.w;
            defpackage.omv.h(context, "com.google.android.gms.car.VERSION_NEGOTIATION", defpackage.rsr.a, null);
            defpackage.yqk yqkVar = q;
            yqkVar.f().ai(8292).y("Car requests protocol version %s", rvqVar);
            defpackage.xqb xqbVar = defpackage.xqb.a;
            this.k = rvqVar;
            defpackage.rvq rvqVar2 = a;
            if (rvqVar.compareTo(rvqVar2) > 0) {
                rvqVar2 = b;
            }
            if (xqbVar == null) {
                xlsVar = defpackage.xls.STATUS_NO_COMPATIBLE_VERSION;
            } else {
                defpackage.rvq rvqVar3 = b;
                if (!rvqVar3.C(rvqVar)) {
                    yqkVar.h().ai(8307).M("HU requested protocol %s, but maximum supported is %s", rvqVar, rvqVar3);
                }
                xlsVar = defpackage.xls.STATUS_SUCCESS;
            }
            yqkVar.f().ai(8305).R("Requested protocol version %s, negotiated protocol version %s (%s)", rvqVar, rvqVar2, xlsVar.name());
            this.k.C(s);
            java.nio.ByteBuffer byteBufferA = defpackage.rwc.a.a(8);
            byteBufferA.putShort((short) 2);
            byteBufferA.putShort((short) rvqVar2.a);
            byteBufferA.putShort((short) rvqVar2.b);
            byteBufferA.putShort((short) xlsVar.I);
            m(byteBufferA, false);
            if (xlsVar == defpackage.xls.STATUS_SUCCESS) {
                defpackage.omv.h(context, "com.google.android.gms.car.VERSION_NEGOTIATION", defpackage.rsr.b, null);
                yqkVar.l().ai(8306).u("Waiting for authentication...");
                return;
            } else {
                defpackage.omv.h(context, "com.google.android.gms.car.VERSION_NEGOTIATION", defpackage.rsr.c, null);
                i(true, defpackage.zaj.PROTOCOL_INCOMPATIBLE_VERSION, defpackage.zak.BAD_VERSION, "Bad version");
                return;
            }
        }
        if (i == 6) {
            defpackage.xpc xpcVar = (defpackage.xpc) defpackage.abox.w(defpackage.xpc.a, byteBuffer);
            defpackage.omv.h(this.w, "com.google.android.gms.car.SDP_NEGOTIATION", defpackage.rsr.b, null);
            defpackage.rtt rttVar = this.j;
            defpackage.rvq rvqVar4 = this.k;
            int i2 = rvqVar4.a;
            int i3 = rvqVar4.b;
            defpackage.yqk yqkVar2 = defpackage.rtt.a;
            yqkVar2.l().ai(8283).u("Found services:");
            java.util.Iterator<E> it = xpcVar.c.iterator();
            while (it.hasNext()) {
                yqkVar2.l().ai(8284).y("%s", defpackage.rtt.a((defpackage.xpa) it.next()));
            }
            new defpackage.stq(android.os.Looper.getMainLooper()).post(new jlq(rttVar, xpcVar, i2, i3, 3));
            return;
        }
        if (i == 19) {
            defpackage.xih xihVar = (defpackage.xih) defpackage.abox.w(defpackage.xih.a, byteBuffer);
            defpackage.xik xikVarB = defpackage.xik.b(xihVar.b);
            if (xikVarB == null) {
                xikVarB = defpackage.xik.AUDIO_FOCUS_STATE_INVALID;
            }
            boolean z = xihVar.c;
            r.f().ai(8287).y("Got audio focus state from car:%s", xikVarB.name());
            rtw rtwVar = this.i;
            if (rtwVar != null) {
                rtwVar.f(xikVarB, z);
                return;
            }
            synchronized (this.g) {
                this.h.add(android.util.Pair.create(xikVarB, java.lang.Boolean.valueOf(z)));
            }
            return;
        }
        if (i == 24) {
            boolean z2 = defpackage.abox.w(xiz.a, byteBuffer).b;
            defpackage.ypu ypuVarAi = q.l().ai(8290);
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z2);
            ypuVarAi.y("Call availability status: is call available now? %b", boolValueOf);
            synchronized (this.g) {
                this.z.add(boolValueOf);
            }
            return;
        }
        if (i == 26) {
            xpd xpdVarW = defpackage.abox.w(xpd.a, byteBuffer);
            defpackage.rtt rttVar2 = this.j;
            defpackage.ypu ypuVarAi2 = defpackage.rtt.a.l().ai(8285);
            defpackage.xpa xpaVar = xpdVarW.c;
            if (xpaVar == null) {
                xpaVar = defpackage.xpa.a;
            }
            ypuVarAi2.y("Updating service: %s", defpackage.rtt.a(xpaVar));
            new defpackage.stq(android.os.Looper.getMainLooper()).post(new defpackage.ron(rttVar2, xpdVarW, 5, bArr));
            return;
        }
        if (i == 255) {
            q.g().ai(8300).u("Terminating connection due to unexpected message error.");
            i(false, defpackage.zaj.PROTOCOL_WRONG_MESSAGE, defpackage.zak.UNEXPECTED_MESSAGE, "Unexpected message");
            return;
        }
        if (i == 65535) {
            q.g().ai(8301).u("Terminating connection due to framing error.");
            i(false, defpackage.zaj.PROTOCOL_WRONG_MESSAGE, defpackage.zak.FRAMING_ERROR, "Framing error");
            return;
        }
        if (i == 3) {
            defpackage.rvz rvzVar = this.u;
            java.nio.ByteBuffer byteBufferA2 = rvzVar.a(byteBuffer);
            if (byteBufferA2 != null) {
                n(3, byteBufferA2.array(), false, byteBufferA2.arrayOffset(), byteBufferA2.limit());
                defpackage.rwc.a.b(byteBufferA2);
            }
            int i4 = rvzVar.h;
            if (i4 == 3) {
                q.l().ai(8289).u("Authentication succeeded! Awaiting auth complete message.");
                return;
            } else {
                if (i4 == 4) {
                    q.g().ai(8288).u("Authentication failed. Terminating connection.");
                    defpackage.omv.h(this.w, "com.google.android.gms.car.SSL_NEGOTIATION", defpackage.rsr.c, null);
                    i(false, defpackage.zaj.PROTOCOL_AUTH_FAILED, defpackage.zak.AUTH_FAILED, "Auth failed");
                    return;
                }
                return;
            }
        }
        if (i == 4) {
            defpackage.xls xlsVarB = defpackage.xls.b(((defpackage.xil) defpackage.abox.w(defpackage.xil.a, byteBuffer)).b);
            if (xlsVarB == defpackage.xls.STATUS_SUCCESS) {
                defpackage.omv.h(this.w, "com.google.android.gms.car.SSL_NEGOTIATION", defpackage.rsr.b, null);
                q.l().ai(8296).u("Remote end reported auth success.");
                defpackage.rtt rttVar3 = this.j;
                defpackage.rvz rvzVar2 = this.u;
                rttVar3.b.f(rvzVar2);
                this.A = true;
                defpackage.run runVar = this.x;
                if (runVar != null) {
                    runVar.a(this, rvzVar2.d, rvzVar2.e, rvzVar2.f, rvzVar2.g);
                    return;
                }
                return;
            }
            q.g().ai(8297).y("Remote end reported an auth failure: %s", xlsVarB);
            if (xlsVarB == defpackage.xls.STATUS_AUTHENTICATION_FAILURE_CERT_EXPIRED) {
                zajVar = defpackage.zaj.PROTOCOL_AUTH_FAILED_BY_CAR_CERT_EXPIRED;
                zakVar = defpackage.zak.AUTH_FAILED_BY_CAR_CERT_EXPIRED;
            } else if (xlsVarB == defpackage.xls.STATUS_AUTHENTICATION_FAILURE_CERT_NOT_YET_VALID) {
                zajVar = defpackage.zaj.PROTOCOL_AUTH_FAILED_BY_CAR_CERT_NOT_YET_VALID;
                zakVar = defpackage.zak.AUTH_FAILED_BY_CAR_CERT_NOT_YET_VALID;
            } else {
                zajVar = defpackage.zaj.PROTOCOL_AUTH_FAILED_BY_CAR;
                zakVar = defpackage.zak.AUTH_FAILED_BY_CAR;
            }
            defpackage.omv.h(this.w, "com.google.android.gms.car.SSL_NEGOTIATION", defpackage.rsr.c, null);
            i(false, zajVar, zakVar, "Remote auth failure");
            return;
        }
        if (i == 11) {
            defpackage.rty rtyVar = this.t;
            defpackage.xni xniVar = (defpackage.xni) defpackage.abox.w(defpackage.xni.a, byteBuffer);
            long j = xniVar.c;
            defpackage.rvg rvgVar = (defpackage.rvg) rtyVar;
            if (rvgVar.c) {
                defpackage.rvg.a.l().ai(8360).u("PingRequest received. Ignoring");
                return;
            }
            synchronized (rvgVar.b) {
                java.lang.Object obj = ((defpackage.rvg) rtyVar).d;
                if (obj != null) {
                    long j2 = xniVar.c;
                    defpackage.abor aborVarN = defpackage.xnj.a.n();
                    aborVarN.t();
                    defpackage.xnj xnjVar = (defpackage.xnj) aborVarN.b;
                    xnjVar.b |= 1;
                    xnjVar.c = j2;
                    super.o(12, (defpackage.xnj) aborVarN.q(), true);
                } else {
                    defpackage.rvg.a.f().ai(8359).u("onPingRequest: ControlEndPoint has not been registered");
                }
            }
            return;
        }
        if (i == 12) {
            long j3 = ((defpackage.xnj) defpackage.abox.w(defpackage.xnj.a, byteBuffer)).c;
            return;
        }
        switch (i) {
            case 14:
                xlx xlxVarW = defpackage.abox.w(xlx.a, byteBuffer);
                defpackage.ypu ypuVarAi3 = q.l().ai(8291);
                xlz xlzVarB = xlz.b(xlxVarW.b);
                if (xlzVarB == null) {
                    xlzVarB = xlz.a;
                }
                ypuVarAi3.y("Navigation focus is now: %s", xlzVarB);
                xlz xlzVarB2 = xlz.b(xlxVarW.b);
                if (xlzVarB2 == null) {
                    xlzVarB2 = xlz.a;
                }
                synchronized (this.g) {
                    this.y.add(xlzVarB2);
                    break;
                }
                return;
            case 15:
                defpackage.yqk yqkVar3 = q;
                yqkVar3.l().ai(8298).u("received ByeByeRequest");
                xix xixVarW = defpackage.abox.w(xix.a, byteBuffer);
                defpackage.rtx rtxVar = this.v;
                xiw xiwVarB = xiw.b(xixVarW.c);
                if (xiwVarB == null) {
                    xiwVarB = xiw.a;
                }
                defpackage.rtc rtcVar = (defpackage.rtc) rtxVar;
                java.lang.Object obj2 = rtcVar.b;
                if (obj2 != null) {
                    yqkVar3.l().ai(8304).u("send ByeByeResponse");
                    super.o(16, xiy.a, true);
                }
                boolean z3 = rtcVar.e;
                if (xiwVarB == xiw.b) {
                    rtcVar.j.d();
                    return;
                } else {
                    rtcVar.j.p(defpackage.zaj.PROTOCOL_BYEBYE_REQUESTED_BY_CAR, defpackage.zak.BYEBYE_BY_CAR, "reason:".concat(xiwVarB.toString()));
                    defpackage.omv.i(rtcVar.c, defpackage.yyn.PROJECTION_ENDED_BYEBYE_BY_CAR);
                    return;
                }
            case 16:
                q.l().ai(8299).u("received ByeByeResponse");
                defpackage.abox.w(xiy.a, byteBuffer);
                defpackage.rtx rtxVar2 = this.v;
                defpackage.yyn yynVar = defpackage.yyn.PROJECTION_ENDED_BYEBYE_BY_USER;
                defpackage.rtc rtcVar2 = (defpackage.rtc) rtxVar2;
                if (rtcVar2.d) {
                    rtcVar2.a();
                    rtcVar2.j.p(defpackage.zaj.PROTOCOL_BYEBYE_REQUESTED_BY_USER, defpackage.zak.BYEBYE_BY_USER, "user request");
                } else {
                    rtcVar2.j.p(defpackage.zaj.PROTOCOL_WRONG_MESSAGE, defpackage.zak.UNEXPECTED_BYEBYE_RESPONSE, "got ByeByeResponse without request");
                    yynVar = defpackage.yyn.PROJECTION_ENDED_UNEXPECTED_BYEBYE_RESPONSE;
                }
                defpackage.omv.i(rtcVar2.c, yynVar);
                return;
            default:
                q.g().ai(8295).w("Received unexpected message of type %d", i);
                return;
        }
    }

    @Override // defpackage.rvj
    public final void w(android.os.Bundle bundle) {
        if (!this.A || this.c != null) {
            throw new java.lang.IllegalStateException("Can't suspend ControlEndPoint");
        }
        defpackage.rvz rvzVar = this.u;
        int i = rvzVar.h;
        if (i != 3) {
            throw new java.lang.IllegalStateException(defpackage.a.bm(i, "Can't suspend SslWrapper:", " false"));
        }
        bundle.putString("peer_cert_name", rvzVar.d);
        bundle.putLong("peer_cert_serial_number", rvzVar.e);
        bundle.putString("peer_cert_not_before", rvzVar.f);
        bundle.putString("peer_cert_not_after", rvzVar.g);
        bundle.putInt("net_buffer_size", rvzVar.m);
        bundle.putInt("app_buffer_size", rvzVar.n);
        javax.net.ssl.SSLContext sSLContext = rvzVar.k;
        defpackage.yqk yqkVar = defpackage.rvp.a;
        bundle.putBinder("ssl_context", new ruv(sSLContext));
        bundle.putBinder("ssl_engine", new ruv(rvzVar.l));
        synchronized (this.g) {
            java.util.Queue queue = this.h;
            if (!queue.isEmpty()) {
                bundle.putBinder("audio_focus_msgs", new ruv(queue));
            }
            java.util.ArrayList arrayList = this.y;
            java.util.ArrayList<java.lang.Integer> arrayList2 = new java.util.ArrayList<>(arrayList.size());
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(java.lang.Integer.valueOf(((xlz) it.next()).c));
            }
            bundle.putIntegerArrayList("nav_focus_msgs_key", arrayList2);
            java.util.List list = this.z;
            boolean[] zArr = new boolean[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                zArr[i2] = ((java.lang.Boolean) list.get(i2)).booleanValue();
            }
            bundle.putBooleanArray("call_status_msgs_key", zArr);
        }
        bundle.putInt("hu_major_version", this.k.a);
        bundle.putInt("hu_minor_version", this.k.b);
    }

    @Override // defpackage.rvj
    public final void x() {
        defpackage.rty rtyVar = this.t;
        synchronized (((defpackage.rvg) rtyVar).b) {
            ((defpackage.rvg) rtyVar).d = null;
        }
        ((defpackage.rtc) this.v).b = null;
        rtw rtwVar = this.i;
        if (rtwVar != null) {
            rtwVar.e();
        }
        super.x();
    }

    @Override // defpackage.rtj
    public final void e(int i) {
    }
}
