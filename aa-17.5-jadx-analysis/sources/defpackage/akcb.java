package defpackage;

/* loaded from: classes2.dex */
public enum akcb {
    UNSET(0),
    TRUE(1),
    FALSE(2);

    public final int d;

    akcb(int i) {
        this.d = i;
    }

    public static akcb a(Boolean bool) {
        return bool == null ? UNSET : bool.booleanValue() ? TRUE : FALSE;
    }
}
