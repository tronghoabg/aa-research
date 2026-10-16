package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes2.dex */
public final class ibn implements hwx, hwu {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public ibn(Bitmap bitmap, hxe hxeVar, int i) {
        this.a = i;
        a.al(bitmap, "Bitmap must not be null");
        this.b = bitmap;
        a.al(hxeVar, "BitmapPool must not be null");
        this.c = hxeVar;
    }

    public static hwx f(Resources resources, hwx hwxVar) {
        if (hwxVar == null) {
            return null;
        }
        return new ibn(resources, hwxVar, 0);
    }

    public static ibn g(Bitmap bitmap, hxe hxeVar) {
        if (bitmap == null) {
            return null;
        }
        return new ibn(bitmap, hxeVar, 1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [hwx, java.lang.Object] */
    @Override // defpackage.hwx
    public final int a() {
        return this.a != 0 ? ify.a((Bitmap) this.b) : this.c.a();
    }

    @Override // defpackage.hwx
    public final Class b() {
        return this.a != 0 ? Bitmap.class : BitmapDrawable.class;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hwx, java.lang.Object] */
    @Override // defpackage.hwx
    public final /* synthetic */ Object c() {
        if (this.a != 0) {
            return this.b;
        }
        return new BitmapDrawable((Resources) this.b, (Bitmap) this.c.c());
    }

    @Override // defpackage.hwu
    public final void d() {
        if (this.a != 0) {
            ((Bitmap) this.b).prepareToDraw();
            return;
        }
        Object obj = this.c;
        if (obj instanceof hwu) {
            ((hwu) obj).d();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [hwx, hxe, java.lang.Object] */
    @Override // defpackage.hwx
    public final void e() {
        int i = this.a;
        ?? r1 = this.c;
        if (i != 0) {
            r1.d((Bitmap) this.b);
        } else {
            r1.e();
        }
    }

    private ibn(Resources resources, hwx hwxVar, int i) {
        this.a = i;
        a.al(resources, "Argument must not be null");
        this.b = resources;
        this.c = hwxVar;
    }
}
