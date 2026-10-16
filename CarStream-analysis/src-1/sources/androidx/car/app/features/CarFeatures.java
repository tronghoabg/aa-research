package androidx.car.app.features;

import android.content.Context;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class CarFeatures {
    public static final String FEATURE_BACKGROUND_AUDIO_WHILE_DRIVING = "com.android.car.background_audio_while_driving";

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CarFeature {
    }

    private CarFeatures() {
    }

    public static boolean isFeatureEnabled(Context context, String str) {
        return context.getPackageManager().hasSystemFeature(str);
    }
}
