package com.bytedance.adsdk.ugeno.lw;

import android.view.View;
import com.google.android.gms.common.api.f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class yo {

    /* renamed from: ab, reason: collision with root package name */
    int f24733ab;
    int bcc;
    boolean bs;
    int cq;
    int cz;
    float dj;
    int ivm;
    int lw;
    boolean sy;
    int wk;
    int wrv;
    int xs;
    float zjm;
    int uef = f.API_PRIORITY_OTHER;

    /* renamed from: oa, reason: collision with root package name */
    int f24734oa = f.API_PRIORITY_OTHER;
    int yo = Integer.MIN_VALUE;
    int moa = Integer.MIN_VALUE;
    List<Integer> dz = new ArrayList();

    public int oa() {
        return this.bcc - this.cz;
    }

    public int uef() {
        return this.xs;
    }

    public void uef(View view, int i5, int i10, int i11, int i12) {
        oa oaVar = (oa) view.getLayoutParams();
        this.uef = Math.min(this.uef, (view.getLeft() - oaVar.cq()) - i5);
        this.f24734oa = Math.min(this.f24734oa, (view.getTop() - oaVar.dz()) - i10);
        this.yo = Math.max(this.yo, oaVar.wk() + view.getRight() + i11);
        this.moa = Math.max(this.moa, oaVar.ab() + view.getBottom() + i12);
    }
}
