package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hpg {
    public static final hpg a;
    public static final hpg b;
    public static final /* synthetic */ afdf c;
    private static final /* synthetic */ hpg[] d;

    static {
        hpg hpgVar = new hpg("SAVE_SENDER_TO_CONTACT", 0);
        a = hpgVar;
        hpg hpgVar2 = new hpg("SAVE_THIRD_PARTY_TO_CONTACT", 1);
        b = hpgVar2;
        hpg[] hpgVarArr = {hpgVar, hpgVar2};
        d = hpgVarArr;
        c = affa.p(hpgVarArr);
    }

    public static hpg valueOf(String str) {
        return (hpg) Enum.valueOf(hpg.class, str);
    }

    public static hpg[] values() {
        return (hpg[]) d.clone();
    }
}
