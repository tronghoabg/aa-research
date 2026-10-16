package l8;

import java.io.Serializable;

/* renamed from: l8.G, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3405G extends AbstractC3432n implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f40048a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f40049b;

    public C3405G(Object obj, Object obj2) {
        this.f40048a = obj;
        this.f40049b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f40048a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f40049b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
