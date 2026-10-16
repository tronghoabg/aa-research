package zd;

import Ef.A;
import Ef.B;
import Ef.C0499l0;
import Ef.C0505o0;
import Ef.D;
import Ef.I0;
import Ef.InterfaceC0515v;
import Ef.S;
import ef.C2532p;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import jf.InterfaceC3106f;
import jf.InterfaceC3108h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public abstract class e implements c {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f48484c = AtomicIntegerFieldUpdater.newUpdater(e.class, "closed");

    /* renamed from: a, reason: collision with root package name */
    public final C2532p f48485a;

    /* renamed from: b, reason: collision with root package name */
    public final C2532p f48486b;

    @NotNull
    private volatile /* synthetic */ int closed = 0;

    public e() {
        final int i5 = 0;
        this.f48485a = Fe.c.z(new tf.a(this) { // from class: zd.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f48483b;

            {
                this.f48483b = this;
            }

            @Override // tf.a
            public final Object invoke() {
                e eVar = this.f48483b;
                switch (i5) {
                    case 0:
                        ((Ad.e) eVar).f1275d.getClass();
                        Lf.e eVar2 = S.f3698a;
                        return Lf.d.f7120b;
                    default:
                        return Fe.c.B(new I0(null), new E0.h(B.f3657a, 1)).plus((A) eVar.f48485a.getValue()).plus(new D("ktor-android-context"));
                }
            }
        });
        final int i10 = 1;
        this.f48486b = Fe.c.z(new tf.a(this) { // from class: zd.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f48483b;

            {
                this.f48483b = this;
            }

            @Override // tf.a
            public final Object invoke() {
                e eVar = this.f48483b;
                switch (i10) {
                    case 0:
                        ((Ad.e) eVar).f1275d.getClass();
                        Lf.e eVar2 = S.f3698a;
                        return Lf.d.f7120b;
                    default:
                        return Fe.c.B(new I0(null), new E0.h(B.f3657a, 1)).plus((A) eVar.f48485a.getValue()).plus(new D("ktor-android-context"));
                }
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (f48484c.compareAndSet(this, 0, 1)) {
            InterfaceC3106f interfaceC3106f = getCoroutineContext().get(C0499l0.f3748a);
            InterfaceC0515v interfaceC0515v = interfaceC3106f instanceof InterfaceC0515v ? (InterfaceC0515v) interfaceC3106f : null;
            if (interfaceC0515v == null) {
                return;
            }
            ((C0505o0) interfaceC0515v).Y();
        }
    }

    @Override // Ef.E
    public final InterfaceC3108h getCoroutineContext() {
        return (InterfaceC3108h) this.f48486b.getValue();
    }
}
