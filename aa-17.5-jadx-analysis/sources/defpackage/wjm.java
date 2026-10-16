package defpackage;

import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.surveys.internal.view.ScrollViewWithSizeCallback;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public abstract class wjm extends wii {
    private TextView d;
    public View f;
    public View g;
    public View h;
    public ScrollViewWithSizeCallback i;
    private final wjl e = new wjl(this);
    private boolean j = false;

    @Override // defpackage.wii
    public void e() {
        View view;
        wox woxVar = wia.c;
        if ((!wia.b(adhz.d(wia.b)) || j()) && wid.k(getContext()) && (view = this.f) != null) {
            view.requestFocus();
            this.f.sendAccessibilityEvent(8);
        }
    }

    @Override // defpackage.wii
    public final void f(String str) {
        wox woxVar = wia.c;
        if (!wia.b(adhz.d(wia.b)) || j()) {
            Spanned spannedB = dyz.b(str);
            this.d.setText(spannedB);
            this.d.setContentDescription(spannedB.toString());
        }
    }

    public abstract View g();

    public abstract String h();

    public final boolean j() {
        return (getContext() == null || this.d == null || this.f == null || this.g == null || this.h == null || this.i == null) ? false : true;
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.survey_question_with_scrollable_content, viewGroup, false);
        this.f = viewInflate.findViewById(R.id.survey_question_header_logo_text);
        this.d = (TextView) viewInflate.findViewById(R.id.survey_question_text);
        CharSequence charSequence = bundle != null ? bundle.getCharSequence("QuestionTextFromHtml") : null;
        if (charSequence == null) {
            charSequence = dyz.b(h());
        }
        this.d.setText(charSequence);
        this.d.setContentDescription(charSequence.toString());
        this.h = g();
        ScrollViewWithSizeCallback scrollViewWithSizeCallback = (ScrollViewWithSizeCallback) viewInflate.findViewById(R.id.survey_question_scroll_view);
        this.i = scrollViewWithSizeCallback;
        scrollViewWithSizeCallback.addView(this.h);
        ScrollViewWithSizeCallback scrollViewWithSizeCallback2 = this.i;
        wjl wjlVar = this.e;
        scrollViewWithSizeCallback2.a = wjlVar;
        if (!this.j && scrollViewWithSizeCallback2 != null) {
            scrollViewWithSizeCallback2.getViewTreeObserver().addOnScrollChangedListener(wjlVar);
            this.j = true;
        }
        whu.c((ImageView) viewInflate.findViewById(R.id.survey_prompt_banner_logo), this.c);
        wjy wjyVarB = b();
        if (wjyVarB != null) {
            this.g = wjyVarB.b().findViewById(R.id.survey_controls_container);
        }
        ebm.q(viewInflate, null);
        return viewInflate;
    }

    @Override // android.support.v4.app.Fragment
    public final void onDestroyView() {
        ScrollViewWithSizeCallback scrollViewWithSizeCallback;
        if (this.j && (scrollViewWithSizeCallback = this.i) != null) {
            scrollViewWithSizeCallback.getViewTreeObserver().removeOnScrollChangedListener(this.e);
            this.j = false;
        }
        super.onDestroyView();
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onSaveInstanceState */
    public void m117x22bc4f96(Bundle bundle) {
        TextView textView = this.d;
        if (textView != null) {
            bundle.putCharSequence("QuestionTextFromHtml", textView.getText());
        }
    }
}
