package androidx.fragment.app;

import A7.AbstractC0279p0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class Q implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f18338a;

    public Q(e0 e0Var) {
        this.f18338a = e0Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        l0 l0VarG;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        e0 e0Var = this.f18338a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, e0Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1.a.f1776a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = F.class.isAssignableFrom(W.a(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    F fB = resourceId != -1 ? e0Var.B(resourceId) : null;
                    if (fB == null && string != null) {
                        fB = e0Var.C(string);
                    }
                    if (fB == null && id2 != -1) {
                        fB = e0Var.B(id2);
                    }
                    if (fB == null) {
                        W wG = e0Var.G();
                        context.getClassLoader();
                        fB = F.instantiate(wG.f18346a.f18428v.f18333b, attributeValue, null);
                        fB.mFromLayout = true;
                        fB.mFragmentId = resourceId != 0 ? resourceId : id2;
                        fB.mContainerId = id2;
                        fB.mTag = string;
                        fB.mInLayout = true;
                        fB.mFragmentManager = e0Var;
                        O o7 = e0Var.f18428v;
                        fB.mHost = o7;
                        fB.onInflate((Context) o7.f18333b, attributeSet, fB.mSavedFragmentState);
                        l0VarG = e0Var.a(fB);
                        if (e0.J(2)) {
                            Log.v("FragmentManager", "Fragment " + fB + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (fB.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                        }
                        fB.mInLayout = true;
                        fB.mFragmentManager = e0Var;
                        O o10 = e0Var.f18428v;
                        fB.mHost = o10;
                        fB.onInflate((Context) o10.f18333b, attributeSet, fB.mSavedFragmentState);
                        l0VarG = e0Var.g(fB);
                        if (e0.J(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + fB + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    D1.c cVar = D1.d.f2276a;
                    D1.d.b(new D1.e(fB, viewGroup, 0));
                    D1.d.a(fB).getClass();
                    fB.mContainer = viewGroup;
                    l0VarG.k();
                    l0VarG.j();
                    View view2 = fB.mView;
                    if (view2 == null) {
                        throw new IllegalStateException(AbstractC0279p0.l("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (fB.mView.getTag() == null) {
                        fB.mView.setTag(string);
                    }
                    fB.mView.addOnAttachStateChangeListener(new P(this, l0VarG));
                    return fB.mView;
                }
            }
        }
        return null;
    }
}
