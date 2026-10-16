package j$.util.stream;

import j$.util.Collection;
import j$.util.List;
import java.util.ArrayList;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class h3 extends f3 {
    public ArrayList d;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.d.add(obj);
    }

    @Override // j$.util.stream.o2, j$.util.stream.z2
    public final void end() {
        List.EL.sort(this.d, this.b);
        z2 z2Var = (z2) this.a;
        z2Var.p(this.d.size());
        boolean z = this.c;
        ArrayList arrayList = this.d;
        if (z) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (z2Var.s()) {
                    break;
                } else {
                    z2Var.accept((z2) obj);
                }
            }
        } else {
            Collection.EL.a(arrayList, new j$.desugar.sun.nio.fs.h((byte) 12, z2Var));
        }
        z2Var.end();
        this.d = null;
    }

    @Override // j$.util.stream.o2, j$.util.stream.z2
    public final void p(long j) {
        if (j < 2147483639) {
            this.d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
        } else {
            j$.time.g.a("Stream size exceeds max array size");
        }
    }
}
