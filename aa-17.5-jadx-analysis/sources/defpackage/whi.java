package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.libraries.surveys.internal.model.Answer;
import com.google.android.libraries.surveys.internal.view.EmbeddedSurveyFragment;
import com.google.android.libraries.surveys.internal.view.SurveyViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class whi {
    public View a;
    public final Set b = new HashSet();
    public final abyn c;
    public final LayoutInflater d;
    public SurveyViewPager e;
    public final Answer f;
    public final Bundle g;
    public final MaterialCardView h;
    public final LinearLayout i;
    public boolean j;
    public final wkb k;
    public final wjy l;
    public final bt m;
    private yfy n;
    private final zre o;

    public whi(LayoutInflater layoutInflater, bt btVar, wjy wjyVar, wkb wkbVar) {
        this.a = layoutInflater.inflate(R.layout.survey_container, (ViewGroup) null, false);
        this.d = layoutInflater;
        this.m = btVar;
        abyn abynVar = wkbVar.a;
        this.c = abynVar;
        this.f = wkbVar.b;
        this.j = wkbVar.c;
        this.k = wkbVar;
        this.l = wjyVar;
        this.g = wkbVar.m;
        HashMap map = new HashMap();
        for (abyt abytVar : abynVar.g) {
            if ((abytVar.b & 1) != 0) {
                abys abysVar = abytVar.k;
                if (!map.containsKey((abysVar == null ? abys.a : abysVar).c)) {
                    abys abysVar2 = abytVar.k;
                    map.put((abysVar2 == null ? abys.a : abysVar2).c, Integer.valueOf(abytVar.e - 1));
                }
            }
        }
        this.n = yfy.j(map);
        this.o = new zre(a(), wkbVar.e, wkbVar.f);
        this.i = (LinearLayout) b(R.id.survey_container);
        this.h = (MaterialCardView) b(R.id.survey_overall_container);
    }

    private final void o() {
        if (this.e.y() || !wox.q(d(), this.c, this.f)) {
            q();
        } else {
            p(this.e.c + 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void p(int i) {
        wox woxVar = wia.c;
        if (wia.b(adhz.d(wia.b))) {
            j(l());
        }
        int iAc = wox.ac(f().b);
        if (iAc == 0) {
            throw null;
        }
        if (iAc == 1) {
            Bundle bundle = this.g;
            String strValueOf = String.valueOf(f().d);
            abye abyeVarF = f();
            abyc abycVar = (abyeVarF.b == 2 ? (abyd) abyeVarF.c : abyd.a).c;
            if (abycVar == null) {
                abycVar = abyc.a;
            }
            bundle.putString(strValueOf, abycVar.d);
        }
        m(5);
        this.e.v(i);
        SurveyViewPager surveyViewPager = this.e;
        if (surveyViewPager == null || !surveyViewPager.z()) {
            abyt abytVar = (abyt) this.c.g.get(d());
            String str = abytVar.g.isEmpty() ? abytVar.f : abytVar.g;
            int size = abytVar.h.size();
            String[] strArr = new String[size];
            String[] strArr2 = new String[size];
            for (int i2 = 0; i2 < size; i2++) {
                abzf abzfVar = (abzf) abytVar.h.get(i2);
                int i3 = abzfVar.b;
                if (wox.ab(i3) == 3) {
                    abze abzeVar = i3 == 2 ? (abze) abzfVar.c : abze.a;
                    Bundle bundle2 = this.g;
                    int i4 = abzeVar.b;
                    String string = bundle2.getString(String.valueOf(i4));
                    if (string != null) {
                        strArr[i2] = abzfVar.d;
                        strArr2[i2] = string;
                    } else {
                        Log.e("SurveyContainer", a.bn(i4, "No single-select question with ordinal ", " was found."));
                    }
                }
            }
            this.e.w(TextUtils.replace(str, strArr, strArr2).toString());
        }
        k();
        this.e.s().getView().sendAccessibilityEvent(32);
        long j = wid.a;
    }

    private final void q() {
        long j = wid.a;
        m(5);
        this.j = true;
        h(false);
        for (EmbeddedSurveyFragment embeddedSurveyFragment : c()) {
        }
        wox woxVar = wia.c;
        if (!wia.c(adic.c(wia.b))) {
            this.e.u();
            return;
        }
        if (this.k.i == whc.a) {
            this.e.u();
            return;
        }
        b(R.id.survey_main_scroll_view).setVisibility(8);
        for (EmbeddedSurveyFragment embeddedSurveyFragment2 : c()) {
            abxu abxuVar = this.c.d;
            if (abxuVar == null) {
                abxuVar = abxu.b;
            }
            Snackbar.l(embeddedSurveyFragment2.requireActivity().getWindow().findViewById(android.R.id.content), abxuVar.c, -1).f();
        }
    }

    public final Context a() {
        return this.a.getContext();
    }

    public final View b(int i) {
        return this.a.findViewById(i);
    }

    public final Set c() {
        return ygr.n(this.b);
    }

    public final int d() {
        SurveyViewPager surveyViewPager = this.e;
        if (surveyViewPager == null) {
            return 0;
        }
        int i = surveyViewPager.c;
        return wia.a() ? i + this.k.g : i;
    }

    public final whn e() {
        sb sbVar = new sb((byte[]) null);
        wkb wkbVar = this.k;
        sbVar.o(wkbVar.f.b);
        sbVar.q(wkbVar.e);
        sbVar.p(wkbVar.l);
        return sbVar.n();
    }

    public final abye f() {
        return this.f.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        int iAx;
        int iAx2;
        int iAx3;
        SurveyViewPager surveyViewPager = this.e;
        if (surveyViewPager != null && surveyViewPager.x()) {
            abyj abyjVar = this.c.c;
            if (abyjVar == null) {
                abyjVar = abyj.a;
            }
            if (!abyjVar.b) {
                m(3);
            }
        }
        wid.h(this.i);
        n();
        whn whnVarE = e();
        abyn abynVar = this.c;
        int iAx4 = a.ax(((abyt) abynVar.g.get(d())).i);
        if (iAx4 == 0) {
            iAx4 = 1;
        }
        int i = iAx4 - 2;
        if (i == 1) {
            abye abyeVarT = this.e.t();
            abyc abycVar = (abyeVarT.b == 2 ? (abyd) abyeVarT.c : abyd.a).c;
            if (abycVar == null) {
                abycVar = abyc.a;
            }
            int i2 = abycVar.c;
            ykd.r(vuf.h, whnVarE);
        } else if (i == 2) {
            ArrayList arrayList = new ArrayList();
            abye abyeVarT2 = this.e.t();
            Iterator<E> it = (abyeVarT2.b == 3 ? (abxz) abyeVarT2.c : abxz.a).b.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((abyc) it.next()).c - 1));
            }
            ykd ykdVar = vuf.h;
            yfq.o(arrayList);
            ykd.r(ykdVar, whnVarE);
        } else if (i == 3) {
            abye abyeVarT3 = this.e.t();
            abyc abycVar2 = (abyeVarT3.b == 4 ? (abyb) abyeVarT3.c : abyb.a).c;
            if (abycVar2 == null) {
                abycVar2 = abyc.a;
            }
            int i3 = abycVar2.c;
            ykd.r(vuf.h, whnVarE);
        } else if (i == 4) {
            ykd.r(vuf.h, whnVarE);
        }
        wox woxVar = wia.c;
        if (!wia.b(adhz.d(wia.b))) {
            abyt abytVar = (abyt) abynVar.g.get(d());
            if (l() && (iAx3 = a.ax(abytVar.i)) != 0 && iAx3 == 5) {
                j(true);
            }
        }
        abye abyeVarT4 = this.e.t();
        if (abyeVarT4 != null) {
            this.f.a = abyeVarT4;
        }
        if (!wia.a()) {
            o();
            return;
        }
        SurveyViewPager surveyViewPager2 = this.e;
        if (surveyViewPager2 == null) {
            o();
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
                q();
                return;
            }
        }
        wox woxVar2 = wia.c;
        if (wia.c(adhb.d(wia.b)) && (iAx2 = a.ax(abytVar2.i)) != 0 && iAx2 == 5) {
            abye abyeVarT5 = this.e.t();
            abyc abycVar3 = (abyeVarT5.b == 4 ? (abyb) abyeVarT5.c : abyb.a).c;
            if (abycVar3 == null) {
                abycVar3 = abyc.a;
            }
            int iF = new uk(null, null, null).f(this.n, abynVar.g.size(), abycVar3.c, abytVar2);
            if (iF == -1) {
                o();
                return;
            } else if (iF - 1 == abynVar.g.size()) {
                q();
                return;
            } else {
                fhy fhyVar = this.e.b;
                p(fhyVar != null ? ((wkd) fhyVar).h(iF) : 0);
                return;
            }
        }
        wox woxVar3 = wia.c;
        if (!wia.c(adhb.c(wia.b)) || (iAx = a.ax(abytVar2.i)) == 0 || iAx != 3) {
            o();
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
            abye abyeVarT6 = this.e.t();
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
            o();
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
                o();
                return;
            } else {
                q();
                return;
            }
        }
        abxn abxnVar3 = abxlVar.g;
        if (abxnVar3 == null) {
            abxnVar3 = abxn.a;
        }
        String str = abxnVar3.c;
        fhy fhyVar2 = this.e.b;
        if (fhyVar2 != null && this.n.containsKey(str)) {
            iH = ((wkd) fhyVar2).h(((Integer) this.n.get(str)).intValue());
        }
        p(iH);
    }

    public final void h(boolean z) {
        MaterialButton materialButton = (MaterialButton) b(R.id.survey_next);
        if (materialButton == null || materialButton.isEnabled() == z) {
            return;
        }
        materialButton.setEnabled(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.String r8) throws android.content.res.Resources.NotFoundException {
        /*
            r7 = this;
            wjw r6 = new wjw
            r0 = 2
            r6.<init>(r7, r8, r0)
            abyn r1 = r7.c
            abyk r2 = r1.i
            if (r2 != 0) goto Le
            abyk r2 = defpackage.abyk.a
        Le:
            int r2 = r2.b
            r2 = r2 & 1
            r3 = 0
            if (r2 == 0) goto L2c
            abyk r2 = r1.i
            if (r2 != 0) goto L1b
            abyk r2 = defpackage.abyk.a
        L1b:
            java.lang.String r2 = r2.c
            int r2 = r2.length()
            if (r2 <= 0) goto L2c
            abyk r2 = r1.i
            if (r2 != 0) goto L29
            abyk r2 = defpackage.abyk.a
        L29:
            java.lang.String r2 = r2.c
            goto L2d
        L2c:
            r2 = r3
        L2d:
            abyk r4 = r1.i
            if (r4 != 0) goto L34
            abyk r5 = defpackage.abyk.a
            goto L35
        L34:
            r5 = r4
        L35:
            int r5 = r5.b
            r0 = r0 & r5
            if (r0 == 0) goto L50
            if (r4 != 0) goto L3e
            abyk r4 = defpackage.abyk.a
        L3e:
            java.lang.String r0 = r4.d
            int r0 = r0.length()
            if (r0 <= 0) goto L50
            abyk r0 = r1.i
            if (r0 != 0) goto L4c
            abyk r0 = defpackage.abyk.a
        L4c:
            java.lang.String r0 = r0.d
            r4 = r0
            goto L51
        L50:
            r4 = r3
        L51:
            abyk r0 = r1.i
            if (r0 != 0) goto L58
            abyk r5 = defpackage.abyk.a
            goto L59
        L58:
            r5 = r0
        L59:
            int r5 = r5.b
            r5 = r5 & 4
            if (r5 == 0) goto L73
            if (r0 != 0) goto L63
            abyk r0 = defpackage.abyk.a
        L63:
            java.lang.String r0 = r0.e
            int r0 = r0.length()
            if (r0 <= 0) goto L73
            abyk r0 = r1.i
            if (r0 != 0) goto L71
            abyk r0 = defpackage.abyk.a
        L71:
            java.lang.String r3 = r0.e
        L73:
            r5 = r3
            android.content.Context r0 = r7.a()
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 2131429642(0x7f0b090a, float:1.8480962E38)
            android.view.View r7 = r7.b(r1)
            r1 = r7
            android.widget.TextView r1 = (android.widget.TextView) r1
            r3 = r2
            r2 = r8
            defpackage.vuf.H(r0, r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.whi.i(java.lang.String):void");
    }

    public final void j(boolean z) {
        MaterialButton materialButton = (MaterialButton) b(R.id.survey_next);
        if (materialButton != null) {
            materialButton.setVisibility(true != z ? 8 : 0);
        }
    }

    public final void k() {
        MaterialButton materialButton = (MaterialButton) b(R.id.survey_next);
        if (materialButton == null || !this.e.y()) {
            return;
        }
        materialButton.setText(R.string.survey_submit);
    }

    public final boolean l() {
        return wid.n(this.c);
    }

    public final void m(int i) {
        Answer answer = this.f;
        answer.g = i;
        this.o.h(answer, wid.l(this.c));
    }

    public final void n() {
        b(R.id.survey_controls_divider).setVisibility(8);
        b(R.id.survey_controls_legal_text).setVisibility(8);
    }
}
