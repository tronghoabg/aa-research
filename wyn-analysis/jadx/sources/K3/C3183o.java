package k3;

import Ef.E;
import com.moloco.sdk.acm.db.MetricsDb_Impl;
import ef.C2515C;
import jf.InterfaceC3103c;
import jf.InterfaceC3106f;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;

/* renamed from: k3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3183o extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f39239a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39240b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MetricsDb_Impl f39241c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Af.r f39242d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3183o(MetricsDb_Impl metricsDb_Impl, Af.r rVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f39241c = metricsDb_Impl;
        this.f39242d = rVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C3183o c3183o = new C3183o(this.f39241c, this.f39242d, interfaceC3103c);
        c3183o.f39240b = obj;
        return c3183o;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C3183o) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kf.a] */
    /* JADX WARN: Type inference failed for: r0v5 */
    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        C3187s c3187s;
        C3187s c3187s2 = kf.a.f39711a;
        int i5 = this.f39239a;
        MetricsDb_Impl metricsDb_Impl = this.f39241c;
        try {
            if (i5 == 0) {
                Fe.e.U(obj);
                InterfaceC3106f interfaceC3106f = ((E) this.f39240b).getCoroutineContext().get(C3187s.f39254c);
                AbstractC3340k.b(interfaceC3106f);
                C3187s c3187s3 = (C3187s) interfaceC3106f;
                c3187s3.f39256b.incrementAndGet();
                try {
                    metricsDb_Impl.c();
                    try {
                        Af.r rVar = this.f39242d;
                        this.f39240b = c3187s3;
                        this.f39239a = 1;
                        Object objInvoke = rVar.invoke(this);
                        if (objInvoke == c3187s2) {
                            return c3187s2;
                        }
                        c3187s = c3187s3;
                        obj = objInvoke;
                    } catch (Throwable th2) {
                        th = th2;
                        metricsDb_Impl.j();
                        throw th;
                    }
                } catch (Throwable th3) {
                    c3187s2 = c3187s3;
                    th = th3;
                    if (c3187s2.f39256b.decrementAndGet() >= 0) {
                        throw th;
                    }
                    throw new IllegalStateException("Transaction was never started or was already released.");
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3187s = (C3187s) this.f39240b;
                try {
                    Fe.e.U(obj);
                } catch (Throwable th4) {
                    th = th4;
                    metricsDb_Impl.j();
                    throw th;
                }
            }
            metricsDb_Impl.n();
            metricsDb_Impl.j();
            if (c3187s.f39256b.decrementAndGet() >= 0) {
                return obj;
            }
            throw new IllegalStateException("Transaction was never started or was already released.");
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
