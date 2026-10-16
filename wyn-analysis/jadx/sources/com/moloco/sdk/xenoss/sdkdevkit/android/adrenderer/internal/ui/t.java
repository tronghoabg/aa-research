package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import Cd.C0357z;
import N.C0718d;
import N.C0729i0;
import N.C0732k;
import N.C0740o;
import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC3340k;
import r0.InterfaceC3903h;

/* loaded from: classes4.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f31039a = new AtomicBoolean(false);

    public static final void a(String str, InterfaceC3903h interfaceC3903h, Z.k modifier, C0740o c0740o, int i5) {
        int i10;
        AbstractC3340k.e(modifier, "modifier");
        c0740o.N(481470006);
        if ((i5 & 6) == 0) {
            i10 = (c0740o.e(str) ? 4 : 2) | i5;
        } else {
            i10 = i5;
        }
        if ((i5 & 48) == 0) {
            i10 |= c0740o.e(interfaceC3903h) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i10 |= c0740o.e(modifier) ? 256 : 128;
        }
        if ((i10 & 147) == 146 && c0740o.x()) {
            c0740o.I();
        } else {
            boolean zIsHardwareAccelerated = ((View) c0740o.j(AndroidCompositionLocals_androidKt.f18016f)).isHardwareAccelerated();
            c0740o.M(313990270);
            boolean zF = c0740o.f(zIsHardwareAccelerated);
            Object objF = c0740o.F();
            if (zF || objF == C0732k.f7800a) {
                objF = new C0357z(zIsHardwareAccelerated, 1);
                c0740o.U(objF);
            }
            c0740o.p(false);
            C0718d.g((tf.a) objF, c0740o);
            h4.g gVar = new h4.g((Context) c0740o.j(AndroidCompositionLocals_androidKt.f18012b));
            gVar.f36078c = str;
            gVar.f36084i = Boolean.valueOf(zIsHardwareAccelerated);
            com.moloco.sdk.internal.publisher.H.G(gVar.a(), modifier, interfaceC3903h, c0740o, ((i10 << 15) & 3670016) | (i10 & 896) | 48);
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new C2041b(str, interfaceC3903h, modifier, i5);
        }
    }
}
