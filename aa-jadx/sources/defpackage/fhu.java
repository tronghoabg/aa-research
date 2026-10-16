package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fhu extends defpackage.fhw {
    public int[] a;
    defpackage.dvd b;
    float c;
    defpackage.dvd d;
    float e;
    float f;
    float g;
    float h;
    float i;
    android.graphics.Paint.Cap j;
    android.graphics.Paint.Join k;
    float l;

    public fhu(defpackage.fhu fhuVar) {
        super(fhuVar);
        this.c = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.h = 1.0f;
        this.i = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.j = android.graphics.Paint.Cap.BUTT;
        this.k = android.graphics.Paint.Join.MITER;
        this.l = 4.0f;
        int[] iArr = fhuVar.a;
        this.a = null;
        this.b = fhuVar.b;
        this.c = fhuVar.c;
        this.e = fhuVar.e;
        this.d = fhuVar.d;
        this.o = fhuVar.o;
        this.f = fhuVar.f;
        this.g = fhuVar.g;
        this.h = fhuVar.h;
        this.i = fhuVar.i;
        this.j = fhuVar.j;
        this.k = fhuVar.k;
        this.l = fhuVar.l;
    }

    @Override // defpackage.fib
    public final boolean b() {
        return this.d.b() || this.b.b();
    }

    @Override // defpackage.fib
    public final boolean c(int[] iArr) {
        return this.b.c(iArr) | this.d.c(iArr);
    }

    float getFillAlpha() {
        return this.f;
    }

    int getFillColor() {
        return this.d.a;
    }

    float getStrokeAlpha() {
        return this.e;
    }

    int getStrokeColor() {
        return this.b.a;
    }

    float getStrokeWidth() {
        return this.c;
    }

    float getTrimPathEnd() {
        return this.h;
    }

    float getTrimPathOffset() {
        return this.i;
    }

    float getTrimPathStart() {
        return this.g;
    }

    void setFillAlpha(float f) {
        this.f = f;
    }

    void setFillColor(int i) {
        this.d.a = i;
    }

    void setStrokeAlpha(float f) {
        this.e = f;
    }

    void setStrokeColor(int i) {
        this.b.a = i;
    }

    void setStrokeWidth(float f) {
        this.c = f;
    }

    void setTrimPathEnd(float f) {
        this.h = f;
    }

    void setTrimPathOffset(float f) {
        this.i = f;
    }

    void setTrimPathStart(float f) {
        this.g = f;
    }

    public fhu() {
        this.c = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.h = 1.0f;
        this.i = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.j = android.graphics.Paint.Cap.BUTT;
        this.k = android.graphics.Paint.Join.MITER;
        this.l = 4.0f;
    }
}
