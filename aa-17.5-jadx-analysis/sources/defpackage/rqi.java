package defpackage;

import android.content.Context;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class rqi {
    public static final IntentFilter a = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    public final Context b;

    public rqi(Context context) {
        this.b = context;
    }
}
