package h;

import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes7.dex */
public final class s implements Comparable<s> {

    /* renamed from: a, reason: collision with root package name */
    public static final e.c.h f48295a = new e.c.h(null);

    /* renamed from: b, reason: collision with root package name */
    private final int f48296b;

    private /* synthetic */ s(int i2) {
        this.f48296b = i2;
    }

    public static final /* synthetic */ s b(int i2) {
        return new s(i2);
    }

    public final /* synthetic */ int a() {
        return this.f48296b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(s sVar) {
        return h.g.b.x.a(this.f48296b ^ Integer.MIN_VALUE, sVar.f48296b ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s) && this.f48296b == ((s) obj).f48296b;
    }

    public final int hashCode() {
        return this.f48296b;
    }

    public final String toString() {
        return String.valueOf(this.f48296b & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }
}
