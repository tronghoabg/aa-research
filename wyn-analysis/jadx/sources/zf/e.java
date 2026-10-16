package zf;

import java.util.Iterator;
import uf.InterfaceC4291a;

/* loaded from: classes5.dex */
public class e implements Iterable, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final int f48500a;

    /* renamed from: b, reason: collision with root package name */
    public final int f48501b;

    /* renamed from: c, reason: collision with root package name */
    public final int f48502c;

    public e(int i5, int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i11 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f48500a = i5;
        this.f48501b = Fe.c.t(i5, i10, i11);
        this.f48502c = i11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (isEmpty() && ((e) obj).isEmpty()) {
            return true;
        }
        e eVar = (e) obj;
        return this.f48500a == eVar.f48500a && this.f48501b == eVar.f48501b && this.f48502c == eVar.f48502c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f48500a * 31) + this.f48501b) * 31) + this.f48502c;
    }

    public boolean isEmpty() {
        int i5 = this.f48502c;
        int i10 = this.f48501b;
        int i11 = this.f48500a;
        return i5 > 0 ? i11 > i10 : i11 < i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f(this.f48500a, this.f48501b, this.f48502c);
    }

    public String toString() {
        StringBuilder sb2;
        int i5 = this.f48501b;
        int i10 = this.f48500a;
        int i11 = this.f48502c;
        if (i11 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append("..");
            sb2.append(i5);
            sb2.append(" step ");
            sb2.append(i11);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append(" downTo ");
            sb2.append(i5);
            sb2.append(" step ");
            sb2.append(-i11);
        }
        return sb2.toString();
    }
}
