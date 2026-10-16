package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes3.dex */
public final class uvz implements uvo {
    private final Comparator b;
    public final ArrayList a = new ArrayList();
    private boolean c = false;

    public uvz(Comparator comparator) {
        this.b = comparator;
    }

    @Override // defpackage.uvo
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.uvo
    @ResultIgnorabilityUnspecified
    public final List b(uud uudVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            uth uthVar = (uth) arrayList2.get(i);
            if (uthVar.B()) {
                uthVar.y(uudVar);
            } else {
                arrayList.add(uthVar);
            }
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList2.remove((uth) arrayList.get(i2));
        }
        return arrayList;
    }

    @Override // defpackage.uvo
    public final void c(uth uthVar) {
        this.a.add(uthVar);
        i();
    }

    public final void d(usy usyVar) {
        ArrayList arrayList;
        int i = 0;
        if (this.b != null) {
            synchronized (this) {
                if (this.c) {
                    int i2 = 0;
                    while (true) {
                        arrayList = this.a;
                        if (i2 >= arrayList.size()) {
                            break;
                        }
                        ((uth) arrayList.get(i2)).h();
                        i2++;
                    }
                    Collections.sort(arrayList, this.b);
                    this.c = false;
                }
            }
        }
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i3 = 0;
        while (i < size) {
            uth uthVar = i == 0 ? null : (uth) arrayList2.get(i - 1);
            int i4 = i + 1;
            uth uthVar2 = (uth) arrayList2.get(i);
            uth uthVar3 = i != arrayList2.size() + (-1) ? (uth) arrayList2.get(i4) : null;
            if (uthVar2.o()) {
                uthVar2.H(uthVar, uthVar3, usyVar);
                i3++;
            }
            i = i4;
        }
        String[] strArr = vaq.a;
        fdi.a("drawnEntities", i3);
    }

    @Override // defpackage.uvo
    public final void e(uth uthVar) {
        i();
    }

    @Override // defpackage.uvo
    public final void f() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((uth) arrayList.get(i)).e(true);
        }
    }

    @Override // defpackage.uvo
    public final void g(long j) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((uth) arrayList.get(i)).b(j);
        }
    }

    @Override // defpackage.uvo
    @ResultIgnorabilityUnspecified
    public final boolean h(uth uthVar) {
        return this.a.remove(uthVar);
    }

    public final void i() {
        if (this.b != null) {
            synchronized (this) {
                this.c = true;
            }
        }
    }

    public final String toString() {
        return "SortedRenderBin";
    }
}
