package com.bytedance.sdk.component.utils;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class gzw {
    private static oa uef;

    public interface oa {
        void uef(String str, boolean z2, uef uefVar);
    }

    public static abstract class uef {
        public final String oa() {
            try {
                return uef().toString();
            } catch (Exception unused) {
                return "";
            }
        }

        public abstract JSONObject uef();
    }

    public static void uef(oa oaVar) {
        uef = oaVar;
    }

    public static void uef(String str, uef uefVar) {
        oa oaVar = uef;
        if (oaVar == null) {
            return;
        }
        oaVar.uef(str, false, uefVar);
    }
}
