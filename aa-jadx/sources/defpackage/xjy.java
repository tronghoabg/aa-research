package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum xjy implements defpackage.abpb {
    CRITICAL_UI_FOCUS_UNKNOWN(0),
    CRITICAL_UI_FOCUS_PROJECTED(1),
    CRITICAL_UI_FOCUS_NATIVE(2);

    public final int d;

    xjy(int i) {
        this.d = i;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
