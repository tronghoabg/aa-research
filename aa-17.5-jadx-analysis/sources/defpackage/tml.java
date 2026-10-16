package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class tml {
    public final Context a;
    public final xxh b;
    private final xxh c;
    private final xxh d;

    public tml(Context context, xxh xxhVar, xxh xxhVar2, xxh xxhVar3) {
        this.a = context;
        this.c = xxhVar;
        this.d = xxhVar2;
        this.b = xxhVar3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tml) {
            tml tmlVar = (tml) obj;
            if (this.a.equals(tmlVar.a) && this.c.equals(tmlVar.c) && this.d.equals(tmlVar.d) && this.b.equals(tmlVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.d.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003)) * 1000003) ^ 1237) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        xxh xxhVar = this.b;
        xxh xxhVar2 = this.d;
        xxh xxhVar3 = this.c;
        return "CollectionBasisContext{context=" + String.valueOf(this.a) + ", accountNames=" + String.valueOf(xxhVar3) + ", stacktrace=" + String.valueOf(xxhVar2) + ", googlerOverridesCheckbox=false, executor=" + String.valueOf(xxhVar) + "}";
    }

    public tml() {
        throw null;
    }
}
