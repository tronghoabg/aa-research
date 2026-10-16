package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class hmj {
    public final String a;
    public final Bitmap b;
    public final int c;
    private final int d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ hmj(int i, String str, int i2, int i3) {
        i2 = (i3 & 4) != 0 ? 0 : i2;
        this(1 == (i3 & 1) ? 1 : i, (i3 & 2) != 0 ? null : str, i2, (Bitmap) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmj)) {
            return false;
        }
        hmj hmjVar = (hmj) obj;
        return this.c == hmjVar.c && affa.f(this.a, hmjVar.a) && this.d == hmjVar.d && affa.f(this.b, hmjVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = this.c;
        int i2 = this.d;
        Bitmap bitmap = this.b;
        return (((((i * 31) + iHashCode) * 31) + i2) * 31) + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public final String toString() {
        return "TranscriptionResult(state=" + ((Object) hdb.c(this.c)) + ", text=" + this.a + ", displayMode=" + this.d + ", icon=" + this.b + ")";
    }

    public hmj(int i, String str, int i2, Bitmap bitmap) {
        if (i == 0) {
            throw null;
        }
        this.c = i;
        this.a = str;
        this.d = i2;
        this.b = bitmap;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public hmj() {
        int i = 0;
        this(i, (String) null, i, 15);
    }
}
