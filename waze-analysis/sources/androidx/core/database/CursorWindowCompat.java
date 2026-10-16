package androidx.core.database;

import android.database.CursorWindow;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CursorWindowCompat {

    /* compiled from: WazeSource */
    class Api28Impl {
        private Api28Impl() {
        }

        static CursorWindow createCursorWindow(String str, long j2) {
            return new CursorWindow(str, j2);
        }
    }

    private CursorWindowCompat() {
    }

    public static CursorWindow create(String str, long j2) {
        return Api28Impl.createCursorWindow(str, j2);
    }
}
