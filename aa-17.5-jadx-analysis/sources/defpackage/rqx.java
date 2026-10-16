package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes.dex */
public abstract class rqx {
    protected rqy a(rqy rqyVar) {
        woy.aa(rqyVar.e() != yxc.UNKNOWN_EVENT_TYPE, "carEventType is required.");
        woy.aa(rqyVar.f() != yxy.DOMAIN_UNSPECIFIED, "domainIdType is required");
        return rqyVar;
    }

    protected abstract rqy b();

    protected abstract ygp c();

    @ResultIgnorabilityUnspecified
    public final rqy l() {
        return a(b());
    }

    public final void m(acai acaiVar) {
        c().c(acaiVar);
    }
}
