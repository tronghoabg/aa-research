package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aduo extends defpackage.adnt {
    private static final boolean a = defpackage.adrq.s(defpackage.aduo.class.getClassLoader());

    /* JADX INFO: Thrown type has an unknown type hierarchy: xzp */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.adnp
    public final defpackage.adns a(defpackage.adpa adpaVar, defpackage.adnn adnnVar) throws xzp {
        java.lang.String string = null;
        if (!"dns".equals(adpaVar.k)) {
            return null;
        }
        int i = defpackage.ygw.d;
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        defpackage.adpa.d(adpaVar.l, ygrVar);
        defpackage.ygw ygwVarG = ygrVar.g();
        defpackage.ysr.bg(!ygwVarG.isEmpty(), "expected 1 path segment in target %s but found %s", adpaVar, ygwVarG);
        java.lang.String str = (java.lang.String) ygwVarG.get(0);
        if (adpaVar.f()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            adpaVar.c(sb);
            string = sb.toString();
        }
        defpackage.adpa.a(string);
        return new adun(str, adnnVar, defpackage.adve.o, new defpackage.xzg(), a);
    }

    @Override // defpackage.adnp
    public final defpackage.adns b(java.net.URI uri, defpackage.adnn adnnVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        java.lang.String path = uri.getPath();
        path.getClass();
        defpackage.ysr.bg(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
        java.lang.String strSubstring = path.substring(1);
        uri.getAuthority();
        return new adun(strSubstring, adnnVar, defpackage.adve.o, new defpackage.xzg(), a);
    }

    @Override // defpackage.adnp
    public final java.lang.String c() {
        return "dns";
    }

    @Override // defpackage.adnt
    public final int d() {
        return 5;
    }

    @Override // defpackage.adnt
    public final java.util.Collection e() {
        return java.util.Collections.singleton(java.net.InetSocketAddress.class);
    }

    @Override // defpackage.adnt
    protected final void f() {
    }
}
