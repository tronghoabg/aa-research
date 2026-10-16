package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC3340k;
import od.C3699k0;
import od.C3711o0;

/* loaded from: classes.dex */
public final class a0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18651a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18652b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18653c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f18654d;

    public a0(C1459x registry, EnumC1449m event) {
        AbstractC3340k.e(registry, "registry");
        AbstractC3340k.e(event, "event");
        this.f18653c = registry;
        this.f18654d = event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18651a) {
            case 0:
                if (!this.f18652b) {
                    ((C1459x) this.f18653c).f((EnumC1449m) this.f18654d);
                    this.f18652b = true;
                    break;
                }
                break;
            default:
                ((C3711o0) this.f18654d).f42044t.W((C3699k0) this.f18653c, this.f18652b);
                break;
        }
    }

    public a0(C3711o0 c3711o0, C3699k0 c3699k0, boolean z2) {
        this.f18654d = c3711o0;
        this.f18653c = c3699k0;
        this.f18652b = z2;
    }
}
