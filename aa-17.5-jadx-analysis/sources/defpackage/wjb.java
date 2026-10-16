package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.Spanned;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.google.android.libraries.surveys.internal.model.Answer;
import com.google.android.libraries.surveys.internal.model.QuestionMetrics;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.projection.gearhead.R;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class wjb {
    public static yfy a;
    public final wja b;
    public Answer c;
    public Context d;
    public Activity e;
    public abyn f;
    public QuestionMetrics g;
    public abzc h;
    public boolean i;
    public String j;
    public String k;
    public zvn m;
    public ajll n;
    public aacq o;
    private View p;
    private ViewGroup q;
    private int s;
    private Integer t;
    private whc u;
    private String v;
    private boolean r = false;
    private boolean w = false;
    private boolean x = true;
    private boolean y = true;
    public int l = 0;

    public wjb(wja wjaVar) {
        this.b = wjaVar;
    }

    private final void m(View.OnClickListener onClickListener, String str) {
        ((MaterialButton) this.q.findViewById(R.id.survey_next)).setOnClickListener(new naj(this, onClickListener, str, 6));
    }

    private final void n() {
        ((LayoutInflater) this.d.getSystemService("layout_inflater")).inflate(R.layout.survey_controls, this.q);
        if (wid.n(this.f)) {
            f(false);
            MaterialButton materialButton = (MaterialButton) this.q.findViewById(R.id.survey_next);
            if (materialButton != null && this.f.g.size() == 1 && !this.w) {
                materialButton.setText(R.string.survey_submit);
            }
            whu.e(this.q.findViewById(R.id.survey_controls_container), this.q.findViewById(R.id.survey_next), R.dimen.survey_button_accessibility_padding, 0);
        } else {
            this.q.findViewById(R.id.survey_next).setVisibility(8);
        }
        this.q.findViewById(R.id.survey_controls_divider).setVisibility(8);
        this.q.findViewById(R.id.survey_controls_legal_text).setVisibility(8);
    }

    private final void o(Context context, String str, abzc abzcVar, boolean z) {
        Answer answer = this.c;
        answer.g = 3;
        new zre(context, str, abzcVar).h(answer, z);
    }

    private final boolean p() {
        Activity activity;
        if (this.r) {
            return false;
        }
        wox woxVar = wia.c;
        Context context = wia.b;
        return (wia.b(true) && (activity = this.b.getActivity()) != null && activity.isChangingConfigurations()) ? false : true;
    }

    private static final void q(View view, String str) {
        TextView textView = (TextView) view.findViewById(R.id.survey_prompt_title_text);
        Spanned spannedB = dyz.b(str);
        textView.setText(spannedB);
        textView.announceForAccessibility(spannedB.toString());
    }

    public final whn a() {
        abzc abzcVar = this.h;
        if (abzcVar == null || this.j == null) {
            long j = wid.a;
            return null;
        }
        sb sbVar = new sb((byte[]) null);
        sbVar.o(abzcVar.b);
        sbVar.q(this.j);
        sbVar.p(who.b);
        return sbVar.n();
    }

    public final void b(abyt abytVar) {
        int size = 1;
        if (wia.a()) {
            abys abysVar = abytVar.k;
            if (abysVar == null) {
                abysVar = abys.a;
            }
            if ((abysVar.b & 1) != 0) {
                abys abysVar2 = abytVar.k;
                if (abysVar2 == null) {
                    abysVar2 = abys.a;
                }
                abxn abxnVar = abysVar2.d;
                if (abxnVar == null) {
                    abxnVar = abxn.a;
                }
                int iAz = a.az(abxnVar.b);
                if (iAz == 0) {
                    iAz = 1;
                }
                if (iAz - 2 == 3) {
                    size = this.f.g.size();
                }
            }
        }
        this.l = size;
    }

    public final void c() {
        whc whcVar;
        whc whcVar2;
        this.g.a();
        wox woxVar = wia.c;
        if (!wia.c(adic.c(wia.b)) || (((whcVar = this.u) != (whcVar2 = whc.b) && whcVar != whc.c) || (this.f.g.size() != 1 && !wox.r(this.i, this.f, this.c) && this.l != this.f.g.size()))) {
            h();
            return;
        }
        whc whcVar3 = this.u;
        if (whcVar3 == whcVar2) {
            View view = this.p;
            abxu abxuVar = this.f.d;
            if (abxuVar == null) {
                abxuVar = abxu.b;
            }
            Snackbar.l(view, abxuVar.c, -1).f();
        } else if (whcVar3 == whc.c) {
            Log.v("SurveyPromptDialogDel", "Silent SurveyCompletionStyle, client apps will display their own completion dialog if need");
        }
        Context context = this.d;
        String str = this.j;
        abzc abzcVar = this.h;
        boolean zL = wid.l(this.f);
        Answer answer = this.c;
        answer.g = 5;
        new zre(context, str, abzcVar).h(answer, zL);
        o(this.d, this.j, this.h, wid.l(this.f));
        this.b.dismissAllowingStateLoss();
    }

    public final void d() {
        if (wia.b == null) {
            return;
        }
        if (!wia.d()) {
            if (p()) {
                vuf.h.k();
            }
        } else {
            whn whnVarA = a();
            if (!p() || whnVarA == null) {
                return;
            }
            vuf.h.l(whnVarA);
        }
    }

    public final void e(View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.d.getSystemService("accessibility");
        View viewFindViewById = view.findViewById(R.id.survey_prompt_title_text);
        wox woxVar = wia.c;
        if (!wia.b(adhe.a.gu().a(wia.b)) || !accessibilityManager.isTouchExplorationEnabled() || viewFindViewById == null || viewFindViewById.isAccessibilityFocused()) {
            return;
        }
        viewFindViewById.performAccessibilityAction(64, null);
    }

    public final void f(boolean z) {
        MaterialButton materialButton = (MaterialButton) this.q.findViewById(R.id.survey_next);
        if (materialButton == null || materialButton.isEnabled() == z) {
            return;
        }
        materialButton.setEnabled(z);
    }

    public final void g(abyt abytVar) {
        Object obj;
        ajll ajllVar = this.n;
        abnp abnpVarN = abye.a.n();
        int iIntValue = 1;
        if (this.g.c() && (obj = ajllVar.c) != null) {
            abnp abnpVarN2 = abyc.a.n();
            int i = ajllVar.b;
            abnpVarN2.t();
            ((abyc) abnpVarN2.b).c = i;
            int i2 = ajllVar.a;
            abnpVarN2.t();
            ((abyc) abnpVarN2.b).b = aclh.c(i2);
            abnpVarN2.t();
            ((abyc) abnpVarN2.b).d = (String) obj;
            abyc abycVar = (abyc) abnpVarN2.q();
            abnp abnpVarN3 = abyd.a.n();
            abnpVarN3.t();
            abyd abydVar = (abyd) abnpVarN3.b;
            abycVar.getClass();
            abydVar.c = abycVar;
            abydVar.b |= 1;
            abyd abydVar2 = (abyd) abnpVarN3.q();
            abnpVarN.t();
            abye abyeVar = (abye) abnpVarN.b;
            abydVar2.getClass();
            abyeVar.c = abydVar2;
            abyeVar.b = 2;
            int i3 = abytVar.e;
            abnpVarN.t();
            ((abye) abnpVarN.b).d = i3;
        }
        abye abyeVar2 = (abye) abnpVarN.q();
        if (abyeVar2 != null) {
            this.c.a = abyeVar2;
        }
        b(abytVar);
        ajll ajllVar2 = this.n;
        wox woxVar = wia.c;
        if (wia.c(adhb.c(wia.b))) {
            abxl abxlVar = abxl.a;
            abxm abxmVar = (abytVar.c == 4 ? (abzd) abytVar.d : abzd.a).c;
            if (abxmVar == null) {
                abxmVar = abxm.a;
            }
            Iterator<E> it = abxmVar.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                abxl abxlVar2 = (abxl) it.next();
                if (abxlVar2.d == ajllVar2.b) {
                    abxlVar = abxlVar2;
                    break;
                }
            }
            if ((abxlVar.b & 1) != 0) {
                abxn abxnVar = abxlVar.g;
                if (abxnVar == null) {
                    abxnVar = abxn.a;
                }
                int iAz = a.az(abxnVar.b);
                if (iAz == 0) {
                    iAz = 1;
                }
                int i4 = iAz - 2;
                if (i4 == 2) {
                    abxn abxnVar2 = abxlVar.g;
                    if (abxnVar2 == null) {
                        abxnVar2 = abxn.a;
                    }
                    String str = abxnVar2.c;
                    iIntValue = a.containsKey(str) ? ((Integer) a.get(str)).intValue() : 0;
                } else if (i4 == 3) {
                    iIntValue = this.f.g.size();
                }
                this.l = iIntValue;
            }
        } else {
            this.l = 1;
        }
        c();
    }

    public final void h() {
        abyn abynVar;
        wja wjaVar = this.b;
        Activity activity = wjaVar.getActivity();
        String str = this.j;
        abyn abynVar2 = this.f;
        abzc abzcVar = this.h;
        Answer answer = this.c;
        int i = this.s;
        Integer numValueOf = Integer.valueOf(i);
        boolean z = this.i;
        Integer num = this.t;
        whc whcVar = this.u;
        String str2 = this.v;
        int i2 = this.l;
        boolean z2 = this.w;
        boolean z3 = this.x;
        boolean z4 = this.y;
        HashMap map = new HashMap();
        Iterator it = abynVar2.g.iterator();
        while (true) {
            abynVar = abynVar2;
            if (!it.hasNext()) {
                break;
            }
            abyt abytVar = (abyt) it.next();
            Iterator it2 = it;
            if ((abytVar.b & 1) != 0) {
                abys abysVar = abytVar.k;
                if (abysVar == null) {
                    abysVar = abys.a;
                }
                if (!map.containsKey(abysVar.c)) {
                    abys abysVar2 = abytVar.k;
                    if (abysVar2 == null) {
                        abysVar2 = abys.a;
                    }
                    map.put(abysVar2.c, Integer.valueOf(abytVar.e - 1));
                }
            }
            it = it2;
            abynVar2 = abynVar;
        }
        wjx.a = yfy.j(map);
        Intent intent = new Intent(activity, (Class<?>) wjx.class);
        intent.setClassName(activity, str2);
        intent.putExtra("TriggerId", str);
        intent.putExtra("SurveyPayload", abynVar.h());
        intent.putExtra("SurveySession", abzcVar.h());
        intent.putExtra("Answer", answer);
        intent.putExtra("IsFullWidth", false);
        intent.putExtra("IgnoreFirstQuestion", z);
        if (num != null) {
            intent.putExtra("LogoResId", num);
        }
        intent.putExtra("IsSubmitting", false);
        intent.putExtra("SurveyCompletionStyle", whcVar);
        intent.putExtra("StartingQuestionIndex", i2);
        intent.putExtra("keepNextButtonForLastQuestion", z2);
        intent.putExtra("isCarDisplayFullyReachable", z3);
        intent.putExtra("isCarDisplayRightOfUser", z4);
        long j = wid.a;
        numValueOf.getClass();
        activity.startActivityForResult(intent, i);
        this.r = true;
        o(this.d, this.j, this.h, wid.l(this.f));
        wjaVar.dismissAllowingStateLoss();
    }

    public final void i(Context context, String str, abzc abzcVar, boolean z) {
        Answer answer = this.c;
        answer.g = 4;
        new zre(context, str, abzcVar).h(answer, z);
    }

    public final void j(Context context, String str, abzc abzcVar, boolean z) {
        Answer answer = this.c;
        answer.g = 6;
        new zre(context, str, abzcVar).h(answer, z);
    }

    public final void k() {
        if (wia.b == null) {
            this.b.dismissAllowingStateLoss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View l(android.view.ViewGroup r21) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjb.l(android.view.ViewGroup):android.view.View");
    }
}
