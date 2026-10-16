package defpackage;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mqw extends mqz {
    public static final mqc a = new mqc(new ComponentName("SendFeedback", ""));

    public mqw(Context context) {
        super(a, GhIcon.p(context, R.drawable.ic_send_feedback_assistantaction), context.getResources().getString(R.string.gearhead_assistant_action_send_feedback_label), 0, null);
    }

    @Override // defpackage.mqz
    public final void c() {
        kfl.h().u();
    }
}
