package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1402t implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1404v f18269a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC1404v f18270b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18271c = false;

    public AbstractC1402t(AbstractC1404v abstractC1404v) {
        this.f18269a = abstractC1404v;
        this.f18270b = (AbstractC1404v) abstractC1404v.d(4);
    }

    public static void d(AbstractC1404v abstractC1404v, AbstractC1404v abstractC1404v2) {
        Y y10 = Y.f18175c;
        y10.getClass();
        y10.a(abstractC1404v.getClass()).f(abstractC1404v, abstractC1404v2);
    }

    public final AbstractC1404v a() {
        AbstractC1404v abstractC1404vB = b();
        if (abstractC1404vB.g()) {
            return abstractC1404vB;
        }
        throw new E5.Q();
    }

    public final AbstractC1404v b() {
        if (this.f18271c) {
            return this.f18270b;
        }
        AbstractC1404v abstractC1404v = this.f18270b;
        abstractC1404v.getClass();
        Y y10 = Y.f18175c;
        y10.getClass();
        y10.a(abstractC1404v.getClass()).a(abstractC1404v);
        this.f18271c = true;
        return this.f18270b;
    }

    public final void c() {
        if (this.f18271c) {
            AbstractC1404v abstractC1404v = (AbstractC1404v) this.f18270b.d(4);
            d(abstractC1404v, this.f18270b);
            this.f18270b = abstractC1404v;
            this.f18271c = false;
        }
    }

    public final Object clone() {
        AbstractC1402t abstractC1402t = (AbstractC1402t) this.f18269a.d(5);
        AbstractC1404v abstractC1404vB = b();
        abstractC1402t.c();
        d(abstractC1402t.f18270b, abstractC1404vB);
        return abstractC1402t;
    }
}
