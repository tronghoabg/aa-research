package com.applovin.impl;

import cb.AbstractC1593a;
import com.applovin.impl.b4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v4;
import com.applovin.sdk.AppLovinErrorCodes;
import j1.InterfaceC3073a;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1658q0 {

    /* renamed from: e, reason: collision with root package name */
    private static final List f22578e = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f22579a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f22580b;

    /* renamed from: c, reason: collision with root package name */
    private final b4 f22581c;

    /* renamed from: d, reason: collision with root package name */
    private d f22582d;

    /* renamed from: com.applovin.impl.q0$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f22583a;

        /* renamed from: b, reason: collision with root package name */
        private long f22584b;

        public long a() {
            return this.f22583a;
        }

        public long b() {
            return this.f22584b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j8) {
            this.f22583a = j8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j8) {
            this.f22584b = j8;
        }
    }

    /* renamed from: com.applovin.impl.q0$c */
    public class c implements InterfaceC3073a {

        /* renamed from: a, reason: collision with root package name */
        private final String f22585a;

        /* renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.network.a f22586b;

        /* renamed from: c, reason: collision with root package name */
        private final String f22587c;

        /* renamed from: d, reason: collision with root package name */
        private final Object f22588d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f22589e;

        /* renamed from: f, reason: collision with root package name */
        private final b f22590f;

        /* renamed from: g, reason: collision with root package name */
        private final e f22591g;

        /* JADX WARN: Not initialized variable reg: 8, insn: 0x004f: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:80), block:B:29:0x004e */
        @Override // j1.InterfaceC3073a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(b4.d dVar) {
            MalformedURLException malformedURLException;
            int iC;
            int i5;
            long jE = dVar.e();
            Object objA = null;
            try {
                try {
                    iC = dVar.c();
                    try {
                        if (iC > 0) {
                            try {
                                if (iC < 200 || iC >= 400) {
                                    this.f22591g.a(this.f22585a, iC, null, null);
                                    return;
                                }
                                try {
                                    b bVar = this.f22590f;
                                    if (bVar != null) {
                                        bVar.a(jE);
                                    }
                                    C1658q0.this.a(this.f22587c, this.f22585a, iC, jE);
                                    byte[] bArrD = dVar.d();
                                    if (o7.h(com.applovin.impl.sdk.k.o()) && (!this.f22589e || v4.b(bArrD) != v4.a.V2)) {
                                        C1658q0.this.f22579a.t().a(bArrD != null ? new String(dVar.d(), Charset.forName("UTF-8")) : "", this.f22585a, this.f22586b.b() != null ? this.f22586b.b().toString() : "");
                                    }
                                    if (bArrD == null) {
                                        this.f22591g.a(this.f22585a, this.f22588d, iC);
                                        return;
                                    }
                                    String str = new String(dVar.d(), Charset.forName("UTF-8"));
                                    b bVar2 = this.f22590f;
                                    if (bVar2 != null) {
                                        bVar2.b(bArrD.length);
                                        if (this.f22586b.r()) {
                                            C1658q0.this.f22582d = new d(this.f22586b.f(), bArrD.length, jE);
                                        }
                                    }
                                    if (this.f22589e) {
                                        String strB = v4.b(bArrD, C1658q0.this.f22579a.j0(), C1658q0.this.f22579a);
                                        if (strB == null) {
                                            HashMap map = new HashMap(2);
                                            map.put("request", StringUtils.getHostAndPath(this.f22585a));
                                            map.put("response", str);
                                            C1658q0.this.f22579a.F().trackEvent("rdf", map);
                                        }
                                        str = strB;
                                    }
                                    try {
                                        this.f22591g.a(this.f22585a, C1658q0.this.a(str, this.f22588d), iC);
                                        return;
                                    } catch (Throwable th) {
                                        String str2 = "Unable to parse response from " + StringUtils.getHostAndPath(this.f22585a) + " because of " + th.getClass().getName() + " : " + th.getMessage();
                                        com.applovin.impl.sdk.o unused = C1658q0.this.f22580b;
                                        if (com.applovin.impl.sdk.o.a()) {
                                            C1658q0.this.f22580b.a("ConnectionManager", str2, th);
                                        }
                                        C1658q0.this.f22579a.D().a("ConnectionManager", "failedToParseResponse", th, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(this.f22585a)));
                                        this.f22591g.a(this.f22585a, AppLovinErrorCodes.INVALID_RESPONSE, str2, null);
                                        return;
                                    }
                                } catch (MalformedURLException e7) {
                                    e = e7;
                                }
                            } catch (MalformedURLException e10) {
                                malformedURLException = e10;
                                iC = i5;
                            }
                        } else {
                            try {
                                C1658q0.this.a(this.f22587c, this.f22585a, iC, jE, (Throwable) null);
                                this.f22591g.a(this.f22585a, iC, null, null);
                                return;
                            } catch (MalformedURLException e11) {
                                e = e11;
                                iC = iC;
                            }
                        }
                    } catch (MalformedURLException e12) {
                        e = e12;
                    }
                    malformedURLException = e;
                } catch (MalformedURLException e13) {
                    malformedURLException = e13;
                    iC = 0;
                }
                MalformedURLException malformedURLException2 = malformedURLException;
                if (this.f22588d != null) {
                    C1658q0.this.a(this.f22587c, this.f22585a, iC, jE, malformedURLException2);
                    this.f22591g.a(this.f22585a, -901, malformedURLException2.getMessage(), null);
                } else {
                    C1658q0.this.a(this.f22587c, this.f22585a, iC, jE);
                    this.f22591g.a(this.f22585a, this.f22588d, -901);
                }
            } catch (Throwable th2) {
                int iB = dVar.b();
                try {
                    byte[] bArrF = dVar.f();
                    String str3 = new String(bArrF);
                    if (bArrF != null) {
                        if (this.f22589e) {
                            str3 = v4.b(bArrF, C1658q0.this.f22579a.j0(), C1658q0.this.f22579a);
                        }
                        objA = C1658q0.this.a(str3, this.f22588d);
                    }
                } catch (Throwable unused2) {
                }
                C1658q0.this.a(this.f22587c, this.f22585a, iB, jE, th2);
                this.f22591g.a(this.f22585a, iB, th2.getMessage(), objA);
            }
        }

        private c(String str, com.applovin.impl.sdk.network.a aVar, String str2, Object obj, boolean z2, b bVar, e eVar) {
            this.f22585a = str;
            this.f22586b = aVar;
            this.f22587c = str2;
            this.f22588d = obj;
            this.f22589e = z2;
            this.f22590f = bVar;
            this.f22591g = eVar;
        }
    }

    /* renamed from: com.applovin.impl.q0$d */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final long f22593a = System.currentTimeMillis();

        /* renamed from: b, reason: collision with root package name */
        private final String f22594b;

        /* renamed from: c, reason: collision with root package name */
        private final long f22595c;

        /* renamed from: d, reason: collision with root package name */
        private final long f22596d;

        public d(String str, long j8, long j10) {
            this.f22594b = str;
            this.f22595c = j8;
            this.f22596d = j10;
        }

        public boolean a(Object obj) {
            return obj instanceof d;
        }

        public long b() {
            return this.f22595c;
        }

        public long c() {
            return this.f22593a;
        }

        public String d() {
            return this.f22594b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!dVar.a(this) || c() != dVar.c() || b() != dVar.b() || a() != dVar.a()) {
                return false;
            }
            String strD = d();
            String strD2 = dVar.d();
            return strD != null ? strD.equals(strD2) : strD2 == null;
        }

        public int hashCode() {
            long jC = c();
            long jB = b();
            int i5 = ((((int) (jC ^ (jC >>> 32))) + 59) * 59) + ((int) (jB ^ (jB >>> 32)));
            long jA = a();
            String strD = d();
            return (((i5 * 59) + ((int) ((jA >>> 32) ^ jA))) * 59) + (strD == null ? 43 : strD.hashCode());
        }

        public String toString() {
            return "ConnectionManager.RequestMeasurement(timestampMillis=" + c() + ", urlHostAndPathString=" + d() + ", responseSizeBytes=" + b() + ", connectionTimeMillis=" + a() + ")";
        }

        public long a() {
            return this.f22596d;
        }
    }

    /* renamed from: com.applovin.impl.q0$e */
    public interface e {
        void a(String str, int i5, String str2, Object obj);

        void a(String str, Object obj, int i5);
    }

    public C1658q0(com.applovin.impl.sdk.k kVar) {
        this.f22579a = kVar;
        this.f22580b = kVar.O();
        b4 b4Var = new b4(kVar);
        this.f22581c = b4Var;
        b4Var.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020c A[Catch: all -> 0x013c, TRY_LEAVE, TryCatch #3 {all -> 0x013c, blocks: (B:39:0x0105, B:43:0x012c, B:42:0x0128, B:50:0x0166, B:52:0x017e, B:58:0x01a0, B:73:0x01f2, B:76:0x0201, B:78:0x020c, B:60:0x01a4, B:63:0x01ac, B:68:0x01c3, B:70:0x01c9, B:71:0x01de, B:54:0x018d, B:81:0x0215, B:65:0x01bd), top: B:111:0x0105, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.applovin.impl.sdk.network.a r20, com.applovin.impl.C1658q0.b r21, com.applovin.impl.C1658q0.e r22) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C1658q0.a(com.applovin.impl.sdk.network.a, com.applovin.impl.q0$b, com.applovin.impl.q0$e):void");
    }

    public d a() {
        return this.f22582d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object a(String str, Object obj) {
        if (obj == null) {
            return str;
        }
        if (str != null && str.length() >= 3) {
            if (obj instanceof JSONObject) {
                return new JSONObject(str);
            }
            if (obj instanceof q8) {
                return r8.a(str, this.f22579a);
            }
            if (obj instanceof String) {
                return str;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f22580b.b("ConnectionManager", "Failed to process response of type '" + obj.getClass().getName() + "'");
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i5, long j8) {
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar = this.f22580b;
            StringBuilder sbK = AbstractC1593a.k(i5, "Successful ", str, " returned ", " in ");
            sbK.append(j8 / 1000.0f);
            sbK.append(" s over ");
            sbK.append(AbstractC1659r0.g(this.f22579a));
            sbK.append(" to ");
            sbK.append(a(str2));
            oVar.d("ConnectionManager", sbK.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i5, long j8, Throwable th) {
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar = this.f22580b;
            StringBuilder sbK = AbstractC1593a.k(i5, "Failed ", str, " returned ", " in ");
            sbK.append(j8 / 1000.0f);
            sbK.append(" s over ");
            sbK.append(AbstractC1659r0.g(this.f22579a));
            sbK.append(" to ");
            sbK.append(a(str2));
            oVar.a("ConnectionManager", sbK.toString(), th);
        }
    }

    private String a(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }
}
