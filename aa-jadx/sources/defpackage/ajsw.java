package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajsw extends defpackage.akcb {
    public static defpackage.ajsw g(defpackage.akca akcaVar) {
        return akcaVar instanceof defpackage.ajsw ? (defpackage.ajsw) akcaVar : new defpackage.ajsw(akcaVar);
    }

    public final defpackage.ajre a() {
        return (defpackage.ajre) j("http.auth.proxy-scope", defpackage.ajre.class);
    }

    public final defpackage.ajre b() {
        return (defpackage.ajre) j("http.auth.target-scope", defpackage.ajre.class);
    }

    public final defpackage.ajrp c() {
        return (defpackage.ajrp) j("http.auth.auth-cache", defpackage.ajrp.class);
    }

    public final defpackage.ajrw d() {
        return (defpackage.ajrw) j("http.cookie-store", defpackage.ajrw.class);
    }

    public final defpackage.ajrx e() {
        return (defpackage.ajrx) j("http.auth.credentials-provider", defpackage.ajrx.class);
    }

    public final defpackage.ajsi f() {
        defpackage.ajsi ajsiVar = (defpackage.ajsi) j("http.request-config", defpackage.ajsi.class);
        return ajsiVar != null ? ajsiVar : defpackage.ajsi.a;
    }

    public final defpackage.ajuk h() {
        return (defpackage.ajuk) j("http.route", defpackage.ajug.class);
    }

    public final defpackage.ajtl i(java.lang.String str) {
        return (defpackage.ajtl) j(str, defpackage.ajtl.class);
    }
}
