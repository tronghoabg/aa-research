package h.k;

import h.a.aj;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends aj {

    /* renamed from: a, reason: collision with root package name */
    private final int f48152a;

    /* renamed from: b, reason: collision with root package name */
    private final int f48153b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f48154c;

    /* renamed from: d, reason: collision with root package name */
    private int f48155d;

    public i(int i2, int i3, int i4) {
        this.f48152a = i4;
        this.f48153b = i3;
        boolean z = false;
        if (i4 <= 0 ? i2 >= i3 : i2 <= i3) {
            z = true;
        }
        this.f48154c = z;
        this.f48155d = true != z ? i3 : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f48154c;
    }

    @Override // h.a.aj
    public final int nextInt() {
        int i2 = this.f48155d;
        if (i2 != this.f48153b) {
            this.f48155d = this.f48152a + i2;
            return i2;
        }
        if (!this.f48154c) {
            throw new NoSuchElementException();
        }
        this.f48154c = false;
        return i2;
    }
}
