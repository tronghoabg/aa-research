package defpackage;

import com.google.android.apps.gmm.systems.accounts.GmmAccount;
import j$.util.Optional;

/* loaded from: classes2.dex */
public final class pjn implements ackr {
    private final acku a;
    private final /* synthetic */ int b;

    public pjn(acku ackuVar, int i) {
        this.b = i;
        this.a = ackuVar;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        pqv pqvVar;
        switch (this.b) {
            case 0:
                GmmAccount.SignedOut signedOut = pmp.a;
                signedOut.getClass();
                return signedOut;
            case 1:
                pjq pjqVarA = ((pjr) this.a).a();
                pjqVarA.c();
                return pjqVarA;
            case 2:
                return new vai(((pjq) this.a.a()).a());
            case 3:
                final pjq pjqVar = (pjq) this.a.a();
                return new uxr() { // from class: pjm
                    @Override // defpackage.uxr
                    public final zgp a() {
                        return wub.Z(pjqVar.a);
                    }
                };
            case 4:
                return ((pmb) this.a).a();
            case 5:
                return ((pme) this.a).a();
            case 6:
                return new pmd(((pmh) this.a).a(), 3, (short[]) null);
            case 7:
                aaun aaunVarAh = lvl.ah(((pqk) this.a).a());
                aaunVarAh.getClass();
                return aaunVarAh;
            case 8:
                aauo aauoVarAi = lvl.ai(((pqk) this.a).a());
                aauoVarAi.getClass();
                return aauoVarAi;
            case 9:
                return new sm(ackq.b(this.a), (byte[]) null);
            case 10:
                return new ppv((xxh) ((acks) this.a).b);
            case 11:
                xxh xxhVar = (xxh) ((acks) this.a).b;
                return (!xxhVar.f() || (pqvVar = (pqv) ((aezk) xxhVar.b()).a()) == null) ? xvy.a : xxh.h(pqvVar);
            case 12:
                try {
                    vaq.d();
                    return xvy.a;
                } catch (Exception unused) {
                    ((ynz) ((ynz) pqp.a.d()).ai((char) 6840)).u("Failed to fetch PseudonymousId from GmsCore");
                    return xvy.a;
                }
            case 13:
                return ((prw) this.a.a()).a(psb.LOCATION_FRESHNESS_WAITING_THREADPOOL);
            case 14:
                return (zgt) ((prw) this.a.a()).a(psb.UI_THREAD);
            case 15:
                return new psj((Optional) ((acks) this.a).b);
            case 16:
                return new psz(((uyq) this.a).b());
            case 17:
                return new sm((erb) this.a.a(), (byte[]) null);
            case 18:
                return new pur(this.a);
            case 19:
                return new pvm((erb) this.a.a());
            default:
                return new pwa(((uxv) this.a).b());
        }
    }
}
