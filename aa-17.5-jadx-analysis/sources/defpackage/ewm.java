package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class ewm implements afec {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ewm(int i) {
        this.b = i;
        this.a = "SELECT DISTINCT work_spec_id FROM SystemIdInfo";
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Type inference failed for: r5v37, types: [afdr, java.lang.Object] */
    @Override // defpackage.afec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewm.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ ewm(int i, byte[] bArr) {
        this.b = i;
        this.a = "DELETE FROM WorkProgress";
    }

    public /* synthetic */ ewm(int i, char[] cArr) {
        this.b = i;
        this.a = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1";
    }

    public /* synthetic */ ewm(int i, float[] fArr) {
        this.b = i;
        this.a = "SELECT * FROM workspec WHERE state=1";
    }

    public /* synthetic */ ewm(int i, int[] iArr) {
        this.b = i;
        this.a = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1";
    }

    public /* synthetic */ ewm(int i, short[] sArr) {
        this.b = i;
        this.a = "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)";
    }

    public /* synthetic */ ewm(int i, boolean[] zArr) {
        this.b = i;
        this.a = "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }

    public /* synthetic */ ewm(int i, byte[][] bArr) {
        this.b = i;
        this.a = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time";
    }

    public /* synthetic */ ewm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
