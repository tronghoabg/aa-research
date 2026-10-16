package android.support.v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentStrictMode;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class bc implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    final bv f168a;

    bc(bv bvVar) {
        this.f168a = bvVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        cd cdVarS;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f168a);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, android.support.b.a.f73a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null && az.c(context.getClassLoader(), attributeValue)) {
                int id = view != null ? view.getId() : 0;
                if (id == -1) {
                    if (resourceId != -1) {
                        id = -1;
                    } else {
                        if (string == null) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                        }
                        id = -1;
                        resourceId = -1;
                    }
                }
                ar arVarG = resourceId != -1 ? this.f168a.g(resourceId) : null;
                if (arVarG == null && string != null) {
                    arVarG = this.f168a.h(string);
                }
                if (arVarG == null && id != -1) {
                    arVarG = this.f168a.g(id);
                }
                if (arVarG == null) {
                    bv bvVar = this.f168a;
                    ar arVarA = bvVar.o().a(context.getClassLoader(), attributeValue);
                    arVarA.mFromLayout = true;
                    arVarA.mFragmentId = resourceId != 0 ? resourceId : id;
                    arVarA.mContainerId = id;
                    arVarA.mTag = string;
                    arVarA.mInLayout = true;
                    arVarA.mFragmentManager = bvVar;
                    arVarA.mHost = bvVar.p();
                    arVarA.onInflate(bvVar.p().i(), attributeSet, arVarA.mSavedFragmentState);
                    cdVarS = bvVar.r(arVarA);
                    if (bv.aM(2)) {
                        Log.v("FragmentManager", "Fragment " + arVarA + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                    arVarG = arVarA;
                } else {
                    if (arVarG.mInLayout) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    arVarG.mInLayout = true;
                    bv bvVar2 = this.f168a;
                    arVarG.mFragmentManager = bvVar2;
                    arVarG.mHost = bvVar2.p();
                    arVarG.onInflate(bvVar2.p().i(), attributeSet, arVarG.mSavedFragmentState);
                    cdVarS = bvVar2.s(arVarG);
                    if (bv.aM(2)) {
                        Log.v("FragmentManager", "Retained Fragment " + arVarG + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                FragmentStrictMode.onFragmentTagUsage(arVarG, viewGroup);
                arVarG.mContainer = viewGroup;
                cdVarS.g();
                cdVarS.f();
                View view2 = arVarG.mView;
                if (view2 == null) {
                    throw new IllegalStateException(k.g(attributeValue, "Fragment ", " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (arVarG.mView.getTag() == null) {
                    arVarG.mView.setTag(string);
                }
                arVarG.mView.addOnAttachStateChangeListener(new bb(this, cdVarS));
                return arVarG.mView;
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
