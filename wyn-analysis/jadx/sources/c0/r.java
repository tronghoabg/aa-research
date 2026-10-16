package c0;

import E5.Q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f19534a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f19535b;

    /* renamed from: c, reason: collision with root package name */
    public static final r f19536c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f19537d;

    /* renamed from: e, reason: collision with root package name */
    public static final r f19538e;

    /* renamed from: f, reason: collision with root package name */
    public static final r f19539f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ r[] f19540g;

    static {
        r rVar = new r("Active", 0);
        f19534a = rVar;
        r rVar2 = new r("ActiveParent", 1);
        f19535b = rVar2;
        r rVar3 = new r("Captured", 2);
        f19536c = rVar3;
        r rVar4 = new r("Deactivated", 3);
        f19537d = rVar4;
        r rVar5 = new r("DeactivatedParent", 4);
        f19538e = rVar5;
        r rVar6 = new r("Inactive", 5);
        f19539f = rVar6;
        f19540g = new r[]{rVar, rVar2, rVar3, rVar4, rVar5, rVar6};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f19540g.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return false;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return true;
        }
        if (iOrdinal == 5) {
            return false;
        }
        throw new Q((byte) 0, 9);
    }

    public final boolean b() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
                    return false;
                }
                throw new Q((byte) 0, 9);
            }
        }
        return true;
    }
}
