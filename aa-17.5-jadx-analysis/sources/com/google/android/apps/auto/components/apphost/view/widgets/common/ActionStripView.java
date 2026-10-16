package com.google.android.apps.auto.components.apphost.view.widgets.common;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import com.google.android.projection.gearhead.R;
import defpackage.acjs;
import defpackage.ajju;
import defpackage.eow;
import defpackage.fvp;
import defpackage.gdp;
import defpackage.gdq;
import defpackage.geb;
import defpackage.geu;
import defpackage.gev;
import defpackage.ghu;
import defpackage.gly;
import defpackage.gmh;
import defpackage.hig;
import defpackage.kbs;
import defpackage.kcj;
import defpackage.kdb;
import defpackage.kdc;
import defpackage.kdf;
import defpackage.kdv;
import defpackage.yeb;
import defpackage.yfq;
import defpackage.yls;
import defpackage.ype;
import defpackage.yph;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class ActionStripView extends FrameLayout implements fvp {
    public static final yph a = yph.c("CarApp.H.Tem");
    public static final long b;
    public LinearLayout c;
    public int d;
    public kcj e;
    private final Handler f;
    private boolean g;
    private LinearLayout h;
    private final boolean i;
    private final int j;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        b = 10000L;
    }

    public ActionStripView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f = new Handler(new gly(this, 6));
        this.g = true;
        this.d = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kdv.c, i, i2);
        this.j = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.i = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final int i() {
        List listJ = j();
        for (int i = 0; i < listJ.size(); i++) {
            if (((View) listJ.get(i)).isFocused()) {
                return i;
            }
        }
        return -1;
    }

    private final List j() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(l());
        arrayList.addAll(k());
        return arrayList;
    }

    private final List k() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.c.getChildCount(); i++) {
            arrayList.add(this.c.getChildAt(i));
        }
        return arrayList;
    }

    private final List l() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.h.getChildCount(); i++) {
            arrayList.add(this.h.getChildAt(i));
        }
        return arrayList;
    }

    private final void m(geu geuVar, LinearLayout linearLayout, List list, boolean z) {
        if (z) {
            linearLayout.removeAllViews();
        }
        int iMax = Math.max(linearLayout.getChildCount(), list.size());
        int i = 0;
        int i2 = 0;
        while (i < iMax) {
            kdf kdfVar = (kdf) linearLayout.getChildAt(i - i2);
            kdf kdfVar2 = i < list.size() ? (kdf) list.get(i) : null;
            if (kdfVar == null && kdfVar2 != null) {
                linearLayout.addView(kdfVar2);
            } else if (kdfVar2 == null) {
                linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
                i2++;
            } else {
                boolean z2 = this.i;
                hig higVar = kdfVar2.b;
                kdfVar.a(geuVar, higVar, z2, o(higVar));
            }
            i++;
        }
    }

    private static final void n(LinearLayout linearLayout) {
        if (linearLayout.getOrientation() != 1) {
            for (int i = 1; i < linearLayout.getChildCount(); i++) {
                ((kdf) linearLayout.getChildAt(i)).setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
            }
        }
    }

    private static final boolean o(hig higVar) {
        return (((Action) higVar.b).getFlags() & 1) != 0;
    }

    public final void a(boolean z) {
        if (this.g == z) {
            return;
        }
        this.g = z;
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        if (z && !j().isEmpty()) {
            z2 = true;
        }
        int i = z2 ? R.anim.fab_view_animation_fade_in : R.anim.fab_view_animation_fade_out;
        List<View> listJ = j();
        for (View view : listJ) {
            if (!((kdf) view).a) {
                Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(getContext(), i);
                animatorLoadAnimator.setTarget(view);
                arrayList.add(animatorLoadAnimator);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(new eow());
        animatorSet.addListener(new kdc(this, z2, listJ));
        gev.c(new kbs(animatorSet, 19));
    }

    public final void b(geu geuVar, ActionStrip actionStrip, ghu ghuVar, boolean z, boolean z2) throws kdb {
        h(geuVar, actionStrip == null ? null : new ajju(actionStrip).r(), ghuVar, z, z2);
    }

    public final void c(boolean z) {
        this.f.removeMessages(1);
        a(z);
    }

    public final void d(boolean z) {
        for (View view : j()) {
            boolean z2 = true;
            if (!((kdf) view).a && !z) {
                z2 = false;
            }
            view.setClickable(z2);
        }
    }

    public final void e(boolean z) {
        yeb yebVarA = yeb.a(l(), k());
        boolean zHasNext = yebVarA.iterator().hasNext();
        Iterator it = yebVarA.iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            kdf kdfVar = (kdf) ((View) it.next());
            if (z || kdfVar.a) {
                kdfVar.setVisibility(0);
                z2 = false;
            } else {
                kdfVar.setVisibility(4);
            }
        }
        if (!zHasNext) {
            setVisibility(8);
        } else if (z2) {
            setVisibility(4);
        } else {
            setVisibility(0);
        }
    }

    public final void f() {
        this.d = i();
    }

    public final void g(long j) {
        Handler handler = this.f;
        handler.removeMessages(1);
        Message messageObtainMessage = handler.obtainMessage(1);
        messageObtainMessage.obj = false;
        handler.sendMessageDelayed(messageObtainMessage, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.List] */
    public final void h(geu geuVar, acjs acjsVar, ghu ghuVar, boolean z, boolean z2) throws kdb {
        ?? r0;
        ComponentName componentName = ((gmh) geuVar.d()).a;
        try {
            if (acjsVar == null) {
                int i = yfq.d;
                r0 = yls.a;
            } else {
                r0 = acjsVar.b;
            }
            Set set = ghuVar.g;
            if (!set.isEmpty()) {
                HashSet hashSet = new HashSet(set);
                Iterator it = r0.iterator();
                while (it.hasNext()) {
                    hashSet.remove(Integer.valueOf(((Action) ((hig) it.next()).b).getType()));
                }
                if (!hashSet.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        sb.append(Action.typeToString(((Integer) it2.next()).intValue()));
                        sb.append(";");
                    }
                    throw new kdb("Missing required action types: ".concat(sb.toString()));
                }
            }
        } catch (kdb e) {
            geb gebVarF = geuVar.f();
            gdp gdpVar = new gdp();
            gdpVar.a = e;
            gebVarF.a(new gdq(gdpVar));
        }
        if (acjsVar == null) {
            setVisibility(8);
            return;
        }
        int i2 = acjsVar.a;
        if (i2 == -1) {
            i2 = i();
        }
        int i3 = ghuVar.e;
        int i4 = ghuVar.f;
        ?? r12 = acjsVar.b;
        ArrayList arrayList = new ArrayList();
        Iterator it3 = r12.iterator();
        int i5 = i4;
        int i6 = i3;
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            hig higVar = (hig) it3.next();
            CarText title = ((Action) higVar.b).getTitle();
            if (title != null && !title.isEmpty() && i5 - 1 < 0) {
                ((ype) ((ype) a.h()).ai((char) 2919)).w("Dropping actions in action strip over max custom title limit of %d", i4);
                break;
            }
            i6--;
            if (i6 < 0) {
                ((ype) ((ype) a.h()).ai((char) 2918)).w("Dropping actions in action strip over max limit of %d", i3);
                break;
            }
            arrayList.add(higVar);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int iMax = z ? Math.max(arrayList.size() - 2, 0) : 0;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            hig higVar2 = (hig) arrayList.get(size);
            kdf kdfVar = new kdf(getContext(), this.j);
            (size >= iMax ? arrayList2 : arrayList3).add(0, kdfVar);
            kdfVar.a(geuVar, higVar2, this.i, o(higVar2));
            size--;
        }
        m(geuVar, this.c, arrayList2, z2);
        m(geuVar, this.h, arrayList3, z2);
        n(this.c);
        n(this.h);
        List listJ = j();
        int size2 = listJ.size();
        if (size2 <= 0) {
            setVisibility(8);
            return;
        }
        if (i2 >= 0) {
            int iMin = Math.min(i2, size2 - 1);
            ((View) listJ.get(iMin)).requestFocus();
            this.d = iMin;
        } else {
            int i7 = this.d;
            if (i7 != -1 && i7 >= arrayList.size()) {
                int size3 = arrayList.size() - 1;
                this.d = size3;
                if (size3 < 0) {
                    this.d = -1;
                }
            }
        }
        LinearLayout linearLayout = this.c;
        linearLayout.setVisibility(linearLayout.getChildCount() > 0 ? 0 : 8);
        LinearLayout linearLayout2 = this.h;
        linearLayout2.setVisibility(linearLayout2.getChildCount() > 0 ? 0 : 8);
        e(this.g);
        d(this.g);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.c = (LinearLayout) findViewById(R.id.action_strip_container);
        this.h = (LinearLayout) findViewById(R.id.action_strip_container_secondary);
    }

    public ActionStripView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionStripView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ActionStripView(Context context) {
        this(context, null);
    }
}
