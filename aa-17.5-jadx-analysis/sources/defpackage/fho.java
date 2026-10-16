package defpackage;

import android.graphics.Paint;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
final class fho extends fhq {
    public int[] a;
    duw b;
    float c;
    duw d;
    float e;
    float f;
    float g;
    float h;
    float i;
    Paint.Cap j;
    Paint.Join k;
    float l;

    public fho(fho fhoVar) {
        super(fhoVar);
        this.c = BitmapDescriptorFactory.HUE_RED;
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = BitmapDescriptorFactory.HUE_RED;
        this.h = 1.0f;
        this.i = BitmapDescriptorFactory.HUE_RED;
        this.j = Paint.Cap.BUTT;
        this.k = Paint.Join.MITER;
        this.l = 4.0f;
        int[] iArr = fhoVar.a;
        this.a = null;
        this.b = fhoVar.b;
        this.c = fhoVar.c;
        this.e = fhoVar.e;
        this.d = fhoVar.d;
        this.o = fhoVar.o;
        this.f = fhoVar.f;
        this.g = fhoVar.g;
        this.h = fhoVar.h;
        this.i = fhoVar.i;
        this.j = fhoVar.j;
        this.k = fhoVar.k;
        this.l = fhoVar.l;
    }

    @Override // defpackage.fhv
    public final boolean b() {
        return this.d.b() || this.b.b();
    }

    @Override // defpackage.fhv
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

    public fho() {
        this.c = BitmapDescriptorFactory.HUE_RED;
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = BitmapDescriptorFactory.HUE_RED;
        this.h = 1.0f;
        this.i = BitmapDescriptorFactory.HUE_RED;
        this.j = Paint.Cap.BUTT;
        this.k = Paint.Join.MITER;
        this.l = 4.0f;
    }
}
