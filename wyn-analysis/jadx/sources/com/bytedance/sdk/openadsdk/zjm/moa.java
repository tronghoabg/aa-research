package com.bytedance.sdk.openadsdk.zjm;

import android.content.Context;
import com.bytedance.sdk.component.lw.dhk;
import com.bytedance.sdk.component.lw.oa.yo.lw;
import com.bytedance.sdk.component.lw.tpx;
import com.bytedance.sdk.component.lw.wk;
import com.bytedance.sdk.component.oa.uef.dj;
import com.bytedance.sdk.component.oa.uef.dz;
import com.bytedance.sdk.component.oa.uef.ivm;
import com.bytedance.sdk.component.oa.uef.wrv;
import com.bytedance.sdk.component.utils.zjm;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.km;
import com.bytedance.sdk.openadsdk.utils.oyt;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public class moa {

    public static final class uef {

        /* renamed from: oa, reason: collision with root package name */
        private static final wk f26208oa = uef(sy.uef());
        private static int yo = 10;
        private static int moa = 15;
        private static int lw = 30;
        public static boolean uef = false;

        /* renamed from: com.bytedance.sdk.openadsdk.zjm.moa$uef$uef, reason: collision with other inner class name */
        public static class C0139uef implements com.bytedance.sdk.component.lw.moa {
            private C0139uef() {
            }

            @Override // com.bytedance.sdk.component.lw.moa
            /* renamed from: oa, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.component.lw.uef.yo uef(com.bytedance.sdk.component.lw.lw lwVar) throws IOException {
                dj djVarBcc = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().bcc();
                wrv wrvVarOa = new wrv.uef().oa(lwVar.uef()).uef().oa();
                dz dzVarOa = null;
                com.bytedance.sdk.component.lw.uef.moa moaVar = lwVar.yo() ? new com.bytedance.sdk.component.lw.uef.moa() : null;
                if (moaVar != null) {
                    moaVar.uef(System.currentTimeMillis());
                }
                try {
                    dzVarOa = djVarBcc.uef(wrvVarOa).oa();
                    if (moaVar != null) {
                        moaVar.oa(System.currentTimeMillis());
                    }
                    return new com.bytedance.sdk.component.lw.uef.yo(dzVarOa.yo(), dzVarOa.ivm().moa(), "", uef(lwVar, dzVarOa));
                } catch (Throwable th) {
                    try {
                        return uef(moaVar, th);
                    } finally {
                        zjm.uef(dzVarOa);
                    }
                }
            }

            private Map<String, String> uef(com.bytedance.sdk.component.lw.lw lwVar, dz dzVar) {
                if (!lwVar.oa()) {
                    return null;
                }
                ivm ivmVarXs = dzVar.xs();
                HashMap map = new HashMap();
                int iUef = ivmVarXs.uef();
                for (int i5 = 0; i5 < iUef; i5++) {
                    String strUef = ivmVarXs.uef(i5);
                    String strOa = ivmVarXs.oa(i5);
                    if (strUef != null) {
                        map.put(strUef, strOa);
                    }
                }
                return map;
            }

            private com.bytedance.sdk.component.lw.uef.yo uef(com.bytedance.sdk.component.lw.uef.moa moaVar, Throwable th) {
                th.getMessage();
                if (moaVar != null) {
                    moaVar.yo(System.currentTimeMillis());
                }
                com.bytedance.sdk.component.lw.uef.yo yoVar = new com.bytedance.sdk.component.lw.uef.yo(98765, th, "net failed");
                yoVar.uef(moaVar);
                return yoVar;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.bytedance.sdk.component.lw.zjm oa(String str) {
            return uef(f26208oa.uef(str).lw(af.lw(sy.uef())).moa(af.yo(sy.uef())));
        }

        public static void uef() {
            yo = com.bytedance.sdk.openadsdk.gzw.lw.uef("image_config", "bitmap_cache_count", 10);
            moa = com.bytedance.sdk.openadsdk.gzw.lw.uef("image_config", "data_cache_count", 15);
            lw = com.bytedance.sdk.openadsdk.gzw.lw.uef("image_config", "disk_cache_count", 30);
            uef = com.bytedance.sdk.openadsdk.gzw.lw.uef("img_need_scale", 0) == 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.bytedance.sdk.component.lw.zjm oa(com.bytedance.sdk.openadsdk.core.model.sy syVar) {
            return uef(f26208oa.uef(syVar.uef()).uef(syVar.oa()).oa(syVar.yo()).lw(af.lw(sy.uef())).moa(af.yo(sy.uef())).uef(syVar.xs()));
        }

        private static wk uef(Context context) {
            uef();
            return com.bytedance.sdk.component.lw.oa.yo.oa.uef(context, new lw.uef().uef(new com.bytedance.sdk.component.lw.oa.yo.uef.oa(0, yo, moa, lw, new File(CacheDirFactory.getImageCacheDir("image_p")))).uef(uef).uef(new dhk() { // from class: com.bytedance.sdk.openadsdk.zjm.moa.uef.2
                @Override // com.bytedance.sdk.component.lw.dhk
                public ExecutorService oa() {
                    return km.yo();
                }

                @Override // com.bytedance.sdk.component.lw.dhk
                public ExecutorService uef() {
                    return km.oa();
                }
            }).uef(new tpx() { // from class: com.bytedance.sdk.openadsdk.zjm.moa.uef.1
                @Override // com.bytedance.sdk.component.lw.tpx
                public void uef(int i5, String str) {
                    com.bytedance.sdk.openadsdk.ab.moa.uef(str, true);
                }
            }).uef(new C0139uef()).uef());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static InputStream oa(String str, String str2) {
            return f26208oa.uef(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean oa(String str, String str2, String str3) {
            return f26208oa.uef(str, str2, str3);
        }

        private static com.bytedance.sdk.component.lw.zjm uef(com.bytedance.sdk.component.lw.zjm zjmVar) {
            return oyt.uef() ? zjmVar.uef(new lw()) : zjmVar;
        }
    }

    public static boolean oa() {
        return uef.uef;
    }

    public static com.bytedance.sdk.component.lw.zjm uef(String str) {
        return uef.oa(str);
    }

    public static com.bytedance.sdk.component.lw.zjm uef(com.bytedance.sdk.openadsdk.core.model.sy syVar) {
        return uef.oa(syVar);
    }

    public static InputStream uef(String str, String str2) {
        return uef.oa(str, str2);
    }

    public static boolean uef(String str, String str2, String str3) {
        return uef.oa(str, str2, str3);
    }

    public static wk uef() {
        return uef.f26208oa;
    }
}
