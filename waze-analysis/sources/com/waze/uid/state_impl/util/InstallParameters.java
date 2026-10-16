package com.waze.uid.state_impl.util;

import androidx.core.app.NotificationCompat;
import com.waze.uid.e.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class InstallParameters extends d {
    public Community community;
    public boolean didChooseExistingAccount;
    public Result result;
    public boolean showTermsAndService;

    /* compiled from: WazeSource */
    public enum Community {
        GOOGLE("google"),
        EMAIL(NotificationCompat.CATEGORY_EMAIL);

        public final String apiName;

        Community(String str) {
            this.apiName = str;
        }
    }

    /* compiled from: WazeSource */
    public enum Result {
        LOGIN,
        GUEST,
        NEW_USER,
        EDIT_ID,
        AUTOMATION_LOGIN,
        RECOVERY
    }

    public boolean isExistingUser() {
        Result result;
        return this.result == Result.LOGIN || (result = this.result) == Result.RECOVERY || result == Result.EDIT_ID || this.didChooseExistingAccount;
    }
}
