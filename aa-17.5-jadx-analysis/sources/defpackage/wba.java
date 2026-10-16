package defpackage;

/* loaded from: classes.dex */
public final class wba {
    public final boolean a;

    public wba() {
        boolean z = war.b;
        this.a = false;
    }

    public final vpn a() {
        if (!this.a) {
            return vpn.a;
        }
        boolean z = tez.a;
        return new vpn((vpo[]) tez.e.values().toArray(new vpo[0]));
    }

    public final iwq b(xkj xkjVar, iwi iwiVar) {
        int iOrdinal = xkjVar.ordinal();
        if (iOrdinal == 2) {
            return new iwd(iwiVar, this.a);
        }
        if (iOrdinal == 6) {
            return new iwe(iwiVar, this.a);
        }
        throw new IllegalStateException("Unsupported codec type: " + xkjVar.h);
    }

    public wba(boolean z, byte[] bArr) {
        this.a = z;
    }

    public wba(boolean z) {
        this.a = z;
    }
}
