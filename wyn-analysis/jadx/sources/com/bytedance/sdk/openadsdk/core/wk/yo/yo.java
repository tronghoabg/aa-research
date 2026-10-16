package com.bytedance.sdk.openadsdk.core.wk.yo;

import com.bytedance.sdk.component.utils.xs;
import java.io.File;
import java.util.List;

/* loaded from: classes3.dex */
public class yo extends com.bytedance.sdk.openadsdk.oa.oa {
    public yo(int i5, int i10) {
        super(i5, i10);
    }

    @Override // com.bytedance.sdk.openadsdk.oa.oa, com.bytedance.sdk.openadsdk.oa.uef
    public void uef(List<File> list) {
        int size = list.size();
        if (uef(0L, size)) {
            return;
        }
        for (File file : list) {
            xs.yo(file);
            size--;
            if (uef(file, 0L, size)) {
                return;
            }
        }
    }

    public yo(int i5, int i10, boolean z2) {
        super(i5, i10);
        this.uef = z2;
    }
}
