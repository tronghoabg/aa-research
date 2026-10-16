package A;

import Ef.C0499l0;
import Ef.InterfaceC0501m0;
import ef.C2515C;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import jf.InterfaceC3103c;
import jf.InterfaceC3106f;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;

/* renamed from: A.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232z extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public Nf.a f190a;

    /* renamed from: b, reason: collision with root package name */
    public Object f191b;

    /* renamed from: c, reason: collision with root package name */
    public A f192c;

    /* renamed from: d, reason: collision with root package name */
    public int f193d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f194e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ A f195f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC3471j f196g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0232z(A a5, tf.l lVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f195f = a5;
        this.f196g = (AbstractC3471j) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [lf.j, tf.l] */
    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C0232z c0232z = new C0232z(this.f195f, this.f196g, interfaceC3103c);
        c0232z.f194e = obj;
        return c0232z;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0232z) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Nf.a, int] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [tf.l] */
    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        A a5;
        Nf.a aVar;
        ?? r32;
        C0231y c0231y;
        Nf.a aVar2;
        A a10;
        Throwable th;
        C0231y c0231y2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        kf.a aVar3 = kf.a.f39711a;
        ?? r12 = this.f193d;
        try {
            try {
                if (r12 == 0) {
                    Fe.e.U(obj);
                    InterfaceC3106f interfaceC3106f = ((Ef.E) this.f194e).getCoroutineContext().get(C0499l0.f3748a);
                    AbstractC3340k.b(interfaceC3106f);
                    C0231y c0231y3 = new C0231y((InterfaceC0501m0) interfaceC3106f);
                    while (true) {
                        a5 = this.f195f;
                        AtomicReference atomicReference3 = a5.f7a;
                        C0231y c0231y4 = (C0231y) atomicReference3.get();
                        if (c0231y4 != null && AbstractC0213f.a(1, 1) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(c0231y4, c0231y3)) {
                            if (atomicReference3.get() != c0231y4) {
                                break;
                            }
                        }
                        if (c0231y4 != null) {
                            c0231y4.f189a.cancel(null);
                        }
                        this.f194e = c0231y3;
                        aVar = a5.f8b;
                        this.f190a = aVar;
                        AbstractC3471j abstractC3471j = this.f196g;
                        this.f191b = abstractC3471j;
                        this.f192c = a5;
                        this.f193d = 1;
                        if (aVar.b(this) != aVar3) {
                            r32 = abstractC3471j;
                            c0231y = c0231y3;
                        }
                    }
                    return aVar3;
                }
                if (r12 != 1) {
                    if (r12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a10 = (A) this.f191b;
                    aVar2 = this.f190a;
                    c0231y2 = (C0231y) this.f194e;
                    try {
                        Fe.e.U(obj);
                        atomicReference2 = a10.f7a;
                        while (!atomicReference2.compareAndSet(c0231y2, null) && atomicReference2.get() == c0231y2) {
                        }
                        aVar2.a(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = a10.f7a;
                        while (!atomicReference.compareAndSet(c0231y2, null)) {
                        }
                        throw th;
                    }
                }
                A a11 = this.f192c;
                tf.l lVar = (tf.l) this.f191b;
                aVar = this.f190a;
                c0231y = (C0231y) this.f194e;
                Fe.e.U(obj);
                a5 = a11;
                r32 = lVar;
                this.f194e = c0231y;
                this.f190a = aVar2;
                this.f191b = a5;
                this.f192c = null;
                this.f193d = 2;
                Object objInvoke = r32.invoke(this);
                if (objInvoke != aVar3) {
                    a10 = a5;
                    obj = objInvoke;
                    c0231y2 = c0231y;
                    atomicReference2 = a10.f7a;
                    while (!atomicReference2.compareAndSet(c0231y2, null)) {
                    }
                    aVar2.a(null);
                    return obj;
                }
                return aVar3;
            } catch (Throwable th3) {
                a10 = a5;
                th = th3;
                c0231y2 = c0231y;
                atomicReference = a10.f7a;
                while (!atomicReference.compareAndSet(c0231y2, null) && atomicReference.get() == c0231y2) {
                }
                throw th;
            }
            aVar2 = aVar;
        } catch (Throwable th4) {
            r12.a(null);
            throw th4;
        }
    }
}
