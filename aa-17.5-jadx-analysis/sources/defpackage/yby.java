package defpackage;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class yby extends ybm implements ymf {
    private static final long serialVersionUID = 7431625294878419160L;

    public yby(Map map) {
        super(map);
    }

    @Override // defpackage.ymf
    public final Set E(Object obj) {
        return (Set) super.k(obj);
    }

    @Override // defpackage.ybm
    public /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    @Override // defpackage.ybm
    public final /* synthetic */ Collection b() {
        return Collections.EMPTY_SET;
    }

    @Override // defpackage.ybm
    public Collection d(Collection collection) {
        return DesugarCollections.unmodifiableSet((Set) collection);
    }

    @Override // defpackage.ybm
    public Collection e(Object obj, Collection collection) {
        return new ybk(this, obj, (Set) collection);
    }

    @Override // defpackage.ybu, defpackage.yks
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Set u() {
        return (Set) super.u();
    }

    @Override // defpackage.ybm, defpackage.yks
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Set c(Object obj) {
        return (Set) super.c(obj);
    }
}
