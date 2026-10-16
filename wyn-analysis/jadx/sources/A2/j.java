package a2;

import N1.C0765n;
import N1.O;
import Q1.x;
import S1.A;
import android.net.Uri;
import android.util.Pair;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k2.C3145b;
import l8.AbstractC3409K;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final C1324d f17170a;

    /* renamed from: b, reason: collision with root package name */
    public final S1.h f17171b;

    /* renamed from: c, reason: collision with root package name */
    public final S1.h f17172c;

    /* renamed from: d, reason: collision with root package name */
    public final v f17173d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri[] f17174e;

    /* renamed from: f, reason: collision with root package name */
    public final C0765n[] f17175f;

    /* renamed from: g, reason: collision with root package name */
    public final b2.c f17176g;

    /* renamed from: h, reason: collision with root package name */
    public final O f17177h;

    /* renamed from: i, reason: collision with root package name */
    public final List f17178i;
    public final V1.k k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f17180l;

    /* renamed from: n, reason: collision with root package name */
    public C3145b f17182n;

    /* renamed from: o, reason: collision with root package name */
    public Uri f17183o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f17184p;

    /* renamed from: q, reason: collision with root package name */
    public n2.q f17185q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f17187s;

    /* renamed from: j, reason: collision with root package name */
    public final Y9.c f17179j = new Y9.c(29);

    /* renamed from: m, reason: collision with root package name */
    public byte[] f17181m = x.f9729f;

    /* renamed from: r, reason: collision with root package name */
    public long f17186r = -9223372036854775807L;

    public j(C1324d c1324d, b2.c cVar, Uri[] uriArr, C0765n[] c0765nArr, C1323c c1323c, A a5, v vVar, List list, V1.k kVar) {
        this.f17170a = c1324d;
        this.f17176g = cVar;
        this.f17174e = uriArr;
        this.f17175f = c0765nArr;
        this.f17173d = vVar;
        this.f17178i = list;
        this.k = kVar;
        S1.h hVarB = ((S1.g) c1323c.f17156b).b();
        this.f17171b = hVarB;
        if (a5 != null) {
            hVarB.C(a5);
        }
        this.f17172c = ((S1.g) c1323c.f17156b).b();
        this.f17177h = new O("", c0765nArr);
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < uriArr.length; i5++) {
            if ((c0765nArr[i5].f8225f & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                arrayList.add(Integer.valueOf(i5));
            }
        }
        O o7 = this.f17177h;
        int[] iArrK = S3.f.K(arrayList);
        h hVar = new h(o7, iArrK);
        hVar.f17165g = hVar.q(o7.f8076d[iArrK[0]]);
        this.f17185q = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l2.m[] a(a2.l r19, long r20) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.j.a(a2.l, long):l2.m[]");
    }

    public final int b(l lVar) {
        if (lVar.f17204o == -1) {
            return 1;
        }
        b2.i iVarA = this.f17176g.a(false, this.f17174e[this.f17177h.a(lVar.f39892d)]);
        iVarA.getClass();
        int i5 = (int) (lVar.f39936j - iVarA.k);
        if (i5 < 0) {
            return 1;
        }
        AbstractC3409K abstractC3409K = iVarA.f19206r;
        AbstractC3409K abstractC3409K2 = i5 < abstractC3409K.size() ? ((b2.f) abstractC3409K.get(i5)).f19177m : iVarA.f19207s;
        int size = abstractC3409K2.size();
        int i10 = lVar.f17204o;
        if (i10 >= size) {
            return 2;
        }
        b2.d dVar = (b2.d) abstractC3409K2.get(i10);
        if (dVar.f19172m) {
            return 0;
        }
        return Objects.equals(Uri.parse(Q1.k.t(iVarA.f19230a, dVar.f19178a)), lVar.f39890b.f10870a) ? 1 : 2;
    }

    public final Pair c(l lVar, boolean z2, b2.i iVar, long j8, long j10) {
        boolean z10 = true;
        if (lVar != null && !z2) {
            boolean z11 = lVar.f17197H;
            long jA = lVar.f39936j;
            int i5 = lVar.f17204o;
            if (!z11) {
                return new Pair(Long.valueOf(jA), Integer.valueOf(i5));
            }
            if (i5 == -1) {
                jA = lVar.a();
            }
            return new Pair(Long.valueOf(jA), Integer.valueOf(i5 != -1 ? i5 + 1 : -1));
        }
        long j11 = iVar.f19209u + j8;
        if (lVar != null && !this.f17184p) {
            j10 = lVar.f39895g;
        }
        boolean z12 = iVar.f19203o;
        long j12 = iVar.k;
        AbstractC3409K abstractC3409K = iVar.f19206r;
        if (!z12 && j10 >= j11) {
            return new Pair(Long.valueOf(j12 + abstractC3409K.size()), -1);
        }
        long j13 = j10 - j8;
        Long lValueOf = Long.valueOf(j13);
        int i10 = 0;
        if (this.f17176g.f19169m && lVar != null) {
            z10 = false;
        }
        int iC = x.c(abstractC3409K, lValueOf, z10);
        long j14 = iC + j12;
        if (iC >= 0) {
            b2.f fVar = (b2.f) abstractC3409K.get(iC);
            long j15 = fVar.f19182e + fVar.f19180c;
            AbstractC3409K abstractC3409K2 = iVar.f19207s;
            AbstractC3409K abstractC3409K3 = j13 < j15 ? fVar.f19177m : abstractC3409K2;
            while (true) {
                if (i10 >= abstractC3409K3.size()) {
                    break;
                }
                b2.d dVar = (b2.d) abstractC3409K3.get(i10);
                if (j13 >= dVar.f19182e + dVar.f19180c) {
                    i10++;
                } else if (dVar.f19171l) {
                    j14 += abstractC3409K3 == abstractC3409K2 ? 1L : 0L;
                    i = i10;
                }
            }
        }
        return new Pair(Long.valueOf(j14), Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1326f d(Uri uri, int i5, boolean z2) {
        if (uri == null) {
            return null;
        }
        Y9.c cVar = this.f17179j;
        byte[] bArr = (byte[]) ((C1325e) cVar.f16739b).remove(uri);
        if (bArr != null) {
            return null;
        }
        S1.k kVar = new S1.k(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        C0765n c0765n = this.f17175f[i5];
        int iU = this.f17185q.u();
        Object objP = this.f17185q.p();
        byte[] bArr2 = this.f17181m;
        C1326f c1326f = new C1326f(this.f17172c, kVar, 3, c0765n, iU, objP, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = x.f9729f;
        }
        c1326f.f17161j = bArr2;
        return c1326f;
    }
}
