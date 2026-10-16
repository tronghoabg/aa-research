package ea;

import android.os.Message;
import java.util.Comparator;

/* loaded from: classes4.dex */
public final class P implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return android.support.v4.media.session.b.W(Long.valueOf(((Message) obj).getWhen()), Long.valueOf(((Message) obj2).getWhen()));
    }
}
