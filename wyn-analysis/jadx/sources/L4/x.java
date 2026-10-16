package L4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* loaded from: classes.dex */
public final class x implements B4.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6937a;

    public /* synthetic */ x(int i5) {
        this.f6937a = i5;
    }

    @Override // B4.i
    public final E4.B a(Object obj, int i5, int i10, B4.g gVar) {
        switch (this.f6937a) {
            case 0:
                return new w((Bitmap) obj);
            case 1:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new N4.a(drawable, 0);
                }
                return null;
            default:
                return new w((File) obj);
        }
    }

    @Override // B4.i
    public final /* bridge */ /* synthetic */ boolean b(Object obj, B4.g gVar) {
        switch (this.f6937a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }
}
