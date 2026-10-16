package c0;

import Va.M6;
import a2.v;

/* renamed from: c0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1543h implements s0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19510a;

    public /* synthetic */ C1543h(int i5) {
        this.f19510a = i5;
    }

    @Override // Z.k
    public final /* synthetic */ Z.k g(Z.k kVar) {
        int i5 = this.f19510a;
        return M6.f(this, kVar);
    }

    @Override // s0.b
    public final v getKey() {
        switch (this.f19510a) {
            case 0:
                return m.f19525a;
            case 1:
                return AbstractC1538c.f19492a;
            default:
                return p.f19531a;
        }
    }

    @Override // s0.b
    public final /* bridge */ /* synthetic */ Object getValue() {
        switch (this.f19510a) {
        }
        return null;
    }

    @Override // Z.k
    public final Object h(Object obj, tf.p pVar) {
        switch (this.f19510a) {
        }
        return pVar.invoke(this, obj);
    }

    @Override // Z.k
    public final Object p(Object obj, tf.p pVar) {
        switch (this.f19510a) {
        }
        return pVar.invoke(obj, this);
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        switch (this.f19510a) {
        }
        return M6.a(this, Z.h.f16921i);
    }
}
