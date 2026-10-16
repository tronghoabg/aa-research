package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class adpo implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ adpo(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v15, types: [adwh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v16, types: [adwh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v45, types: [aduz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v56, types: [adkm, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((adnw) this.a).a();
                break;
            case 1:
                ((adpq) this.a).e();
                break;
            case 2:
                adrd adrdVar = (adrd) this.a;
                adwh adwhVar = adrdVar.b;
                adis adisVar = adrdVar.g;
                adwhVar.h();
                adrdVar.g = adisVar;
                adrdVar.b.b();
                break;
            case 3:
                adrs adrsVar = (adrs) this.a;
                aebg aebgVar = adrsVar.e;
                if (aebgVar != null && aebgVar.i()) {
                    aebgVar.h();
                }
                adrsVar.d = null;
                break;
            case 4:
                ((adtc) this.a).g.j();
                break;
            case 5:
                ((adtb) this.a).o();
                break;
            case 6:
                this.a.a(true);
                break;
            case 7:
                this.a.a(false);
                break;
            case 8:
                advv advvVar = ((advk) this.a).a;
                woy.aa(advvVar.z.get(), "Channel must have been shut down");
                advvVar.A = true;
                advvVar.l(false);
                advvVar.j();
                break;
            case 9:
                adwh adwhVar2 = ((adte) this.a).f;
                adzt adztVar = adzt.SUBCHANNEL_SHUTDOWN;
                woy.aa(((advk) adwhVar2).a.z.get(), "Channel must have been shut down");
                break;
            case 10:
                ((adti) this.a).f.f();
                break;
            case 11:
                ((adti) this.a).t();
                break;
            case 12:
                ((adti) this.a).f.d();
                break;
            case 13:
                ((adti) this.a).f.e();
                break;
            case 14:
                ((adth) this.a).a.e();
                break;
            case 15:
                ?? r7 = ((sm) ((ajmd) this.a).a).a;
                adnq adnqVarE = adnq.m.e("Keepalive failed. The connection is likely gone");
                adzt adztVar2 = adzt.SUBCHANNEL_SHUTDOWN;
                r7.a(adnqVarE);
                break;
            case 16:
                aduw aduwVar = (aduw) this.a;
                aduwVar.v = null;
                aduwVar.d.a(2, "CONNECTING after backoff");
                aduwVar.b(adjh.a);
                aduwVar.h();
                break;
            case 17:
                aduw aduwVar2 = (aduw) this.a;
                if (aduwVar2.p.a == adjh.d) {
                    aduwVar2.d.a(2, "CONNECTING as requested");
                    aduwVar2.b(adjh.a);
                    aduwVar2.h();
                    break;
                }
                break;
            case 18:
                aduw aduwVar3 = (aduw) ((adsy) this.a).a;
                adwi adwiVar = aduwVar3.k;
                aduwVar3.w = null;
                aduwVar3.k = null;
                adwiVar.q(adnq.m.e("InternalSubchannel closed transport due to address change"));
                break;
            case 19:
                ?? r72 = this.a;
                aduw aduwVar4 = (aduw) r72;
                aduwVar4.d.a(2, "Terminated");
                advv advvVar2 = ((adrl) aduwVar4.a.b).i;
                advvVar2.u.remove(r72);
                adkj.c(advvVar2.G.e, r72);
                advvVar2.j();
                break;
            default:
                aduu aduuVar = (aduu) this.a;
                aduw aduwVar5 = aduuVar.c;
                aduwVar5.u = null;
                if (aduwVar5.q == null) {
                    adss adssVar = aduwVar5.n;
                    adss adssVar2 = aduuVar.a;
                    if (adssVar == adssVar2) {
                        aduwVar5.o = adssVar2;
                        aduwVar5.n = null;
                        adut adutVar = aduwVar5.h;
                        aduwVar5.r = adutVar.a();
                        aduwVar5.b(adjh.b);
                        adzz adzzVar = aduwVar5.s;
                        String str = aduwVar5.t;
                        String strG = aduu.g(adutVar.a());
                        String strF = aduu.f(adutVar.a(), adjv.b);
                        String strE = aduu.e((adne) adutVar.a().a(adua.a));
                        admy admyVar = adzz.c;
                        yfq yfqVarQ = yfq.q(str);
                        yfq yfqVarR = yfq.r(strG, strF);
                        admh admhVar = adzzVar.a;
                        admhVar.a(admyVar, yfqVarQ, yfqVarR);
                        admhVar.b(adzz.e, yfq.q(str), yfq.s(strE, strG, strF));
                        break;
                    }
                } else {
                    woy.aa(aduwVar5.o == null, "Unexpected non-null activeTransport");
                    aduuVar.a.q(aduwVar5.q);
                    break;
                }
                break;
        }
    }

    public adpo(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
