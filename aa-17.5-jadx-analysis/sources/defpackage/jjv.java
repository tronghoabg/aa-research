package defpackage;

import android.opengl.GLES20;

/* loaded from: classes.dex */
public final class jjv extends jiy {
    public jjv(String str) {
        super(str);
    }

    public static void a(yph yphVar, String str) throws jjv {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        ((ype) ((ype) yphVar.g()).ai(2242)).K("%s: glError %d", str, iGlGetError);
        throw new jjv(str + ": glError " + iGlGetError);
    }
}
