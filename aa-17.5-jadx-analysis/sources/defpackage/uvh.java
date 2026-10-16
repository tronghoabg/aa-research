package defpackage;

import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/* loaded from: classes3.dex */
public final class uvh {
    private static final yob o = yob.c("com/google/android/libraries/geo/mapcore/renderer/MeshPainter");
    uud a;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    int k;
    int l;
    qsb n;
    ArrayList b = new ArrayList();
    ArrayList c = new ArrayList();
    private final int[] p = new int[8];
    qsb m = new qsb((byte[]) null, (char[]) null);

    public uvh(uvg uvgVar) {
        this.d = 0;
        this.e = 0;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.a = uvgVar.r;
        qsb qsbVar = new qsb((byte[]) null, (byte[]) null, (short[]) null);
        this.n = qsbVar;
        kex kexVar = (kex) qsbVar.b;
        String[] strArr = {(String) kexVar.c, (String) kexVar.a, (String) kexVar.b};
        int iGlCreateShader = GLES20.glCreateShader(35633);
        GLES20.glShaderSource(iGlCreateShader, (String) this.n.d);
        GLES20.glCompileShader(iGlCreateShader);
        int iGlCreateShader2 = GLES20.glCreateShader(35632);
        GLES20.glShaderSource(iGlCreateShader2, (String) this.n.a);
        GLES20.glCompileShader(iGlCreateShader2);
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader);
        GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader2);
        for (int i = 0; i < 3; i++) {
            GLES20.glBindAttribLocation(iGlCreateProgram, i, strArr[i]);
        }
        GLES20.glLinkProgram(iGlCreateProgram);
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, this.p, 0);
        int iGlGetError = GLES20.glGetError();
        if (this.p[0] != 1 || iGlGetError != 0) {
            yob yobVar = o;
            ((ynz) ((ynz) yobVar.h()).ai((char) 9684)).u("glLinkProgram failed in MeshPainter");
            ((ynz) ((ynz) yobVar.h()).ai((char) 9685)).y("program:\n%s", GLES20.glGetProgramInfoLog(iGlCreateProgram));
            ((ynz) ((ynz) yobVar.h()).ai((char) 9686)).y("# of lines in vertex shader: %s", a((String) this.n.d));
            ((ynz) ((ynz) yobVar.h()).ai((char) 9687)).y("# of lines in fragment shader: %s", a((String) this.n.a));
        }
        this.d = iGlCreateProgram;
        qsb qsbVar2 = (qsb) this.m.b;
        String[] strArr2 = {(String) qsbVar2.b, (String) qsbVar2.a, (String) qsbVar2.c, (String) qsbVar2.d};
        int iGlCreateShader3 = GLES20.glCreateShader(35633);
        GLES20.glShaderSource(iGlCreateShader3, (String) this.m.d);
        GLES20.glCompileShader(iGlCreateShader3);
        int iGlCreateShader4 = GLES20.glCreateShader(35632);
        GLES20.glShaderSource(iGlCreateShader4, (String) this.m.c);
        GLES20.glCompileShader(iGlCreateShader4);
        int iGlCreateProgram2 = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram2, iGlCreateShader3);
        GLES20.glAttachShader(iGlCreateProgram2, iGlCreateShader4);
        for (int i2 = 0; i2 < 4; i2++) {
            GLES20.glBindAttribLocation(iGlCreateProgram2, i2, strArr2[i2]);
        }
        GLES20.glLinkProgram(iGlCreateProgram2);
        GLES20.glGetProgramiv(iGlCreateProgram2, 35714, this.p, 0);
        int iGlGetError2 = GLES20.glGetError();
        if (this.p[0] != 1 || iGlGetError2 != 0) {
            yob yobVar2 = o;
            ((ynz) ((ynz) yobVar2.h()).ai((char) 9680)).u("glLinkProgram failed in MeshPainter");
            ((ynz) ((ynz) yobVar2.h()).ai((char) 9681)).u("program:\n");
            ((ynz) ((ynz) yobVar2.h()).ai((char) 9682)).y("# of lines in vertex shader: %s", a((String) this.m.d));
            ((ynz) ((ynz) yobVar2.h()).ai((char) 9683)).y("# of lines in fragment shader: %s", a((String) this.m.c));
        }
        this.e = iGlCreateProgram2;
        qsb qsbVar3 = (qsb) this.n.c;
        GLES20.glGetUniformLocation(this.d, (String) qsbVar3.a);
        this.f = GLES20.glGetUniformLocation(this.d, (String) qsbVar3.c);
        this.g = GLES20.glGetUniformLocation(this.d, (String) qsbVar3.d);
        this.h = GLES20.glGetUniformLocation(this.d, (String) qsbVar3.b);
        zig zigVar = (zig) this.m.a;
        GLES20.glGetUniformLocation(this.e, (String) zigVar.b);
        this.i = GLES20.glGetUniformLocation(this.e, (String) zigVar.a);
        this.j = GLES20.glGetUniformLocation(this.e, (String) zigVar.d);
        this.k = GLES20.glGetUniformLocation(this.e, (String) zigVar.c);
        this.l = GLES20.glGetUniformLocation(this.e, (String) zigVar.f);
        GLES20.glGetUniformLocation(this.e, (String) zigVar.e);
    }

    private static String a(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        Scanner scanner = new Scanner(str);
        int i = 1;
        while (scanner.hasNextLine()) {
            sb.append(String.format(Locale.getDefault(), "%03d", Integer.valueOf(i)));
            sb.append(": ");
            sb.append(scanner.nextLine());
            sb.append("\n");
            i++;
        }
        return sb.toString();
    }
}
