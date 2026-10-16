package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
final class hxq implements hxo {
    int a;
    public Bitmap.Config b;
    private final hxr c;

    public hxq(hxr hxrVar) {
        this.c = hxrVar;
    }

    @Override // defpackage.hxo
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hxq) {
            hxq hxqVar = (hxq) obj;
            if (this.a == hxqVar.a) {
                Bitmap.Config config = this.b;
                Bitmap.Config config2 = hxqVar.b;
                char[] cArr = ify.a;
                if (a.ao(config, config2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Bitmap.Config config = this.b;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return hxs.c(this.a, this.b);
    }
}
