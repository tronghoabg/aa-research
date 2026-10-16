package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum qo implements com.google.v.eg {
    CHIP_TRIGGER_UNSPECIFIED(0),
    SET_HOME_CTA(1),
    SET_WORK_CTA(2),
    NEW_FAVORITE_CTA(3),
    STICKY(4),
    MORE(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f55310i;

    qo(int i2) {
        this.f55310i = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55310i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55310i);
    }
}
