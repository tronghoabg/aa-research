package com.waze.z.a.b;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.waze.config.ConfigValues;
import com.waze.z.a.am;
import com.waze.z.a.ar;
import com.waze.z.a.at;
import com.waze.z.a.be;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class n {
    public /* synthetic */ n(byte[] bArr) {
    }

    public static m b(d dVar, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            dVar = c.f45740a;
        }
        f fVar = f.f45742a;
        a aVar = new a(h.h.a.b(be.H(56.0f, composer, 6)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(566605298, i2, -1, "com.waze.design_components_compose.components.bottom_sheet.WazeBottomSheetDefaults.defaultAnchors (WazeBottomSheetDefaults.kt:16)");
        }
        m mVar = new m(dVar, fVar, aVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mVar;
    }

    public static boolean c() {
        String strA = ConfigValues.CONFIG_VALUE_GAMIFICATION_CONTRIBUTION_FEED_URL.b();
        h.g.b.x.e(strA, "getValue(...)");
        return strA.length() > 0;
    }

    public static /* synthetic */ am d(com.waze.design_components.b.d dVar, int i2) {
        if ((i2 & 1) != 0) {
            dVar = com.waze.design_components.b.d.f23300a;
        }
        com.waze.design_components.b.e eVar = (i2 & 2) != 0 ? com.waze.design_components.b.e.f23312a : null;
        boolean z = (i2 & 4) != 0;
        h.g.b.x.f(dVar, "icon");
        h.g.b.x.f(eVar, "iconType");
        return new am(dVar, eVar, z);
    }

    public static /* synthetic */ ar e(com.waze.design_components.button.g gVar, com.waze.design_components.button.f fVar, com.waze.design_components.button.e eVar, int i2) {
        if ((i2 & 1) != 0) {
            gVar = com.waze.design_components.button.g.f23358a;
        }
        if ((i2 & 2) != 0) {
            fVar = com.waze.design_components.button.f.f23353a;
        }
        if ((i2 & 4) != 0) {
            eVar = com.waze.design_components.button.e.f23349a;
        }
        h.g.b.x.f(gVar, "buttonType");
        h.g.b.x.f(fVar, "buttonSize");
        h.g.b.x.f(eVar, "buttonSentiment");
        return new ar(gVar, fVar, eVar);
    }

    public static com.waze.z.a.g.s f() {
        return at.f45676a;
    }

    public static /* synthetic */ com.waze.z.a.d g(float f2, int i2) {
        float f3 = 1 != (i2 & 1) ? 0.0f : 1.0f;
        if ((i2 & 2) != 0) {
            f2 = 1.0f;
        }
        return new com.waze.z.a.d(f3, f2);
    }

    private n() {
        throw null;
    }

    public n(char[] cArr) {
    }
}
