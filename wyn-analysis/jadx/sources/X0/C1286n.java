package X0;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1286n extends E {

    /* renamed from: e, reason: collision with root package name */
    public IconCompat f15859e;

    /* renamed from: f, reason: collision with root package name */
    public IconCompat f15860f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15861g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15862h;

    public static IconCompat j(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof Icon) {
            return IconCompat.d((Icon) parcelable);
        }
        if (parcelable instanceof Bitmap) {
            return IconCompat.f((Bitmap) parcelable);
        }
        return null;
    }

    @Override // X0.E
    public final void b(N2.j jVar) {
        Bitmap bitmapE;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) jVar.f8381d).setBigContentTitle((CharSequence) this.f15789c);
        IconCompat iconCompat = this.f15859e;
        Context context = (Context) jVar.f8380c;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                AbstractC1285m.a(bigContentTitle, iconCompat.j(context));
            } else {
                int iW = iconCompat.f18067a;
                if (iW == -1) {
                    iW = Fe.c.w(iconCompat.f18068b);
                }
                if (iW == 1) {
                    IconCompat iconCompat2 = this.f15859e;
                    int i5 = iconCompat2.f18067a;
                    if (i5 == -1) {
                        Object obj = iconCompat2.f18068b;
                        bitmapE = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i5 == 1) {
                        bitmapE = (Bitmap) iconCompat2.f18068b;
                    } else {
                        if (i5 != 5) {
                            throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                        }
                        bitmapE = IconCompat.e((Bitmap) iconCompat2.f18068b, true);
                    }
                    bigContentTitle = bigContentTitle.bigPicture(bitmapE);
                }
            }
        }
        if (this.f15861g) {
            IconCompat iconCompat3 = this.f15860f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                AbstractC1284l.a(bigContentTitle, iconCompat3.j(context));
            }
        }
        if (this.f15787a) {
            bigContentTitle.setSummaryText((CharSequence) this.f15790d);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            AbstractC1285m.c(bigContentTitle, this.f15862h);
            AbstractC1285m.b(bigContentTitle, null);
        }
    }

    @Override // X0.E
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // X0.E
    public final void i(Bundle bundle) {
        super.i(bundle);
        if (bundle.containsKey("android.largeIcon.big")) {
            this.f15860f = j(bundle.getParcelable("android.largeIcon.big"));
            this.f15861g = true;
        }
        Parcelable parcelable = bundle.getParcelable("android.picture");
        this.f15859e = parcelable != null ? j(parcelable) : j(bundle.getParcelable("android.pictureIcon"));
        this.f15862h = bundle.getBoolean("android.showBigPictureWhenCollapsed");
    }

    public final void k(Bitmap bitmap) {
        this.f15860f = bitmap == null ? null : IconCompat.f(bitmap);
        this.f15861g = true;
    }
}
