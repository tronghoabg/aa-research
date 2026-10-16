package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.core.impl.Quirk;
import h.g.b.x;
import h.n.o;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FinalizeSessionOnCloseQuirk implements Quirk {
    public static final Companion Companion = new Companion(null);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getBehavior-Bm6Tfm4, reason: not valid java name */
        public final int m222getBehaviorBm6Tfm4() {
            String str = Build.MODEL;
            x.e(str, "MODEL");
            Locale locale = Locale.getDefault();
            x.e(locale, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale);
            x.e(lowerCase, "toLowerCase(...)");
            return o.ah(lowerCase, "cph") ? CameraGraph.Flags.FinalizeSessionOnCloseBehavior.Companion.m523getIMMEDIATEBm6Tfm4() : CameraGraph.Flags.FinalizeSessionOnCloseBehavior.Companion.m524getOFFBm6Tfm4();
        }

        public final boolean isEnabled() {
            return true;
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
