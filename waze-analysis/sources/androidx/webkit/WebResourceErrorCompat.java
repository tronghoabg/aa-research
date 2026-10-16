package androidx.webkit;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class WebResourceErrorCompat {

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface NetErrorCode {
    }

    public abstract int getDebugCode();

    public abstract CharSequence getDescription();

    public abstract int getErrorCode();
}
