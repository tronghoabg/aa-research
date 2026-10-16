package i.b.k;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum l implements eg {
    HORISONTAL(0),
    VERTICAL(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f48540d;

    l(int i2) {
        this.f48540d = i2;
    }

    public static l a(int i2) {
        if (i2 == 0) {
            return HORISONTAL;
        }
        if (i2 != 1) {
            return null;
        }
        return VERTICAL;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48540d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48540d);
    }
}
