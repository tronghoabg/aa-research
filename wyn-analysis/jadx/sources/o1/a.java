package O1;

import Q1.k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import l8.e0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f8797a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8798b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f8799c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    public boolean f8800d;

    public a(e0 e0Var) {
        this.f8797a = e0Var;
        b bVar = b.f8801e;
        this.f8800d = false;
    }

    public final b a(b bVar) {
        if (bVar.equals(b.f8801e)) {
            throw new c(bVar);
        }
        int i5 = 0;
        while (true) {
            e0 e0Var = this.f8797a;
            if (i5 >= e0Var.f40103d) {
                return bVar;
            }
            d dVar = (d) e0Var.get(i5);
            b bVarA = dVar.a(bVar);
            if (dVar.isActive()) {
                k.g(!bVarA.equals(b.f8801e));
                bVar = bVarA;
            }
            i5++;
        }
    }

    public final void b() {
        ArrayList arrayList = this.f8798b;
        arrayList.clear();
        this.f8800d = false;
        int i5 = 0;
        while (true) {
            e0 e0Var = this.f8797a;
            if (i5 >= e0Var.f40103d) {
                break;
            }
            d dVar = (d) e0Var.get(i5);
            dVar.flush();
            if (dVar.isActive()) {
                arrayList.add(dVar);
            }
            i5++;
        }
        this.f8799c = new ByteBuffer[arrayList.size()];
        for (int i10 = 0; i10 <= c(); i10++) {
            this.f8799c[i10] = ((d) arrayList.get(i10)).c();
        }
    }

    public final int c() {
        return this.f8799c.length - 1;
    }

    public final boolean d() {
        return this.f8800d && ((d) this.f8798b.get(c())).b() && !this.f8799c[c()].hasRemaining();
    }

    public final boolean e() {
        return !this.f8798b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            e0 e0Var = this.f8797a;
            if (e0Var.f40103d == aVar.f8797a.f40103d) {
                for (int i5 = 0; i5 < e0Var.f40103d; i5++) {
                    if (e0Var.get(i5) == aVar.f8797a.get(i5)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(ByteBuffer byteBuffer) {
        boolean z2;
        for (boolean z10 = true; z10; z10 = z2) {
            z2 = false;
            int i5 = 0;
            while (i5 <= c()) {
                if (!this.f8799c[i5].hasRemaining()) {
                    ArrayList arrayList = this.f8798b;
                    d dVar = (d) arrayList.get(i5);
                    if (!dVar.b()) {
                        ByteBuffer byteBuffer2 = i5 > 0 ? this.f8799c[i5 - 1] : byteBuffer.hasRemaining() ? byteBuffer : d.f8806a;
                        long jRemaining = byteBuffer2.remaining();
                        dVar.d(byteBuffer2);
                        this.f8799c[i5] = dVar.c();
                        z2 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f8799c[i5].hasRemaining();
                    } else if (!this.f8799c[i5].hasRemaining() && i5 < c()) {
                        ((d) arrayList.get(i5 + 1)).e();
                    }
                }
                i5++;
            }
        }
    }

    public final int hashCode() {
        return this.f8797a.hashCode();
    }
}
