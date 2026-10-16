package defpackage;

/* loaded from: classes3.dex */
final class ydk extends ydn {
    public static final ydk a = new ydk();
    private static final long serialVersionUID = 0;

    private ydk() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.ydn
    /* renamed from: a */
    public final int compareTo(ydn ydnVar) {
        return ydnVar == this ? 0 : 1;
    }

    @Override // defpackage.ydn, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((ydn) obj);
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "+∞";
    }
}
