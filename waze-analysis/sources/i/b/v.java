package i.b;

import com.google.v.eg;
import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum v implements eg {
    NONE(0),
    WAZE(1),
    GOOGLE(2),
    FACEBOOK(3),
    CPBEv1(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f49343g;

    v(int i2) {
        this.f49343g = i2;
    }

    public static ei a() {
        return k.f48525g;
    }

    public static v b(int i2) {
        if (i2 == 0) {
            return NONE;
        }
        if (i2 == 1) {
            return WAZE;
        }
        if (i2 == 2) {
            return GOOGLE;
        }
        if (i2 == 3) {
            return FACEBOOK;
        }
        if (i2 != 4) {
            return null;
        }
        return CPBEv1;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49343g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49343g);
    }
}
