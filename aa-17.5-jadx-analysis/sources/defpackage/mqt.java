package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mqt extends mqz {
    public static final ComponentName a = mkn.w;
    private final Context b;
    private final Intent g;

    /* JADX WARN: Illegal instructions before constructor call */
    public mqt(Context context) {
        ComponentName componentName = a;
        super(new mqc(componentName, mpz.a, null), GhIcon.p(context, R.drawable.ic_customize_applauncher), context.getString(R.string.gearhead_on_phone_activity_customization_label), 0, null);
        Intent intent = new Intent();
        intent.setComponent(componentName);
        intent.setFlags(335544320);
        this.g = intent;
        this.b = context;
    }

    @Override // defpackage.mqz
    public final void c() {
        mfe.a();
        Context context = this.b;
        mfe.c(context, this.g, context.getString(R.string.gearhead_on_phone_activity_launcher_customization_label), yzz.SETTINGS_PHONE_LAUNCHER_CUSTOMIZATION);
    }
}
