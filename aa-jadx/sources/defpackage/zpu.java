package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zpu extends java.util.LinkedHashMap {
    final /* synthetic */ defpackage.acku a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpu(defpackage.acku ackuVar, int i) {
        super(i, 0.75f, true);
        this.a = ackuVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(java.util.Map.Entry entry) {
        return size() > this.a.a;
    }
}
