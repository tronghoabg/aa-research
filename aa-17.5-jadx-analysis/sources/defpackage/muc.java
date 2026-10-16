package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class muc {
    public static final muc a;
    public static final muc b;
    public static final muc c;
    private static final /* synthetic */ muc[] d;

    static {
        muc mucVar = new muc("SHOWN", 0);
        a = mucVar;
        muc mucVar2 = new muc("HIDDEN", 1);
        b = mucVar2;
        muc mucVar3 = new muc("FINISHED", 2);
        c = mucVar3;
        muc[] mucVarArr = {mucVar, mucVar2, mucVar3};
        d = mucVarArr;
        affa.p(mucVarArr);
    }

    public static muc valueOf(String str) {
        return (muc) Enum.valueOf(muc.class, str);
    }

    public static muc[] values() {
        return (muc[]) d.clone();
    }
}
