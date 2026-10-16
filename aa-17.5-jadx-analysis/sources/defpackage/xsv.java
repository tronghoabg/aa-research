package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class xsv {
    public final xsn a;
    public final xsk b;
    public final xsk c;
    public final xsn d;
    public final xsn e;
    public final xsk f;
    public final xsi g;
    public final xsk h;
    public final xsn i;
    public final xsn j;
    public final List k;
    private final String l;

    public xsv(String str) {
        this.l = str;
        xsn xsnVar = new xsn("inBorderLightAlpha".concat(str));
        this.a = xsnVar;
        xsk xskVar = new xsk("inBorderLightTopBlurRadius".concat(str));
        this.b = xskVar;
        xsk xskVar2 = new xsk("inBorderLightBottomBlurRadius".concat(str));
        this.c = xskVar2;
        xsn xsnVar2 = new xsn("inBorderLightTopIntensity".concat(str));
        this.d = xsnVar2;
        xsn xsnVar3 = new xsn("inBorderLightBottomIntensity".concat(str));
        this.e = xsnVar3;
        xsk xskVar3 = new xsk("inBorderLightStrokeWidth".concat(str));
        this.f = xskVar3;
        xsi xsiVar = new xsi("inBorderLightColor".concat(str));
        this.g = xsiVar;
        xsk xskVar4 = new xsk("inBorderLightDistortionAmplitude".concat(str));
        this.h = xskVar4;
        xsn xsnVar4 = new xsn("inBorderLightDistortionFrequency".concat(str));
        this.i = xsnVar4;
        xsn xsnVar5 = new xsn("inBorderLightDistortionSpeed".concat(str));
        this.j = xsnVar5;
        this.k = woy.bi(xskVar, xskVar2, xsnVar2, xsnVar3, xskVar3, xsiVar, xsnVar5, xskVar4, xsnVar4, xsnVar);
    }
}
