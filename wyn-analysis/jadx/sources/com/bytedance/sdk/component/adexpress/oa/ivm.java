package com.bytedance.sdk.component.adexpress.oa;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.oa.zjm;

/* loaded from: classes.dex */
public class ivm implements zjm {

    /* renamed from: oa, reason: collision with root package name */
    private uef f24937oa;
    private Context uef;
    private cq yo;

    public ivm(Context context, cq cqVar, uef uefVar) {
        this.uef = context;
        this.f24937oa = uefVar;
        this.yo = cqVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.zjm
    public void uef() {
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.zjm
    public boolean uef(final zjm.uef uefVar) {
        this.yo.lw().xs(0);
        this.f24937oa.uef(new xs() { // from class: com.bytedance.sdk.component.adexpress.oa.ivm.1
            @Override // com.bytedance.sdk.component.adexpress.oa.xs
            public void uef(View view, dz dzVar) {
                if (uefVar.yo()) {
                    return;
                }
                wk wkVarOa = uefVar.oa();
                if (wkVarOa != null) {
                    wkVarOa.uef(ivm.this.f24937oa, dzVar);
                }
                uefVar.uef(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.oa.xs
            public void uef(int i5, String str) {
                wk wkVarOa = uefVar.oa();
                if (wkVarOa != null) {
                    wkVarOa.a_(i5);
                }
            }
        });
        return true;
    }

    public void uef(yo yoVar) {
        this.f24937oa.uef(yoVar);
    }
}
