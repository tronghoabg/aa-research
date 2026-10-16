package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentContainerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class bh implements LayoutInflater.Factory2 {
    public final bt a;

    public bh(bt btVar) {
        this.a = btVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        by byVarK;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.a);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                ClassLoader classLoader = context.getClassLoader();
                int i = bf.a;
                try {
                    if (Fragment.class.isAssignableFrom(bf.b(classLoader, attributeValue))) {
                        int id = view != null ? view.getId() : 0;
                        if (id == -1) {
                            if (resourceId != -1) {
                                id = -1;
                            } else {
                                if (string == null) {
                                    throw new IllegalArgumentException(a.bx(attributeValue, attributeSet, ": Must specify unique android:id, android:tag, or have a parent with an id for "));
                                }
                                id = -1;
                                resourceId = -1;
                            }
                        }
                        Fragment fragmentE = resourceId != -1 ? this.a.e(resourceId) : null;
                        if (fragmentE == null && string != null) {
                            fragmentE = this.a.f(string);
                        }
                        if (fragmentE == null && id != -1) {
                            fragmentE = this.a.e(id);
                        }
                        if (fragmentE == null) {
                            bt btVar = this.a;
                            Fragment fragmentA = btVar.i().a(context.getClassLoader(), attributeValue);
                            fragmentA.mFromLayout = true;
                            fragmentA.mFragmentId = resourceId != 0 ? resourceId : id;
                            fragmentA.mContainerId = id;
                            fragmentA.mTag = string;
                            fragmentA.mInLayout = true;
                            fragmentA.mFragmentManager = btVar;
                            fragmentA.mHost = btVar.m;
                            fragmentA.onInflate(btVar.m.c, attributeSet, fragmentA.mSavedFragmentState);
                            byVarK = btVar.j(fragmentA);
                            if (bt.ac(2)) {
                                Log.v("FragmentManager", "Fragment " + fragmentA + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                            }
                            fragmentE = fragmentA;
                        } else {
                            if (fragmentE.mInLayout) {
                                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                            }
                            fragmentE.mInLayout = true;
                            bt btVar2 = this.a;
                            fragmentE.mFragmentManager = btVar2;
                            fragmentE.mHost = btVar2.m;
                            fragmentE.onInflate(btVar2.m.c, attributeSet, fragmentE.mSavedFragmentState);
                            byVarK = btVar2.k(fragmentE);
                            if (bt.ac(2)) {
                                Log.v("FragmentManager", "Retained Fragment " + fragmentE + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                            }
                        }
                        ViewGroup viewGroup = (ViewGroup) view;
                        int i2 = enj.a;
                        fragmentE.getClass();
                        enk enkVar = new enk(fragmentE, viewGroup);
                        enj.d(enkVar);
                        eni eniVarB = enj.b(fragmentE);
                        if (eniVarB.b.contains(enh.d) && enj.e(eniVarB, fragmentE.getClass(), enkVar.getClass())) {
                            enj.c(eniVarB, enkVar);
                        }
                        fragmentE.mContainer = viewGroup;
                        byVarK.e();
                        byVarK.d();
                        View view2 = fragmentE.mView;
                        if (view2 == null) {
                            throw new IllegalStateException(a.bq(attributeValue, "Fragment ", " did not create a view."));
                        }
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (fragmentE.mView.getTag() == null) {
                            fragmentE.mView.setTag(string);
                        }
                        fragmentE.mView.addOnAttachStateChangeListener(new eea(this, byVarK, 1));
                        return fragmentE.mView;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
