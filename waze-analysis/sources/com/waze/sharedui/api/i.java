package com.waze.sharedui.api;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.waze.R;
import com.waze.bw.c.d.cv;
import com.waze.bw.c.d.de;
import com.waze.bw.c.d.df;
import com.waze.bw.c.d.dg;
import com.waze.sound.bp;
import h.g.b.x;
import java.util.Locale;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class i {
    public /* synthetic */ i() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.waze.shared_infra.s.d a(com.waze.app_nav.hub.b.c cVar, String str, int i2) {
        x.f(cVar, "<this>");
        x.f(str, "tag");
        com.waze.app_nav.hub.b.a aVar = null;
        com.waze.app_nav.hub.b.k kVar = new com.waze.app_nav.hub.b.k(str, aVar, new com.waze.sharedui.d.c(com.waze.shared_infra.o.b.a().c(i2, new Object[0]), 0), 6);
        cVar.b(kVar);
        return new com.waze.car_lib.i.a.d(cVar, kVar, 4, 0 == true ? 1 : 0);
    }

    public static com.waze.sharedui.d.b b(Context context, String str) {
        x.f(context, "context");
        x.f(str, "text");
        com.waze.sharedui.d.b bVar = new com.waze.sharedui.d.b(context, str);
        bVar.setCancelable(false);
        bVar.setCanceledOnTouchOutside(false);
        bVar.f(false);
        bVar.show();
        return bVar;
    }

    public static String d(String str) {
        x.f(str, "url");
        return String.valueOf(str.hashCode());
    }

    public static bp e(String str) {
        x.f(str, "mode");
        Map map = bp.f39559f;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        x.e(lowerCase, "toLowerCase(...)");
        return (bp) map.get(lowerCase);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(boolean r38, h.g.a.l r39, androidx.compose.runtime.Composer r40, int r41) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedui.api.i.f(boolean, h.g.a.l, androidx.compose.runtime.Composer, int):void");
    }

    public static String g(cv cvVar, Composer composer, int i2) {
        String strF;
        String strF2;
        String strD;
        x.f(cvVar, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1569990800, i2, -1, "com.waze.startstate.mobile.ui.getMainDisplayTextOrNull (WazeUIDestinationExtensions.kt:9)");
        }
        if (x.n(cvVar.b(), de.f18088a)) {
            composer.startReplaceGroup(598045063);
            strF = com.waze.ui.r.a.c.c.b(R.string.HOME, composer, 0);
            composer.endReplaceGroup();
        } else if (x.n(cvVar.b(), dg.f18091a)) {
            composer.startReplaceGroup(598138311);
            strF = com.waze.ui.r.a.c.c.b(R.string.WORK, composer, 0);
            composer.endReplaceGroup();
        } else if ((cvVar.b() instanceof df) && ((df) cvVar.b()).b().length() > 0) {
            composer.startReplaceGroup(598265783);
            composer.endReplaceGroup();
            strF = ((df) cvVar.b()).b();
        } else if (cvVar.a().b() != null && cvVar.a().b().a().length() > 0) {
            composer.startReplaceGroup(598368114);
            composer.endReplaceGroup();
            strF = cvVar.a().b().a();
        } else if (cvVar.a().c() == null || (((strF2 = cvVar.a().f()) == null || strF2.length() == 0) && ((strD = cvVar.a().d()) == null || strD.length() == 0))) {
            composer.startReplaceGroup(598702480);
            composer.endReplaceGroup();
            String strC = cvVar.a().c();
            strF = strC == null ? cvVar.a().f() : strC;
        } else {
            composer.startReplaceGroup(598526245);
            strF = c.e(cvVar.a(), composer);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strF;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String h(com.waze.bw.c.d.cv r4, androidx.compose.runtime.Composer r5, int r6) {
        /*
            java.lang.String r0 = "<this>"
            h.g.b.x.f(r4, r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            r2 = -1
            if (r1 == 0) goto L14
            r1 = 1290622195(0x4ced54f3, float:1.2443023E8)
            java.lang.String r3 = "com.waze.startstate.mobile.ui.getSecondaryDisplayTextOrNull (WazeUIDestinationExtensions.kt:32)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r6, r2, r3)
        L14:
            r6 = -957616404(0xffffffffc6ebeeec, float:-30199.46)
            r5.startReplaceGroup(r6)
            com.waze.bw.c.d.dh r6 = r4.b()
            if (r6 != 0) goto L6b
            com.waze.bw.c.d.cu r6 = r4.a()
            com.waze.bw.c.d.dj r6 = r6.b()
            r1 = 0
            if (r6 == 0) goto L30
            java.lang.String r6 = r6.a()
            goto L31
        L30:
            r6 = r1
        L31:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L3b
            int r6 = r6.length()
            if (r6 != 0) goto L6b
        L3b:
            com.waze.bw.c.d.cu r6 = r4.a()
            java.lang.String r6 = com.waze.sharedui.api.c.e(r6, r5)
            if (r6 == 0) goto L61
            r6 = 378950106(0x169651da, float:2.4285463E-25)
            r5.startReplaceGroup(r6)
            r5.endReplaceGroup()
            com.waze.bw.c.d.cu r6 = r4.a()
            java.lang.String r1 = com.waze.sharedui.api.c.d(r6)
            if (r1 != 0) goto Lc9
            com.waze.bw.c.d.cu r4 = r4.a()
            java.lang.String r1 = r4.f()
            goto Lc9
        L61:
            r4 = 379011393(0x16974141, float:2.4436547E-25)
            r5.startReplaceGroup(r4)
            r5.endReplaceGroup()
            goto Lc9
        L6b:
            r6 = 378723620(0x1692dd24, float:2.3727132E-25)
            r5.startReplaceGroup(r6)
            com.waze.bw.c.d.cu r4 = r4.a()
            h.g.b.x.f(r4, r0)
            boolean r6 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r6 == 0) goto L87
            r6 = 0
            java.lang.String r0 = "com.waze.startstate.mobile.ui.formatFullAddressOrNull (WazeUIAddressExtensions.kt:8)"
            r1 = -806163472(0xffffffffcff2ebf0, float:-8.1510973E9)
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r6, r2, r0)
        L87:
            java.lang.String r6 = com.waze.sharedui.api.c.e(r4, r5)
            java.lang.String r4 = com.waze.sharedui.api.c.d(r4)
            if (r4 != 0) goto L9c
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L9a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L9a:
            r1 = r6
            goto Lc6
        L9c:
            if (r6 != 0) goto La8
            boolean r6 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r6 == 0) goto Lc5
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto Lc5
        La8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r6 = ", "
            r0.append(r6)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            boolean r6 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r6 == 0) goto Lc5
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        Lc5:
            r1 = r4
        Lc6:
            r5.endReplaceGroup()
        Lc9:
            r5.endReplaceGroup()
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto Ld5
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        Ld5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedui.api.i.h(com.waze.bw.c.d.cv, androidx.compose.runtime.Composer, int):java.lang.String");
    }

    public /* synthetic */ i(byte[] bArr, byte[] bArr2) {
    }
}
