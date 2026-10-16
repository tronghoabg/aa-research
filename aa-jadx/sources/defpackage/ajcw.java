package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajcw implements defpackage.aiuw {
    public final defpackage.afdo a;

    public ajcw(defpackage.afdo afdoVar) {
        this.a = afdoVar;
    }

    @Override // defpackage.aiuw
    public final defpackage.afdo c() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "CoroutineScope(coroutineContext=" + this.a + ")";
    }
}
