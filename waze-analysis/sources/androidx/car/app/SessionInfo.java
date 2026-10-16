package androidx.car.app;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.Template;
import androidx.car.app.navigation.model.NavigationTemplate;
import com.google.d.d.ci;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(6)
/* loaded from: classes2.dex */
public class SessionInfo {
    private static final ci<Class<? extends Template>> CLUSTER_SUPPORTED_TEMPLATES_API_6 = ci.p(NavigationTemplate.class);
    private static final ci<Class<? extends Template>> CLUSTER_SUPPORTED_TEMPLATES_LESS_THAN_API_6 = ci.o();
    public static final SessionInfo DEFAULT_SESSION_INFO = new SessionInfo(0, "main");
    public static final int DISPLAY_TYPE_CLUSTER = 1;
    public static final int DISPLAY_TYPE_MAIN = 0;
    private static final char DIVIDER = '/';
    private final int mDisplayType;
    private final String mSessionId;

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface DisplayType {
    }

    private SessionInfo() {
        this.mSessionId = "main";
        this.mDisplayType = 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SessionInfo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        SessionInfo sessionInfo = (SessionInfo) obj;
        return getSessionId().equals(sessionInfo.getSessionId()) && getDisplayType() == sessionInfo.getDisplayType();
    }

    public int getDisplayType() {
        return this.mDisplayType;
    }

    public String getSessionId() {
        return this.mSessionId;
    }

    public Set<Class<? extends Template>> getSupportedTemplates(int i2) {
        if (this.mDisplayType == 1) {
            return i2 >= 6 ? CLUSTER_SUPPORTED_TEMPLATES_API_6 : CLUSTER_SUPPORTED_TEMPLATES_LESS_THAN_API_6;
        }
        return null;
    }

    public int hashCode() {
        return Objects.hash(this.mSessionId, Integer.valueOf(this.mDisplayType));
    }

    public String toString() {
        return String.valueOf(this.mDisplayType) + DIVIDER + this.mSessionId;
    }

    public SessionInfo(int i2, String str) {
        this.mDisplayType = i2;
        this.mSessionId = str;
    }
}
