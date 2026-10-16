package com.vungle.ads.internal.model;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.mime.MimeTypes;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f33113a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33114b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33115c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f33116d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f33117e;

    /* renamed from: f, reason: collision with root package name */
    public a f33118f;

    /* renamed from: g, reason: collision with root package name */
    public String f33119g;

    /* renamed from: h, reason: collision with root package name */
    public long f33120h;

    /* renamed from: i, reason: collision with root package name */
    public long f33121i;

    /* renamed from: j, reason: collision with root package name */
    public long f33122j;
    public Long k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f33123l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f33124m;

    public /* synthetic */ b(String str, String str2) {
        this("vmURL", str, str2, true, null);
    }

    public final String a() {
        return this.f33113a;
    }

    public final void b(long j8) {
        this.f33120h = j8;
    }

    public final String c() {
        return this.f33115c;
    }

    public final String d() {
        return this.f33119g;
    }

    public final Integer e() {
        return this.f33117e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !b.class.equals(obj.getClass())) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f33118f == bVar.f33118f && this.f33120h == bVar.f33120h && this.f33116d == bVar.f33116d && AbstractC3340k.a(this.f33113a, bVar.f33113a) && AbstractC3340k.a(this.f33114b, bVar.f33114b) && this.f33121i == bVar.f33121i && AbstractC3340k.a(this.f33117e, bVar.f33117e)) {
            return AbstractC3340k.a(this.f33115c, bVar.f33115c);
        }
        return false;
    }

    public final Long f() {
        return this.k;
    }

    public final long g() {
        return this.f33122j;
    }

    public final String h() {
        return this.f33114b;
    }

    public final int hashCode() {
        int iHashCode = (this.f33118f.hashCode() + N0.a.c(N0.a.c(this.f33113a.hashCode() * 31, 31, this.f33114b), 31, this.f33115c)) * 31;
        long j8 = this.f33120h;
        int i5 = (iHashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        int i10 = this.f33116d ? 1231 : 1237;
        long j10 = this.f33121i;
        int i11 = (((i10 + i5) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        Integer num = this.f33117e;
        return i11 + (num != null ? num.hashCode() : 0);
    }

    public final boolean i() {
        return this.f33118f == a.DOWNLOAD_SUCCESS;
    }

    public final boolean j() {
        return AbstractC3340k.a(this.f33113a, "vmURL");
    }

    public final boolean k() {
        return AbstractC3340k.a(this.f33113a, "MAIN_IMAGE") || AbstractC3340k.a(this.f33113a, "MAIN_VIDEO");
    }

    public final boolean l() {
        return AbstractC3340k.a(this.f33113a, "MAIN_VIDEO");
    }

    public final boolean m() {
        return AbstractC3340k.a(this.f33113a, "VUNGLE_PRIVACY_ICON_URL");
    }

    public final boolean n() {
        return this.f33116d;
    }

    public final boolean o() {
        return this.f33124m.get();
    }

    public final void p() {
        if (this.f33124m.getAndSet(false)) {
            synchronized (this.f33123l) {
                this.f33123l.notifyAll();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {, blocks: (B:8:0x0018, B:10:0x001e, B:7:0x0014, B:4:0x000b), top: B:18:0x000b, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            r5 = this;
            java.lang.String r0 = "Interrupted while waiting for file download: "
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.f33124m
            r2 = 1
            r1.set(r2)
            java.lang.Object r1 = r5.f33123l
            monitor-enter(r1)
            java.lang.Object r2 = r5.f33123l     // Catch: java.lang.Throwable -> L13
            r2.wait()     // Catch: java.lang.Throwable -> L13
            ef.C r2 = ef.C2515C.f34653a     // Catch: java.lang.Throwable -> L13
            goto L18
        L13:
            r2 = move-exception
            ef.m r2 = Fe.e.z(r2)     // Catch: java.lang.Throwable -> L32
        L18:
            java.lang.Throwable r2 = ef.C2530n.a(r2)     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L34
            boolean r3 = com.vungle.ads.internal.util.u.f33874a     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "AdAsset"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L32
            r4.append(r5)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L32
            com.vungle.ads.internal.util.t.a(r3, r0, r2)     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r0 = move-exception
            goto L36
        L34:
            monitor-exit(r1)
            return
        L36:
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.model.b.q():void");
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("AdAsset(adIdentifier=");
        sbA.append(this.f33113a);
        sbA.append(", serverPath=");
        sbA.append(this.f33114b);
        sbA.append(", localPath=");
        sbA.append(this.f33115c);
        sbA.append(", status=");
        sbA.append(this.f33118f);
        sbA.append(", fileSize=");
        sbA.append(this.f33120h);
        sbA.append(", contentLength=");
        sbA.append(this.f33121i);
        sbA.append(", isRequired=");
        sbA.append(this.f33116d);
        sbA.append(", percentage=");
        sbA.append(this.f33117e);
        sbA.append(')');
        return sbA.toString();
    }

    public b(String adIdentifier, String serverPath, String localPath, boolean z2, Integer num) {
        AbstractC3340k.e(adIdentifier, "adIdentifier");
        AbstractC3340k.e(serverPath, "serverPath");
        AbstractC3340k.e(localPath, "localPath");
        this.f33113a = adIdentifier;
        this.f33114b = serverPath;
        this.f33115c = localPath;
        this.f33116d = z2;
        this.f33117e = num;
        this.f33118f = a.NEW;
        this.f33119g = MimeTypes.OCTET_STREAM;
        this.f33123l = new Object();
        this.f33124m = new AtomicBoolean(false);
    }

    public final void a(a aVar) {
        AbstractC3340k.e(aVar, "<set-?>");
        this.f33118f = aVar;
    }

    public final long b() {
        return this.f33121i;
    }

    public final void c(long j8) {
        this.f33122j = j8;
    }

    public final void a(String str) {
        AbstractC3340k.e(str, "<set-?>");
        this.f33119g = str;
    }

    public final void a(long j8) {
        this.f33121i = j8;
    }

    public final void a(Long l10) {
        this.k = l10;
    }
}
