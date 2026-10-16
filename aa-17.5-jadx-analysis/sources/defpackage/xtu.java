package defpackage;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class xtu extends xtj implements xtm {
    public static final xtk a = new xtl();
    private final Exception b;

    public xtu(UUID uuid, String str, Exception exc, nrd nrdVar) {
        super("<missing root>", uuid, str, nrdVar);
        this.b = exc;
    }

    @Override // defpackage.xtm
    public final Exception b() {
        return this.b;
    }

    @Override // defpackage.xtm
    public final xuk g(String str, xue xueVar, boolean z, nrd nrdVar) {
        if (z) {
            AtomicReference atomicReference = xts.a;
        }
        return new xtv(str, this, xueVar, z, nrdVar);
    }

    @Override // defpackage.xuk
    public final xue h() {
        return xud.a;
    }

    @Override // defpackage.xuk
    public final xue i() {
        throw null;
    }

    @Override // defpackage.xuk
    public final xuk m(String str, xue xueVar, nrd nrdVar) {
        AtomicReference atomicReference = xts.a;
        return g(str, xueVar, true, nrdVar);
    }

    @Override // defpackage.xuk
    public final void j() {
    }

    @Override // defpackage.xuk
    public final void k() {
    }

    @Override // defpackage.xuk
    public final void l() {
    }
}
