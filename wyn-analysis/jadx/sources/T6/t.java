package t6;

import android.system.ErrnoException;
import android.system.OsConstants;

/* loaded from: classes3.dex */
public abstract class t {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}
