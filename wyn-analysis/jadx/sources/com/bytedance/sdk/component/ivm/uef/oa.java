package com.bytedance.sdk.component.ivm.uef;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class oa {
    private static volatile List<Object> uef = new ArrayList();

    public static void lw() {
        moa moaVar = moa.uef;
    }

    public static void moa() {
        moa.uef.oa();
    }

    public static boolean oa() {
        return xs.ivm().wk() == null || xs.ivm().lw() == null;
    }

    public static void uef(uef uefVar, Context context) {
        moa.uef.uef(uefVar, context);
    }

    public static void yo() {
        uef(false);
        moa.uef.uef();
    }

    public static void uef(boolean z2) {
        moa.uef.uef(z2);
    }

    public static List<Object> uef() {
        return uef;
    }

    public static void uef(String str, boolean z2) {
        moa.uef.uef(str, z2);
    }

    public static void uef(String str, List<String> list, boolean z2, int i5, String str2) {
        uef(str, list, z2, null, i5, str2);
    }

    public static void uef(String str, List<String> list, boolean z2, Map<String, String> map, int i5, String str2) {
        moa.uef.uef(str, list, z2, map, i5, str2);
    }

    public static void uef(com.bytedance.sdk.component.ivm.uef.moa.uef uefVar) {
        moa.uef.uef(uefVar);
    }
}
