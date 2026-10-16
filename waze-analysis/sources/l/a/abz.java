package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum abz implements com.google.v.eg {
    POPUP_INFORMATION_ELEMENTS_UNSPECIFIED(0),
    TOLL_INFORMATION_SHOWN(1),
    CARBON_EMISSION_INFORMATION_SHOWN(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f52182f;

    abz(int i2) {
        this.f52182f = i2;
    }

    public static abz a(int i2) {
        if (i2 == 0) {
            return POPUP_INFORMATION_ELEMENTS_UNSPECIFIED;
        }
        if (i2 == 1) {
            return TOLL_INFORMATION_SHOWN;
        }
        if (i2 != 2) {
            return null;
        }
        return CARBON_EMISSION_INFORMATION_SHOWN;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52182f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52182f);
    }
}
