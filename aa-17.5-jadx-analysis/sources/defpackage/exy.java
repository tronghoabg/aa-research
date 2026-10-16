package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class exy extends lt {
    public List a;
    private final PreferenceGroup e;
    private List f;
    private final List g;
    private final Runnable i = new elt(this, 8, null);
    private final Handler h = new Handler(Looper.getMainLooper());

    public exy(PreferenceGroup preferenceGroup) {
        this.e = preferenceGroup;
        preferenceGroup.I = this;
        this.f = new ArrayList();
        this.a = new ArrayList();
        this.g = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            p(((PreferenceScreen) preferenceGroup).d);
        } else {
            p(true);
        }
        c();
    }

    private final List t(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iK = preferenceGroup.k();
        int i = 0;
        for (int i2 = 0; i2 < iK; i2++) {
            Preference preferenceO = preferenceGroup.o(i2);
            if (preferenceO.z) {
                if (!v(preferenceGroup) || i < preferenceGroup.c) {
                    arrayList.add(preferenceO);
                } else {
                    arrayList2.add(preferenceO);
                }
                if (preferenceO instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceO;
                    if (!preferenceGroup2.W()) {
                        continue;
                    } else {
                        if (v(preferenceGroup) && v(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : t(preferenceGroup2)) {
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
            exg exgVar = new exg(preferenceGroup.j, arrayList2, preferenceGroup.eT());
            exgVar.o = new exw(this, preferenceGroup);
            arrayList.add(exgVar);
        }
        return arrayList;
    }

    private final void u(List list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.b);
        }
        int iK = preferenceGroup.k();
        for (int i = 0; i < iK; i++) {
            Preference preferenceO = preferenceGroup.o(i);
            list.add(preferenceO);
            exx exxVar = new exx(preferenceO);
            List list2 = this.g;
            if (!list2.contains(exxVar)) {
                list2.add(exxVar);
            }
            if (preferenceO instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceO;
                if (preferenceGroup2.W()) {
                    u(list, preferenceGroup2);
                }
            }
            preferenceO.I = this;
        }
    }

    private static final boolean v(PreferenceGroup preferenceGroup) {
        return preferenceGroup.c != Integer.MAX_VALUE;
    }

    @Override // defpackage.lt
    public final int a() {
        return this.a.size();
    }

    public final Preference b(int i) {
        if (i < 0 || i >= a()) {
            return null;
        }
        return (Preference) this.a.get(i);
    }

    public final void c() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).I = null;
        }
        ArrayList arrayList = new ArrayList(this.f.size());
        this.f = arrayList;
        PreferenceGroup preferenceGroup = this.e;
        u(arrayList, preferenceGroup);
        this.a = t(preferenceGroup);
        eyd eydVar = preferenceGroup.k;
        g();
        for (Preference preference : this.f) {
        }
    }

    @Override // defpackage.lt
    public final int d(int i) {
        exx exxVar = new exx(b(i));
        List list = this.g;
        int iIndexOf = list.indexOf(exxVar);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = list.size();
        list.add(exxVar);
        return size;
    }

    @Override // defpackage.lt
    public final long e(int i) {
        if (this.c) {
            return b(i).eT();
        }
        return -1L;
    }

    @Override // defpackage.lt
    public final /* bridge */ /* synthetic */ mo f(ViewGroup viewGroup, int i) {
        exx exxVar = (exx) this.g.get(i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, eyh.a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = ca.e(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(exxVar.a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            viewInflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = exxVar.b;
            if (i2 != 0) {
                layoutInflaterFrom.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new eyg(viewInflate);
    }

    @Override // defpackage.lt
    public final /* bridge */ /* synthetic */ void n(mo moVar, int i) {
        eyg eygVar = (eyg) moVar;
        View view = eygVar.a;
        Preference preferenceB = b(i);
        Drawable background = view.getBackground();
        Drawable drawable = eygVar.s;
        if (background != drawable) {
            view.setBackground(drawable);
        }
        TextView textView = (TextView) eygVar.E(R.id.title);
        if (textView != null && eygVar.t != null && !textView.getTextColors().equals(eygVar.t)) {
            textView.setTextColor(eygVar.t);
        }
        preferenceB.a(eygVar);
    }

    public final void s() {
        Handler handler = this.h;
        Runnable runnable = this.i;
        handler.removeCallbacks(runnable);
        handler.post(runnable);
    }
}
