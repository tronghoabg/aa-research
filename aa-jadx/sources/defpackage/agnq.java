package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agnq extends java.lang.IllegalArgumentException {
    public /* synthetic */ agnq(java.lang.String str, java.lang.Throwable th, int i, defpackage.affu affuVar) {
        this(str, (i & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agnq(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        str.getClass();
    }
}
