package defpackage;

import android.graphics.Matrix;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class fhp extends fhv {
    final Matrix a;
    final ArrayList b;
    float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    final Matrix j;
    int k;
    public int[] l;
    public String m;

    public fhp(fhp fhpVar, yw ywVar) {
        fhq fhnVar;
        super(null);
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = BitmapDescriptorFactory.HUE_RED;
        this.d = BitmapDescriptorFactory.HUE_RED;
        this.e = BitmapDescriptorFactory.HUE_RED;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = BitmapDescriptorFactory.HUE_RED;
        this.i = BitmapDescriptorFactory.HUE_RED;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.m = null;
        this.c = fhpVar.c;
        this.d = fhpVar.d;
        this.e = fhpVar.e;
        this.f = fhpVar.f;
        this.g = fhpVar.g;
        this.h = fhpVar.h;
        this.i = fhpVar.i;
        int[] iArr = fhpVar.l;
        this.l = null;
        String str = fhpVar.m;
        this.m = str;
        int i = fhpVar.k;
        this.k = 0;
        if (str != null) {
            ywVar.put(str, this);
        }
        matrix.set(fhpVar.j);
        ArrayList arrayList = fhpVar.b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof fhp) {
                this.b.add(new fhp((fhp) obj, ywVar));
            } else {
                if (obj instanceof fho) {
                    fhnVar = new fho((fho) obj);
                } else {
                    if (!(obj instanceof fhn)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    fhnVar = new fhn((fhn) obj);
                }
                this.b.add(fhnVar);
                String str2 = fhnVar.n;
                if (str2 != null) {
                    ywVar.put(str2, fhnVar);
                }
            }
        }
    }

    public final void a() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    @Override // defpackage.fhv
    public final boolean b() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((fhv) arrayList.get(i)).b()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.fhv
    public final boolean c(int[] iArr) {
        int i = 0;
        boolean zC = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return zC;
            }
            zC |= ((fhv) arrayList.get(i)).c(iArr);
            i++;
        }
    }

    public String getGroupName() {
        return this.m;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            a();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            a();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            a();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            a();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            a();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            a();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            a();
        }
    }

    public fhp() {
        super(null);
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = BitmapDescriptorFactory.HUE_RED;
        this.d = BitmapDescriptorFactory.HUE_RED;
        this.e = BitmapDescriptorFactory.HUE_RED;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = BitmapDescriptorFactory.HUE_RED;
        this.i = BitmapDescriptorFactory.HUE_RED;
        this.j = new Matrix();
        this.m = null;
    }
}
