package defpackage;

import j$.util.Map;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final class aemq extends aeml implements Serializable, Map, aemo {
    private static final long serialVersionUID = -7046029254386353129L;
    protected final aemo c;
    protected transient aeum d;
    protected transient aepx e;
    protected transient aepb f;

    public aemq(aemo aemoVar) {
        super(aemoVar);
        this.c = aemoVar;
    }

    @Override // defpackage.aekw, defpackage.aeee
    public final /* synthetic */ boolean containsKey(Object obj) {
        return adqq.aZ(this, obj);
    }

    @Override // java.util.Map
    @Deprecated
    public final boolean containsValue(Object obj) {
        return adqq.aU(this.c, obj);
    }

    @Override // defpackage.aeml, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return this.c.equals(obj);
    }

    @Override // defpackage.aemo
    /* renamed from: f */
    public final aepb values() {
        throw null;
    }

    @Override // j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        adqq.aT(this.c, biConsumer);
    }

    @Override // defpackage.aemo
    /* renamed from: g */
    public final aepx keySet() {
        throw null;
    }

    @Override // defpackage.aeml, defpackage.aekw, defpackage.aeee
    @Deprecated
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return super.d(obj);
    }

    @Override // j$.util.Map
    @Deprecated
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return adqq.aI(this.c, obj, (Long) obj2);
    }

    @Override // defpackage.aemo
    @Deprecated
    public final aeum h() {
        throw null;
    }

    @Override // defpackage.aeml, java.util.Map
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // j$.util.Map
    @Deprecated
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Long compute(Long l, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // j$.util.Map
    @Deprecated
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final Long computeIfAbsent(Long l, Function function) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Map
    @Deprecated
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final Long computeIfPresent(Long l, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        if (this.e == null) {
            aepx aepxVarKeySet = this.c.keySet();
            aepy aepyVar = aeqa.a;
            this.e = new aepz(aepxVarKeySet);
        }
        return this.e;
    }

    @Override // defpackage.aemo
    @Deprecated
    public final Long l(Object obj, Long l) {
        throw null;
    }

    @Override // j$.util.Map
    @Deprecated
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final Long merge(Long l, Long l2, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Map
    @Deprecated
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final Long putIfAbsent(Long l, Long l2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return super.n((Long) obj, (Long) obj2);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends Long, ? extends Long> map) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Map
    @Deprecated
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final Long replace(Long l, Long l2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aemo
    public final boolean r(long j) {
        throw null;
    }

    @Override // java.util.Map
    @Deprecated
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Map
    @Deprecated
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final boolean replace(Long l, Long l2, Long l3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final aeum entrySet() {
        if (this.d == null) {
            aemy aemyVarU = ((aend) this.c).u();
            aeun aeunVar = aeuq.a;
            this.d = new aeup(aemyVarU);
        }
        return this.d;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        if (this.f == null) {
            this.f = new aepd(this.c.values());
        }
        return this.f;
    }

    @Override // j$.util.Map
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }
}
