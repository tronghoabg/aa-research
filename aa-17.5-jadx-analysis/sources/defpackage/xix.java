package defpackage;

/* loaded from: classes3.dex */
public enum xix implements abnz {
    CRITICAL_UI_FOCUS_UNKNOWN(0),
    CRITICAL_UI_FOCUS_PROJECTED(1),
    CRITICAL_UI_FOCUS_NATIVE(2);

    public final int d;

    xix(int i) {
        this.d = i;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
