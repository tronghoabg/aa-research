package com.waze.authentication;

import androidx.autofill.HintConstants;
import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class e {
    public static final int $stable = 0;

    static final void storeLoginTokenJNI$lambda$0(e eVar, String str) {
        h.g.b.x.d(eVar, "null cannot be cast to non-null type com.waze.authentication.AuthNativeManager");
        ((AuthNativeManager) eVar).storeLoginToken$third_party_waze_client_android_project_waze_src_main_waze(str);
    }

    static final void storePasswordJNI$lambda$0(e eVar, String str, String str2) {
        h.g.b.x.d(eVar, "null cannot be cast to non-null type com.waze.authentication.AuthNativeManager");
        ((AuthNativeManager) eVar).storePassword$third_party_waze_client_android_project_waze_src_main_waze(str, str2);
    }

    protected final String decryptPasswordJNI(String str) {
        return ((AuthNativeManager) this).decryptPassword$third_party_waze_client_android_project_waze_src_main_waze(str);
    }

    protected final String encryptPasswordJNI(String str) {
        return ((AuthNativeManager) this).encryptPassword$third_party_waze_client_android_project_waze_src_main_waze(str);
    }

    protected final String getLoginTokenJNI() {
        return ((AuthNativeManager) this).getLoginToken$third_party_waze_client_android_project_waze_src_main_waze();
    }

    protected final String getPasswordJNI() {
        return ((AuthNativeManager) this).getPassword$third_party_waze_client_android_project_waze_src_main_waze();
    }

    protected final String getUsernameJNI() {
        return ((AuthNativeManager) this).getUsername$third_party_waze_client_android_project_waze_src_main_waze();
    }

    public String loadPasswordLegacy() {
        return ((AuthNativeManager) this).loadPasswordLegacyNTV();
    }

    public String loadUsernameLegacy() {
        return ((AuthNativeManager) this).loadUsernameLegacyNTV();
    }

    protected final void resetJNI() {
        ((AuthNativeManager) this).reset$third_party_waze_client_android_project_waze_src_main_waze();
    }

    public void saveUsernamePasswordLegacy(String str, String str2) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_USERNAME);
        h.g.b.x.f(str2, HintConstants.AUTOFILL_HINT_PASSWORD);
        ((AuthNativeManager) this).saveUsernamePasswordLegacyNTV(str, str2);
    }

    public void selectCredentialsStorageMode(boolean z) {
        ((AuthNativeManager) this).selectCredentialsStorageModeNTV(z);
    }

    protected final void storeLoginTokenJNI(final String str) {
        h.g.b.x.f(str, "token");
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.authentication.c
            @Override // java.lang.Runnable
            public final void run() {
                e.storeLoginTokenJNI$lambda$0(this.f15755a, str);
            }
        });
    }

    protected final void storePasswordJNI(final String str, final String str2) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_USERNAME);
        h.g.b.x.f(str2, HintConstants.AUTOFILL_HINT_PASSWORD);
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.authentication.d
            @Override // java.lang.Runnable
            public final void run() {
                e.storePasswordJNI$lambda$0(this.f15757a, str, str2);
            }
        });
    }
}
