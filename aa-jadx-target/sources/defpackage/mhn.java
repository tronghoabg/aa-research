package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class mhn extends android.os.Handler {
    final /* synthetic */ defpackage.mho a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhn(defpackage.mho mhoVar) {
        super(android.os.Looper.getMainLooper());
        this.a = mhoVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        if (message.what != 0) {
            return;
        }
        defpackage.mho mhoVar = this.a;
        defpackage.mfw mfwVar = (defpackage.mfw) mhoVar.e.a;
        defpackage.mfx mfxVar = mfwVar.j;
        if (mfxVar.c == null) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.mho.a.h()).ai((char) 4932)).u("Aborting processNextRequirement!");
            return;
        }
        defpackage.yqm yqmVar = defpackage.mho.a;
        ((defpackage.yqj) yqmVar.l().ai((char) 4929)).u("processNextRequirement enter");
        java.util.Queue queue = mhoVar.b;
        defpackage.mhm mhmVar = (defpackage.mhm) queue.peek();
        while (mhmVar != null && mhmVar.e()) {
            queue.poll();
            mhmVar = (defpackage.mhm) queue.peek();
        }
        boolean z = true;
        if (mhmVar == null) {
            ((defpackage.yqj) yqmVar.l().ai((char) 4931)).u("getNextRequirementAsync exit: end of queue");
            ((defpackage.yqj) ((defpackage.yqj) defpackage.mfx.a.f()).ai((char) 4855)).u("onAllRequirementsComplete");
            mfxVar.b.a(defpackage.mgt.b);
            mfwVar.a(true);
            return;
        }
        ((defpackage.yqj) yqmVar.l().ai((char) 4930)).u("getNextRequirementAsync exit: found next requirement");
        ((defpackage.yqj) ((defpackage.yqj) defpackage.mfx.a.f()).ai((char) 4856)).w("onNextRequirement for id=%d", mhmVar.a());
        mfwVar.g = mhmVar;
        defpackage.mgc mgcVar = mfwVar.f;
        if (!mgcVar.b && !mhmVar.d()) {
            z = false;
        }
        mgcVar.b = z;
        mfxVar.b.a(defpackage.mgt.c);
    }
}
