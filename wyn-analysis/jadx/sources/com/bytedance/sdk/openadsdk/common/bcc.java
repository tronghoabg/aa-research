package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.sdk.openadsdk.utils.af;

/* loaded from: classes3.dex */
public class bcc extends Button {
    public bcc(Context context) {
        super(context);
        uef();
    }

    private void uef() {
        setId(com.bytedance.sdk.openadsdk.utils.bs.us);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, af.oa(context, 48.0f)));
        setBackground(com.bytedance.sdk.openadsdk.utils.dj.uef(context, "tt_browser_download_selector"));
        setText(com.bytedance.sdk.component.utils.orq.uef(context, "tt_video_download_apk"));
        setTextColor(-1);
        setTextSize(2, 16.0f);
    }
}
