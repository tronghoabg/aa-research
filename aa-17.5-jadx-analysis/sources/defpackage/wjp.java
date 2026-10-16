package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.surveys.internal.model.QuestionMetrics;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class wjp extends wjm {
    public String d;
    public int e = -1;
    public int j;
    private LinearLayout k;
    private QuestionMetrics l;

    @Override // defpackage.wii
    public final abye c() {
        abnp abnpVarN = abye.a.n();
        if (this.l.c() && this.d != null) {
            this.l.a();
            abnp abnpVarN2 = abyc.a.n();
            int i = this.e;
            abnpVarN2.t();
            ((abyc) abnpVarN2.b).c = i;
            int i2 = this.j;
            abnpVarN2.t();
            ((abyc) abnpVarN2.b).b = aclh.c(i2);
            String str = this.d;
            abnpVarN2.t();
            abyc abycVar = (abyc) abnpVarN2.b;
            str.getClass();
            abycVar.d = str;
            abyc abycVar2 = (abyc) abnpVarN2.q();
            abnp abnpVarN3 = abyd.a.n();
            abnpVarN3.t();
            abyd abydVar = (abyd) abnpVarN3.b;
            abycVar2.getClass();
            abydVar.c = abycVar2;
            abydVar.b |= 1;
            abyd abydVar2 = (abyd) abnpVarN3.q();
            abnpVarN.t();
            abye abyeVar = (abye) abnpVarN.b;
            abydVar2.getClass();
            abyeVar.c = abydVar2;
            abyeVar.b = 2;
            int i3 = this.a.e;
            abnpVarN.t();
            ((abye) abnpVarN.b).d = i3;
        }
        return (abye) abnpVarN.q();
    }

    @Override // defpackage.wii
    public final void d() {
        if (this.k != null) {
            int i = 0;
            while (i < this.k.getChildCount()) {
                View childAt = this.k.getChildAt(i);
                childAt.setAlpha(BitmapDescriptorFactory.HUE_RED);
                i++;
                childAt.animate().alpha(1.0f).setDuration(150L).setStartDelay(i * 80);
            }
        }
    }

    @Override // defpackage.wjm, defpackage.wii
    public final void e() {
        EditText editText;
        super.e();
        this.l.b();
        wjy wjyVarB = b();
        if (wjyVarB != null) {
            LinearLayout linearLayout = this.k;
            boolean z = false;
            if (linearLayout != null && (editText = (EditText) linearLayout.findViewById(R.id.survey_other_option)) != null && editText.hasFocus()) {
                z = true;
            }
            wjyVarB.f(z, this);
        }
    }

    @Override // defpackage.wjm
    public final View g() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.survey_scrollable_answer_content_container, (ViewGroup) null);
        this.k = (LinearLayout) viewInflate.findViewById(R.id.survey_answers_container);
        wjt wjtVar = new wjt(getContext());
        wjtVar.a = new wjs() { // from class: wjo
            @Override // defpackage.wjs
            public final void a(ajll ajllVar) {
                wjp wjpVar = this.a;
                wjy wjyVarB = wjpVar.b();
                if (wjyVarB == null) {
                    Log.w("SurveyMultiChoiceFrag", "Activity was null, finishing or destroyed while attempting to navigate to the next page. Likely the user rotated the device before the Runnable executed.");
                    return;
                }
                int i = ajllVar.a;
                wjpVar.j = i;
                wjpVar.d = (String) ajllVar.c;
                wjpVar.e = ajllVar.b;
                if (i == 4) {
                    wjyVarB.g(true);
                } else {
                    wjyVarB.e();
                }
            }
        };
        abyt abytVar = this.a;
        wjtVar.a(abytVar.c == 4 ? (abzd) abytVar.d : abzd.a);
        this.k.addView(wjtVar);
        if (!b().i()) {
            viewInflate.setPadding(viewInflate.getPaddingLeft(), viewInflate.getPaddingTop(), viewInflate.getPaddingRight(), getResources().getDimensionPixelSize(R.dimen.survey_bottom_padding));
        }
        return viewInflate;
    }

    @Override // defpackage.wjm
    public final String h() {
        boolean zIsEmpty = this.a.g.isEmpty();
        abyt abytVar = this.a;
        return zIsEmpty ? abytVar.f : abytVar.g;
    }

    @Override // defpackage.wii, android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle != null) {
            this.d = bundle.getString("SelectedResponse", null);
            this.l = (QuestionMetrics) bundle.getParcelable("QuestionMetrics");
        }
        if (this.l == null) {
            this.l = new QuestionMetrics();
        }
    }

    @Override // defpackage.wjm, android.support.v4.app.Fragment
    /* renamed from: onSaveInstanceState */
    public final void m117x22bc4f96(Bundle bundle) {
        super.m117x22bc4f96(bundle);
        bundle.putString("SelectedResponse", this.d);
        bundle.putParcelable("QuestionMetrics", this.l);
    }
}
