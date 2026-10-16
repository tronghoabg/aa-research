package q;

import p.InterfaceC3747B;

/* renamed from: q.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3797C extends AbstractViewOnTouchListenerC3844w0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ J f43618j;
    public final /* synthetic */ M k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3797C(M m10, M m11, J j8) {
        super(m11);
        this.k = m10;
        this.f43618j = j8;
    }

    @Override // q.AbstractViewOnTouchListenerC3844w0
    public final InterfaceC3747B b() {
        return this.f43618j;
    }

    @Override // q.AbstractViewOnTouchListenerC3844w0
    public final boolean c() {
        M m10 = this.k;
        if (m10.getInternalPopup().a()) {
            return true;
        }
        m10.f43678f.i(AbstractC3799E.b(m10), AbstractC3799E.a(m10));
        return true;
    }
}
