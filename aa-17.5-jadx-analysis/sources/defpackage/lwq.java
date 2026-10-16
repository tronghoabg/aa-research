package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class lwq {
    public static final lwq a;
    public static final lwq b;
    public static final lwq c;
    public static final lwq d;
    public static final lwq e;
    public static final lwq f;
    public static final lwq g;
    public static final lwq h;
    private static final /* synthetic */ lwq[] i;

    static {
        lwq lwqVar = new lwq("UNKNOWN_SMART_ACTION_TYPE", 0);
        a = lwqVar;
        lwq lwqVar2 = new lwq("TEXT_REPLY", 1);
        b = lwqVar2;
        lwq lwqVar3 = new lwq("TEXT_REPLY_WITH_LABEL", 2);
        c = lwqVar3;
        lwq lwqVar4 = new lwq("EMOJI_REPLY", 3);
        d = lwqVar4;
        lwq lwqVar5 = new lwq("SHARE_LOCATION", 4);
        e = lwqVar5;
        lwq lwqVar6 = new lwq("NAVIGATE", 5);
        f = lwqVar6;
        lwq lwqVar7 = new lwq("CALL_SENDER", 6);
        g = lwqVar7;
        lwq lwqVar8 = new lwq("CALL_NUMBER", 7);
        h = lwqVar8;
        lwq[] lwqVarArr = {lwqVar, lwqVar2, lwqVar3, lwqVar4, lwqVar5, lwqVar6, lwqVar7, lwqVar8};
        i = lwqVarArr;
        affa.p(lwqVarArr);
    }

    public static lwq valueOf(String str) {
        return (lwq) Enum.valueOf(lwq.class, str);
    }

    public static lwq[] values() {
        return (lwq[]) i.clone();
    }
}
