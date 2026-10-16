package com.bytedance.sdk.component.ivm.uef;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class moa {
    public static final moa uef = new moa();

    private void oa(uef uefVar, Context context) {
        yo.uef(context, "context == null");
        yo.uef(uefVar, "AdLogConfig == null");
        yo.uef(uefVar.moa(), "AdLogDepend ==null");
    }

    public void uef(uef uefVar, Context context) {
        oa(uefVar, context);
        xs.ivm().uef(context);
        xs.ivm().uef(uefVar.zjm());
        xs.ivm().oa(uefVar.xs());
        xs.ivm().yo(uefVar.bcc());
        xs.ivm().uef(uefVar.oa());
        xs.ivm().moa(uefVar.cz());
        xs.ivm().lw(uefVar.ivm());
        xs.ivm().uef(uefVar.uef() == null ? com.bytedance.sdk.component.ivm.uef.uef.uef.lw.uef : uefVar.uef());
        xs.ivm().uef(uefVar.moa());
        xs.ivm().uef(uefVar.yo());
        xs.ivm().uef(uefVar.lw());
        com.bytedance.sdk.component.ivm.uef.oa.oa.yo.uef(uefVar.wrv());
        com.bytedance.sdk.component.ivm.uef.oa.oa.yo.oa(uefVar.dj());
        uef(uefVar);
    }

    public void oa() {
        lw lwVarWk = xs.ivm().wk();
        if (lwVarWk == null || xs.ivm().lw() == null || lwVarWk.moa() == null) {
            return;
        }
        xs.ivm().zjm();
    }

    private void oa(com.bytedance.sdk.component.ivm.uef.moa.uef uefVar) {
        lw lwVarWk = xs.ivm().wk();
        if (uefVar == null || lwVarWk == null || xs.ivm().lw() == null || lwVarWk.moa() == null) {
            return;
        }
        xs.ivm().uef(uefVar);
    }

    private void uef(uef uefVar) {
        Executor executorLw;
        if (Looper.myLooper() != Looper.getMainLooper() && com.bytedance.sdk.component.ivm.uef.yo.uef.oa()) {
            com.bytedance.sdk.component.ivm.uef.yo.uef.uef();
            return;
        }
        lw lwVarMoa = uefVar.moa();
        if (lwVarMoa == null || !com.bytedance.sdk.component.ivm.uef.yo.uef.oa() || (executorLw = lwVarMoa.lw()) == null) {
            return;
        }
        executorLw.execute(new Runnable() { // from class: com.bytedance.sdk.component.ivm.uef.moa.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.ivm.uef.yo.uef.uef();
            }
        });
    }

    public void uef(boolean z2) {
        xs.ivm().uef(z2);
    }

    public void uef() {
        lw lwVarWk = xs.ivm().wk();
        if (lwVarWk == null || xs.ivm().lw() == null || lwVarWk.moa() == null) {
            return;
        }
        xs.ivm().bcc();
    }

    public void uef(com.bytedance.sdk.component.ivm.uef.moa.uef uefVar) {
        oa(uefVar);
    }

    public void uef(String str, List<String> list, boolean z2, Map<String, String> map, int i5, String str2) {
        lw lwVarWk = xs.ivm().wk();
        if (lwVarWk == null || xs.ivm().lw() == null || lwVarWk.moa() == null || !lwVarWk.bcc()) {
            return;
        }
        if (lwVarWk.ivm() == 1) {
            if (list == null || list.isEmpty()) {
                return;
            }
        } else if (lwVarWk.ivm() == 0 && (TextUtils.isEmpty(str) || list == null || list.isEmpty())) {
            return;
        }
        xs.ivm().uef(str, list, z2, map, i5, str2);
    }

    public void uef(String str, boolean z2) {
        lw lwVarWk = xs.ivm().wk();
        if (lwVarWk == null || xs.ivm().lw() == null || lwVarWk.moa() == null || !lwVarWk.bcc()) {
            return;
        }
        if (lwVarWk.ivm() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        xs.ivm().uef(str, z2);
    }
}
