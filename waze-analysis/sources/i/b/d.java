package i.b;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum d implements eg {
    NONE(0),
    HIDE(1);


    /* renamed from: c, reason: collision with root package name */
    private static final eh f48390c = new f(1);

    /* renamed from: e, reason: collision with root package name */
    private final int f48392e;

    d(int i2) {
        this.f48392e = i2;
    }

    public static eh a() {
        return f48390c;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48392e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48392e);
    }
}
