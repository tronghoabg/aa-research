package S1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class s extends i {

    /* renamed from: c, reason: collision with root package name */
    public final int f10907c;

    public s() {
        super(2008);
        this.f10907c = 1;
    }

    public static s a(IOException iOException, int i5) {
        String message = iOException.getMessage();
        int i10 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !A6.h.O(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i10 == 2007 ? new r("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new s(iOException, i10, i5);
    }

    public s(String str, int i5) {
        super(str, i5 == 2000 ? 2001 : i5);
        this.f10907c = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s(IOException iOException, int i5, int i10) {
        if (i5 == 2000 && i10 == 1) {
            i5 = 2001;
        }
        super(iOException, i5);
        this.f10907c = i10;
    }

    public s(String str, IOException iOException, int i5) {
        super(i5 == 2000 ? 2001 : i5, iOException, str);
        this.f10907c = 1;
    }
}
