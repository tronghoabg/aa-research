package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class wiy implements wit {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ wiy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.wit
    public final void a(String str) {
        int i = this.b;
        Object obj = this.a;
        if (i != 0) {
            ((wis) obj).d = str;
            return;
        }
        wjb wjbVar = (wjb) obj;
        wjbVar.k = str;
        whn whnVarA = wjbVar.a();
        if (whnVarA != null) {
            ykd.r(vuf.h, whnVarA);
        }
    }
}
