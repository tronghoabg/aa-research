package com.waze.sharedui.profile;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class UserProfileSource {
    private static final /* synthetic */ h.d.a $ENTRIES;
    private static final /* synthetic */ UserProfileSource[] $VALUES;
    public static final UserProfileSource CACHE = new UserProfileSource("CACHE", 0);
    public static final UserProfileSource SERVER = new UserProfileSource("SERVER", 1);

    private static final /* synthetic */ UserProfileSource[] $values() {
        return new UserProfileSource[]{CACHE, SERVER};
    }

    static {
        UserProfileSource[] userProfileSourceArr$values = $values();
        $VALUES = userProfileSourceArr$values;
        $ENTRIES = h.d.b.a(userProfileSourceArr$values);
    }

    private UserProfileSource(String str, int i2) {
    }

    public static h.d.a<UserProfileSource> getEntries() {
        return $ENTRIES;
    }

    public static UserProfileSource valueOf(String str) {
        return (UserProfileSource) Enum.valueOf(UserProfileSource.class, str);
    }

    public static UserProfileSource[] values() {
        return (UserProfileSource[]) $VALUES.clone();
    }
}
