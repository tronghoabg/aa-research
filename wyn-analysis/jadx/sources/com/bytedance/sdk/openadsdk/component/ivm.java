package com.bytedance.sdk.openadsdk.component;

import A7.AbstractC0279p0;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import com.bykv.vk.openvk.uef.uef.uef.lw.uef;
import com.bytedance.sdk.component.lw.ab;
import com.bytedance.sdk.component.lw.bcc;
import com.bytedance.sdk.component.lw.dj;
import com.bytedance.sdk.component.lw.zjm;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.common.oa;
import com.bytedance.sdk.openadsdk.core.gzw;
import com.bytedance.sdk.openadsdk.core.model.fz;
import com.bytedance.sdk.openadsdk.core.model.ue;
import com.bytedance.sdk.openadsdk.core.orq;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.km;
import com.bytedance.sdk.openadsdk.utils.pu;
import com.bytedance.sdk.openadsdk.utils.sy;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import wg.b;

/* loaded from: classes3.dex */
public class ivm {

    /* renamed from: oa, reason: collision with root package name */
    private static volatile ivm f25332oa = null;
    private static String uef = "openad_image_cache";
    private final Context lw;
    private final gzw<com.bytedance.sdk.openadsdk.moa.uef> moa;
    private final com.bytedance.sdk.openadsdk.oa.oa yo;
    private final Map<String, AtomicInteger> ivm = new ConcurrentHashMap();
    private final Map<String, String> xs = new ConcurrentHashMap();

    public interface oa {
        void uef();

        void uef(int i5, String str);
    }

    public interface uef {
        void uef();

        void uef(com.bytedance.sdk.openadsdk.dhk.uef.oa oaVar);
    }

    public interface yo {
        void uef(Object obj);
    }

    private ivm(Context context) {
        if (context != null) {
            this.lw = context.getApplicationContext();
        } else {
            this.lw = sy.uef();
        }
        this.yo = new com.bytedance.sdk.openadsdk.oa.oa(10, 8, true);
        this.moa = sy.yo();
        uef = b.c(new StringBuilder(), uef, "_p");
        com.bytedance.sdk.openadsdk.common.oa.uef("tt_openad_materialMeta_new", new oa.uef("tt_openad_materialMeta_new") { // from class: com.bytedance.sdk.openadsdk.component.ivm.1
            @Override // com.bytedance.sdk.openadsdk.common.oa.uef
            public String oa(String str) {
                return com.bytedance.sdk.openadsdk.oib.moa.uef.oa("tt_openad_materialMeta_new", "material".concat(String.valueOf(str)), (String) null);
            }

            @Override // com.bytedance.sdk.openadsdk.common.oa.uef
            public String uef(String str) {
                return "tt_openad_materialMeta_new";
            }

            @Override // com.bytedance.sdk.openadsdk.common.oa.uef
            public void uef(AdSlot adSlot, String str, String str2) {
                com.bytedance.sdk.openadsdk.oib.moa.uef.uef("tt_openad_materialMeta_new", "material".concat(String.valueOf(adSlot.getCodeId())), str);
            }
        });
    }

    private int moa(AdSlot adSlot) {
        StringBuilder sb2 = new StringBuilder("material_expiration_time");
        sb2.append(adSlot.getCodeId());
        return com.bytedance.sdk.openadsdk.oib.moa.uef.uef("tt_openad", sb2.toString(), -1L) == -1 ? 0 : 1;
    }

