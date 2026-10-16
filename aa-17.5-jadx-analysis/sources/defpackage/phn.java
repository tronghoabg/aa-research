package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class phn {
    public static final phn a;
    public static final phn b;
    public static final phn c;
    private static final /* synthetic */ phn[] d;

    static {
        phn phnVar = new phn("UNINITIALIZED", 0);
        a = phnVar;
        phn phnVar2 = new phn("STARTED", 1);
        b = phnVar2;
        phn phnVar3 = new phn("STOPPED", 2);
        c = phnVar3;
        d = new phn[]{phnVar, phnVar2, phnVar3};
    }

    public static phn valueOf(String str) {
        return (phn) Enum.valueOf(phn.class, str);
    }

    public static phn[] values() {
        return (phn[]) d.clone();
    }
}
