package com.waze.sound;

import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ct implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cw f39714a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f39715b;

    ct(cw cwVar, int i2, byte[] bArr) {
        this.f39715b = i2;
        Objects.requireNonNull(cwVar);
        this.f39714a = cwVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalArgumentException {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        int i2 = this.f39715b;
        if (i2 == 0) {
            if (bg.c().v()) {
                return;
            }
            cw cwVar = this.f39714a;
            if (bg.c().t(cwVar.f39729l.getId(), true) && bg.c().x(cwVar.f39729l.getId(), true, new cs(this))) {
                cwVar.f39721d.d(false);
                cwVar.f39720c.d(false);
                cwVar.r(cwVar.f39724g.getProgress() / 1000.0f, bg.c().D(cwVar.f39729l.getId()));
                return;
            }
            return;
        }
        if (i2 == 1) {
            cw cwVar2 = this.f39714a;
            if (bg.c().w(cwVar2.f39729l)) {
                return;
            }
            cw.l(cwVar2);
            return;
        }
        if (i2 == 2) {
            this.f39714a.m();
            return;
        }
        if (i2 != 3) {
            cw cwVar3 = this.f39714a;
            if (bg.c().w(cwVar3.f39729l)) {
                bg.c().q(false);
                return;
            } else {
                cwVar3.m();
                return;
            }
        }
        org.a.d.a.a aVar = hx.f40209a;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(hx.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i4 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(hx.class);
        }
        Object objA = bVarC.a(mVar, null, null);
        cw cwVar4 = this.f39714a;
        ((hx) objA).a(ht.f40180b, cwVar4.f39729l.getId());
        bg.c().o(cwVar4.f39729l.getId());
        cwVar4.m();
    }

    ct(cw cwVar, int i2) {
        this.f39715b = i2;
        Objects.requireNonNull(cwVar);
        this.f39714a = cwVar;
    }

    ct(cw cwVar, int i2, char[] cArr) {
        this.f39715b = i2;
        Objects.requireNonNull(cwVar);
        this.f39714a = cwVar;
    }

    ct(cw cwVar, int i2, short[] sArr) {
        this.f39715b = i2;
        Objects.requireNonNull(cwVar);
        this.f39714a = cwVar;
    }

    ct(cw cwVar, int i2, int[] iArr) {
        this.f39715b = i2;
        Objects.requireNonNull(cwVar);
        this.f39714a = cwVar;
    }
}
