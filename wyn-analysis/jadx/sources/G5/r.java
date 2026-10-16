package G5;

import E5.T;

/* loaded from: classes3.dex */
public final class r extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f4436a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4437b;

    /* renamed from: c, reason: collision with root package name */
    public final T f4438c;

    /* JADX WARN: Illegal instructions before constructor call */
    public r(int i5, int i10, int i11, int i12, T t10, boolean z2, RuntimeException runtimeException) {
        StringBuilder sbH = R8.v.h("AudioTrack init failed ", i5, " Config(", i10, ", ");
        R8.v.i(i11, i12, ", ", ")", sbH);
        sbH.append(z2 ? " (recoverable)" : "");
        super(sbH.toString(), runtimeException);
        this.f4436a = i5;
        this.f4437b = z2;
        this.f4438c = t10;
    }
}
