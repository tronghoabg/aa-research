package defpackage;

import j$.util.Objects;
import java.util.List;

/* loaded from: classes3.dex */
public final class xaj extends gd {
    private final List a;
    private final List b;

    public xaj(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.gd
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.gd
    public final int b() {
        return this.a.size();
    }

    @Override // defpackage.gd
    public final boolean c(int i, int i2) {
        List list = this.a;
        Object obj = list.get(i);
        boolean z = obj instanceof mqz;
        List list2 = this.b;
        Object obj2 = list2.get(i2);
        if (z) {
            mqz mqzVar = (mqz) obj;
            if (obj2 instanceof mqz) {
                return Objects.equals(mqzVar.i(), ((mqz) obj2).i());
            }
        }
        return list.get(i).equals(list2.get(i2));
    }

    @Override // defpackage.gd
    public final boolean d(int i, int i2) {
        return this.a.get(i).equals(this.b.get(i2));
    }
}
