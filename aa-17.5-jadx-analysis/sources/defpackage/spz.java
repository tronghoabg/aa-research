package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class spz {
    public static final spz a = new spz();
    private six b = null;

    public static six b(Context context) {
        return a.a(context);
    }

    public final synchronized six a(Context context) {
        six sixVar;
        sixVar = this.b;
        if (sixVar == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            sixVar = new six(context);
            this.b = sixVar;
        }
        return sixVar;
    }
}
