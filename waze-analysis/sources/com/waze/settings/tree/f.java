package com.waze.settings.tree;

import android.view.View;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.settings.bk;
import com.waze.settings.de;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class f {

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.ui.ac.n f37561d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.ui.ac.n f37562e;

    /* renamed from: f, reason: collision with root package name */
    private d f37563f;

    /* renamed from: g, reason: collision with root package name */
    private com.waze.settings.tree.c.c f37564g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f37565h;

    /* renamed from: i, reason: collision with root package name */
    private Integer f37566i;

    /* renamed from: j, reason: collision with root package name */
    private f f37567j;
    private final String m;
    private final bk n;
    private final String o;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ f(java.lang.String r9, com.waze.settings.bk r10, java.lang.String r11, com.waze.ui.ac.n r12, com.waze.ui.ac.n r13, com.waze.settings.tree.d r14, com.waze.settings.tree.c.c r15, int r16) {
        /*
            r8 = this;
            r0 = r16 & 32
            if (r0 == 0) goto L8
            com.waze.settings.tree.c r14 = com.waze.settings.tree.c.f37530a
            com.waze.settings.tree.d r14 = (com.waze.settings.tree.d) r14
        L8:
            r6 = r14
            r14 = r16 & 64
            if (r14 == 0) goto L16
            com.waze.car_lib.o.k r14 = new com.waze.car_lib.o.k
            r0 = 9
            r14.<init>(r0)
            r7 = r14
            goto L17
        L16:
            r7 = r15
        L17:
            r14 = r16 & 16
            r0 = r16 & 8
            r1 = 0
            if (r14 == 0) goto L20
            r5 = r1
            goto L21
        L20:
            r5 = r13
        L21:
            if (r0 == 0) goto L29
            r4 = r1
            r0 = r8
            r2 = r10
            r3 = r11
            r1 = r9
            goto L2e
        L29:
            r4 = r12
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
        L2e:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.settings.tree.f.<init>(java.lang.String, com.waze.settings.bk, java.lang.String, com.waze.ui.ac.n, com.waze.ui.ac.n, com.waze.settings.tree.d, com.waze.settings.tree.c.c, int):void");
    }

    public final void A(com.waze.settings.tree.c.c cVar) {
        h.g.b.x.f(cVar, "handler");
        this.f37564g = cVar;
    }

    protected abstract View O(de deVar);

    public String P() {
        com.waze.ui.ac.n nVar = this.f37562e;
        if (nVar != null) {
            return com.waze.sharedui.utils.o.a(com.waze.shared_infra.o.b.a(), nVar);
        }
        return null;
    }

    public final View k(de deVar) {
        h.g.b.x.f(deVar, "page");
        if (z()) {
            return O(deVar);
        }
        return null;
    }

    public final bk l() {
        return this.n;
    }

    public final d m() {
        return this.f37563f;
    }

    public final f n() {
        return this.f37567j;
    }

    public final Integer o() {
        return this.f37565h;
    }

    public final Integer p() {
        return this.f37566i;
    }

    public final String q() {
        String str = this.m;
        f fVar = this.f37567j;
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if ((fVar != null ? fVar.m : null) == null) {
                String string = sb.toString();
                h.g.b.x.e(string, "toString(...)");
                return string;
            }
            sb.insert(0, ".");
            sb.insert(0, fVar.m);
            fVar = fVar.f37567j;
        }
    }

    public final String r() {
        return this.o;
    }

    public final String s() {
        return this.m;
    }

    public final String t() {
        com.waze.ui.ac.n nVar = this.f37561d;
        if (nVar != null) {
            return com.waze.sharedui.utils.o.a(com.waze.shared_infra.o.b.a(), nVar);
        }
        return null;
    }

    public List u() {
        return null;
    }

    public final void v(d dVar) {
        h.g.b.x.f(dVar, "<set-?>");
        this.f37563f = dVar;
    }

    public final void w(Integer num) {
        this.f37565h = num;
    }

    public final void x(f fVar) {
        this.f37567j = fVar;
    }

    public final void y(Integer num) {
        this.f37566i = num;
    }

    public boolean z() {
        return this.f37564g.a();
    }

    public f(String str, bk bkVar, String str2, com.waze.ui.ac.n nVar, com.waze.ui.ac.n nVar2, d dVar, com.waze.settings.tree.c.c cVar) {
        h.g.b.x.f(bkVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(dVar, "iconSource");
        h.g.b.x.f(cVar, "shouldDisplay");
        this.m = str;
        this.n = bkVar;
        this.o = str2;
        this.f37561d = nVar;
        this.f37562e = nVar2;
        this.f37563f = dVar;
        this.f37564g = cVar;
        this.f37565h = null;
        this.f37566i = null;
    }
}
