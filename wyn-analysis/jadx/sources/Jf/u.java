package Jf;

import jf.C3109i;
import jf.InterfaceC3106f;
import jf.InterfaceC3107g;
import jf.InterfaceC3108h;

/* loaded from: classes5.dex */
public final class u implements InterfaceC3106f {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f6139a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadLocal f6140b;

    /* renamed from: c, reason: collision with root package name */
    public final v f6141c;

    public u(Integer num, ThreadLocal threadLocal) {
        this.f6139a = num;
        this.f6140b = threadLocal;
        this.f6141c = new v(threadLocal);
    }

    public final void a(Object obj) {
        this.f6140b.set(obj);
    }

    public final Object b(InterfaceC3108h interfaceC3108h) {
        ThreadLocal threadLocal = this.f6140b;
        Object obj = threadLocal.get();
        threadLocal.set(this.f6139a);
        return obj;
    }

    @Override // jf.InterfaceC3108h
    public final Object fold(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3106f get(InterfaceC3107g interfaceC3107g) {
        if (this.f6141c.equals(interfaceC3107g)) {
            return this;
        }
        return null;
    }

    @Override // jf.InterfaceC3106f
    public final InterfaceC3107g getKey() {
        return this.f6141c;
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3108h minusKey(InterfaceC3107g interfaceC3107g) {
        return this.f6141c.equals(interfaceC3107g) ? C3109i.f38759a : this;
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3108h plus(InterfaceC3108h interfaceC3108h) {
        return Fe.e.O(this, interfaceC3108h);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f6139a + ", threadLocal = " + this.f6140b + ')';
    }
}
