package X0;

import android.app.Notification;
import android.graphics.drawable.Icon;

/* renamed from: X0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1285m {
    public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setContentDescription(charSequence);
    }

    public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z2) {
        bigPictureStyle.showBigPictureWhenCollapsed(z2);
    }
}
