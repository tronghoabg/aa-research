package b2;

import N1.C;
import N1.C0764m;
import N1.C0765n;
import N1.D;
import Q1.x;
import S1.r;
import a2.C1323c;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k2.C3168z;

/* loaded from: classes.dex */
public final class c implements o2.h {

    /* renamed from: o, reason: collision with root package name */
    public static final V1.c f19157o = new V1.c(16);

    /* renamed from: a, reason: collision with root package name */
    public final C1323c f19158a;

    /* renamed from: b, reason: collision with root package name */
    public final p f19159b;

    /* renamed from: c, reason: collision with root package name */
    public final ae.d f19160c;

    /* renamed from: f, reason: collision with root package name */
    public Z1.d f19163f;

    /* renamed from: g, reason: collision with root package name */
    public o2.m f19164g;

    /* renamed from: h, reason: collision with root package name */
    public Handler f19165h;

    /* renamed from: i, reason: collision with root package name */
    public a2.n f19166i;

    /* renamed from: j, reason: collision with root package name */
    public l f19167j;
    public Uri k;

    /* renamed from: l, reason: collision with root package name */
    public i f19168l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f19169m;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f19162e = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f19161d = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public long f19170n = -9223372036854775807L;

    public c(C1323c c1323c, ae.d dVar, p pVar) {
        this.f19158a = c1323c;
        this.f19159b = pVar;
        this.f19160c = dVar;
    }

    @Override // o2.h
    public final void A(o2.j jVar, long j8, long j10) {
        l lVar;
        o2.p pVar = (o2.p) jVar;
        m mVar = (m) pVar.f41328f;
        boolean z2 = mVar instanceof i;
        if (z2) {
            String str = mVar.f19230a;
            l lVar2 = l.f19220n;
            Uri uri = Uri.parse(str);
            C0764m c0764m = new C0764m();
            c0764m.f8183a = "0";
            c0764m.f8193l = C.m("application/x-mpegURL");
            List listSingletonList = Collections.singletonList(new k(uri, new C0765n(c0764m), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            lVar = new l("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            lVar = (l) mVar;
        }
        this.f19167j = lVar;
        this.k = ((k) lVar.f19222e.get(0)).f19214a;
        this.f19162e.add(new C1502a(this));
        List list2 = lVar.f19221d;
        int size = list2.size();
        for (int i5 = 0; i5 < size; i5++) {
            Uri uri2 = (Uri) list2.get(i5);
            this.f19161d.put(uri2, new b(this, uri2));
        }
        Uri uri3 = pVar.f41326d.f10922c;
        C3168z c3168z = new C3168z(j10);
        b bVar = (b) this.f19161d.get(this.k);
        if (z2) {
            bVar.f((i) mVar, c3168z);
        } else {
            bVar.c(false);
        }
        this.f19160c.getClass();
        this.f19163f.d(c3168z, 4);
    }

    @Override // o2.h
    public final U5.f E(o2.j jVar, long j8, long j10, IOException iOException, int i5) {
        long jMin;
        o2.p pVar = (o2.p) jVar;
        long j11 = pVar.f41323a;
        Uri uri = pVar.f41326d.f10922c;
        C3168z c3168z = new C3168z(j10);
        this.f19160c.getClass();
        if ((iOException instanceof D) || (iOException instanceof FileNotFoundException) || (iOException instanceof r) || (iOException instanceof o2.l)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i10 = S1.i.f10862b;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof S1.i) && ((S1.i) cause).f10863a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i5 - 1) * 1000, 5000);
        boolean z2 = jMin == -9223372036854775807L;
        this.f19163f.g(c3168z, pVar.f41325c, iOException, z2);
        return z2 ? o2.m.f41319f : new U5.f(jMin, 0, false);
    }

    public final i a(boolean z2, Uri uri) {
        HashMap map = this.f19161d;
        i iVar = ((b) map.get(uri)).f19149d;
        if (iVar != null && z2) {
            if (!uri.equals(this.k)) {
                List list = this.f19167j.f19222e;
                int i5 = 0;
                while (true) {
                    if (i5 >= list.size()) {
                        break;
                    }
                    if (uri.equals(((k) list.get(i5)).f19214a)) {
                        i iVar2 = this.f19168l;
                        if (iVar2 == null || !iVar2.f19203o) {
                            this.k = uri;
                            b bVar = (b) map.get(uri);
                            i iVar3 = bVar.f19149d;
                            if (iVar3 == null || !iVar3.f19203o) {
                                bVar.e(b(uri));
                            } else {
                                this.f19168l = iVar3;
                                this.f19166i.u(iVar3);
                            }
                        }
                    } else {
                        i5++;
                    }
                }
            }
            b bVar2 = (b) map.get(uri);
            i iVar4 = bVar2.f19149d;
            if (!bVar2.k) {
                bVar2.k = true;
                if (iVar4 != null && !iVar4.f19203o) {
                    bVar2.c(true);
                }
            }
        }
        return iVar;
    }

    public final Uri b(Uri uri) {
        e eVar;
        i iVar = this.f19168l;
        if (iVar == null || !iVar.f19210v.f19192e || (eVar = (e) iVar.f19208t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(eVar.f19174b));
        int i5 = eVar.f19175c;
        if (i5 != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i5));
        }
        return builderBuildUpon.build();
    }

    public final boolean c(Uri uri) {
        int i5;
        b bVar = (b) this.f19161d.get(uri);
        if (bVar.f19149d == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, x.W(bVar.f19149d.f19209u));
        i iVar = bVar.f19149d;
        return iVar.f19203o || (i5 = iVar.f19193d) == 2 || i5 == 1 || bVar.f19150e + jMax > jElapsedRealtime;
    }

    @Override // o2.h
    public final void w(o2.j jVar, long j8, long j10, boolean z2) {
        o2.p pVar = (o2.p) jVar;
        long j11 = pVar.f41323a;
        Uri uri = pVar.f41326d.f10922c;
        C3168z c3168z = new C3168z(j10);
        this.f19160c.getClass();
        this.f19163f.c(c3168z, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
