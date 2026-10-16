package com.bytedance.adsdk.ugeno.uef;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ivm {
    private com.bytedance.adsdk.ugeno.oa.yo moa;

    /* renamed from: oa, reason: collision with root package name */
    private List<uef> f24764oa;
    private List<yo> uef;
    private Context yo;

    public ivm(Context context, com.bytedance.adsdk.ugeno.oa.yo yoVar, List<yo> list) {
        this.moa = yoVar;
        this.yo = context;
        this.uef = list;
        moa();
    }

    private void moa() {
        this.f24764oa = new ArrayList();
        List<yo> list = this.uef;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i5 = 0; i5 < this.uef.size(); i5++) {
            yo yoVar = this.uef.get(i5);
            if (yoVar != null) {
                this.f24764oa.add(new uef(this.yo, this.moa, yoVar));
            }
        }
    }

    public void oa() {
        List<uef> list = this.f24764oa;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (uef uefVar : this.f24764oa) {
            if (uefVar != null) {
                uefVar.uef();
            }
        }
    }

    public void uef() {
        List<uef> list = this.f24764oa;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (uef uefVar : this.f24764oa) {
            if (uefVar != null) {
                uefVar.moa();
            }
        }
    }

    public void yo() {
        List<uef> list = this.f24764oa;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (uef uefVar : this.f24764oa) {
            if (uefVar != null) {
                uefVar.yo();
            }
        }
    }

    public void oa(Canvas canvas) {
        List<uef> list = this.f24764oa;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (uef uefVar : this.f24764oa) {
            if (uefVar != null) {
                uefVar.oa(canvas);
            }
        }
    }

    public void uef(Canvas canvas) {
        List<uef> list = this.f24764oa;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (uef uefVar : this.f24764oa) {
            if (uefVar != null) {
                uefVar.uef(canvas);
            }
        }
    }

    public void uef(int i5, int i10) {
        List<uef> list = this.f24764oa;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (uef uefVar : this.f24764oa) {
            if (uefVar != null) {
                uefVar.uef(i5, i10);
            }
        }
    }

    public uef uef(String str) {
        List<uef> list = this.f24764oa;
        if (list != null && !list.isEmpty()) {
            for (uef uefVar : this.f24764oa) {
                if (uefVar != null && TextUtils.equals(uefVar.lw(), str)) {
                    return uefVar;
                }
            }
        }
        return null;
    }
}
