package t6;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes3.dex */
public class x extends C4145m {

    /* renamed from: c, reason: collision with root package name */
    public final int f45931c;

    public x() {
        super(2008);
        this.f45931c = 1;
    }

    public static x a(IOException iOException, int i5) {
        String message = iOException.getMessage();
        int i10 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !A6.h.O(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i10 == 2007 ? new w("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, 2007) : new x(iOException, i10, i5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x(IOException iOException, int i5, int i10) {
        if (i5 == 2000 && i10 == 1) {
            i5 = 2001;
        }
        super(iOException, i5);
        this.f45931c = i10;
    }

    public x(String str, IOException iOException, int i5) {
        super(i5 == 2000 ? 2001 : i5, iOException, str);
        this.f45931c = 1;
    }
}
