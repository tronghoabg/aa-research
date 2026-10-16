package zf;

import java.util.Iterator;
import uf.InterfaceC4291a;

/* renamed from: zf.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4661a implements Iterable, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final char f48493a;

    /* renamed from: b, reason: collision with root package name */
    public final char f48494b;

    /* renamed from: c, reason: collision with root package name */
    public final int f48495c = 1;

    public AbstractC4661a(char c10, char c11) {
        this.f48493a = c10;
        this.f48494b = (char) Fe.c.t(c10, c11, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f48493a, this.f48494b, this.f48495c);
    }
}
