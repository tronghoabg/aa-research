package i.b.k;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum j implements eg {
    LARGE(1),
    SMALL(2);


    /* renamed from: d, reason: collision with root package name */
    private final int f48531d;

    j(int i2) {
        this.f48531d = i2;
    }

    public static j a(int i2) {
        if (i2 == 1) {
            return LARGE;
        }
        if (i2 != 2) {
            return null;
        }
        return SMALL;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48531d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48531d);
    }
}