    private void oa(final com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, final AdSlot adSlot, final fz fzVar, final com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
        if (com.bytedance.sdk.openadsdk.component.xs.uef.lw()) {
            uef(gzwVar, adSlot, fzVar, uefVar);
        }
        uef(gzwVar, adSlot, fzVar, new oa() { // from class: com.bytedance.sdk.openadsdk.component.ivm.7
            @Override // com.bytedance.sdk.openadsdk.component.ivm.oa
            public void uef() {
                if (com.bytedance.sdk.openadsdk.component.xs.uef.lw()) {
                    return;
                }
                ivm.this.uef(gzwVar, adSlot, fzVar, uefVar);
            }

            @Override // com.bytedance.sdk.openadsdk.component.ivm.oa
            public void uef(int i5, String str) {
                ivm.this.yo(adSlot);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yo(AdSlot adSlot) {
        AtomicInteger atomicInteger = this.ivm.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        } else {
            atomicInteger.decrementAndGet();
        }
        this.ivm.put(adSlot.getCodeId(), atomicInteger);
    }

    public static ivm uef(Context context) {
        if (f25332oa == null) {
            synchronized (ivm.class) {
                try {
                    if (f25332oa == null) {
                        f25332oa = new ivm(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f25332oa;
    }

    public void oa(int i5) {
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("tt_openad", "image_has_cached".concat(String.valueOf(i5)), Boolean.TRUE);
    }

    public boolean oa(AdSlot adSlot) {
        if (!com.bytedance.sdk.openadsdk.component.xs.uef.lw() && adSlot != null) {
            String codeId = adSlot.getCodeId();
            if (com.bytedance.sdk.openadsdk.component.xs.uef.uef(adSlot) && !TextUtils.isEmpty(codeId)) {
                return this.xs.containsKey(codeId);
            }
        }
        return false;
    }

    private void yo(final com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, final AdSlot adSlot, final fz fzVar, final com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
        if (com.bytedance.sdk.openadsdk.component.xs.uef.lw()) {
            uef(gzwVar, adSlot, fzVar, uefVar);
        }
        uef(gzwVar, fzVar, new uef() { // from class: com.bytedance.sdk.openadsdk.component.ivm.8
            @Override // com.bytedance.sdk.openadsdk.component.ivm.uef
            public void uef(com.bytedance.sdk.openadsdk.dhk.uef.oa oaVar) {
                if (com.bytedance.sdk.openadsdk.component.xs.uef.lw()) {
                    return;
                }
                ivm.this.uef(gzwVar, adSlot, fzVar, uefVar);
            }

            @Override // com.bytedance.sdk.openadsdk.component.ivm.uef
            public void uef() {
                ivm.this.yo(adSlot);
            }
        });
    }

    private void oa(String str) {
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("tt_openad_materialMeta_new", "material".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("tt_openad_materialMeta", "material".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("tt_openad", "material_expiration_time".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("tt_openad", "video_has_cached".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("tt_openad", "image_has_cached".concat(String.valueOf(str)));
    }

    public static void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, yo yoVar) {
        uef(gzwVar, yoVar, 0);
    }

    public String yo(int i5) {
        String strOa = com.bytedance.sdk.openadsdk.common.oa.uef("tt_openad_materialMeta_new").oa(String.valueOf(i5));
        long jUef = com.bytedance.sdk.openadsdk.oib.moa.uef.uef("tt_openad", "material_expiration_time".concat(String.valueOf(i5)), -1L);
        if (System.currentTimeMillis() / 1000 < jUef) {
            return strOa;
        }
        if (jUef != -1) {
            uef(i5, (String) null);
            uef(strOa);
        }
        return null;
    }

    public static void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, final yo yoVar, final int i5) {
        String strZjm = gzwVar.nj().zjm();
        if (TextUtils.isEmpty(strZjm)) {
            return;
        }
        zjm zjmVarMoa = com.bytedance.sdk.openadsdk.zjm.moa.uef(strZjm).uef(gzwVar.nj().yo()).oa(gzwVar.nj().oa()).lw(af.lw(sy.uef())).moa(af.yo(sy.uef()));
        if (i5 > 0 && Build.VERSION.SDK_INT >= 26) {
            zjmVarMoa.yo(2).uef(new bcc() { // from class: com.bytedance.sdk.openadsdk.component.ivm.4
                @Override // com.bytedance.sdk.component.lw.bcc
                public Bitmap uef(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.moa.uef.uef(sy.uef(), bitmap, i5);
                }
            });
        } else {
            zjmVarMoa.yo(1);
        }
        zjmVarMoa.uef(new com.bytedance.sdk.openadsdk.zjm.oa(gzwVar, strZjm, new ab() { // from class: com.bytedance.sdk.openadsdk.component.ivm.5
            @Override // com.bytedance.sdk.component.lw.ab
            public void uef(int i10, String str, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.lw.ab
            public void uef(dj djVar) {
                yo yoVar2;
                if (djVar == null || djVar.oa() == null || djVar.yo() == null || (yoVar2 = yoVar) == null) {
                    return;
                }
                yoVar2.uef(djVar.oa());
            }
        }));
    }

    public File oa() {
        StringBuilder sbQ = AbstractC0279p0.q(new File(CacheDirFactory.getRootDir()).getName(), "/");
        sbQ.append(uef);
        return com.bytedance.sdk.component.utils.xs.oa(sy.uef(), sbQ.toString());
    }

    public void uef(final AdSlot adSlot) {
        Objects.toString(adSlot);
        if (adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        AtomicInteger atomicInteger = this.ivm.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        }
        if (!com.bytedance.sdk.openadsdk.common.sy.uef().uef(adSlot.getCodeId(), atomicInteger.get(), atomicInteger.get() + moa(adSlot))) {
            com.bytedance.sdk.openadsdk.component.xs.uef.bcc();
            return;
        }
        atomicInteger.incrementAndGet();
        this.ivm.put(adSlot.getCodeId(), atomicInteger);
        final fz fzVar = new fz();
        fzVar.uef(pu.oa());
        if (Build.VERSION.SDK_INT >= 24) {
            fzVar.oa(com.bytedance.sdk.openadsdk.component.xs.uef.oa());
            fzVar.oa(com.bytedance.sdk.openadsdk.component.xs.uef.yo());
        }
        ue ueVar = new ue();
        ueVar.dj = fzVar;
        ueVar.moa = 2;
        ueVar.cz = 2;
        this.moa.uef(adSlot, ueVar, 3, new orq() { // from class: com.bytedance.sdk.openadsdk.component.ivm.6
            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.gzw.uef
            public void uef(int i5, String str) {
                ivm.this.yo(adSlot);
                com.bytedance.sdk.openadsdk.component.moa.uef.uef(fzVar, 100, 2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.gzw.uef
            public void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar, com.bytedance.sdk.openadsdk.core.model.yo yoVar) {
                ivm.this.uef(uefVar, yoVar, adSlot, fzVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar, com.bytedance.sdk.openadsdk.core.model.yo yoVar, AdSlot adSlot, fz fzVar) {
        com.bytedance.sdk.openadsdk.component.moa.uef.uef(fzVar, 100, 1);
        if (uefVar != null && uefVar.lw() != null && !uefVar.lw().isEmpty()) {
            com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = uefVar.lw().get(0);
            if (gzwVar == null) {
                return;
            }
            if (gzwVar.ku()) {
                uef(gzwVar, adSlot, fzVar, uefVar);
                return;
            } else if (com.bytedance.sdk.openadsdk.core.model.gzw.lw(gzwVar)) {
                oa(gzwVar, adSlot, fzVar, uefVar);
                return;
            } else {
                yo(gzwVar, adSlot, fzVar, uefVar);
                return;
            }
        }
        yoVar.uef(-3);
        yoVar.yo(2);
        com.bytedance.sdk.openadsdk.core.model.yo.uef(yoVar);
    }

    public void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, AdSlot adSlot, fz fzVar, com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
        if (fzVar != null) {
            gzwVar.yo(fzVar.zjm());
        }
        uef(new com.bytedance.sdk.openadsdk.component.lw.uef(gzwVar.jnk(), gzwVar, uefVar));
        com.bytedance.sdk.openadsdk.component.moa.uef.uef(gzwVar, 1, fzVar);
        yo(adSlot);
    }

    public void uef(final com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, AdSlot adSlot, final fz fzVar, final oa oaVar) {
        final pu puVarOa = pu.oa();
        final int iJnk = gzwVar.jnk();
        com.bykv.vk.openvk.uef.uef.uef.yo.oa oaVarNj = gzwVar.nj();
        String strDj = oaVarNj.dj();
        String strDz = oaVarNj.dz();
        if (TextUtils.isEmpty(strDz)) {
            strDz = com.bytedance.sdk.component.utils.lw.uef(strDj);
        }
        final File fileUef = com.bytedance.sdk.openadsdk.component.xs.uef.uef(strDz);
        if (fileUef.exists()) {
            com.bytedance.sdk.openadsdk.component.xs.uef.uef(fileUef);
            uef(iJnk);
            long jMoa = puVarOa.moa();
            if (fzVar != null) {
                fzVar.uef(jMoa);
                fzVar.uef(1);
            }
            oaVar.uef();
            uef(gzwVar, (yo) null);
            return;
        }
        if (sy.moa().gr(String.valueOf(iJnk)) && !com.bytedance.sdk.component.utils.sy.moa(sy.uef())) {
            oaVar.uef(100, "OnlyWifi");
            return;
        }
        com.bytedance.sdk.openadsdk.core.wk.uef.oa oaVarUef = com.bytedance.sdk.openadsdk.core.model.gzw.uef(fileUef.getParent(), gzwVar);
        oaVarUef.uef("material_meta", gzwVar);
        oaVarUef.uef("ad_slot", adSlot);
        com.bytedance.sdk.openadsdk.core.wk.lw.uef.uef(oaVarUef, new uef.InterfaceC0032uef() { // from class: com.bytedance.sdk.openadsdk.component.ivm.9
            @Override // com.bykv.vk.openvk.uef.uef.uef.lw.uef.InterfaceC0032uef
            public void oa(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar, int i5) {
            }

            @Override // com.bykv.vk.openvk.uef.uef.uef.lw.uef.InterfaceC0032uef
            public void uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar, int i5) {
                ivm.this.uef(iJnk);
                long jMoa2 = puVarOa.moa();
                com.bytedance.sdk.openadsdk.component.moa.uef.oa(gzwVar, jMoa2, true);
                fz fzVar2 = fzVar;
                if (fzVar2 != null) {
                    fzVar2.uef(jMoa2);
                    fzVar.uef(2);
                }
                oaVar.uef();
                ivm.uef(gzwVar, (yo) null);
            }

            @Override // com.bykv.vk.openvk.uef.uef.uef.lw.uef.InterfaceC0032uef
            public void uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar, int i5, String str) {
                long jMoa2 = puVarOa.moa();
                com.bytedance.sdk.openadsdk.component.moa.uef.oa(gzwVar, jMoa2, false);
                fz fzVar2 = fzVar;
                if (fzVar2 != null) {
                    fzVar2.uef(jMoa2);
                }
                oaVar.uef(i5, str);
                try {
                    if (fileUef.exists() && fileUef.isFile()) {
                        com.bytedance.sdk.component.utils.xs.yo(fileUef);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    public void uef(final com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, final fz fzVar, final uef uefVar) {
        final pu puVarOa = pu.oa();
        final int iJnk = gzwVar.jnk();
        com.bytedance.sdk.openadsdk.core.model.sy syVar = gzwVar.lpy().get(0);
        String strXs = syVar.xs();
        String strUef = syVar.uef();
        int iOa = syVar.oa();
        int iYo = syVar.yo();
        String strUef2 = TextUtils.isEmpty(strXs) ? com.bytedance.sdk.component.utils.lw.uef(strUef) : strXs;
        if (TextUtils.isEmpty(strUef2)) {
            if (uefVar != null) {
                uefVar.uef();
                return;
            }
            return;
        }
        File fileOa = com.bytedance.sdk.openadsdk.component.xs.uef.oa(strUef2);
        if (uef(strUef, strXs)) {
            oa(iJnk);
            long jMoa = puVarOa.moa();
            if (fzVar != null) {
                fzVar.uef(jMoa);
                fzVar.uef(1);
            }
            uefVar.uef(null);
            return;
        }
        com.bytedance.sdk.openadsdk.utils.sy.uef(new com.bytedance.sdk.openadsdk.dhk.uef(strUef, syVar.xs()), iOa, iYo, new sy.uef() { // from class: com.bytedance.sdk.openadsdk.component.ivm.10
            @Override // com.bytedance.sdk.openadsdk.utils.sy.uef
            public void uef(com.bytedance.sdk.openadsdk.dhk.uef.oa oaVar) {
                if (!oaVar.lw()) {
                    com.bytedance.sdk.openadsdk.component.moa.uef.uef(gzwVar, puVarOa.moa(), false);
                    uefVar.uef();
                    return;
                }
                ivm.this.oa(iJnk);
                long jMoa2 = puVarOa.moa();
                com.bytedance.sdk.openadsdk.component.moa.uef.uef(gzwVar, jMoa2, true);
                fz fzVar2 = fzVar;
                if (fzVar2 != null) {
                    fzVar2.uef(jMoa2);
                    fzVar.uef(2);
                }
                uefVar.uef(oaVar);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.sy.uef
            public void uef() {
                com.bytedance.sdk.openadsdk.component.moa.uef.uef(gzwVar, puVarOa.moa(), false);
                uefVar.uef();
            }
        }, fileOa.getParent());
    }

    public void uef(int i5) {
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("tt_openad", "video_has_cached".concat(String.valueOf(i5)), Boolean.TRUE);
    }

    public void uef(final com.bytedance.sdk.openadsdk.component.lw.uef uefVar) {
        wk.oa().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.ivm.11
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.core.model.gzw gzwVarOa = uefVar.oa();
                    if (gzwVarOa == null || com.bytedance.sdk.openadsdk.core.model.gzw.ivm(gzwVarOa) || gzwVarOa.tpq()) {
                        return;
                    }
                    if (com.bytedance.sdk.openadsdk.component.xs.uef.lw()) {
                        com.bytedance.sdk.openadsdk.common.sy.uef().uef(gzwVarOa, uefVar.yo());
                        return;
                    }
                    if (ivm.this.oa(gzwVarOa.cl())) {
                        return;
                    }
                    ivm.this.uef(gzwVarOa.cl(), gzwVarOa.ofp());
                    com.bytedance.sdk.openadsdk.oib.moa.uef.uef("tt_openad", "material_expiration_time" + uefVar.uef(), Long.valueOf(gzwVarOa.gk()));
                    com.bytedance.sdk.openadsdk.common.oa.uef("tt_openad_materialMeta_new").uef(uefVar.oa().cl(), uefVar.yo());
                } catch (Throwable unused) {
                }
            }
        });
    }

    public void uef(final String str) {
        km.uef(new com.bytedance.sdk.component.bcc.oa.yo("opencache") { // from class: com.bytedance.sdk.openadsdk.component.ivm.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.model.uef uefVarOa;
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("cypher")) {
                        jSONObject = com.bytedance.sdk.openadsdk.core.sy.yo().uef(jSONObject);
                    }
                    if (jSONObject == null || !jSONObject.has("creatives") || (uefVarOa = com.bytedance.sdk.openadsdk.core.model.uef.oa(jSONObject)) == null || !uefVarOa.ivm()) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.moa.uef.uef(uefVarOa.xs());
                } catch (Throwable unused) {
                }
            }
        });
    }

    public String uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        if (gzwVar != null && gzwVar.nj() != null && !TextUtils.isEmpty(gzwVar.nj().dj())) {
            String strDj = gzwVar.nj().dj();
            String strDz = gzwVar.nj().dz();
            if (TextUtils.isEmpty(strDz)) {
                strDz = com.bytedance.sdk.component.utils.lw.uef(strDj);
            }
            File fileUef = com.bytedance.sdk.openadsdk.component.xs.uef.uef(strDz);
            if (fileUef.exists() && fileUef.isFile()) {
                return fileUef.getAbsolutePath();
            }
        }
        return null;
    }

    public boolean uef(String str, String str2) throws IOException {
        boolean z2;
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = com.bytedance.sdk.component.utils.lw.uef(str);
            }
            File fileOa = com.bytedance.sdk.openadsdk.component.xs.uef.oa(str2);
            InputStream inputStreamUef = com.bytedance.sdk.openadsdk.zjm.moa.uef(str, str2);
            if (inputStreamUef != null) {
                try {
                    inputStreamUef.close();
                } catch (IOException e7) {
                    dhk.yo("TTAppOpenAdCacheManager", e7.getMessage());
                }
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (com.bytedance.sdk.openadsdk.zjm.moa.uef(str, str2, fileOa.getParent())) {
                    return true;
                }
                if (new File(fileOa.getPath()).exists()) {
                    return true;
                }
            }
            return z2;
        } catch (Exception e10) {
            dhk.yo("TTAppOpenAdCacheManager", e10.getMessage());
            return false;
        }
    }

    public void uef(AdSlot adSlot, String str) {
        if (com.bytedance.sdk.openadsdk.component.xs.uef.lw() || adSlot == null || TextUtils.isEmpty(str)) {
            return;
        }
        String codeId = adSlot.getCodeId();
        boolean z2 = adSlot.getCacheScene() != 0;
        if (!com.bytedance.sdk.openadsdk.component.xs.uef.uef(adSlot) || z2 || TextUtils.isEmpty(codeId)) {
            return;
        }
        this.xs.put(codeId, str);
    }

    public void uef(int i5, String str) {
        String strValueOf = String.valueOf(i5);
        if (com.bytedance.sdk.openadsdk.component.xs.uef.lw()) {
            com.bytedance.sdk.openadsdk.common.sy.uef().uef(strValueOf, str);
            return;
        }
        if (this.xs.size() != 0 && !TextUtils.isEmpty(str) && this.xs.containsKey(strValueOf)) {
            if (this.xs.containsValue(str)) {
                this.xs.remove(strValueOf);
                oa(strValueOf);
                return;
            }
            return;
        }
        oa(strValueOf);
    }

    public void uef() {
        File[] fileArrListFiles;
        try {
            com.bytedance.sdk.openadsdk.oib.moa.uef.uef("tt_openad_materialMeta");
            com.bytedance.sdk.openadsdk.oib.moa.uef.uef("tt_openad_materialMeta_new");
            com.bytedance.sdk.openadsdk.oib.moa.uef.uef("tt_openad");
        } catch (Throwable unused) {
        }
        try {
            File file = new File(CacheDirFactory.getRootDir());
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.ivm.3
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    if (file2 == null) {
                        return false;
                    }
                    String name = file2.getName();
                    return name.contains(ivm.uef) || name.contains("openad_video_cache");
                }
            })) != null) {
                for (File file2 : fileArrListFiles) {
                    try {
                        com.bytedance.sdk.component.utils.xs.yo(file2);
                    } catch (Throwable unused2) {
                    }
                }
            }
        } catch (Throwable unused3) {
        }
    }
}
