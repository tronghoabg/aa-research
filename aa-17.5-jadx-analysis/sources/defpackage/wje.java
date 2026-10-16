package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Spanned;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.surveys.internal.model.QuestionMetrics;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class wje extends wii {
    public String d;
    public int e;
    public QuestionMetrics f;
    private TextView g;

    @Override // defpackage.wii
    public final abye c() {
        abnp abnpVarN = abye.a.n();
        if (this.f.c() && this.d != null) {
            abnp abnpVarN2 = abyc.a.n();
            int i = this.e;
            abnpVarN2.t();
            ((abyc) abnpVarN2.b).c = i;
            abnpVarN2.t();
            ((abyc) abnpVarN2.b).b = aclh.c(3);
            String str = this.d;
            abnpVarN2.t();
            abyc abycVar = (abyc) abnpVarN2.b;
            str.getClass();
            abycVar.d = str;
            abyc abycVar2 = (abyc) abnpVarN2.q();
            abnp abnpVarN3 = abyb.a.n();
            abnpVarN3.t();
            abyb abybVar = (abyb) abnpVarN3.b;
            abycVar2.getClass();
            abybVar.c = abycVar2;
            abybVar.b |= 1;
            abyb abybVar2 = (abyb) abnpVarN3.q();
            int i2 = this.a.e;
            abnpVarN.t();
            ((abye) abnpVarN.b).d = i2;
            abnpVarN.t();
            abye abyeVar = (abye) abnpVarN.b;
            abybVar2.getClass();
            abyeVar.c = abybVar2;
            abyeVar.b = 4;
            long j = wid.a;
        }
        return (abye) abnpVarN.q();
    }

    @Override // defpackage.wii
    public final void e() {
        TextView textView;
        this.f.b();
        if (b() != null) {
            b().j();
        }
        b().f(g(), this);
        if (!wid.k(getContext()) || (textView = this.g) == null) {
            return;
        }
        textView.requestFocus();
        this.g.sendAccessibilityEvent(8);
    }

    @Override // defpackage.wii
    public final void f(String str) {
        wox woxVar = wia.c;
        if (wia.b(adhz.d(wia.b)) && (getContext() == null || this.g == null)) {
            return;
        }
        Spanned spannedB = dyz.b(str);
        this.g.setText(spannedB);
        this.g.setContentDescription(spannedB.toString());
    }

    public final boolean g() {
        return this.d != null;
    }

    @Override // defpackage.wii, android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle != null) {
            this.d = bundle.getString("SelectedResponse", null);
            this.f = (QuestionMetrics) bundle.getParcelable("QuestionMetrics");
        }
        if (this.f == null) {
            this.f = new QuestionMetrics();
        }
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        View viewInflate = layoutInflater.inflate(R.layout.survey_question_rating_fragment, viewGroup, false);
        Bundle arguments = getArguments();
        whu.c((ImageView) viewInflate.findViewById(R.id.survey_prompt_banner_logo), arguments.containsKey("DisplayLogoResId") ? Integer.valueOf(arguments.getInt("DisplayLogoResId", 0)) : null);
        CharSequence charSequence = bundle != null ? bundle.getCharSequence("QuestionTextFromHtml") : null;
        if (charSequence == null) {
            charSequence = dyz.b(this.a.g.isEmpty() ? this.a.f : this.a.g);
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.survey_question_text);
        this.g = textView;
        textView.setText(charSequence);
        this.g.setContentDescription(charSequence.toString());
        wjk wjkVar = new wjk(getContext());
        abyt abytVar = this.a;
        wjkVar.d(abytVar.c == 6 ? (abyv) abytVar.d : abyv.a);
        wjkVar.a = new wjj() { // from class: wjd
            @Override // defpackage.wjj
            public final void a(int i) {
                wje wjeVar = this.a;
                wjeVar.d = Integer.toString(i);
                wjeVar.e = i;
                wjeVar.f.a();
                int iAx = a.ax(wjeVar.a.i);
                if (iAx == 0) {
                    iAx = 1;
                }
                wjy wjyVarB = wjeVar.b();
                if (wjyVarB == null) {
                    Log.w("SurveyRatingFragment", "Activity was null, finishing or destroyed while attempting to navigate to the next page. Likely the user rotated the device before the Runnable executed.");
                } else if (iAx == 5) {
                    wjyVarB.e();
                } else {
                    wjyVarB.f(wjeVar.g(), wjeVar);
                }
            }
        };
        ((ViewGroup) viewInflate.findViewById(R.id.survey_rating_container)).addView(wjkVar);
        return viewInflate;
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onSaveInstanceState */
    public final void m117x22bc4f96(Bundle bundle) {
        bundle.putString("SelectedResponse", this.d);
        bundle.putParcelable("QuestionMetrics", this.f);
        TextView textView = this.g;
        if (textView != null) {
            bundle.putCharSequence("QuestionTextFromHtml", textView.getText());
        }
    }
}
