package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@zje(a = zjc.a)
/* loaded from: classes.dex */
public final class ipj {
    public static final ipj a;
    public static final ipj b;
    public static final ipj c;
    public static final ipj d;
    private static final /* synthetic */ ipj[] e;

    static {
        ipj ipjVar = new ipj("STARTED", 0);
        a = ipjVar;
        ipj ipjVar2 = new ipj("STOPPED", 1);
        b = ipjVar2;
        ipj ipjVar3 = new ipj("RESUMED", 2);
        c = ipjVar3;
        ipj ipjVar4 = new ipj("DESTROYED", 3);
        d = ipjVar4;
        ipj[] ipjVarArr = {ipjVar, ipjVar2, ipjVar3, ipjVar4};
        e = ipjVarArr;
        affa.p(ipjVarArr);
    }

    public static ipj valueOf(String str) {
        return (ipj) Enum.valueOf(ipj.class, str);
    }

    public static ipj[] values() {
        return (ipj[]) e.clone();
    }
}
