package android.support.v4.app;

import android.util.Log;
import java.io.Writer;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class cs extends Writer {

    /* renamed from: b, reason: collision with root package name */
    private final StringBuilder f291b = new StringBuilder(128);

    /* renamed from: a, reason: collision with root package name */
    private final String f290a = "FragmentManager";

    cs() {
    }

    private final void a() {
        StringBuilder sb = this.f291b;
        if (sb.length() > 0) {
            Log.d(this.f290a, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == '\n') {
                a();
            } else {
                this.f291b.append(c2);
            }
        }
    }
}
