package defpackage;

import android.content.Context;
import android.os.PowerManager;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class ixn implements ixm {
    private static final yph d = yph.c("CAR.POWER");
    public final PowerManager a;
    public Method b;
    public volatile int c;

    public ixn(Context context) {
        this.c = 0;
        this.a = (PowerManager) context.getSystemService("power");
        try {
            Class cls = Integer.TYPE;
            this.b = PowerManager.class.getMethod("userActivity", Long.TYPE, cls, cls);
        } catch (NoSuchMethodException unused) {
            ((ype) ((ype) d.h()).ai((char) 1524)).u("PowerManager.userActivity not found");
            this.b = null;
            this.c = -1;
        }
    }

    @Override // defpackage.ixm
    public final boolean a() {
        return this.a.isPowerSaveMode();
    }
}
