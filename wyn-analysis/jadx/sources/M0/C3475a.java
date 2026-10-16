package m0;

import Va.M6;
import Z.h;
import Z.k;
import a2.v;
import kotlin.jvm.internal.AbstractC3340k;
import q0.C3852b;
import q0.C3854d;
import s0.InterfaceC3987a;
import s0.b;
import s0.c;
import tf.p;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3475a implements InterfaceC3987a, b {

    /* renamed from: a, reason: collision with root package name */
    public final C3852b f40299a;

    /* renamed from: b, reason: collision with root package name */
    public final v f40300b;

    /* renamed from: c, reason: collision with root package name */
    public C3475a f40301c;

    public C3475a(C3852b c3852b, v key) {
        AbstractC3340k.e(key, "key");
        this.f40299a = c3852b;
        this.f40300b = key;
    }

    public final boolean a(C3854d c3854d) {
        if (((Boolean) this.f40299a.invoke(c3854d)).booleanValue()) {
            return true;
        }
        C3475a c3475a = this.f40301c;
        if (c3475a != null) {
            return c3475a.a(c3854d);
        }
        return false;
    }

    public final boolean b() {
        C3475a c3475a = this.f40301c;
        return c3475a != null && c3475a.b();
    }

    @Override // Z.k
    public final /* synthetic */ k g(k kVar) {
        return M6.f(this, kVar);
    }

    @Override // s0.b
    public final v getKey() {
        return this.f40300b;
    }

    @Override // Z.k
    public final Object h(Object obj, p pVar) {
        return pVar.invoke(this, obj);
    }

    @Override // s0.InterfaceC3987a
    public final void o(c scope) {
        AbstractC3340k.e(scope, "scope");
        this.f40301c = (C3475a) scope.a(this.f40300b);
    }

    @Override // Z.k
    public final Object p(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, h.f16921i);
    }

    @Override // s0.b
    public final Object getValue() {
        return this;
    }
}
