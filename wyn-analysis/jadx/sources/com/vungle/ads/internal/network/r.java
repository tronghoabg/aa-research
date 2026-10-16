package com.vungle.ads.internal.network;

import com.moloco.sdk.internal.publisher.H;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.model.c3;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.PathProvider;
import ef.C2515C;
import ef.C2530n;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KTypeProjection;
import za.C4658a;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final VungleApiClient f33443a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f33444b;

    /* renamed from: c, reason: collision with root package name */
    public final com.vungle.ads.internal.signals.j f33445c;

    /* renamed from: d, reason: collision with root package name */
    public final FilePreferences f33446d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f33447e;

    public r(VungleApiClient vungleApiClient, com.vungle.ads.internal.executor.j ioExecutor, com.vungle.ads.internal.executor.j jobExecutor, PathProvider pathProvider, com.vungle.ads.internal.signals.j jVar) {
        AbstractC3340k.e(vungleApiClient, "vungleApiClient");
        AbstractC3340k.e(ioExecutor, "ioExecutor");
        AbstractC3340k.e(jobExecutor, "jobExecutor");
        AbstractC3340k.e(pathProvider, "pathProvider");
        this.f33443a = vungleApiClient;
        this.f33444b = jobExecutor;
        this.f33445c = jVar;
        this.f33446d = FilePreferences.f33485d.a(ioExecutor, pathProvider, "vngFailedTpats");
        this.f33447e = new Object();
    }

    public final void b() {
        for (Map.Entry entry : a().entrySet()) {
            String str = (String) entry.getKey();
            d dVar = (d) entry.getValue();
            p pVar = new p(str);
            pVar.f33429g = true;
            pVar.f33427e = Boolean.FALSE;
            pVar.f33425c = dVar.f33398b;
            pVar.f33426d = dVar.f33399c;
            pVar.f33430h = dVar.f33401e;
            p pVarA = pVar.a(dVar.f33397a);
            pVarA.f33431i = dVar.f33402f;
            a(pVarA.a(), true);
        }
    }

    public final void a(q request, boolean z2) {
        AbstractC3340k.e(request, "request");
        String url = request.i();
        AbstractC3340k.e(url, "url");
        com.vungle.ads.internal.signals.j jVar = this.f33445c;
        String strD = jVar != null ? jVar.d() : null;
        if (strD == null) {
            strD = "";
        }
        if (strD.length() > 0) {
            String strQuote = Pattern.quote("{{{session_id}}}");
            AbstractC3340k.d(strQuote, "quote(Constants.SESSION_ID)");
            Pattern patternCompile = Pattern.compile(strQuote);
            AbstractC3340k.d(patternCompile, "compile(...)");
            url = patternCompile.matcher(url).replaceAll(strD);
            AbstractC3340k.d(url, "replaceAll(...)");
        }
        this.f33444b.execute(new Db.b(this, request, url, z2, 0));
    }

    public static final void a(r this$0, q request, String urlWithSessionId, boolean z2) {
        boolean zBooleanValue;
        String str;
        c3 c3VarA;
        Sdk.SDKError.Reason reason;
        AbstractC3340k.e(this$0, "this$0");
        AbstractC3340k.e(request, "$request");
        AbstractC3340k.e(urlWithSessionId, "$urlWithSessionId");
        Boolean bool = request.f33437e;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            String str2 = request.f33441i;
            zBooleanValue = AbstractC3340k.a(str2, "checkpoint.0") || AbstractC3340k.a(str2, "clickUrl") || AbstractC3340k.a(str2, "impression") || AbstractC3340k.a(str2, "load_ad");
        }
        int i5 = 0;
        while (true) {
            str = urlWithSessionId;
            c3VarA = this$0.f33443a.a(str, request.b(), request.a(), request.d(), request.c());
            if (!zBooleanValue || c3VarA == null || !c3VarA.b() || (i5 = i5 + 1) >= request.e()) {
                break;
            } else {
                urlWithSessionId = str;
            }
        }
        if (c3VarA != null) {
            if (i5 >= request.e()) {
                reason = Sdk.SDKError.Reason.TPAT_RETRY_FAILED;
            } else {
                reason = Sdk.SDKError.Reason.TPAT_ERROR;
            }
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("tpat key: ");
            sbA.append(request.f33441i);
            sbA.append(", error: ");
            sbA.append(c3VarA.f33148a);
            sbA.append(", errorIsTerminal: ");
            sbA.append(c3VarA.f33149b);
            sbA.append(" url: ");
            sbA.append(str);
            String string = sbA.toString();
            boolean z10 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.b("TpatSender", string);
            new TpatError(reason, string).setLogEntry$vungle_ads_release(request.f33442j).logErrorNoReturnValue$vungle_ads_release();
        }
        if (request.f()) {
            if (c3VarA == null || !c3VarA.a()) {
                if (c3VarA != null || z2) {
                    synchronized (this$0.f33447e) {
                        try {
                            Map mapA = this$0.a();
                            d dVar = (d) mapA.get(request.i());
                            int iA = dVar != null ? dVar.a() : 0;
                            if (c3VarA == null && iA > 0) {
                                mapA.remove(request.i());
                                this$0.a(mapA);
                            } else if (c3VarA != null && iA >= request.g()) {
                                mapA.remove(request.i());
                                this$0.a(mapA);
                                Sdk.SDKError.Reason reason2 = Sdk.SDKError.Reason.TPAT_RETRY_FAILED;
                                String str3 = "tpat key: " + request.f33441i + ", error: " + c3VarA.f33148a + ", errorIsTerminal: " + c3VarA.f33149b + " url: " + str;
                                boolean z11 = com.vungle.ads.internal.util.u.f33874a;
                                com.vungle.ads.internal.util.t.b("TpatSender", str3);
                                new TpatError(reason2, str3).setLogEntry$vungle_ads_release(request.f33442j).logErrorNoReturnValue$vungle_ads_release();
                            } else if (c3VarA != null) {
                                d dVar2 = (d) mapA.get(request.i());
                                mapA.put(request.i(), dVar2 != null ? d.a(dVar2, iA + 1) : new d(request.d(), request.b(), request.a(), 1, request.g(), request.h()));
                                this$0.a(mapA);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public final Map a() {
        Object objZ;
        String string = this.f33446d.getString("FAILED_TPATS");
        if (string != null) {
            try {
                Xf.b bVar = Xf.c.f16251d;
                C4658a c4658a = bVar.f16253b;
                KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                objZ = (Map) bVar.a(string, H.n0(c4658a, kotlin.jvm.internal.H.f39741a.mutableCollectionType(kotlin.jvm.internal.H.e(companion.invariant(kotlin.jvm.internal.H.b(String.class)), companion.invariant(kotlin.jvm.internal.H.b(d.class))))));
            } catch (Throwable th) {
                objZ = Fe.e.z(th);
            }
            Throwable thA = C2530n.a(objZ);
            if (thA != null) {
                boolean z2 = com.vungle.ads.internal.util.u.f33874a;
                com.vungle.ads.internal.util.t.b("TpatSender", "Failed to decode stored tpats: " + thA);
            }
            if (C2530n.a(objZ) != null) {
                objZ = new LinkedHashMap();
            }
            Map map = (Map) objZ;
            if (map != null) {
                return map;
            }
        }
        return new LinkedHashMap();
    }

    public final void a(Map map) {
        Object objZ;
        try {
            FilePreferences filePreferences = this.f33446d;
            Xf.b bVar = Xf.c.f16251d;
            C4658a c4658a = bVar.f16253b;
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            filePreferences.a("FAILED_TPATS", bVar.b(H.n0(c4658a, kotlin.jvm.internal.H.f39741a.mutableCollectionType(kotlin.jvm.internal.H.e(companion.invariant(kotlin.jvm.internal.H.b(String.class)), companion.invariant(kotlin.jvm.internal.H.b(d.class))))), map)).b();
            objZ = C2515C.f34653a;
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        if (C2530n.a(objZ) != null) {
            boolean z2 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.b("TpatSender", "Failed to encode the about to storing tpats: " + map);
        }
    }
}
