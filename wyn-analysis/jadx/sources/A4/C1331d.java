package a4;

import cg.F;
import cg.H;
import cg.m;
import cg.t;
import cg.u;
import cg.y;
import ff.l;
import ff.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: a4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1331d extends m {

    /* renamed from: b, reason: collision with root package name */
    public final u f17354b;

    public C1331d(u delegate) {
        AbstractC3340k.e(delegate, "delegate");
        this.f17354b = delegate;
    }

    @Override // cg.m
    public final void a(y path) throws IOException {
        AbstractC3340k.e(path, "path");
        this.f17354b.a(path);
    }

    @Override // cg.m
    public final List d(y dir) throws IOException {
        AbstractC3340k.e(dir, "dir");
        List<y> listD = this.f17354b.d(dir);
        ArrayList arrayList = new ArrayList();
        for (y path : listD) {
            AbstractC3340k.e(path, "path");
            arrayList.add(path);
        }
        s.c0(arrayList);
        return arrayList;
    }

    @Override // cg.m
    public final R0.e f(y path) {
        AbstractC3340k.e(path, "path");
        R0.e eVarF = this.f17354b.f(path);
        if (eVarF == null) {
            return null;
        }
        y yVar = (y) eVarF.f10052d;
        if (yVar == null) {
            return eVarF;
        }
        Map extras = (Map) eVarF.f10057i;
        AbstractC3340k.e(extras, "extras");
        return new R0.e(eVarF.f10050b, eVarF.f10051c, yVar, (Long) eVarF.f10053e, (Long) eVarF.f10054f, (Long) eVarF.f10055g, (Long) eVarF.f10056h, extras);
    }

    @Override // cg.m
    public final t g(y yVar) {
        return this.f17354b.g(yVar);
    }

    @Override // cg.m
    public final F h(y yVar) throws IOException {
        R0.e eVarF;
        y yVarB = yVar.b();
        if (yVarB != null) {
            l lVar = new l();
            while (yVarB != null && !c(yVarB)) {
                lVar.addFirst(yVarB);
                yVarB = yVarB.b();
            }
            Iterator<E> it = lVar.iterator();
            while (it.hasNext()) {
                y dir = (y) it.next();
                AbstractC3340k.e(dir, "dir");
                u uVar = this.f17354b;
                uVar.getClass();
                if (!dir.e().mkdir() && ((eVarF = uVar.f(dir)) == null || !eVarF.f10051c)) {
                    throw new IOException("failed to create directory: " + dir);
                }
            }
        }
        return this.f17354b.h(yVar);
    }

    @Override // cg.m
    public final H i(y file) {
        AbstractC3340k.e(file, "file");
        return this.f17354b.i(file);
    }

    public final void j(y source, y target) throws IOException {
        AbstractC3340k.e(source, "source");
        AbstractC3340k.e(target, "target");
        this.f17354b.j(source, target);
    }

    public final String toString() {
        return kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(C1331d.class).getSimpleName() + '(' + this.f17354b + ')';
    }
}
