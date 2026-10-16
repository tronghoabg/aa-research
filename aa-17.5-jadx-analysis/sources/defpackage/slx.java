package defpackage;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes.dex */
public final class slx extends sss {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("BasePendingResult", a.cc(message, "Don't know how to handle message: "), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).h(Status.d);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        sli sliVar = (sli) pair.second;
        try {
            throw null;
        } catch (RuntimeException e) {
            BasePendingResult.i(sliVar);
            throw e;
        }
    }
}
