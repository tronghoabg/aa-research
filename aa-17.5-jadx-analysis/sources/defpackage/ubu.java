package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ubu {
    public final uwk a;
    public final boolean b;
    public final tpf c;
    public float d = 1.0f;
    public final float[] e;
    public final float[] f;
    public final float[] g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final float[] k;
    public final float[] l;

    public ubu(uwk uwkVar, boolean z, tpf tpfVar) {
        this.b = z;
        this.c = tpfVar;
        this.a = uwkVar;
        int iA = uwkVar == null ? 1 : uwkVar.a();
        float[] fArr = new float[iA];
        this.e = fArr;
        Arrays.fill(fArr, 1.0f);
        this.f = new float[iA];
        this.g = new float[iA];
        float[] fArr2 = new float[iA];
        this.h = fArr2;
        Arrays.fill(fArr2, 0.5f);
        float[] fArr3 = new float[iA];
        this.i = fArr3;
        Arrays.fill(fArr3, 0.5f);
        this.j = new float[iA];
        float[] fArr4 = new float[iA];
        this.k = fArr4;
        Arrays.fill(fArr4, 1.0f);
        float[] fArr5 = new float[iA];
        this.l = fArr5;
        Arrays.fill(fArr5, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ubu)) {
            return false;
        }
        ubu ubuVar = (ubu) obj;
        if (!Objects.equals(ubuVar.a, this.a)) {
            return false;
        }
        if (ubuVar.b == this.b && Objects.equals(ubuVar.c, this.c) && ubuVar.d == this.d && Arrays.equals(ubuVar.e, this.e) && Arrays.equals(ubuVar.f, this.f) && Arrays.equals(ubuVar.g, this.g) && Arrays.equals(ubuVar.h, this.h) && Arrays.equals(ubuVar.i, this.i) && Arrays.equals(ubuVar.j, this.j) && Arrays.equals(ubuVar.k, this.k)) {
            Arrays.equals(ubuVar.l, this.l);
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(a.f(this.b)), Integer.valueOf(this.c.hashCode()), Integer.valueOf(Float.floatToIntBits(this.d)), this.a, Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(Arrays.hashCode(this.g)), Integer.valueOf(Arrays.hashCode(this.h)), Integer.valueOf(Arrays.hashCode(this.i)), Integer.valueOf(Arrays.hashCode(this.j)), Integer.valueOf(Arrays.hashCode(this.k)), Integer.valueOf(Arrays.hashCode(this.l)));
    }

    public final String toString() {
        float[] fArr = this.l;
        float[] fArr2 = this.k;
        float[] fArr3 = this.j;
        float[] fArr4 = this.i;
        float[] fArr5 = this.h;
        float[] fArr6 = this.g;
        float[] fArr7 = this.f;
        float[] fArr8 = this.e;
        uwk uwkVar = this.a;
        return "TextureGroupInfo{isIcon=" + this.b + ", anchorOffset=" + String.valueOf(this.c) + ", textureGroup=" + String.valueOf(uwkVar) + ", textureGroupOpacity=" + this.d + ", textureOpacities=" + Arrays.toString(fArr8) + ", xLayerOffsets=" + Arrays.toString(fArr7) + ", yLayerOffsets=" + Arrays.toString(fArr6) + ", xLayerAnchors=" + Arrays.toString(fArr5) + ", yLayerAnchors=" + Arrays.toString(fArr4) + ", rotations=" + Arrays.toString(fArr3) + ", xScales=" + Arrays.toString(fArr2) + ", yScales=" + Arrays.toString(fArr) + "}";
    }
}
