package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum bm implements com.google.v.eg {
    SUCCESS(1),
    INVALID_TOKEN(2),
    FAILED_INVALID_COMMUNITY_FOR_RIDER(3),
    NO_USER_FOUND_BY_TOKEN(4);


    /* renamed from: f, reason: collision with root package name */
    private final int f48627f;

    bm(int i2) {
        this.f48627f = i2;
    }

    public static bm a(int i2) {
        if (i2 == 1) {
            return SUCCESS;
        }
        if (i2 == 2) {
            return INVALID_TOKEN;
        }
        if (i2 == 3) {
            return FAILED_INVALID_COMMUNITY_FOR_RIDER;
        }
        if (i2 != 4) {
            return null;
        }
        return NO_USER_FOUND_BY_TOKEN;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48627f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48627f);
    }
}
