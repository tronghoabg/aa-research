package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jlg {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.PreSetupMngr");
    public final defpackage.jle b;
    private final defpackage.jlh c;

    public jlg(android.content.Context context) {
        defpackage.jle jleVar = new defpackage.jle(context);
        defpackage.jlh jlhVar = new defpackage.jlh();
        this.b = jleVar;
        this.c = jlhVar;
    }

    public final void a(android.content.Context context, int i) {
        defpackage.jlh jlhVar = this.c;
        jlhVar.a = 2;
        jlhVar.b = i;
        jlhVar.c = new android.content.Intent();
        jlhVar.a(context);
    }
}
