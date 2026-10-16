package defpackage;

import java.io.File;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class aahj {
    public final File a;
    public final String b;
    public final long c;

    public aahj(File file, String str, long j) {
        zkt.n(file, "file");
        this.a = file;
        zkt.n(str, "filename");
        this.b = str;
        this.c = j;
    }

    public static aahj a(File file) {
        zkt.n(file, "file");
        return new aahj(file, file.getName(), file.lastModified());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aahj)) {
            return false;
        }
        aahj aahjVar = (aahj) obj;
        return a.C(this.a, aahjVar.a) && a.C(this.b, aahjVar.b) && a.C(Long.valueOf(this.c), Long.valueOf(aahjVar.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return String.format("DiskCacheEntry[%s@%s]", this.b, Long.valueOf(this.c));
    }
}
