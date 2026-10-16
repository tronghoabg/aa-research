package k3;

import java.util.concurrent.atomic.AtomicInteger;
import jf.InterfaceC3105e;
import jf.InterfaceC3106f;
import jf.InterfaceC3107g;
import jf.InterfaceC3108h;

/* renamed from: k3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3187s implements InterfaceC3106f {

    /* renamed from: c, reason: collision with root package name */
    public static final ab.b f39254c = new ab.b();

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3105e f39255a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f39256b = new AtomicInteger(0);

    public C3187s(InterfaceC3105e interfaceC3105e) {
        this.f39255a = interfaceC3105e;
    }

    @Override // jf.InterfaceC3108h
    public final Object fold(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3106f get(InterfaceC3107g interfaceC3107g) {
        return Fe.e.C(this, interfaceC3107g);
    }

    @Override // jf.InterfaceC3106f
    public final InterfaceC3107g getKey() {
        return f39254c;
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
