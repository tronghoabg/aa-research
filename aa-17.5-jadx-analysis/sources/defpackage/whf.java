package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class whf {
    public static final whf a;
    public static final whf b;
    public static final whf c;
    public static final whf d;
    public static final whf e;
    private static final /* synthetic */ whf[] f;

    static {
        whf whfVar = new whf("BACKEND_TIMEOUT", 0);
        a = whfVar;
        whf whfVar2 = new whf("FAILED_TO_FETCH_SURVEY", 1);
        b = whfVar2;
        whf whfVar3 = new whf("NO_AVAILABLE_SURVEY", 2);
        c = whfVar3;
        whf whfVar4 = new whf("TRIGGER_ID_NOT_SET", 3);
        d = whfVar4;
        whf whfVar5 = new whf("UNSUPPORTED_CRONET_ENGINE", 4);
        e = whfVar5;
        f = new whf[]{whfVar, whfVar2, whfVar3, whfVar4, whfVar5};
    }

    public static whf valueOf(String str) {
        return (whf) Enum.valueOf(whf.class, str);
    }

    public static whf[] values() {
        return (whf[]) f.clone();
    }
}
