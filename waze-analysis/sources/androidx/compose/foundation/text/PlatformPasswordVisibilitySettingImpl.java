package androidx.compose.foundation.text;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import androidx.core.os.HandlerCompat;
import h.ab;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
class PlatformPasswordVisibilitySettingImpl implements PasswordVisibilitySetting {
    private final Context context;

    public PlatformPasswordVisibilitySettingImpl(Context context) {
        this.context = context;
    }

    private final boolean getSystemShowPasswordSetting() {
        try {
            return Settings.System.getInt(this.context.getContentResolver(), "show_password") > 0;
        } catch (Exception e2) {
            Log.w("BasicSecureTextField", "Failed to fetch show password setting, using value: true", e2);
            return true;
        }
    }

    protected final Context getContext() {
        return this.context;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.foundation.text.PlatformPasswordVisibilitySettingImpl$registerObserver$observer$1] */
    @Override // androidx.compose.foundation.text.PasswordVisibilitySetting
    public Runnable registerObserver(final a<ab> aVar) {
        Uri uriFor = Settings.System.getUriFor("show_password");
        final Handler handlerCreateAsync = HandlerCompat.createAsync(Looper.getMainLooper());
        final ?? r2 = new ContentObserver(handlerCreateAsync) { // from class: androidx.compose.foundation.text.PlatformPasswordVisibilitySettingImpl$registerObserver$observer$1
            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                aVar.invoke();
            }
        };
        this.context.getContentResolver().registerContentObserver(uriFor, false, (ContentObserver) r2);
        return new Runnable() { // from class: androidx.compose.foundation.text.PlatformPasswordVisibilitySettingImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.context.getContentResolver().unregisterContentObserver(r2);
            }
        };
    }

    @Override // androidx.compose.foundation.text.PasswordVisibilitySetting
    public boolean shouldShowPhysicalInput() {
        return getSystemShowPasswordSetting();
    }

    @Override // androidx.compose.foundation.text.PasswordVisibilitySetting
    public boolean shouldShowTouchInput() {
        return getSystemShowPasswordSetting();
    }
}
