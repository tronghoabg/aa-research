package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zke {
    public static final defpackage.zke a;
    public static final defpackage.zke b;
    public static final defpackage.zke c;
    public static final defpackage.zke d;
    public static final defpackage.zke e;
    private static final /* synthetic */ defpackage.zke[] f;

    static {
        defpackage.zke zkeVar = new defpackage.zke("NO_USER_DATA", 0);
        a = zkeVar;
        defpackage.zke zkeVar2 = new defpackage.zke("SERVER_KNOWN_USER_DATA", 1);
        b = zkeVar2;
        defpackage.zke zkeVar3 = new defpackage.zke("NON_TEXTUAL_INTERACTION_USER_DATA", 2);
        c = zkeVar3;
        defpackage.zke zkeVar4 = new defpackage.zke("CONFIRMED_UPLOAD_SAFE_USER_DATA", 3);
        d = zkeVar4;
        defpackage.zke zkeVar5 = new defpackage.zke("NEW_COLLECTION_USER_DATA", 4);
        e = zkeVar5;
        f = new defpackage.zke[]{zkeVar, zkeVar2, zkeVar3, zkeVar4, zkeVar5};
    }

    public static defpackage.zke valueOf(java.lang.String str) {
        return (defpackage.zke) java.lang.Enum.valueOf(defpackage.zke.class, str);
    }

    public static defpackage.zke[] values() {
        return (defpackage.zke[]) f.clone();
    }
}
