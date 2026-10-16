package defpackage;

/* loaded from: classes3.dex */
public final class agmq extends IllegalArgumentException {
    public /* synthetic */ agmq(String str, Throwable th, int i, afeu afeuVar) {
        this(str, (i & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agmq(String str, Throwable th) {
        super(str, th);
        str.getClass();
    }
}
