package kotlinx.b.d;

import androidx.autofill.HintConstants;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o implements kotlinx.b.a.q {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f51217a;

    o(h.g.a.a aVar) {
        this.f51217a = h.g.a(aVar);
    }

    private final kotlinx.b.a.q l() {
        return (kotlinx.b.a.q) this.f51217a.getValue();
    }

    @Override // kotlinx.b.a.q
    public final int a(String str) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        return l().a(str);
    }

    @Override // kotlinx.b.a.q
    public final int b() {
        return l().b();
    }

    @Override // kotlinx.b.a.q
    public final String c(int i2) {
        return l().c(i2);
    }

    @Override // kotlinx.b.a.q
    public final String d() {
        return l().d();
    }

    @Override // kotlinx.b.a.q
    public final /* synthetic */ List e() {
        return h.a.i.h();
    }

    @Override // kotlinx.b.a.q
    public final List f(int i2) {
        return l().f(i2);
    }

    @Override // kotlinx.b.a.q
    public final kotlinx.b.a.q g(int i2) {
        return l().g(i2);
    }

    @Override // kotlinx.b.a.q
    public final kotlinx.b.a.x h() {
        return l().h();
    }

    @Override // kotlinx.b.a.q
    public final boolean i(int i2) {
        return l().i(i2);
    }

    @Override // kotlinx.b.a.q
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // kotlinx.b.a.q
    public final /* synthetic */ boolean k() {
        return false;
    }
}
