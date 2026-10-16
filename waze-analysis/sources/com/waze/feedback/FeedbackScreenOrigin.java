package com.waze.feedback;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class FeedbackScreenOrigin {
    private static final /* synthetic */ h.d.a $ENTRIES;
    private static final /* synthetic */ FeedbackScreenOrigin[] $VALUES;
    public static final FeedbackScreenOrigin CONFIRM_ACCOUNT_SHOWN = new FeedbackScreenOrigin("CONFIRM_ACCOUNT_SHOWN", 0);
    public static final FeedbackScreenOrigin CONFLICT_SCREEN_SHOWN = new FeedbackScreenOrigin("CONFLICT_SCREEN_SHOWN", 1);
    public static final FeedbackScreenOrigin CONFLICTING_ACCOUNTS_SCREEN_SHOWN = new FeedbackScreenOrigin("CONFLICTING_ACCOUNTS_SCREEN_SHOWN", 2);
    public static final FeedbackScreenOrigin ENTER_PASSWORD_SHOWN = new FeedbackScreenOrigin("ENTER_PASSWORD_SHOWN", 3);
    public static final FeedbackScreenOrigin GOOGLE_CONNECT_ERROR_SHOWN = new FeedbackScreenOrigin("GOOGLE_CONNECT_ERROR_SHOWN", 4);
    public static final FeedbackScreenOrigin LOGIN_SHOWN = new FeedbackScreenOrigin("LOGIN_SHOWN", 5);
    public static final FeedbackScreenOrigin OB_EMAIL_NOT_VERIFIED_SHOWN = new FeedbackScreenOrigin("OB_EMAIL_NOT_VERIFIED_SHOWN", 6);
    public static final FeedbackScreenOrigin OB_EMAIL_VERIFICATION_CODE_SHOWN = new FeedbackScreenOrigin("OB_EMAIL_VERIFICATION_CODE_SHOWN", 7);
    public static final FeedbackScreenOrigin OB_ENTER_EMAIL_SHOWN = new FeedbackScreenOrigin("OB_ENTER_EMAIL_SHOWN", 8);
    public static final FeedbackScreenOrigin UNKNOWN_EMAIL_SHOWN = new FeedbackScreenOrigin("UNKNOWN_EMAIL_SHOWN", 9);
    public static final FeedbackScreenOrigin VERIFY_EMAIL_SCREEN_SHOWN = new FeedbackScreenOrigin("VERIFY_EMAIL_SCREEN_SHOWN", 10);
    public static final FeedbackScreenOrigin WELCOME_SCREEN_SHOWN = new FeedbackScreenOrigin("WELCOME_SCREEN_SHOWN", 11);

    private static final /* synthetic */ FeedbackScreenOrigin[] $values() {
        return new FeedbackScreenOrigin[]{CONFIRM_ACCOUNT_SHOWN, CONFLICT_SCREEN_SHOWN, CONFLICTING_ACCOUNTS_SCREEN_SHOWN, ENTER_PASSWORD_SHOWN, GOOGLE_CONNECT_ERROR_SHOWN, LOGIN_SHOWN, OB_EMAIL_NOT_VERIFIED_SHOWN, OB_EMAIL_VERIFICATION_CODE_SHOWN, OB_ENTER_EMAIL_SHOWN, UNKNOWN_EMAIL_SHOWN, VERIFY_EMAIL_SCREEN_SHOWN, WELCOME_SCREEN_SHOWN};
    }

    static {
        FeedbackScreenOrigin[] feedbackScreenOriginArr$values = $values();
        $VALUES = feedbackScreenOriginArr$values;
        $ENTRIES = h.d.b.a(feedbackScreenOriginArr$values);
    }

    private FeedbackScreenOrigin(String str, int i2) {
    }

    public static h.d.a<FeedbackScreenOrigin> getEntries() {
        return $ENTRIES;
    }

    public static FeedbackScreenOrigin valueOf(String str) {
        return (FeedbackScreenOrigin) Enum.valueOf(FeedbackScreenOrigin.class, str);
    }

    public static FeedbackScreenOrigin[] values() {
        return (FeedbackScreenOrigin[]) $VALUES.clone();
    }
}
