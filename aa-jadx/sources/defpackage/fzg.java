package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public class fzg {
    public static final defpackage.fzg a;
    public static final defpackage.fzg b;
    private static final /* synthetic */ defpackage.fzg[] j;
    public final defpackage.gjr c;
    public final defpackage.gjr d;
    public final defpackage.gjr e;
    public final defpackage.gjr f;
    public final defpackage.gjr g;
    public final defpackage.fwr h;
    public final defpackage.fxg i;

    static {
        defpackage.fzf fzfVar = new defpackage.fzf();
        a = fzfVar;
        defpackage.fzf fzfVar2 = new defpackage.fzf(null);
        b = fzfVar2;
        defpackage.fzg[] fzgVarArr = {fzfVar, fzfVar2};
        j = fzgVarArr;
        defpackage.afga.p(fzgVarArr);
    }

    public fzg(java.lang.String str, int i, defpackage.gjr gjrVar, defpackage.gjr gjrVar2, defpackage.gjr gjrVar3, defpackage.gjr gjrVar4, defpackage.gjr gjrVar5, defpackage.fwr fwrVar, defpackage.fxg fxgVar) {
        super(str, i);
        this.c = gjrVar;
        this.d = gjrVar2;
        this.e = gjrVar3;
        this.f = gjrVar4;
        this.g = gjrVar5;
        this.h = fwrVar;
        this.i = fxgVar;
    }

    public static defpackage.fzg valueOf(java.lang.String str) {
        return (defpackage.fzg) java.lang.Enum.valueOf(defpackage.fzg.class, str);
    }

    public static defpackage.fzg[] values() {
        return (defpackage.fzg[]) j.clone();
    }
}
