package defpackage;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class xtv extends xtn implements xtm {
    private final Exception a;
    private final boolean b;

    public xtv(String str, xtm xtmVar, xue xueVar, boolean z, nrd nrdVar) {
        super("<missing root>:".concat(String.valueOf(str)), xtmVar, xue.d(xueVar, xud.b), nrdVar);
        this.a = xtmVar.b();
        this.b = z;
    }

    @Override // defpackage.xtm
    public final Exception b() {
        return this.a;
    }

    @Override // defpackage.xtm
    public final xuk g(String str, xue xueVar, boolean z, nrd nrdVar) {
        if (z && !this.b) {
            AtomicReference atomicReference = xts.a;
        }
        boolean z2 = true;
        if ((!z || this.b) && !this.b) {
            z2 = false;
        }
        return new xtv(str, this, xueVar, z2, nrdVar);
    }

    @Override // defpackage.xuk
    public final xue i() {
        return xud.a;
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

    public xtv(UUID uuid, String str, String str2, xue xueVar, Exception exc, boolean z, nrd nrdVar) {
        super("<missing root>:".concat(String.valueOf(str2)), uuid, str, xue.d(xueVar, xud.b), nrdVar);
        this.a = exc;
        this.b = z;
    }
}
