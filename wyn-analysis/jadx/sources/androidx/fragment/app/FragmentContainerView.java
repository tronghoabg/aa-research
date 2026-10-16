package androidx.fragment.app;

import A7.AbstractC0279p0;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.wynauto.wyn.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00028\u0000\"\n\b\u0000\u0010\u0010*\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "Lef/C;", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "Landroidx/fragment/app/F;", "F", "getFragment", "()Landroidx/fragment/app/F;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18314a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18315b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f18316c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18317d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        AbstractC3340k.e(context, "context");
        this.f18314a = new ArrayList();
        this.f18315b = new ArrayList();
        this.f18317d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1.a.f1777b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public final void a(View view) {
        if (this.f18315b.contains(view)) {
            this.f18314a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i5, ViewGroup.LayoutParams layoutParams) {
        AbstractC3340k.e(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof F ? (F) tag : null) != null) {
            super.addView(child, i5, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        k1.v0 v0VarG;
        AbstractC3340k.e(insets, "insets");
        k1.v0 v0VarG2 = k1.v0.g(null, insets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f18316c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            AbstractC3340k.d(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            v0VarG = k1.v0.g(null, windowInsetsOnApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = k1.S.f38779a;
            WindowInsets windowInsetsF = v0VarG2.f();
            if (windowInsetsF != null) {
                WindowInsets windowInsetsB = k1.H.b(this, windowInsetsF);
                if (!windowInsetsB.equals(windowInsetsF)) {
                    v0VarG2 = k1.v0.g(this, windowInsetsB);
                }
            }
            v0VarG = v0VarG2;
        }
        if (!v0VarG.f38877a.n()) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                k1.S.b(getChildAt(i5), v0VarG);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC3340k.e(canvas, "canvas");
        if (this.f18317d) {
            Iterator it = this.f18314a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j8) {
        AbstractC3340k.e(canvas, "canvas");
        AbstractC3340k.e(child, "child");
        if (this.f18317d) {
            ArrayList arrayList = this.f18314a;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j8);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        AbstractC3340k.e(view, "view");
        this.f18315b.remove(view);
        if (this.f18314a.remove(view)) {
            this.f18317d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends F> F getFragment() {
        FragmentActivity fragmentActivity;
        F f10;
        e0 supportFragmentManager;
        View view = this;
        while (true) {
            fragmentActivity = null;
            if (view == null) {
                f10 = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            f10 = tag instanceof F ? (F) tag : null;
            if (f10 != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (f10 == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof FragmentActivity) {
                    fragmentActivity = (FragmentActivity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (fragmentActivity == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        } else {
            if (!f10.isAdded()) {
                throw new IllegalStateException("The Fragment " + f10 + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = f10.getChildFragmentManager();
        }
        return (F) supportFragmentManager.B(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        AbstractC3340k.e(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                AbstractC3340k.d(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        AbstractC3340k.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i5) {
        View view = getChildAt(i5);
        AbstractC3340k.d(view, "view");
        a(view);
        super.removeViewAt(i5);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        AbstractC3340k.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i5, int i10) {
        int i11 = i5 + i10;
        for (int i12 = i5; i12 < i11; i12++) {
            View view = getChildAt(i12);
            AbstractC3340k.d(view, "view");
            a(view);
        }
        super.removeViews(i5, i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i5, int i10) {
        int i11 = i5 + i10;
        for (int i12 = i5; i12 < i11; i12++) {
            View view = getChildAt(i12);
            AbstractC3340k.d(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i5, i10);
    }

    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.f18317d = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(@Nullable LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(@NotNull View.OnApplyWindowInsetsListener listener) {
        AbstractC3340k.e(listener, "listener");
        this.f18316c = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        AbstractC3340k.e(view, "view");
        if (view.getParent() == this) {
            this.f18315b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, e0 fm) {
        View view;
        super(context, attrs);
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(attrs, "attrs");
        AbstractC3340k.e(fm, "fm");
        this.f18314a = new ArrayList();
        this.f18315b = new ArrayList();
        this.f18317d = true;
        String classAttribute = attrs.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C1.a.f1777b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id2 = getId();
        F fB = fm.B(id2);
        if (classAttribute != null && fB == null) {
            if (id2 == -1) {
                throw new IllegalStateException(AbstractC0279p0.l("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            W wG = fm.G();
            context.getClassLoader();
            F fInstantiate = F.instantiate(wG.f18346a.f18428v.f18333b, classAttribute, null);
            AbstractC3340k.d(fInstantiate, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            fInstantiate.mFragmentId = id2;
            fInstantiate.mContainerId = id2;
            fInstantiate.mTag = string;
            fInstantiate.mFragmentManager = fm;
            fInstantiate.mHost = fm.f18428v;
            fInstantiate.onInflate(context, attrs, (Bundle) null);
            C1409a c1409a = new C1409a(fm);
            c1409a.f18364p = true;
            fInstantiate.mContainer = this;
            c1409a.e(getId(), fInstantiate, string, 1);
            if (!c1409a.f18356g) {
                c1409a.f18357h = false;
                e0 e0Var = c1409a.f18365q;
                if (e0Var.f18428v != null && !e0Var.f18402I) {
                    e0Var.y(true);
                    c1409a.a(e0Var.f18404K, e0Var.L);
                    e0Var.f18409b = true;
                    try {
                        e0Var.T(e0Var.f18404K, e0Var.L);
                        e0Var.d();
                        e0Var.d0();
                        boolean z2 = e0Var.f18403J;
                        m0 m0Var = e0Var.f18410c;
                        if (z2) {
                            e0Var.f18403J = false;
                            Iterator it = m0Var.d().iterator();
                            while (it.hasNext()) {
                                l0 l0Var = (l0) it.next();
                                F f10 = l0Var.f18480c;
                                if (f10.mDeferStart) {
                                    if (e0Var.f18409b) {
                                        e0Var.f18403J = true;
                                    } else {
                                        f10.mDeferStart = false;
                                        l0Var.k();
                                    }
                                }
                            }
                        }
                        m0Var.f18497b.values().removeAll(Collections.singleton(null));
                    } catch (Throwable th) {
                        e0Var.d();
                        throw th;
                    }
                }
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it2 = fm.f18410c.d().iterator();
        while (it2.hasNext()) {
            l0 l0Var2 = (l0) it2.next();
            F f11 = l0Var2.f18480c;
            if (f11.mContainerId == getId() && (view = f11.mView) != null && view.getParent() == null) {
                f11.mContainer = this;
                l0Var2.b();
            }
        }
    }
}
