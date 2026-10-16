package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.utils.km;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class yo extends com.bytedance.sdk.component.bcc.oa.yo {
    private final List<? extends com.bytedance.sdk.component.bcc.oa.yo> uef;

    public yo(String str, List<? extends com.bytedance.sdk.component.bcc.oa.yo> list) {
        super(str);
        this.uef = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<? extends com.bytedance.sdk.component.bcc.oa.yo> list;
        if (com.bytedance.sdk.component.utils.sy.yo(com.bytedance.sdk.openadsdk.core.sy.uef()) != 0 && (list = this.uef) != null) {
            Iterator<? extends com.bytedance.sdk.component.bcc.oa.yo> it = list.iterator();
            while (it.hasNext()) {
                km.uef(it.next(), 1);
                it.remove();
            }
        }
        try {
            com.bytedance.sdk.component.utils.cz.uef().removeCallbacks(this);
        } catch (Exception unused) {
        }
    }
}
