package com.waze.navigate;

import android.content.Context;
import android.content.Intent;
import android.text.style.ClickableSpan;
import android.view.View;
import com.waze.ConfigManager;
import com.waze.config.ConfigValues;
import com.waze.web.SimpleWebActivity;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class gd extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f31409a;

    gd(String str) {
        this.f31409a = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ((fy) com.waze.web.r.h(fy.class)).a(fv.f31383c);
        Context context = view.getContext();
        if (context != null) {
            Intent intent = new Intent(context, (Class<?>) SimpleWebActivity.class);
            intent.putExtra("webViewURL", ConfigManager.getInstance().getConfigValueString(ConfigValues.CONFIG_VALUE_ROUTING_HELP_ABOUT_TOLLS_URL));
            intent.putExtra("webViewTitle", this.f31409a);
            intent.putExtra("webViewShowClose", true);
            context.startActivity(intent);
        }
    }
}
