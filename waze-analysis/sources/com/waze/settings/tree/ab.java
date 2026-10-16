package com.waze.settings.tree;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.view.View;
import com.waze.R;
import com.waze.network.f.ak;
import com.waze.settings.bk;
import com.waze.settings.de;
import com.waze.strings.DisplayStrings;
import h.g.b.aq;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ab extends f {
    public ab(Integer num) {
        super("user_image", bk.f36882l, "USER_IMAGE_SETTINGS", com.waze.ui.ad.b.c(num), null, com.waze.nightmode.e.s(Integer.valueOf(R.drawable.profile_pic_placeholder)), null, DisplayStrings.DS_REPORT_MENU_MAP_ISSUE_MISSING_BRIDGE_OVERPASS);
    }

    @Override // com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        com.waze.ifs.ui.x xVar = new com.waze.ifs.ui.x(deVar.g());
        Resources resources = deVar.g().getResources();
        d dVarM = m();
        h.g.b.x.d(dVarM, "null cannot be cast to non-null type com.waze.settings.tree.IconSource.Id");
        xVar.a(BitmapFactory.decodeResource(resources, ((a) dVarM).a()));
        aq aqVar = new aq();
        xVar.setOnClickListener(new t(this, deVar, aqVar, xVar, 0));
        xVar.addOnAttachStateChangeListener(new u(aqVar, this, deVar));
        return xVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.waze.ifs.ui.x r5, java.lang.String r6, h.c.e r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.waze.settings.tree.w
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.settings.tree.w r0 = (com.waze.settings.tree.w) r0
            int r1 = r0.f37658c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37658c = r1
            goto L18
        L13:
            com.waze.settings.tree.w r0 = new com.waze.settings.tree.w
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r4 = r0.f37656a
            h.c.a.a r7 = h.c.a.a.f48038a
            int r1 = r0.f37658c
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            com.waze.ifs.ui.x r5 = r0.f37659d
            r6 = r5
            com.waze.ifs.ui.x r6 = (com.waze.ifs.ui.x) r6
            e.b.c.b(r4)     // Catch: java.lang.Throwable -> L2c
            goto L54
        L2c:
            r4 = move-exception
            goto L62
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            e.b.c.b(r4)
            r5.b()
            kotlinx.coroutines.ab r4 = kotlinx.coroutines.av.b()     // Catch: java.lang.Throwable -> L2c
            h.c.j r4 = (h.c.j) r4     // Catch: java.lang.Throwable -> L2c
            com.waze.settings.tree.x r1 = new com.waze.settings.tree.x     // Catch: java.lang.Throwable -> L2c
            r3 = 0
            r1.<init>(r6, r3)     // Catch: java.lang.Throwable -> L2c
            h.g.a.p r1 = (h.g.a.p) r1     // Catch: java.lang.Throwable -> L2c
            r0.f37659d = r5     // Catch: java.lang.Throwable -> L2c
            r0.f37658c = r2     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r4 = kotlinx.coroutines.aj.v(r4, r1, r0)     // Catch: java.lang.Throwable -> L2c
            if (r4 == r7) goto L61
        L54:
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch: java.lang.Throwable -> L2c
            if (r4 == 0) goto L5b
            r5.a(r4)     // Catch: java.lang.Throwable -> L2c
        L5b:
            r5.c()
            h.ab r4 = h.ab.f48028a
            return r4
        L61:
            return r7
        L62:
            r5.c()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.settings.tree.ab.c(com.waze.ifs.ui.x, java.lang.String, h.c.e):java.lang.Object");
    }

    public final br d(de deVar, com.waze.ifs.ui.x xVar) {
        h.g.b.x.f(deVar, "page");
        h.g.b.x.f(xVar, "view");
        return aj.z(ak.q(deVar), null, null, new aa(deVar, this, xVar, null), 3);
    }
}
