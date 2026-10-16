package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afjn extends java.lang.Exception {
    public afjn(java.lang.IllegalAccessException illegalAccessException) {
        super("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", illegalAccessException);
    }
}
