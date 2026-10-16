package b2;

import A.C0230x;
import N1.D;
import Q1.x;
import S1.u;
import T3.r;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import k2.C3168z;
import l8.AbstractC3409K;
import l8.AbstractC3437s;

/* loaded from: classes.dex */
public final class b implements o2.h {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f19146a;

    /* renamed from: b, reason: collision with root package name */
    public final o2.m f19147b = new o2.m("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* renamed from: c, reason: collision with root package name */
    public final S1.h f19148c;

    /* renamed from: d, reason: collision with root package name */
    public i f19149d;

    /* renamed from: e, reason: collision with root package name */
    public long f19150e;

    /* renamed from: f, reason: collision with root package name */
    public long f19151f;

    /* renamed from: g, reason: collision with root package name */
    public long f19152g;

    /* renamed from: h, reason: collision with root package name */
    public long f19153h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19154i;

    /* renamed from: j, reason: collision with root package name */
    public IOException f19155j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f19156l;

    public b(c cVar, Uri uri) {
        this.f19156l = cVar;
        this.f19146a = uri;
        this.f19148c = ((S1.g) cVar.f19158a.f17156b).b();
    }

    public static boolean a(b bVar, long j8) {
        bVar.f19153h = SystemClock.elapsedRealtime() + j8;
        c cVar = bVar.f19156l;
        if (!bVar.f19146a.equals(cVar.k)) {
            return false;
        }
        List list = cVar.f19167j.f19222e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i5 = 0; i5 < size; i5++) {
            b bVar2 = (b) cVar.f19161d.get(((k) list.get(i5)).f19214a);
            bVar2.getClass();
            if (jElapsedRealtime > bVar2.f19153h) {
                Uri uri = bVar2.f19146a;
                cVar.k = uri;
                bVar2.e(cVar.b(uri));
                return false;
            }
        }
        return true;
    }

    @Override // o2.h
    public final void A(o2.j jVar, long j8, long j10) {
        o2.p pVar = (o2.p) jVar;
        m mVar = (m) pVar.f41328f;
        Uri uri = pVar.f41326d.f10922c;
        C3168z c3168z = new C3168z(j10);
        if (mVar instanceof i) {
            f((i) mVar, c3168z);
            this.f19156l.f19163f.d(c3168z, 4);
        } else {
            D dB = D.b("Loaded playlist has unexpected type.", null);
            this.f19155j = dB;
            this.f19156l.f19163f.g(c3168z, 4, dB, true);
        }
        this.f19156l.f19160c.getClass();
    }

    @Override // o2.h
    public final U5.f E(o2.j jVar, long j8, long j10, IOException iOException, int i5) {
        o2.p pVar = (o2.p) jVar;
        long j11 = pVar.f41323a;
        Uri uri = pVar.f41326d.f10922c;
        C3168z c3168z = new C3168z(j10);
        boolean z2 = uri.getQueryParameter("_HLS_msn") != null;
        boolean z10 = iOException instanceof n;
        U5.f fVar = o2.m.f41318e;
        c cVar = this.f19156l;
        int i10 = pVar.f41325c;
        if (z2 || z10) {
            int i11 = iOException instanceof u ? ((u) iOException).f10908d : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            if (z10 || i11 == 400 || i11 == 503) {
                this.f19152g = SystemClock.elapsedRealtime();
                c(false);
                Z1.d dVar = cVar.f19163f;
                int i12 = x.f9724a;
                dVar.g(c3168z, i10, iOException, true);
                return fVar;
            }
        }
        C0230x c0230x = new C0230x(iOException, i5, 17);
        Iterator it = cVar.f19162e.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !((q) it.next()).a(this.f19146a, c0230x, false);
        }
        ae.d dVar2 = cVar.f19160c;
        if (z11) {
            dVar2.getClass();
            long jH = ae.d.h(c0230x);
            fVar = jH != -9223372036854775807L ? new U5.f(jH, 0, false) : o2.m.f41319f;
        }
        boolean zA = fVar.a();
        cVar.f19163f.g(c3168z, i10, iOException, true ^ zA);
        if (!zA) {
            dVar2.getClass();
        }
        return fVar;
    }

    public final Uri b() {
        i iVar = this.f19149d;
        Uri uri = this.f19146a;
        if (iVar != null) {
            h hVar = iVar.f19210v;
            if (hVar.f19188a != -9223372036854775807L || hVar.f19192e) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                i iVar2 = this.f19149d;
                if (iVar2.f19210v.f19192e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(iVar2.k + iVar2.f19206r.size()));
                    i iVar3 = this.f19149d;
                    if (iVar3.f19202n != -9223372036854775807L) {
                        AbstractC3409K abstractC3409K = iVar3.f19207s;
                        int size = abstractC3409K.size();
                        if (!abstractC3409K.isEmpty() && ((d) AbstractC3437s.j(abstractC3409K)).f19172m) {
                            size--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                h hVar2 = this.f19149d.f19210v;
                if (hVar2.f19188a != -9223372036854775807L) {
                    builderBuildUpon.appendQueryParameter("_HLS_skip", hVar2.f19189b ? "v2" : "YES");
                }
                return builderBuildUpon.build();
            }
        }
        return uri;
    }

    public final void c(boolean z2) {
        e(z2 ? b() : this.f19146a);
    }

    public final void d(Uri uri) {
        c cVar = this.f19156l;
        o2.p pVar = new o2.p(this.f19148c, uri, 4, cVar.f19159b.N(cVar.f19167j, this.f19149d));
        ae.d dVar = cVar.f19160c;
        int i5 = pVar.f41325c;
        this.f19147b.f(pVar, this, dVar.g(i5));
        cVar.f19163f.h(new C3168z(pVar.f41324b), i5, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void e(Uri uri) {
        this.f19153h = 0L;
        if (this.f19154i) {
            return;
        }
        o2.m mVar = this.f19147b;
        if (mVar.d() || mVar.c()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j8 = this.f19152g;
        if (jElapsedRealtime >= j8) {
            d(uri);
        } else {
            this.f19154i = true;
            this.f19156l.f19165h.postDelayed(new r(24, this, uri), j8 - jElapsedRealtime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(b2.i r65, k2.C3168z r66) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.b.f(b2.i, k2.z):void");
    }

    @Override // o2.h
    public final void w(o2.j jVar, long j8, long j10, boolean z2) {
        o2.p pVar = (o2.p) jVar;
        long j11 = pVar.f41323a;
        Uri uri = pVar.f41326d.f10922c;
        C3168z c3168z = new C3168z(j10);
        c cVar = this.f19156l;
        cVar.f19160c.getClass();
        cVar.f19163f.c(c3168z, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
