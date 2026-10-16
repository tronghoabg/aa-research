package ea;

import Cd.C0348p;
import Hf.C0611v;
import Hf.Z;
import ac.C1346a;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import u1.InterfaceC4220i;
import w1.C4351b;

/* renamed from: ea.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2480D implements InterfaceC2506v {

    /* renamed from: e, reason: collision with root package name */
    public static final C2509y f34448e = new C2509y();

    /* renamed from: f, reason: collision with root package name */
    public static final C4351b f34449f = tg.b.M(AbstractC2505u.f34584a, new C1346a(C2508x.f34588i), 12);

    /* renamed from: a, reason: collision with root package name */
    public final Context f34450a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3108h f34451b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f34452c;

    /* renamed from: d, reason: collision with root package name */
    public final Z f34453d;

    public C2480D(Context context, InterfaceC3108h interfaceC3108h) {
        AbstractC3340k.e(context, "context");
        this.f34450a = context;
        this.f34451b = interfaceC3108h;
        this.f34452c = new AtomicReference();
        f34448e.getClass();
        this.f34453d = new Z(new C0611v(((InterfaceC4220i) f34449f.getValue(context, C2509y.f34589a[0])).getData(), new C0348p(3, (InterfaceC3103c) null, 4)), this, 2);
        Ef.H.D(Ef.H.c(interfaceC3108h), null, new C2507w(this, null), 3);
    }
}
