package androidx.car.app;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.versioning.CarAppApiLevels;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public final class AppInfo {
    public static final String MIN_API_LEVEL_METADATA_KEY = "androidx.car.app.minCarApiLevel";
    private final int mLatestCarAppApiLevel;
    private final String mLibraryVersion;
    private final int mMinCarAppApiLevel;

    private AppInfo() {
        this.mMinCarAppApiLevel = 0;
        this.mLibraryVersion = null;
        this.mLatestCarAppApiLevel = 0;
    }

    public static AppInfo create(Context context) throws PackageManager.NameNotFoundException {
        int iRetrieveMinCarAppApiLevel = retrieveMinCarAppApiLevel(context);
        int i2 = CarAppApiLevels.LEVEL_9;
        if (iRetrieveMinCarAppApiLevel > 0 && iRetrieveMinCarAppApiLevel <= CarAppApiLevels.getLatest()) {
            return new AppInfo(iRetrieveMinCarAppApiLevel, CarAppApiLevels.getLatest(), context.getResources().getString(com.waze.R.string.car_app_library_version));
        }
        throw new IllegalArgumentException("Min API level (androidx.car.app.minCarApiLevel=" + iRetrieveMinCarAppApiLevel + ") is out of range (1-" + CarAppApiLevels.getLatest() + ")");
    }

    public static int retrieveMinCarAppApiLevel(Context context) throws PackageManager.NameNotFoundException {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            int i2 = applicationInfo.metaData != null ? applicationInfo.metaData.getInt(MIN_API_LEVEL_METADATA_KEY, 0) : 0;
            if (i2 != 0) {
                return i2;
            }
            throw new IllegalArgumentException("Min API level not declared in manifest (androidx.car.app.minCarApiLevel)");
        } catch (PackageManager.NameNotFoundException unused) {
            throw new IllegalArgumentException("Unable to read min API level from manifest");
        }
    }

    public int getLatestCarAppApiLevel() {
        return this.mLatestCarAppApiLevel;
    }

    public String getLibraryDisplayVersion() {
        return (String) Objects.requireNonNull(this.mLibraryVersion);
    }

    public int getMinCarAppApiLevel() {
        return this.mMinCarAppApiLevel;
    }

    public String toString() {
        return "Library version: [" + getLibraryDisplayVersion() + "] Min Car Api Level: [" + getMinCarAppApiLevel() + "] Latest Car App Api Level: [" + getLatestCarAppApiLevel() + "]";
    }

    public AppInfo(int i2, int i3, String str) {
        this.mMinCarAppApiLevel = i2;
        this.mLibraryVersion = str;
        this.mLatestCarAppApiLevel = i3;
    }
}
