package defpackage;

import java.io.File;

/* loaded from: classes.dex */
final class yoj extends yok {
    private final int d;
    private int f = 0;
    private final String b = "A";
    private final String c = "a";
    private final String e = "SourceFile";

    public yoj(int i) {
        this.d = i;
    }

    @Override // defpackage.yok
    public final int a() {
        return (char) this.d;
    }

    @Override // defpackage.yok
    public final String b() {
        return this.b.replace('/', '.');
    }

    @Override // defpackage.yok
    public final String c() {
        String str = this.e;
        return str.substring(str.lastIndexOf(File.separatorChar) + 1);
    }

    @Override // defpackage.yok
    public final String d() {
        return this.c;
    }

    @Override // defpackage.yok
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yoj)) {
            return false;
        }
        yoj yojVar = (yoj) obj;
        if (!this.c.equals(yojVar.c) || this.d != yojVar.d) {
            return false;
        }
        String str = yojVar.b;
        return true;
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((this.c.hashCode() + 4867) * 31) + this.d;
        this.f = iHashCode;
        return iHashCode;
    }
}
