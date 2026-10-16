package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class avl extends cxt<avm> {
    private final float a;
    private final float b;
    private final float c;
    private final float d;

    public avl(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= BitmapDescriptorFactory.HUE_RED || Float.isNaN(f)) & (f2 >= BitmapDescriptorFactory.HUE_RED || Float.isNaN(f2)) & (f3 >= BitmapDescriptorFactory.HUE_RED || Float.isNaN(f3))) || !(f4 >= BitmapDescriptorFactory.HUE_RED || Float.isNaN(f4))) {
            awx.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new avm(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        avm avmVar = (avm) cfxVar;
        avmVar.a = this.a;
        avmVar.b = this.b;
        avmVar.c = this.c;
        avmVar.d = this.d;
        avmVar.e = true;
    }

    public final boolean equals(Object obj) {
        avl avlVar = obj instanceof avl ? (avl) obj : null;
        return avlVar != null && Float.compare(this.a, avlVar.a) == 0 && Float.compare(this.b, avlVar.b) == 0 && Float.compare(this.c, avlVar.c) == 0 && Float.compare(this.d, avlVar.d) == 0;
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + 1231;
    }
}
