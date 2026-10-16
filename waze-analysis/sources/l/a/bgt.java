package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bgt implements com.google.v.eg {
    SUGGESTION_CARD_CTA_UNSPECIFIED(0),
    SUGGESTION_CARD_CTA_RESUME_DRIVE(1),
    SUGGESTION_CARD_CTA_VIEW_ROUTES(2),
    SUGGESTION_CARD_CTA_GO_NOW(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f53956g;

    bgt(int i2) {
        this.f53956g = i2;
    }

    public static bgt a(int i2) {
        if (i2 == 0) {
            return SUGGESTION_CARD_CTA_UNSPECIFIED;
        }
        if (i2 == 1) {
            return SUGGESTION_CARD_CTA_RESUME_DRIVE;
        }
        if (i2 == 2) {
            return SUGGESTION_CARD_CTA_VIEW_ROUTES;
        }
        if (i2 != 3) {
            return null;
        }
        return SUGGESTION_CARD_CTA_GO_NOW;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53956g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53956g);
    }
}
