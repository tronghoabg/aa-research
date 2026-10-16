package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jab extends defpackage.jbq implements defpackage.jaa {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.GAL");
    public static final defpackage.yqk b = defpackage.omv.n("CAR.GAL.AUDIO");
    public static final defpackage.jbx c = new defpackage.jbx(1, 6);
    public static final defpackage.jbx d = new defpackage.jbx(1, 7);
    public static final defpackage.jbx e = new defpackage.jbx(6, 1);
    private final defpackage.izy A;
    private final defpackage.jal B;
    private final defpackage.xjw C;
    private final defpackage.jcb D;
    private final defpackage.jag E;
    private boolean F;
    public java.lang.String f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public java.lang.String j;
    public final android.content.Context k;
    public final java.lang.Object l;
    public final java.util.ArrayList m;
    public final java.util.List n;
    public defpackage.izw o;
    public final java.util.Queue p;
    public volatile defpackage.izx q;
    public defpackage.izs r;
    public defpackage.jbx s;
    private final defpackage.izz y;
    private final defpackage.jch z;

    public jab(android.content.Context context, defpackage.izz izzVar, defpackage.izy izyVar, defpackage.jal jalVar, java.lang.String str, java.lang.String str2, defpackage.xjw xjwVar, defpackage.jcb jcbVar, defpackage.jag jagVar) {
        super(1, null, jalVar, 0);
        java.lang.Object obj = new java.lang.Object();
        this.l = obj;
        this.s = new defpackage.jbx(0, 0);
        this.F = false;
        this.k = context;
        this.B = jalVar;
        this.y = izzVar;
        this.A = izyVar;
        this.j = str2;
        this.C = xjwVar;
        this.D = jcbVar;
        this.E = jagVar;
        synchronized (obj) {
            this.m = new java.util.ArrayList();
            this.p = new java.util.ArrayDeque();
            this.n = new java.util.ArrayList();
        }
        defpackage.jch jchVar = new defpackage.jch(context);
        this.z = jchVar;
        try {
            jchVar.l = defpackage.jch.d(jchVar.i, jchVar.j, str);
            javax.net.ssl.SSLEngine sSLEngineCreateSSLEngine = jchVar.l.createSSLEngine();
            sSLEngineCreateSSLEngine.getClass();
            jchVar.m = sSLEngineCreateSSLEngine;
            sSLEngineCreateSSLEngine.setUseClientMode(false);
            sSLEngineCreateSSLEngine.setNeedClientAuth(true);
            jchVar.n = sSLEngineCreateSSLEngine.getSession().getPacketBufferSize();
            jchVar.o = sSLEngineCreateSSLEngine.getSession().getApplicationBufferSize();
            jchVar.h = 1;
            izzVar.a(this);
            ((defpackage.iys) izyVar).b = this;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Exception e2) {
                defpackage.jch.a.g().p(e2).ai(1860).u("Exception initializing SSL engine");
                a.g().ai(1682).u("Failed to initialize ssl library!");
            }
        }
    }

    private final void r(defpackage.yyn yynVar, defpackage.yyn yynVar2) {
        defpackage.jag jagVar = this.E;
        if (jagVar == null) {
            return;
        }
        int i = jagVar.e;
        if (i != 2) {
            yynVar = i != 1 ? null : yynVar2;
        }
        if (yynVar != null) {
            defpackage.omv.i(this.k, yynVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jbq
    public final void a(int i, java.nio.ByteBuffer byteBuffer) throws defpackage.abpp {
        defpackage.xls xlsVar;
        defpackage.xqc xqcVar;
        defpackage.zaj zajVar;
        defpackage.zak zakVar;
        defpackage.pbp pbpVar = defpackage.pbp.GAL_READ_WRITE_MESSAGE_RAND;
        if (i(i, pbpVar)) {
            return;
        }
        int i2 = 12;
        if (this.D.o && !this.F && i != 1 && i != 3 && i != 4 && i != 11 && i != 12 && i != 15 && i != 16 && i != 65535 && i != 255) {
            a.g().ai(1700).w("Terminating connection due to unexpected message %d before SSL handshake complete.", i);
            h(false, defpackage.zaj.PROTOCOL_WRONG_MESSAGE, defpackage.zak.UNEXPECTED_MESSAGE, "Unexpected message before SSL");
            return;
        }
        int i3 = 2;
        if (i == 1) {
            defpackage.jbx jbxVar = new defpackage.jbx(byteBuffer.getShort(), byteBuffer.getShort());
            defpackage.omv.g(this.k, "com.google.android.gms.car.VERSION_NEGOTIATION", defpackage.rsr.a.ordinal(), null);
            defpackage.yqk yqkVar = a;
            yqkVar.f().ai(1688).y("Car requests protocol version %s", jbxVar);
            defpackage.xqb xqbVar = defpackage.xqb.a;
            if (i(2, pbpVar)) {
                return;
            }
            this.s = jbxVar;
            defpackage.jbx jbxVar2 = d;
            if (jbxVar.compareTo(jbxVar2) > 0) {
                jbxVar2 = e;
            }
            if (xqbVar == null) {
                xlsVar = defpackage.xls.STATUS_NO_COMPATIBLE_VERSION;
            } else {
                defpackage.jbx jbxVar3 = e;
                if (!jbxVar3.D(jbxVar)) {
                    yqkVar.h().ai(1708).M("HU requested protocol %s, but maximum supported is %s", jbxVar, jbxVar3);
                }
                xlsVar = defpackage.xls.STATUS_SUCCESS;
            }
            yqkVar.f().ai(1706).R("Requested protocol version %s, negotiated protocol version %s (%s)", jbxVar, jbxVar2, xlsVar.name());
            defpackage.xjw xjwVar = this.C;
            int iE = 8;
            if (!this.s.D(c) || xjwVar == null) {
                xqcVar = null;
            } else {
                defpackage.abor aborVarN = defpackage.xqc.a.n();
                aborVarN.t();
                defpackage.xqc xqcVar2 = (defpackage.xqc) aborVarN.b;
                xqcVar2.c = xjwVar;
                xqcVar2.b |= 1;
                xqcVar = (defpackage.xqc) aborVarN.q();
                iE = 8 + xqcVar.e(null);
            }
            defpackage.jcu jcuVar = new defpackage.jcu(java.nio.ByteBuffer.allocate(iE), null, false);
            jcuVar.v((short) 2);
            jcuVar.v((short) jbxVar2.a);
            jcuVar.v((short) jbxVar2.b);
            jcuVar.v((short) xlsVar.I);
            if (xqcVar != null) {
                defpackage.abof abofVarH = defpackage.abof.H(jcuVar.h());
                try {
                    xqcVar.R(abofVarH);
                    abofVarH.c();
                } catch (java.io.IOException e2) {
                    throw new java.lang.AssertionError("Serializing " + xqcVar.getClass().getName() + " threw an IOException (should never happen)", e2);
                }
            }
            m(jcuVar, false, j$.util.Optional.empty(), j$.util.OptionalInt.empty());
            if (xlsVar != defpackage.xls.STATUS_SUCCESS) {
                defpackage.omv.g(this.k, "com.google.android.gms.car.VERSION_NEGOTIATION", defpackage.rsr.c.ordinal(), null);
                h(true, defpackage.zaj.PROTOCOL_INCOMPATIBLE_VERSION, defpackage.zak.BAD_VERSION, "Bad version");
                return;
            } else {
                r(defpackage.yyn.VERSION_NEGOTIATION_SUCCESS_WIFI, defpackage.yyn.VERSION_NEGOTIATION_SUCCESS_USB);
                defpackage.omv.g(this.k, "com.google.android.gms.car.VERSION_NEGOTIATION", defpackage.rsr.b.ordinal(), null);
                yqkVar.l().ai(1707).u("Waiting for authentication...");
                return;
            }
        }
        if (i == 6) {
            defpackage.abox aboxVarC = defpackage.abox.C(defpackage.xpc.a, defpackage.abny.M(byteBuffer), defpackage.abol.a);
            defpackage.abox.U(aboxVarC);
            defpackage.abox.U(aboxVarC);
            final defpackage.xpc xpcVar = (defpackage.xpc) aboxVarC;
            r(defpackage.yyn.SDP_RESPONSE_RECEIVED_WIFI, defpackage.yyn.SDP_RESPONSE_RECEIVED_USB);
            defpackage.omv.g(this.k, "com.google.android.gms.car.SDP_NEGOTIATION", defpackage.rsr.b.ordinal(), null);
            final defpackage.izs izsVar = this.r;
            defpackage.jbx jbxVar4 = this.s;
            final int i4 = jbxVar4.a;
            final int i5 = jbxVar4.b;
            defpackage.yqk yqkVar2 = defpackage.izs.a;
            yqkVar2.l().ai(1679).u("Found services:");
            java.util.Iterator<E> it = xpcVar.c.iterator();
            while (it.hasNext()) {
                yqkVar2.l().ai(1680).y("%s", defpackage.izs.a((defpackage.xpa) it.next()));
            }
            new defpackage.stq(android.os.Looper.getMainLooper(), (byte[]) null).post(new java.lang.Runnable() { // from class: izl
                @Override // java.lang.Runnable
                public final void run() {
                    defpackage.izs izsVar2 = izsVar;
                    java.lang.Object obj = izsVar2.z.a;
                    defpackage.xpc xpcVar2 = xpcVar;
                    defpackage.abpj<defpackage.xpa> abpjVar = xpcVar2.c;
                    defpackage.jbw jbwVar = (defpackage.jbw) obj;
                    jbwVar.g = xpcVar2;
                    jbwVar.i = new defpackage.rvo[abpjVar.size()];
                    int i6 = 0;
                    for (defpackage.xpa xpaVar : abpjVar) {
                        defpackage.rvo[] rvoVarArr = jbwVar.i;
                        defpackage.rvo rvoVar = new defpackage.rvo();
                        rvoVarArr[i6] = rvoVar;
                        rvoVar.b = xpaVar;
                        rvoVar.a = xpaVar.c;
                        i6++;
                    }
                    int i7 = i5;
                    int i8 = i4;
                    defpackage.jal jalVar = izsVar2.s;
                    xpcVar2.getClass();
                    defpackage.joq joqVar = (defpackage.joq) jalVar;
                    joqVar.e.post(new defpackage.jop(joqVar, i8, i7, xpcVar2));
                }
            });
            return;
        }
        if (i == 19) {
            defpackage.abox aboxVarC2 = defpackage.abox.C(defpackage.xih.a, defpackage.abny.M(byteBuffer), defpackage.abol.a);
            defpackage.abox.U(aboxVarC2);
            defpackage.abox.U(aboxVarC2);
            defpackage.xih xihVar = (defpackage.xih) aboxVarC2;
            defpackage.xik xikVarB = defpackage.xik.b(xihVar.b);
            if (xikVarB == null) {
                xikVarB = defpackage.xik.AUDIO_FOCUS_STATE_INVALID;
            }
            boolean z = xihVar.c;
            b.f().ai(1683).y("Got audio focus state from car:%s", xikVarB.name());
            if (this.q != null) {
                this.q.c(xikVarB, z);
                return;
            } else {
                synchronized (this.l) {
                    this.p.add(android.util.Pair.create(xikVarB, java.lang.Boolean.valueOf(z)));
                }
                return;
            }
        }
        if (i == 24) {
            xiz xizVarC = defpackage.abox.C(xiz.a, defpackage.abny.M(byteBuffer), defpackage.abol.a);
            defpackage.abox.U(xizVarC);
            defpackage.abox.U(xizVarC);
            boolean z2 = xizVarC.b;
            defpackage.ypu ypuVarAi = a.l().ai(1686);
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z2);
            ypuVarAi.y("Call availability status: is call available now? %b", boolValueOf);
            defpackage.izw izwVar = this.o;
            if (izwVar != null) {
                ((defpackage.ixa) izwVar).m(2, !z2 ? 1 : 0);
                return;
            } else {
                synchronized (this.l) {
                    this.n.add(boolValueOf);
                }
                return;
            }
        }
        if (i == 26) {
            xpd xpdVarC = defpackage.abox.C(xpd.a, defpackage.abny.M(byteBuffer), defpackage.abol.a);
            defpackage.abox.U(xpdVarC);
            defpackage.abox.U(xpdVarC);
            xpd xpdVar = xpdVarC;
            defpackage.izs izsVar2 = this.r;
            defpackage.ypu ypuVarAi2 = defpackage.izs.a.l().ai(1681);
            defpackage.xpa xpaVar = xpdVar.c;
            if (xpaVar == null) {
                xpaVar = defpackage.xpa.a;
            }
            ypuVarAi2.y("Updating service: %s", defpackage.izs.a(xpaVar));
            new defpackage.stq(android.os.Looper.getMainLooper(), (byte[]) null).post(new defpackage.inq(izsVar2, xpdVar, i2));
            return;
        }
        if (i == 255) {
            a.g().ai(1698).u("Terminating connection due to unexpected message error.");
            h(false, defpackage.zaj.PROTOCOL_WRONG_MESSAGE, defpackage.zak.UNEXPECTED_MESSAGE, "Unexpected message");
            return;
        }
        if (i == 65535) {
            a.g().ai(1699).u("Terminating connection due to framing error.");
            h(false, defpackage.zaj.PROTOCOL_WRONG_MESSAGE, defpackage.zak.FRAMING_ERROR, "Framing error");
            return;
        }
        if (i == 3) {
            defpackage.jch jchVar = this.z;
            java.nio.ByteBuffer byteBufferC = jchVar.c(byteBuffer);
            if (byteBufferC != null) {
                if (i(3, defpackage.pbp.GAL_READ_WRITE_MESSAGE_RAND)) {
                    return;
                } else {
                    n(3, byteBufferC.array(), false, byteBufferC.arrayOffset(), byteBufferC.limit());
                }
            }
            int i6 = jchVar.h;
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
            defpackage.omv.g(this.k, "com.google.android.gms.car.SSL_NEGOTIATION", defpackage.rsr.c.ordinal(), null);
            if (i6 == 5) {
                r(defpackage.yyn.SSL_NEGOTIATION_FAILED_OBSOLETE_SSL_WIFI, defpackage.yyn.SSL_NEGOTIATION_FAILED_OBSOLETE_SSL_USB);
            }
            h(false, defpackage.zaj.PROTOCOL_AUTH_FAILED, i6 == 4 ? defpackage.zak.AUTH_FAILED : defpackage.zak.AUTH_FAILED_OBSOLETE_SSL, "Auth failed");
            return;
        }
        if (i == 4) {
            defpackage.abox aboxVarC3 = defpackage.abox.C(defpackage.xil.a, defpackage.abny.M(byteBuffer), defpackage.abol.a);
            defpackage.abox.U(aboxVarC3);
            defpackage.abox.U(aboxVarC3);
            defpackage.xls xlsVarB = defpackage.xls.b(((defpackage.xil) aboxVarC3).b);
            if (xlsVarB != defpackage.xls.STATUS_SUCCESS) {
                a.g().ai(1695).y("Remote end reported an auth failure: %s", xlsVarB);
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
                defpackage.omv.g(this.k, "com.google.android.gms.car.SSL_NEGOTIATION", defpackage.rsr.c.ordinal(), null);
                h(false, zajVar, zakVar, "Remote auth failure");
                return;
            }
            if (this.D.o && this.z.h != 3) {
                a.g().ai(1694).u("Remote end reported auth success but SSL handshake did not complete successfully.");
                defpackage.omv.g(this.k, "com.google.android.gms.car.SSL_NEGOTIATION", defpackage.rsr.c.ordinal(), null);
                h(false, defpackage.zaj.PROTOCOL_AUTH_FAILED_BY_CAR, defpackage.zak.AUTH_FAILED_BY_CAR, "Auth success received before SSL handshake completed successfully.");
                return;
            }
            r(defpackage.yyn.SSL_NEGOTIATION_SUCCESS_WIFI, defpackage.yyn.SSL_NEGOTIATION_SUCCESS_USB);
            defpackage.omv.g(this.k, "com.google.android.gms.car.SSL_NEGOTIATION", defpackage.rsr.b.ordinal(), null);
            a.l().ai(1693).u("Remote end reported auth success.");
            defpackage.izs izsVar3 = this.r;
            defpackage.jch jchVar2 = this.z;
            izsVar3.b.f(jchVar2);
            this.F = true;
            defpackage.jal jalVar = this.B;
            if (jalVar != null) {
                defpackage.joq joqVar = (defpackage.joq) jalVar;
                joqVar.e.post(new defpackage.joo(joqVar, jchVar2.d, jchVar2.e, jchVar2.f, jchVar2.g, this));
                return;
            }
            return;
        }
        if (i == 11) {
            defpackage.izz izzVar = this.y;
            defpackage.abox aboxVarC4 = defpackage.abox.C(defpackage.xni.a, defpackage.abny.M(byteBuffer), defpackage.abol.a);
            defpackage.abox.U(aboxVarC4);
            defpackage.abox.U(aboxVarC4);
            izzVar.c((defpackage.xni) aboxVarC4);
            return;
        }
        if (i == 12) {
            defpackage.izz izzVar2 = this.y;
            defpackage.abox aboxVarC5 = defpackage.abox.C(defpackage.xnj.a, defpackage.abny.M(byteBuffer), defpackage.abol.a);
            defpackage.abox.U(aboxVarC5);
            defpackage.abox.U(aboxVarC5);
            izzVar2.d((defpackage.xnj) aboxVarC5);
            return;
        }
        switch (i) {
            case 14:
                xlx xlxVarC = defpackage.abox.C(xlx.a, defpackage.abny.M(byteBuffer), defpackage.abol.a);
                defpackage.abox.U(xlxVarC);
                defpackage.abox.U(xlxVarC);
                xlx xlxVar = xlxVarC;
                defpackage.ypu ypuVarAi3 = a.l().ai(1687);
                xlz xlzVarB = xlz.b(xlxVar.b);
                if (xlzVarB == null) {
                    xlzVarB = xlz.a;
                }
                ypuVarAi3.y("Navigation focus is now: %s", xlzVarB);
                xlz xlzVarB2 = xlz.b(xlxVar.b);
                if (xlzVarB2 == null) {
                    xlzVarB2 = xlz.a;
                }
                defpackage.izw izwVar2 = this.o;
                if (izwVar2 != null) {
                    izwVar2.b(xlzVarB2 == xlz.b);
                    return;
                }
                synchronized (this.l) {
                    this.m.add(xlzVarB2);
                    break;
                }
                return;
            case 15:
                defpackage.yqk yqkVar3 = a;
                yqkVar3.l().ai(1696).u("received ByeByeRequest");
                xix xixVarC = defpackage.abox.C(xix.a, defpackage.abny.M(byteBuffer), defpackage.abol.a);
                defpackage.abox.U(xixVarC);
                defpackage.abox.U(xixVarC);
                defpackage.izy izyVar = this.A;
                xiw xiwVarB = xiw.b(xixVarC.c);
                if (xiwVarB == null) {
                    xiwVarB = xiw.a;
                }
                defpackage.iys iysVar = (defpackage.iys) izyVar;
                defpackage.jaa jaaVar = iysVar.b;
                if (jaaVar != null) {
                    yqkVar3.l().ai(1705).u("send ByeByeResponse");
                    ((defpackage.jbq) jaaVar).k(16, xiy.a);
                }
                if (iysVar.e && xiwVarB == xiw.b) {
                    defpackage.jal jalVar2 = iysVar.h;
                    ((defpackage.joq) jalVar2).e.post(new defpackage.jmy(jalVar2, i3));
                    return;
                } else {
                    iysVar.h.aF(defpackage.zaj.PROTOCOL_BYEBYE_REQUESTED_BY_CAR, defpackage.zak.BYEBYE_BY_CAR, "reason:".concat(xiwVarB.toString()));
                    defpackage.omv.i(iysVar.c, defpackage.yyn.PROJECTION_ENDED_BYEBYE_BY_CAR);
                    return;
                }
            case 16:
                a.l().ai(1697).u("received ByeByeResponse");
                xiy xiyVarC = defpackage.abox.C(xiy.a, defpackage.abny.M(byteBuffer), defpackage.abol.a);
                defpackage.abox.U(xiyVarC);
                defpackage.abox.U(xiyVarC);
                defpackage.izy izyVar2 = this.A;
                defpackage.yyn yynVar = defpackage.yyn.PROJECTION_ENDED_BYEBYE_BY_USER;
                defpackage.iys iysVar2 = (defpackage.iys) izyVar2;
                if (iysVar2.d) {
                    iysVar2.a();
                    iysVar2.h.aF(defpackage.zaj.PROTOCOL_BYEBYE_REQUESTED_BY_USER, defpackage.zak.BYEBYE_BY_USER, "user request");
                } else {
                    iysVar2.h.aF(defpackage.zaj.PROTOCOL_WRONG_MESSAGE, defpackage.zak.UNEXPECTED_BYEBYE_RESPONSE, "got ByeByeResponse without request");
                    yynVar = defpackage.yyn.PROJECTION_ENDED_UNEXPECTED_BYEBYE_RESPONSE;
                }
                defpackage.omv.i(iysVar2.c, yynVar);
                return;
            default:
                a.g().ai(1692).w("Received unexpected message of type %d", i);
                return;
        }
    }

    @Override // defpackage.ize
    public final void b(int i) {
        if (this.D.k && i == 1) {
            this.q.d();
        }
    }

    @Override // defpackage.jaa
    public final void c(xiw xiwVar) {
        a.l().ai(1704).u("send ByeByeRequest");
        defpackage.abor aborVarN = xix.a.n();
        aborVarN.t();
        xix xixVar = aborVarN.b;
        xixVar.c = xiwVar.i;
        xixVar.b |= 1;
        xix xixVarQ = aborVarN.q();
        if (this.F) {
            k(15, xixVarQ);
        } else {
            super.o(15, xixVarQ, false, j$.util.Optional.empty(), j$.util.OptionalInt.empty());
        }
    }

    @Override // defpackage.jaa
    public final void d(long j, boolean z) {
        defpackage.abor aborVarN = defpackage.xni.a.n();
        aborVarN.t();
        defpackage.xni xniVar = (defpackage.xni) aborVarN.b;
        xniVar.b |= 1;
        xniVar.c = j;
        aborVarN.t();
        defpackage.xni xniVar2 = (defpackage.xni) aborVarN.b;
        xniVar2.b |= 2;
        xniVar2.d = z;
        k(11, (defpackage.xni) aborVarN.q());
    }

    @Override // defpackage.jaa
    public final void e(long j) {
        defpackage.abor aborVarN = defpackage.xnj.a.n();
        aborVarN.t();
        defpackage.xnj xnjVar = (defpackage.xnj) aborVarN.b;
        xnjVar.b |= 1;
        xnjVar.c = j;
        k(12, (defpackage.xnj) aborVarN.q());
    }

    @Override // defpackage.jaa
    public final synchronized void f(int i) {
        defpackage.abor aborVarN = xqj.a.n();
        aborVarN.t();
        xqj xqjVar = aborVarN.b;
        if (i == 0) {
            throw null;
        }
        xqjVar.c = i;
        xqjVar.b |= 1;
        xqj xqjVarQ = aborVarN.q();
        if (this.q != null) {
            this.q.f(i);
        }
        l(17, xqjVarQ, (this.D.k && i == 1) ? j$.util.OptionalInt.of(1) : j$.util.OptionalInt.empty());
        if (this.q != null) {
            this.q.e(i);
        }
    }

    @Override // defpackage.jbq
    public final void g() {
        this.y.b();
        ((defpackage.iys) this.A).b = null;
        if (this.q != null) {
            this.q.b();
        }
        defpackage.izw izwVar = this.o;
        if (izwVar != null) {
            synchronized (((defpackage.ixa) izwVar).a) {
                if (((defpackage.ixa) izwVar).b != null) {
                    ((defpackage.ixa) izwVar).h(1);
                    ((defpackage.ixa) izwVar).h(0);
                    ((defpackage.ixa) izwVar).b = null;
                }
                java.util.LinkedList linkedList = ((defpackage.ixa) izwVar).d;
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((defpackage.iwz) it.next()).a();
                }
                linkedList.clear();
                java.util.Arrays.fill(((defpackage.ixa) izwVar).c, (java.lang.Object) null);
            }
        }
        super.g();
    }

    public final void h(boolean z, defpackage.zaj zajVar, defpackage.zak zakVar, java.lang.String str) {
        this.x.aF(zajVar, zakVar, str);
        this.r.c(z);
    }

    public final boolean i(int i, defpackage.pbp pbpVar) {
        if (!defpackage.kou.n() || defpackage.yhx.p(11, 12).contains(java.lang.Integer.valueOf(i))) {
            return false;
        }
        if (pbpVar == defpackage.pbp.GAL_READ_WRITE_MESSAGE_RAND) {
            defpackage.kou.m().h(defpackage.pbp.GAL_READ_WRITE_MESSAGE_RAND_DELAY);
        }
        return ((java.lang.Boolean) defpackage.kou.m().b(pbpVar, new kol(this, i, 1))).booleanValue();
    }
}
