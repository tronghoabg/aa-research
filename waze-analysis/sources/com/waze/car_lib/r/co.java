package com.waze.car_lib.r;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.lifecycle.MutableLiveData;
import com.waze.R;
import com.waze.realtime.RealtimeNativeManager;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class co {
    public co(com.waze.shared_infra.o.a aVar, com.waze.car_lib.login.m mVar, com.waze.car_lib.login.a.a aVar2, h.g.a.a aVar3, h.g.a.a aVar4, h.g.a.a aVar5, RealtimeNativeManager realtimeNativeManager) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(mVar, "loginController");
        h.g.b.x.f(aVar2, "qrLoginController");
        h.g.b.x.f(aVar3, "isGuestSignupEnabled");
        h.g.b.x.f(aVar4, "isUsernameLoginEnabled");
        h.g.b.x.f(aVar5, "getQRLoginFallbackLink");
        h.g.b.x.f(realtimeNativeManager, "realtimeNativeManager");
        new MutableLiveData();
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(com.waze.ui.f.ak r24, h.g.a.a r25, h.g.a.a r26, androidx.compose.runtime.Composer r27, int r28) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.co.d(com.waze.ui.f.ak, h.g.a.a, h.g.a.a, androidx.compose.runtime.Composer, int):void");
    }

    public static void e(com.waze.o.d.b.a.d dVar, boolean z, h.g.a.a aVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(dVar, "stateHolder");
        h.g.b.x.f(aVar, "onButtonClicked");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2052458338);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(dVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 1024 : 2048;
        }
        int i5 = i3;
        if (composerStartRestartGroup.shouldExecute((i5 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2052458338, i5, -1, "com.waze.companinio.ui.mobile.button_pack.CompaninioButton (CompaninioButton.kt:33)");
            }
            com.waze.t.c.k kVarG = com.waze.t.c.n.g(dVar.a(), composerStartRestartGroup);
            int i6 = i5 & 14;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i6 == 4 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.c.e.a.a(dVar, 14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            com.waze.t.c.n.c(kVarG, (h.g.a.l) objRememberedValue, composerStartRestartGroup, 0);
            boolean zChanged = ((i5 & DisplayStrings.DS_TAP_TO_VERIFY) == 256) | composerStartRestartGroup.changed(kVarG);
            boolean z2 = i6 == 4;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if ((z2 | zChanged) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                com.waze.a.z zVar = new com.waze.a.z((Object) aVar, (Object) kVarG, (Object) dVar, 19, (char[]) null);
                composerStartRestartGroup.updateRememberedValue(zVar);
                objRememberedValue2 = zVar;
            }
            h.g.a.a aVar2 = (h.g.a.a) objRememberedValue2;
            long jColorResource = ColorResources_androidKt.colorResource(R.color.experimental_background, composerStartRestartGroup, 0);
            final long jColorResource2 = ColorResources_androidKt.colorResource(R.color.experimental_foreground, composerStartRestartGroup, 0);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1630983967);
                Modifier modifierA = com.waze.ui.r.a.d.d.a(modifier, com.waze.ui.r.a.d.c.de, null);
                com.waze.ui.e.y yVar = new com.waze.ui.e.y(new com.waze.ui.e.q(R.drawable.companinio, Color.m8218boximpl(jColorResource2), null), com.waze.ui.r.a.c.c.b(R.string.COMPANINIO_BOTTOM_SHEET_TITLE, composerStartRestartGroup, 0), 6);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new com.waze.car_lib.screens.cp(20);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                com.waze.ui.e.w.f(yVar, modifierA, null, jColorResource, aVar2, (h.g.a.a) objRememberedValue3, null, composerStartRestartGroup, 196608, 68);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1630557190);
                com.waze.ui.d.s.j(aVar2, modifier, jColorResource, null, ComposableLambdaKt.rememberComposableLambda(-1741052216, true, new h.g.a.q() { // from class: com.waze.o.d.b.a.a
                    @Override // h.g.a.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        BoxScope boxScope = (BoxScope) obj;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        x.f(boxScope, "$this$ButtonPackItem");
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= true != composer2.changed(boxScope) ? 2 : 4;
                        }
                        if (composer2.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1741052216, iIntValue, -1, "com.waze.companinio.ui.mobile.button_pack.CompaninioButton.<anonymous> (CompaninioButton.kt:75)");
                            }
                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.companinio, composer2, 0), com.waze.ui.r.a.c.c.b(R.string.COMPANINIO_BOTTOM_SHEET_TITLE, composer2, 0), boxScope.align(SizeKt.m2822size3ABfNKs(com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.de, null), 32.0f), Alignment.Companion.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, jColorResource2, 0, 2, null), composer2, Painter.$stable, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer2.skipToGroupEnd();
                        }
                        return ab.f48028a;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 >> 6) & 112) | 24576, 8);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.main_screen.c.b.b(dVar, z, aVar, modifier, i2, 1));
        }
    }

    public static com.waze.o.d.b.b.c f(com.waze.o.ad adVar) {
        h.g.b.x.f(adVar, "<this>");
        if (adVar instanceof dg) {
            return new com.waze.car_lib.p.cz(((dg) adVar).a());
        }
        if (!(adVar instanceof df)) {
            throw new h.i();
        }
        df dfVar = (df) adVar;
        String strC = dfVar.c();
        boolean zE = dfVar.e();
        List<com.waze.car_lib.b.a.b> listD = dfVar.d();
        ArrayList arrayList = new ArrayList(h.a.i.q(listD, 10));
        for (com.waze.car_lib.b.a.b bVar : listD) {
            arrayList.add(new com.waze.car_lib.p.t(bVar.d(), bVar.a(), bVar.b(), bVar.c()));
        }
        return new com.waze.car_lib.p.cy(strC, zE, arrayList);
    }

    public com.waze.car_lib.p.cm g() {
        throw null;
    }

    public String h() {
        throw null;
    }

    public /* synthetic */ co(byte[] bArr) {
    }

    private co() {
        throw null;
    }
}
