package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rry {
    public static final rry a;
    public static final rry b;
    public static final rry c;
    public static final rry d;
    public static final rry e;
    private static final /* synthetic */ rry[] f;

    static {
        rry rryVar = new rry("FIRST_ACTIVITY_CLASS_LOADED", 0);
        a = rryVar;
        rry rryVar2 = new rry("FACET_BAR_FIRST_RESUME", 1);
        b = rryVar2;
        rry rryVar3 = new rry("CAR_SERVICE_VIDEO_FOCUS_GAINED", 2);
        c = rryVar3;
        rry rryVar4 = new rry("PROJECTION_LIFECYCLE_LISTENER_ON_PROJECTION_START", 3);
        d = rryVar4;
        rry rryVar5 = new rry("PRIMARY_REGION_FIRST_CAR_ACTIVITY_RESUME", 4);
        e = rryVar5;
        f = new rry[]{rryVar, rryVar2, rryVar3, rryVar4, rryVar5};
    }

    public static rry valueOf(String str) {
        return (rry) Enum.valueOf(rry.class, str);
    }

    public static rry[] values() {
        return (rry[]) f.clone();
    }
}
