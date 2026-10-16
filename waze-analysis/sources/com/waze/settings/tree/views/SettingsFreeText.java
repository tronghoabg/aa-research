package com.waze.settings.tree.views;

import android.content.Context;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.sharedui.views.WazeTextView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class SettingsFreeText extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    final WazeTextView f37596a;

    public SettingsFreeText(Context context, AttributeSet attributeSet) {
        int attributeResourceValue;
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.settings_free_text, this);
        WazeTextView wazeTextView = (WazeTextView) findViewById(R.id.settingsTitleText);
        this.f37596a = wazeTextView;
        if (attributeSet != null && (attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "text", 0)) != 0) {
            d(com.waze.shared_infra.o.b.a().c(attributeResourceValue, new Object[0]));
        }
        wazeTextView.setLinkTextColor(ContextCompat.getColor(getContext(), R.color.primary_variant));
    }

    public final void a(boolean z) {
        WazeTextView wazeTextView = this.f37596a;
        if (z) {
            wazeTextView.e(3);
        } else {
            wazeTextView.e(4);
        }
    }

    public final void b(boolean z) {
        WazeTextView wazeTextView = this.f37596a;
        if (z) {
            wazeTextView.setGravity(17);
        } else {
            wazeTextView.setGravity(19);
        }
    }

    public final void c(String str) {
        WazeTextView wazeTextView = this.f37596a;
        wazeTextView.setText(Html.fromHtml(str, 0));
        wazeTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void d(CharSequence charSequence) {
        this.f37596a.setText(charSequence);
    }
}
