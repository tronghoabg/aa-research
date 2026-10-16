package androidx.media3.common.util;

import com.waze.strings.DisplayStrings;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class StuckPlayerException extends IllegalStateException {
    public static final int STUCK_BUFFERING_NOT_LOADING = 0;
    public static final int STUCK_BUFFERING_NO_PROGRESS = 1;
    public static final int STUCK_PLAYING_NOT_ENDING = 3;
    public static final int STUCK_PLAYING_NO_PROGRESS = 2;
    public static final int STUCK_SUPPRESSED = 4;
    public final int stuckType;
    public final int timeoutMs;

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StuckType {
    }

    public StuckPlayerException(int i2, int i3) {
        super(getMessage(i2, i3));
        this.stuckType = i2;
        this.timeoutMs = i3;
    }

    private static String getMessage(int i2, int i3) {
        if (i2 == 0) {
            return "Player stuck buffering and not loading for " + i3 + " ms";
        }
        if (i2 == 1) {
            return "Player stuck buffering with no progress for " + i3 + " ms";
        }
        if (i2 == 2) {
            return "Player stuck playing with no progress for " + i3 + " ms";
        }
        if (i2 == 3) {
            return "Player stuck playing without ending for " + i3 + " ms";
        }
        if (i2 != 4) {
            throw new IllegalStateException();
        }
        return "Player stuck suppressed for " + i3 + " ms";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            StuckPlayerException stuckPlayerException = (StuckPlayerException) obj;
            if (this.stuckType == stuckPlayerException.stuckType && this.timeoutMs == stuckPlayerException.timeoutMs) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.stuckType + DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL) * 31) + this.timeoutMs;
    }
}
