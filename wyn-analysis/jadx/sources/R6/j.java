package r6;

import E5.T;
import f6.Z;

/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f44437a;

    /* renamed from: b, reason: collision with root package name */
    public final Z f44438b;

    /* renamed from: c, reason: collision with root package name */
    public final int f44439c;

    /* renamed from: d, reason: collision with root package name */
    public final T f44440d;

    public j(int i5, Z z2, int i10) {
        this.f44437a = i5;
        this.f44438b = z2;
        this.f44439c = i10;
        this.f44440d = z2.f35020d[i10];
    }

    public abstract int a();

    public abstract boolean b(j jVar);
}
