package Q1;

import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public Message f9709a;

    public final void a() {
        this.f9709a = null;
        ArrayList arrayList = s.f9710b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.f9709a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
