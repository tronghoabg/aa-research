package com.bytedance.adsdk.ugeno.moa.uef;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class oa implements yo {
    private List<moa> uef = new CopyOnWriteArrayList();

    @Override // com.bytedance.adsdk.ugeno.moa.uef.yo
    public void uef(moa moaVar) {
        this.uef.add(moaVar);
    }

    @Override // com.bytedance.adsdk.ugeno.moa.uef.yo
    public void uef(String str) {
        if (this.uef.isEmpty()) {
            return;
        }
        Iterator<moa> it = this.uef.iterator();
        while (it.hasNext()) {
            it.next().uef(str);
        }
    }
}
