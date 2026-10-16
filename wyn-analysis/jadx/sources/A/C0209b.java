package A;

import ef.C2515C;
import java.util.concurrent.CancellationException;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import lf.AbstractC3471j;

/* renamed from: A.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0209b extends AbstractC3471j implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public C0217j f121a;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.C f122b;

    /* renamed from: c, reason: collision with root package name */
    public int f123c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0212e f124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f125e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ L f126f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f127g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0209b(C0212e c0212e, Object obj, L l10, long j8, InterfaceC3103c interfaceC3103c) {
        super(1, interfaceC3103c);
        this.f124d = c0212e;
        this.f125e = obj;
        this.f126f = l10;
        this.f127g = j8;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(InterfaceC3103c interfaceC3103c) {
        return new C0209b(this.f124d, this.f125e, this.f126f, this.f127g, interfaceC3103c);
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        return ((C0209b) create((InterfaceC3103c) obj)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.internal.n, tf.l] */
    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        C0217j c0217j;
        kotlin.jvm.internal.C c10;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f123c;
        int i10 = 1;
        C0212e c0212e = this.f124d;
        try {
            if (i5 == 0) {
                Fe.e.U(obj);
                C0217j c0217j2 = c0212e.f143c;
                AbstractC0221n abstractC0221n = (AbstractC0221n) ((AbstractC3343n) c0212e.f141a.f10941b).invoke(this.f125e);
                c0217j2.getClass();
                AbstractC3340k.e(abstractC0221n, "<set-?>");
                c0217j2.f171g = abstractC0221n;
                L l10 = this.f126f;
                c0212e.f145e.setValue(l10.f47d);
                c0212e.f144d.setValue(Boolean.TRUE);
                C0217j c0217j3 = c0212e.f143c;
                C0217j c0217j4 = new C0217j((S3.e) c0217j3.f169e, ((N.Y) c0217j3.f170f).getValue(), AbstractC0226t.c((AbstractC0221n) c0217j3.f171g), c0217j3.f166b, Long.MIN_VALUE, c0217j3.f168d);
                kotlin.jvm.internal.C c11 = new kotlin.jvm.internal.C();
                long j8 = this.f127g;
                C0208a c0208a = new C0208a(c0212e, c0217j4, c11, 0);
                this.f121a = c0217j4;
                this.f122b = c11;
                this.f123c = 1;
                if (AbstractC0226t.b(c0217j4, l10, j8, c0208a, this) == aVar) {
                    return aVar;
                }
                c0217j = c0217j4;
                c10 = c11;
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c10 = this.f122b;
                c0217j = this.f121a;
                Fe.e.U(obj);
            }
            if (!c10.f39736a) {
                i10 = 2;
            }
            C0212e.b(c0212e);
            return new C0214g(c0217j, i10);
        } catch (CancellationException e7) {
            C0212e.b(c0212e);
            throw e7;
        }
    }
}
