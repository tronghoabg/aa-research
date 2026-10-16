package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bh implements android.view.LayoutInflater.Factory2 {
    public final defpackage.bt a;

    public bh(defpackage.bt btVar) {
        this.a = btVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ay */
    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) throws ay {
        defpackage.by byVarK;
        if (android.support.v4.app.FragmentContainerView.class.getName().equals(str)) {
            return new android.support.v4.app.FragmentContainerView(context, attributeSet, this.a);
        }
        if ("fragment".equals(str)) {
            java.lang.String attributeValue = attributeSet.getAttributeValue(null, "class");
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            java.lang.String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                java.lang.ClassLoader classLoader = context.getClassLoader();
                int i = defpackage.bf.a;
                try {
                    if (android.support.v4.app.Fragment.class.isAssignableFrom(defpackage.bf.b(classLoader, attributeValue))) {
                        int id = view != null ? view.getId() : 0;
                        if (id == -1) {
                            if (resourceId != -1) {
                                id = -1;
                            } else {
                                if (string == null) {
                                    throw new java.lang.IllegalArgumentException(defpackage.a.bw(attributeValue, attributeSet, ": Must specify unique android:id, android:tag, or have a parent with an id for "));
                                }
                                id = -1;
                                resourceId = -1;
                            }
                        }
                        android.support.v4.app.Fragment fragmentE = resourceId != -1 ? this.a.e(resourceId) : null;
                        if (fragmentE == null && string != null) {
                            fragmentE = this.a.f(string);
                        }
                        if (fragmentE == null && id != -1) {
                            fragmentE = this.a.e(id);
                        }
                        if (fragmentE == null) {
                            defpackage.bt btVar = this.a;
                            android.support.v4.app.Fragment fragmentA = btVar.i().a(context.getClassLoader(), attributeValue);
                            fragmentA.mFromLayout = true;
                            fragmentA.mFragmentId = resourceId != 0 ? resourceId : id;
                            fragmentA.mContainerId = id;
                            fragmentA.mTag = string;
                            fragmentA.mInLayout = true;
                            fragmentA.mFragmentManager = btVar;
                            fragmentA.mHost = btVar.m;
                            fragmentA.onInflate(btVar.m.c, attributeSet, fragmentA.mSavedFragmentState);
                            byVarK = btVar.j(fragmentA);
                            if (defpackage.bt.ac(2)) {
                                android.util.Log.v("FragmentManager", "Fragment " + fragmentA + " has been inflated via the <fragment> tag: id=0x" + java.lang.Integer.toHexString(resourceId));
                            }
                            fragmentE = fragmentA;
                        } else {
                            if (fragmentE.mInLayout) {
                                throw new java.lang.IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + java.lang.Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + java.lang.Integer.toHexString(id) + " with another fragment for " + attributeValue);
                            }
                            fragmentE.mInLayout = true;
                            defpackage.bt btVar2 = this.a;
                            fragmentE.mFragmentManager = btVar2;
                            fragmentE.mHost = btVar2.m;
                            fragmentE.onInflate(btVar2.m.c, attributeSet, fragmentE.mSavedFragmentState);
                            byVarK = btVar2.k(fragmentE);
                            if (defpackage.bt.ac(2)) {
                                android.util.Log.v("FragmentManager", "Retained Fragment " + fragmentE + " has been re-attached via the <fragment> tag: id=0x" + java.lang.Integer.toHexString(resourceId));
                            }
                        }
                        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                        int i2 = defpackage.enp.a;
                        fragmentE.getClass();
                        defpackage.enq enqVar = new defpackage.enq(fragmentE, viewGroup);
                        defpackage.enp.d(enqVar);
                        defpackage.eno enoVarB = defpackage.enp.b(fragmentE);
                        if (enoVarB.b.contains(defpackage.enn.d) && defpackage.enp.e(enoVarB, fragmentE.getClass(), enqVar.getClass())) {
                            defpackage.enp.c(enoVarB, enqVar);
                        }
                        fragmentE.mContainer = viewGroup;
                        byVarK.e();
                        byVarK.d();
                        android.view.View view2 = fragmentE.mView;
                        if (view2 == null) {
                            throw new java.lang.IllegalStateException(defpackage.a.bp(attributeValue, "Fragment ", " did not create a view."));
                        }
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (fragmentE.mView.getTag() == null) {
                            fragmentE.mView.setTag(string);
                        }
                        fragmentE.mView.addOnAttachStateChangeListener(new eei(this, byVarK, 1));
                        return fragmentE.mView;
                    }
                } catch (java.lang.ClassNotFoundException unused) {
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
