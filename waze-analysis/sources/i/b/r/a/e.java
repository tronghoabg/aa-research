package i.b.r.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum e implements eg {
    ARRIVE_AT(1),
    LEAVE_BY(2);


    /* renamed from: d, reason: collision with root package name */
    private final int f49286d;

    e(int i2) {
        this.f49286d = i2;
    }

    public static e a(int i2) {
        if (i2 == 1) {
            return ARRIVE_AT;
        }
        if (i2 != 2) {
            return null;
        }
        return LEAVE_BY;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49286d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49286d);
    }
}
