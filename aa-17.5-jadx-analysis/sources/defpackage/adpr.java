package defpackage;

import android.content.Intent;
import j$.util.Objects;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;

/* loaded from: classes.dex */
public final class adpr extends adms {
    private static Intent g(String str) {
        try {
            return Intent.parseUri(str, 1);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.admo
    public final admr a(adnz adnzVar, admm admmVar) {
        if (Objects.equals(adnzVar.k, "intent")) {
            return new adpq(g(adnzVar.toString()), admmVar);
        }
        return null;
    }

    @Override // defpackage.admo
    public final admr b(URI uri, admm admmVar) {
        if (Objects.equals(uri.getScheme(), "intent")) {
            return new adpq(g(uri.toString()), admmVar);
        }
        return null;
    }

    @Override // defpackage.admo
    public final String c() {
        return "intent";
    }

    @Override // defpackage.adms
    public final int d() {
        return 3;
    }

    @Override // defpackage.adms
    public final /* synthetic */ Collection e() {
        return new ymp(adod.class);
    }

    @Override // defpackage.adms
    public final void f() {
    }
}
