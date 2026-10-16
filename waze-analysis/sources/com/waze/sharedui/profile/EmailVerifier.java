package com.waze.sharedui.profile;

import com.waze.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class EmailVerifier {
    private static final /* synthetic */ h.d.a $ENTRIES;
    private static final /* synthetic */ EmailVerifier[] $VALUES;
    private final Integer iconId;
    public static final EmailVerifier UNKNOWN = new EmailVerifier("UNKNOWN", 0, null);
    public static final EmailVerifier GOOGLE = new EmailVerifier("GOOGLE", 1, Integer.valueOf(R.drawable.google));

    private static final /* synthetic */ EmailVerifier[] $values() {
        return new EmailVerifier[]{UNKNOWN, GOOGLE};
    }

    static {
        EmailVerifier[] emailVerifierArr$values = $values();
        $VALUES = emailVerifierArr$values;
        $ENTRIES = h.d.b.a(emailVerifierArr$values);
    }

    private EmailVerifier(String str, int i2, Integer num) {
        this.iconId = num;
    }

    public static h.d.a<EmailVerifier> getEntries() {
        return $ENTRIES;
    }

    public static EmailVerifier valueOf(String str) {
        return (EmailVerifier) Enum.valueOf(EmailVerifier.class, str);
    }

    public static EmailVerifier[] values() {
        return (EmailVerifier[]) $VALUES.clone();
    }

    public final Integer getIconId() {
        return this.iconId;
    }
}
