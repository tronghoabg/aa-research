package com.moloco.sdk.acm.eventprocessing;

import A7.AbstractC0279p0;
import Jd.n;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.moloco.sdk.acm.db.MetricsDb;
import ef.C2515C;
import ef.C2527k;
import ff.AbstractC2640A;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import tf.l;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/moloco/sdk/acm/eventprocessing/DBRequestWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "moloco-android-client-metrics_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class DBRequestWorker extends CoroutineWorker {

    /* renamed from: a, reason: collision with root package name */
    public final String f28371a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.acm.db.e f28372b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28373c;

    /* renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.acm.http.a f28374d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.moloco.sdk.acm.http.a] */
    public DBRequestWorker(@NotNull Context context, @NotNull WorkerParameters params) {
        super(context, params);
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(params, "params");
        this.f28371a = "DBRequestWorker";
        this.f28372b = MetricsDb.f28343m.h(context).p();
        this.f28373c = getInputData().b("url");
        Map mapR = AbstractC2640A.R(new C2527k("AppKey", getInputData().b("AppKey")), new C2527k("AppBundle", getInputData().b("AppBundle")), new C2527k("AppVersion", getInputData().b("AppVersion")), new C2527k("OS", getInputData().b("OS")), new C2527k("osv", getInputData().b("osv")), new C2527k("SdkVersion", getInputData().b("SdkVersion")), new C2527k("Mediator", getInputData().b("Mediator")));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapR.entrySet()) {
            if (((String) entry.getValue()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        final String str = (String) linkedHashMap.get("SdkVersion");
        final String str2 = (String) linkedHashMap.get("osv");
        final String str3 = (String) linkedHashMap.get("AppKey");
        final String str4 = (String) linkedHashMap.get("AppBundle");
        final String str5 = (String) linkedHashMap.get("AppVersion");
        final String str6 = (String) linkedHashMap.get("Mediator");
        this.f28374d = new l() { // from class: com.moloco.sdk.acm.http.a
            @Override // tf.l
            public final Object invoke(Object obj) {
                n nVar = (n) obj;
                AbstractC3340k.e(nVar, "<this>");
                StringBuilder sb2 = new StringBuilder();
                String str7 = str4;
                if (str7 != null) {
                    sb2.append("AppBundle/" + str7 + ';');
                }
                String str8 = str5;
                if (str8 != null) {
                    sb2.append("AppVersion/" + str8 + ';');
                }
                String str9 = str3;
                if (str9 != null) {
                    sb2.append("AppKey/" + str9 + ';');
                }
                String string = sb2.toString();
                StringBuilder sbW = AbstractC0279p0.w(string, "toString(...)");
                String str10 = str;
                if (str10 != null) {
                    sbW.append("SdkVersion/" + str10 + ';');
                }
                String str11 = str6;
                if (str11 != null) {
                    sbW.append("Mediator/" + str11 + ';');
                }
                String string2 = sbW.toString();
                AbstractC3340k.d(string2, "toString(...)");
                StringBuilder sb3 = new StringBuilder("OS/Android;");
                String str12 = str2;
                if (str12 != null) {
                    sb3.append("osv/" + str12 + ';');
                }
                String string3 = sb3.toString();
                AbstractC3340k.d(string3, "toString(...)");
                nVar.z("X-Moloco-App-Info", string);
                nVar.z("X-Moloco-Device-Info", string3);
                nVar.z("X-Moloco-SDK-Info", string2);
                return C2515C.f34653a;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(jf.InterfaceC3103c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.moloco.sdk.acm.eventprocessing.a
            if (r0 == 0) goto L13
            r0 = r8
            com.moloco.sdk.acm.eventprocessing.a r0 = (com.moloco.sdk.acm.eventprocessing.a) r0
            int r1 = r0.f28378d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28378d = r1
            goto L1a
        L13:
            com.moloco.sdk.acm.eventprocessing.a r0 = new com.moloco.sdk.acm.eventprocessing.a
            lf.c r8 = (lf.AbstractC3464c) r8
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.f28376b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f28378d
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            com.moloco.sdk.acm.eventprocessing.DBRequestWorker r0 = r0.f28375a
            Fe.e.U(r8)     // Catch: java.lang.Exception -> L30
            ef.n r8 = (ef.C2530n) r8     // Catch: java.lang.Exception -> L30
            r8.getClass()     // Catch: java.lang.Exception -> L30
            goto L7e
        L30:
            r8 = move-exception
            goto L83
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            Fe.e.U(r8)
            java.lang.String r8 = r7.f28373c
            if (r8 == 0) goto L7d
            wd.c r2 = com.moloco.sdk.acm.http.b.f28426a     // Catch: java.lang.Exception -> L7b
            ef.p r2 = com.moloco.sdk.acm.http.c.f28429a     // Catch: java.lang.Exception -> L7b
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Exception -> L7b
            wd.c r2 = (wd.C4402c) r2     // Catch: java.lang.Exception -> L7b
            java.lang.String r4 = "httpClient"
            kotlin.jvm.internal.AbstractC3340k.e(r2, r4)     // Catch: java.lang.Exception -> L7b
            wd.c r4 = com.moloco.sdk.acm.http.b.f28426a     // Catch: java.lang.Exception -> L7b
            if (r4 != 0) goto L58
            com.moloco.sdk.acm.http.b.f28426a = r2     // Catch: java.lang.Exception -> L7b
            com.moloco.sdk.acm.http.b.f28427b = r8     // Catch: java.lang.Exception -> L7b
        L58:
            G9.e r8 = new G9.e     // Catch: java.lang.Exception -> L7b
            ef.p r2 = com.moloco.sdk.acm.http.b.f28428c     // Catch: java.lang.Exception -> L7b
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Exception -> L7b
            com.moloco.sdk.acm.http.g r2 = (com.moloco.sdk.acm.http.g) r2     // Catch: java.lang.Exception -> L7b
            com.moloco.sdk.acm.db.e r4 = r7.f28372b     // Catch: java.lang.Exception -> L7b
            ab.b r5 = new ab.b     // Catch: java.lang.Exception -> L7b
            r5.<init>()     // Catch: java.lang.Exception -> L7b
            com.moloco.sdk.acm.http.a r6 = r7.f28374d     // Catch: java.lang.Exception -> L7b
            r8.<init>(r2, r4, r5, r6)     // Catch: java.lang.Exception -> L7b
            r0.f28375a = r7     // Catch: java.lang.Exception -> L7b
            r0.f28378d = r3     // Catch: java.lang.Exception -> L7b
            java.lang.Object r8 = r8.j(r0)     // Catch: java.lang.Exception -> L7b
            if (r8 != r1) goto L7d
            return r1
        L79:
            r0 = r7
            goto L83
        L7b:
            r8 = move-exception
            goto L79
        L7d:
            r0 = r7
        L7e:
            J3.o r8 = J3.p.a()     // Catch: java.lang.Exception -> L30
            return r8
        L83:
            Kd.a r1 = com.moloco.sdk.acm.services.e.f28472a
            java.lang.String r0 = r0.f28371a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Work Manager failure: "
            r1.<init>(r2)
            java.lang.String r8 = r8.getMessage()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r1 = 12
            r2 = 0
            com.moloco.sdk.acm.services.e.b(r1, r2, r0, r8)
            J3.m r8 = new J3.m
            r8.<init>()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.eventprocessing.DBRequestWorker.doWork(jf.c):java.lang.Object");
    }
}
