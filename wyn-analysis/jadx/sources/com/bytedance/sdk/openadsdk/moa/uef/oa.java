package com.bytedance.sdk.openadsdk.moa.uef;

import android.content.Context;
import com.bytedance.sdk.component.ivm.uef.uef;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.core.cq;
import com.bytedance.sdk.openadsdk.core.sy;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class oa {
    public static AtomicInteger uef = new AtomicInteger(0);

    /* renamed from: oa, reason: collision with root package name */
    public static final AtomicBoolean f25998oa = new AtomicBoolean(false);

    public static void oa() {
        com.bytedance.sdk.component.ivm.uef.oa.yo();
    }

    public static void uef(Context context) {
        try {
            if (f25998oa.compareAndSet(false, true)) {
                com.bytedance.sdk.component.ivm.uef.oa.uef(new uef.C0060uef().uef(new ivm()).oa(com.bytedance.sdk.component.ivm.uef.moa.oa.uef.yo()).yo(com.bytedance.sdk.component.ivm.uef.moa.oa.uef.lw()).uef(com.bytedance.sdk.component.ivm.uef.moa.oa.uef.moa()).uef(new xs()).uef(moa.uef).oa(sy.moa().dz()).uef(sy.moa().wk()).uef(sy.moa().ne()).uef(), context);
                oa();
            }
        } catch (Throwable unused) {
            f25998oa.set(false);
        }
    }

    public static void yo() {
        try {
            com.bytedance.sdk.component.ivm.uef.oa.moa();
            com.bytedance.sdk.component.ivm.uef.oa.lw();
        } catch (Throwable th) {
            dhk.yo("AdLogSwitchUtils", th.getMessage());
        }
    }

    public static void uef(com.bytedance.sdk.openadsdk.moa.uef uefVar) {
        com.bytedance.sdk.component.ivm.uef.moa.uef.uef uefVar2 = new com.bytedance.sdk.component.ivm.uef.moa.uef.uef(uefVar.lw(), uefVar);
        uefVar2.yo(uefVar.ivm() ? (byte) 1 : (byte) 2);
        uefVar2.oa((byte) 0);
        if (com.bytedance.sdk.component.ivm.uef.oa.oa()) {
            uef(sy.uef());
        }
        com.bytedance.sdk.component.ivm.uef.oa.uef(uefVar2);
    }

    public static com.bytedance.sdk.openadsdk.ab.oa.yo uef() {
        return bcc.uef;
    }

    public static void uef(final List<String> list, final int i5, final String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.moa.yo.uef(new com.bytedance.sdk.component.bcc.oa.yo("track") { // from class: com.bytedance.sdk.openadsdk.moa.uef.oa.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.ivm.uef.oa.oa()) {
                    oa.uef(sy.uef());
                }
                com.bytedance.sdk.component.ivm.uef.oa.uef(cq.uef(sy.uef()), list, true, i5, str);
            }
        });
    }

    public static void uef(String str) {
        uef(str, false);
    }

    public static void uef(String str, boolean z2) {
        if (com.bytedance.sdk.component.ivm.uef.oa.oa()) {
            uef(sy.uef());
        }
        com.bytedance.sdk.component.ivm.uef.oa.uef(str, z2);
    }
}
