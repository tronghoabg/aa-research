package defpackage;

import android.view.VelocityTracker;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class eau {
    public static final Map a = DesugarCollections.synchronizedMap(new WeakHashMap());

    public static eav a(VelocityTracker velocityTracker) {
        return (eav) a.get(velocityTracker);
    }
}
