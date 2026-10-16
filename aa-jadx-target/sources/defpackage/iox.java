package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class iox implements defpackage.inm {
    private final /* synthetic */ int a;

    public /* synthetic */ iox(int i) {
        this.a = i;
    }

    @Override // defpackage.inm
    public final defpackage.ioi a(defpackage.ioh iohVar, android.content.ComponentName componentName) {
        if (this.a != 0) {
            defpackage.inm inmVar = defpackage.iop.E;
            return new ion(iohVar, componentName);
        }
        defpackage.yqm yqmVar = defpackage.iph.E;
        return new defpackage.ipf(iohVar, componentName);
    }
}
