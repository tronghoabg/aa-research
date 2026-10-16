package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class dpl extends dpg implements Iterable {
    @Override // defpackage.dpg, defpackage.dph
    /* renamed from: C, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final dpl g() {
        return (dpl) super.clone();
    }

    @Override // java.lang.Iterable
    public final Iterator<dpi> iterator() {
        return new dpk(this);
    }
}
