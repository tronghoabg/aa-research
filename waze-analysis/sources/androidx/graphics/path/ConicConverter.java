package androidx.graphics.path;

import h.g.b.x;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ConicConverter {
    private int currentQuadratic;
    private int quadraticCount;
    private float[] quadraticData = new float[130];

    public static /* synthetic */ void convert$default(ConicConverter conicConverter, float[] fArr, float f2, float f3, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        conicConverter.convert(fArr, f2, f3, i2);
    }

    private final native int internalConicToQuadratics(float[] fArr, int i2, float[] fArr2, float f2, float f3);

    public static /* synthetic */ boolean nextQuadratic$default(ConicConverter conicConverter, float[] fArr, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return conicConverter.nextQuadratic(fArr, i2);
    }

    public final void convert(float[] fArr, float f2, float f3, int i2) {
        ConicConverter conicConverter;
        x.f(fArr, "points");
        if (o.m("dalvik", System.getProperty("java.vm.name"), true)) {
            int iInternalConicToQuadratics = internalConicToQuadratics(fArr, i2, this.quadraticData, f2, f3);
            conicConverter = this;
            conicConverter.quadraticCount = iInternalConicToQuadratics;
            int i3 = iInternalConicToQuadratics + iInternalConicToQuadratics;
            int i4 = i3 + i3 + 2;
            if (i4 > conicConverter.quadraticData.length) {
                float[] fArr2 = new float[i4];
                conicConverter.quadraticData = fArr2;
                conicConverter.quadraticCount = conicConverter.internalConicToQuadratics(fArr, i2, fArr2, f2, f3);
            }
        } else {
            conicConverter = this;
            conicConverter.quadraticData = ConicsImplKt.conicToQuadratics(fArr, i2, f2, f3);
            conicConverter.quadraticCount = (r7.length - 2) / 4;
        }
        conicConverter.currentQuadratic = 0;
    }

    public final int getCurrentQuadratic() {
        return this.currentQuadratic;
    }

    public final int getQuadraticCount() {
        return this.quadraticCount;
    }

    public final boolean nextQuadratic(float[] fArr, int i2) {
        x.f(fArr, "points");
        int i3 = this.currentQuadratic;
        if (i3 >= this.quadraticCount) {
            return false;
        }
        float[] fArr2 = this.quadraticData;
        int i4 = i3 + i3;
        int i5 = i4 + i4;
        fArr[i2] = fArr2[i5];
        fArr[i2 + 1] = fArr2[i5 + 1];
        fArr[i2 + 2] = fArr2[i5 + 2];
        fArr[i2 + 3] = fArr2[i5 + 3];
        fArr[i2 + 4] = fArr2[i5 + 4];
        fArr[i2 + 5] = fArr2[i5 + 5];
        this.currentQuadratic = i3 + 1;
        return true;
    }

    public final void setCurrentQuadratic(int i2) {
        this.currentQuadratic = i2;
    }
}
