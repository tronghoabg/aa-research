package i.b.k;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum m implements eg {
    FULL_SCREEN(0),
    MESSAGE_BOX(1),
    ETA_CARD(2),
    ETA_POPUP(3),
    APP_LAUNCH_DIALOG(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f48547g;

    m(int i2) {
        this.f48547g = i2;
    }

    public static m a(int i2) {
        if (i2 == 0) {
            return FULL_SCREEN;
        }
        if (i2 == 1) {
            return MESSAGE_BOX;
        }
        if (i2 == 2) {
            return ETA_CARD;
        }
        if (i2 == 3) {
            return ETA_POPUP;
        }
        if (i2 != 4) {
            return null;
        }
        return APP_LAUNCH_DIALOG;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48547g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48547g);
    }
}
