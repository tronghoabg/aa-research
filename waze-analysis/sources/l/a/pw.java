package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum pw implements com.google.v.eg {
    DESTINATION_TYPE_UNSPECIFIED(0),
    HOME(1),
    WORK(2),
    FAVORITE(3),
    RECENT(4),
    NEW_DESTINATION(5),
    CURRENT_LOCATION(8),
    UNRECOGNIZED(-1);


    /* renamed from: j, reason: collision with root package name */
    private final int f55263j;

    pw(int i2) {
        this.f55263j = i2;
    }

    public static pw a(int i2) {
        if (i2 == 0) {
            return DESTINATION_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return HOME;
        }
        if (i2 == 2) {
            return WORK;
        }
        if (i2 == 3) {
            return FAVORITE;
        }
        if (i2 == 4) {
            return RECENT;
        }
        if (i2 == 5) {
            return NEW_DESTINATION;
        }
        if (i2 != 8) {
            return null;
        }
        return CURRENT_LOCATION;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55263j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55263j);
    }
}
