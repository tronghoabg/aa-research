package k.a;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import h.g.b.x;
import h.n.o;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import k.ab;
import k.am;
import k.aq;
import k.n;
import k.p;
import k.y;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class g extends p {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f50758b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final ab f50759c;

    /* renamed from: d, reason: collision with root package name */
    private final ClassLoader f50760d;

    /* renamed from: e, reason: collision with root package name */
    private final p f50761e;

    /* renamed from: f, reason: collision with root package name */
    private final h.f f50762f;

    static {
        String str = ab.f50788a;
        f50759c = aq.c(DomExceptionUtils.SEPARATOR, false);
    }

    public g(ClassLoader classLoader, p pVar) {
        x.f(classLoader, "classLoader");
        x.f(pVar, "systemFileSystem");
        this.f50760d = classLoader;
        this.f50761e = pVar;
        this.f50762f = h.g.a(new h.g.a.a() { // from class: k.a.f
            @Override // h.g.a.a
            public final Object invoke() {
                return g.i(this.f50757a);
            }
        });
    }

    static final List i(g gVar) throws IOException {
        int iAm;
        h.k kVar;
        ClassLoader classLoader = gVar.f50760d;
        Enumeration<URL> resources = classLoader.getResources("");
        x.e(resources, "getResources(...)");
        ArrayList list = Collections.list(resources);
        x.e(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            h.k kVar2 = null;
            if (!it.hasNext()) {
                break;
            }
            URL url = (URL) it.next();
            x.c(url);
            if (x.n(url.getProtocol(), "file")) {
                p pVar = gVar.f50761e;
                String str = ab.f50788a;
                kVar2 = new h.k(pVar, aq.d(new File(url.toURI())));
            }
            if (kVar2 != null) {
                arrayList.add(kVar2);
            }
        }
        ArrayList arrayList2 = arrayList;
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        x.e(resources2, "getResources(...)");
        ArrayList<URL> list2 = Collections.list(resources2);
        x.e(list2, "list(...)");
        ArrayList arrayList3 = new ArrayList();
        for (URL url2 : list2) {
            x.c(url2);
            String string = url2.toString();
            x.e(string, "toString(...)");
            if (o.ah(string, "jar:file:") && (iAm = o.am(string, "!")) != -1) {
                String str2 = ab.f50788a;
                String strSubstring = string.substring(4, iAm);
                x.e(strSubstring, "substring(...)");
                kVar = new h.k(k.c(aq.d(new File(URI.create(strSubstring))), gVar.f50761e, new e()), f50759c);
            } else {
                kVar = null;
            }
            if (kVar != null) {
                arrayList3.add(kVar);
            }
        }
        return h.a.i.af(arrayList2, arrayList3);
    }

    private final List j() {
        return (List) this.f50762f.getValue();
    }

    private static final String k(ab abVar) {
        ab abVar2 = f50759c;
        return abVar2.l(abVar, true).j(abVar2).toString();
    }

    @Override // k.p
    public final n a(ab abVar) throws FileNotFoundException {
        x.f(abVar, "file");
        if (!k.f(abVar)) {
            Objects.toString(abVar);
            throw new FileNotFoundException("file not found: ".concat(String.valueOf(abVar)));
        }
        String strK = k(abVar);
        Iterator it = j().iterator();
        while (it.hasNext()) {
            h.k kVar = (h.k) it.next();
            try {
                return ((p) kVar.a()).a(((ab) kVar.b()).k(strK));
            } catch (FileNotFoundException unused) {
            }
        }
        Objects.toString(abVar);
        throw new FileNotFoundException("file not found: ".concat(String.valueOf(abVar)));
    }

    @Override // k.p
    public final k.o b(ab abVar) {
        x.f(abVar, "path");
        if (!k.f(abVar)) {
            return null;
        }
        String strK = k(abVar);
        for (h.k kVar : j()) {
            k.o oVarB = ((p) kVar.a()).b(((ab) kVar.b()).k(strK));
            if (oVarB != null) {
                return oVarB;
            }
        }
        return null;
    }

    @Override // k.p
    public final am c(ab abVar) throws IOException {
        x.f(abVar, "file");
        if (!k.f(abVar)) {
            Objects.toString(abVar);
            throw new FileNotFoundException("file not found: ".concat(String.valueOf(abVar)));
        }
        ab abVar2 = f50759c;
        String str = ab.f50788a;
        URL resource = this.f50760d.getResource(abVar2.l(abVar, false).j(abVar2).toString());
        if (resource == null) {
            Objects.toString(abVar);
            throw new FileNotFoundException("file not found: ".concat(String.valueOf(abVar)));
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        x.e(inputStream, "getInputStream(...)");
        return y.f(inputStream);
    }

    @Override // k.p
    public final void d(ab abVar, ab abVar2) throws IOException {
        x.f(abVar, "source");
        x.f(abVar2, TypedValues.AttributesType.S_TARGET);
        toString();
        throw new IOException(toString().concat(" is read-only"));
    }

    @Override // k.p
    public final void f(ab abVar) throws IOException {
        x.f(abVar, "dir");
        toString();
        throw new IOException(toString().concat(" is read-only"));
    }

    @Override // k.p
    public final void g(ab abVar) throws IOException {
        x.f(abVar, "path");
        toString();
        throw new IOException(toString().concat(" is read-only"));
    }

    @Override // k.p
    public final n h(ab abVar) throws IOException {
        x.f(abVar, "file");
        throw new IOException("resources are not writable");
    }
}
