package defpackage;

import java.util.Collection;
import java.util.Set;

/* loaded from: classes3.dex */
final class ydf extends yen {
    final /* synthetic */ Set a;

    public ydf(Set set) {
        this.a = set;
    }

    @Override // defpackage.yen, defpackage.yec
    /* renamed from: a */
    protected final /* synthetic */ Collection d() {
        return this.a;
    }

    @Override // defpackage.yen
    /* renamed from: c */
    protected final Set a() {
        return this.a;
    }

    @Override // defpackage.yec, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return obj != null && ysi.m(this.a, obj);
    }

    @Override // defpackage.yec, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return ysi.l(this, collection);
    }

    @Override // defpackage.yel
    protected final /* synthetic */ Object d() {
        return this.a;
    }

    @Override // defpackage.yec, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        Set set = this.a;
        set.getClass();
        try {
            return set.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // defpackage.yec, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        return yrm.w(this, collection);
    }
}
