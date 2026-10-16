package androidx.autofill.inline.common;

import android.os.Bundle;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class BundledStyle {
    protected final Bundle mBundle;

    /* compiled from: WazeSource */
    public abstract class Builder<T extends BundledStyle> {
        protected final Bundle mBundle;

        protected Builder(String str) {
            Bundle bundle = new Bundle();
            this.mBundle = bundle;
            bundle.putBoolean(str, true);
        }

        public abstract T build();
    }

    protected BundledStyle(Bundle bundle) {
        this.mBundle = bundle;
    }

    public void assertIsValid() {
        if (!isValid()) {
            throw new IllegalStateException("Invalid style, missing bundle key ".concat(String.valueOf(getStyleKey())));
        }
    }

    public final Bundle getBundle() {
        return this.mBundle;
    }

    protected abstract String getStyleKey();

    public boolean isValid() {
        Bundle bundle = this.mBundle;
        return bundle != null && bundle.getBoolean(getStyleKey(), false);
    }
}
