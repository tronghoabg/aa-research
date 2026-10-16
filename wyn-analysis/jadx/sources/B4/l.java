package b4;

import A.C0217j;
import Bf.r;
import a4.C1330c;
import android.webkit.MimeTypeMap;
import cg.AbstractC1613b;
import cg.C1610B;
import cg.y;
import ef.C2532p;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.CacheControl;
import okhttp3.MediaType;
import okhttp3.Request;
import org.apache.tika.mime.MimeTypes;

/* loaded from: classes.dex */
public final class l implements InterfaceC1511g {

    /* renamed from: e, reason: collision with root package name */
    public static final CacheControl f19317e;

    /* renamed from: f, reason: collision with root package name */
    public static final CacheControl f19318f;

    /* renamed from: a, reason: collision with root package name */
    public final String f19319a;

    /* renamed from: b, reason: collision with root package name */
    public final h4.l f19320b;

    /* renamed from: c, reason: collision with root package name */
    public final C2532p f19321c;

    /* renamed from: d, reason: collision with root package name */
    public final C2532p f19322d;

    static {
        CacheControl.Builder builder = new CacheControl.Builder();
        builder.f42190a = true;
        builder.f42191b = true;
        f19317e = builder.a();
        CacheControl.Builder builder2 = new CacheControl.Builder();
        builder2.f42190a = true;
        builder2.f42193d = true;
        f19318f = builder2.a();
    }

    public l(String str, h4.l lVar, C2532p c2532p, C2532p c2532p2) {
        this.f19319a = str;
        this.f19320b = lVar;
        this.f19321c = c2532p;
        this.f19322d = c2532p2;
    }

