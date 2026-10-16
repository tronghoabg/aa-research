package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.libraries.surveys.internal.model.QuestionMetrics;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class wis extends wjm {
    public String d;
    private QuestionMetrics e;

    private final wiu i(String str) {
        wiu wiuVar = new wiu(getContext());
        ((EditText) wiuVar.findViewById(R.id.survey_open_text)).setText(str);
        abyt abytVar = this.a;
        wiuVar.a(abytVar.c == 7 ? (abym) abytVar.d : abym.a);
        wiuVar.a = new wiy(this, 1);
        return wiuVar;
    }

    @Override // defpackage.wii
    public final abye c() {
        abnp abnpVarN = abye.a.n();
        if (this.e.c()) {
            this.e.a();
            String strAl = woy.al(this.d);
            abnp abnpVarN2 = abya.a.n();
            abnpVarN2.t();
            ((abya) abnpVarN2.b).b = strAl;
            abya abyaVar = (abya) abnpVarN2.q();
            int i = this.a.e;
            abnpVarN.t();
            ((abye) abnpVarN.b).d = i;
            abnpVarN.t();
            abye abyeVar = (abye) abnpVarN.b;
            abyaVar.getClass();
            abyeVar.c = abyaVar;
            abyeVar.b = 5;
        }
        return (abye) abnpVarN.q();
    }

    @Override // defpackage.wjm, defpackage.wii
    public final void e() {
        super.e();
        this.e.b();
        wjy wjyVarB = b();
        if (wjyVarB != null) {
            wjyVarB.f(true, this);
        }
    }

    @Override // defpackage.wjm
    public final View g() {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.survey_scrollable_answer_content_container, (ViewGroup) null).findViewById(R.id.survey_answers_container);
        linearLayout.addView(i(""));
        return linearLayout;
    }

    @Override // defpackage.wjm
    public final String h() {
        boolean zIsEmpty = this.a.g.isEmpty();
        abyt abytVar = this.a;
        return zIsEmpty ? abytVar.f : abytVar.g;
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onActivityCreated */
    public final void m105lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        super.m105lambda$performActivityCreated$8$androidsupportv4appFragment(bundle);
        wjy wjyVarB = b();
        if (wjyVarB != null) {
            wjyVarB.f(true, this);
        }
    }

    @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        View view;
        super.onConfigurationChanged(configuration);
        wox woxVar = wia.c;
        if (adht.a.gu().a(getContext()) && configuration.orientation == 2 && (view = getView()) != null) {
            EditText editText = (EditText) view.findViewById(R.id.survey_open_text);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.survey_answers_container);
            if (linearLayout == null || editText == null) {
                return;
            }
            linearLayout.removeAllViews();
            linearLayout.addView(i(editText.getText().toString()));
        }
    }

    @Override // defpackage.wii, android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle == null) {
            this.e = new QuestionMetrics();
        } else {
            this.e = (QuestionMetrics) bundle.getParcelable("QuestionMetrics");
        }
    }

    @Override // defpackage.wjm, android.support.v4.app.Fragment
    /* renamed from: onSaveInstanceState */
    public final void m117x22bc4f96(Bundle bundle) {
        super.m117x22bc4f96(bundle);
        bundle.putParcelable("QuestionMetrics", this.e);
    }
}
