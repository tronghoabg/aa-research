package l8;

import java.io.Serializable;

/* renamed from: l8.N, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3412N extends AbstractC3435q implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final transient j0 f40060d;

    public AbstractC3412N(j0 j0Var, int i5) {
        this.f40060d = j0Var;
    }

    @Override // l8.AbstractC3434p
    public final boolean b(Object obj) {
        return obj != null && super.b(obj);
    }

    @Override // l8.AbstractC3434p
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public j0 a() {
        return this.f40060d;
    }
}
