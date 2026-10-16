package defpackage;

/* loaded from: classes.dex */
public final class qhj implements jqv {
    private static final yph a = yph.c("GH.AccountUtils");
    private String b;

    @Override // defpackage.jqv
    public final synchronized String a() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        mki.a.d.execute(new qct(this, 13));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x013b A[Catch: skk -> 0x0142, skl -> 0x0144, RemoteException | skk | skl -> 0x0146, all -> 0x01b9, TRY_LEAVE, TryCatch #5 {, blocks: (B:3:0x0001, B:6:0x000a, B:8:0x0010, B:10:0x002a, B:12:0x003a, B:16:0x004e, B:17:0x007c, B:18:0x0080, B:19:0x0097, B:20:0x00a0, B:22:0x00a6, B:23:0x00b9, B:52:0x0157, B:54:0x015a, B:55:0x0166, B:57:0x0171, B:60:0x018c, B:62:0x0194, B:64:0x0197, B:66:0x01a1, B:70:0x01a8, B:25:0x00c4, B:26:0x00da, B:28:0x00dc, B:30:0x00e4, B:32:0x00ec, B:34:0x00f4, B:35:0x00fa, B:36:0x00fb, B:37:0x010a, B:38:0x010b, B:39:0x0111, B:40:0x0112, B:41:0x0118, B:42:0x0119, B:43:0x013b, B:50:0x0147), top: B:80:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void b() {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qhj.b():void");
    }

    @Override // defpackage.lhg
    public final synchronized void d() {
        this.b = null;
    }

    @Override // defpackage.lhg
    public final void c() {
    }
}
