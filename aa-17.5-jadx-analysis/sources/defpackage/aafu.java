package defpackage;

import android.opengl.GLES20;
import android.util.Log;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aafu {
    public static final String a = "aafu";
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final aafs g;
    public boolean h;
    public aafp i;
    public aafp j;
    public aafp k;
    public final float[] l;
    public final char[] m;
    private final FloatBuffer n;
    private final FloatBuffer o;
    private final CharBuffer p;

    public aafu(String str, int i, int i2) {
        aafs aafsVar = aafs.a;
        zkt.n(str, "debugName");
        this.b = str;
        Integer numValueOf = Integer.valueOf(i);
        int i3 = 0;
        zkt.j(i, 1, 65536, String.format("widthQuads[%s] must be <= %s", numValueOf, 65536));
        this.c = i;
        Integer numValueOf2 = Integer.valueOf(i2);
        zkt.j(i2, 1, 65536, String.format("heightQuads[%s] must be <= %s", numValueOf2, 65536));
        this.d = i2;
        int i4 = i + 1;
        this.e = i4;
        int i5 = i2 + 1;
        this.f = i5;
        zkt.e(((long) i4) * ((long) i5) < 65536, String.format("[%s x %s] quads size exceeds %s vertex limit", numValueOf, numValueOf2, 65536));
        this.g = aafsVar;
        int i6 = i4 * i5;
        this.n = aafs.h(i6 * 12);
        this.o = aafs.h(i6 * 8);
        int i7 = i * i2 * 6;
        this.p = ByteBuffer.allocateDirect(i7 + i7).order(ByteOrder.nativeOrder()).asCharBuffer();
        float[] fArr = new float[i6 * 3];
        this.l = fArr;
        char[] cArr = new char[i7];
        this.m = cArr;
        Arrays.fill(fArr, BitmapDescriptorFactory.HUE_RED);
        Arrays.fill(cArr, (char) 0);
        this.h = false;
        this.i = null;
        this.j = null;
        this.k = null;
        int i8 = 0;
        while (i8 < i2) {
            for (int i9 = i3; i9 < i; i9++) {
                int i10 = this.e;
                int i11 = (i8 * i10) + i9;
                int i12 = i11 + 1;
                int i13 = i10 + i11;
                int i14 = i13 + 1;
                int i15 = ((i8 * i) + i9) * 6;
                char c = (char) i11;
                this.p.put(i15, c);
                int i16 = i15 + 1;
                char c2 = (char) i12;
                this.p.put(i16, c2);
                int i17 = i15 + 2;
                char c3 = (char) i13;
                this.p.put(i17, c3);
                int i18 = i15 + 3;
                this.p.put(i18, c2);
                int i19 = i15 + 4;
                this.p.put(i19, c3);
                int i20 = i15 + 5;
                char c4 = (char) i14;
                this.p.put(i20, c4);
                char[] cArr2 = this.m;
                cArr2[i15] = c;
                cArr2[i16] = c2;
                cArr2[i17] = c3;
                cArr2[i18] = c2;
                cArr2[i19] = c3;
                cArr2[i20] = c4;
            }
            i8++;
            i3 = 0;
        }
    }

    public static int e(String str) {
        zkt.n(str, "tag");
        return aafs.i(str, "uniform   mat4  uMVPMatrix; attribute vec3  vPosition; attribute vec2  a_texCoord; varying   vec2  v_texCoord; void main() {   gl_Position = uMVPMatrix * vec4(vPosition,1);   v_texCoord = a_texCoord; }", "precision mediump float; uniform sampler2D u_Texture; uniform float     alpha; varying vec2      v_texCoord; void main() {   gl_FragColor = texture2D(u_Texture, v_texCoord);   gl_FragColor.a *= alpha; }");
    }

    public final void a() {
        if (this.h) {
            String str = a;
            if (zrn.e(str, 6)) {
                Log.e(str, String.format("%s.glUploadBuffers() called more than once", this.b));
                return;
            }
            return;
        }
        try {
            this.i = aafs.k("vPosition", this.n, 3);
            this.j = aafs.k("a_texCoord", this.o, 2);
            CharBuffer charBuffer = this.p;
            zkt.n(charBuffer, "charBuffer");
            int iG = aafs.g();
            GLES20.glBindBuffer(34962, iG);
            int iCapacity = charBuffer.capacity();
            GLES20.glBufferData(34962, iCapacity + iCapacity, charBuffer, 35044);
            GLES20.glBindBuffer(34962, 0);
            this.k = new aafp("indexBuffer", iG, 5123, 6);
            this.h = true;
        } catch (IllegalArgumentException e) {
            throw new IllegalStateException(String.format("%s.glUploadBuffers() failed to acquire a glHandle", this.b), e);
        }
    }

    public final void b(int i) {
        zkt.e(i != 0, "shaderProgramHandle");
        if (this.h) {
            aafs.c(i, this.i);
            aafs.c(i, this.j);
            GLES20.glBindBuffer(34963, this.k.b);
        } else {
            String str = a;
            if (zrn.e(str, 6)) {
                Log.e(str, String.format("%s.onDrawFrame_bindBufferData() called before glUploadBuffers()", this.b));
            }
        }
    }

    public final void c() {
        if (this.h) {
            GLES20.glDrawElements(4, this.c * this.d * 6, this.k.c, 0);
            return;
        }
        String str = a;
        if (zrn.e(str, 6)) {
            Log.e(str, String.format("%s.onDrawFrame_glDrawElements() called before glUploadBuffers()", this.b));
        }
    }

    public final void d(int i, int i2, float f, float f2, float f3, float f4, float f5) {
        int i3;
        String str = a;
        if (zrn.e(str, 2)) {
            i3 = 1;
            Log.v(str, String.format("%s.set(%s,%s,%s,%s,%s,%s,%s)", this.b, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)));
        } else {
            i3 = 1;
        }
        int i4 = this.e;
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(i4);
        Object[] objArr = new Object[2];
        objArr[0] = numValueOf;
        objArr[i3] = numValueOf2;
        zkt.j(i, 0, i4 - 1, String.format("i[%s] must be within [0,%s)", objArr));
        int i5 = this.f;
        Integer numValueOf3 = Integer.valueOf(i2);
        Integer numValueOf4 = Integer.valueOf(i5);
        Object[] objArr2 = new Object[2];
        objArr2[0] = numValueOf3;
        objArr2[i3] = numValueOf4;
        zkt.j(i2, 0, i5 - 1, String.format("j[%s] must be within [0,%s)", objArr2));
        if (this.h) {
            if (zrn.e(str, 6)) {
                Object[] objArr3 = new Object[i3];
                objArr3[0] = this.b;
                Log.e(str, String.format("%s.set() called after glUploadBuffers()", objArr3));
                return;
            }
            return;
        }
        int i6 = (i2 * i4) + i;
        int i7 = i6 * 3;
        FloatBuffer floatBuffer = this.n;
        floatBuffer.put(i7, f);
        int i8 = i7 + 1;
        floatBuffer.put(i8, f2);
        int i9 = i7 + 2;
        floatBuffer.put(i9, f3);
        float[] fArr = this.l;
        fArr[i7] = f;
        fArr[i8] = f2;
        fArr[i9] = f3;
        FloatBuffer floatBuffer2 = this.o;
        int i10 = i6 + i6;
        floatBuffer2.put(i10, f4);
        floatBuffer2.put(i10 + 1, f5);
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.b("debugName", this.b);
        zsaVarA.e("widthQuads", this.c);
        zsaVarA.e("heightQuads", this.d);
        zsaVarA.g("isGLUploaded", this.h);
        zsaVarA.b("vertexChannelInfo", this.i);
        zsaVarA.b("texCoordChannelInfo", this.j);
        zsaVarA.b("indexChannelInfo", this.k);
        return zsaVarA.toString();
    }
}
