package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class twu {
    public static final twu a;
    public static final twu b;
    public static final twu c;
    public static final twu d;
    public static final twu e;
    public static final twu f;
    private static final /* synthetic */ twu[] g;

    static {
        twu twuVar = new twu("PAN_UP", 0);
        a = twuVar;
        twu twuVar2 = new twu("PAN_DOWN", 1);
        b = twuVar2;
        twu twuVar3 = new twu("PAN_LEFT", 2);
        c = twuVar3;
        twu twuVar4 = new twu("PAN_RIGHT", 3);
        d = twuVar4;
        twu twuVar5 = new twu("ZOOM_IN", 4);
        e = twuVar5;
        twu twuVar6 = new twu("ZOOM_OUT", 5);
        f = twuVar6;
        g = new twu[]{twuVar, twuVar2, twuVar3, twuVar4, twuVar5, twuVar6};
    }

    public static twu valueOf(String str) {
        return (twu) Enum.valueOf(twu.class, str);
    }

    public static twu[] values() {
        return (twu[]) g.clone();
    }
}
