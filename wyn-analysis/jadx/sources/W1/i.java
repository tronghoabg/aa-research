package W1;

import N1.C0765n;

/* loaded from: classes.dex */
public final class i extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f14967a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14968b;

    /* JADX WARN: Illegal instructions before constructor call */
    public i(int i5, int i10, int i11, int i12, C0765n c0765n, boolean z2, RuntimeException runtimeException) {
        StringBuilder sbH = R8.v.h("AudioTrack init failed ", i5, " Config(", i10, ", ");
        R8.v.i(i11, i12, ", ", ") ", sbH);
        sbH.append(c0765n);
        sbH.append(z2 ? " (recoverable)" : "");
        super(sbH.toString(), runtimeException);
        this.f14967a = i5;
        this.f14968b = z2;
    }
}
