package defpackage;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.view.DisplayCutout;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class i1 {
    public static /* synthetic */ MediaSession h(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str, bundle);
    }

    public static /* synthetic */ DisplayCutout j(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
        return new DisplayCutout(insets, rect, rect2, rect3, rect4);
    }
}
