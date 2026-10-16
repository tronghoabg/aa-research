package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class wki extends wii {
    private LinearLayout d;

    @Override // defpackage.wii
    public final abye c() {
        return null;
    }

    @Override // defpackage.wii
    public final void d() {
        if (this.d != null) {
            int i = 0;
            while (i < this.d.getChildCount()) {
                View childAt = this.d.getChildAt(i);
                childAt.setAlpha(BitmapDescriptorFactory.HUE_RED);
                i++;
                childAt.animate().alpha(1.0f).setDuration(150L).setStartDelay(i * 80);
            }
        }
    }

    @Override // defpackage.wii
    public final void e() {
        b().j();
        b().f(true, this);
        if (!TextUtils.isEmpty(wid.f(this.b.e)) || b() == null) {
            return;
        }
        wox woxVar = wia.c;
        if (wia.b(adhh.a.gu().a(wia.b))) {
            b().d();
        }
        b().c();
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        this.d = (LinearLayout) layoutInflater.inflate(R.layout.survey_thank_you_fragment, viewGroup, false);
        int i = getArguments().getInt("DisplayLogoResId", 0);
        whu.c((ImageView) this.d.findViewById(R.id.survey_prompt_banner_logo), Integer.valueOf(i));
        TextView textView = (TextView) this.d.findViewById(R.id.survey_question_text);
        Spanned spannedB = dyz.b(this.b.c);
        textView.setText(spannedB);
        textView.setContentDescription(spannedB.toString());
        textView.announceForAccessibility(textView.getContentDescription());
        String strF = wid.f(this.b.e);
        if (!TextUtils.isEmpty(strF)) {
            TextView textView2 = (TextView) this.d.findViewById(R.id.survey_follow_up_url);
            wox woxVar = wia.c;
            if (adhq.a.gu().a(requireContext()) && i == 0 && (textView2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.survey_thank_you_url_start_margin_state_no_icon));
            }
            String string = this.b.d;
            if (TextUtils.isEmpty(string)) {
                string = getResources().getString(R.string.survey_thank_you_followup_message);
            }
            textView2.setContentDescription(string);
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new wkh(this, strF), 0, string.length(), 0);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            textView2.setText(spannableString);
            if (wid.k(getContext())) {
                textView2.setClickable(false);
                textView2.setLongClickable(false);
            }
            textView2.setOnTouchListener(new qfv(4));
            textView2.setVisibility(0);
        }
        return this.d;
    }

    @Override // defpackage.wii
    public final void f(String str) {
    }
}
