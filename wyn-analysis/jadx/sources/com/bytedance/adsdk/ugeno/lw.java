package com.bytedance.adsdk.ugeno;

import android.content.Context;
import com.bytedance.adsdk.ugeno.moa.bcc;
import com.bytedance.adsdk.ugeno.moa.zjm;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class lw {
    private static volatile lw uef;
    private com.bytedance.adsdk.ugeno.core.oa.moa ivm;
    private com.bytedance.adsdk.ugeno.yo.uef lw;
    private uef moa;

    /* renamed from: oa, reason: collision with root package name */
    private List<com.bytedance.adsdk.ugeno.core.oa> f24724oa;
    private com.bytedance.adsdk.ugeno.core.uef.uef xs;
    private com.bytedance.adsdk.ugeno.core.yo yo;

    private lw() {
    }

    private void ivm() {
        ArrayList arrayList = new ArrayList();
        this.f24724oa = arrayList;
        com.bytedance.adsdk.ugeno.core.yo yoVar = this.yo;
        if (yoVar != null) {
            arrayList.addAll(yoVar.uef());
        }
        com.bytedance.adsdk.ugeno.core.moa.uef(this.f24724oa);
    }

    public static lw uef() {
        if (uef == null) {
            synchronized (lw.class) {
                try {
                    if (uef == null) {
                        uef = new lw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }

    public com.bytedance.adsdk.ugeno.core.uef.uef lw() {
        return this.xs;
    }

    public com.bytedance.adsdk.ugeno.core.oa.moa moa() {
        return this.ivm;
    }

    public uef oa() {
        return this.moa;
    }

    public com.bytedance.adsdk.ugeno.yo.uef yo() {
        return this.lw;
    }

    public void uef(Context context, com.bytedance.adsdk.ugeno.core.yo yoVar, uef uefVar) {
        this.yo = yoVar;
        this.moa = uefVar;
        ivm();
    }

    public void uef(com.bytedance.adsdk.ugeno.yo.uef uefVar) {
        this.lw = uefVar;
    }

    public void uef(bcc bccVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.moa.uef().uef());
        if (bccVar != null) {
            arrayList.addAll(bccVar.uef());
        }
        zjm.uef(arrayList);
    }

    public void uef(com.bytedance.adsdk.ugeno.moa.yo yoVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.moa.lw().uef());
        if (yoVar != null) {
            arrayList.addAll(yoVar.uef());
        }
        com.bytedance.adsdk.ugeno.moa.moa.uef(arrayList);
    }
}
