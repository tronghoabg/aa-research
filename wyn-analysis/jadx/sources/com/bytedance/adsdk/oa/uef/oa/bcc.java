package com.bytedance.adsdk.oa.uef.oa;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class bcc {

    /* renamed from: oa, reason: collision with root package name */
    private final List<uef<Integer, Integer>> f24577oa;
    private final List<uef<com.bytedance.adsdk.oa.yo.oa.dz, Path>> uef;
    private final List<com.bytedance.adsdk.oa.yo.oa.bcc> yo;

    public bcc(List<com.bytedance.adsdk.oa.yo.oa.bcc> list) {
        this.yo = list;
        this.uef = new ArrayList(list.size());
        this.f24577oa = new ArrayList(list.size());
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.uef.add(list.get(i5).oa().uef());
            this.f24577oa.add(list.get(i5).yo().uef());
        }
    }

    public List<uef<com.bytedance.adsdk.oa.yo.oa.dz, Path>> oa() {
        return this.uef;
    }

    public List<com.bytedance.adsdk.oa.yo.oa.bcc> uef() {
        return this.yo;
    }

    public List<uef<Integer, Integer>> yo() {
        return this.f24577oa;
    }
}
