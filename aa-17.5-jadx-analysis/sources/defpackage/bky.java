package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* loaded from: classes.dex */
public final class bky {
    public static final bko a = bkn.b;

    public static final boolean a(cql cqlVar) {
        List list = cqlVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!a.Y(((cqu) list.get(i)).i, 2)) {
                MotionEvent motionEventA = cqlVar.a();
                if (motionEventA != null && motionEventA.isFromSource(8194)) {
                    return true;
                }
                MotionEvent motionEventA2 = cqlVar.a();
                return motionEventA2 != null && motionEventA2.isFromSource(1048584);
            }
        }
        return true;
    }
}
