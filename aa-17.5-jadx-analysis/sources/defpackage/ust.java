package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class ust {
    private static final String[] l = {"pos"};
    public final uud a;
    public final int b;
    public final uue c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    private final uue m;

    public ust(uud uudVar) {
        this.a = uudVar;
        int iA = uudVar.a("precision highp float;attribute vec2 pos;uniform vec2 blitSourceSize;uniform float blitSourceScale;uniform vec2 blitTargetSize;uniform vec2 blitTargetPos;uniform float blitFlipY;varying vec2 texCoord;void main(void) {  vec2 pixelPos = (pos * blitSourceSize * blitSourceScale) + blitTargetPos;  vec2 devicePos = 2.0 * (pixelPos / blitTargetSize) - 1.0;  devicePos.y *= blitFlipY;  gl_Position = vec4(devicePos, 0.0, 1.0);  texCoord = pos;}", "precision highp float;varying vec2 texCoord;uniform sampler2D blitTextureUnit;uniform float blitAlphaScale;uniform float blitAlphaBias;void main(void) {  gl_FragColor = texture2D(blitTextureUnit, texCoord);  gl_FragColor.a = gl_FragColor.a * blitAlphaScale + blitAlphaBias;}", l);
        this.b = iA;
        uudVar.f(iA);
        this.d = uud.L(iA, "blitSourceSize");
        this.e = uud.L(iA, "blitSourceScale");
        this.f = uud.L(iA, "blitTargetSize");
        this.g = uud.L(iA, "blitTargetPos");
        this.h = uud.L(iA, "blitFlipY");
        this.i = uud.L(iA, "blitTextureUnit");
        this.j = uud.L(iA, "blitAlphaScale");
        this.k = uud.L(iA, "blitAlphaBias");
        float[] fArr = {BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED};
        uue uueVarQ = uudVar.Q();
        this.c = uueVarQ;
        uudVar.g(uueVarQ);
        uudVar.F(fArr, 8);
        uue uueVarP = uudVar.P();
        this.m = uueVarP;
        uudVar.N(uueVarP, 4, 4, new int[]{-1, -16777216, -1, -16777216, -16777216, -1, -16777216, -1, -1, -16777216, -1, -16777216, -16777216, -1, -16777216, -1});
    }
}
