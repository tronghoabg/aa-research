package defpackage;

/* loaded from: classes2.dex */
public final class aiwo extends aitu {
    public static final aiwo a = new aiwo();

    @Override // defpackage.aitu
    public final void a(afco afcoVar, Runnable runnable) {
        aiws aiwsVar = (aiws) afcoVar.get(aiws.b);
        if (aiwsVar == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        aiwsVar.a = true;
    }

    @Override // defpackage.aitu
    public final boolean eQ(afco afcoVar) {
        return false;
    }

    @Override // defpackage.aitu
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
