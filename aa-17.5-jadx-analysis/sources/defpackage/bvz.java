package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class bvz {
    public final List a;
    public final int b;
    public int c;
    public final List d;
    public final aezr e;
    public final zh f;

    public bvz(List list, int i) {
        this.a = list;
        this.b = i;
        if (i < 0) {
            bxc.a("Invalid start index");
        }
        this.d = new ArrayList();
        zh zhVar = new zh(6);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            bzd bzdVar = (bzd) this.a.get(i3);
            zhVar.g(bzdVar.c, new squ(i3, i2, bzdVar.d));
            i2 += bzdVar.d;
        }
        this.f = zhVar;
        this.e = new aezy(new bvy(this, 0));
    }

    public final int a(bzd bzdVar) {
        squ squVar = (squ) this.f.a(bzdVar.c);
        if (squVar != null) {
            return squVar.b;
        }
        return -1;
    }

    public final int b(bzd bzdVar) {
        squ squVar = (squ) this.f.a(bzdVar.c);
        return squVar != null ? squVar.a : bzdVar.d;
    }

    public final void c(bzd bzdVar, int i) {
        this.f.g(bzdVar.c, new squ(-1, i, 0));
    }

    public final boolean d(int i, int i2) {
        int i3;
        int i4;
        zh zhVar = this.f;
        squ squVar = (squ) zhVar.a(i);
        if (squVar == null) {
            return false;
        }
        int i5 = squVar.b;
        int i6 = i2 - squVar.a;
        squVar.a = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = zhVar.c;
        long[] jArr = zhVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = i7 - length;
                int i9 = 0;
                while (true) {
                    i3 = 8 - ((~i8) >>> 31);
                    if (i9 >= i3) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        squ squVar2 = (squ) objArr[(i7 << 3) + i9];
                        if (squVar2.b >= i5 && !affa.f(squVar2, squVar) && (i4 = squVar2.b + i6) >= 0) {
                            squVar2.b = i4;
                        }
                    }
                    j >>= 8;
                    i9++;
                }
                if (i3 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }

    public final void e(bzd bzdVar) {
        this.d.add(bzdVar);
    }
}
