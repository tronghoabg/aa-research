package com.waze.sharedui.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class EmailConsent {
    private static final /* synthetic */ h.d.a $ENTRIES;
    private static final /* synthetic */ EmailConsent[] $VALUES;
    public static final i Companion;
    private final String configString;
    public static final EmailConsent None = new EmailConsent("None", 0, "");
    public static final EmailConsent NotShown = new EmailConsent("NotShown", 1, "hidden");
    public static final EmailConsent Given = new EmailConsent("Given", 2, "yes");
    public static final EmailConsent Denied = new EmailConsent("Denied", 3, "no");

    private static final /* synthetic */ EmailConsent[] $values() {
        return new EmailConsent[]{None, NotShown, Given, Denied};
    }

    static {
        EmailConsent[] emailConsentArr$values = $values();
        $VALUES = emailConsentArr$values;
        $ENTRIES = h.d.b.a(emailConsentArr$values);
        Companion = new i();
    }

    private EmailConsent(String str, int i2, String str2) {
        this.configString = str2;
    }

    public static h.d.a<EmailConsent> getEntries() {
        return $ENTRIES;
    }

    public static EmailConsent valueOf(String str) {
        return (EmailConsent) Enum.valueOf(EmailConsent.class, str);
    }

    public static EmailConsent[] values() {
        return (EmailConsent[]) $VALUES.clone();
    }

    public final String getConfigString() {
        return this.configString;
    }
}
