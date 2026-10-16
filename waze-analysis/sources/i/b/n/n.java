package i.b.n;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum n implements eg {
    DISABLED(0),
    XML(1),
    TEXT(2),
    YAML(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f49161f;

    n(int i2) {
        this.f49161f = i2;
    }

    public static n a(int i2) {
        if (i2 == 0) {
            return DISABLED;
        }
        if (i2 == 1) {
            return XML;
        }
        if (i2 == 2) {
            return TEXT;
        }
        if (i2 != 3) {
            return null;
        }
        return YAML;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49161f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49161f);
    }
}
