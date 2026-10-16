package com.bytedance.sdk.openadsdk.gsd.uef;

import com.bytedance.sdk.openadsdk.core.model.gzw;

/* loaded from: classes3.dex */
public class yo {

    /* renamed from: oa, reason: collision with root package name */
    public static int f25919oa = 6;
    public static boolean uef = false;
    public static String yo = "engaged_view";

    public static void oa(gzw gzwVar) {
        oa oaVarYo = yo(gzwVar);
        if (oaVarYo == null) {
            return;
        }
        oaVarYo.oa();
    }

    public static void uef(gzw gzwVar) {
        oa oaVarYo = yo(gzwVar);
        if (oaVarYo == null) {
            return;
        }
        oaVarYo.uef();
    }

    private static oa yo(gzw gzwVar) {
        if (gzwVar == null || !gzwVar.zg()) {
            return null;
        }
        return gzwVar.sa();
    }

    public static void uef(gzw gzwVar, int i5) {
        oa oaVarYo = yo(gzwVar);
        if (oaVarYo == null || oaVarYo.yo()) {
            return;
        }
        oaVarYo.uef(i5);
    }

    public static void uef(gzw gzwVar, boolean z2) {
        oa oaVarYo = yo(gzwVar);
        if (oaVarYo == null || oaVarYo.yo()) {
            return;
        }
        oaVarYo.uef(z2);
        oaVarYo.uef(z2 ? 4 : 8);
    }
}
