package defpackage;

/* loaded from: classes3.dex */
public final class aiee {
    static final /* synthetic */ aiee $$INSTANCE = new aiee();

    private aiee() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final aidg simpleLock(Runnable runnable, afec<? super InterruptedException, afak> afecVar) {
        if (runnable != null && afecVar != null) {
            return new aidf(runnable, afecVar);
        }
        return new aidg(null, 1, 0 == true ? 1 : 0);
    }
}
