package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class whh implements defpackage.zgn {
    private final /* synthetic */ int a;

    public /* synthetic */ whh(int i) {
        this.a = i;
    }

    @Override // defpackage.zgn
    public final defpackage.zhs a(java.lang.Object obj) {
        if (this.a == 0) {
            return new defpackage.zho("");
        }
        defpackage.sls slsVar = (defpackage.sls) obj;
        throw new defpackage.wbu(slsVar.a(), slsVar.getMessage(), slsVar);
    }
}
