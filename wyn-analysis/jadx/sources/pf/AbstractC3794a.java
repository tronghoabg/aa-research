package pf;

/* renamed from: pf.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3794a {

    /* renamed from: a, reason: collision with root package name */
    public static final Integer f43610a;

    static {
        Object obj;
        Integer num = null;
        try {
            obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Throwable unused) {
        }
        Integer num2 = obj instanceof Integer ? (Integer) obj : null;
        if (num2 != null && num2.intValue() > 0) {
            num = num2;
        }
        f43610a = num;
    }
}
