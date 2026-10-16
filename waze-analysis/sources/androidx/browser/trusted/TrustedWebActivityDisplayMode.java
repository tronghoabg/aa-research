package androidx.browser.trusted;

import android.os.Bundle;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface TrustedWebActivityDisplayMode {
    public static final String KEY_ID = "androidx.browser.trusted.displaymode.KEY_ID";

    /* compiled from: WazeSource */
    /* renamed from: androidx.browser.trusted.TrustedWebActivityDisplayMode$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static TrustedWebActivityDisplayMode fromBundle(Bundle bundle) {
            int i2 = bundle.getInt(TrustedWebActivityDisplayMode.KEY_ID);
            return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? new DefaultMode() : new WindowControlsOverlayMode() : new TabbedMode() : new MinimalUiMode() : new BrowserMode() : ImmersiveMode.fromBundle(bundle);
        }
    }

    /* compiled from: WazeSource */
    public class BrowserMode implements TrustedWebActivityDisplayMode {
        private static final int ID = 2;

        @Override // androidx.browser.trusted.TrustedWebActivityDisplayMode
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(TrustedWebActivityDisplayMode.KEY_ID, 2);
            return bundle;
        }
    }

    /* compiled from: WazeSource */
    public class DefaultMode implements TrustedWebActivityDisplayMode {
        private static final int ID = 0;

        @Override // androidx.browser.trusted.TrustedWebActivityDisplayMode
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(TrustedWebActivityDisplayMode.KEY_ID, 0);
            return bundle;
        }
    }

    /* compiled from: WazeSource */
    public class ImmersiveMode implements TrustedWebActivityDisplayMode {
        private static final int ID = 1;
        public static final String KEY_CUTOUT_MODE = "androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE";
        public static final String KEY_STICKY = "androidx.browser.trusted.displaymode.KEY_STICKY";
        private final boolean mIsSticky;
        private final int mLayoutInDisplayCutoutMode;

        public ImmersiveMode(boolean z, int i2) {
            this.mIsSticky = z;
            this.mLayoutInDisplayCutoutMode = i2;
        }

        static TrustedWebActivityDisplayMode fromBundle(Bundle bundle) {
            return new ImmersiveMode(bundle.getBoolean(KEY_STICKY), bundle.getInt(KEY_CUTOUT_MODE));
        }

        public boolean isSticky() {
            return this.mIsSticky;
        }

        public int layoutInDisplayCutoutMode() {
            return this.mLayoutInDisplayCutoutMode;
        }

        @Override // androidx.browser.trusted.TrustedWebActivityDisplayMode
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(TrustedWebActivityDisplayMode.KEY_ID, 1);
            bundle.putBoolean(KEY_STICKY, this.mIsSticky);
            bundle.putInt(KEY_CUTOUT_MODE, this.mLayoutInDisplayCutoutMode);
            return bundle;
        }
    }

    /* compiled from: WazeSource */
    public class MinimalUiMode implements TrustedWebActivityDisplayMode {
        private static final int ID = 3;

        @Override // androidx.browser.trusted.TrustedWebActivityDisplayMode
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(TrustedWebActivityDisplayMode.KEY_ID, 3);
            return bundle;
        }
    }

    /* compiled from: WazeSource */
    public final class TabbedMode implements TrustedWebActivityDisplayMode {
        private static final int ID = 4;

        @Override // androidx.browser.trusted.TrustedWebActivityDisplayMode
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(TrustedWebActivityDisplayMode.KEY_ID, 4);
            return bundle;
        }
    }

    /* compiled from: WazeSource */
    public final class WindowControlsOverlayMode implements TrustedWebActivityDisplayMode {
        private static final int ID = 5;

        @Override // androidx.browser.trusted.TrustedWebActivityDisplayMode
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(TrustedWebActivityDisplayMode.KEY_ID, 5);
            return bundle;
        }
    }

    Bundle toBundle();
}
