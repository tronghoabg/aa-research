package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class wgi implements zfk {
    private final /* synthetic */ int a;

    public /* synthetic */ wgi(int i) {
        this.a = i;
    }

    @Override // defpackage.zfk
    public final zgp a(Object obj) {
        if (this.a == 0) {
            return new zgl("");
        }
        skw skwVar = (skw) obj;
        throw new way(skwVar.a(), skwVar.getMessage(), skwVar);
    }
}
