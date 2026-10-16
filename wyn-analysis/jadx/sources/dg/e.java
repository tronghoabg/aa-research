package dg;

import A0.p;
import Bf.k;
import a9.C1342b;
import ad.r;
import cg.AbstractC1613b;
import cg.F;
import cg.H;
import cg.m;
import cg.u;
import cg.y;
import ef.C2527k;
import ef.C2532p;
import ff.o;
import ff.t;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class e extends m {

    /* renamed from: e, reason: collision with root package name */
    public static final y f34298e;

    /* renamed from: b, reason: collision with root package name */
    public final ClassLoader f34299b;

    /* renamed from: c, reason: collision with root package name */
    public final m f34300c;

    /* renamed from: d, reason: collision with root package name */
    public final C2532p f34301d;

    static {
        String str = y.f19937b;
        f34298e = r.g("/");
    }

    public e(ClassLoader classLoader) {
        u systemFileSystem = m.f19913a;
        AbstractC3340k.e(systemFileSystem, "systemFileSystem");
        this.f34299b = classLoader;
        this.f34300c = systemFileSystem;
        this.f34301d = Fe.c.z(new p(this, 19));
    }

    @Override // cg.m
    public final void a(y path) throws IOException {
        AbstractC3340k.e(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // cg.m
    public final List d(y dir) throws FileNotFoundException {
        AbstractC3340k.e(dir, "dir");
        y yVar = f34298e;
        yVar.getClass();
        String strT = c.b(yVar, dir, true).c(yVar).f19938a.t();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z2 = false;
        for (C2527k c2527k : (List) this.f34301d.getValue()) {
            m mVar = (m) c2527k.f34671a;
            y yVar2 = (y) c2527k.f34672b;
            try {
                List listD = mVar.d(yVar2.d(strT));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listD) {
                    if (C1342b.g((y) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(ff.p.a0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    y yVar3 = (y) it.next();
                    AbstractC3340k.e(yVar3, "<this>");
                    arrayList2.add(yVar.d(Bf.r.i0(k.E0(yVar3.f19938a.t(), yVar2.f19938a.t()), '\\', '/')));
                }
                t.e0(arrayList2, linkedHashSet);
                z2 = true;
            } catch (IOException unused) {
            }
        }
        if (z2) {
            return o.S0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // cg.m
    public final R0.e f(y path) {
        AbstractC3340k.e(path, "path");
        if (!C1342b.g(path)) {
            return null;
        }
        y yVar = f34298e;
        yVar.getClass();
        String strT = c.b(yVar, path, true).c(yVar).f19938a.t();
        for (C2527k c2527k : (List) this.f34301d.getValue()) {
            R0.e eVarF = ((m) c2527k.f34671a).f(((y) c2527k.f34672b).d(strT));
            if (eVarF != null) {
                return eVarF;
            }
        }
        return null;
    }

    @Override // cg.m
    public final cg.t g(y yVar) throws FileNotFoundException {
        if (!C1342b.g(yVar)) {
            throw new FileNotFoundException("file not found: " + yVar);
        }
        y yVar2 = f34298e;
        yVar2.getClass();
        String strT = c.b(yVar2, yVar, true).c(yVar2).f19938a.t();
        for (C2527k c2527k : (List) this.f34301d.getValue()) {
            try {
                return ((m) c2527k.f34671a).g(((y) c2527k.f34672b).d(strT));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + yVar);
    }

    @Override // cg.m
    public final F h(y file) throws IOException {
        AbstractC3340k.e(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // cg.m
    public final H i(y file) throws FileNotFoundException {
        AbstractC3340k.e(file, "file");
        if (!C1342b.g(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        y yVar = f34298e;
        yVar.getClass();
        InputStream resourceAsStream = this.f34299b.getResourceAsStream(c.b(yVar, file, false).c(yVar).f19938a.t());
        if (resourceAsStream != null) {
            return AbstractC1613b.m(resourceAsStream);
        }
        throw new FileNotFoundException("file not found: " + file);
    }
}
