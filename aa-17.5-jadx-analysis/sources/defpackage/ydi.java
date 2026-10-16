package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class ydi extends ylf {
    final /* synthetic */ ydj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydi(ydj ydjVar) {
        super(ydjVar);
        this.a = ydjVar;
    }

    private final List b() {
        ArrayList arrayListT = yrm.T(size());
        yrm.ad(arrayListT, iterator());
        return arrayListT;
    }

    @Override // defpackage.ylf
    public final /* synthetic */ ylc a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return b().toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) b().toArray(tArr);
    }
}
