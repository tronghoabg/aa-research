package N4;

import A4.d;
import E4.B;
import E4.x;
import F4.f;
import P4.c;
import P4.e;
import P4.h;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class a implements B, x {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f8395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8396b;

    public a(Drawable drawable, int i5) {
        this.f8396b = i5;
        gc.b.k(drawable, "Argument must not be null");
        this.f8395a = drawable;
    }

    @Override // E4.B
    public final void a() {
        switch (this.f8396b) {
            case 0:
                break;
            default:
                c cVar = (c) this.f8395a;
                cVar.stop();
                cVar.f9111d = true;
                h hVar = (h) cVar.f9108a.f9107b;
                hVar.f9127c.clear();
                Bitmap bitmap = hVar.f9135l;
                if (bitmap != null) {
                    hVar.f9129e.f(bitmap);
                    hVar.f9135l = null;
                }
                hVar.f9130f = false;
                e eVar = hVar.f9133i;
                com.bumptech.glide.h hVar2 = hVar.f9128d;
                if (eVar != null) {
                    hVar2.c(eVar);
                    hVar.f9133i = null;
                }
                e eVar2 = hVar.k;
                if (eVar2 != null) {
                    hVar2.c(eVar2);
                    hVar.k = null;
                }
                e eVar3 = hVar.f9136m;
                if (eVar3 != null) {
                    hVar2.c(eVar3);
                    hVar.f9136m = null;
                }
                d dVar = hVar.f9125a;
                dVar.f335l = null;
                byte[] bArr = dVar.f333i;
                S3.c cVar2 = dVar.f327c;
                if (bArr != null) {
                    ((f) cVar2.f10937c).i(bArr);
                }
                int[] iArr = dVar.f334j;
                if (iArr != null) {
                    ((f) cVar2.f10937c).i(iArr);
                }
                Bitmap bitmap2 = dVar.f336m;
                if (bitmap2 != null) {
                    ((F4.a) cVar2.f10936b).f(bitmap2);
                }
                dVar.f336m = null;
                dVar.f328d = null;
                dVar.f342s = null;
                byte[] bArr2 = dVar.f329e;
                if (bArr2 != null) {
                    ((f) cVar2.f10937c).i(bArr2);
                }
                hVar.f9134j = true;
                break;
        }
    }

    @Override // E4.B
    public final Class b() {
        switch (this.f8396b) {
            case 0:
                return this.f8395a.getClass();
            default:
                return c.class;
        }
    }

    @Override // E4.B
    public final Object get() {
        Drawable drawable = this.f8395a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // E4.B
    public final int getSize() {
        switch (this.f8396b) {
            case 0:
                Drawable drawable = this.f8395a;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                h hVar = (h) ((c) this.f8395a).f9108a.f9107b;
                d dVar = hVar.f9125a;
                return (dVar.f334j.length * 4) + dVar.f328d.limit() + dVar.f333i.length + hVar.f9137n;
        }
    }

    @Override // E4.x
    public void initialize() {
        switch (this.f8396b) {
            case 1:
                ((h) ((c) this.f8395a).f9108a.f9107b).f9135l.prepareToDraw();
                break;
            default:
                Drawable drawable = this.f8395a;
                if (!(drawable instanceof BitmapDrawable)) {
                    if (drawable instanceof c) {
                        ((h) ((c) drawable).f9108a.f9107b).f9135l.prepareToDraw();
                        break;
                    }
                } else {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                    break;
                }
                break;
        }
    }

    private final void c() {
    }
}
