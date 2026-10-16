package e.a.d;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.charset.CharacterCodingException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cp extends e.a.de {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f46758a = e.a.dt.g(cp.class.getClassLoader());

    @Override // e.a.cz
    public final e.a.dd a(e.a.ep epVar, e.a.cx cxVar) throws CharacterCodingException {
        if (!"dns".equals(epVar.d())) {
            return null;
        }
        List listE = epVar.e();
        com.google.d.b.an.s(!listE.isEmpty(), "expected 1 path segment in target %s but found %s", epVar, listE);
        String str = (String) listE.get(0);
        epVar.h();
        return new co(str, cxVar, dh.m, com.google.d.b.ai.c(), f46758a);
    }

    @Override // e.a.cz
    public final e.a.dd b(URI uri, e.a.cx cxVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String path = uri.getPath();
        com.google.d.b.an.C(path, "targetPath");
        com.google.d.b.an.s(path.startsWith(DomExceptionUtils.SEPARATOR), "the path component (%s) of the target (%s) must start with '/'", path, uri);
        String strSubstring = path.substring(1);
        uri.getAuthority();
        return new co(strSubstring, cxVar, dh.m, com.google.d.b.ai.c(), f46758a);
    }

    @Override // e.a.cz
    public final String c() {
        return "dns";
    }

    @Override // e.a.de
    public final int d() {
        return 5;
    }

    @Override // e.a.de
    public final Collection e() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // e.a.de
    protected final void f() {
    }
}
