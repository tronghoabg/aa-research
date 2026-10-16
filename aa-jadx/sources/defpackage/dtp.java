package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dtp {
    static android.app.Notification.MessagingStyle a(android.app.Person person) {
        return new android.app.Notification.MessagingStyle(person);
    }

    static android.app.Notification.MessagingStyle b(android.app.Notification.MessagingStyle messagingStyle, boolean z) {
        return messagingStyle.setGroupConversation(z);
    }

    static defpackage.dur c(android.os.Bundle bundle, java.lang.String str) {
        android.os.Parcelable parcelable = bundle.getParcelable("android.messagingUser");
        if (defpackage.hh$$ExternalSyntheticApiModelOutline0.m322m((java.lang.Object) parcelable)) {
            return defpackage.dtb.e(defpackage.hh$$ExternalSyntheticApiModelOutline0.m((java.lang.Object) parcelable));
        }
        return null;
    }

    public static final android.graphics.Bitmap d(android.graphics.drawable.Drawable drawable, int i, int i2) {
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            android.graphics.drawable.BitmapDrawable bitmapDrawable = (android.graphics.drawable.BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                throw new java.lang.IllegalArgumentException("bitmap is null");
            }
            if (i == bitmapDrawable.getBitmap().getWidth() && i2 == bitmapDrawable.getBitmap().getHeight()) {
                android.graphics.Bitmap bitmap = bitmapDrawable.getBitmap();
                bitmap.getClass();
                return bitmap;
            }
            android.graphics.Bitmap bitmapCreateScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i, i2, true);
            bitmapCreateScaledBitmap.getClass();
            return bitmapCreateScaledBitmap;
        }
        android.graphics.Rect bounds = drawable.getBounds();
        bounds.getClass();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i2, android.graphics.Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(new android.graphics.Canvas(bitmapCreateBitmap));
        drawable.setBounds(i3, i4, i5, i6);
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ android.graphics.Bitmap e(android.graphics.drawable.Drawable drawable, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = drawable.getIntrinsicWidth();
        }
        if ((i3 & 2) != 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        return d(drawable, i, i2);
    }

    public static java.lang.Object f(defpackage.eji ejiVar, defpackage.ekm ekmVar, int i) {
        return (defpackage.dtp) ejiVar.c.get(new defpackage.ejh(ekmVar, i));
    }

    public static defpackage.ejk g(java.lang.Object obj) {
        return ((defpackage.ejo) obj).extensions;
    }

    public static defpackage.ejk h(java.lang.Object obj) {
        throw null;
    }

    public static final void i(java.lang.Object obj) {
        g(obj).d();
    }
}
