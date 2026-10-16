package j$.util;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class OptionalDouble {
    public static final OptionalDouble a = new OptionalDouble();

    public static OptionalDouble empty() {
        return a;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof OptionalDouble);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "OptionalDouble.empty";
    }
}
