package defpackage;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.car.app.model.TemplateWrapper;
import com.google.android.apps.auto.components.apphost.basewidgets.action.ui.ContentActionsViewShim;
import com.google.android.apps.auto.components.apphost.basewidgets.action.ui.MaterialActionButtonView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ContentModerationWrapperLayout;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ContentView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialTitleHeaderView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class gne extends hlf {
    public View a;
    final MaterialTitleHeaderView b;
    final ContentView c;
    final ViewGroup d;
    final ContentActionsViewShim e;
    public boolean f;
    public hii g;
    public hii h;
    private final ViewTreeObserver.OnGlobalFocusChangeListener p;
    private final ViewGroup q;
    private final boolean r;
    private final yfq s;
    private final yfq t;
    private final yfq u;
    private final MaterialActionButtonView v;
    private final MaterialActionButtonView w;
    private final View x;
    private final View y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gne(geu geuVar, TemplateWrapper templateWrapper, gzc gzcVar) {
        super(geuVar, templateWrapper, gzcVar);
        geuVar.getClass();
        this.p = new hle(this, 1, null);
        this.f = true;
        boolean zA = gzcVar.a();
        this.r = zA;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(zA ? new ContextThemeWrapper(new ContextThemeWrapper(geuVar, R.style.ThemeOverlay_Template_Card_Material), R.style.ThemeOverlay_Template_Card_HalfListRadius_Material) : geuVar).inflate(R.layout.material_row_list_wrapper_template_layout, (ViewGroup) null);
        this.q = viewGroup;
        this.d = (ViewGroup) viewGroup.findViewById(R.id.floating_action_container);
        MaterialTitleHeaderView materialTitleHeaderView = (MaterialTitleHeaderView) viewGroup.findViewById(R.id.header_view);
        this.b = materialTitleHeaderView;
        ContentView contentView = (ContentView) viewGroup.findViewById(R.id.content_view);
        this.c = contentView;
        ContentActionsViewShim contentActionsViewShim = (ContentActionsViewShim) viewGroup.findViewById(R.id.row_actions_view_shim);
        this.e = contentActionsViewShim;
        this.v = (MaterialActionButtonView) viewGroup.findViewById(R.id.bottom_floating_action_button);
        this.w = (MaterialActionButtonView) viewGroup.findViewById(R.id.top_floating_action_button);
        this.x = viewGroup.findViewById(R.id.row_header_divider);
        this.y = viewGroup.findViewById(R.id.row_action_list_divider);
        this.s = yfq.q(materialTitleHeaderView);
        this.t = yfq.q(contentView);
        this.u = yfq.q(contentActionsViewShim);
        ((ContentModerationWrapperLayout) viewGroup.findViewById(R.id.park_only_container)).a(geuVar, this.k);
        lix.b().b.fE(this, new hlg(this, 7));
    }

    @Override // defpackage.hlf
    public final View a() {
        View view = this.a;
        if (view == null) {
            view = this.e;
            if (view.getVisibility() != 0) {
                view = this.c;
                if (view.getVisibility() != 0) {
                    ViewGroup viewGroup = this.d;
                    if (viewGroup.getVisibility() == 0) {
                        return viewGroup;
                    }
                    ViewGroup viewGroup2 = this.q;
                    viewGroup2.getClass();
                    return viewGroup2;
                }
            }
        }
        return view;
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void b() {
        this.q.getViewTreeObserver().removeOnGlobalFocusChangeListener(this.p);
        this.a = null;
        super.b();
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void c() {
        this.q.getViewTreeObserver().addOnGlobalFocusChangeListener(this.p);
        super.c();
    }

    @Override // defpackage.hlf
    public final void d() {
        h();
    }

    @Override // defpackage.hlo
    public final View e() {
        return this.q;
    }

    public final hii f(int i, hii hiiVar, boolean z) {
        ghz ghzVar = hiiVar.j;
        ghx ghxVar = new ghx(ghzVar.g);
        ghxVar.c = i;
        ghz ghzVarA = ghz.a(ghzVar, 0, new ghy(ghxVar), false, 11);
        hih hihVar = new hih(this.i, hiiVar);
        hihVar.j = z;
        hihVar.f = ghzVarA;
        return new hii(hihVar);
    }

    @Override // defpackage.hlf
    public final void g(hlf hlfVar, View view) {
        this.b.setVisibility(8);
        super.g(hlfVar, view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x012a, code lost:
    
        if (r16 == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f8 A[EDGE_INSN: B:143:0x01f8->B:109:0x01f8 BREAK  A[LOOP:2: B:102:0x01dc->B:144:?]] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0133 A[EDGE_INSN: B:149:0x0133->B:70:0x0133 BREAK  A[LOOP:4: B:44:0x00f3->B:150:?]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d1  */
    /* JADX WARN: Type inference failed for: r22v1, types: [fwx, fxo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gne.h():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab A[RETURN] */
    @Override // defpackage.hlf, defpackage.hlo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            com.google.android.apps.auto.components.apphost.view.widgets.common.ContentView r6 = r4.c
            android.view.View r0 = r6.a()
            boolean r1 = r0 instanceof com.google.android.apps.auto.components.apphost.view.widgets.common.RowListView
            r2 = 0
            r3 = 0
            if (r1 != 0) goto Ld
            goto L26
        Ld:
            com.google.android.apps.auto.components.apphost.view.widgets.common.RowListView r0 = (com.google.android.apps.auto.components.apphost.view.widgets.common.RowListView) r0
            com.google.android.apps.auto.components.apphost.view.widgets.common.RowPagedListView r0 = r0.g
            r0.getClass()
            com.google.android.apps.auto.sdk.ui.PagedScrollBarView r0 = r0.m
            android.view.ViewGroup r0 = r0.g
            android.view.View r0 = r0.getChildAt(r3)
            if (r0 != 0) goto L1f
            goto L26
        L1f:
            android.view.ViewParent r0 = r0.getParent()
            r2 = r0
            android.view.View r2 = (android.view.View) r2
        L26:
            r0 = 4
            r1 = 1
            switch(r5) {
                case 19: goto L86;
                case 20: goto L72;
                case 21: goto L54;
                case 22: goto L2d;
                default: goto L2b;
            }
        L2b:
            goto Lab
        L2d:
            yfl r5 = new yfl
            r5.<init>(r0)
            yfq r0 = r4.t
            r5.k(r0)
            yfq r0 = r4.u
            r5.k(r0)
            yfq r5 = r5.g()
            android.view.ViewGroup r4 = r4.d
            yfq r4 = defpackage.yfq.q(r4)
            boolean r4 = defpackage.hlf.J(r5, r4, r3)
            if (r4 == 0) goto L4d
            return r1
        L4d:
            boolean r4 = defpackage.hlf.I(r2, r6, r3)
            if (r4 == 0) goto Lab
            return r1
        L54:
            android.view.ViewGroup r5 = r4.d
            yfq r4 = r4.t
            yfq r5 = defpackage.yfq.q(r5)
            boolean r4 = defpackage.hlf.J(r5, r4, r3)
            if (r4 == 0) goto L63
            return r1
        L63:
            if (r2 == 0) goto Lab
            boolean r4 = r2.hasFocus()
            if (r4 != 0) goto Lab
            boolean r4 = defpackage.hlf.I(r6, r2, r3)
            if (r4 == 0) goto Lab
            return r1
        L72:
            yfq r5 = r4.s
            yfq r6 = r4.t
            boolean r5 = defpackage.hlf.J(r5, r6, r3)
            if (r5 == 0) goto L7d
            return r1
        L7d:
            yfq r4 = r4.u
            boolean r4 = defpackage.hlf.J(r6, r4, r3)
            if (r4 == 0) goto Lab
            return r1
        L86:
            yfq r5 = r4.u
            yfq r6 = r4.t
            boolean r5 = defpackage.hlf.J(r5, r6, r3)
            if (r5 == 0) goto L91
            return r1
        L91:
            yfl r5 = new yfl
            r5.<init>(r0)
            r5.k(r6)
            android.view.ViewGroup r6 = r4.d
            r5.i(r6)
            yfq r5 = r5.g()
            yfq r4 = r4.s
            boolean r4 = defpackage.hlf.J(r5, r4, r3)
            if (r4 == 0) goto Lab
            return r1
        Lab:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gne.i(int, android.view.KeyEvent):boolean");
    }
}
