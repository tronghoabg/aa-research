package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.libraries.geo.mapcore.geoxp.jni.fetcher.NativeNetworkTileFetchHandler;
import com.google.android.libraries.geo.mapcore.geoxp.jni.observers.NativeMapFactoryObserversHandler;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;
import java.util.function.BooleanSupplier;

/* loaded from: classes2.dex */
public final class pky implements ackr {
    private final acku a;
    private final acku b;
    private final acku c;
    private final /* synthetic */ int d;

    public pky(acku ackuVar, acku ackuVar2, acku ackuVar3, int i) {
        this.d = i;
        this.a = ackuVar;
        this.b = ackuVar2;
        this.c = ackuVar3;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        zwm zwmVarH;
        switch (this.d) {
            case 0:
                Context context = (Context) this.a.a();
                pkx pkxVar = new pkx(context, (erb) this.c.a());
                plf.a = pkxVar;
                return pkxVar;
            case 1:
                return new pke((xxh) ((acks) this.b).b, this.c);
            case 2:
                ((psy) this.c).a();
                ((psw) this.a).a();
                Set set = (Set) ((acks) this.b).b;
                ygp ygpVar = new ygp();
                ygpVar.c(lws.J(psv.b()));
                ygpVar.c(lws.J(psx.b()));
                ygpVar.c(new zid("any.googlevideo.com", 443, 443));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ygpVar.c(new zid((String) it.next(), 443, 443));
                }
                ygr ygrVarG = ygpVar.g();
                ygrVarG.getClass();
                return ygrVarG;
            case 3:
                Context context2 = (Context) this.a.a();
                final plj pljVar = (plj) this.b.a();
                tmb tmbVar = (tmb) this.c.a();
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                connectivityManager.getClass();
                return new ptk(connectivityManager, new BooleanSupplier() { // from class: ptl
                    @Override // java.util.function.BooleanSupplier
                    public final boolean getAsBoolean() {
                        plj pljVar2 = pljVar;
                        return !pljVar2.e() && pljVar2.d();
                    }
                }, tmbVar);
            case 4:
                return new vkj(((puk) this.a).a(), ackq.b(this.b), (tmb) this.c.a(), 1);
            case 5:
                acku ackuVar = this.c;
                acku ackuVar2 = this.b;
                psx psxVarA = ((psy) this.a).a();
                puy puyVarA = ((puz) ackuVar2).a();
                return new puw(psxVarA.a(), puyVarA, psxVarA);
            case 6:
                return new aabf(((wdt) this.c).a(), ackq.b(this.a), ackq.b(this.b));
            case 7:
                acku ackuVar3 = this.a;
                puy puyVarA2 = ((puz) this.b).a();
                URL urlA = pxu.a();
                return new puw(urlA, puyVarA2, new pxk(urlA, this.c));
            case 8:
                acku ackuVar4 = this.c;
                ackk ackkVarB = ackq.b(this.a);
                ackq.b(ackuVar4);
                return new nzj(ackkVarB);
            case 9:
                acku ackuVar5 = this.a;
                acku ackuVar6 = this.b;
                pmc pmcVarA = ((pmg) this.c).a();
                zgt zgtVarA = ((pse) ackuVar6).a();
                return new NativeNetworkTileFetchHandler(pmcVarA, zgtVarA);
            case 10:
                return new NativeMapFactoryObserversHandler(((uri) this.c).a(), (kex) this.b.a(), ((uxv) this.a).b());
            case 11:
                Context context3 = (Context) this.a.a();
                return new uaj(context3, this.b);
            case 12:
                rjs rjsVar = (rjs) this.a.a();
                rjsVar.getClass();
                return rjsVar;
            case 13:
                ackq.b(this.c);
                ackq.b(this.b);
                return new uqw();
            case 14:
                ackq.b(this.b);
                trx trxVar = (trx) ackq.b(this.c).a();
                trxVar.getClass();
                return trxVar;
            case 15:
                return ((gjv) this.a.a()).r() ? xxh.h(new ncp((tnq) this.b.a(), (ucf) this.c.a())) : xvy.a;
            case 16:
                uqw uqwVar = (uqw) this.c.a();
                uqwVar.getClass();
                return uqwVar;
            case 17:
                std stdVar = (std) ackq.b(this.c).a();
                stdVar.getClass();
                return stdVar;
            case 18:
                ((uxv) this.c).b();
                return xvy.a;
            case 19:
                acku ackuVar7 = this.b;
                std stdVarA = ((uqx) this.c).a();
                ((uvv) ackuVar7).a();
                return stdVarA;
            default:
                xxh xxhVar = (xxh) ((acks) this.a).b;
                xxh xxhVar2 = (xxh) this.b.a();
                xxh xxhVar3 = (xxh) this.c.a();
                if (xxhVar.f()) {
                    zwmVarH = (zwm) xxhVar.b();
                } else if (xxhVar2.f()) {
                    zwmVarH = ((trb) xxhVar2.b()).a();
                } else {
                    if (!xxhVar3.f()) {
                        throw new IllegalStateException("No MapSettings bound");
                    }
                    zwmVarH = ((trc) xxhVar3.b()).h();
                }
                zwmVarH.getClass();
                return zwmVarH;
        }
    }

    public pky(acku ackuVar, acku ackuVar2, acku ackuVar3, int i, char[] cArr) {
        this.d = i;
        this.c = ackuVar;
        this.a = ackuVar2;
        this.b = ackuVar3;
    }

    public pky(acku ackuVar, acku ackuVar2, acku ackuVar3, int i, byte[][] bArr) {
        this.d = i;
        this.b = ackuVar;
        this.a = ackuVar2;
        this.c = ackuVar3;
    }

    public pky(acku ackuVar, acku ackuVar2, acku ackuVar3, int i, int[][] iArr) {
        this.d = i;
        this.c = ackuVar;
        this.b = ackuVar2;
        this.a = ackuVar3;
    }

    public pky(acku ackuVar, acku ackuVar2, acku ackuVar3, int i, byte[][][] bArr) {
        this.d = i;
        this.a = ackuVar;
        this.c = ackuVar2;
        this.b = ackuVar3;
    }

    public pky(acku ackuVar, acku ackuVar2, acku ackuVar3, int i, float[][][] fArr) {
        this.d = i;
        this.b = ackuVar;
        this.c = ackuVar2;
        this.a = ackuVar3;
    }
}
