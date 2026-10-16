package defpackage;

/* loaded from: classes2.dex */
public final class pmr implements pmq {
    private static final String[] a = {"zb", "current_account_id", "current_account_name", "signout_reason", "bk_zb"};
    private final pyh b;
    private final Object c = new Object();

    public pmr(pyh pyhVar) {
        this.b = pyhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011d A[Catch: all -> 0x0138, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0031, B:8:0x0037, B:10:0x003b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:17:0x0053, B:18:0x0055, B:34:0x0117, B:37:0x011d, B:40:0x0127, B:41:0x012b, B:42:0x012e, B:44:0x0133, B:45:0x0136, B:20:0x009c, B:22:0x00a2, B:24:0x00a8, B:26:0x00b4, B:27:0x00c6, B:29:0x00cc, B:30:0x00de, B:33:0x0115), top: B:50:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0133 A[Catch: all -> 0x0138, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0031, B:8:0x0037, B:10:0x003b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:17:0x0053, B:18:0x0055, B:34:0x0117, B:37:0x011d, B:40:0x0127, B:41:0x012b, B:42:0x012e, B:44:0x0133, B:45:0x0136, B:20:0x009c, B:22:0x00a2, B:24:0x00a8, B:26:0x00b4, B:27:0x00c6, B:29:0x00cc, B:30:0x00de, B:33:0x0115), top: B:50:0x0003 }] */
    @Override // defpackage.pmq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.abrz a() {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pmr.a():abrz");
    }

    @Override // defpackage.pmq
    public final boolean b(xxh xxhVar, abrz abrzVar) {
        synchronized (this.c) {
            abrz abrzVarA = a();
            if (!((abnv) ((xxm) xxhVar).a).equals(abrzVarA)) {
                return false;
            }
            if (abrzVar.equals(abrzVarA)) {
                return true;
            }
            pyh pyhVar = this.b;
            pyhVar.n(pyk.U, abrzVar);
            return pyhVar.g();
        }
    }
}
