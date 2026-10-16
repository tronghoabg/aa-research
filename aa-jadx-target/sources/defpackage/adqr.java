package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adqr extends defpackage.adnt {
    private static android.content.Intent g(java.lang.String str) {
        try {
            return android.content.Intent.parseUri(str, 1);
        } catch (java.net.URISyntaxException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    @Override // defpackage.adnp
    public final defpackage.adns a(defpackage.adpa adpaVar, defpackage.adnn adnnVar) {
        if (j$.util.Objects.equals(adpaVar.k, "intent")) {
            return new adqq(g(adpaVar.toString()), adnnVar);
        }
        return null;
    }

    @Override // defpackage.adnp
    public final defpackage.adns b(java.net.URI uri, defpackage.adnn adnnVar) {
        if (j$.util.Objects.equals(uri.getScheme(), "intent")) {
            return new adqq(g(uri.toString()), adnnVar);
        }
        return null;
    }

    @Override // defpackage.adnp
    public final java.lang.String c() {
        return "intent";
    }

    @Override // defpackage.adnt
    public final int d() {
        return 3;
    }

    @Override // defpackage.adnt
    public final /* synthetic */ java.util.Collection e() {
        return new defpackage.ynu(defpackage.adpe.class);
    }

    @Override // defpackage.adnt
    public final void f() {
    }
}
