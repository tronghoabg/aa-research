package Ef;

import ef.C2515C;

/* loaded from: classes5.dex */
public final class X extends Z {

    /* renamed from: c, reason: collision with root package name */
    public final C0502n f3705c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0479b0 f3706d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(AbstractC0479b0 abstractC0479b0, long j8, C0502n c0502n) {
        super(j8);
        this.f3706d = abstractC0479b0;
        this.f3705c = c0502n;
    }

    @Override // java.lang.Runnable
    public final void run() throws N {
        this.f3705c.C(this.f3706d, C2515C.f34653a);
    }

    @Override // Ef.Z
    public final String toString() {
        return super.toString() + this.f3705c;
    }
}
