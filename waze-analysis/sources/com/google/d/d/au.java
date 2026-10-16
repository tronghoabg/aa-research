package com.google.d.d;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class au extends ay {

    /* renamed from: b, reason: collision with root package name */
    private static final au f7440b = new au();
    private static final long serialVersionUID = 0;

    private au() {
        super("");
    }

    private Object readResolve() {
        return f7440b;
    }

    @Override // com.google.d.d.ay
    public final int a(ay ayVar) {
        return ayVar == this ? 0 : 1;
    }

    @Override // com.google.d.d.ay
    final Comparable c() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override // com.google.d.d.ay, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return a((ay) obj);
    }

    @Override // com.google.d.d.ay
    final void d(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // com.google.d.d.ay
    final void e(StringBuilder sb) {
        sb.append("+∞)");
    }

    @Override // com.google.d.d.ay
    final boolean f(Comparable comparable) {
        return false;
    }

    @Override // com.google.d.d.ay
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "+∞";
    }
}
