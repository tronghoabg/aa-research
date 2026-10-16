package com.google.android.gms.o;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.av;
import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ag {
    @Deprecated
    public static t a(Executor executor, Callable callable) {
        av.n(executor, "Executor must not be null");
        aa aaVar = new aa();
        executor.execute(new ab(aaVar, callable));
        return aaVar;
    }

    public static t b(Exception exc) {
        aa aaVar = new aa();
        aaVar.s(exc);
        return aaVar;
    }

    public static t c(Object obj) {
        aa aaVar = new aa();
        aaVar.t(obj);
        return aaVar;
    }

    public static t d(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return c(null);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((t) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        aa aaVar = new aa();
        af afVar = new af(collection.size(), aaVar);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            l((t) it2.next(), afVar);
        }
        return aaVar;
    }

    public static t e(t... tVarArr) {
        List listAsList = Arrays.asList(tVarArr);
        return (listAsList == null || listAsList.isEmpty()) ? c(Collections.EMPTY_LIST) : d(listAsList).c(z.f5781a, new ac(listAsList));
    }

    public static Object f(t tVar) throws InterruptedException {
        av.g();
        av.f();
        if (tVar.j()) {
            return k(tVar);
        }
        ad adVar = new ad();
        l(tVar, adVar);
        adVar.a();
        return k(tVar);
    }

    public static Object g(t tVar, long j2, TimeUnit timeUnit) throws TimeoutException {
        av.g();
        av.f();
        av.n(timeUnit, "TimeUnit must not be null");
        if (tVar.j()) {
            return k(tVar);
        }
        ad adVar = new ad();
        l(tVar, adVar);
        if (adVar.b(j2, timeUnit)) {
            return k(tVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static final Bundle h(String str, String str2) {
        h.g.b.x.f(str, "serverClientId");
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE", str2);
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED", true);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL");
        return bundle;
    }

    public static void i(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static final File j(Uri uri) throws com.google.android.libraries.e.a.b.c {
        if (!uri.getScheme().equals("file")) {
            throw new com.google.android.libraries.e.a.b.c("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new com.google.android.libraries.e.a.b.c("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new com.google.android.libraries.e.a.b.c("Did not expect uri to have authority");
    }

    private static Object k(t tVar) throws ExecutionException {
        if (tVar.k()) {
            return tVar.g();
        }
        if (tVar.i()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(tVar.f());
    }

    private static void l(t tVar, ae aeVar) {
        Executor executor = z.f5782b;
        tVar.q(executor, aeVar);
        tVar.p(executor, aeVar);
        tVar.l(executor, aeVar);
    }
}
