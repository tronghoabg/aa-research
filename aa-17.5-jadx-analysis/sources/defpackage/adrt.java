package defpackage;

import androidx.car.app.model.Alert;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class adrt extends adtw {
    public final adss a;
    public final String b;
    final /* synthetic */ adru d;
    private volatile adnq e;
    private adnq f;
    public final AtomicInteger c = new AtomicInteger(-2147483647);
    private final ajmd g = new ajmd(this, null);

    public adrt(adru adruVar, adss adssVar, String str) {
        this.d = adruVar;
        this.a = adssVar;
        str.getClass();
        this.b = str;
    }

    @Override // defpackage.adtw
    protected final adss a() {
        return this.a;
    }

    @Override // defpackage.adtw, defpackage.adsk
    public final adsh b(admf admfVar, admc admcVar, adiw adiwVar, adjb[] adjbVarArr) {
        adsh adshVar;
        Executor executor;
        aclh aclhVar = adiwVar.h;
        if (aclhVar == null) {
            aclhVar = null;
        }
        if (aclhVar == null) {
            return this.c.get() >= 0 ? new adtq(this.e, adjbVarArr) : this.a.b(admfVar, admcVar, adiwVar, adjbVarArr);
        }
        adss adssVar = this.a;
        ajmd ajmdVar = this.g;
        adit aditVar = new adit(adssVar, admfVar, admcVar, adiwVar, ajmdVar, adjbVarArr);
        if (this.c.incrementAndGet() > 0) {
            ajmdVar.b();
            return new adtq(this.e, adjbVarArr);
        }
        try {
            if (!((adoc) aclhVar).f || (executor = adiwVar.c) == null) {
                executor = this.d.a;
            }
            adne adneVar = (adne) woy.ap((adne) this.a.s().a(adua.a), adne.a);
            if (!((adoc) aclhVar).b || adneVar == adne.c) {
                try {
                    adoc.z((String) woy.ap(null, this.b), admfVar);
                    ((adoc) aclhVar).c.a(executor, new adus((adoc) aclhVar, aditVar));
                } catch (adnr e) {
                    aditVar.a(e.a);
                }
            } else {
                aditVar.a(adnq.h.e("Credentials require channel with PRIVACY_AND_INTEGRITY security level. Observed security level: ".concat(adneVar.toString())));
            }
        } catch (Throwable th) {
            aditVar.a(adnq.h.e("Credentials should use fail() instead of throwing exceptions").d(th));
        }
        synchronized (aditVar.g) {
            adshVar = aditVar.h;
            if (adshVar == null) {
                aditVar.j = new adti("call_credentials");
                adshVar = aditVar.j;
                aditVar.h = adshVar;
            }
        }
        return adshVar;
    }

    public final void d() {
        synchronized (this) {
            if (this.c.get() != 0) {
                return;
            }
            adnq adnqVar = this.f;
            this.f = null;
            if (adnqVar != null) {
                super.q(adnqVar);
            }
        }
    }

    @Override // defpackage.adtw, defpackage.adwi
    public final void q(adnq adnqVar) {
        adnqVar.getClass();
        synchronized (this) {
            AtomicInteger atomicInteger = this.c;
            if (atomicInteger.get() < 0) {
                this.e = adnqVar;
                atomicInteger.addAndGet(Alert.DURATION_SHOW_INDEFINITELY);
                if (atomicInteger.get() != 0) {
                    this.f = adnqVar;
                } else {
                    super.q(adnqVar);
                }
            }
        }
    }
}
