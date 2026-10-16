package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public abstract class aduh extends adrj {
    private static final adko a;
    private static final adlx b;
    private adnq c;
    private admc d;
    private Charset e;
    private boolean f;

    static {
        adug adugVar = new adug(0);
        a = adugVar;
        b = adkp.a(":status", adugVar);
    }

    protected aduh(int i, adzv adzvVar, aeac aeacVar) {
        super(i, adzvVar, aeacVar);
        this.e = StandardCharsets.UTF_8;
    }

    private static Charset f(admc admcVar) {
        String str = (String) admcVar.b(adue.h);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return StandardCharsets.UTF_8;
    }

    private static void q(admc admcVar) {
        admcVar.d(b);
        admcVar.d(adkr.b);
        admcVar.d(adkr.a);
    }

    private static final adnq r(admc admcVar) {
        char cCharAt;
        Integer num = (Integer) admcVar.b(b);
        if (num == null) {
            return adnq.l.e("Missing HTTP status code");
        }
        String str = (String) admcVar.b(adue.h);
        if (str != null && str.length() >= 16) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';')) {
                return null;
            }
        }
        adnq adnqVarA = adue.a(num.intValue());
        return str == null ? adnqVarA.a("missing content-type in response headers") : adnqVarA.a("invalid content-type: ".concat(str));
    }

    protected abstract void c(adnq adnqVar, boolean z, admc admcVar);

    protected final void n(adxi adxiVar, boolean z) {
        adnq adnqVar = this.c;
        boolean z2 = false;
        if (adnqVar != null) {
            Charset charset = this.e;
            adxi adxiVar2 = adxm.a;
            charset.getClass();
            int iF = adxiVar.f();
            byte[] bArr = new byte[iF];
            adxiVar.j(bArr, 0, iF);
            this.c = adnqVar.a("DATA-----------------------------\n".concat(new String(bArr, charset)));
            adxiVar.close();
            if (this.c.q.length() > 1000 || z) {
                c(this.c, false, this.d);
                return;
            }
            return;
        }
        if (!this.f) {
            adxiVar.close();
            c(adnq.l.e("headers not received before payload"), false, new admc());
            return;
        }
        int iF2 = adxiVar.f();
        boolean z3 = true;
        try {
            if (this.t) {
                adrh.s.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                adxiVar.close();
            } else {
                try {
                    adsv adsvVar = this.j;
                    try {
                        if (((adwm) adsvVar).b() || ((adwm) adsvVar).f) {
                            adxiVar.close();
                        } else {
                            ((adwm) adsvVar).d.h(adxiVar);
                            try {
                                ((adwm) adsvVar).a();
                            } catch (Throwable th) {
                                th = th;
                                z3 = false;
                                if (z3) {
                                    adxiVar.close();
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        b(th3);
                    } catch (Throwable th4) {
                        th = th4;
                        if (z2) {
                            adxiVar.close();
                        }
                        throw th;
                    }
                }
            }
            if (z) {
                if (iF2 > 0) {
                    this.c = adnq.l.e("Received unexpected EOS on non-empty DATA frame from server");
                } else {
                    this.c = adnq.l.e("Received unexpected EOS on empty DATA frame from server");
                }
                admc admcVar = new admc();
                this.d = admcVar;
                l(this.c, false, admcVar);
            }
        } catch (Throwable th5) {
            th = th5;
            z2 = true;
        }
    }

    public final void o(admc admcVar) {
        adnq adnqVar = this.c;
        if (adnqVar != null) {
            this.c = adnqVar.a("headers: ".concat(admcVar.toString()));
            return;
        }
        try {
            if (this.f) {
                this.c = adnq.l.e("Received headers twice");
            } else {
                Integer num = (Integer) admcVar.b(b);
                if (num == null || num.intValue() < 100 || num.intValue() >= 200) {
                    this.f = true;
                    adnq adnqVarR = r(admcVar);
                    this.c = adnqVarR;
                    if (adnqVarR != null) {
                        this.c = adnqVarR.a("headers: ".concat(admcVar.toString()));
                        this.d = admcVar;
                        this.e = f(admcVar);
                        return;
                    }
                    q(admcVar);
                    woy.aa(!this.t, "Received headers on closed stream");
                    this.p.d();
                    String str = (String) admcVar.b(adue.c);
                    if (str == null) {
                        this.q.c(admcVar);
                    } else {
                        adjs adjsVarA = this.r.a(str);
                        if (adjsVarA == null) {
                            b(new adnt(adnq.l.e(String.format("Can't find decompressor for %s", str)), null));
                        } else {
                            if (adjsVarA != adjc.a) {
                                ((adwm) this.j).c = adjsVarA;
                            }
                            this.q.c(admcVar);
                        }
                    }
                }
            }
            adnq adnqVar2 = this.c;
            if (adnqVar2 != null) {
                this.c = adnqVar2.a("headers: ".concat(admcVar.toString()));
                this.d = admcVar;
                this.e = f(admcVar);
            }
        } catch (Throwable th) {
            adnq adnqVar3 = this.c;
            if (adnqVar3 != null) {
                this.c = adnqVar3.a("headers: ".concat(admcVar.toString()));
                this.d = admcVar;
                this.e = f(admcVar);
            }
            throw th;
        }
    }

    public final void p(admc admcVar) {
        adnq adnqVarA;
        adnq adnqVarR = this.c;
        if (adnqVarR == null && !this.f) {
            adnqVarR = r(admcVar);
            this.c = adnqVarR;
            if (adnqVarR != null) {
                this.d = admcVar;
            }
        }
        if (adnqVarR != null) {
            adnq adnqVarA2 = adnqVarR.a("trailers: ".concat(admcVar.toString()));
            this.c = adnqVarA2;
            c(adnqVarA2, false, this.d);
            return;
        }
        adnq adnqVar = (adnq) admcVar.b(adkr.b);
        if (adnqVar != null) {
            adnqVarA = adnqVar.e((String) admcVar.b(adkr.a));
        } else if (this.f) {
            adnqVarA = adnq.d.e("missing GRPC status in response");
        } else {
            Integer num = (Integer) admcVar.b(b);
            adnqVarA = (num != null ? adue.a(num.intValue()) : adnq.l.e("missing HTTP status code")).a("missing GRPC status, inferred error from HTTP status code");
        }
        q(admcVar);
        if (this.t) {
            adrh.s.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundTrailersReceived", "Received trailers on closed stream:\n {1}\n {2}", new Object[]{adnqVarA, admcVar});
        } else {
            this.p.e();
            l(adnqVarA, false, admcVar);
        }
    }
}
