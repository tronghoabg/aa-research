package com.waze.uid.state_impl.username_login;

import com.waze.sharedui.profile.UserProfile;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class LoginParameters extends com.waze.uid.e.d {
    public static final int $stable = 8;
    private boolean didFindRecoveryCredentials;
    private UserProfile existingProfile;
    private LOGIN_OPTION loginOption;
    private String username = "";
    private String password = "";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    public final class LOGIN_OPTION {
        private static final /* synthetic */ h.d.a $ENTRIES;
        private static final /* synthetic */ LOGIN_OPTION[] $VALUES;
        public static final LOGIN_OPTION EMAIL = new LOGIN_OPTION("EMAIL", 0);
        public static final LOGIN_OPTION USERNAME = new LOGIN_OPTION("USERNAME", 1);
        public static final LOGIN_OPTION GOOGLE = new LOGIN_OPTION("GOOGLE", 2);

        private static final /* synthetic */ LOGIN_OPTION[] $values() {
            return new LOGIN_OPTION[]{EMAIL, USERNAME, GOOGLE};
        }

        static {
            LOGIN_OPTION[] login_optionArr$values = $values();
            $VALUES = login_optionArr$values;
            $ENTRIES = h.d.b.a(login_optionArr$values);
        }

        private LOGIN_OPTION(String str, int i2) {
        }

        public static h.d.a<LOGIN_OPTION> getEntries() {
            return $ENTRIES;
        }

        public static LOGIN_OPTION valueOf(String str) {
            return (LOGIN_OPTION) Enum.valueOf(LOGIN_OPTION.class, str);
        }

        public static LOGIN_OPTION[] values() {
            return (LOGIN_OPTION[]) $VALUES.clone();
        }
    }

    public final boolean getDidFindRecoveryCredentials() {
        return this.didFindRecoveryCredentials;
    }

    public final UserProfile getExistingProfile() {
        return this.existingProfile;
    }

    public final LOGIN_OPTION getLoginOption() {
        return this.loginOption;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getUsername() {
        return this.username;
    }

    @Override // com.waze.uid.e.d
    public void reset() {
        this.existingProfile = null;
        this.loginOption = null;
        this.username = "";
        this.password = "";
        this.didFindRecoveryCredentials = false;
    }

    public final void setDidFindRecoveryCredentials(boolean z) {
        this.didFindRecoveryCredentials = z;
    }

    public final void setExistingProfile(UserProfile userProfile) {
        this.existingProfile = userProfile;
    }

    public final void setLoginOption(LOGIN_OPTION login_option) {
        this.loginOption = login_option;
    }

    public final void setPassword(String str) {
        x.f(str, "<set-?>");
        this.password = str;
    }

    public final void setUsername(String str) {
        x.f(str, "<set-?>");
        this.username = str;
    }
}
