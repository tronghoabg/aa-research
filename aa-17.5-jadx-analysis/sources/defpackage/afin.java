package defpackage;

/* loaded from: classes3.dex */
public final class afin extends Exception {
    public afin(IllegalAccessException illegalAccessException) {
        super("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", illegalAccessException);
    }
}
