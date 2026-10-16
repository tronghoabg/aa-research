package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes2.dex */
public final class jva extends FrameLayout implements gfh {
    public static final yph a = yph.c("CarApp.H");
    public final geu b;
    public final gfy c;
    public final ghc d;
    public final ghd e;
    public final bwq f;
    public final afdr g;
    public final afec h;
    public final afec i;
    public gib j;
    public final ajab k;
    private final kmf l;
    private final bwq m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jva(geu geuVar) {
        super(geuVar, null, 0);
        geuVar.getClass();
        this.b = geuVar;
        this.c = new gfy(this, geuVar);
        Context context = getContext();
        context.getClass();
        kmf kmfVar = new kmf(context);
        this.l = kmfVar;
        this.d = (ghc) geuVar.F(ghc.class);
        this.e = (ghd) geuVar.F(ghd.class);
        this.k = ((gie) geuVar.F(gie.class)).a;
        jvb jvbVar = new jvb(0, 0, 0, 0);
        bxp bxpVar = bxp.c;
        this.m = new ParcelableSnapshotMutableState(jvbVar, bxpVar);
        this.f = new ParcelableSnapshotMutableState(false, bxpVar);
        this.g = new jtw(this, 6);
        this.h = new hku(this, 15);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(kmfVar);
        kmfVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        kmfVar.a(new cct(1271367479, true, new juy(this, 2)));
        this.i = new hku(this, 16);
    }

    @Override // defpackage.gfh
    /* renamed from: b */
    public final gfy getA() {
        return this.c;
    }

    @Override // defpackage.gfh
    public final /* synthetic */ void c() {
        fwl.j(this);
    }

    @Override // defpackage.gfh
    public final /* synthetic */ void d(hju hjuVar, String str) {
        fwl.k(this, hjuVar, str);
    }

    @Override // defpackage.gfh
    public final /* synthetic */ void e(gzc gzcVar) {
        fwl.l(this, gzcVar);
    }

    public final void f(geu geuVar, hjo hjoVar, afeg afegVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(2005940883);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(geuVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(hjoVar) : buxVarC.E(hjoVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(this) ? 1024 : 2048;
        }
        if (buxVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            leh.a.a();
            buxVarC.v(-1189912410);
            int i4 = jux.a;
            jtr.b(jux.a(geuVar), false, hjoVar, afegVar, buxVarC, (i2 << 3) & 8064, 2);
            ((bvv) buxVarC).Y(false);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new dmh(this, geuVar, hjoVar, afegVar, i, 11);
        }
    }

    public final void g(boolean z) {
        this.f.b(Boolean.valueOf(z));
    }

    public final gib h() {
        return new gib(new jtw(this, 7));
    }

    public final jvb i() {
        return (jvb) this.m.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.j == null) {
            this.j = h();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gib gibVar = this.j;
        if (gibVar != null) {
            synchronized (gibVar.a) {
                gibVar.a();
            }
        }
        this.j = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        hju hjuVarD = this.c.d();
        hkt hktVar = hjuVarD instanceof hkt ? (hkt) hjuVarD : null;
        hju hjuVar = hktVar != null ? hktVar.b : null;
        jxr jxrVar = hjuVar instanceof jxr ? (jxr) hjuVar : null;
        afdr afdrVar = jxrVar != null ? jxrVar.d : null;
        if (afdrVar == null) {
            return super.requestFocus(i, rect);
        }
        afdrVar.invoke();
        return true;
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.m.b(new jvb(i, i2, i3, i4));
    }

    @Override // defpackage.gfh
    public final View a() {
        return this;
    }
}
