package i.b.n;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum w implements eg {
    UNKNOWN(0),
    REGULAR(1),
    ALONG_ROUTE(2),
    AUTOCOMPLETE(3),
    CATEGORY_REGULAR(4),
    CATEGORY_ALONG_ROUTE(5),
    CATEGORY_UPDATE(6);


    /* renamed from: i, reason: collision with root package name */
    private final int f49170i;

    w(int i2) {
        this.f49170i = i2;
    }

    public static w a(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return REGULAR;
            case 2:
                return ALONG_ROUTE;
            case 3:
                return AUTOCOMPLETE;
            case 4:
                return CATEGORY_REGULAR;
            case 5:
                return CATEGORY_ALONG_ROUTE;
            case 6:
                return CATEGORY_UPDATE;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49170i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49170i);
    }
}
