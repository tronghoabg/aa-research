package G5;

import E5.T;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class s extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f4439a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4440b;

    /* renamed from: c, reason: collision with root package name */
    public final T f4441c;

    public s(int i5, T t10, boolean z2) {
        super(AbstractC3256n.g(i5, "AudioTrack write failed: "));
        this.f4440b = z2;
        this.f4439a = i5;
        this.f4441c = t10;
    }
}
