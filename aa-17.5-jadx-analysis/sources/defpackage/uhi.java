package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
abstract class uhi {
    public abstract ujf a();

    public abstract int b();

    public int c() {
        throw null;
    }

    public final boolean d() {
        return c() > 1;
    }

    public final uke[] e() {
        int iB = b();
        ujf ujfVarA = a();
        return iB == 2 ? ujfVarA.n : ujfVarA.o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uhi) {
            return Arrays.equals(e(), ((uhi) obj).e());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(e());
    }
}
