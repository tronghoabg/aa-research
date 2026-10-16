package c9;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class j implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final long f19812a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19813b;

    public j(int i5) {
        int i10 = i5 + 1;
        int iFloor = (int) Math.floor(Math.log(i10) / Math.log(2.0d));
        this.f19813b = iFloor;
        this.f19812a = (((long) Math.pow(2.0d, iFloor)) - 1) & i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1591a(this);
    }
}
