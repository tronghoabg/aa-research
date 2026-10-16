package j$.util.stream;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public abstract class e3 {
    public static b3 a(w2 w2Var, long j, long j2) {
        if (j >= 0) {
            return new b3(w2Var, u3.s | (j2 != -1 ? u3.t : 0), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }
}
