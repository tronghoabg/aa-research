package com.waze.sharedui.e;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.google.v.gb;
import com.google.v.gc;
import com.google.v.v;
import com.waze.bw.c.d.de;
import com.waze.bw.c.d.df;
import com.waze.bw.c.d.dg;
import com.waze.bw.c.d.dh;
import com.waze.sharedui.api.i;
import com.waze.sound.en;
import com.waze.sound.fm;
import com.waze.sound.gd;
import com.waze.sound.ge;
import com.waze.sound.gf;
import com.waze.t.c.h;
import h.g.a.l;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import i.b.p;
import i.b.s;
import j$.time.Instant;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class e {
    public static final v b(byte[] bArr) {
        x.f(bArr, "<this>");
        v vVarQ = v.q(bArr);
        x.e(vVarQ, "copyFrom(...)");
        return vVarQ;
    }

    public static final gc c(Instant instant) {
        x.f(instant, "<this>");
        gb gbVarNewBuilder = gc.newBuilder();
        gbVarNewBuilder.b(instant.getEpochSecond());
        gbVarNewBuilder.a(instant.getNano());
        gc gcVarBuild = gbVarNewBuilder.build();
        x.e(gcVarBuild, "build(...)");
        return gcVarBuild;
    }

    public static final com.waze.shared_infra.h.c d(s sVar) {
        x.f(sVar, "<this>");
        return new com.waze.shared_infra.h.c(sVar.getLatTimes1000000(), sVar.getLonTimes1000000());
    }

    public static final s e(com.waze.shared_infra.h.c cVar) {
        x.f(cVar, "<this>");
        p pVarNewBuilder = s.newBuilder();
        pVarNewBuilder.a(cVar.c());
        pVarNewBuilder.b(cVar.d());
        s sVarBuild = pVarNewBuilder.build();
        x.e(sVarBuild, "build(...)");
        return sVarBuild;
    }

    public static final void f(gf gfVar, ge geVar) {
        x.f(gfVar, "<this>");
        x.f(geVar, "playSuccess");
        com.waze.sound.gc gcVar = geVar instanceof com.waze.sound.gc ? (com.waze.sound.gc) geVar : null;
        gfVar.a(geVar instanceof gd, gcVar != null ? gcVar.a() : null);
    }

    public static fm g() {
        org.a.d.k.b bVarC;
        m mVar;
        org.a.d.a.a aVar = fm.f40024a;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i2 = ar.f48106a;
            mVar = new m(fm.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new m(fm.class);
        }
        return (fm) bVarC.a(mVar, null, null);
    }

    public static /* synthetic */ void h(fm fmVar, String str, String str2, h.g.a.a aVar, int i2) {
        if ((i2 & 16) != 0) {
            aVar = new en(3);
        }
        fmVar.g(str, str2, aVar);
    }

    public static /* synthetic */ void i(fm fmVar, String str, String str2, boolean z, boolean z2, h.g.a.a aVar, int i2) {
        if ((i2 & 16) != 0) {
            aVar = new en(4);
        }
        h.g.a.a aVar2 = aVar;
        int i3 = i2 & 8;
        int i4 = i2 & 4;
        int i5 = i2 & 2;
        boolean z3 = (i3 == 0) & z2;
        boolean z4 = (i4 == 0) & z;
        if (i5 != 0) {
            str2 = null;
        }
        fmVar.c(str, str2, z4, z3, aVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0346  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(boolean r37, h.g.a.l r38, androidx.compose.runtime.Composer r39, int r40) {
        /*
            Method dump skipped, instructions count: 949
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedui.e.e.j(boolean, h.g.a.l, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0300  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(boolean r37, h.g.a.l r38, androidx.compose.runtime.Composer r39, int r40) {
        /*
            Method dump skipped, instructions count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedui.e.e.k(boolean, h.g.a.l, androidx.compose.runtime.Composer, int):void");
    }

    public static final void l(dh dhVar, boolean z, l lVar, Composer composer, int i2) {
        int i3;
        x.f(dhVar, "favoriteInfo");
        x.f(lVar, "callback");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-189836059);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(dhVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-189836059, i3, -1, "com.waze.startstate.mobile.ui.options.FavoritesCarouselOptionsMenu (FavoritesCarouselOptionsMenu.kt:17)");
            }
            if (x.n(dhVar, de.f18088a)) {
                composerStartRestartGroup.startReplaceGroup(1066124007);
                i.f(z, lVar, composerStartRestartGroup, (i3 >> 3) & 126);
                composerStartRestartGroup.endReplaceGroup();
            } else if (x.n(dhVar, dg.f18091a)) {
                composerStartRestartGroup.startReplaceGroup(1066241063);
                k(z, lVar, composerStartRestartGroup, (i3 >> 3) & 126);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(dhVar instanceof df)) {
                    composerStartRestartGroup.startReplaceGroup(-2043820213);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new h.i();
                }
                composerStartRestartGroup.startReplaceGroup(1066364288);
                m((df) dhVar, z, lVar, composerStartRestartGroup, i3 & 1022);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new h(dhVar, z, lVar, i2, 9));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0307  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(com.waze.bw.c.d.df r35, boolean r36, h.g.a.l r37, androidx.compose.runtime.Composer r38, int r39) {
        /*
            Method dump skipped, instructions count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedui.e.e.m(com.waze.bw.c.d.df, boolean, h.g.a.l, androidx.compose.runtime.Composer, int):void");
    }
}
