package com.waze.network;

import j$.util.DesugarTimeZone;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class aw implements au {

    /* renamed from: a, reason: collision with root package name */
    private final at f31904a;

    /* renamed from: b, reason: collision with root package name */
    private final ax f31905b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f31906c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31907d;

    /* renamed from: e, reason: collision with root package name */
    private final okhttp3.ai f31908e;

    public aw(at atVar, ax axVar, com.waze.shared_infra.i.e eVar, com.waze.network.b.bj bjVar) {
        h.g.b.x.f(atVar, "callback");
        h.g.b.x.f(axVar, "httpConfig");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(bjVar, "okHttpClientBuilder");
        this.f31904a = atVar;
        this.f31905b = axVar;
        this.f31906c = eVar;
        this.f31907d = "last-modified";
        axVar.f();
        axVar.g();
        this.f31908e = bjVar.c().b();
    }

    @Override // com.waze.network.au
    public final boolean a(String str, long j2, long j3) {
        Object objA;
        h.g.b.x.f(str, "url");
        try {
            aw awVar = this;
            okhttp3.ak akVarA = new okhttp3.ak().b().i(str).a("User-Agent", this.f31905b.e());
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(TimeUnit.SECONDS.toMillis(j2));
            h.g.b.x.e(calendar, "apply(...)");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            String str2 = simpleDateFormat.format(calendar.getTime());
            h.g.b.x.e(str2, "format(...)");
            this.f31908e.r(akVarA.a("If-Modified-Since", str2).k()).d(new av(this, j3, 1));
            objA = h.ab.f48028a;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        return h.m.c(objA) == null;
    }

    @Override // com.waze.network.au
    public final boolean b(String str, String str2, byte[] bArr, long j2) {
        Object objA;
        h.g.b.x.f(str, "url");
        h.g.b.x.f(str2, "headers");
        h.g.b.x.f(bArr, "data");
        try {
            aw awVar = this;
            com.waze.shared_infra.i.h.a("HTTPPost url = " + str + " headers = " + str2);
            String[] strArr = (String[]) h.n.o.af(str2, new String[]{"|"}, 0, 6).toArray(new String[0]);
            String str3 = strArr[0];
            int length = strArr.length;
            String str4 = length > 1 ? strArr[1] : "";
            String str5 = length > 2 ? strArr[2] : "";
            com.waze.shared_infra.coordinators.c cVar = new com.waze.shared_infra.coordinators.c((byte[]) null);
            cVar.l("User-Agent", this.f31905b.e());
            if (str4.length() > 0) {
                cVar.l("Content-disposition", "form-data; name=\"file_0\"; filename=\"" + str4 + "\"");
            }
            if (str5.length() > 0) {
                cVar.l("Authorization", "Basic " + str5);
            }
            okhttp3.ak akVar = new okhttp3.ak();
            int i2 = okhttp3.ae.f55830a;
            this.f31908e.r(akVar.f(okhttp3.as.c(bArr, kotlinx.b.a.b.A(str3), 6)).d(cVar.h()).i(str).k()).d(new av(this, j2, 0));
            objA = h.ab.f48028a;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        return h.m.c(objA) == null;
    }

    @Override // com.waze.network.au
    public final boolean c(String str, String str2, String str3, long j2) {
        Object objA;
        h.g.b.x.f(str, "url");
        h.g.b.x.f(str2, "headers");
        h.g.b.x.f(str3, "file");
        this.f31906c.a("HTTPPostFile url = " + str + " headers = " + str2);
        try {
            aw awVar = this;
            String[] strArr = (String[]) h.n.o.af(str2, new String[]{"|"}, 0, 6).toArray(new String[0]);
            String str4 = strArr[0];
            int length = strArr.length;
            String str5 = length > 1 ? strArr[1] : "";
            String str6 = length > 2 ? strArr[2] : "";
            com.waze.shared_infra.coordinators.c cVarL = new com.waze.shared_infra.coordinators.c((byte[]) null).l("Content-Transfer-Encoding", "binary");
            if (str5.length() > 0) {
                cVarL.l("Content-disposition", "form-data; name=\"file_0\"; filename=\"" + str5 + "\"");
            }
            if (str6.length() > 0) {
                cVarL.l("Authorization", "Basic " + str6);
            }
            okhttp3.ak akVar = new okhttp3.ak();
            okhttp3.af afVarB = new okhttp3.af("---------------------------10424402741337131014341297293").b(okhttp3.ag.f55840b);
            okhttp3.z zVarH = cVarL.h();
            File file = new File(str3);
            int i2 = okhttp3.ae.f55830a;
            this.f31908e.r(akVar.f(afVarB.a(zVarH, okhttp3.as.b(file, kotlinx.b.a.b.A(str4))).c()).a("User-Agent", this.f31905b.e()).i(str).k()).d(new av(this, j2, 2));
            objA = h.ab.f48028a;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        return h.m.c(objA) == null;
    }
}
