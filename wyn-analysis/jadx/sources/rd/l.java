package Rd;

import ef.C2529m;
import ef.C2530n;
import java.util.List;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.K;
import lf.AbstractC3464c;
import tf.q;

/* loaded from: classes5.dex */
public final class l extends e {

    /* renamed from: b, reason: collision with root package name */
    public final List f10608b;

    /* renamed from: c, reason: collision with root package name */
    public final k f10609c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10610d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3103c[] f10611e;

    /* renamed from: f, reason: collision with root package name */
    public int f10612f;

    /* renamed from: g, reason: collision with root package name */
    public int f10613g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Object initial, Object context, List blocks) {
        super(context);
        AbstractC3340k.e(initial, "initial");
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(blocks, "blocks");
        this.f10608b = blocks;
        this.f10609c = new k(this);
        this.f10610d = initial;
        this.f10611e = new InterfaceC3103c[blocks.size()];
        this.f10612f = -1;
    }

    @Override // Rd.e
    public final Object a(Object obj, AbstractC3464c abstractC3464c) {
        this.f10613g = 0;
        if (this.f10608b.size() == 0) {
            return obj;
        }
        AbstractC3340k.e(obj, "<set-?>");
        this.f10610d = obj;
        if (this.f10612f < 0) {
            return d(abstractC3464c);
        }
        throw new IllegalStateException("Already started");
    }

    @Override // Rd.e
    public final Object c() {
        return this.f10610d;
    }

    @Override // Rd.e
    public final Object d(InterfaceC3103c frame) {
        Object obj;
        if (this.f10613g == this.f10608b.size()) {
            obj = this.f10610d;
        } else {
            InterfaceC3103c interfaceC3103cA = A6.h.A(frame);
            int i5 = this.f10612f + 1;
            this.f10612f = i5;
            InterfaceC3103c[] interfaceC3103cArr = this.f10611e;
            interfaceC3103cArr[i5] = interfaceC3103cA;
            if (f(true)) {
                int i10 = this.f10612f;
                if (i10 < 0) {
                    throw new IllegalStateException("No more continuations to resume");
                }
                this.f10612f = i10 - 1;
                interfaceC3103cArr[i10] = null;
                obj = this.f10610d;
            } else {
                obj = kf.a.f39711a;
            }
        }
        if (obj == kf.a.f39711a) {
            AbstractC3340k.e(frame, "frame");
        }
        return obj;
    }

    @Override // Rd.e
    public final Object e(Object obj, InterfaceC3103c interfaceC3103c) {
        AbstractC3340k.e(obj, "<set-?>");
        this.f10610d = obj;
        return d(interfaceC3103c);
    }

    public final boolean f(boolean z2) {
        q interceptor;
        Object subject;
        k continuation;
        do {
            int i5 = this.f10613g;
            List list = this.f10608b;
            if (i5 == list.size()) {
                if (z2) {
                    return true;
                }
                g(this.f10610d);
                return false;
            }
            this.f10613g = i5 + 1;
            interceptor = (q) list.get(i5);
            try {
                subject = this.f10610d;
                continuation = this.f10609c;
                AbstractC3340k.e(interceptor, "interceptor");
                AbstractC3340k.e(subject, "subject");
                AbstractC3340k.e(continuation, "continuation");
                K.e(3, interceptor);
            } catch (Throwable th) {
                g(Fe.e.z(th));
                return false;
            }
        } while (interceptor.invoke(this, subject, continuation) != kf.a.f39711a);
        return false;
    }

    public final void g(Object obj) {
        int i5 = this.f10612f;
        if (i5 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        InterfaceC3103c[] interfaceC3103cArr = this.f10611e;
        InterfaceC3103c interfaceC3103c = interfaceC3103cArr[i5];
        AbstractC3340k.b(interfaceC3103c);
        int i10 = this.f10612f;
        this.f10612f = i10 - 1;
        interfaceC3103cArr[i10] = null;
        if (!(obj instanceof C2529m)) {
            interfaceC3103c.resumeWith(obj);
            return;
        }
        Throwable thA = C2530n.a(obj);
        AbstractC3340k.b(thA);
        try {
            thA.getCause();
        } catch (Throwable unused) {
        }
        interfaceC3103c.resumeWith(Fe.e.z(thA));
    }

    @Override // Ef.E
    public final InterfaceC3108h getCoroutineContext() {
        return this.f10609c.getContext();
    }
}
