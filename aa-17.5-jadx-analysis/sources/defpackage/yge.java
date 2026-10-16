package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
final class yge extends yfq {
    final /* synthetic */ yfq a;

    public yge(yfq yfqVar) {
        this.a = yfqVar;
    }

    @Override // defpackage.yfg
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return ((Map.Entry) this.a.get(i)).getValue();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.yfq, defpackage.yfg
    public Object writeReplace() {
        return super.writeReplace();
    }
}
