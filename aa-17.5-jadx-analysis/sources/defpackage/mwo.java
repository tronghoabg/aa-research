package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class mwo {
    public static final mwo a;
    public static final mwo b;
    private static final /* synthetic */ mwo[] c;

    static {
        mwo mwoVar = new mwo("Left", 0);
        a = mwoVar;
        mwo mwoVar2 = new mwo("Right", 1);
        b = mwoVar2;
        mwo[] mwoVarArr = {mwoVar, mwoVar2};
        c = mwoVarArr;
        affa.p(mwoVarArr);
    }

    public static mwo valueOf(String str) {
        return (mwo) Enum.valueOf(mwo.class, str);
    }

    public static mwo[] values() {
        return (mwo[]) c.clone();
    }
}
