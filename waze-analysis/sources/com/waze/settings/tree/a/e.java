package com.waze.settings.tree.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.waze.R;
import com.waze.settings.bp;
import com.waze.settings.de;
import com.waze.settings.tree.views.WazeSettingsView;
import com.waze.ui.z.as;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends com.waze.settings.tree.d.h {
    e(bp bpVar) {
        super("google_assistant.ok_google_detection", R.string.VOICE_COMMANDS_GOOGLE_ASSISTANT_OK_GOOGLE_DETECTION, "GOOGLE_ASSISTANT_OK_GOOGLE_DETECTION", 0, bpVar);
    }

    @Override // com.waze.settings.tree.d.h, com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        WazeSettingsView wazeSettingsView = (WazeSettingsView) super.O(deVar);
        ImageView imageView = new ImageView(wazeSettingsView.getContext());
        imageView.setImageResource(R.drawable.ic_open_in_new);
        int iF = as.f(16);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.setMargins(iF, iF, iF, iF);
        imageView.setLayoutParams(marginLayoutParams);
        wazeSettingsView.x(imageView);
        int i2 = h.f37469a;
        wazeSettingsView.setVisibility(true != com.waze.google_assistant.aa.f24060a.a().E() ? 8 : 0);
        return wazeSettingsView;
    }
}
