package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class zjc {
    public static final zjc a;
    public static final zjc b;
    public static final zjc c;
    public static final zjc d;
    public static final zjc e;
    private static final /* synthetic */ zjc[] f;

    static {
        zjc zjcVar = new zjc("NO_USER_DATA", 0);
        a = zjcVar;
        zjc zjcVar2 = new zjc("SERVER_KNOWN_USER_DATA", 1);
        b = zjcVar2;
        zjc zjcVar3 = new zjc("NON_TEXTUAL_INTERACTION_USER_DATA", 2);
        c = zjcVar3;
        zjc zjcVar4 = new zjc("CONFIRMED_UPLOAD_SAFE_USER_DATA", 3);
        d = zjcVar4;
        zjc zjcVar5 = new zjc("NEW_COLLECTION_USER_DATA", 4);
        e = zjcVar5;
        f = new zjc[]{zjcVar, zjcVar2, zjcVar3, zjcVar4, zjcVar5};
    }

    public static zjc valueOf(String str) {
        return (zjc) Enum.valueOf(zjc.class, str);
    }

    public static zjc[] values() {
        return (zjc[]) f.clone();
    }
}
