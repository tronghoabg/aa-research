package defpackage;

import android.content.ComponentName;
import android.os.SystemClock;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class lll {
    public static final llk a = new llk();
    public static final afgl b = new lcj(mki.b, 8);
    public final HashMap c = new HashMap();

    public final void a(ComponentName componentName) {
        oit.a();
        this.c.put(componentName, Long.valueOf(SystemClock.elapsedRealtime()));
    }
}
