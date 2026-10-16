package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hny {
    public static final hny a;
    public static final hny b;
    public static final hny c;
    public static final hny d;
    public static final hny e;
    public static final /* synthetic */ afdf f;
    private static final /* synthetic */ hny[] h;
    public final String g;

    static {
        hny hnyVar = new hny("UNKNOWN", 0, "unknown");
        a = hnyVar;
        hny hnyVar2 = new hny("REMINDER", 1, "reminder");
        b = hnyVar2;
        hny hnyVar3 = new hny("LIST", 2, "list");
        c = hnyVar3;
        hny hnyVar4 = new hny("CALENDAR", 3, "calendar");
        d = hnyVar4;
        hny hnyVar5 = new hny("TASKS", 4, "tasks");
        e = hnyVar5;
        hny[] hnyVarArr = {hnyVar, hnyVar2, hnyVar3, hnyVar4, hnyVar5};
        h = hnyVarArr;
        f = affa.p(hnyVarArr);
    }

    private hny(String str, int i, String str2) {
        this.g = str2;
    }

    public static hny valueOf(String str) {
        return (hny) Enum.valueOf(hny.class, str);
    }

    public static hny[] values() {
        return (hny[]) h.clone();
    }
}
