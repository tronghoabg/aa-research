package Va;

/* renamed from: Va.r9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1127r9 {

    /* renamed from: a, reason: collision with root package name */
    public static int f14557a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f14558b = 1;

    public static String b(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC0897a.f13937u) {
            try {
                AbstractC0897a.f13936t = i5;
                char[] cArr = new char[charArray.length];
                AbstractC0897a.f13935s = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13935s;
                    if (i10 < charArray.length) {
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ 3888530524792720430L);
                        AbstractC0897a.f13935s = i10 + 1;
                    } else {
                        str2 = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public abstract String a();

    public abstract Z0 c();

    public abstract String d();

    public abstract Class e();
}
