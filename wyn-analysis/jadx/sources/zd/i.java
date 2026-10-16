package zd;

import jf.InterfaceC3106f;
import jf.InterfaceC3107g;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import tf.p;

/* loaded from: classes5.dex */
public final class i implements InterfaceC3106f {

    /* renamed from: b, reason: collision with root package name */
    public static final ab.b f48490b = new ab.b();

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3108h f48491a;

    public i(InterfaceC3108h callContext) {
        AbstractC3340k.e(callContext, "callContext");
        this.f48491a = callContext;
    }

    @Override // jf.InterfaceC3108h
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3106f get(InterfaceC3107g interfaceC3107g) {
        return Fe.e.C(this, interfaceC3107g);
    }

    @Override // jf.InterfaceC3106f
    public final InterfaceC3107g getKey() {
        return f48490b;
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3108h minusKey(InterfaceC3107g interfaceC3107g) {
        return Fe.e.N(this, interfaceC3107g);
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3108h plus(InterfaceC3108h interfaceC3108h) {
        return Fe.e.O(this, interfaceC3108h);
    }
}
