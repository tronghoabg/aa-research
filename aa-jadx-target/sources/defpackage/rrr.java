package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class rrr {
    protected defpackage.rrs a(defpackage.rrs rrsVar) {
        defpackage.ysr.bk(rrsVar.e() != defpackage.yyh.UNKNOWN_EVENT_TYPE, "carEventType is required.");
        defpackage.ysr.bk(rrsVar.f() != defpackage.yzd.DOMAIN_UNSPECIFIED, "domainIdType is required");
        return rrsVar;
    }

    protected abstract defpackage.rrs b();

    protected abstract defpackage.yhv c();

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.rrs l() {
        return a(b());
    }

    public final void m(defpackage.acbk acbkVar) {
        c().c(acbkVar);
    }
}
