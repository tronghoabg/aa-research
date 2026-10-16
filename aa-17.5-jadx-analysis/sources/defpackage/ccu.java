package defpackage;

/* loaded from: classes.dex */
public final class ccu {
    public int a;

    public ccu(byte[] bArr) {
        this.a = 0;
    }

    public final String toString() {
        int i = this.a;
        String string = Integer.toString(hashCode(), 16);
        string.getClass();
        return "IntRef(element = " + i + ")@" + string;
    }

    public ccu() {
        this(null);
    }
}
