package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@zje(a = zjc.a)
/* loaded from: classes2.dex */
final class qkc {
    public static final qkc a;
    public static final qkc b;
    public static final qkc c;
    public static final qkc d;
    private static final /* synthetic */ qkc[] e;

    static {
        qkc qkcVar = new qkc("BEFORE_START_OF_DRIVE", 0);
        a = qkcVar;
        qkc qkcVar2 = new qkc("ON_START_OF_DRIVE_NON_PLAYING_MEDIA_ITEM", 1);
        b = qkcVar2;
        qkc qkcVar3 = new qkc("START_OF_DRIVE_NON_PLAYING_MEDIA_ITEM_IS_PLAYING_DUE_TO_USER_ACTION", 2);
        c = qkcVar3;
        qkc qkcVar4 = new qkc("BEYOND_START_OF_DRIVE", 3);
        d = qkcVar4;
        e = new qkc[]{qkcVar, qkcVar2, qkcVar3, qkcVar4};
    }

    public static qkc valueOf(String str) {
        return (qkc) Enum.valueOf(qkc.class, str);
    }

    public static qkc[] values() {
        return (qkc[]) e.clone();
    }
}
