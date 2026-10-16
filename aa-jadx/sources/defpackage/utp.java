package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class utp {
    private static final java.lang.String[] l = {"pos"};
    public final defpackage.uuz a;
    public final int b;
    public final defpackage.uva c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    private final defpackage.uva m;

    public utp(defpackage.uuz uuzVar) {
        this.a = uuzVar;
        int iA = uuzVar.a("precision highp float;attribute vec2 pos;uniform vec2 blitSourceSize;uniform float blitSourceScale;uniform vec2 blitTargetSize;uniform vec2 blitTargetPos;uniform float blitFlipY;varying vec2 texCoord;void main(void) {  vec2 pixelPos = (pos * blitSourceSize * blitSourceScale) + blitTargetPos;  vec2 devicePos = 2.0 * (pixelPos / blitTargetSize) - 1.0;  devicePos.y *= blitFlipY;  gl_Position = vec4(devicePos, 0.0, 1.0);  texCoord = pos;}", "precision highp float;varying vec2 texCoord;uniform sampler2D blitTextureUnit;uniform float blitAlphaScale;uniform float blitAlphaBias;void main(void) {  gl_FragColor = texture2D(blitTextureUnit, texCoord);  gl_FragColor.a = gl_FragColor.a * blitAlphaScale + blitAlphaBias;}", l);
        this.b = iA;
        uuzVar.f(iA);
        this.d = defpackage.uuz.L(iA, "blitSourceSize");
        this.e = defpackage.uuz.L(iA, "blitSourceScale");
        this.f = defpackage.uuz.L(iA, "blitTargetSize");
        this.g = defpackage.uuz.L(iA, "blitTargetPos");
        this.h = defpackage.uuz.L(iA, "blitFlipY");
        this.i = defpackage.uuz.L(iA, "blitTextureUnit");
        this.j = defpackage.uuz.L(iA, "blitAlphaScale");
        this.k = defpackage.uuz.L(iA, "blitAlphaBias");
        float[] fArr = {com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, 1.0f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED};
        defpackage.uva uvaVarQ = uuzVar.Q();
        this.c = uvaVarQ;
        uuzVar.g(uvaVarQ);
        uuzVar.F(fArr, 8);
        defpackage.uva uvaVarP = uuzVar.P();
        this.m = uvaVarP;
        uuzVar.N(uvaVarP, 4, 4, new int[]{-1, -16777216, -1, -16777216, -16777216, -1, -16777216, -1, -1, -16777216, -1, -16777216, -16777216, -1, -16777216, -1});
    }
}
