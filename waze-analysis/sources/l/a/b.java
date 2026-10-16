package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum b implements com.google.v.eg {
    BUTTON_UNSPECIFIED(0),
    USER_IMAGE(1),
    USERNAME(2),
    REGISTER(3),
    PASSWORD(5),
    LOGOUT(6),
    LOGIN(7),
    IN_CAR_SIGN_OUT(8),
    FULL_NAME(9),
    EMAIL(11),
    EDIT_AGE(12),
    DELETE_ACCOUNT(13),
    UNRECOGNIZED(-1);

    private final int o;

    b(int i2) {
        this.o = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.o;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.o);
    }
}
