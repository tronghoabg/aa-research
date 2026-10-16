package okhttp3.internal.c;

import androidx.core.app.NotificationCompat;
import h.g.b.x;
import java.io.IOException;
import okhttp3.ab;
import okhttp3.au;
import okhttp3.internal.f.aj;
import okhttp3.w;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final o f56004a;

    /* renamed from: b, reason: collision with root package name */
    private final okhttp3.a f56005b;

    /* renamed from: c, reason: collision with root package name */
    private final j f56006c;

    /* renamed from: d, reason: collision with root package name */
    private final w f56007d;

    /* renamed from: e, reason: collision with root package name */
    private q f56008e;

    /* renamed from: f, reason: collision with root package name */
    private int f56009f;

    /* renamed from: g, reason: collision with root package name */
    private int f56010g;

    /* renamed from: h, reason: collision with root package name */
    private int f56011h;

    /* renamed from: i, reason: collision with root package name */
    private au f56012i;

    /* renamed from: j, reason: collision with root package name */
    private com.google.firebase.d.c.b f56013j;

    public f(o oVar, okhttp3.a aVar, j jVar, w wVar) {
        x.f(oVar, "connectionPool");
        x.f(aVar, "address");
        x.f(jVar, NotificationCompat.CATEGORY_CALL);
        x.f(wVar, "eventListener");
        this.f56004a = oVar;
        this.f56005b = aVar;
        this.f56006c = jVar;
        this.f56007d = wVar;
    }

    public final okhttp3.a a() {
        return this.f56005b;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0092 A[Catch: IOException -> 0x01a3, p -> 0x01ad, TryCatch #5 {IOException -> 0x01a3, p -> 0x01ad, blocks: (B:3:0x0010, B:4:0x002c, B:6:0x0034, B:8:0x003b, B:16:0x005b, B:17:0x005c, B:59:0x0153, B:61:0x0159, B:63:0x015e, B:65:0x0165, B:67:0x0169, B:70:0x0171, B:72:0x0175, B:76:0x017e, B:77:0x0185, B:21:0x0067, B:22:0x006e, B:24:0x0071, B:25:0x0074, B:27:0x007f, B:28:0x0080, B:29:0x0081, B:31:0x0092, B:32:0x00a2, B:34:0x00a6, B:50:0x0104, B:52:0x0114, B:54:0x012d, B:55:0x0145, B:57:0x014c, B:58:0x014d, B:80:0x018a, B:81:0x018b, B:83:0x018d, B:84:0x0192, B:36:0x00ab, B:38:0x00af, B:40:0x00b5, B:41:0x00bf, B:43:0x00c3, B:44:0x00d7, B:46:0x00e7, B:48:0x00ed, B:49:0x00fe, B:85:0x0193, B:86:0x019a, B:87:0x019b, B:88:0x01a2), top: B:101:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2 A[Catch: IOException -> 0x01a3, p -> 0x01ad, TryCatch #5 {IOException -> 0x01a3, p -> 0x01ad, blocks: (B:3:0x0010, B:4:0x002c, B:6:0x0034, B:8:0x003b, B:16:0x005b, B:17:0x005c, B:59:0x0153, B:61:0x0159, B:63:0x015e, B:65:0x0165, B:67:0x0169, B:70:0x0171, B:72:0x0175, B:76:0x017e, B:77:0x0185, B:21:0x0067, B:22:0x006e, B:24:0x0071, B:25:0x0074, B:27:0x007f, B:28:0x0080, B:29:0x0081, B:31:0x0092, B:32:0x00a2, B:34:0x00a6, B:50:0x0104, B:52:0x0114, B:54:0x012d, B:55:0x0145, B:57:0x014c, B:58:0x014d, B:80:0x018a, B:81:0x018b, B:83:0x018d, B:84:0x0192, B:36:0x00ab, B:38:0x00af, B:40:0x00b5, B:41:0x00bf, B:43:0x00c3, B:44:0x00d7, B:46:0x00e7, B:48:0x00ed, B:49:0x00fe, B:85:0x0193, B:86:0x019a, B:87:0x019b, B:88:0x01a2), top: B:101:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012d A[Catch: IOException -> 0x01a3, p -> 0x01ad, TryCatch #5 {IOException -> 0x01a3, p -> 0x01ad, blocks: (B:3:0x0010, B:4:0x002c, B:6:0x0034, B:8:0x003b, B:16:0x005b, B:17:0x005c, B:59:0x0153, B:61:0x0159, B:63:0x015e, B:65:0x0165, B:67:0x0169, B:70:0x0171, B:72:0x0175, B:76:0x017e, B:77:0x0185, B:21:0x0067, B:22:0x006e, B:24:0x0071, B:25:0x0074, B:27:0x007f, B:28:0x0080, B:29:0x0081, B:31:0x0092, B:32:0x00a2, B:34:0x00a6, B:50:0x0104, B:52:0x0114, B:54:0x012d, B:55:0x0145, B:57:0x014c, B:58:0x014d, B:80:0x018a, B:81:0x018b, B:83:0x018d, B:84:0x0192, B:36:0x00ab, B:38:0x00af, B:40:0x00b5, B:41:0x00bf, B:43:0x00c3, B:44:0x00d7, B:46:0x00e7, B:48:0x00ed, B:49:0x00fe, B:85:0x0193, B:86:0x019a, B:87:0x019b, B:88:0x01a2), top: B:101:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0145 A[Catch: IOException -> 0x01a3, p -> 0x01ad, TRY_LEAVE, TryCatch #5 {IOException -> 0x01a3, p -> 0x01ad, blocks: (B:3:0x0010, B:4:0x002c, B:6:0x0034, B:8:0x003b, B:16:0x005b, B:17:0x005c, B:59:0x0153, B:61:0x0159, B:63:0x015e, B:65:0x0165, B:67:0x0169, B:70:0x0171, B:72:0x0175, B:76:0x017e, B:77:0x0185, B:21:0x0067, B:22:0x006e, B:24:0x0071, B:25:0x0074, B:27:0x007f, B:28:0x0080, B:29:0x0081, B:31:0x0092, B:32:0x00a2, B:34:0x00a6, B:50:0x0104, B:52:0x0114, B:54:0x012d, B:55:0x0145, B:57:0x014c, B:58:0x014d, B:80:0x018a, B:81:0x018b, B:83:0x018d, B:84:0x0192, B:36:0x00ab, B:38:0x00af, B:40:0x00b5, B:41:0x00bf, B:43:0x00c3, B:44:0x00d7, B:46:0x00e7, B:48:0x00ed, B:49:0x00fe, B:85:0x0193, B:86:0x019a, B:87:0x019b, B:88:0x01a2), top: B:101:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.internal.d.e b(okhttp3.ai r17, okhttp3.internal.d.g r18) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.c.f.b(okhttp3.ai, okhttp3.internal.d.g):okhttp3.internal.d.e");
    }

    public final void c(IOException iOException) {
        x.f(iOException, "e");
        this.f56012i = null;
        if ((iOException instanceof aj) && ((aj) iOException).f56138a == okhttp3.internal.f.b.f56146h) {
            this.f56009f++;
        } else if (iOException instanceof okhttp3.internal.f.a) {
            this.f56010g++;
        } else {
            this.f56011h++;
        }
    }

    public final boolean d() {
        q qVar;
        m mVarP;
        int i2 = this.f56009f;
        if (i2 == 0) {
            if (this.f56010g == 0 && this.f56011h == 0) {
                return false;
            }
            i2 = 0;
        }
        if (this.f56012i != null) {
            return true;
        }
        au auVarG = null;
        if (i2 <= 1 && this.f56010g <= 1 && this.f56011h <= 0 && (mVarP = this.f56006c.p()) != null) {
            synchronized (mVarP) {
                if (mVarP.a() == 0 && okhttp3.internal.b.v(mVarP.g().c().j(), this.f56005b.j())) {
                    auVarG = mVarP.g();
                }
            }
        }
        if (auVarG != null) {
            this.f56012i = auVarG;
            return true;
        }
        com.google.firebase.d.c.b bVar = this.f56013j;
        if ((bVar == null || !bVar.e()) && (qVar = this.f56008e) != null) {
            return qVar.a();
        }
        return true;
    }

    public final boolean e(ab abVar) {
        x.f(abVar, "url");
        ab abVarJ = this.f56005b.j();
        return abVar.a() == abVarJ.a() && x.n(abVar.f(), abVarJ.f());
    }
}
