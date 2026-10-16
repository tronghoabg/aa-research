package j$.util.stream;

import j$.util.Collection;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class q6 extends i6 {

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f50587d;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void u(Object obj) {
        this.f50587d.add(obj);
    }

    @Override // j$.util.stream.p5, j$.util.stream.t5
    public final void end() {
        List.EL.sort(this.f50587d, this.f50453b);
        long size = this.f50587d.size();
        t5 t5Var = this.f50576a;
        t5Var.l(size);
        boolean z = this.f50454c;
        ArrayList arrayList = this.f50587d;
        if (z) {
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj = arrayList.get(i2);
                i2++;
                if (t5Var.o()) {
                    break;
                } else {
                    t5Var.u((t5) obj);
                }
            }
        } else {
            Objects.requireNonNull(t5Var);
            Collection.EL.a(arrayList, new j$.desugar.sun.nio.fs.g(8, t5Var));
        }
        t5Var.end();
        this.f50587d = null;
    }

    @Override // j$.util.stream.p5, j$.util.stream.t5
    public final void l(long j2) {
        if (j2 < 2147483639) {
            this.f50587d = j2 >= 0 ? new ArrayList((int) j2) : new ArrayList();
        } else {
            j$.time.f.b("Stream size exceeds max array size");
        }
    }
}
