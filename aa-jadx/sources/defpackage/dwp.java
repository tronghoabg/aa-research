package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dwp implements java.util.concurrent.Callable {
    final /* synthetic */ java.lang.String a;
    final /* synthetic */ android.content.Context b;
    final /* synthetic */ java.util.List c;
    final /* synthetic */ int d;

    public dwp(java.lang.String str, android.content.Context context, java.util.List list, int i) {
        this.a = str;
        this.b = context;
        this.c = list;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.acku call() {
        try {
            return defpackage.dwr.b(this.a, this.b, this.c, this.d);
        } catch (java.lang.Throwable unused) {
            return new defpackage.acku(-3, null, null);
        }
    }
}
