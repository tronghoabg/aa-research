package k;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.zip.Inflater;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ap extends p {

    /* renamed from: b, reason: collision with root package name */
    private static final ab f50822b;

    /* renamed from: c, reason: collision with root package name */
    private final ab f50823c;

    /* renamed from: d, reason: collision with root package name */
    private final p f50824d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f50825e;

    static {
        String str = ab.f50788a;
        f50822b = aq.c(DomExceptionUtils.SEPARATOR, false);
    }

    public ap(ab abVar, p pVar, Map map) {
        h.g.b.x.f(abVar, "zipPath");
        h.g.b.x.f(pVar, "fileSystem");
        h.g.b.x.f(map, "entries");
        this.f50823c = abVar;
        this.f50824d = pVar;
        this.f50825e = map;
    }

    private static final ab i(ab abVar) {
        return f50822b.l(abVar, true);
    }

    @Override // k.p
    public final n a(ab abVar) {
        h.g.b.x.f(abVar, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // k.p
    public final o b(ab abVar) throws Throwable {
        Throwable th;
        k.a.i iVar;
        Throwable th2;
        k.a.i iVarD;
        h.g.b.x.f(abVar, "path");
        k.a.i iVar2 = (k.a.i) this.f50825e.get(i(abVar));
        if (iVar2 == null) {
            return null;
        }
        if (iVar2.c() != -1) {
            n nVarA = this.f50824d.a(this.f50823c);
            try {
                j jVarF = aq.f(nVarA.d(iVar2.c()));
                try {
                    iVarD = k.a.k.d(jVarF, iVar2);
                    try {
                        jVarF.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        jVarF.close();
                    } catch (Throwable th5) {
                        e.a.h.ad.c(th4, th5);
                    }
                    th2 = th4;
                    iVarD = null;
                }
            } catch (Throwable th6) {
                try {
                    nVarA.close();
                } catch (Throwable th7) {
                    e.a.h.ad.c(th6, th7);
                }
                th = th6;
                iVar = null;
            }
            if (th2 != null) {
                throw th2;
            }
            iVar = iVarD;
            try {
                nVarA.close();
                th = null;
            } catch (Throwable th8) {
                th = th8;
            }
            if (th != null) {
                throw th;
            }
            iVar2 = iVar;
        }
        return new o(!iVar2.k(), iVar2.k(), iVar2.k() ? null : Long.valueOf(iVar2.d()), iVar2.e(), iVar2.g(), iVar2.f());
    }

    @Override // k.p
    public final am c(ab abVar) throws Throwable {
        j jVarF;
        h.g.b.x.f(abVar, "file");
        k.a.i iVar = (k.a.i) this.f50825e.get(i(abVar));
        if (iVar == null) {
            Objects.toString(abVar);
            throw new FileNotFoundException("no such file: ".concat(String.valueOf(abVar)));
        }
        n nVarA = this.f50824d.a(this.f50823c);
        Throwable th = null;
        try {
            jVarF = aq.f(nVarA.d(iVar.c()));
            try {
                nVarA.close();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            try {
                nVarA.close();
            } catch (Throwable th4) {
                e.a.h.ad.c(th3, th4);
            }
            jVarF = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        j jVar = jVarF;
        k.a.k.e(jVar);
        if (iVar.a() == 0) {
            return new k.a.d(jVar, iVar.d(), true);
        }
        k.a.d dVar = new k.a.d(jVar, iVar.b(), true);
        Inflater inflater = new Inflater(true);
        h.g.b.x.f(dVar, "source");
        h.g.b.x.f(inflater, "inflater");
        return new k.a.d(new u(aq.f(dVar), inflater), iVar.d(), false);
    }

    @Override // k.p
    public final void d(ab abVar, ab abVar2) throws IOException {
        h.g.b.x.f(abVar, "source");
        h.g.b.x.f(abVar2, TypedValues.AttributesType.S_TARGET);
        throw new IOException("zip file systems are read-only");
    }

    @Override // k.p
    public final void f(ab abVar) throws IOException {
        h.g.b.x.f(abVar, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // k.p
    public final void g(ab abVar) throws IOException {
        h.g.b.x.f(abVar, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // k.p
    public final n h(ab abVar) throws IOException {
        h.g.b.x.f(abVar, "file");
        throw new IOException("zip entries are not writable");
    }
}
