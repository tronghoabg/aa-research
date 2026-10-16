package defpackage;

/* loaded from: classes2.dex */
public final class oat extends oaw {
    public static final oat a = new oat();
    private static final long c = -4294967296L;
    private static final long d = -72057594037927936L;
    private static final long e = oaw.b;

    private oat() {
    }

    @Override // defpackage.oax
    public final long a() {
        return d;
    }

    @Override // defpackage.oaw, defpackage.oax
    public final long d() {
        return e;
    }

    @Override // defpackage.oaw, defpackage.oax
    public final long e() {
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oat)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1142216618;
    }

    public final String toString() {
        return "Default";
    }
}
