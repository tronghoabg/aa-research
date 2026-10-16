package h.k;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class h implements Iterable<Integer>, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f48149a;

    /* renamed from: b, reason: collision with root package name */
    private final int f48150b;

    /* renamed from: c, reason: collision with root package name */
    private final int f48151c;

    public h(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        this.f48149a = i2;
        this.f48150b = h.e.b.d(i2, i3, i4);
        this.f48151c = i4;
    }

    public final int a() {
        return this.f48149a;
    }

    public final int b() {
        return this.f48150b;
    }

    public final int c() {
        return this.f48151c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            if (isEmpty() && ((h) obj).isEmpty()) {
                return true;
            }
            h hVar = (h) obj;
            return this.f48149a == hVar.f48149a && this.f48150b == hVar.f48150b && this.f48151c == hVar.f48151c;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f48149a * 31) + this.f48150b) * 31) + this.f48151c;
    }

    public boolean isEmpty() {
        int i2 = this.f48151c;
        int i3 = this.f48149a;
        int i4 = this.f48150b;
        return i2 > 0 ? i3 > i4 : i3 < i4;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Integer> iterator() {
        return new i(this.f48149a, this.f48150b, this.f48151c);
    }

    public String toString() {
        StringBuilder sb;
        String str;
        int i2 = this.f48151c;
        int i3 = this.f48149a;
        int i4 = this.f48150b;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            str = "..";
        } else {
            i2 = -i2;
            sb = new StringBuilder();
            sb.append(i3);
            str = " downTo ";
        }
        sb.append(str);
        sb.append(i4);
        sb.append(" step ");
        sb.append(i2);
        return sb.toString();
    }
}
