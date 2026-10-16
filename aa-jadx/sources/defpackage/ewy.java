package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ewy {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public ewy(int i, float f, float f2, float f3, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.ewy ewyVar = (defpackage.ewy) obj;
            return this.c == ewyVar.c && this.d == ewyVar.d && this.b == ewyVar.b && this.a == ewyVar.a && this.e == ewyVar.e;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((java.lang.Float.floatToIntBits(this.c) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + this.a) * 31) + defpackage.a.f(this.e);
    }

    public final java.lang.String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ")";
    }

    public ewy() {
        this(2, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 0L);
    }
}
