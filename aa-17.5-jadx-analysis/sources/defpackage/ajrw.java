package defpackage;

/* loaded from: classes2.dex */
public final class ajrw extends akbb {
    public static ajrw g(akba akbaVar) {
        return akbaVar instanceof ajrw ? (ajrw) akbaVar : new ajrw(akbaVar);
    }

    public final ajqe a() {
        return (ajqe) j("http.auth.proxy-scope", ajqe.class);
    }

    public final ajqe b() {
        return (ajqe) j("http.auth.target-scope", ajqe.class);
    }

    public final ajqp c() {
        return (ajqp) j("http.auth.auth-cache", ajqp.class);
    }

    public final ajqw d() {
        return (ajqw) j("http.cookie-store", ajqw.class);
    }

    public final ajqx e() {
        return (ajqx) j("http.auth.credentials-provider", ajqx.class);
    }

    public final ajri f() {
        ajri ajriVar = (ajri) j("http.request-config", ajri.class);
        return ajriVar != null ? ajriVar : ajri.a;
    }

    public final ajtk h() {
        return (ajtk) j("http.route", ajtg.class);
    }

    public final ajsl i(String str) {
        return (ajsl) j(str, ajsl.class);
    }
}
