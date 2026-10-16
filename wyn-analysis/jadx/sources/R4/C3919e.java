package r4;

/* renamed from: r4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3919e {

    /* renamed from: a, reason: collision with root package name */
    public final long f44347a;

    /* renamed from: b, reason: collision with root package name */
    public final int f44348b;

    /* renamed from: c, reason: collision with root package name */
    public final String f44349c;

    public C3919e(int i5, long j8, String str) {
        this.f44347a = j8;
        this.f44348b = i5;
        this.f44349c = str;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Log{sessionId=");
        sb2.append(this.f44347a);
        sb2.append(", level=");
        switch (this.f44348b) {
            case 1:
                str = "AV_LOG_STDERR";
                break;
            case 2:
                str = "AV_LOG_QUIET";
                break;
            case 3:
                str = "AV_LOG_PANIC";
                break;
            case 4:
                str = "AV_LOG_FATAL";
                break;
            case 5:
                str = "AV_LOG_ERROR";
                break;
            case 6:
                str = "AV_LOG_WARNING";
                break;
            case 7:
                str = "AV_LOG_INFO";
                break;
            case 8:
                str = "AV_LOG_VERBOSE";
                break;
            case 9:
                str = "AV_LOG_DEBUG";
                break;
            case 10:
                str = "AV_LOG_TRACE";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        sb2.append(", message='");
        return wg.b.c(sb2, this.f44349c, "'}");
    }
}
