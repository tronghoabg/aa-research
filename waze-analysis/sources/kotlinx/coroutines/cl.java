package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cl extends h.c.a implements br {

    /* renamed from: b, reason: collision with root package name */
    public static final cl f51810b = new cl();

    private cl() {
        super(br.f51766a);
    }

    @Override // kotlinx.coroutines.br
    public final ax bY(h.g.a.l lVar) {
        return cm.f51811a;
    }

    @Override // kotlinx.coroutines.br
    public final boolean bZ() {
        return true;
    }

    @Override // kotlinx.coroutines.br
    public final boolean ca() {
        return false;
    }

    @Override // kotlinx.coroutines.br
    public final org.a.d.a cb() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.br
    public final Object m(h.c.e eVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.br
    public final CancellationException n() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.br
    public final h.m.h o() {
        return h.m.k.e();
    }

    @Override // kotlinx.coroutines.br
    public final ax q(boolean z, boolean z2, h.g.a.l lVar) {
        return cm.f51811a;
    }

    @Override // kotlinx.coroutines.br
    public final br r() {
        return null;
    }

    @Override // kotlinx.coroutines.br, kotlinx.coroutines.a.af
    public final void s(CancellationException cancellationException) {
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.br
    public final boolean u() {
        return false;
    }

    @Override // kotlinx.coroutines.br
    public final p w(cf cfVar) {
        return cm.f51811a;
    }

    @Override // kotlinx.coroutines.br
    public final void x() {
    }
}
