package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Queue;

/* loaded from: classes.dex */
final class mhg extends Handler {
    final /* synthetic */ mhh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhg(mhh mhhVar) {
        super(Looper.getMainLooper());
        this.a = mhhVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 0) {
            return;
        }
        mhh mhhVar = this.a;
        mfo mfoVar = (mfo) mhhVar.e.a;
        mfp mfpVar = mfoVar.j;
        if (mfpVar.c == null) {
            ((ype) ((ype) mhh.a.h()).ai((char) 4929)).u("Aborting processNextRequirement!");
            return;
        }
        yph yphVar = mhh.a;
        ((ype) yphVar.l().ai((char) 4926)).u("processNextRequirement enter");
        Queue queue = mhhVar.b;
        mhf mhfVar = (mhf) queue.peek();
        while (mhfVar != null && mhfVar.e()) {
            queue.poll();
            mhfVar = (mhf) queue.peek();
        }
        boolean z = true;
        if (mhfVar == null) {
            ((ype) yphVar.l().ai((char) 4928)).u("getNextRequirementAsync exit: end of queue");
            ((ype) ((ype) mfp.a.f()).ai((char) 4852)).u("onAllRequirementsComplete");
            mfpVar.b.a(mgl.b);
            mfoVar.a(true);
            return;
        }
        ((ype) yphVar.l().ai((char) 4927)).u("getNextRequirementAsync exit: found next requirement");
        ((ype) ((ype) mfp.a.f()).ai((char) 4853)).w("onNextRequirement for id=%d", mhfVar.a());
        mfoVar.g = mhfVar;
        mfu mfuVar = mfoVar.f;
        if (!mfuVar.b && !mhfVar.d()) {
            z = false;
        }
        mfuVar.b = z;
        mfpVar.b.a(mgl.c);
    }
}
