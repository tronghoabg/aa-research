package defpackage;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class yar extends ybm implements yig {
    private static final long serialVersionUID = 6588350623831699109L;

    public yar(Map map) {
        super(map);
    }

    @Override // defpackage.ybm
    public /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    @Override // defpackage.ybm
    public final /* synthetic */ Collection b() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.ybm
    public final Collection d(Collection collection) {
        return DesugarCollections.unmodifiableList((List) collection);
    }

    @Override // defpackage.ybm
    public final Collection e(Object obj, Collection collection) {
        return n(obj, (List) collection, null);
    }

    @Override // defpackage.ybm, defpackage.yks
    /* renamed from: f */
    public final List c(Object obj) {
        return (List) super.c(obj);
    }

    @Override // defpackage.yig
    public final List g(Object obj) {
        return (List) super.k(obj);
    }
}
