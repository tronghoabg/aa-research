package android.support.v4.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final List f87a;

    /* renamed from: b, reason: collision with root package name */
    private final List f88b;

    /* renamed from: c, reason: collision with root package name */
    private View.OnApplyWindowInsetsListener f89c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f90d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, bv bvVar) {
        String strConcat;
        super(context, attributeSet);
        h.g.b.x.f(context, "context");
        h.g.b.x.f(attributeSet, "attrs");
        h.g.b.x.f(bvVar, "fm");
        this.f87a = new ArrayList();
        this.f88b = new ArrayList();
        this.f90d = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = android.support.b.a.f74b;
        h.g.b.x.e(iArr, "FragmentContainerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        h.g.b.x.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        ar arVarG = bvVar.g(id);
        if (classAttribute != null && arVarG == null) {
            if (id == -1) {
                if (string != null) {
                    Objects.toString(string);
                    strConcat = " with tag ".concat(string);
                } else {
                    strConcat = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + ((Object) classAttribute) + strConcat);
            }
            ar arVarA = bvVar.o().a(context.getClassLoader(), classAttribute);
            h.g.b.x.e(arVarA, "instantiate(...)");
            arVarA.mFragmentId = id;
            arVarA.mContainerId = id;
            arVarA.mTag = string;
            arVarA.mFragmentManager = bvVar;
            arVarA.mHost = bvVar.p();
            arVarA.onInflate(context, attributeSet, (Bundle) null);
            a aVar = new a(bvVar);
            aVar.A();
            aVar.D(this, arVarA, string);
            aVar.g();
        }
        bvVar.at(this);
    }

    private final void b(View view) {
        if (this.f88b.contains(view)) {
            this.f87a.add(view);
        }
    }

    public final void a(boolean z) {
        this.f90d = z;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        h.g.b.x.f(view, "child");
        if (bv.m(view) == null) {
            throw new IllegalStateException(k.e(view, "Views added to a FragmentContainerView must be associated with a Fragment. View ", " is not associated with a Fragment."));
        }
        super.addView(view, i2, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        h.g.b.x.f(windowInsets, "insets");
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets);
        h.g.b.x.e(windowInsetsCompat, "toWindowInsetsCompat(...)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f89c;
        WindowInsetsCompat windowInsetsCompat2 = onApplyWindowInsetsListener != null ? WindowInsetsCompat.toWindowInsetsCompat(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : ViewCompat.onApplyWindowInsets(this, windowInsetsCompat);
        h.g.b.x.c(windowInsetsCompat2);
        if (!windowInsetsCompat2.isConsumed()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                ViewCompat.dispatchApplyWindowInsets(getChildAt(i2), windowInsetsCompat2);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        h.g.b.x.f(canvas, "canvas");
        if (this.f90d) {
            Iterator it = this.f87a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j2) {
        h.g.b.x.f(canvas, "canvas");
        h.g.b.x.f(view, "child");
        if (this.f90d) {
            List list = this.f87a;
            if (!list.isEmpty() && list.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        h.g.b.x.f(view, "view");
        this.f88b.remove(view);
        if (this.f87a.remove(view)) {
            this.f90d = true;
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        h.g.b.x.f(windowInsets, "insets");
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
                View childAt = getChildAt(childCount);
                h.g.b.x.c(childAt);
                b(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        h.g.b.x.f(view, "view");
        b(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i2) {
        View childAt = getChildAt(i2);
        h.g.b.x.c(childAt);
        b(childAt);
        super.removeViewAt(i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        h.g.b.x.f(view, "view");
        b(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            View childAt = getChildAt(i4);
            h.g.b.x.c(childAt);
            b(childAt);
        }
        super.removeViews(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            View childAt = getChildAt(i4);
            h.g.b.x.c(childAt);
            b(childAt);
        }
        super.removeViewsInLayout(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public final void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f89c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        h.g.b.x.f(view, "view");
        if (view.getParent() == this) {
            this.f88b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        h.g.b.x.f(context, "context");
        this.f87a = new ArrayList();
        this.f88b = new ArrayList();
        this.f90d = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i2) {
        String str;
        super(context, attributeSet, i2);
        h.g.b.x.f(context, "context");
        this.f87a = new ArrayList();
        this.f88b = new ArrayList();
        this.f90d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = android.support.b.a.f74b;
            h.g.b.x.e(iArr, "FragmentContainerView");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            h.g.b.x.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
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
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + ((Object) str) + "=\"" + ((Object) classAttribute) + "\"");
        }
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i2, int i3, h.g.b.o oVar) {
        this(context, attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        h.g.b.x.f(context, "context");
    }
}
