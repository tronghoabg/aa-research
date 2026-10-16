package androidx.media3.common.util;

import com.google.d.b.an;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class LibraryLoader {
    private static final String TAG = "LibraryLoader";
    private boolean isAvailable;
    private boolean loadAttempted;
    private String[] nativeLibraries;

    public LibraryLoader(String... strArr) {
        this.nativeLibraries = strArr;
    }

    public synchronized boolean isAvailable() {
        if (!this.loadAttempted) {
            this.loadAttempted = true;
            try {
                for (String str : this.nativeLibraries) {
                    loadLibrary(str);
                }
                this.isAvailable = true;
            } catch (UnsatisfiedLinkError e2) {
                Log.w(TAG, "Failed to load ".concat(String.valueOf(Arrays.toString(this.nativeLibraries))), e2);
            }
        }
        return this.isAvailable;
    }

    protected abstract void loadLibrary(String str);

    public synchronized void setLibraries(String... strArr) {
        an.v(!this.loadAttempted, "Cannot set libraries after loading");
        this.nativeLibraries = strArr;
    }
}
