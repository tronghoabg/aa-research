package androidx.lifecycle;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1449m {
    private static final /* synthetic */ EnumC1449m[] $VALUES;

    @NotNull
    public static final C1447k Companion;
    public static final EnumC1449m ON_ANY;
    public static final EnumC1449m ON_CREATE;
    public static final EnumC1449m ON_DESTROY;
    public static final EnumC1449m ON_PAUSE;
    public static final EnumC1449m ON_RESUME;
    public static final EnumC1449m ON_START;
    public static final EnumC1449m ON_STOP;

    static {
        EnumC1449m enumC1449m = new EnumC1449m("ON_CREATE", 0);
        ON_CREATE = enumC1449m;
        EnumC1449m enumC1449m2 = new EnumC1449m("ON_START", 1);
        ON_START = enumC1449m2;
        EnumC1449m enumC1449m3 = new EnumC1449m("ON_RESUME", 2);
        ON_RESUME = enumC1449m3;
        EnumC1449m enumC1449m4 = new EnumC1449m("ON_PAUSE", 3);
        ON_PAUSE = enumC1449m4;
        EnumC1449m enumC1449m5 = new EnumC1449m("ON_STOP", 4);
        ON_STOP = enumC1449m5;
        EnumC1449m enumC1449m6 = new EnumC1449m("ON_DESTROY", 5);
        ON_DESTROY = enumC1449m6;
        EnumC1449m enumC1449m7 = new EnumC1449m("ON_ANY", 6);
        ON_ANY = enumC1449m7;
        $VALUES = new EnumC1449m[]{enumC1449m, enumC1449m2, enumC1449m3, enumC1449m4, enumC1449m5, enumC1449m6, enumC1449m7};
        Companion = new C1447k();
    }

    public static EnumC1449m valueOf(String str) {
        return (EnumC1449m) Enum.valueOf(EnumC1449m.class, str);
    }

    public static EnumC1449m[] values() {
        return (EnumC1449m[]) $VALUES.clone();
    }

    public final EnumC1450n a() {
        switch (AbstractC1448l.f18675a[ordinal()]) {
            case 1:
            case 2:
                return EnumC1450n.f18678c;
            case 3:
            case 4:
                return EnumC1450n.f18679d;
            case 5:
                return EnumC1450n.f18680e;
            case 6:
                return EnumC1450n.f18676a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
