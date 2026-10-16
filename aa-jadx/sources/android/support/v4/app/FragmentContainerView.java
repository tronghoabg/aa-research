package android.support.v4.app;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\n¨\u0006="}, d2 = {"Landroid/support/v4/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "fm", "Landroid/support/v4/app/FragmentManager;", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/support/v4/app/FragmentManager;)V", "disappearingFragmentChildren", "", "Landroid/view/View;", "transitioningFragmentViews", "applyWindowInsetsListener", "Landroid/view/View$OnApplyWindowInsetsListener;", "drawDisappearingViewsFirst", "", "setLayoutTransition", "", "transition", "Landroid/animation/LayoutTransition;", "setOnApplyWindowInsetsListener", "listener", "onApplyWindowInsets", "Landroid/view/WindowInsets;", "insets", "dispatchApplyWindowInsets", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "drawChild", "child", "drawingTime", "", "startViewTransition", "view", "endViewTransition", "setDrawDisappearingViewsLast", "addView", "index", "params", "Landroid/view/ViewGroup$LayoutParams;", "removeViewAt", "removeViewInLayout", "removeView", "removeViews", "start", "count", "removeViewsInLayout", "removeAllViewsInLayout", "addDisappearingFragmentView", "v", "getFragment", "F", "Landroid/support/v4/app/Fragment;", "()Landroid/support/v4/app/Fragment;", "fragment"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FragmentContainerView extends android.widget.FrameLayout {
    public boolean a;
    private final java.util.List b;
    private final java.util.List c;
    private android.view.View.OnApplyWindowInsetsListener d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(android.content.Context context, android.util.AttributeSet attributeSet, defpackage.bt btVar) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        btVar.getClass();
        this.b = new java.util.ArrayList();
        this.c = new java.util.ArrayList();
        this.a = true;
        java.lang.String classAttribute = attributeSet.getClassAttribute();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.v.b, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        java.lang.String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        android.support.v4.app.Fragment fragmentE = btVar.e(id);
        if (classAttribute != null && fragmentE == null) {
            if (id == -1) {
                throw new java.lang.IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + ((java.lang.Object) classAttribute) + (string != null ? " with tag ".concat(string) : ""));
            }
            android.support.v4.app.Fragment fragmentA = btVar.i().a(context.getClassLoader(), classAttribute);
            fragmentA.getClass();
            fragmentA.mFragmentId = id;
            fragmentA.mContainerId = id;
            fragmentA.mTag = string;
            fragmentA.mFragmentManager = btVar;
            fragmentA.mHost = btVar.m;
            fragmentA.onInflate(context, attributeSet, (android.os.Bundle) null);
            defpackage.w wVar = new defpackage.w(btVar);
            wVar.s();
            wVar.t(this, fragmentA, string);
            wVar.d();
        }
        btVar.O(this);
    }

    private final void a(android.view.View view) {
        if (this.c.contains(view)) {
            this.b.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        if (defpackage.bt.h(view) == null) {
            throw new java.lang.IllegalStateException(defpackage.a.bl(view, "Views added to a FragmentContainerView must be associated with a Fragment. View ", " is not associated with a Fragment."));
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets windowInsets) {
        windowInsets.getClass();
        defpackage.edf edfVarQ = defpackage.edf.q(windowInsets, null);
        android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.d;
        defpackage.edf edfVarQ2 = onApplyWindowInsetsListener != null ? defpackage.edf.q(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets), null) : defpackage.ebt.e(this, edfVarQ);
        edfVarQ2.getClass();
        if (!edfVarQ2.y()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                defpackage.ebt.d(getChildAt(i), edfVarQ2);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(android.graphics.Canvas canvas) {
        canvas.getClass();
        if (this.a) {
            java.util.Iterator it = this.b.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (android.view.View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.a) {
            java.util.List list = this.b;
            if (!list.isEmpty() && list.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(android.view.View view) {
        view.getClass();
        this.c.remove(view);
        if (this.b.remove(view)) {
            this.a = true;
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                super.removeAllViewsInLayout();
                return;
            } else {
                android.view.View childAt = getChildAt(childCount);
                childAt.getClass();
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(android.view.View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        android.view.View childAt = getChildAt(i);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(android.view.View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            android.view.View childAt = getChildAt(i3);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            android.view.View childAt = getChildAt(i3);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void setLayoutTransition(android.animation.LayoutTransition layoutTransition) {
        throw new java.lang.UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public final void setOnApplyWindowInsetsListener(android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.d = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(android.view.View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.c.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        java.lang.String str;
        super(context, attributeSet, i);
        context.getClass();
        this.b = new java.util.ArrayList();
        this.c = new java.util.ArrayList();
        this.a = true;
        if (attributeSet != null) {
            java.lang.String classAttribute = attributeSet.getClassAttribute();
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.v.b, 0, 0);
            typedArrayObtainStyledAttributes.getClass();
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new java.lang.UnsupportedOperationException(defpackage.a.bv(classAttribute, str, "FragmentContainerView must be within a FragmentActivity to use ", "=\"", "\""));
            }
        }
    }

    public /* synthetic */ FragmentContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, defpackage.affu affuVar) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(android.content.Context context) {
        super(context);
        context.getClass();
        this.b = new java.util.ArrayList();
        this.c = new java.util.ArrayList();
        this.a = true;
    }
}
