package com.bytedance.sdk.component.adexpress.oa;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.oa.zjm;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;

/* loaded from: classes.dex */
public class oa implements zjm {
    private int ivm;
    private cq lw;
    private bcc moa;

    /* renamed from: oa, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.uef.uef f24939oa;
    private Context uef;
    private ThemeStatusBroadcastReceiver yo;

    public oa(Context context, cq cqVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z2, com.bytedance.sdk.component.adexpress.dynamic.lw.bcc bccVar, bcc bccVar2, com.bytedance.sdk.component.adexpress.dynamic.ivm.uef uefVar, com.bytedance.sdk.component.adexpress.dynamic.uef.uef uefVar2) {
        this.uef = context;
        this.lw = cqVar;
        this.yo = themeStatusBroadcastReceiver;
        this.moa = bccVar2;
        if (uefVar2 != null) {
            this.f24939oa = uefVar2;
        } else {
            this.f24939oa = new com.bytedance.sdk.component.adexpress.dynamic.uef.uef(context, themeStatusBroadcastReceiver, z2, bccVar, cqVar, uefVar);
        }
        this.f24939oa.uef(this.moa);
        if (bccVar instanceof com.bytedance.sdk.component.adexpress.dynamic.lw.xs) {
            this.ivm = 3;
        } else {
            this.ivm = 2;
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.moa oa() {
        com.bytedance.sdk.component.adexpress.dynamic.uef.uef uefVar = this.f24939oa;
        if (uefVar != null) {
            return uefVar.moa();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.zjm
    public boolean uef(final zjm.uef uefVar) {
        this.lw.lw().uef(this.ivm);
        this.f24939oa.uef(new xs() { // from class: com.bytedance.sdk.component.adexpress.oa.oa.1
            @Override // com.bytedance.sdk.component.adexpress.oa.xs
            public void uef(View view, dz dzVar) {
                if (uefVar.yo()) {
                    return;
                }
                oa.this.lw.lw().lw(oa.this.ivm);
                oa.this.lw.lw().ivm(oa.this.ivm);
                oa.this.lw.lw().cz();
                wk wkVarOa = uefVar.oa();
                if (wkVarOa == null) {
                    return;
                }
                wkVarOa.uef(oa.this.f24939oa, dzVar);
                uefVar.uef(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.oa.xs
            public void uef(int i5, String str) {
                oa.this.lw.lw().uef(oa.this.ivm, i5, str, uefVar.oa(oa.this));
                if (uefVar.oa(oa.this)) {
                    uefVar.uef(oa.this);
                    return;
                }
                wk wkVarOa = uefVar.oa();
                if (wkVarOa == null) {
                    return;
                }
                wkVarOa.a_(i5);
            }
        });
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.zjm
    public void uef() {
        com.bytedance.sdk.component.adexpress.dynamic.uef.uef uefVar = this.f24939oa;
        if (uefVar != null) {
            uefVar.oa();
        }
    }
}
