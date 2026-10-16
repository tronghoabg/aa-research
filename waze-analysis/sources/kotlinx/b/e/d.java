package kotlinx.b.e;

import androidx.core.app.NotificationCompat;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str) {
        super(str);
        x.f(str, NotificationCompat.CATEGORY_MESSAGE);
    }
}
