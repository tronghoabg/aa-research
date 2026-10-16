package h.k;

import h.a.y;
import h.g.b.x;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class a implements Iterable, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final char f48140a;

    /* renamed from: b, reason: collision with root package name */
    private final char f48141b;

    /* renamed from: c, reason: collision with root package name */
    private final int f48142c = 1;

    public a(char c2, char c3) {
        this.f48140a = c2;
        this.f48141b = (char) h.e.b.d(c2, c3, 1);
    }

    public final char a() {
        return this.f48140a;
    }

    public final char b() {
        return this.f48141b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (isEmpty() && ((a) obj).isEmpty()) {
                return true;
            }
            a aVar = (a) obj;
            if (this.f48140a != aVar.f48140a || this.f48141b != aVar.f48141b) {
                return false;
            }
            int i2 = aVar.f48142c;
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f48140a * 31) + this.f48141b) * 31) + 1;
    }

    public boolean isEmpty() {
        return x.a(this.f48140a, this.f48141b) > 0;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new y(this.f48140a, this.f48141b);
    }

    public String toString() {
        return this.f48140a + ".." + this.f48141b + " step 1";
    }
}
