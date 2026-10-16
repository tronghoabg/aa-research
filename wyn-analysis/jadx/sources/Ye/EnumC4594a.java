package ye;

import ic.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ye.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC4594a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EnumC4594a[] f48197a;

    static {
        EnumC4594a[] enumC4594aArr = {new EnumC4594a("Screens", 0), new EnumC4594a("Contexts", 1)};
        f48197a = enumC4594aArr;
        d.t(enumC4594aArr);
    }

    public static EnumC4594a valueOf(String str) {
        return (EnumC4594a) Enum.valueOf(EnumC4594a.class, str);
    }

    public static EnumC4594a[] values() {
        return (EnumC4594a[]) f48197a.clone();
    }
}
