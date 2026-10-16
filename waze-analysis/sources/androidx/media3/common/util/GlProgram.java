package androidx.media3.common.util;

import android.content.Context;
import android.opengl.GLES20;
import androidx.media3.common.C;
import androidx.media3.common.util.GlUtil;
import com.google.d.b.an;
import com.waze.strings.DisplayStrings;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class GlProgram {
    private static final int GL_SAMPLER_EXTERNAL_2D_Y2Y_EXT = 35815;
    private final Map<String, Attribute> attributeByName;
    private final Attribute[] attributes;
    private boolean externalTexturesRequireNearestSampling;
    private final int programId;
    private final Map<String, Uniform> uniformByName;
    private final Uniform[] uniforms;

    /* compiled from: WazeSource */
    final class Attribute {
        private Buffer buffer;
        private final int location;
        public final String name;
        private int size;

        private Attribute(String str, int i2) {
            this.name = str;
            this.location = i2;
        }

        public static Attribute create(int i2, int i3) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i2, 35722, iArr, 0);
            int i4 = iArr[0];
            byte[] bArr = new byte[i4];
            GLES20.glGetActiveAttrib(i2, i3, i4, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, GlProgram.getCStringLength(bArr));
            return new Attribute(str, GlProgram.getAttributeLocation(i2, str));
        }

        public void bind() throws GlUtil.GlException {
            Buffer buffer = this.buffer;
            an.C(buffer, "call setBuffer before bind");
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(this.location, this.size, 5126, false, 0, buffer);
            GLES20.glEnableVertexAttribArray(this.location);
            GlUtil.checkGlError();
        }

        public void setBuffer(float[] fArr, int i2) {
            this.buffer = GlUtil.createBuffer(fArr);
            this.size = i2;
        }
    }

    /* compiled from: WazeSource */
    final class Uniform {
        private final int location;
        public final String name;
        private int texIdValue;
        private int texUnitIndex;
        private final int type;
        private final float[] floatValue = new float[16];
        private final int[] intValue = new int[4];
        private int texMinFilter = C.TEXTURE_MIN_FILTER_LINEAR;

        private Uniform(String str, int i2, int i3) {
            this.name = str;
            this.location = i2;
            this.type = i3;
        }

        public static Uniform create(int i2, int i3) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i2, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i4 = iArr[0];
            byte[] bArr = new byte[i4];
            GLES20.glGetActiveUniform(i2, i3, i4, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, GlProgram.getCStringLength(bArr));
            return new Uniform(str, GlProgram.getUniformLocation(i2, str), iArr2[0]);
        }

        public void bind(boolean z) throws GlUtil.GlException {
            int i2;
            int i3 = this.type;
            if (i3 == 5124) {
                GLES20.glUniform1iv(this.location, 1, this.intValue, 0);
                GlUtil.checkGlError();
                return;
            }
            if (i3 == 5126) {
                GLES20.glUniform1fv(this.location, 1, this.floatValue, 0);
                GlUtil.checkGlError();
                return;
            }
            if (i3 != GlProgram.GL_SAMPLER_EXTERNAL_2D_Y2Y_EXT && i3 != 36198) {
                switch (i3) {
                    case 35664:
                        GLES20.glUniform2fv(this.location, 1, this.floatValue, 0);
                        GlUtil.checkGlError();
                        return;
                    case 35665:
                        GLES20.glUniform3fv(this.location, 1, this.floatValue, 0);
                        GlUtil.checkGlError();
                        return;
                    case 35666:
                        GLES20.glUniform4fv(this.location, 1, this.floatValue, 0);
                        GlUtil.checkGlError();
                        return;
                    case 35667:
                        GLES20.glUniform2iv(this.location, 1, this.intValue, 0);
                        GlUtil.checkGlError();
                        return;
                    case 35668:
                        GLES20.glUniform3iv(this.location, 1, this.intValue, 0);
                        GlUtil.checkGlError();
                        return;
                    case 35669:
                        GLES20.glUniform4iv(this.location, 1, this.intValue, 0);
                        GlUtil.checkGlError();
                        return;
                    default:
                        switch (i3) {
                            case 35675:
                                GLES20.glUniformMatrix3fv(this.location, 1, false, this.floatValue, 0);
                                GlUtil.checkGlError();
                                return;
                            case 35676:
                                GLES20.glUniformMatrix4fv(this.location, 1, false, this.floatValue, 0);
                                GlUtil.checkGlError();
                                return;
                            default:
                                switch (i3) {
                                    case 35678:
                                    case 35679:
                                        break;
                                    default:
                                        throw new IllegalStateException(a.a(i3, "Unexpected uniform type: "));
                                }
                        }
                }
            }
            if (this.texIdValue == 0) {
                throw new IllegalStateException("No call to setSamplerTexId() before bind.");
            }
            GLES20.glActiveTexture(this.texUnitIndex + 33984);
            GlUtil.checkGlError();
            int i4 = this.type;
            int i5 = C.TEXTURE_MIN_FILTER_LINEAR;
            switch (i4) {
                case 35678:
                    i2 = 3553;
                    break;
                case 35679:
                    i2 = 32879;
                    break;
                case GlProgram.GL_SAMPLER_EXTERNAL_2D_Y2Y_EXT /* 35815 */:
                case 36198:
                    if (true == z) {
                        i5 = 9728;
                    }
                    i2 = 36197;
                    break;
                default:
                    throw new IllegalStateException(a.a(i4, "Unexpected sampler type: "));
            }
            GlUtil.bindTexture(i2, this.texIdValue, i5);
            if (this.type == 35678) {
                if (this.texMinFilter == 9987) {
                    GLES20.glGenerateMipmap(DisplayStrings.DS_CONVERSATIONAL_REPORTING_BUTTON_GENERAL_ERROR);
                    GlUtil.checkGlError();
                }
                GLES20.glTexParameteri(DisplayStrings.DS_CONVERSATIONAL_REPORTING_BUTTON_GENERAL_ERROR, 10241, this.texMinFilter);
                GlUtil.checkGlError();
            }
            GLES20.glUniform1i(this.location, this.texUnitIndex);
            GlUtil.checkGlError();
        }

        public void setFloat(float f2) {
            this.floatValue[0] = f2;
        }

        public void setFloats(float[] fArr) {
            System.arraycopy(fArr, 0, this.floatValue, 0, fArr.length);
        }

        public void setInt(int i2) {
            this.intValue[0] = i2;
        }

        public void setInts(int[] iArr) {
            System.arraycopy(iArr, 0, this.intValue, 0, iArr.length);
        }

        public void setSamplerTexId(int i2, int i3) {
            this.texIdValue = i2;
            this.texUnitIndex = i3;
        }

        public void setTexMinFilter(int i2) {
            this.texMinFilter = i2;
        }
    }

    public GlProgram(String str, String str2) throws GlUtil.GlException {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.programId = iGlCreateProgram;
        GlUtil.checkGlError();
        addShader(iGlCreateProgram, 35633, str);
        addShader(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        GlUtil.checkGlException(iArr[0] == 1, "Unable to link shader program: \n".concat(String.valueOf(GLES20.glGetProgramInfoLog(iGlCreateProgram))));
        GLES20.glUseProgram(iGlCreateProgram);
        this.attributeByName = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.attributes = new Attribute[iArr2[0]];
        for (int i2 = 0; i2 < iArr2[0]; i2++) {
            Attribute attributeCreate = Attribute.create(this.programId, i2);
            this.attributes[i2] = attributeCreate;
            this.attributeByName.put(attributeCreate.name, attributeCreate);
        }
        this.uniformByName = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.programId, 35718, iArr3, 0);
        this.uniforms = new Uniform[iArr3[0]];
        for (int i3 = 0; i3 < iArr3[0]; i3++) {
            Uniform uniformCreate = Uniform.create(this.programId, i3);
            this.uniforms[i3] = uniformCreate;
            this.uniformByName.put(uniformCreate.name, uniformCreate);
        }
        GlUtil.checkGlError();
    }

    private static void addShader(int i2, int i3, String str) throws GlUtil.GlException {
        int iGlCreateShader = GLES20.glCreateShader(i3);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        GlUtil.checkGlException(iArr[0] == 1, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str);
        GLES20.glAttachShader(i2, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        GlUtil.checkGlError();
    }

    private int getAttributeLocation(String str) {
        return getAttributeLocation(this.programId, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getCStringLength(byte[] bArr) {
        int i2 = 0;
        while (true) {
            int length = bArr.length;
            if (i2 >= length) {
                return length;
            }
            if (bArr[i2] == 0) {
                return i2;
            }
            i2++;
        }
    }

    public void bindAttributesAndUniforms() throws GlUtil.GlException {
        for (Attribute attribute : this.attributes) {
            attribute.bind();
        }
        for (Uniform uniform : this.uniforms) {
            uniform.bind(this.externalTexturesRequireNearestSampling);
        }
    }

    public void delete() throws GlUtil.GlException {
        GLES20.glDeleteProgram(this.programId);
        GlUtil.checkGlError();
    }

    public int getAttributeArrayLocationAndEnable(String str) throws GlUtil.GlException {
        int attributeLocation = getAttributeLocation(str);
        GLES20.glEnableVertexAttribArray(attributeLocation);
        GlUtil.checkGlError();
        return attributeLocation;
    }

    public int getUniformLocation(String str) {
        return getUniformLocation(this.programId, str);
    }

    public void setBufferAttribute(String str, float[] fArr, int i2) {
        Attribute attribute = this.attributeByName.get(str);
        an.B(attribute);
        attribute.setBuffer(fArr, i2);
    }

    public void setExternalTexturesRequireNearestSampling(boolean z) {
        this.externalTexturesRequireNearestSampling = z;
    }

    public void setFloatUniform(String str, float f2) {
        Uniform uniform = this.uniformByName.get(str);
        an.B(uniform);
        uniform.setFloat(f2);
    }

    public void setFloatsUniform(String str, float[] fArr) {
        Uniform uniform = this.uniformByName.get(str);
        an.B(uniform);
        uniform.setFloats(fArr);
    }

    public void setFloatsUniformIfPresent(String str, float[] fArr) {
        Uniform uniform = this.uniformByName.get(str);
        if (uniform == null) {
            return;
        }
        uniform.setFloats(fArr);
    }

    public void setIntUniform(String str, int i2) {
        Uniform uniform = this.uniformByName.get(str);
        an.B(uniform);
        uniform.setInt(i2);
    }

    public void setIntsUniform(String str, int[] iArr) {
        Uniform uniform = this.uniformByName.get(str);
        an.B(uniform);
        uniform.setInts(iArr);
    }

    public void setSamplerTexIdUniform(String str, int i2, int i3, int i4) {
        Uniform uniform = this.uniformByName.get(str);
        an.B(uniform);
        uniform.setSamplerTexId(i2, i3);
        uniform.setTexMinFilter(i4);
    }

    public void use() throws GlUtil.GlException {
        GLES20.glUseProgram(this.programId);
        GlUtil.checkGlError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getAttributeLocation(int i2, String str) {
        return GLES20.glGetAttribLocation(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getUniformLocation(int i2, String str) {
        return GLES20.glGetUniformLocation(i2, str);
    }

    public void setSamplerTexIdUniform(String str, int i2, int i3) {
        Uniform uniform = this.uniformByName.get(str);
        an.B(uniform);
        uniform.setSamplerTexId(i2, i3);
    }

    public GlProgram(Context context, String str, String str2) {
        this(Util.loadAsset(context, str), Util.loadAsset(context, str2));
    }

    public GlProgram(Context context, int i2, int i3) {
        this(Util.loadRawResource(context, i2), Util.loadRawResource(context, i3));
    }
}
