package com.waze.settings.tree.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class SettingsTitleText extends RelativeLayout {
    public SettingsTitleText(Context context, AttributeSet attributeSet) {
        int attributeResourceValue;
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.settings_title_text, this);
        if (attributeSet == null || (attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "text", 0)) == 0) {
            return;
        }
        a(com.waze.shared_infra.o.b.a().c(attributeResourceValue, new Object[0]));
    }

    public final void a(CharSequence charSequence) {
        ((TextView) findViewById(R.id.settingsTitleText)).setText(charSequence);
    }
}
