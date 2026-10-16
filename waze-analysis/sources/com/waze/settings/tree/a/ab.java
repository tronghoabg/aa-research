package com.waze.settings.tree.a;

import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.settings.de;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class ab extends com.waze.settings.tree.h {

    /* renamed from: a, reason: collision with root package name */
    private TextView f37464a;

    public ab() {
        super("username_error", null, null);
    }

    @Override // com.waze.settings.tree.f
    protected View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        View viewInflate = LayoutInflater.from(deVar.g()).inflate(R.layout.waze_settings_error, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.settingsViewError);
        this.f37464a = textView;
        h.g.b.x.c(textView);
        textView.setVisibility(8);
        TextView textView2 = this.f37464a;
        h.g.b.x.c(textView2);
        textView2.setText("Test");
        viewInflate.post(new com.waze.beacons.p(viewInflate, 10));
        h.g.b.x.c(viewInflate);
        return viewInflate;
    }

    public final void c(String str) {
        TextView textView = this.f37464a;
        if (str == null) {
            h.g.b.x.c(textView);
            textView.setVisibility(8);
            return;
        }
        h.g.b.x.c(textView);
        textView.setVisibility(0);
        TextView textView2 = this.f37464a;
        h.g.b.x.c(textView2);
        textView2.setText(str);
    }

    public final void d(String str, String str2, View.OnClickListener onClickListener) {
        h.g.b.x.f(str, "text");
        h.g.b.x.f(str2, "actionText");
        h.g.b.x.f(onClickListener, "listener");
        String str3 = str;
        int iAm = h.n.o.am(str3, str2);
        if (iAm < 0) {
            c(str);
            return;
        }
        SpannableString spannableString = new SpannableString(str3);
        spannableString.setSpan(new aa(onClickListener), iAm, str2.length() + iAm, 0);
        TextView textView = this.f37464a;
        h.g.b.x.c(textView);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView2 = this.f37464a;
        h.g.b.x.c(textView2);
        TextView textView3 = this.f37464a;
        h.g.b.x.c(textView3);
        textView2.setLinkTextColor(ContextCompat.getColor(textView3.getContext(), R.color.content_p3));
        TextView textView4 = this.f37464a;
        h.g.b.x.c(textView4);
        textView4.setText(spannableString);
        TextView textView5 = this.f37464a;
        h.g.b.x.c(textView5);
        textView5.setVisibility(0);
    }
}
