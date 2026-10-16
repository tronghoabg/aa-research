package defpackage;

import android.content.Context;
import android.text.format.Formatter;
import j$.nio.file.Path;

/* loaded from: classes2.dex */
public final class jrr extends jrv {
    private final Context a;
    private final Path b;
    private final long c;

    public jrr(Context context, Path path) {
        this.a = context;
        this.b = path;
        this.c = path.toFile().length();
    }

    public final String toString() {
        return this.b + ": " + Formatter.formatFileSize(this.a, this.c);
    }
}
