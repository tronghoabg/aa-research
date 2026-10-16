package com.bytedance.adsdk.oa.uef.uef;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.oa.uef.oa.uef;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class ab implements uef.InterfaceC0035uef, cq, dj, lw, zjm {
    private final com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> bcc;
    private final com.bytedance.adsdk.oa.uef.oa.ab cz;
    private final boolean ivm;
    private final String lw;
    private final com.bytedance.adsdk.oa.yo.yo.uef moa;
    private final com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> xs;
    private final com.bytedance.adsdk.oa.cz yo;
    private moa zjm;
    private final Matrix uef = new Matrix();

    /* renamed from: oa, reason: collision with root package name */
    private final Path f24582oa = new Path();

    public ab(com.bytedance.adsdk.oa.cz czVar, com.bytedance.adsdk.oa.yo.yo.uef uefVar, com.bytedance.adsdk.oa.yo.oa.wrv wrvVar) {
        this.yo = czVar;
        this.moa = uefVar;
        this.lw = wrvVar.uef();
        this.ivm = wrvVar.lw();
        com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> uefVarUef = wrvVar.oa().uef();
        this.xs = uefVarUef;
        uefVar.uef(uefVarUef);
        uefVarUef.uef(this);
        com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> uefVarUef2 = wrvVar.yo().uef();
        this.bcc = uefVarUef2;
        uefVar.uef(uefVarUef2);
        uefVarUef2.uef(this);
        com.bytedance.adsdk.oa.uef.oa.ab abVarZjm = wrvVar.moa().zjm();
        this.cz = abVarZjm;
        abVarZjm.uef(uefVar);
        abVarZjm.uef(this);
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.cq
    public Path moa() {
        Path pathMoa = this.zjm.moa();
        this.f24582oa.reset();
        float fFloatValue = this.xs.xs().floatValue();
        float fFloatValue2 = this.bcc.xs().floatValue();
        for (int i5 = ((int) fFloatValue) - 1; i5 >= 0; i5--) {
            this.uef.set(this.cz.oa(i5 + fFloatValue2));
            this.f24582oa.addPath(pathMoa, this.uef);
        }
        return this.f24582oa;
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.zjm
    public void uef(ListIterator<yo> listIterator) {
        if (this.zjm != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.zjm = new moa(this.yo, this.moa, "Repeater", this.ivm, arrayList, null);
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.yo
    public void uef(List<yo> list, List<yo> list2) {
        this.zjm.uef(list, list2);
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.lw
    public void uef(Canvas canvas, Matrix matrix, int i5) {
        float fFloatValue = this.xs.xs().floatValue();
        float fFloatValue2 = this.bcc.xs().floatValue();
        float fFloatValue3 = this.cz.oa().xs().floatValue() / 100.0f;
        float fFloatValue4 = this.cz.yo().xs().floatValue() / 100.0f;
        for (int i10 = ((int) fFloatValue) - 1; i10 >= 0; i10--) {
            this.uef.set(matrix);
            float f10 = i10;
            this.uef.preConcat(this.cz.oa(f10 + fFloatValue2));
            this.zjm.uef(canvas, this.uef, (int) (com.bytedance.adsdk.oa.ivm.lw.uef(fFloatValue3, fFloatValue4, f10 / fFloatValue) * i5));
        }
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.lw
    public void uef(RectF rectF, Matrix matrix, boolean z2) {
        this.zjm.uef(rectF, matrix, z2);
    }

    @Override // com.bytedance.adsdk.oa.uef.oa.uef.InterfaceC0035uef
    public void uef() {
        this.yo.invalidateSelf();
    }
}
