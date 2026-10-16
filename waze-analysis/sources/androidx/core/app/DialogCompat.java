package androidx.core.app;

import android.app.Dialog;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class DialogCompat {

    /* compiled from: WazeSource */
    class Api28Impl {
        private Api28Impl() {
        }

        static <T> T requireViewById(Dialog dialog, int i2) {
            return (T) dialog.requireViewById(i2);
        }
    }

    private DialogCompat() {
    }

    public static View requireViewById(Dialog dialog, int i2) {
        return (View) Api28Impl.requireViewById(dialog, i2);
    }
}
