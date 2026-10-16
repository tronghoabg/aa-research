package com.waze.main_screen.b.a;

import android.graphics.drawable.Drawable;
import com.waze.sdk.bd;
import h.g.b.x;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class m implements f {

    /* renamed from: a, reason: collision with root package name */
    private final bd f25890a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ax.b f25891b;

    /* renamed from: c, reason: collision with root package name */
    private final ab f25892c;

    /* renamed from: d, reason: collision with root package name */
    private final af f25893d;

    /* renamed from: e, reason: collision with root package name */
    private final bn f25894e;

    /* renamed from: f, reason: collision with root package name */
    private final ch f25895f;

    /* renamed from: g, reason: collision with root package name */
    private com.google.firebase.messaging.l f25896g;

    public m(bd bdVar, com.waze.ax.b bVar, ab abVar) {
        x.f(bdVar, "sdkManager");
        x.f(bVar, "audioKitStatsReporter");
        x.f(abVar, "ioDispatcher");
        this.f25890a = bdVar;
        this.f25891b = bVar;
        this.f25892c = abVar;
        af afVarP = com.waze.ui.a.l.p(this, "AudioSdkButtonStateHolder");
        this.f25893d = afVarP;
        bn bnVarB = ck.b(new e(null));
        this.f25894e = bnVarB;
        k kVar = new k(bnVarB, this, 0);
        int i2 = bz.f51630a;
        this.f25895f = ai.V(kVar, afVarP, by.c(), bnVarB.d());
    }

    @Override // com.waze.main_screen.b.a.b
    public final void a(Drawable drawable) {
        bn bnVar;
        Object objD;
        do {
            bnVar = this.f25894e;
            objD = bnVar.d();
        } while (!bnVar.f(objD, new e(drawable, null)));
    }

    @Override // com.waze.main_screen.b.a.f
    public final ch b() {
        return this.f25895f;
    }

    @Override // com.waze.main_screen.b.a.f
    public final void c() {
        com.google.firebase.messaging.l lVar = this.f25896g;
        if (lVar != null) {
            ((h) lVar.f10212a).f25878c.b(new com.waze.main_screen.ab.b(false));
        }
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    @Override // com.waze.main_screen.b.a.f
    public final void d() {
        String strG = this.f25890a.g();
        if (strG != null) {
            this.f25891b.a(strG);
        }
    }

    public final void f(com.google.firebase.messaging.l lVar) {
        this.f25896g = lVar;
    }
}
