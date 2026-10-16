package com.waze.sharedui.f;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.waze.bw.c.d.cv;
import com.waze.bw.c.d.de;
import com.waze.bw.c.d.df;
import com.waze.bw.c.d.dg;
import com.waze.bw.c.d.dh;
import com.waze.jni.protos.network.MessagePriority;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class n {
    public /* synthetic */ n(byte[] bArr) {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(com.waze.sharedui.f.k r5, com.waze.sharedui.f.d r6, i.b.l.cd r7, h.c.e r8) {
        /*
            boolean r0 = r8 instanceof com.waze.sharedui.f.m
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.sharedui.f.m r0 = (com.waze.sharedui.f.m) r0
            int r1 = r0.f38914c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38914c = r1
            goto L18
        L13:
            com.waze.sharedui.f.m r0 = new com.waze.sharedui.f.m
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f38913b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f38914c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f38912a
            com.waze.sharedui.f.k r5 = (com.waze.sharedui.f.k) r5
            e.b.c.b(r8)     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L8a
            goto L50
        L2b:
            r6 = move-exception
            goto L54
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            e.b.c.b(r8)
            kotlinx.coroutines.CompletableDeferred r8 = kotlinx.coroutines.bo.j()
            com.waze.ac.b.f r2 = new com.waze.ac.b.f
            r4 = 9
            r2.<init>(r8, r4)
            r5.g(r6, r7, r2)
            r0.f38912a = r5     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L8a
            r0.f38914c = r3     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L8a
            java.lang.Object r8 = r8.c(r0)     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L8a
            if (r8 == r1) goto L53
        L50:
            com.waze.sharedui.f.n r8 = (com.waze.sharedui.f.n) r8     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L8a
            goto L58
        L53:
            return r1
        L54:
            java.lang.Object r8 = e.b.c.a(r6)
        L58:
            java.lang.Throwable r6 = h.m.c(r8)
            if (r6 == 0) goto L74
            com.waze.shared_infra.i.e r5 = r5.a()
            java.util.Objects.toString(r6)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "sendElement error - "
            java.lang.String r6 = r7.concat(r6)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.b(r6)
        L74:
            java.lang.Throwable r5 = h.m.c(r8)
            if (r5 != 0) goto L7b
            return r8
        L7b:
            com.waze.sharedui.f.j r5 = new com.waze.sharedui.f.j
            com.waze.sharedui.b r6 = com.waze.sharedui.i.c()
            java.lang.String r7 = "makeError(...)"
            h.g.b.x.e(r6, r7)
            r5.<init>(r6)
            return r5
        L8a:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedui.f.n.b(com.waze.sharedui.f.k, com.waze.sharedui.f.d, i.b.l.cd, h.c.e):java.lang.Object");
    }

    public static g c(MessagePriority messagePriority) {
        x.f(messagePriority, "protoPriority");
        MessagePriority messagePriority2 = MessagePriority.USER_AWAITING;
        g gVar = g.f38898a;
        int iOrdinal = messagePriority.ordinal();
        if (iOrdinal == 0) {
            return g.f38898a;
        }
        if (iOrdinal == 1) {
            return g.f38899b;
        }
        if (iOrdinal == 2) {
            return g.f38900c;
        }
        if (iOrdinal == 3) {
            return g.f38901d;
        }
        if (iOrdinal == 4) {
            return null;
        }
        throw new h.i();
    }

    public static f d(a aVar) {
        x.f(aVar, "<this>");
        return new e(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0346  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(boolean r38, h.g.a.l r39, androidx.compose.runtime.Composer r40, int r41) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedui.f.n.e(boolean, h.g.a.l, androidx.compose.runtime.Composer, int):void");
    }

    public static void f(cv cvVar, boolean z, h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        x.f(cvVar, "wazeUIDestination");
        x.f(lVar, "callback");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1439158117);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(cvVar) ? 2 : 4) | i2;
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
                ComposerKt.traceEventStart(-1439158117, i3, -1, "com.waze.startstate.mobile.ui.options.RecentCellOptionsMenu (RecentCellOptionsMenu.kt:19)");
            }
            dh dhVarB = cvVar.b();
            if (x.n(dhVarB, de.f18088a)) {
                composerStartRestartGroup.startReplaceGroup(-1595659464);
                com.waze.sharedui.e.e.j(z, lVar, composerStartRestartGroup, (i3 >> 3) & 126);
                composerStartRestartGroup.endReplaceGroup();
            } else if (x.n(dhVarB, dg.f18091a)) {
                composerStartRestartGroup.startReplaceGroup(-1595549352);
                e(z, lVar, composerStartRestartGroup, (i3 >> 3) & 126);
                composerStartRestartGroup.endReplaceGroup();
            } else if (dhVarB instanceof df) {
                composerStartRestartGroup.startReplaceGroup(-1595433071);
                h((df) dhVarB, z, lVar, composerStartRestartGroup, i3 & 1008);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (dhVarB != null) {
                    composerStartRestartGroup.startReplaceGroup(-51475207);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new h.i();
                }
                composerStartRestartGroup.startReplaceGroup(-1595271220);
                g(cvVar, z, lVar, composerStartRestartGroup, i3 & 1022);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.t.c.h(cvVar, z, lVar, i2, 12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0338  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(com.waze.bw.c.d.cv r38, boolean r39, h.g.a.l r40, androidx.compose.runtime.Composer r41, int r42) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedui.f.n.g(com.waze.bw.c.d.cv, boolean, h.g.a.l, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0354  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(com.waze.bw.c.d.df r37, boolean r38, h.g.a.l r39, androidx.compose.runtime.Composer r40, int r41) {
        /*
            Method dump skipped, instructions count: 967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedui.f.n.h(com.waze.bw.c.d.df, boolean, h.g.a.l, androidx.compose.runtime.Composer, int):void");
    }

    private n() {
        throw null;
    }
}
