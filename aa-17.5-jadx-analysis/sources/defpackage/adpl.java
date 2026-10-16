package defpackage;

import android.os.Parcel;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public abstract class adpl implements adzx {
    private InputStream a;
    protected final adoz b;
    protected final adis c;
    final int d;
    protected adqe e;
    protected adzv f;
    protected adzy g;
    private int h;
    private int i;
    private ArrayList j;
    private boolean k;
    private int l;
    private int m;
    private adpj n = adpj.a;
    private int o;
    private int p;
    private boolean q;
    private boolean r;

    public adpl(adoz adozVar, adis adisVar, int i) {
        this.b = adozVar;
        this.c = adisVar;
        this.d = i;
    }

    private final void f() {
        adpk adpkVar;
        if (this.i == 0) {
            int i = 0;
            while (i < this.j.size() && (adpkVar = (adpk) this.j.get(i)) != null) {
                i++;
                if (adpkVar.d) {
                    this.i = i;
                    s();
                    return;
                }
            }
        }
    }

    private final boolean q() {
        return this.a != null || this.i > 0;
    }

    private final boolean r() {
        return this.k && this.h >= this.l;
    }

    private final void s() {
        adzv adzvVar = this.f;
        adzvVar.getClass();
        adzv.g(adzvVar);
        adzv.g(this.f);
        this.o++;
    }

    protected abstract void a(adnq adnqVar);

    protected abstract void b();

    public abstract void c(int i, Parcel parcel) throws adnr;

    public abstract void d(int i, Parcel parcel) throws adnr;

    public boolean e() {
        return false;
    }

    @Override // defpackage.adzx
    public final synchronized InputStream g() {
        adpd adpdVar;
        InputStream inputStream = this.a;
        if (inputStream != null) {
            this.a = null;
        } else if (this.p <= 0 || !q()) {
            inputStream = null;
        } else {
            int i = this.i;
            this.i = 0;
            if (i == 1) {
                adpk adpkVar = (adpk) this.j.remove(0);
                int i2 = adpkVar.c;
                InputStream inputStream2 = adpkVar.a;
                adpdVar = new adpd(adpkVar.b);
            } else {
                byte[][] bArr = new byte[i][];
                int length = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    byte[] bArr2 = ((adpk) this.j.remove(0)).b;
                    bArr[i3] = bArr2;
                    length += bArr2.length;
                }
                adpdVar = new adpd(bArr, length);
            }
            this.h += i;
            f();
            inputStream = adpdVar;
        }
        if (inputStream != null) {
            this.p--;
        } else {
            this.r = false;
            if (r() && !p()) {
                m(adpj.d);
                j();
                return null;
            }
        }
        return inputStream;
    }

    public final void h(adnq adnqVar, adnq adnqVar2, boolean z) {
        if (p()) {
            return;
        }
        boolean z2 = this.n != adpj.a;
        m(adpj.f);
        if (z2) {
            this.f.f();
        }
        if (!z) {
            adoz adozVar = this.b;
            int i = this.d;
            try {
                adqf adqfVarC = adqf.c();
                try {
                    adqfVarC.a().writeInt(0);
                    adqs.j(adqfVarC.a(), adqs.h(adqfVarC.a(), adnqVar) | 8);
                    adozVar.v(i, adqfVarC);
                    adqfVarC.close();
                } finally {
                }
            } catch (adnr e) {
                adoz.f.logp(Level.FINER, "io.grpc.binder.internal.BinderTransport", "sendOutOfBandClose", "Failed sending oob close transaction", (Throwable) e);
            }
        }
        if (z2) {
            a(adnqVar2);
        }
        o();
    }

    final void i(adnq adnqVar) {
        h(adnq.c, adnqVar, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0070, code lost:
    
        r4.q = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x003f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0008 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void j() {
        /*
            r4 = this;
            boolean r0 = r4.q
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.q = r0
        L8:
            adpj r1 = r4.n
            int r1 = r1.ordinal()
            r2 = 3
            r3 = 2
            if (r1 == r3) goto L1e
            if (r1 == r2) goto L15
            goto L70
        L15:
            adzy r1 = r4.g
            if (r1 == 0) goto L70
            boolean r1 = r4.k
            if (r1 == 0) goto L70
            goto L37
        L1e:
            adzy r1 = r4.g
            if (r1 == 0) goto L70
            boolean r1 = r4.r
            if (r1 != 0) goto L70
            boolean r1 = r4.q()
            if (r1 == 0) goto L31
            int r1 = r4.p
            if (r1 == 0) goto L70
            goto L37
        L31:
            boolean r1 = r4.r()
            if (r1 == 0) goto L70
        L37:
            adpj r1 = r4.n
            int r1 = r1.ordinal()
            if (r1 == r3) goto L48
            if (r1 != r2) goto L42
            goto L63
        L42:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L48:
            boolean r1 = r4.r
            if (r1 != 0) goto L8
            boolean r1 = r4.q()
            if (r1 == 0) goto L5a
            r4.r = r0
            adzy r1 = r4.g
            r1.d(r4)
            goto L8
        L5a:
            boolean r1 = r4.k
            if (r1 == 0) goto L8
            adpj r1 = defpackage.adpj.d
            r4.m(r1)
        L63:
            boolean r1 = r4.k
            if (r1 == 0) goto L8
            adpj r1 = defpackage.adpj.e
            r4.m(r1)
            r4.b()
            goto L8
        L70:
            r0 = 0
            r4.q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adpl.j():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x009e A[Catch: adnr -> 0x0144, all -> 0x014c, TRY_ENTER, TryCatch #0 {adnr -> 0x0144, blocks: (B:9:0x000c, B:11:0x0019, B:14:0x0022, B:16:0x0036, B:18:0x0040, B:20:0x0044, B:22:0x004e, B:24:0x0054, B:25:0x0057, B:29:0x005e, B:31:0x0062, B:34:0x0068, B:36:0x006c, B:40:0x0073, B:41:0x0082, B:42:0x008b, B:45:0x009e, B:46:0x00a5, B:48:0x00ab, B:50:0x00b9, B:51:0x00bf, B:52:0x00c8, B:53:0x00eb, B:54:0x00ec, B:55:0x0103, B:57:0x0106, B:58:0x010d, B:60:0x0111, B:62:0x0115, B:65:0x011d, B:66:0x0125, B:69:0x0134, B:70:0x013f), top: B:80:0x000c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5 A[Catch: adnr -> 0x0144, all -> 0x014c, TryCatch #0 {adnr -> 0x0144, blocks: (B:9:0x000c, B:11:0x0019, B:14:0x0022, B:16:0x0036, B:18:0x0040, B:20:0x0044, B:22:0x004e, B:24:0x0054, B:25:0x0057, B:29:0x005e, B:31:0x0062, B:34:0x0068, B:36:0x006c, B:40:0x0073, B:41:0x0082, B:42:0x008b, B:45:0x009e, B:46:0x00a5, B:48:0x00ab, B:50:0x00b9, B:51:0x00bf, B:52:0x00c8, B:53:0x00eb, B:54:0x00ec, B:55:0x0103, B:57:0x0106, B:58:0x010d, B:60:0x0111, B:62:0x0115, B:65:0x011d, B:66:0x0125, B:69:0x0134, B:70:0x013f), top: B:80:0x000c, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final synchronized void k(android.os.Parcel r12) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adpl.k(android.os.Parcel):void");
    }

    final void l(adqe adqeVar, adzy adzyVar) {
        this.e = adqeVar;
        this.f = adqeVar.f;
        this.g = adzyVar;
        if (p()) {
            return;
        }
        m(adpj.b);
    }

    protected final void m(adpj adpjVar) {
        adpj adpjVar2 = this.n;
        int iOrdinal = adpjVar.ordinal();
        if (iOrdinal == 1) {
            woy.af(adpjVar2 == adpj.a, "%s -> %s", adpjVar2, adpjVar);
        } else if (iOrdinal == 2) {
            woy.af(adpjVar2 == adpj.b || adpjVar2 == adpj.a, "%s -> %s", adpjVar2, adpjVar);
        } else if (iOrdinal == 3) {
            woy.af(adpjVar2 == adpj.c, "%s -> %s", adpjVar2, adpjVar);
        } else if (iOrdinal == 4) {
            woy.af(adpjVar2 == adpj.d, "%s -> %s", adpjVar2, adpjVar);
        } else if (iOrdinal != 5) {
            throw new AssertionError();
        }
        this.n = adpjVar;
    }

    public final void n(int i) {
        this.p += i;
        j();
    }

    final void o() {
        this.b.r(this);
    }

    protected final boolean p() {
        return this.n == adpj.f;
    }

    public final synchronized String toString() {
        StringBuilder sb;
        String simpleName = getClass().getSimpleName();
        boolean z = this.k;
        String strValueOf = String.valueOf(this.n);
        boolean zQ = q();
        adzy adzyVar = this.g;
        sb = new StringBuilder();
        sb.append(simpleName);
        sb.append("[SfxA=");
        sb.append(z);
        sb.append("/De=");
        sb.append(strValueOf);
        sb.append("/Msg=");
        sb.append(zQ);
        sb.append("/Lis=");
        sb.append(adzyVar != null);
        sb.append("]");
        return sb.toString();
    }
}
