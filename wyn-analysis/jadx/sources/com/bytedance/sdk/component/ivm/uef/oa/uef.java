package com.bytedance.sdk.component.ivm.uef.oa;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.ivm.uef.uef.lw;
import com.bytedance.sdk.component.ivm.uef.xs;

/* loaded from: classes.dex */
public class uef {
    public static boolean ivm() {
        lw lwVarYo = xs.ivm().yo();
        return (lwVarYo == null || TextUtils.isEmpty(lwVarYo.ivm())) ? false : true;
    }

    public static boolean lw() {
        lw lwVarYo = xs.ivm().yo();
        return (lwVarYo == null || TextUtils.isEmpty(lwVarYo.yo())) ? false : true;
    }

    public static boolean moa() {
        lw lwVarYo = xs.ivm().yo();
        return (lwVarYo == null || TextUtils.isEmpty(lwVarYo.lw())) ? false : true;
    }

    private static long oa(int i5, Context context) {
        if (context == null) {
            return i5;
        }
        Runtime runtime = Runtime.getRuntime();
        long jFreeMemory = runtime.freeMemory() / 1048576;
        long jMaxMemory = (runtime.maxMemory() / 1048576) - (runtime.totalMemory() / 1048576);
        if (jMaxMemory <= 0) {
            if (jFreeMemory <= 2) {
                return 1L;
            }
            return jFreeMemory <= 10 ? Math.min(i5, 10) : Math.min((jFreeMemory / 2) * 10, i5);
        }
        long j8 = ((jFreeMemory + jMaxMemory) - 10) / 2;
        if (j8 <= 2) {
            return 1L;
        }
        return j8 <= 10 ? Math.min(i5, 10) : Math.min(j8 * 10, i5);
    }

    public static long uef(int i5, Context context) {
        return oa(i5, context);
    }

    public static boolean yo() {
        lw lwVarYo = xs.ivm().yo();
        return (lwVarYo == null || TextUtils.isEmpty(lwVarYo.moa())) ? false : true;
    }

    public static boolean uef() {
        lw lwVarYo = xs.ivm().yo();
        return (lwVarYo == null || TextUtils.isEmpty(lwVarYo.uef())) ? false : true;
    }

    public static boolean oa() {
        lw lwVarYo = xs.ivm().yo();
        return (lwVarYo == null || TextUtils.isEmpty(lwVarYo.oa())) ? false : true;
    }
}
