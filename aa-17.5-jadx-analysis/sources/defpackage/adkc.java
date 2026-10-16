package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class adkc extends admw {
    final /* synthetic */ zja a;
    final /* synthetic */ adjq b;
    private final adng c;
    private final AtomicBoolean d = new AtomicBoolean(false);

    public adkc(adng adngVar, zja zjaVar, adjq adjqVar) {
        this.a = zjaVar;
        this.b = adjqVar;
        this.c = adngVar;
    }

    @Override // defpackage.adng
    public final admf a() {
        return this.c.a();
    }

    @Override // defpackage.adng
    public final void b(Object obj) {
        this.c.b(obj);
    }

    @Override // defpackage.admw
    public final adng c() {
        return this.c;
    }

    @Override // defpackage.admw, defpackage.adng
    public final void d(adnq adnqVar, admc admcVar) {
        adnqVar.getClass();
        if (this.d.get()) {
            zja zjaVar = this.a;
            if (((AtomicReference) zjaVar.a[0].c.a(this.b)).get() != null) {
                super.d(adnq.l.e("Parcelable response headers can be populated only before the first response."), admcVar);
                return;
            }
        }
        this.a.a(admcVar, this.b, false);
        super.d(adnqVar, admcVar);
    }

    @Override // defpackage.admw, defpackage.adng
    public final void e(admc admcVar) {
        this.a.a(admcVar, this.b, true);
        this.d.set(true);
        this.c.e(admcVar);
    }

    @Override // defpackage.admw, defpackage.adng
    public final /* synthetic */ void f() {
        this.c.f();
    }
}
