package defpackage;

/* loaded from: classes.dex */
public final class wbv extends wbw {
    private volatile boolean d;
    private Object e;

    public wbv(String str, String str2, wcr wcrVar, wbs wbsVar, String str3) {
        super(str, str2, wcrVar, wbsVar);
        this.e = str3;
        this.d = true;
    }

    @Override // defpackage.wbo
    public final Object e() {
        if (this.d) {
            synchronized (this) {
                if (this.d) {
                    Object objGw = gw((String) this.e);
                    objGw.getClass();
                    this.e = objGw;
                    this.d = false;
                }
            }
        }
        return this.e;
    }
}
