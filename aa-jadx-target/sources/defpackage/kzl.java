package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class kzl {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.AssistIntentResultPr");
    public final android.content.Context b;

    public kzl(android.content.Context context) {
        context.getClass();
        this.b = context;
    }

    public static final android.content.ComponentName b(java.lang.String str) {
        return (android.content.ComponentName) j$.util.Collection.-EL.stream(defpackage.ler.a().e(defpackage.kit.b().e(), defpackage.nze.a())).map(new defpackage.khy(16)).filter(new defpackage.kqi(5)).map(new defpackage.khy(17)).filter(new defpackage.koo(str, 13)).findFirst().orElse((java.lang.Object) null);
    }

    public static final boolean c(android.content.Intent intent) {
        java.lang.String str = intent.getPackage();
        if (str == null) {
            return false;
        }
        return j$.util.Collection.-EL.stream(defpackage.ler.a().b(defpackage.kit.b().e(), defpackage.nze.b())).filter(new defpackage.kqi(4)).map(new defpackage.khy(14)).map(new defpackage.khy(15)).anyMatch(new defpackage.koo(str, 12));
    }

    public abstract void a(android.content.Intent intent);
}
