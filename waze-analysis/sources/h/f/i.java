package h.f;

import h.g.b.x;
import java.io.File;
import java.util.ArrayDeque;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i extends h.a.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f48083a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque f48084b;

    public i(k kVar) {
        this.f48083a = kVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f48084b = arrayDeque;
        if (kVar.f48086a.isDirectory()) {
            arrayDeque.push(d(kVar.f48086a));
        } else if (kVar.f48086a.isFile()) {
            arrayDeque.push(new g(kVar.f48086a));
        } else {
            b();
        }
    }

    private final e d(File file) {
        l lVar = this.f48083a.f48087b;
        l lVar2 = l.f48089a;
        int iOrdinal = lVar.ordinal();
        if (iOrdinal == 0) {
            return new h(this, file);
        }
        if (iOrdinal == 1) {
            return new f(this, file);
        }
        throw new h.i();
    }

    @Override // h.a.b
    protected final void a() {
        Object obj;
        File fileA;
        while (true) {
            ArrayDeque arrayDeque = this.f48084b;
            j jVar = (j) arrayDeque.peek();
            if (jVar == null) {
                obj = null;
                break;
            }
            fileA = jVar.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else if (x.n(fileA, jVar.b()) || !fileA.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                break;
            } else {
                arrayDeque.push(d(fileA));
            }
        }
        obj = fileA;
        if (obj != null) {
            c(obj);
        } else {
            b();
        }
    }
}
