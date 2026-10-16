package A;

import java.util.ArrayList;
import java.util.Iterator;
import l8.AbstractC3409K;
import l8.AbstractC3437s;
import l8.C3407I;
import m2.InterfaceC3479a;

/* loaded from: classes.dex */
public final class d0 implements InterfaceC0222o, InterfaceC3479a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f140a;

    public d0(int i5) {
        switch (i5) {
            case 2:
                this.f140a = new ArrayList();
                break;
            case 3:
                this.f140a = new ArrayList(20);
                break;
            default:
                this.f140a = new ArrayList();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    @Override // m2.InterfaceC3479a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(P2.a r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f9056b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto Lf
            r4 = r6
            goto L10
        Lf:
            r4 = r5
        L10:
            Q1.k.c(r4)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L23
            long r7 = r10.f9058d
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 >= 0) goto L23
        L21:
            r2 = r6
            goto L24
        L23:
            r2 = r5
        L24:
            java.util.ArrayList r3 = r9.f140a
            int r4 = r3.size()
            int r4 = r4 - r6
        L2b:
            if (r4 < 0) goto L4e
            java.lang.Object r7 = r3.get(r4)
            P2.a r7 = (P2.a) r7
            long r7 = r7.f9056b
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 < 0) goto L3e
            int r4 = r4 + r6
            r3.add(r4, r10)
            return r2
        L3e:
            java.lang.Object r7 = r3.get(r4)
            P2.a r7 = (P2.a) r7
            long r7 = r7.f9056b
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 > 0) goto L4b
            r2 = r5
        L4b:
            int r4 = r4 + (-1)
            goto L2b
        L4e:
            r3.add(r5, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: A.d0.a(P2.a, long):boolean");
    }

    @Override // m2.InterfaceC3479a
    public AbstractC3409K b(long j8) {
        int iF = f(j8);
        if (iF == 0) {
            C3407I c3407i = AbstractC3409K.f40056b;
            return l8.e0.f40101e;
        }
        P2.a aVar = (P2.a) this.f140a.get(iF - 1);
        long j10 = aVar.f9058d;
        if (j10 == -9223372036854775807L || j8 < j10) {
            return aVar.f9055a;
        }
        C3407I c3407i2 = AbstractC3409K.f40056b;
        return l8.e0.f40101e;
    }

    @Override // m2.InterfaceC3479a
    public long c(long j8) {
        ArrayList arrayList = this.f140a;
        if (arrayList.isEmpty() || j8 < ((P2.a) arrayList.get(0)).f9056b) {
            return -9223372036854775807L;
        }
        for (int i5 = 1; i5 < arrayList.size(); i5++) {
            long j10 = ((P2.a) arrayList.get(i5)).f9056b;
            if (j8 == j10) {
                return j10;
            }
            if (j8 < j10) {
                P2.a aVar = (P2.a) arrayList.get(i5 - 1);
                long j11 = aVar.f9058d;
                return (j11 == -9223372036854775807L || j11 > j8) ? aVar.f9056b : j11;
            }
        }
        P2.a aVar2 = (P2.a) AbstractC3437s.j(arrayList);
        long j12 = aVar2.f9058d;
        return (j12 == -9223372036854775807L || j8 < j12) ? aVar2.f9056b : j12;
    }

    @Override // m2.InterfaceC3479a
    public void clear() {
        this.f140a.clear();
    }

    @Override // m2.InterfaceC3479a
    public long d(long j8) {
        ArrayList arrayList = this.f140a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j8 < ((P2.a) arrayList.get(0)).f9056b) {
            return ((P2.a) arrayList.get(0)).f9056b;
        }
        for (int i5 = 1; i5 < arrayList.size(); i5++) {
            P2.a aVar = (P2.a) arrayList.get(i5);
            if (j8 < aVar.f9056b) {
                long j10 = ((P2.a) arrayList.get(i5 - 1)).f9058d;
                long j11 = aVar.f9056b;
                return (j10 == -9223372036854775807L || j10 <= j8 || j10 >= j11) ? j11 : j10;
            }
        }
        long j12 = ((P2.a) AbstractC3437s.j(arrayList)).f9058d;
        if (j12 == -9223372036854775807L || j8 >= j12) {
            return Long.MIN_VALUE;
        }
        return j12;
    }

    @Override // m2.InterfaceC3479a
    public void e(long j8) {
        int iF = f(j8);
        if (iF == 0) {
            return;
        }
        ArrayList arrayList = this.f140a;
        long j10 = ((P2.a) arrayList.get(iF - 1)).f9058d;
        if (j10 == -9223372036854775807L || j10 >= j8) {
            iF--;
        }
        arrayList.subList(0, iF).clear();
    }

    public int f(long j8) {
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f140a;
            if (i5 >= arrayList.size()) {
                return arrayList.size();
            }
            if (j8 < ((P2.a) arrayList.get(i5)).f9056b) {
                return i5;
            }
            i5++;
        }
    }

    @Override // A.InterfaceC0222o
    public InterfaceC0228v get(int i5) {
        return (C0229w) this.f140a.get(i5);
    }

    public d0(float f10, AbstractC0221n abstractC0221n) {
        zf.g gVarU0 = android.support.v4.media.session.b.u0(0, abstractC0221n.b());
        ArrayList arrayList = new ArrayList(ff.p.a0(gVarU0, 10));
        Iterator it = gVarU0.iterator();
        while (((zf.f) it).f48505c) {
            arrayList.add(new C0229w(f10, abstractC0221n.a(((zf.f) it).a())));
        }
        this.f140a = arrayList;
    }
}
