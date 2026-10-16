package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build;
import defpackage.d;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class CursorWindowCompat {
    private CursorWindowCompat() {
    }

    public static CursorWindow create(String str, long j) {
        return Build.VERSION.SDK_INT >= 28 ? d.c(str, j) : new CursorWindow(str);
    }
}
