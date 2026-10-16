package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fhv extends defpackage.fib {
    final android.graphics.Matrix a;
    final java.util.ArrayList b;
    float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    final android.graphics.Matrix j;
    int k;
    public int[] l;
    public java.lang.String m;

    public fhv(defpackage.fhv fhvVar, defpackage.zd zdVar) {
        defpackage.fhw fhtVar;
        super(null);
        this.a = new android.graphics.Matrix();
        this.b = new java.util.ArrayList();
        this.c = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.d = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.e = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.i = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        this.j = matrix;
        this.m = null;
        this.c = fhvVar.c;
        this.d = fhvVar.d;
        this.e = fhvVar.e;
        this.f = fhvVar.f;
        this.g = fhvVar.g;
        this.h = fhvVar.h;
        this.i = fhvVar.i;
        int[] iArr = fhvVar.l;
        this.l = null;
        java.lang.String str = fhvVar.m;
        this.m = str;
        int i = fhvVar.k;
        this.k = 0;
        if (str != null) {
            zdVar.put(str, this);
        }
        matrix.set(fhvVar.j);
        java.util.ArrayList arrayList = fhvVar.b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            java.lang.Object obj = arrayList.get(i2);
            if (obj instanceof defpackage.fhv) {
                this.b.add(new defpackage.fhv((defpackage.fhv) obj, zdVar));
            } else {
                if (obj instanceof defpackage.fhu) {
                    fhtVar = new defpackage.fhu((defpackage.fhu) obj);
                } else {
                    if (!(obj instanceof defpackage.fht)) {
                        throw new java.lang.IllegalStateException("Unknown object in the tree!");
                    }
                    fhtVar = new defpackage.fht((defpackage.fht) obj);
                }
                this.b.add(fhtVar);
                java.lang.String str2 = fhtVar.n;
                if (str2 != null) {
                    zdVar.put(str2, fhtVar);
                }
            }
        }
    }

    public final void a() {
        android.graphics.Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    @Override // defpackage.fib
    public final boolean b() {
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((defpackage.fib) arrayList.get(i)).b()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.fib
    public final boolean c(int[] iArr) {
        int i = 0;
        boolean zC = false;
        while (true) {
            java.util.ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return zC;
            }
            zC |= ((defpackage.fib) arrayList.get(i)).c(iArr);
            i++;
        }
    }

    public java.lang.String getGroupName() {
        return this.m;
    }

    public android.graphics.Matrix getLocalMatrix() {
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

    public fhv() {
        super(null);
        this.a = new android.graphics.Matrix();
        this.b = new java.util.ArrayList();
        this.c = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.d = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.e = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.i = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.j = new android.graphics.Matrix();
        this.m = null;
    }
}
