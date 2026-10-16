package E;

import kotlin.jvm.internal.AbstractC3340k;
import vf.AbstractC4345a;

/* renamed from: E.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0430u extends android.support.v4.media.session.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2771a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2772b;

    public /* synthetic */ C0430u(Object obj, int i5) {
        this.f2771a = i5;
        this.f2772b = obj;
    }

    @Override // android.support.v4.media.session.b
    public final int J(int i5, L0.i layoutDirection, r0.t tVar) {
        switch (this.f2771a) {
            case 0:
                AbstractC3340k.e(layoutDirection, "layoutDirection");
                Z.b bVar = (Z.b) this.f2772b;
                bVar.getClass();
                AbstractC3340k.e(layoutDirection, "layoutDirection");
                float f10 = i5 / 2.0f;
                L0.i iVar = L0.i.f6806a;
                float f11 = bVar.f16913a;
                if (layoutDirection != iVar) {
                    f11 *= -1;
                }
                return AbstractC4345a.H((1 + f11) * f10);
            default:
                AbstractC3340k.e(layoutDirection, "layoutDirection");
                return AbstractC4345a.H((1 + ((Z.c) this.f2772b).f16914a) * (i5 / 2.0f));
        }
    }
}
