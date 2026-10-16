package Y1;

import E5.Y;
import N1.J;
import Q1.x;
import android.net.Uri;
import f2.InterfaceC2551a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements InterfaceC2551a {

    /* renamed from: a, reason: collision with root package name */
    public final long f16310a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16311b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16312c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16313d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16314e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16315f;

    /* renamed from: g, reason: collision with root package name */
    public final long f16316g;

    /* renamed from: h, reason: collision with root package name */
    public final long f16317h;

    /* renamed from: i, reason: collision with root package name */
    public final t f16318i;

    /* renamed from: j, reason: collision with root package name */
    public final Y f16319j;
    public final Uri k;

    /* renamed from: l, reason: collision with root package name */
    public final i f16320l;

    /* renamed from: m, reason: collision with root package name */
    public final List f16321m;

    public c(long j8, long j10, long j11, boolean z2, long j12, long j13, long j14, long j15, i iVar, t tVar, Y y10, Uri uri, ArrayList arrayList) {
        this.f16310a = j8;
        this.f16311b = j10;
        this.f16312c = j11;
        this.f16313d = z2;
        this.f16314e = j12;
        this.f16315f = j13;
        this.f16316g = j14;
        this.f16317h = j15;
        this.f16320l = iVar;
        this.f16318i = tVar;
        this.k = uri;
        this.f16319j = y10;
        this.f16321m = arrayList;
    }

    @Override // f2.InterfaceC2551a
    public final Object a(List list) {
        long j8;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new J());
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= this.f16321m.size()) {
                break;
            }
            if (((J) linkedList.peek()).f8045a != i5) {
                long jC = c(i5);
                if (jC != -9223372036854775807L) {
                    j10 += jC;
                }
            } else {
                h hVarB = b(i5);
                List list2 = hVarB.f16344c;
                J j11 = (J) linkedList.poll();
                int i10 = j11.f8045a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i11 = j11.f8046b;
                    a aVar = (a) list2.get(i11);
                    List list3 = aVar.f16302c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(j11.f8047c));
                        j11 = (J) linkedList.poll();
                        if (j11.f8045a != i10) {
                            break;
                        }
                    } while (j11.f8046b == i11);
                    j8 = j10;
                    arrayList2.add(new a(aVar.f16300a, aVar.f16301b, arrayList3, aVar.f16303d, aVar.f16304e, aVar.f16305f));
                    if (j11.f8045a != i10) {
                        break;
                    }
                    j10 = j8;
                }
                linkedList.addFirst(j11);
                arrayList.add(new h(hVarB.f16342a, hVarB.f16343b - j8, arrayList2, hVarB.f16345d));
                j10 = j8;
            }
            i5++;
        }
        long j12 = j10;
        long j13 = this.f16311b;
        return new c(this.f16310a, j13 != -9223372036854775807L ? j13 - j12 : -9223372036854775807L, this.f16312c, this.f16313d, this.f16314e, this.f16315f, this.f16316g, this.f16317h, this.f16320l, this.f16318i, this.f16319j, this.k, arrayList);
    }

    public final h b(int i5) {
        return (h) this.f16321m.get(i5);
    }

    public final long c(int i5) {
        long j8;
        long j10;
        List list = this.f16321m;
        if (i5 == list.size() - 1) {
            j8 = this.f16311b;
            if (j8 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j10 = ((h) list.get(i5)).f16343b;
        } else {
            j8 = ((h) list.get(i5 + 1)).f16343b;
            j10 = ((h) list.get(i5)).f16343b;
        }
        return j8 - j10;
    }

    public final long d(int i5) {
        return x.K(c(i5));
    }
}
