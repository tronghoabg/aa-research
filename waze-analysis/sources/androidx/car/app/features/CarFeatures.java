package androidx.car.app.features;

import android.content.Context;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CarFeatures {
    public static final String FEATURE_BACKGROUND_AUDIO_WHILE_DRIVING = "com.android.car.background_audio_while_driving";
    public static final String FEATURE_CAR_APP_LIBRARY_MEDIA = "android.software.car.templates_host.media";

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CarFeature {
    }

    private CarFeatures() {
    }

    public static boolean isFeatureEnabled(Context context, String str) {
        return context.getPackageManager().hasSystemFeature(str);
    }
}
