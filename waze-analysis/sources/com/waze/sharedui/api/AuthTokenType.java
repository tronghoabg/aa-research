package com.waze.sharedui.api;

import i.b.l.at;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class AuthTokenType {
    private static final /* synthetic */ h.d.a $ENTRIES;
    private static final /* synthetic */ AuthTokenType[] $VALUES;
    private final at forCommunityCommand;
    private final i.b.p.c forSocialCommand;
    public static final AuthTokenType CODE = new AuthTokenType("CODE", 0, at.CODE, i.b.p.c.CODE);
    public static final AuthTokenType AS_IS = new AuthTokenType("AS_IS", 1, at.AS_IS, i.b.p.c.AS_IS);

    private static final /* synthetic */ AuthTokenType[] $values() {
        return new AuthTokenType[]{CODE, AS_IS};
    }

    static {
        AuthTokenType[] authTokenTypeArr$values = $values();
        $VALUES = authTokenTypeArr$values;
        $ENTRIES = h.d.b.a(authTokenTypeArr$values);
    }

    private AuthTokenType(String str, int i2, at atVar, i.b.p.c cVar) {
        this.forCommunityCommand = atVar;
        this.forSocialCommand = cVar;
    }

    public static h.d.a<AuthTokenType> getEntries() {
        return $ENTRIES;
    }

    public static AuthTokenType valueOf(String str) {
        return (AuthTokenType) Enum.valueOf(AuthTokenType.class, str);
    }

    public static AuthTokenType[] values() {
        return (AuthTokenType[]) $VALUES.clone();
    }

    public final at getForCommunityCommand() {
        return this.forCommunityCommand;
    }

    public final i.b.p.c getForSocialCommand() {
        return this.forSocialCommand;
    }
}
