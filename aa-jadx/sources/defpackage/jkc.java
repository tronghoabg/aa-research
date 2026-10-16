package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jkc extends defpackage.jjf {
    public jkc(java.lang.String str) {
        super(str);
    }

    public static void a(defpackage.yqm yqmVar, java.lang.String str) throws defpackage.jkc {
        int iGlGetError = android.opengl.GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai(2243)).K("%s: glError %d", str, iGlGetError);
        throw new defpackage.jkc(str + ": glError " + iGlGetError);
    }
}
