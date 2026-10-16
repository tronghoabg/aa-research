package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import android.support.v4.a.a.b;
import android.support.v4.a.a.d;
import androidx.camera.core.internal.compat.quirk.BackportedFixQuirk;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PixelJpegRSupportedQuirk extends BackportedFixQuirk {
    public static final Companion Companion = new Companion(null);

    public static final boolean isEnabled() {
        return Companion.isEnabled();
    }

    @Override // androidx.camera.core.internal.compat.quirk.BackportedFixQuirk
    public b getKnownIssue() {
        return d.f81a;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean isEnabled() {
            return Build.VERSION.SDK_INT >= 34 && new PixelJpegRSupportedQuirk().hasIssue();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
