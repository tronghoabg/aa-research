package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class wuu {

    @Deprecated
    public float a;

    @Deprecated
    public float b;

    @Deprecated
    public float c;

    @Deprecated
    public float d;

    @Deprecated
    public float e;
    public boolean g;
    public final List f = new ArrayList();
    private final List h = new ArrayList();

    public wuu() {
        e(BitmapDescriptorFactory.HUE_RED, 270.0f, BitmapDescriptorFactory.HUE_RED);
    }

    private final void f(float f) {
        float f2 = this.d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 <= 180.0f) {
            float f4 = this.b;
            float f5 = this.c;
            wuq wuqVar = new wuq(f4, f5, f4, f5);
            wuqVar.e = this.d;
            wuqVar.f = f3;
            this.h.add(new wuo(wuqVar));
            this.d = f;
        }
    }

    final wut a(Matrix matrix) {
        f(this.e);
        return new wun(new ArrayList(this.h), new Matrix(matrix));
    }

    public final void b(wut wutVar, float f, float f2) {
        f(f);
        this.h.add(wutVar);
        this.d = f2;
    }

    public final void c(Matrix matrix, Path path) {
        List list = this.f;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((wus) list.get(i)).a(matrix, path);
        }
    }

    public final void d(float f, float f2) {
        wur wurVar = new wur();
        wurVar.a = f;
        wurVar.b = f2;
        this.f.add(wurVar);
        wup wupVar = new wup(wurVar, this.b, this.c);
        b(wupVar, wupVar.b() + 270.0f, wupVar.b() + 270.0f);
        this.b = f;
        this.c = f2;
    }

    public final void e(float f, float f2, float f3) {
        this.a = f;
        this.b = BitmapDescriptorFactory.HUE_RED;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.h.clear();
        this.g = false;
    }
}
