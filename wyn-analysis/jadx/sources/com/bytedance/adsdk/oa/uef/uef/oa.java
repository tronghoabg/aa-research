package com.bytedance.adsdk.oa.uef.uef;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class oa {
    private final List<tpx> uef = new ArrayList();

    public void uef(tpx tpxVar) {
        this.uef.add(tpxVar);
    }

    public void uef(Path path) {
        for (int size = this.uef.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.oa.ivm.ivm.uef(path, this.uef.get(size));
        }
    }
}
