package E5;

import f6.AbstractC2588a;
import f6.C2607t;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class m0 implements InterfaceC0458j0 {

    /* renamed from: a, reason: collision with root package name */
    public final C2607t f3463a;

    /* renamed from: d, reason: collision with root package name */
    public int f3466d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3467e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3465c = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Object f3464b = new Object();

    public m0(AbstractC2588a abstractC2588a, boolean z2) {
        this.f3463a = new C2607t(abstractC2588a, z2);
    }

    @Override // E5.InterfaceC0458j0
    public final J0 a() {
        return this.f3463a.f35102o;
    }

    @Override // E5.InterfaceC0458j0
    public final Object getUid() {
        return this.f3464b;
    }
}
