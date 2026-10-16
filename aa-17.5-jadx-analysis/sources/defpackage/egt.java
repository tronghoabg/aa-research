package defpackage;

import java.io.File;

/* loaded from: classes2.dex */
public final class egt implements egp {
    public static final dsz c = new dsz();
    public final String a;
    public final String b;
    private final afco d;
    private final File e;
    private final aiyk f;
    private final String g;
    private final aezr h;
    private final aezr i;
    private final ajdz j;

    public egt(afco afcoVar, File file) {
        afcoVar.getClass();
        this.d = afcoVar;
        this.e = file;
        Object obj = egu.a;
        this.f = new aiyh(new ezu(file, (afck) null, 1), afcp.a, -2, 1);
        this.a = ".lock";
        this.b = ".version";
        this.g = "fcntl failed: EAGAIN";
        this.j = new ajdz();
        this.h = woy.dG(new cxm(this, 16));
        this.i = woy.dG(new cxm(this, 17));
    }

    public static final void h(File file) {
        eeo.a(file);
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    private final File i() {
        return (File) this.h.a();
    }

    @Override // defpackage.egp
    public final Object a(afck afckVar) {
        return this.i.b() ? new Integer(f().a()) : ahnc.a(this.d, new dxi(this, (afck) null, 3), afckVar);
    }

    @Override // defpackage.egp
    public final Object b(afck afckVar) {
        return this.i.b() ? new Integer(f().b()) : ahnc.a(this.d, new dxi(this, (afck) null, 4, (byte[]) null), afckVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7 A[Catch: all -> 0x00cd, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x00cd, blocks: (B:37:0x00c7, B:51:0x00e5, B:52:0x00ea), top: B:63:0x0023, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e5 A[Catch: all -> 0x00cd, TRY_ENTER, TryCatch #5 {all -> 0x00cd, blocks: (B:37:0x00c7, B:51:0x00e5, B:52:0x00ea), top: B:63:0x0023, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[Catch: all -> 0x00cd, SYNTHETIC, TRY_LEAVE, TryCatch #5 {all -> 0x00cd, blocks: (B:37:0x00c7, B:51:0x00e5, B:52:0x00ea), top: B:63:0x0023, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [afec, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [ajdz] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [afec] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object] */
    @Override // defpackage.egp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.afec r10, defpackage.afck r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egt.c(afec, afck):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc A[Catch: all -> 0x0102, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0102, blocks: (B:52:0x00fc, B:69:0x011d, B:70:0x0122), top: B:85:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011d A[Catch: all -> 0x0102, TRY_ENTER, TryCatch #2 {all -> 0x0102, blocks: (B:52:0x00fc, B:69:0x011d, B:70:0x0122), top: B:85:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0131  */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v12, types: [ajdz] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [ajdz] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [ajdz] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    @Override // defpackage.egp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.afeg r20, defpackage.afck r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egt.d(afeg, afck):java.lang.Object");
    }

    @Override // defpackage.egp
    public final aiyk e() {
        return this.f;
    }

    public final ehd f() {
        return (ehd) this.i.a();
    }

    public final File g(String str) {
        return new File(String.valueOf(this.e.getAbsolutePath()).concat(str));
    }
}
