package com.bytedance.sdk.openadsdk.moa;

import com.bytedance.sdk.openadsdk.moa.yo.uef;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class oa {
    public static final String uef = uef.InterfaceC0128uef.uef;

    /* renamed from: oa, reason: collision with root package name */
    public static final String f25969oa = uef.InterfaceC0128uef.f26043oa;
    public static final String yo = uef.InterfaceC0128uef.yo;
    public static final String moa = uef.InterfaceC0128uef.moa;
    public static final String lw = uef.InterfaceC0128uef.lw;
    public static final String ivm = uef.InterfaceC0128uef.ivm;
    public static final Set<String> xs = new HashSet(Arrays.asList("click", "show", "insight_log"));

    /* renamed from: com.bytedance.sdk.openadsdk.moa.oa$oa, reason: collision with other inner class name */
    public static class C0124oa {

        /* renamed from: oa, reason: collision with root package name */
        public static int f25970oa = 2;
        public static int uef = 1;
        public static int yo = 100;
    }

    public static class uef {
        public static String moa = "saLandingPageLinks";

        /* renamed from: oa, reason: collision with root package name */
        public static String f25971oa = "openAdLandPageLinks";
        public static String uef = "openDetailPage";
        public static String yo = "direct";
    }

    public static boolean uef(String str) {
        return "embeded_ad".equals(str) || "banner_ad".equals(str) || "interaction".equals(str) || "slide_banner_ad".equals(str);
    }
}
