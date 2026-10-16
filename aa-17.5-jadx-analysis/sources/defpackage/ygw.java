package defpackage;

import java.util.AbstractMap;

/* loaded from: classes3.dex */
final class ygw extends yfq {
    final /* synthetic */ ygx a;

    public ygw(ygx ygxVar) {
        this.a = ygxVar;
    }

    @Override // defpackage.yfg
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        ygz ygzVar = this.a.a;
        return new AbstractMap.SimpleImmutableEntry(ygzVar.c.d.get(i), ygzVar.d.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.a.size();
    }

    @Override // defpackage.yfq, defpackage.yfg
    public Object writeReplace() {
        return super.writeReplace();
    }
}
