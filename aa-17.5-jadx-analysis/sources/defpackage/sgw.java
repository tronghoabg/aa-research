package defpackage;

import android.os.Bundle;
import java.util.List;

/* loaded from: classes.dex */
final class sgw extends rwx {
    final /* synthetic */ sgx a;

    public sgw(sgx sgxVar) {
        this.a = sgxVar;
    }

    @Override // defpackage.rwy
    public final void f() {
        sgx.a.l().ai(8939).u("CarConnectionManagerImpl::StartupServiceCallback::onPreflightComplete");
        sgx sgxVar = this.a;
        sgxVar.d.post(new rsv(sgxVar.h, 17));
    }

    @Override // defpackage.rwy
    public final void g(int i, int i2, String str) {
        ypf ypfVar = sgx.a;
        sgu sguVar = new sgu(this, i, i2, 0);
        sgx sgxVar = this.a;
        sgxVar.d.post(sguVar);
        sgxVar.a();
    }

    @Override // defpackage.rwy
    public final void h(final boolean z, final List list, int i, int i2, byte[] bArr) {
        this.a.c.post(new Runnable() { // from class: sgv
            @Override // java.lang.Runnable
            public final void run() {
                List<byte[]> list2 = list;
                sgs sgsVar = this.a.a.g;
                if (sgsVar != null) {
                    if (z) {
                        try {
                            for (byte[] bArr2 : list2) {
                                List list3 = sgsVar.e;
                                abnv abnvVarD = abnv.D(xnz.a, bArr2, 0, bArr2.length, abnj.a());
                                abnv.U(abnvVarD);
                                list3.add((xnz) abnvVarD);
                            }
                            list2.size();
                            sgsVar.h.d.post(new rsv(sgsVar, 15));
                            return;
                        } catch (abon unused) {
                        }
                    }
                    sgx sgxVar = sgsVar.h;
                    sgxVar.d.post(new rzy(sgxVar.h, 13));
                }
            }
        });
    }

    @Override // defpackage.rwy
    public final void j() {
        sgx.a.f().ai(8941).u("Startup service tearing down");
        this.a.a();
    }

    @Override // defpackage.rwy
    public final void a() {
    }

    @Override // defpackage.rwy
    public final void b(int i) {
    }

    @Override // defpackage.rwy
    public final void c(boolean z) {
    }

    @Override // defpackage.rwy
    public final void d(int i) {
    }

    @Override // defpackage.rwy
    @Deprecated
    public final void k(List list, byte[] bArr) {
    }

    @Override // defpackage.rwy
    public final void i(List list, byte[] bArr, Bundle bundle) {
    }
}
