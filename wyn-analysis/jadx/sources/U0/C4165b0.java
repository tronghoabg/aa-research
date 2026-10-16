package u0;

import N.C0718d;
import jf.InterfaceC3106f;
import jf.InterfaceC3107g;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: u0.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4165b0 implements InterfaceC3106f {

    /* renamed from: a, reason: collision with root package name */
    public final N.Y f46199a = C0718d.G(Float.valueOf(1.0f), N.P.f7730f);

    @Override // jf.InterfaceC3108h
    public final Object fold(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3106f get(InterfaceC3107g key) {
        AbstractC3340k.e(key, "key");
        return Fe.e.C(this, key);
    }

    @Override // jf.InterfaceC3106f
    public final InterfaceC3107g getKey() {
        return Z.a.f16912n;
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3108h minusKey(InterfaceC3107g key) {
        AbstractC3340k.e(key, "key");
        return Fe.e.N(this, key);
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3108h plus(InterfaceC3108h context) {
        AbstractC3340k.e(context, "context");
        return Fe.c.B(this, context);
    }
}
