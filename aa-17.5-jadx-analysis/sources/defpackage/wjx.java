package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.libraries.surveys.internal.model.Answer;
import com.google.android.libraries.surveys.internal.view.SurveyViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class wjx {
    public static yfy a;
    public abyn b;
    public abzc c;
    public SurveyViewPager d;
    public Answer e;
    public ScrollView g;
    public MaterialCardView h;
    public LinearLayout i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public Integer r;
    public boolean s;
    public whc t;
    public final Activity u;
    public final wjy v;
    public final bt w;
    public zre x;
    public Bundle f = new Bundle();
    public final Handler p = new Handler();
    public final Runnable q = new wil(this, 4);

    public wjx(Activity activity, bt btVar, wjy wjyVar) {
        this.u = activity;
        this.w = btVar;
        this.v = wjyVar;
    }

    private final void q() {
        if (this.d.y() || !wox.q(a(), this.b, this.e)) {
            t();
        } else {
            s(this.d.c + 1);
        }
    }

    private final void r(ViewGroup viewGroup, boolean z) {
        viewGroup.setEnabled(z);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                r((ViewGroup) childAt, z);
            } else if (childAt.getId() == R.id.survey_next && z) {
                b(R.id.survey_next).setEnabled(this.k);
            } else {
                childAt.setEnabled(z);
            }
        }
    }

    private final void s(int i) {
        wox woxVar = wia.c;
        if (wia.b(adhz.d(wia.b))) {
            j(m());
        }
        h();
        o(5);
        this.d.v(i);
        l();
        k();
        this.d.s().getView().sendAccessibilityEvent(32);
        long j = wid.a;
    }

    private final void t() {
        long j = wid.a;
        o(5);
        this.j = true;
        i(false);
        Intent intent = new Intent();
        Activity activity = this.u;
        activity.setResult(-1, intent);
        wox woxVar = wia.c;
        if (!wia.c(adic.c(wia.b))) {
            this.d.u();
            return;
        }
        if (this.t == whc.a) {
            this.d.u();
            return;
        }
        this.h.setVisibility(8);
        whc whcVar = this.t;
        if (whcVar != whc.b) {
            if (whcVar == whc.c) {
                Log.v("SurveyActivityImpl", "Silent SurveyCompletionStyle, client apps will display their own completion dialog if need");
                activity.finish();
                return;
            }
            return;
        }
        View viewFindViewById = activity.getWindow().findViewById(android.R.id.content);
        abxu abxuVar = this.b.d;
        if (abxuVar == null) {
            abxuVar = abxu.b;
        }
        Snackbar.l(viewFindViewById, abxuVar.c, -1).f();
        e();
    }

    public final int a() {
        SurveyViewPager surveyViewPager = this.d;
        if (surveyViewPager == null) {
            return 0;
        }
        int i = surveyViewPager.c;
        return wia.a() ? i + this.l : this.s ? i + 1 : i;
    }

    public final View b(int i) {
        return this.u.findViewById(i);
    }

    public final whn c() {
        String stringExtra = this.u.getIntent().getStringExtra("TriggerId");
        abzc abzcVar = this.c;
        if (abzcVar == null || stringExtra == null) {
            long j = wid.a;
            return null;
        }
        sb sbVar = new sb((byte[]) null);
        sbVar.o(abzcVar.b);
        sbVar.q(stringExtra);
        sbVar.p(who.b);
        return sbVar.n();
    }

    public final abye d() {
        return this.e.a;
    }

    public final void e() {
        this.u.setResult(-1, new Intent());
        this.p.postDelayed(this.q, 2400L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        int iAx;
        int iAx2;
        int iAx3;
        SurveyViewPager surveyViewPager = this.d;
        if (surveyViewPager != null && surveyViewPager.x()) {
            abyj abyjVar = this.b.c;
            if (abyjVar == null) {
                abyjVar = abyj.a;
            }
            if (!abyjVar.b) {
                o(3);
            }
        }
        wid.h(this.i);
        p();
        whn whnVarC = c();
        if (whnVarC != null) {
            int iAx4 = a.ax(((abyt) this.b.g.get(a())).i);
            if (iAx4 == 0) {
                iAx4 = 1;
            }
            int i = iAx4 - 2;
            if (i == 1) {
                abye abyeVarT = this.d.t();
                abyc abycVar = (abyeVarT.b == 2 ? (abyd) abyeVarT.c : abyd.a).c;
                if (abycVar == null) {
                    abycVar = abyc.a;
                }
                int i2 = abycVar.c;
                ykd.r(vuf.h, whnVarC);
            } else if (i == 2) {
                ArrayList arrayList = new ArrayList();
                abye abyeVarT2 = this.d.t();
                Iterator<E> it = (abyeVarT2.b == 3 ? (abxz) abyeVarT2.c : abxz.a).b.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((abyc) it.next()).c - 1));
                }
                ykd ykdVar = vuf.h;
                yfq.o(arrayList);
                ykd.r(ykdVar, whnVarC);
            } else if (i == 3) {
                abye abyeVarT3 = this.d.t();
                abyc abycVar2 = (abyeVarT3.b == 4 ? (abyb) abyeVarT3.c : abyb.a).c;
                if (abycVar2 == null) {
                    abycVar2 = abyc.a;
                }
                int i3 = abycVar2.c;
                ykd.r(vuf.h, whnVarC);
            } else if (i == 4) {
                ykd.r(vuf.h, whnVarC);
            }
        }
        wox woxVar = wia.c;
        if (!wia.b(adhz.d(wia.b))) {
            abyt abytVar = (abyt) this.b.g.get(a());
            if (m() && (iAx3 = a.ax(abytVar.i)) != 0 && iAx3 == 5) {
                j(true);
            }
        }
        abye abyeVarT4 = this.d.t();
        if (abyeVarT4 != null) {
            this.e.a = abyeVarT4;
        }
        if (!wia.a()) {
            q();
            return;
        }
        SurveyViewPager surveyViewPager2 = this.d;
        if (surveyViewPager2 == null) {
            q();
            return;
        }
        abyt abytVar2 = surveyViewPager2.s().a;
        abys abysVar = abytVar2.k;
        if (abysVar == null) {
            abysVar = abys.a;
        }
        if ((abysVar.b & 1) != 0) {
            abys abysVar2 = abytVar2.k;
            if (abysVar2 == null) {
                abysVar2 = abys.a;
            }
            abxn abxnVar = abysVar2.d;
            if (abxnVar == null) {
                abxnVar = abxn.a;
            }
            int iAz = a.az(abxnVar.b);
            if (iAz != 0 && iAz == 5) {
                t();
                return;
            }
        }
        wox woxVar2 = wia.c;
        if (wia.c(adhb.d(wia.b)) && (iAx2 = a.ax(abytVar2.i)) != 0 && iAx2 == 5) {
            abye abyeVarT5 = this.d.t();
            abyc abycVar3 = (abyeVarT5.b == 4 ? (abyb) abyeVarT5.c : abyb.a).c;
            if (abycVar3 == null) {
                abycVar3 = abyc.a;
            }
            int iF = new uk(null, null, null).f(a, this.b.g.size(), abycVar3.c, abytVar2);
            if (iF == -1) {
                q();
                return;
            } else if (iF - 1 == this.b.g.size()) {
                t();
                return;
            } else {
                fhy fhyVar = this.d.b;
                s(fhyVar != null ? ((wkd) fhyVar).h(iF) : 0);
                return;
            }
        }
        wox woxVar3 = wia.c;
        if (!wia.c(adhb.c(wia.b)) || (iAx = a.ax(abytVar2.i)) == 0 || iAx != 3) {
            q();
            return;
        }
        abxl abxlVar = abxl.a;
        abxm abxmVar = (abytVar2.c == 4 ? (abzd) abytVar2.d : abzd.a).c;
        if (abxmVar == null) {
            abxmVar = abxm.a;
        }
        Iterator<E> it2 = abxmVar.b.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            abxl abxlVar2 = (abxl) it2.next();
            int i4 = abxlVar2.d;
            abye abyeVarT6 = this.d.t();
            abyc abycVar4 = (abyeVarT6.b == 2 ? (abyd) abyeVarT6.c : abyd.a).c;
            if (abycVar4 == null) {
                abycVar4 = abyc.a;
            }
            if (i4 == abycVar4.c) {
                abxlVar = abxlVar2;
                break;
            }
        }
        if (((abytVar2.c == 4 ? (abzd) abytVar2.d : abzd.a).b & 1) == 0 || (abxlVar.b & 1) == 0) {
            q();
            return;
        }
        abxn abxnVar2 = abxlVar.g;
        if (abxnVar2 == null) {
            abxnVar2 = abxn.a;
        }
        int iAz2 = a.az(abxnVar2.b);
        int i5 = (iAz2 != 0 ? iAz2 : 1) - 2;
        if (i5 != 2) {
            if (i5 != 3) {
                q();
                return;
            } else {
                t();
                return;
            }
        }
        abxn abxnVar3 = abxlVar.g;
        if (abxnVar3 == null) {
            abxnVar3 = abxn.a;
        }
        String str = abxnVar3.c;
        fhy fhyVar2 = this.d.b;
        if (fhyVar2 != null && a.containsKey(str)) {
            iH = ((wkd) fhyVar2).h(((Integer) a.get(str)).intValue());
        }
        s(iH);
    }

    public final void g(boolean z) {
        this.i.setDescendantFocusability(true != z ? 262144 : 393216);
        this.i.setAlpha(true != z ? 1.0f : 0.4f);
        if (z) {
            this.k = b(R.id.survey_next).isEnabled();
        }
        r(this.i, !z);
    }

    public final void h() {
        int iAc = wox.ac(d().b);
        if (iAc == 0) {
            throw null;
        }
        if (iAc == 1) {
            Bundle bundle = this.f;
            String strValueOf = String.valueOf(d().d);
            abye abyeVarD = d();
            abyc abycVar = (abyeVarD.b == 2 ? (abyd) abyeVarD.c : abyd.a).c;
            if (abycVar == null) {
                abycVar = abyc.a;
            }
            bundle.putString(strValueOf, abycVar.d);
        }
    }

    public final void i(boolean z) {
        MaterialButton materialButton = (MaterialButton) b(R.id.survey_next);
        if (materialButton != null && materialButton.isEnabled() != z) {
            materialButton.setEnabled(z);
        }
        this.k = z;
    }

    public final void j(boolean z) {
        MaterialButton materialButton = (MaterialButton) b(R.id.survey_next);
        if (materialButton != null) {
            materialButton.setVisibility(true != z ? 8 : 0);
        }
    }

    public final void k() {
        MaterialButton materialButton = (MaterialButton) b(R.id.survey_next);
        if (materialButton == null || !this.d.y() || this.m) {
            return;
        }
        materialButton.setText(R.string.survey_submit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l() {
        SurveyViewPager surveyViewPager = this.d;
        if (surveyViewPager == null || !surveyViewPager.z()) {
            abyt abytVar = (abyt) this.b.g.get(a());
            String str = abytVar.g.isEmpty() ? abytVar.f : abytVar.g;
            int size = abytVar.h.size();
            String[] strArr = new String[size];
            String[] strArr2 = new String[size];
            for (int i = 0; i < size; i++) {
                abzf abzfVar = (abzf) abytVar.h.get(i);
                int i2 = abzfVar.b;
                if (wox.ab(i2) == 3) {
                    int i3 = (i2 == 2 ? (abze) abzfVar.c : abze.a).b;
                    String string = this.f.getString(String.valueOf(i3));
                    if (string != null) {
                        strArr[i] = abzfVar.d;
                        strArr2[i] = string;
                    } else {
                        Log.e("SurveyActivityImpl", a.bn(i3, "No single-select question with ordinal ", " was found."));
                    }
                }
            }
            this.d.w(TextUtils.replace(str, strArr, strArr2).toString());
        }
    }

    public final boolean m() {
        return wid.n(this.b);
    }

    public final boolean n(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = new Rect();
            this.h.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && this.j) {
                long j = wid.a;
                this.u.finish();
                return true;
            }
        }
        wox woxVar = wia.c;
        Activity activity = this.u;
        if (adhn.c(activity)) {
            return false;
        }
        return activity.onTouchEvent(motionEvent);
    }

    public final void o(int i) {
        Answer answer = this.e;
        answer.g = i;
        this.x.h(answer, wid.l(this.b));
    }

    public final void p() {
        b(R.id.survey_controls_divider).setVisibility(8);
        b(R.id.survey_controls_legal_text).setVisibility(8);
    }
}
