package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class jpt implements jpu {
    public final /* synthetic */ jpw a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ jpt(jpw jpwVar, String str, Object obj, int i) {
        this.d = i;
        this.a = jpwVar;
        this.b = str;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.jpu, java.util.concurrent.Callable
    public final Object call() {
        int i = this.d;
        jpw jpwVar = this.a;
        if (i != 0) {
            return jpwVar.m().Y(this.b, (String) this.c);
        }
        return jpwVar.m().ad(this.b, this.c);
    }
}
