package defpackage;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mqr extends mqz {
    public static final mqc a = new mqc(new ComponentName("ShowCamera", ""));

    public mqr(Context context) {
        super(a, GhIcon.p(context, R.drawable.ic_camera_launcher), context.getResources().getString(R.string.camera_launcher_title), 0, null);
    }

    @Override // defpackage.mqz
    public final void c() {
        kjq.f().l(6);
    }
}
