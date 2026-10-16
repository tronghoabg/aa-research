package Va;

import A7.AbstractC0304y;
import A7.C0273n0;
import android.graphics.Typeface;
import android.os.Bundle;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import h5.InterfaceC2781e;
import j1.AbstractC3076d;
import java.io.File;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import l8.AbstractC3409K;
import l8.C3407I;
import uc.C4264a;
import uc.InterfaceC4265b;
import uc.InterfaceC4266c;
import uc.InterfaceC4269f;
import uc.InterfaceC4277n;
import wd.C4402c;
import y1.C4528i;
import y1.C4531l;
import z1.C4608a;
import z1.C4609b;

/* loaded from: classes4.dex */
public final class X7 implements InterfaceC1064ma, InterfaceC2781e {

    /* renamed from: a, reason: collision with root package name */
    public Object f13841a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13842b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13843c;

    /* renamed from: d, reason: collision with root package name */
    public Object f13844d;

    public /* synthetic */ X7(Object obj, Object obj2, Object obj3, String str) {
        this.f13841a = obj;
        this.f13842b = str;
        this.f13843c = obj2;
        this.f13844d = obj3;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h c(X7 x72, File file, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar) {
        k(file).delete();
        l(file).delete();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d(file);
        cVar.f30324a = dVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar = cVar.f30327d;
        if (aVar != null) {
            aVar.invoke(dVar);
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h(file);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i d(X7 x72, File file, Gd.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar) {
        int i5 = aVar.e().f6089a;
        if (400 <= i5 && i5 < 500) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "ChunkedMediaDownloader", "Failed to fetch media from url: " + gc.b.u(aVar).getUrl() + ", status: " + aVar.e(), null, false, 12, null);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f fVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.f30269e;
            cVar.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e(fVar));
            return fVar;
        }
        if (500 > i5 || i5 >= 600) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h(file);
        }
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "ChunkedMediaDownloader", "Failed to fetch media from url: " + gc.b.u(aVar).getUrl() + ", status: " + aVar.e(), null, false, 12, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f fVar2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.f30272h;
        cVar.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e(fVar2));
        return fVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(Va.X7 r16, java.io.File r17, Gd.a r18, lf.AbstractC3464c r19) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.X7.f(Va.X7, java.io.File, Gd.a, lf.c):java.lang.Object");
    }

    public static final Object g(final X7 x72, String str, final long j8, final int i5, final String str2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.c cVar) {
        Fd.c cVar2 = new Fd.c();
        Fd.e.b(cVar2, str);
        Cd.b0.a(cVar2, new Af.r(x72, 20));
        Fd.e.a(cVar2, new tf.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a
            @Override // tf.l
            public final Object invoke(Object obj) {
                Jd.n headers = (Jd.n) obj;
                AbstractC3340k.e(headers, "$this$headers");
                StringBuilder sb2 = new StringBuilder("bytes=");
                long j10 = j8;
                sb2.append(j10);
                sb2.append('-');
                sb2.append(Math.min(j10 + ((p) x72.f13841a).f30315a, i5));
                String string = sb2.toString();
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                StringBuilder sb3 = new StringBuilder("Adding Range header: ");
                List list = Jd.p.f6064a;
                sb3.append(string);
                MolocoLogger.info$default(molocoLogger, "ChunkedMediaDownloader", sb3.toString(), null, false, 12, null);
                headers.z("Range", string);
                String str3 = str2;
                if (str3 != null) {
                    MolocoLogger.info$default(molocoLogger, "ChunkedMediaDownloader", "Adding If-Range header: ".concat(str3), null, false, 12, null);
                    headers.z("If-Range", str3);
                    MolocoLogger.info$default(molocoLogger, "ChunkedMediaDownloader", "Adding ETag header: ".concat(str3), null, false, 12, null);
                    headers.z("ETag", str3);
                }
                return C2515C.f34653a;
            }
        });
        cVar2.c(Jd.s.f6065b);
        return new S3.s(cVar2, (C4402c) x72.f13844d).p(cVar);
    }

    public static final void h(X7 x72, File file, Gd.a aVar) {
        Jd.m mVarA = aVar.a();
        List list = Jd.p.f6064a;
        String str = mVarA.get("ETag");
        if (str != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "ChunkedMediaDownloader", "ETag: ".concat(str), null, false, 12, null);
            qf.i.Y(k(file), str, Bf.a.f1670a);
        } else {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ChunkedMediaDownloader", "No ETag in header", null, false, 12, null);
            k(file).delete();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (r4 == r3) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (r1 == r3) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007f -> B:25:0x0082). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(Va.X7 r18, java.io.File r19, Gd.a r20, lf.AbstractC3464c r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.X7.i(Va.X7, java.io.File, Gd.a, lf.c):java.lang.Object");
    }

    public static File k(File file) {
        return new File(file.getParent(), file.getName() + ".etag");
    }

    public static File l(File file) {
        return new File(file.getParent(), file.getName() + ".range");
    }

    @Override // h5.InterfaceC2781e
    public void a(HashMap map, String str) {
        this.f13842b = "sqlite_error";
        this.f13843c = str;
        this.f13844d = map;
    }

    @Override // h5.InterfaceC2781e
    public void b(Serializable serializable) {
        this.f13841a = serializable;
    }

    @Override // Va.InterfaceC1064ma
    public boolean e(C1077na c1077na) {
        return ((A7) this.f13841a).f13182b.c(c1077na, (C1203x8) this.f13842b, (C1214y7) this.f13843c, (List) this.f13844d);
    }

    public boolean j(File file) {
        return file.exists() && !l(file).exists();
    }

    public void m(Object obj, InterfaceC4266c interfaceC4266c) {
        ((InterfaceC4269f) this.f13841a).j((String) this.f13842b, ((InterfaceC4277n) this.f13843c).a(obj), interfaceC4266c == null ? null : new C4264a(0, this, interfaceC4266c));
    }

    public void n(InterfaceC4265b interfaceC4265b) {
        String str = (String) this.f13842b;
        InterfaceC4269f interfaceC4269f = (InterfaceC4269f) this.f13841a;
        ab.b bVar = (ab.b) this.f13844d;
        if (bVar != null) {
            interfaceC4269f.i(str, interfaceC4265b != null ? new u0.w0(this, interfaceC4265b) : null, bVar);
        } else {
            interfaceC4269f.l(str, interfaceC4265b != null ? new u0.w0(this, interfaceC4265b) : null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011e A[Catch: NumberFormatException | JSONException -> 0x0126, NumberFormatException | JSONException -> 0x0126, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x0126, blocks: (B:9:0x002b, B:43:0x009b, B:43:0x009b, B:44:0x00a8, B:44:0x00a8, B:46:0x00ae, B:46:0x00ae, B:48:0x00b8, B:48:0x00b8, B:50:0x00ca, B:50:0x00ca, B:51:0x00d3, B:51:0x00d3, B:52:0x00d7, B:52:0x00d7, B:54:0x00dd, B:54:0x00dd, B:56:0x00e7, B:56:0x00e7, B:58:0x00f9, B:58:0x00f9, B:59:0x0102, B:59:0x0102, B:60:0x0106, B:60:0x0106, B:61:0x0112, B:61:0x0112, B:62:0x011e, B:62:0x011e, B:20:0x0058, B:23:0x0062, B:26:0x006c, B:29:0x0076, B:32:0x0080), top: B:78:0x002b, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle o() throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.X7.o():android.os.Bundle");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(android.os.Bundle r18) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.X7.p(android.os.Bundle):void");
    }

    public X7() {
        od.Y1 y12 = od.Y1.f41850b;
        this.f13842b = od.S1.m();
        this.f13843c = od.S1.m();
        this.f13844d = od.S1.m();
        this.f13841a = y12;
    }

    public X7(Typeface typeface, C4609b c4609b) {
        int i5;
        int i10;
        int i11;
        int i12;
        this.f13844d = typeface;
        this.f13841a = c4609b;
        this.f13843c = new C4531l(Segment.SHARE_MINIMUM);
        int iA = c4609b.a(6);
        if (iA != 0) {
            int i13 = iA + c4609b.f35890a;
            i5 = ((ByteBuffer) c4609b.f35893d).getInt(((ByteBuffer) c4609b.f35893d).getInt(i13) + i13);
        } else {
            i5 = 0;
        }
        this.f13842b = new char[i5 * 2];
        int iA2 = c4609b.a(6);
        if (iA2 != 0) {
            int i14 = iA2 + c4609b.f35890a;
            i10 = ((ByteBuffer) c4609b.f35893d).getInt(((ByteBuffer) c4609b.f35893d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            C4528i c4528i = new C4528i(this, i15);
            C4608a c4608aB = c4528i.b();
            int iA3 = c4608aB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) c4608aB.f35893d).getInt(iA3 + c4608aB.f35890a) : 0, (char[]) this.f13842b, i15 * 2);
            C4608a c4608aB2 = c4528i.b();
            int iA4 = c4608aB2.a(16);
            if (iA4 != 0) {
                int i16 = iA4 + c4608aB2.f35890a;
                i11 = ((ByteBuffer) c4608aB2.f35893d).getInt(((ByteBuffer) c4608aB2.f35893d).getInt(i16) + i16);
            } else {
                i11 = 0;
            }
            AbstractC3076d.a("invalid metadata codepoint length", i11 > 0);
            C4608a c4608aB3 = c4528i.b();
            int iA5 = c4608aB3.a(16);
            if (iA5 != 0) {
                int i17 = iA5 + c4608aB3.f35890a;
                i12 = ((ByteBuffer) c4608aB3.f35893d).getInt(((ByteBuffer) c4608aB3.f35893d).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            ((C4531l) this.f13843c).a(c4528i, 0, i12 - 1);
        }
    }

    public X7(A7.Z z2, String str) {
        this.f13844d = z2;
        AbstractC1732v.f(str);
        this.f13841a = str;
        if (((C0273n0) z2.f421a).f979g.o0(null, AbstractC0304y.f1196k1)) {
            this.f13842b = new Bundle();
        } else {
            this.f13842b = new Bundle();
        }
    }

    public X7(l8.e0 e0Var, S3.e eVar, S3.s sVar, S3.c cVar) {
        Object objJ;
        if (e0Var != null) {
            objJ = AbstractC3409K.j(e0Var);
        } else {
            C3407I c3407i = AbstractC3409K.f40056b;
            objJ = l8.e0.f40101e;
        }
        this.f13841a = objJ;
        this.f13842b = eVar;
        this.f13843c = sVar;
        this.f13844d = cVar;
    }
}
