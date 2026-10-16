package cg;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class K extends m {

    /* renamed from: e, reason: collision with root package name */
    public static final y f19883e;

    /* renamed from: b, reason: collision with root package name */
    public final y f19884b;

    /* renamed from: c, reason: collision with root package name */
    public final m f19885c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f19886d;

    static {
        String str = y.f19937b;
        f19883e = ad.r.g("/");
    }

    public K(y yVar, m mVar, LinkedHashMap linkedHashMap) {
        this.f19884b = yVar;
        this.f19885c = mVar;
        this.f19886d = linkedHashMap;
    }

    @Override // cg.m
    public final void a(y path) throws IOException {
        AbstractC3340k.e(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // cg.m
    public final List d(y dir) throws IOException {
        AbstractC3340k.e(dir, "dir");
        y yVar = f19883e;
        yVar.getClass();
        dg.f fVar = (dg.f) this.f19886d.get(dg.c.b(yVar, dir, true));
        if (fVar != null) {
            return ff.o.S0(fVar.f34309h);
        }
        throw new IOException("not a directory: " + dir);
    }

    @Override // cg.m
    public final R0.e f(y path) throws Throwable {
        R0.e eVarF;
        Throwable th;
        AbstractC3340k.e(path, "path");
        y yVar = f19883e;
        yVar.getClass();
        dg.f fVar = (dg.f) this.f19886d.get(dg.c.b(yVar, path, true));
        Throwable th2 = null;
        if (fVar == null) {
            return null;
        }
        boolean z2 = fVar.f34303b;
        R0.e eVar = new R0.e(!z2, z2, null, z2 ? null : Long.valueOf(fVar.f34305d), null, fVar.f34307f, null);
        long j8 = fVar.f34308g;
        if (j8 == -1) {
            return eVar;
        }
        t tVarG = this.f19885c.g(this.f19884b);
        try {
            C1610B c1610bD = AbstractC1613b.d(tVarG.b(j8));
            try {
                eVarF = dg.b.f(c1610bD, eVar);
                AbstractC3340k.b(eVarF);
                try {
                    c1610bD.close();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    c1610bD.close();
                } catch (Throwable th5) {
                    Fe.b.d(th4, th5);
                }
                th = th4;
                eVarF = null;
            }
        } catch (Throwable th6) {
            if (tVarG != null) {
                try {
                    tVarG.close();
                } catch (Throwable th7) {
                    Fe.b.d(th6, th7);
                }
            }
            eVarF = null;
            th2 = th6;
        }
        if (th != null) {
            throw th;
        }
        AbstractC3340k.b(eVarF);
        try {
            tVarG.close();
        } catch (Throwable th8) {
            th2 = th8;
        }
        if (th2 != null) {
            throw th2;
        }
        AbstractC3340k.b(eVarF);
        return eVarF;
    }

    @Override // cg.m
    public final t g(y yVar) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // cg.m
    public final F h(y file) throws IOException {
        AbstractC3340k.e(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // cg.m
    public final H i(y file) throws Throwable {
        Throwable th;
        C1610B c1610bD;
        AbstractC3340k.e(file, "file");
        y yVar = f19883e;
        yVar.getClass();
        dg.f fVar = (dg.f) this.f19886d.get(dg.c.b(yVar, file, true));
        if (fVar == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        t tVarG = this.f19885c.g(this.f19884b);
        try {
            c1610bD = AbstractC1613b.d(tVarG.b(fVar.f34308g));
            try {
                tVarG.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (tVarG != null) {
                try {
                    tVarG.close();
                } catch (Throwable th4) {
                    Fe.b.d(th3, th4);
                }
            }
            th = th3;
            c1610bD = null;
        }
        if (th != null) {
            throw th;
        }
        AbstractC3340k.b(c1610bD);
        dg.b.f(c1610bD, null);
        int i5 = fVar.f34306e;
        long j8 = fVar.f34305d;
        if (i5 == 0) {
            return new dg.d(c1610bD, j8, true);
        }
        return new dg.d(new s(AbstractC1613b.d(new dg.d(c1610bD, fVar.f34304c, true)), new Inflater(true)), j8, false);
    }
}
