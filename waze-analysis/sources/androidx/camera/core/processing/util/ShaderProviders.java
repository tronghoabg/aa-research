package androidx.camera.core.processing.util;

import androidx.camera.core.DynamicRange;
import androidx.camera.core.processing.ShaderProvider;
import androidx.camera.core.processing.util.GLUtils;
import androidx.core.util.Preconditions;
import h.g.b.x;
import h.n.o;
import java.io.IOException;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ShaderProviders {
    public static final String BLANK_FRAGMENT_SHADER;
    public static final String BLANK_VERTEX_SHADER;
    public static final String DEFAULT_VERTEX_SHADER;
    public static final String HDR_VERTEX_SHADER;
    public static final ShaderProviders INSTANCE;

    static {
        ShaderProviders shaderProviders = new ShaderProviders();
        INSTANCE = shaderProviders;
        DEFAULT_VERTEX_SHADER = shaderProviders.createVertexShader(GLUtils.VAR_TEXTURE_COORD, false);
        HDR_VERTEX_SHADER = shaderProviders.createVertexShader(GLUtils.VAR_TEXTURE_COORD, true);
        BLANK_VERTEX_SHADER = "uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}";
        BLANK_FRAGMENT_SHADER = "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}";
    }

    private ShaderProviders() {
    }

    public static final String createFragmentShaderInternal(String str, String str2, boolean z, boolean z2, boolean z3) throws IOException {
        String strC;
        x.f(str, "samplerVarName");
        x.f(str2, "fragCoordsVarName");
        boolean z4 = z || z2;
        String str3 = true != z3 ? "" : "uniform float uCornerRadiusRatio;\nuniform float uAspectRatio;\nuniform float uBorderWidth;\nuniform vec4 uBorderColor;";
        String str4 = true != z4 ? "gl_FragColor" : "outColor";
        if (z3) {
            strC = o.c("\n            vec2 abs_pos = abs(vPosition);\n            float cornerDist = 0.0;\n            if (uCornerRadiusRatio > 0.0) {\n                // Calculate corner radius in NDC space\n                vec2 rxry = vec2(uCornerRadiusRatio);\n                if (uAspectRatio > 1.0) {\n                    rxry.x /= uAspectRatio;\n                } else {\n                    rxry.y *= uAspectRatio;\n                }\n\n                // Calculate distance to the corner\n                vec2 dist = max(abs_pos - (1.0 - rxry), 0.0);\n                cornerDist = length(dist / rxry);\n\n                // 1. Clip the outer edge\n                if (cornerDist > 1.0) {\n                    discard;\n                    return;\n                }\n           }\n           // 2. Draw the border\n           if (uBorderWidth > 0.0) {\n                // Straight edges border check\n                vec2 bt = vec2(uBorderWidth);\n                if (uAspectRatio > 1.0) {\n                     bt.x /= uAspectRatio;\n                } else {\n                     bt.y *= uAspectRatio;\n                }\n                bool isStraightBorder = (abs_pos.x > (1.0 - bt.x)) || (abs_pos.y > (1.0 - bt.y));\n                // Curved corner border check\n                bool isCurvedBorder = false;\n                if (uCornerRadiusRatio > 0.0) {\n                     float borderThreshold = max(1.0 - (uBorderWidth / uCornerRadiusRatio), 0.0);\n                     isCurvedBorder = cornerDist > borderThreshold;\n                }\n                if (isStraightBorder || isCurvedBorder) {\n                     " + str4 + " = uBorderColor;\n                     return;\n                }\n           }\n        ");
        } else {
            strC = "";
        }
        if (z2) {
            return o.v(o.c(" \n                #version 300 es\n                #extension GL_EXT_YUV_target : require\n                precision mediump float;\n                uniform __samplerExternal2DY2YEXT " + str + ";\n                uniform float uAlphaScale;\n                " + str3 + "\n                in vec2 " + str2 + ";\n                in vec2 vPosition;\n                out vec4 outColor;\n\n                vec3 yuvToRgb(vec3 yuv) {\n                  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n                  const mat3 yuvToRgbColorMat = mat3(\n                    1.1689f, 1.1689f, 1.1689f,\n                    0.0000f, -0.1881f, 2.1502f,\n                    1.6853f, -0.6530f, 0.0000f\n                  );\n                  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n                }\n\n                void main() {\n                  " + strC + "\n                  vec3 srcYuv = texture(" + str + ", " + str2 + ").xyz;\n                  vec3 srcRgb = yuvToRgb(srcYuv);\n                  outColor = vec4(srcRgb, uAlphaScale);\n                }\n            ")).toString();
        }
        String str5 = true != z4 ? "texture2D" : "texture";
        String str6 = true != z4 ? "" : "#version 300 es";
        String str7 = true != z4 ? "#extension GL_OES_EGL_image_external : require" : "#extension GL_OES_EGL_image_external_essl3 : require";
        String str8 = true != z4 ? "varying" : "in";
        return o.v(o.c("\n            " + str6 + "\n            " + str7 + "\n            precision mediump float;\n            uniform samplerExternalOES " + str + ";\n            uniform float uAlphaScale;\n            " + str3 + "\n            " + str8 + " vec2 " + str2 + ";\n            " + str8 + " vec2 vPosition;\n            " + (true == z4 ? "out vec4 outColor;" : "") + "\n            void main() {\n                " + strC + "\n                vec4 src = " + str5 + "(" + str + ", " + str2 + ");\n                " + str4 + " = vec4(src.rgb, src.a * uAlphaScale);\n            }\n        ")).toString();
    }

    private final String createVertexShader(String str, boolean z) {
        StringBuilder sb = new StringBuilder("\n            ");
        sb.append(true != z ? "" : "#version 300 es");
        sb.append("\n            ");
        String str2 = true != z ? "attribute" : "in";
        sb.append(str2);
        sb.append(" vec4 aPosition;\n            ");
        sb.append(str2);
        sb.append(" vec4 aTextureCoord;\n            uniform mat4 uTexMatrix;\n            uniform mat4 uTransMatrix;\n            ");
        String str3 = true != z ? "varying" : "out";
        sb.append(str3);
        sb.append(" vec2 ");
        sb.append(str);
        sb.append(";\n            ");
        sb.append(str3);
        sb.append(" vec2 vPosition;\n            void main() {\n              gl_Position = uTransMatrix * aPosition;\n              ");
        sb.append(str);
        sb.append(" = (uTexMatrix * aTextureCoord).xy;\n              vPosition = aPosition.xy;\n            }\n        ");
        return o.v(o.c(sb.toString())).toString();
    }

    public static final ShaderProvider resolveDefaultShaderProvider(DynamicRange dynamicRange, GLUtils.InputFormat inputFormat, final boolean z) {
        x.f(dynamicRange, "dynamicRange");
        x.f(inputFormat, "inputFormat");
        if (dynamicRange.is10BitHdr()) {
            boolean z2 = inputFormat != GLUtils.InputFormat.UNKNOWN;
            Objects.toString(inputFormat);
            Preconditions.checkArgument(z2, "No default sampler shader available for ".concat(String.valueOf(inputFormat)));
        }
        final boolean zIs10BitHdr = dynamicRange.is10BitHdr();
        final boolean z3 = inputFormat == GLUtils.InputFormat.YUV && zIs10BitHdr;
        return new ShaderProvider() { // from class: androidx.camera.core.processing.util.ShaderProviders.resolveDefaultShaderProvider.1
            @Override // androidx.camera.core.processing.ShaderProvider
            public String createFragmentShader(String str, String str2) {
                x.f(str, "samplerVarName");
                x.f(str2, "fragCoordsVarName");
                return ShaderProviders.createFragmentShaderInternal(str, str2, zIs10BitHdr, z3, z);
            }
        };
    }
}
