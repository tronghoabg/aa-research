package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jrs extends defpackage.jrw {
    private final android.content.Context a;
    private final j$.nio.file.Path b;
    private final long c;

    public jrs(android.content.Context context, j$.nio.file.Path path) {
        this.a = context;
        this.b = path;
        this.c = path.toFile().length();
    }

    public final java.lang.String toString() {
        return this.b + ": " + android.text.format.Formatter.formatFileSize(this.a, this.c);
    }
}
