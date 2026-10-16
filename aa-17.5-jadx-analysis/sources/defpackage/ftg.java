package defpackage;

import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache$Key;

/* loaded from: classes2.dex */
public final class ftg extends fsz {
    public final Drawable a;
    public final fsy b;
    public final int c;
    private final MemoryCache$Key d;
    private final String e;
    private final boolean f;
    private final boolean g = false;

    public ftg(Drawable drawable, fsy fsyVar, int i, MemoryCache$Key memoryCache$Key, String str, boolean z, boolean z2) {
        this.a = drawable;
        this.b = fsyVar;
        this.c = i;
        this.d = memoryCache$Key;
        this.e = str;
        this.f = z;
    }

    @Override // defpackage.fsz
    public final Drawable a() {
        return this.a;
    }

    @Override // defpackage.fsz
    public final fsy b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftg)) {
            return false;
        }
        ftg ftgVar = (ftg) obj;
        if (!affa.f(this.a, ftgVar.a) || !affa.f(this.b, ftgVar.b) || this.c != ftgVar.c || !affa.f(this.d, ftgVar.d) || !affa.f(this.e, ftgVar.e) || this.f != ftgVar.f) {
            return false;
        }
        boolean z = ftgVar.g;
        return true;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        MemoryCache$Key memoryCache$Key = this.d;
        int iHashCode2 = ((((iHashCode * 31) + this.c) * 31) + (memoryCache$Key != null ? memoryCache$Key.hashCode() : 0)) * 31;
        String str = this.e;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + a.f(this.f)) * 31) + a.f(false);
    }
}
