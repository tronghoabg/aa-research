package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
final class lqg extends mdd {
    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("DisableAutoplayReceiver");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        context.getSharedPreferences("media_autoplay_manager", 0).edit().putInt("autoplay_media_pause_history", 0).apply();
        if (action.equals("com.google.android.gearhead.autoplay.ACTION_DISABLE_AUTOPLAY")) {
            ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.MEDIA_AUTOPLAY, yzy.gq).l());
            mpl.f().a().a("key_settings_always_autoplay_media_3", false);
            obs.a().f(context, new ComponentName(context, (Class<?>) lqg.class), R.string.disable_autoplay_hun_toast, 0);
        } else if (action.equals("com.google.android.gearhead.autoplay.ACTION_KEEP_ON_AUTOPLAY")) {
            ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.MEDIA_AUTOPLAY, yzy.gr).l());
        }
        nuj.b().g(yzr.MEDIA.name(), 881096330L, context.getPackageName());
    }
}
