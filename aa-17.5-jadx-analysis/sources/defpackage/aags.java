package defpackage;

import android.opengl.Matrix;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aags {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float[] e;
    public final float[] f;
    public final float[] g;

    public aags(String str, float f, float f2, float f3) {
        zkt.n(str, "panoId");
        this.a = str;
        zkt.l(f, "sceneCameraBearingDeg cannot be NaN");
        this.b = f;
        zkt.l(f2, "sceneTiltYawDeg cannot be NaN");
        this.c = f2;
        zkt.l(f3, "sceneTiltPitchDeg cannot be NaN");
        this.d = f3;
        float[] fArr = new float[16];
        this.e = fArr;
        Matrix.setIdentityM(fArr, 0);
        double radians = Math.toRadians(f2);
        Matrix.rotateM(fArr, 0, -f3, (float) (-Math.cos(radians)), BitmapDescriptorFactory.HUE_RED, (float) (-Math.sin(radians)));
        float[] fArr2 = new float[16];
        this.f = fArr2;
        Matrix.setIdentityM(fArr2, 0);
        Matrix.rotateM(fArr2, 0, -f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED);
        float[] fArr3 = new float[16];
        this.g = fArr3;
        Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aags)) {
            return false;
        }
        aags aagsVar = (aags) obj;
        return a.C(this.a, aagsVar.a) && a.C(Float.valueOf(this.b), Float.valueOf(aagsVar.b)) && a.C(Float.valueOf(this.c), Float.valueOf(aagsVar.c)) && a.C(Float.valueOf(this.d), Float.valueOf(aagsVar.d));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d)});
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.b("panoId", this.a);
        zsaVarA.d("sceneCameraBearingDeg", this.b);
        zsaVarA.d("sceneTiltYawDeg", this.c);
        zsaVarA.d("sceneTiltPitchDeg", this.d);
        return zsaVarA.toString();
    }
}
