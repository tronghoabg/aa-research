package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes2.dex */
public final class pku {
    public Object a;
    public final Object b;
    public final Object c;
    private final Object d;

    public pku(erb erbVar, qbu qbuVar, qbu qbuVar2) {
        this.a = false;
        this.c = erbVar;
        this.b = qbuVar;
        this.d = qbuVar2;
    }

    public final synchronized void a() {
        if (!((Boolean) this.a).booleanValue()) {
            this.a = true;
        }
        Object obj = this.c;
        Object obj2 = this.b;
        ((erb) obj).V((qbu) obj2);
        ((erb) obj).V((qbu) obj2);
    }

    public final synchronized void b() {
        if (((Boolean) this.a).booleanValue()) {
            Object obj = this.c;
            Object obj2 = this.d;
            ((erb) obj).V((qbu) obj2);
            ((erb) obj).V((qbu) obj2);
        }
    }

    public final int c(qsw qswVar, Rect rect, int i, int i2) {
        int iCenterX = rect.centerX();
        Size size = (Size) this.c;
        int width = iCenterX - (size.getWidth() / 2);
        int i3 = i / 2;
        if (iCenterX + i3 >= size.getWidth()) {
            qswVar.c = dlz.j((size.getWidth() - iCenterX) - i2, 0, i);
            return 5;
        }
        if (iCenterX <= i3) {
            qswVar.a = dlz.j(iCenterX - i2, 0, i);
            return 3;
        }
        if (width > 0) {
            qswVar.a = width;
            return 1;
        }
        qswVar.c = -width;
        return 1;
    }

    public final int d(qsw qswVar, Rect rect, int i, int i2) {
        int iCenterY = rect.centerY();
        Size size = (Size) this.c;
        int height = iCenterY - (size.getHeight() / 2);
        int i3 = i / 2;
        if (iCenterY + i3 >= size.getHeight()) {
            qswVar.d = dlz.j((size.getHeight() - iCenterY) - i2, 0, i);
            return 80;
        }
        if (iCenterY <= i3) {
            qswVar.b = dlz.j(iCenterY - i2, 0, i);
            return 48;
        }
        if (height > 0) {
            qswVar.b = height;
            return 16;
        }
        qswVar.d = -height;
        return 16;
    }

    public final ocs e() {
        if (this.a == null) {
            Object obj = this.b;
            Object obj2 = this.c;
            Rect rect = (Rect) obj;
            int i = rect.top;
            Size size = (Size) obj2;
            int height = size.getHeight() - rect.bottom;
            int i2 = rect.left;
            int width = size.getWidth() - rect.right;
            Rect rect2 = (Rect) this.d;
            int i3 = rect.top - rect2.top;
            int i4 = rect2.bottom - rect.bottom;
            int i5 = rect.left - rect2.left;
            int i6 = rect2.right - rect.right;
            if (i >= height) {
                if (i2 >= width) {
                    if (i3 >= i5) {
                        this.a = ocs.TO_LEFT;
                    } else {
                        this.a = ocs.ABOVE;
                    }
                } else if (i3 >= i6) {
                    this.a = ocs.TO_RIGHT;
                } else {
                    this.a = ocs.ABOVE;
                }
            } else if (i2 >= width) {
                if (i4 >= i5) {
                    this.a = ocs.TO_LEFT;
                } else {
                    this.a = ocs.BELOW;
                }
            } else if (i4 >= i6) {
                this.a = ocs.TO_RIGHT;
            } else {
                this.a = ocs.BELOW;
            }
        }
        return (ocs) this.a;
    }

    public pku(Size size, Rect rect, Rect rect2) {
        this.c = size;
        this.b = rect;
        this.d = rect2;
    }
}
