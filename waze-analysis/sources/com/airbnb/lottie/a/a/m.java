package com.airbnb.lottie.a.a;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class m implements n, k {

    /* renamed from: a, reason: collision with root package name */
    private final Path f1810a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Path f1811b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f1812c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final List f1813d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.d.b.h f1814e;

    public m(com.airbnb.lottie.d.b.h hVar) {
        this.f1814e = hVar;
    }

    private final void a(Path.Op op) {
        Path path = this.f1811b;
        path.reset();
        Path path2 = this.f1810a;
        path2.reset();
        List list = this.f1813d;
        int size = list.size();
        while (true) {
            size--;
            if (size <= 0) {
                break;
            }
            n nVar = (n) list.get(size);
            if (nVar instanceof e) {
                e eVar = (e) nVar;
                List listK = eVar.k();
                int size2 = listK.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        Path pathI = ((n) listK.get(size2)).i();
                        pathI.transform(eVar.h());
                        path.addPath(pathI);
                    }
                }
            } else {
                path.addPath(nVar.i());
            }
        }
        n nVar2 = (n) list.get(0);
        if (nVar2 instanceof e) {
            e eVar2 = (e) nVar2;
            List listK2 = eVar2.k();
            for (int i2 = 0; i2 < listK2.size(); i2++) {
                Path pathI2 = ((n) listK2.get(i2)).i();
                pathI2.transform(eVar2.h());
                path2.addPath(pathI2);
            }
        } else {
            path2.set(nVar2.i());
        }
        this.f1812c.op(path2, path, op);
    }

    @Override // com.airbnb.lottie.a.a.d
    public final void f(List list, List list2) {
        int i2 = 0;
        while (true) {
            List list3 = this.f1813d;
            if (i2 >= list3.size()) {
                return;
            }
            ((n) list3.get(i2)).f(list, list2);
            i2++;
        }
    }

    @Override // com.airbnb.lottie.a.a.d
    public final String g() {
        throw null;
    }

    @Override // com.airbnb.lottie.a.a.k
    public final void h(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            d dVar = (d) listIterator.previous();
            if (dVar instanceof n) {
                this.f1813d.add((n) dVar);
                listIterator.remove();
            }
        }
    }

    @Override // com.airbnb.lottie.a.a.n
    public final Path i() {
        Path path = this.f1812c;
        path.reset();
        com.airbnb.lottie.d.b.h hVar = this.f1814e;
        if (!hVar.b()) {
            int iC = hVar.c();
            int i2 = iC - 1;
            if (iC == 0) {
                throw null;
            }
            if (i2 == 0) {
                int i3 = 0;
                while (true) {
                    List list = this.f1813d;
                    if (i3 >= list.size()) {
                        break;
                    }
                    path.addPath(((n) list.get(i3)).i());
                    i3++;
                }
            } else {
                if (i2 == 1) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (i2 == 2) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (i2 == 3) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (i2 == 4) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
