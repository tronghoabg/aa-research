package com.pgl.ssdk.ces.out;

import com.pgl.ssdk.av;
import com.pgl.ssdk.ces.a;

/* loaded from: classes4.dex */
public class PglSupport {

    /* renamed from: a, reason: collision with root package name */
    private static String f32587a;

    static {
        av.b("nms");
    }

    public static String getBootid() {
        String str;
        String str2 = f32587a;
        if (str2 != null) {
            return str2;
        }
        try {
            if (!av.a("nms") || (str = (String) a.meta(172, null, null)) == null) {
                return "";
            }
            f32587a = str;
            return str;
        } catch (Throwable unused) {
            return "";
        }
    }
}
