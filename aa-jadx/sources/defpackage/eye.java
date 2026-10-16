package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eye extends defpackage.lw {
    public java.util.List a;
    private final androidx.preference.PreferenceGroup e;
    private java.util.List f;
    private final java.util.List g;
    private final java.lang.Runnable i = new defpackage.eaw(this, 13, null);
    private final android.os.Handler h = new android.os.Handler(android.os.Looper.getMainLooper());

    public eye(androidx.preference.PreferenceGroup preferenceGroup) {
        this.e = preferenceGroup;
        preferenceGroup.I = this;
        this.f = new java.util.ArrayList();
        this.a = new java.util.ArrayList();
        this.g = new java.util.ArrayList();
        if (preferenceGroup instanceof androidx.preference.PreferenceScreen) {
            p(((androidx.preference.PreferenceScreen) preferenceGroup).d);
        } else {
            p(true);
        }
        c();
    }

    private final java.util.List t(androidx.preference.PreferenceGroup preferenceGroup) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int iK = preferenceGroup.k();
        int i = 0;
        for (int i2 = 0; i2 < iK; i2++) {
            androidx.preference.Preference preferenceO = preferenceGroup.o(i2);
            if (preferenceO.z) {
                if (!v(preferenceGroup) || i < preferenceGroup.c) {
                    arrayList.add(preferenceO);
                } else {
                    arrayList2.add(preferenceO);
                }
                if (preferenceO instanceof androidx.preference.PreferenceGroup) {
                    androidx.preference.PreferenceGroup preferenceGroup2 = (androidx.preference.PreferenceGroup) preferenceO;
                    if (!preferenceGroup2.W()) {
                        continue;
                    } else {
                        if (v(preferenceGroup) && v(preferenceGroup2)) {
                            throw new java.lang.IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (androidx.preference.Preference preference : t(preferenceGroup2)) {
                            if (!v(preferenceGroup) || i < preferenceGroup.c) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (v(preferenceGroup) && i > preferenceGroup.c) {
            defpackage.exm exmVar = new defpackage.exm(preferenceGroup.j, arrayList2, preferenceGroup.eb());
            exmVar.o = new defpackage.eyc(this, preferenceGroup);
            arrayList.add(exmVar);
        }
        return arrayList;
    }

    private final void u(java.util.List list, androidx.preference.PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            java.util.Collections.sort(preferenceGroup.b);
        }
        int iK = preferenceGroup.k();
        for (int i = 0; i < iK; i++) {
            androidx.preference.Preference preferenceO = preferenceGroup.o(i);
            list.add(preferenceO);
            defpackage.eyd eydVar = new defpackage.eyd(preferenceO);
            java.util.List list2 = this.g;
            if (!list2.contains(eydVar)) {
                list2.add(eydVar);
            }
            if (preferenceO instanceof androidx.preference.PreferenceGroup) {
                androidx.preference.PreferenceGroup preferenceGroup2 = (androidx.preference.PreferenceGroup) preferenceO;
                if (preferenceGroup2.W()) {
                    u(list, preferenceGroup2);
                }
            }
            preferenceO.I = this;
        }
    }

    private static final boolean v(androidx.preference.PreferenceGroup preferenceGroup) {
        return preferenceGroup.c != Integer.MAX_VALUE;
    }

    @Override // defpackage.lw
    public final int a() {
        return this.a.size();
    }

    public final androidx.preference.Preference b(int i) {
        if (i < 0 || i >= a()) {
            return null;
        }
        return (androidx.preference.Preference) this.a.get(i);
    }

    public final void c() {
        java.util.Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((androidx.preference.Preference) it.next()).I = null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f.size());
        this.f = arrayList;
        androidx.preference.PreferenceGroup preferenceGroup = this.e;
        u(arrayList, preferenceGroup);
        this.a = t(preferenceGroup);
        defpackage.eyj eyjVar = preferenceGroup.k;
        g();
        for (androidx.preference.Preference preference : this.f) {
        }
    }

    @Override // defpackage.lw
    public final int d(int i) {
        defpackage.eyd eydVar = new defpackage.eyd(b(i));
        java.util.List list = this.g;
        int iIndexOf = list.indexOf(eydVar);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = list.size();
        list.add(eydVar);
        return size;
    }

    @Override // defpackage.lw
    public final long e(int i) {
        if (this.c) {
            return b(i).eb();
        }
        return -1L;
    }

    @Override // defpackage.lw
    public final /* bridge */ /* synthetic */ defpackage.mr f(android.view.ViewGroup viewGroup, int i) {
        defpackage.eyd eydVar = (defpackage.eyd) this.g.get(i);
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(viewGroup.getContext());
        android.content.res.TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((android.util.AttributeSet) null, defpackage.eyn.a);
        android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = defpackage.ca.e(viewGroup.getContext(), android.R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        android.view.View viewInflate = layoutInflaterFrom.inflate(eydVar.a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            viewInflate.setBackground(drawable);
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) viewInflate.findViewById(android.R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = eydVar.b;
            if (i2 != 0) {
                layoutInflaterFrom.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new defpackage.eym(viewInflate);
    }

    @Override // defpackage.lw
    public final /* bridge */ /* synthetic */ void n(defpackage.mr mrVar, int i) {
        defpackage.eym eymVar = (defpackage.eym) mrVar;
        android.view.View view = eymVar.a;
        androidx.preference.Preference preferenceB = b(i);
        android.graphics.drawable.Drawable background = view.getBackground();
        android.graphics.drawable.Drawable drawable = eymVar.s;
        if (background != drawable) {
            view.setBackground(drawable);
        }
        android.widget.TextView textView = (android.widget.TextView) eymVar.E(android.R.id.title);
        if (textView != null && eymVar.t != null && !textView.getTextColors().equals(eymVar.t)) {
            textView.setTextColor(eymVar.t);
        }
        preferenceB.a(eymVar);
    }

    public final void s() {
        android.os.Handler handler = this.h;
        java.lang.Runnable runnable = this.i;
        handler.removeCallbacks(runnable);
        handler.post(runnable);
    }
}
