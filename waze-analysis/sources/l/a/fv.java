package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum fv implements com.google.v.eg {
    ASSET_CHANGED_SOURCE_UNSPECIFIED(0),
    ASSET_CHANGED_SOURCE_DEEPLINK(1),
    ASSET_CHANGED_SOURCE_LEGACY_COPILOT(2),
    ASSET_CHANGED_SOURCE_MARKETPLACE(3),
    ASSET_CHANGED_SOURCE_SETTINGS(4),
    ASSET_CHANGED_SOURCE_DEFAULT(5),
    ASSET_CHANGED_SOURCE_TRANSPORT_SDK(6),
    UNRECOGNIZED(-1);


    /* renamed from: j, reason: collision with root package name */
    private final int f54886j;

    fv(int i2) {
        this.f54886j = i2;
    }

    public static fv a(int i2) {
        switch (i2) {
            case 0:
                return ASSET_CHANGED_SOURCE_UNSPECIFIED;
            case 1:
                return ASSET_CHANGED_SOURCE_DEEPLINK;
            case 2:
                return ASSET_CHANGED_SOURCE_LEGACY_COPILOT;
            case 3:
                return ASSET_CHANGED_SOURCE_MARKETPLACE;
            case 4:
                return ASSET_CHANGED_SOURCE_SETTINGS;
            case 5:
                return ASSET_CHANGED_SOURCE_DEFAULT;
            case 6:
                return ASSET_CHANGED_SOURCE_TRANSPORT_SDK;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54886j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54886j);
    }
}