    public static String d(String str, MediaType mediaType) {
        String strB;
        String str2 = mediaType != null ? mediaType.f42295a : null;
        if ((str2 == null || r.k0(str2, MimeTypes.PLAIN_TEXT, false)) && (strB = k4.e.b(MimeTypeMap.getSingleton(), str)) != null) {
            return strB;
        }
        if (str2 != null) {
            return Bf.k.P0(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d A[Catch: Exception -> 0x00d5, TRY_ENTER, TryCatch #4 {Exception -> 0x00d5, blocks: (B:95:0x01f8, B:96:0x01fb, B:57:0x0136, B:97:0x01fc, B:98:0x0201, B:33:0x009d, B:35:0x00a9, B:44:0x00d9, B:48:0x00f2, B:53:0x011d, B:38:0x00bf, B:40:0x00c7, B:50:0x0108, B:51:0x010f, B:52:0x0110), top: B:108:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0110 A[Catch: Exception -> 0x00d5, TryCatch #4 {Exception -> 0x00d5, blocks: (B:95:0x01f8, B:96:0x01fb, B:57:0x0136, B:97:0x01fc, B:98:0x0201, B:33:0x009d, B:35:0x00a9, B:44:0x00d9, B:48:0x00f2, B:53:0x011d, B:38:0x00bf, B:40:0x00c7, B:50:0x0108, B:51:0x010f, B:52:0x0110), top: B:108:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c3 A[Catch: Exception -> 0x01ef, TryCatch #1 {Exception -> 0x01ef, blocks: (B:83:0x01bc, B:85:0x01c3, B:89:0x01eb, B:93:0x01f2, B:94:0x01f7), top: B:104:0x01bc }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f2 A[Catch: Exception -> 0x01ef, TryCatch #1 {Exception -> 0x01ef, blocks: (B:83:0x01bc, B:85:0x01c3, B:89:0x01eb, B:93:0x01f2, B:94:0x01f7), top: B:104:0x01bc }] */
    /* JADX WARN: Type inference failed for: r3v12, types: [ef.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [ef.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // b4.InterfaceC1511g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(jf.InterfaceC3103c r19) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.l.a(jf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(okhttp3.Request r6, lf.AbstractC3464c r7) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 1
            boolean r1 = r7 instanceof b4.C1514j
            if (r1 == 0) goto L14
            r1 = r7
            b4.j r1 = (b4.C1514j) r1
            int r2 = r1.f19310c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L14
            int r2 = r2 - r3
            r1.f19310c = r2
            goto L19
        L14:
            b4.j r1 = new b4.j
            r1.<init>(r5, r7)
        L19:
            java.lang.Object r7 = r1.f19308a
            kf.a r2 = kf.a.f39711a
            int r3 = r1.f19310c
            if (r3 == 0) goto L2f
            if (r3 != r0) goto L27
            Fe.e.U(r7)
            goto L8d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            Fe.e.U(r7)
            android.graphics.Bitmap$Config r7 = k4.e.f39264a
            android.os.Looper r7 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            boolean r7 = kotlin.jvm.internal.AbstractC3340k.a(r7, r3)
            ef.p r3 = r5.f19321c
            if (r7 == 0) goto L63
            h4.l r7 = r5.f19320b
            int r7 = r7.f36129m
            boolean r7 = com.google.android.gms.internal.consent_sdk.a.k(r7)
            if (r7 != 0) goto L5d
            java.lang.Object r7 = r3.getValue()
            okhttp3.Call$Factory r7 = (okhttp3.Call.Factory) r7
            okhttp3.internal.connection.RealCall r6 = r7.a(r6)
            okhttp3.Response r6 = r6.execute()
            goto L90
        L5d:
            android.os.NetworkOnMainThreadException r6 = new android.os.NetworkOnMainThreadException
            r6.<init>()
            throw r6
        L63:
            java.lang.Object r7 = r3.getValue()
            okhttp3.Call$Factory r7 = (okhttp3.Call.Factory) r7
            okhttp3.internal.connection.RealCall r6 = r7.a(r6)
            r1.f19310c = r0
            Ef.n r7 = new Ef.n
            jf.c r1 = A6.h.A(r1)
            r7.<init>(r0, r1)
            r7.t()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f r1 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f
            r1.<init>(r0, r6, r7)
            r6.B(r1)
            r7.v(r1)
            java.lang.Object r7 = r7.s()
            if (r7 != r2) goto L8d
            return r2
        L8d:
            r6 = r7
            okhttp3.Response r6 = (okhttp3.Response) r6
        L90:
            boolean r7 = r6.d()
            if (r7 != 0) goto Lbc
            r7 = 304(0x130, float:4.26E-43)
            int r0 = r6.f42398d
            if (r0 == r7) goto Lbc
            okhttp3.ResponseBody r7 = r6.f42401g
            if (r7 == 0) goto La3
            k4.e.a(r7)
        La3:
            E5.Q r7 = new E5.Q
            java.lang.String r1 = "HTTP "
            java.lang.String r2 = ": "
            java.lang.StringBuilder r0 = pd.f.l(r0, r1, r2)
            java.lang.String r6 = r6.f42397c
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r0 = 10
            r7.<init>(r6, r0)
            throw r7
        Lbc:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.l.b(okhttp3.Request, lf.c):java.lang.Object");
    }

    public final cg.m c() {
        Object value = this.f19322d.getValue();
        AbstractC3340k.b(value);
        return ((a4.i) value).f17376a;
    }

    public final Request e() {
        Request.Builder builder = new Request.Builder();
        builder.h(this.f19319a);
        h4.l lVar = this.f19320b;
        builder.e(lVar.f36125h);
        for (Map.Entry entry : lVar.f36126i.f36141a.entrySet()) {
            Object key = entry.getKey();
            AbstractC3340k.c(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            builder.g((Class) key, entry.getValue());
        }
        int i5 = lVar.f36128l;
        boolean zK = com.google.android.gms.internal.consent_sdk.a.k(i5);
        boolean zK2 = com.google.android.gms.internal.consent_sdk.a.k(lVar.f36129m);
        if (!zK2 && zK) {
            builder.c(CacheControl.f42177p);
        } else if (!zK2 || zK) {
            if (!zK2 && !zK) {
                builder.c(f19318f);
            }
        } else if (com.google.android.gms.internal.consent_sdk.a.m(i5)) {
            builder.c(CacheControl.f42176o);
        } else {
            builder.c(f19317e);
        }
        return builder.b();
    }

    public final C0217j f(a4.h hVar) throws Throwable {
        C0217j c0217j;
        try {
            cg.m mVarC = c();
            C1330c c1330c = (C1330c) hVar.f17375b;
            if (c1330c.f17352b) {
                throw new IllegalStateException("snapshot is closed");
            }
            C1610B c1610bD = AbstractC1613b.d(mVarC.i((y) c1330c.f17351a.f17344c.get(0)));
            try {
                c0217j = new C0217j(c1610bD);
                th = null;
            } catch (Throwable th) {
                th = th;
                c0217j = null;
            }
            try {
                c1610bD.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    Fe.b.d(th, th2);
                }
            }
            if (th != null) {
                throw th;
            }
            AbstractC3340k.b(c0217j);
            return c0217j;
        } catch (IOException unused) {
            return null;
        }
    }

    public final Z3.j g(a4.h hVar) {
        C1330c c1330c = (C1330c) hVar.f17375b;
        if (c1330c.f17352b) {
            throw new IllegalStateException("snapshot is closed");
        }
        y yVar = (y) c1330c.f17351a.f17344c.get(1);
        cg.m mVarC = c();
        this.f19320b.getClass();
        return new Z3.j(yVar, mVarC, this.f19319a, hVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a4.h h(a4.h r5, okhttp3.Request r6, okhttp3.Response r7, A.C0217j r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.l.h(a4.h, okhttp3.Request, okhttp3.Response, A.j):a4.h");
    }
}
