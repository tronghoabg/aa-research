package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import Cd.U;
import Cd.W;
import Hf.InterfaceC0592c0;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1453q;
import g.AbstractC2655c;
import kotlin.jvm.internal.AbstractC3340k;
import tf.p;
import tf.q;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final ComponentActivity f30911a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC2655c f30912b;

    /* renamed from: c, reason: collision with root package name */
    public final C1453q f30913c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0592c0 f30914d;

    /* renamed from: e, reason: collision with root package name */
    public final long f30915e;

    /* renamed from: f, reason: collision with root package name */
    public final q f30916f;

    /* renamed from: g, reason: collision with root package name */
    public final p f30917g;

    /* renamed from: h, reason: collision with root package name */
    public l f30918h;

    public o(ComponentActivity componentActivity, AbstractC2655c abstractC2655c, C1453q c1453q, InterfaceC0592c0 foregroundFlow) {
        Cf.h hVar = Cf.a.f2200b;
        long jS = Fe.b.S(60, Cf.c.f2208d);
        W w2 = new W(1);
        U u10 = new U(17);
        AbstractC3340k.e(foregroundFlow, "foregroundFlow");
        this.f30911a = componentActivity;
        this.f30912b = abstractC2655c;
        this.f30913c = c1453q;
        this.f30914d = foregroundFlow;
        this.f30915e = jS;
        this.f30916f = w2;
        this.f30917g = u10;
    }

    public final void a() {
        l lVar = this.f30918h;
        if (lVar == null) {
            return;
        }
        lVar.f30905c.cancel(null);
        lVar.f30906d.cancel(null);
        lVar.f30904b.invoke(lVar.f30903a ? g.f30900a : i.f30902a);
        this.f30918h = null;
    }

    public final void b() {
        l lVar = this.f30918h;
        if (lVar != null) {
            lVar.f30905c.cancel(null);
        }
        l lVar2 = this.f30918h;
        if (lVar2 != null) {
            lVar2.f30906d.cancel(null);
        }
        this.f30918h = null;
    }
}
