package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class edx {
    public final ArrayList a = new ArrayList();
    public final eeb b;
    public int c;
    public boolean d;

    public edx(eeb eebVar, List list) {
        e(list, false);
        e(list, true);
        if (!eebVar.b.contains(this)) {
            eebVar.b.add(this);
            dve dveVar = eebVar.c;
            dve dveVar2 = eebVar.d;
            b();
            int i = eebVar.e;
            c();
        }
        this.b = eebVar;
    }

    private final void e(List list, boolean z) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            edw edwVar = (edw) list.get(i);
            if (edwVar.a() == z) {
                Object obj = edwVar.b;
                if (obj != null) {
                    throw new IllegalStateException(edwVar + " (" + i2 + "/" + size + ") is already controlled by " + obj + " but is still added to " + this);
                }
                edwVar.b = this;
                this.a.add(edwVar);
            }
            i = i2;
        }
    }

    public final int a() {
        return this.a.size();
    }

    public final void b() {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        throw null;
    }

    public final void c() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((edw) arrayList.get(size)).b();
            }
        }
    }

    public final void d() {
    }
}
