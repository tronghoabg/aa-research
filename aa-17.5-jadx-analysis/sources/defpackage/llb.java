package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class llb {
    public static final llb a;
    public static final llb b;
    public static final llb c;
    private static final /* synthetic */ llb[] d;

    static {
        llb llbVar = new llb("UNPLAYED", 0);
        a = llbVar;
        llb llbVar2 = new llb("DOWNLOADED", 1);
        b = llbVar2;
        llb llbVar3 = new llb("EXPLICIT", 2);
        c = llbVar3;
        llb[] llbVarArr = {llbVar, llbVar2, llbVar3};
        d = llbVarArr;
        affa.p(llbVarArr);
    }

    public static llb valueOf(String str) {
        return (llb) Enum.valueOf(llb.class, str);
    }

    public static llb[] values() {
        return (llb[]) d.clone();
    }
}
