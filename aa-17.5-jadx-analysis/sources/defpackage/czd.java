package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.projection.gearhead.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class czd extends ViewGroup {
    private bvb d;
    private afdr e;
    private boolean f;
    private boolean g;
    private WeakReference st;
    private IBinder su;
    private bva sv;

    public czd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        cjh cjhVar = new cjh(this, 2);
        addOnAttachStateChangeListener(cjhVar);
        izj izjVar = new izj(this, null);
        ((ArrayList) ebf.N(this).a).add(izjVar);
        this.e = new axf(this, cjhVar, izjVar, 6);
    }

    private final bvb a() {
        bvb bvbVar;
        bvb bvbVarB = this.d;
        if (bvbVarB == null) {
            bvbVarB = dco.b(this);
            bvb bvbVar2 = null;
            if (bvbVarB != null) {
                n(bvbVarB);
            } else {
                bvbVarB = null;
            }
            if (bvbVarB == null) {
                WeakReference weakReference = this.st;
                if (weakReference != null && (bvbVar = (bvb) weakReference.get()) != null && true == o(bvbVar)) {
                    bvbVar2 = bvbVar;
                }
                if (bvbVar2 != null) {
                    return bvbVar2;
                }
                bxn bxnVarD = dco.d(this);
                n(bxnVarD);
                return bxnVarD;
            }
        }
        return bvbVarB;
    }

    private final day k(View view, day dayVar) {
        bvb bvbVarA = a();
        eqa eqaVarD = ecw.d(view);
        eru eruVarJ = eee.j(view);
        fbg fbgVarJ = ebi.j(view);
        if (bvbVarA == dayVar.a() && eqaVarD == dayVar.b() && eruVarJ == dayVar.c() && fbgVarJ == dayVar.d()) {
            return dayVar;
        }
        if (bvbVarA.d() != dayVar.a().d()) {
            e();
        }
        if (eqaVarD == null) {
            eqaVarD = dayVar.b();
        }
        eqa eqaVar = eqaVarD;
        if (fbgVarJ == null) {
            fbgVarJ = dayVar.d();
        }
        day dayVar2 = new day(dayVar, view, bvbVarA, eqaVar, fbgVarJ, eruVarJ);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(dayVar2));
        return dayVar2;
    }

    private final void l() {
        if (this.f) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb A[Catch: all -> 0x0137, Merged into TryCatch #1 {all -> 0x0139, blocks: (B:5:0x0006, B:67:0x0138, B:6:0x0008, B:15:0x0023, B:17:0x002d, B:20:0x0039, B:24:0x0042, B:25:0x0049, B:26:0x004a, B:29:0x0053, B:33:0x005c, B:34:0x0063, B:35:0x0064, B:38:0x006d, B:41:0x0075, B:43:0x0092, B:45:0x00ac, B:46:0x00cd, B:48:0x00d3, B:50:0x00db, B:53:0x00e1, B:57:0x00eb, B:58:0x00f9, B:60:0x0107, B:62:0x010c, B:63:0x0124, B:54:0x00e5, B:42:0x008e, B:9:0x0011, B:11:0x0019, B:14:0x001f), top: B:73:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107 A[Catch: all -> 0x0137, Merged into TryCatch #1 {all -> 0x0139, blocks: (B:5:0x0006, B:67:0x0138, B:6:0x0008, B:15:0x0023, B:17:0x002d, B:20:0x0039, B:24:0x0042, B:25:0x0049, B:26:0x004a, B:29:0x0053, B:33:0x005c, B:34:0x0063, B:35:0x0064, B:38:0x006d, B:41:0x0075, B:43:0x0092, B:45:0x00ac, B:46:0x00cd, B:48:0x00d3, B:50:0x00db, B:53:0x00e1, B:57:0x00eb, B:58:0x00f9, B:60:0x0107, B:62:0x010c, B:63:0x0124, B:54:0x00e5, B:42:0x008e, B:9:0x0011, B:11:0x0019, B:14:0x001f), top: B:73:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010c A[Catch: all -> 0x0137, Merged into TryCatch #1 {all -> 0x0139, blocks: (B:5:0x0006, B:67:0x0138, B:6:0x0008, B:15:0x0023, B:17:0x002d, B:20:0x0039, B:24:0x0042, B:25:0x0049, B:26:0x004a, B:29:0x0053, B:33:0x005c, B:34:0x0063, B:35:0x0064, B:38:0x006d, B:41:0x0075, B:43:0x0092, B:45:0x00ac, B:46:0x00cd, B:48:0x00d3, B:50:0x00db, B:53:0x00e1, B:57:0x00eb, B:58:0x00f9, B:60:0x0107, B:62:0x010c, B:63:0x0124, B:54:0x00e5, B:42:0x008e, B:9:0x0011, B:11:0x0019, B:14:0x001f), top: B:73:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m() {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czd.m():void");
    }

    private final void n(bvb bvbVar) {
        if (true != o(bvbVar)) {
            bvbVar = null;
        }
        if (bvbVar != null) {
            this.st = new WeakReference(bvbVar);
        }
    }

    private static final boolean o(bvb bvbVar) {
        return !(bvbVar instanceof bxn) || ((bxi) ((bxn) bvbVar).l.b()).compareTo(bxi.b) > 0;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        l();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    protected final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        l();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public abstract void b(bux buxVar, int i);

    public final void c() {
        if (isAttachedToWindow()) {
            IBinder windowToken = getWindowToken();
            czq czqVar = null;
            if (this.su != windowToken) {
                this.su = windowToken;
                this.st = null;
            }
            if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                if (childAt instanceof czq) {
                    czqVar = (czq) childAt;
                }
            }
            if (czqVar != null) {
                czqVar.W(k(dap.d(this), czqVar.P()));
            }
            if (i()) {
                m();
            }
        }
    }

    public final void d() {
        if (this.d == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        }
        m();
    }

    public final void e() {
        View childAt = getChildAt(0);
        if (childAt instanceof czq) {
        }
        bva bvaVar = this.sv;
        if (bvaVar != null) {
            bvaVar.d();
        }
        this.sv = null;
        requestLayout();
    }

    public void f(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public final void fq(bvb bvbVar) {
        if (this.d != bvbVar) {
            this.d = bvbVar;
            if (bvbVar != null) {
                this.st = null;
            }
            bva bvaVar = this.sv;
            if (bvaVar != null) {
                bvaVar.d();
                this.sv = null;
                if (isAttachedToWindow()) {
                    m();
                }
            }
        }
    }

    public void g(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    protected boolean i() {
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.g || super.isTransitionGroup();
    }

    public final void j() {
        afdr dehVar;
        afdr afdrVar = this.e;
        if (afdrVar != null) {
            afdrVar.invoke();
        }
        if (isAttachedToWindow()) {
            eqa eqaVarD = ecw.d(this);
            if (eqaVarD == null) {
                crt.a(a.bm(this, "View tree for ", " has no ViewTreeLifecycleOwner"));
                throw new aezp();
            }
            dehVar = czz.w(this, eqaVarD.getLifecycle());
        } else {
            affv affvVar = new affv();
            dcj dcjVar = new dcj(this, affvVar, 1);
            addOnAttachStateChangeListener(dcjVar);
            affvVar.a = new bws(this, dcjVar, 5);
            dehVar = new deh(affvVar, 1);
        }
        this.e = dehVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (dco.a(this).getParent() == null) {
            getHandler().postAtFrontOfQueue(new lh(this, 10, null));
        } else {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        f(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        m();
        g(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    @Override // android.view.ViewGroup
    public final void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.g = true;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        l();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    protected final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        l();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        l();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        l();
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        l();
        super.addView(view, layoutParams);
    }

    public czd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public czd(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ czd(Context context, AttributeSet attributeSet, int i, int i2, afeu afeuVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
