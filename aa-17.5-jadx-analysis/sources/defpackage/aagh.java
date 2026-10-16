package defpackage;

import android.opengl.Matrix;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class aagh extends aagu {
    public static final String a = "aagh";
    private static final ThreadLocal h;
    private static final ThreadLocal i;
    public float[] b;
    public float[] c;
    public double d;

    static {
        double d = aahr.a;
        ExecutorService executorService = zrz.a;
        h = new zru(4);
        i = new zru(4);
    }

    public aagh(aagu aaguVar) {
        super(aaguVar.e, aaguVar.f, aaguVar.g);
        synchronized (this) {
            this.b = null;
            this.c = null;
            this.d = 0.0d;
        }
    }

    public static float[] b(aagu aaguVar, aags aagsVar, boolean z) {
        float[] fArr = (float[]) h.get();
        float[] fArr2 = (float[]) i.get();
        float f = true != z ? 1.0f : -1.0f;
        float[] fArr3 = new float[4];
        fArr[0] = aaguVar.f * f;
        fArr[1] = BitmapDescriptorFactory.HUE_RED * f;
        fArr[2] = f * (-aaguVar.g);
        fArr[3] = 1.0f;
        zkt.n(fArr, "originalRay");
        zkt.n(fArr2, "outputRay");
        Matrix.multiplyMV(fArr2, 0, aagsVar.f, 0, fArr, 0);
        Matrix.multiplyMV(fArr3, 0, aagsVar.e, 0, fArr2, 0);
        return fArr3;
    }

    public final synchronized double a() {
        return this.d;
    }

    public final synchronized float[] c() {
        return this.c;
    }

    public final synchronized float[] d() {
        return this.b;
    }

    @Override // defpackage.aagu
    public final synchronized String toString() {
        return String.format("%s=>{%s,%s,%s}", super.toString(), Double.valueOf(this.d), Arrays.toString(this.b), Arrays.toString(this.c));
    }
}
