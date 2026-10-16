package androidx.car.app;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public class SessionInfo {
    private static final defpackage.yhx<java.lang.Class<? extends defpackage.wi>> CLUSTER_SUPPORTED_TEMPLATES_API_6 = new defpackage.ynu(androidx.car.app.navigation.model.NavigationTemplate.class);
    private static final defpackage.yhx<java.lang.Class<? extends defpackage.wi>> CLUSTER_SUPPORTED_TEMPLATES_LESS_THAN_API_6 = defpackage.ynd.a;
    public static final androidx.car.app.SessionInfo DEFAULT_SESSION_INFO = new androidx.car.app.SessionInfo(0, "main");
    public static final int DISPLAY_TYPE_CLUSTER = 1;
    public static final int DISPLAY_TYPE_MAIN = 0;
    private static final char DIVIDER = '/';
    private final int mDisplayType;
    private final java.lang.String mSessionId;

    private SessionInfo() {
        this.mSessionId = "main";
        this.mDisplayType = 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof androidx.car.app.SessionInfo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        androidx.car.app.SessionInfo sessionInfo = (androidx.car.app.SessionInfo) obj;
        return getSessionId().equals(sessionInfo.getSessionId()) && getDisplayType() == sessionInfo.getDisplayType();
    }

    public int getDisplayType() {
        return this.mDisplayType;
    }

    public java.lang.String getSessionId() {
        return this.mSessionId;
    }

    public java.util.Set<java.lang.Class<? extends defpackage.wi>> getSupportedTemplates(int i) {
        if (this.mDisplayType == 1) {
            return i >= 6 ? CLUSTER_SUPPORTED_TEMPLATES_API_6 : CLUSTER_SUPPORTED_TEMPLATES_LESS_THAN_API_6;
        }
        return null;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mSessionId, java.lang.Integer.valueOf(this.mDisplayType));
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(this.mDisplayType) + DIVIDER + this.mSessionId;
    }

    public SessionInfo(int i, java.lang.String str) {
        this.mDisplayType = i;
        this.mSessionId = str;
    }
}
