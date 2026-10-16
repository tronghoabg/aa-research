package i.d.a;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes8.dex */
public enum b implements eg {
    Unknown(0),
    CachedMethod(1),
    DeleteCachedMethod(2),
    PutCachedMethod(3);


    /* renamed from: e, reason: collision with root package name */
    private static final eh f49621e = new a();

    /* renamed from: g, reason: collision with root package name */
    private final int f49623g;

    b(int i2) {
        this.f49623g = i2;
    }

    public static eh a() {
        return f49621e;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49623g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49623g);
    }
}
