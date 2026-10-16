package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ActivityComposeUtilsKt {
    public static final /* synthetic */ <T> T findOwner(Context context) {
        for (Object obj = context; obj instanceof ContextWrapper; obj = (T) ((ContextWrapper) obj).getBaseContext()) {
            x.i();
            if (obj instanceof Object) {
                return (T) obj;
            }
        }
        return null;
    }
}
