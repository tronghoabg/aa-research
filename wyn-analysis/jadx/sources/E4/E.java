package E4;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class E implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2850a;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f2850a) {
            case 0:
                if (message.what != 1) {
                    return false;
                }
                ((B) message.obj).a();
                return true;
            default:
                int i5 = message.what;
                if (i5 == 0) {
                    message.obj.getClass();
                    throw new ClassCastException();
                }
                if (i5 != 1) {
                    return false;
                }
                message.obj.getClass();
                throw new ClassCastException();
        }
    }
}
