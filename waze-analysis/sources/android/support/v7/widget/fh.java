package android.support.v7.widget;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import androidx.collection.LruCache;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class fh extends LruCache {
    public fh() {
        super(6);
    }

    private static int c(int i2, PorterDuff.Mode mode) {
        return ((i2 + 31) * 31) + mode.hashCode();
    }

    final PorterDuffColorFilter a(int i2, PorterDuff.Mode mode) {
        return (PorterDuffColorFilter) get(Integer.valueOf(c(i2, mode)));
    }

    final void b(int i2, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
    }
}
