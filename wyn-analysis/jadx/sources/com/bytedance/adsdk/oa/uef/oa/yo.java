package com.bytedance.adsdk.oa.uef.oa;

import android.graphics.Color;
import android.graphics.Paint;
import com.bytedance.adsdk.oa.uef.oa.uef;

/* loaded from: classes.dex */
public class yo implements uef.InterfaceC0035uef {
    private final uef<Float, Float> ivm;
    private final uef<Float, Float> lw;
    private final uef<Float, Float> moa;

    /* renamed from: oa, reason: collision with root package name */
    private final uef<Integer, Integer> f24581oa;
    private final uef.InterfaceC0035uef uef;
    private boolean xs = true;
    private final uef<Float, Float> yo;

    public yo(uef.InterfaceC0035uef interfaceC0035uef, com.bytedance.adsdk.oa.yo.yo.uef uefVar, com.bytedance.adsdk.oa.lw.zjm zjmVar) {
        this.uef = interfaceC0035uef;
        uef<Integer, Integer> uefVarUef = zjmVar.uef().uef();
        this.f24581oa = uefVarUef;
        uefVarUef.uef(this);
        uefVar.uef(uefVarUef);
        uef<Float, Float> uefVarUef2 = zjmVar.oa().uef();
        this.yo = uefVarUef2;
        uefVarUef2.uef(this);
        uefVar.uef(uefVarUef2);
        uef<Float, Float> uefVarUef3 = zjmVar.yo().uef();
        this.moa = uefVarUef3;
        uefVarUef3.uef(this);
        uefVar.uef(uefVarUef3);
        uef<Float, Float> uefVarUef4 = zjmVar.moa().uef();
        this.lw = uefVarUef4;
        uefVarUef4.uef(this);
        uefVar.uef(uefVarUef4);
        uef<Float, Float> uefVarUef5 = zjmVar.lw().uef();
        this.ivm = uefVarUef5;
        uefVarUef5.uef(this);
        uefVar.uef(uefVarUef5);
    }

    @Override // com.bytedance.adsdk.oa.uef.oa.uef.InterfaceC0035uef
    public void uef() {
        this.xs = true;
        this.uef.uef();
    }

    public void uef(Paint paint) {
        if (this.xs) {
            this.xs = false;
            double dFloatValue = this.moa.xs().floatValue() * 0.017453292519943295d;
            float fFloatValue = this.lw.xs().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.f24581oa.xs().intValue();
            paint.setShadowLayer(this.ivm.xs().floatValue(), fSin, fCos, Color.argb(Math.round(this.yo.xs().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }
}
