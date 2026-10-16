package com.bytedance.sdk.component.adexpress.dynamic.animation.uef;

import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.oyt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class oa implements oyt {
    List<moa> uef = new ArrayList();

    public oa(View view, List<com.bytedance.sdk.component.adexpress.dynamic.moa.uef> list) {
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.moa.uef> it = list.iterator();
        while (it.hasNext()) {
            moa moaVarUef = yo.uef().uef(view, it.next());
            if (moaVarUef != null) {
                this.uef.add(moaVarUef);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.oyt
    public void oa() {
        Iterator<moa> it = this.uef.iterator();
        while (it.hasNext()) {
            try {
                it.next().oa();
            } catch (Exception unused) {
            }
        }
    }

    public void uef() {
        Iterator<moa> it = this.uef.iterator();
        while (it.hasNext()) {
            try {
                it.next().yo();
            } catch (Exception unused) {
            }
        }
    }
}
