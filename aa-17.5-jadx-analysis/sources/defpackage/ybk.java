package defpackage;

import java.util.Collection;
import java.util.Set;

/* loaded from: classes.dex */
final class ybk extends ybg implements Set {
    final /* synthetic */ ybm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybk(ybm ybmVar, Object obj, Set set) {
        super(ybmVar, obj, set, null);
        this.f = ybmVar;
    }

    @Override // defpackage.ybg, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zW = yrm.w((Set) this.b, collection);
        if (zW) {
            int size2 = this.b.size();
            this.f.b += size2 - size;
            c();
        }
        return zW;
    }
}
