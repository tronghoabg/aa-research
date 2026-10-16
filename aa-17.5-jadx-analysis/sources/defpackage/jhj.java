package defpackage;

import android.content.ComponentName;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class jhj extends jhb {
    private static final yph L = yph.c("CAR.WM.WINSHADOW");
    private static final float[] M;
    private int N;
    private int O;
    private final boolean P;
    private FloatBuffer Q;

    static {
        float[] fArr = new float[16];
        M = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public jhj(jkk jkkVar, jhe jheVar, boolean z, int i, CarRegionId carRegionId, UUID uuid, ComponentName componentName) {
        super(jkkVar, 1, jheVar, carRegionId, uuid, componentName);
        this.N = 0;
        this.O = 0;
        if (i >= 0) {
            this.N = jkkVar.a(i);
        } else {
            this.N = jkkVar.a(true != z ? 78 : 8);
        }
        jju jjuVar = ((ina) jkkVar).ap;
        this.O = z ? jjuVar.c : jjuVar.d;
        this.P = z;
    }

    @Override // defpackage.jhb
    protected final void aP(jju jjuVar, float f, float[] fArr, jhg jhgVar, int i) {
        super.aP(jjuVar, f, fArr, jhgVar, i);
        jjuVar.d(2);
        jjw jjwVarB = jjuVar.b(2);
        int i2 = jjwVarB.b;
        if (aX()) {
            fArr = this.K;
        }
        GLES20.glUniformMatrix4fv(i2, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.O);
        GLES20.glEnable(3042);
        GLES20.glBlendColor(1.0f, 1.0f, 1.0f, f);
        GLES20.glBlendFunc(770, 771);
        this.Q.position(0);
        int i3 = jjwVarB.d;
        GLES20.glVertexAttribPointer(i3, 3, 5126, false, 20, (Buffer) this.Q);
        GLES20.glEnableVertexAttribArray(i3);
        this.Q.position(3);
        int i4 = jjwVarB.e;
        GLES20.glVertexAttribPointer(i4, 2, 5126, false, 20, (Buffer) this.Q);
        GLES20.glEnableVertexAttribArray(i4);
        GLES20.glUniformMatrix4fv(jjwVarB.c, 1, false, M, 0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    @Override // defpackage.jhb
    protected final void aU() {
        super.aU();
        jhq jhqVar = this.e;
        jhqVar.getClass();
        float f = this.P ? jhqVar.f : jhqVar.b - this.N;
        float f2 = jhqVar.a;
        float f3 = jhqVar.c + f2;
        float f4 = this.N + f;
        float[] fArr = {f2, f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, f3, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, f2, f4, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, f3, f4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.Q = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        ((ype) L.l().ai((char) 2158)).y("setNewVerticesData %s", this);
    }
}
