package com.moloco.sdk.internal.utils;

import Fe.e;
import jf.InterfaceC3106f;
import jf.InterfaceC3107g;
import jf.InterfaceC3108h;
import tf.p;

/* loaded from: classes4.dex */
public final class b implements InterfaceC3106f {

    /* renamed from: a, reason: collision with root package name */
    public final c f29775a;

    public b(c cVar) {
        this.f29775a = cVar;
    }

    @Override // jf.InterfaceC3108h
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3106f get(InterfaceC3107g interfaceC3107g) {
        return e.C(this, interfaceC3107g);
    }

    @Override // jf.InterfaceC3106f
    public final InterfaceC3107g getKey() {
        return this.f29775a;
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3108h minusKey(InterfaceC3107g interfaceC3107g) {
        return e.N(this, interfaceC3107g);
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3108h plus(InterfaceC3108h interfaceC3108h) {
        return e.O(this, interfaceC3108h);
    }
}
