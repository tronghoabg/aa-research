package defpackage;

import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes.dex */
public final class adto extends adms {
    private static final boolean a = adqq.C(adto.class.getClassLoader());

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.admo
    public final admr a(adnz adnzVar, admm admmVar) {
        String string = null;
        if (!"dns".equals(adnzVar.k)) {
            return null;
        }
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        adnz.d(adnzVar.l, yflVar);
        yfq yfqVarG = yflVar.g();
        woy.W(!yfqVarG.isEmpty(), "expected 1 path segment in target %s but found %s", adnzVar, yfqVarG);
        String str = (String) yfqVarG.get(0);
        if (adnzVar.f()) {
            StringBuilder sb = new StringBuilder();
            adnzVar.c(sb);
            string = sb.toString();
        }
        adnz.a(string);
        return new adtn(str, admmVar, adue.o, new xya(), a);
    }

    @Override // defpackage.admo
    public final admr b(URI uri, admm admmVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String path = uri.getPath();
        path.getClass();
        woy.W(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
        String strSubstring = path.substring(1);
        uri.getAuthority();
        return new adtn(strSubstring, admmVar, adue.o, new xya(), a);
    }

    @Override // defpackage.admo
    public final String c() {
        return "dns";
    }

    @Override // defpackage.adms
    public final int d() {
        return 5;
    }

    @Override // defpackage.adms
    public final Collection e() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // defpackage.adms
    protected final void f() {
    }
}
