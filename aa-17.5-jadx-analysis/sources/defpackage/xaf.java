package defpackage;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class xaf extends mo {
    public final /* synthetic */ xai s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xaf(xai xaiVar, View view) {
        super(view);
        this.s = xaiVar;
        view.setOnClickListener(new wwt(this, 20));
        boolean z = mki.a.c.getSharedPreferences("AssistantPreferences", 0).getBoolean("GEMINI_ENABLED_KEY", false);
        if (!acsi.d()) {
            ((TextView) view.findViewById(R.id.description)).setText(R.string.settings_customize_add_launcher_shortcut_button_description_call);
        } else if (z) {
            ((TextView) view.findViewById(R.id.description)).setText(R.string.settings_customize_add_launcher_shortcut_button_description_call_and_gemini);
        }
    }

    public final void E() {
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("vnd.android.cursor.dir/phone_v2");
        this.s.h.startActivityForResult(intent, 1001);
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.LAUNCHER_SHORTCUT, yzy.uI).l());
    }
}
