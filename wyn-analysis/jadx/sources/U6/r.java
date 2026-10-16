package u6;

import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public Message f46714a;

    public final void a() {
        this.f46714a = null;
        ArrayList arrayList = s.f46715b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.f46714a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
