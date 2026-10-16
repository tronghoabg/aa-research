package e.a;

import j$.util.Objects;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cg<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cm f46520a;

    /* renamed from: b, reason: collision with root package name */
    private final ch f46521b;

    /* renamed from: c, reason: collision with root package name */
    private final int f46522c;

    /* synthetic */ cg(cm cmVar, ch chVar, int i2) {
        Objects.requireNonNull(cmVar);
        this.f46520a = cmVar;
        this.f46521b = chVar;
        this.f46522c = i2;
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return new cf(this);
    }
}
