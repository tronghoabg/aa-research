package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.List;

/* loaded from: classes2.dex */
public final class kej implements Handler.Callback {
    private final /* synthetic */ int a;

    public kej(int i) {
        this.a = i;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return true;
            }
            if (message.what != 1) {
                return false;
            }
            ((hwx) message.obj).e();
            return true;
        }
        if (message.what != 1) {
            ((ype) ((ype) kek.d.h()).ai((char) 2967)).y("Unknown message: %s", message);
            return false;
        }
        List list = (List) message.obj;
        yph yphVar = kek.d;
        list.size();
        return true;
    }
}
