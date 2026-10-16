package L4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes.dex */
public final class c implements E4.B, E4.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6894a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6895b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6896c;

    public c(F4.a aVar, Bitmap bitmap) {
        gc.b.k(bitmap, "Bitmap must not be null");
        this.f6895b = bitmap;
        gc.b.k(aVar, "BitmapPool must not be null");
        this.f6896c = aVar;
    }

    @Override // E4.B
    public final void a() {
        switch (this.f6894a) {
            case 0:
                ((F4.a) this.f6896c).f((Bitmap) this.f6895b);
                break;
            default:
                ((E4.B) this.f6896c).a();
                break;
        }
    }

    @Override // E4.B
    public final Class b() {
        switch (this.f6894a) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // E4.B
    public final Object get() {
        switch (this.f6894a) {
            case 0:
                return (Bitmap) this.f6895b;
            default:
                return new BitmapDrawable((Resources) this.f6895b, (Bitmap) ((E4.B) this.f6896c).get());
        }
    }

    @Override // E4.B
    public final int getSize() {
        switch (this.f6894a) {
            case 0:
                return Y4.m.c((Bitmap) this.f6895b);
            default:
                return ((E4.B) this.f6896c).getSize();
        }
    }

    @Override // E4.x
    public final void initialize() {
        switch (this.f6894a) {
            case 0:
                ((Bitmap) this.f6895b).prepareToDraw();
                break;
            default:
                E4.B b5 = (E4.B) this.f6896c;
                if (b5 instanceof E4.x) {
                    ((E4.x) b5).initialize();
                    break;
                }
                break;
        }
    }

    public c(Resources resources, E4.B b5) {
        gc.b.k(resources, "Argument must not be null");
        this.f6895b = resources;
        gc.b.k(b5, "Argument must not be null");
        this.f6896c = b5;
    }
}
