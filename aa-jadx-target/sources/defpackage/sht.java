package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class sht extends defpackage.rxq {
    final /* synthetic */ defpackage.shu a;

    public sht(defpackage.shu shuVar) {
        this.a = shuVar;
    }

    @Override // defpackage.rxr
    public final void f() {
        defpackage.shu.a.l().ai(8964).u("CarConnectionManagerImpl::StartupServiceCallback::onPreflightComplete");
        defpackage.shu shuVar = this.a;
        shuVar.d.post(new defpackage.sho(shuVar.h, 6));
    }

    @Override // defpackage.rxr
    public final void g(int i, int i2, java.lang.String str) {
        defpackage.yqk yqkVar = defpackage.shu.a;
        defpackage.shr shrVar = new defpackage.shr(this, i, i2, 0);
        defpackage.shu shuVar = this.a;
        shuVar.d.post(shrVar);
        shuVar.a();
    }

    @Override // defpackage.rxr
    public final void h(final boolean z, final java.util.List list, int i, int i2, byte[] bArr) {
        this.a.c.post(new java.lang.Runnable() { // from class: shs
            @Override // java.lang.Runnable
            public final void run() {
                java.util.List<byte[]> list2 = list;
                defpackage.shp shpVar = this.a.a.g;
                if (shpVar != null) {
                    if (z) {
                        try {
                            for (byte[] bArr2 : list2) {
                                java.util.List list3 = shpVar.e;
                                defpackage.abox aboxVarD = defpackage.abox.D(defpackage.xpa.a, bArr2, 0, bArr2.length, defpackage.abol.a());
                                defpackage.abox.U(aboxVarD);
                                list3.add((defpackage.xpa) aboxVarD);
                            }
                            list2.size();
                            shpVar.h.d.post(new defpackage.rzu(shpVar, 6));
                            return;
                        } catch (defpackage.abpp unused) {
                        }
                    }
                    defpackage.shu shuVar = shpVar.h;
                    shuVar.d.post(new defpackage.sho(shuVar.h, 1));
                }
            }
        });
    }

    @Override // defpackage.rxr
    public final void j() {
        defpackage.shu.a.f().ai(8966).u("Startup service tearing down");
        this.a.a();
    }

    @Override // defpackage.rxr
    public final void a() {
    }

    @Override // defpackage.rxr
    public final void b(int i) {
    }

    @Override // defpackage.rxr
    public final void c(boolean z) {
    }

    @Override // defpackage.rxr
    public final void d(int i) {
    }

    @Override // defpackage.rxr
    @java.lang.Deprecated
    public final void k(java.util.List list, byte[] bArr) {
    }

    @Override // defpackage.rxr
    public final void i(java.util.List list, byte[] bArr, android.os.Bundle bundle) {
    }
}
