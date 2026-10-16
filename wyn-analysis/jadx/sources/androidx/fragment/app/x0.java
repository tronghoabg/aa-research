package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class x0 extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f18565b = new StringBuilder(128);

    /* renamed from: a, reason: collision with root package name */
    public final String f18564a = "FragmentManager";

    public final void a() {
        StringBuilder sb2 = this.f18565b;
        if (sb2.length() > 0) {
            Log.d(this.f18564a, sb2.toString());
            sb2.delete(0, sb2.length());
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
    public final void write(char[] cArr, int i5, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            char c10 = cArr[i5 + i11];
            if (c10 == '\n') {
                a();
            } else {
                this.f18565b.append(c10);
            }
        }
    }
}
