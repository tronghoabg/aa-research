package androidx.car.app;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class AppInfo {
    public static final java.lang.String MIN_API_LEVEL_METADATA_KEY = "androidx.car.app.minCarApiLevel";
    private final int mLatestCarAppApiLevel;
    private final java.lang.String mLibraryVersion;
    private final int mMinCarAppApiLevel;

    private AppInfo() {
        this.mMinCarAppApiLevel = 0;
        this.mLibraryVersion = null;
        this.mLatestCarAppApiLevel = 0;
    }

    public static androidx.car.app.AppInfo create(android.content.Context context) {
        int iRetrieveMinCarAppApiLevel = retrieveMinCarAppApiLevel(context);
        int i = defpackage.ys.a;
        if (iRetrieveMinCarAppApiLevel > 0 && iRetrieveMinCarAppApiLevel <= defpackage.ys.a()) {
            return new androidx.car.app.AppInfo(iRetrieveMinCarAppApiLevel, defpackage.ys.a(), context.getResources().getString(com.google.android.projection.gearhead.R.string.car_app_library_version));
        }
        throw new java.lang.IllegalArgumentException("Min API level (androidx.car.app.minCarApiLevel=" + iRetrieveMinCarAppApiLevel + ") is out of range (1-" + defpackage.ys.a() + ")");
    }

    public static int retrieveMinCarAppApiLevel(android.content.Context context) {
        try {
            android.content.pm.ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            int i = applicationInfo.metaData != null ? applicationInfo.metaData.getInt(MIN_API_LEVEL_METADATA_KEY, 0) : 0;
            if (i != 0) {
                return i;
            }
            throw new java.lang.IllegalArgumentException("Min API level not declared in manifest (androidx.car.app.minCarApiLevel)");
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            throw new java.lang.IllegalArgumentException("Unable to read min API level from manifest");
        }
    }

    public int getLatestCarAppApiLevel() {
        return this.mLatestCarAppApiLevel;
    }

    public java.lang.String getLibraryDisplayVersion() {
        java.lang.String str = this.mLibraryVersion;
        str.getClass();
        return str;
    }

    public int getMinCarAppApiLevel() {
        return this.mMinCarAppApiLevel;
    }

    public java.lang.String toString() {
        return "Library version: [" + getLibraryDisplayVersion() + "] Min Car Api Level: [" + getMinCarAppApiLevel() + "] Latest Car App Api Level: [" + getLatestCarAppApiLevel() + "]";
    }

    public AppInfo(int i, int i2, java.lang.String str) {
        this.mMinCarAppApiLevel = i;
        this.mLibraryVersion = str;
        this.mLatestCarAppApiLevel = i2;
    }
}
