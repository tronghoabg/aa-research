package If;

import ef.C2515C;
import java.util.Arrays;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: If.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0621b {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0623d[] f5459a;

    /* renamed from: b, reason: collision with root package name */
    public int f5460b;

    /* renamed from: c, reason: collision with root package name */
    public int f5461c;

    /* renamed from: d, reason: collision with root package name */
    public E f5462d;

    public final AbstractC0623d d() {
        AbstractC0623d abstractC0623dE;
        E e7;
        synchronized (this) {
            try {
                AbstractC0623d[] abstractC0623dArrF = this.f5459a;
                if (abstractC0623dArrF == null) {
                    abstractC0623dArrF = f();
                    this.f5459a = abstractC0623dArrF;
                } else if (this.f5460b >= abstractC0623dArrF.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC0623dArrF, abstractC0623dArrF.length * 2);
                    AbstractC3340k.d(objArrCopyOf, "copyOf(...)");
                    this.f5459a = (AbstractC0623d[]) objArrCopyOf;
                    abstractC0623dArrF = (AbstractC0623d[]) objArrCopyOf;
                }
                int i5 = this.f5461c;
                do {
                    abstractC0623dE = abstractC0623dArrF[i5];
                    if (abstractC0623dE == null) {
                        abstractC0623dE = e();
                        abstractC0623dArrF[i5] = abstractC0623dE;
                    }
                    i5++;
                    if (i5 >= abstractC0623dArrF.length) {
                        i5 = 0;
                    }
                } while (!abstractC0623dE.a(this));
                this.f5461c = i5;
                this.f5460b++;
                e7 = this.f5462d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (e7 != null) {
            e7.v(1);
        }
        return abstractC0623dE;
    }

    public abstract AbstractC0623d e();

    public abstract AbstractC0623d[] f();

    public final void g(AbstractC0623d abstractC0623d) {
        E e7;
        int i5;
        InterfaceC3103c[] interfaceC3103cArrB;
        synchronized (this) {
            try {
                int i10 = this.f5460b - 1;
                this.f5460b = i10;
                e7 = this.f5462d;
                if (i10 == 0) {
                    this.f5461c = 0;
                }
                AbstractC3340k.c(abstractC0623d, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                interfaceC3103cArrB = abstractC0623d.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC3103c interfaceC3103c : interfaceC3103cArrB) {
            if (interfaceC3103c != null) {
                interfaceC3103c.resumeWith(C2515C.f34653a);
            }
        }
        if (e7 != null) {
            e7.v(-1);
        }
    }

    public final E h() {
        E e7;
        synchronized (this) {
            e7 = this.f5462d;
            if (e7 == null) {
                int i5 = this.f5460b;
                e7 = new E(1, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, Gf.a.f4781b);
                e7.b(Integer.valueOf(i5));
                this.f5462d = e7;
            }
        }
        return e7;
    }
}
