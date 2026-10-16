package A;

import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: A.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0214g {

    /* renamed from: a, reason: collision with root package name */
    public final C0217j f155a;

    /* renamed from: b, reason: collision with root package name */
    public final int f156b;

    public C0214g(C0217j endState, int i5) {
        AbstractC3340k.e(endState, "endState");
        AbstractC3256n.m(i5, "endReason");
        this.f155a = endState;
        this.f156b = i5;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnimationResult(endReason=");
        int i5 = this.f156b;
        sb2.append(i5 != 1 ? i5 != 2 ? "null" : "Finished" : "BoundReached");
        sb2.append(", endState=");
        sb2.append(this.f155a);
        sb2.append(')');
        return sb2.toString();
    }
}
