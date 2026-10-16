package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes2.dex */
public final class dsv extends duc {
    private IconCompat a;
    private IconCompat b;
    private boolean c;
    private boolean d;

    private static IconCompat f(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof Icon) {
            return dtj.d((Icon) parcelable);
        }
        if (parcelable instanceof Bitmap) {
            return IconCompat.k((Bitmap) parcelable);
        }
        return null;
    }

    @Override // defpackage.duc
    protected final String a() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // defpackage.duc
    protected final void b(Bundle bundle) {
        super.b(bundle);
        if (bundle.containsKey("android.largeIcon.big")) {
            this.b = f(bundle.getParcelable("android.largeIcon.big"));
            this.c = true;
        }
        Parcelable parcelable = bundle.getParcelable("android.picture");
        this.a = parcelable != null ? f(parcelable) : f(bundle.getParcelable("android.pictureIcon"));
        this.d = bundle.getBoolean("android.showBigPictureWhenCollapsed");
    }

    @Override // defpackage.duc
    public final void c(mko mkoVar) {
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) mkoVar.d).setBigContentTitle(this.h);
        if (this.a != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                dsu.a(bigContentTitle, dtj.b(this.a, (Context) mkoVar.a));
            } else if (this.a.b() == 1) {
                bigContentTitle = bigContentTitle.bigPicture(this.a.d());
            }
        }
        if (this.c) {
            IconCompat iconCompat = this.b;
            if (iconCompat == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(dtj.b(iconCompat, (Context) mkoVar.a));
            }
        }
        if (this.j) {
            bigContentTitle.setSummaryText(this.i);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            dsu.c(bigContentTitle, this.d);
            dsu.b(bigContentTitle, null);
        }
    }
}
