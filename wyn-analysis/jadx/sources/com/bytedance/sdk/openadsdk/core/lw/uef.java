package com.bytedance.sdk.openadsdk.core.lw;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.lw;
import com.bytedance.sdk.component.utils.xs;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.ab.moa;
import com.bytedance.sdk.openadsdk.ab.oa;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk.yo.yo;
import com.vungle.ads.internal.protos.Sdk;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef {
    private final List<String> uef = new CopyOnWriteArrayList();

    /* renamed from: oa, reason: collision with root package name */
    private final yo f25629oa = new yo(5, 5, true);
    private final ConcurrentHashMap<String, Long> yo = new ConcurrentHashMap<>();

    /* renamed from: com.bytedance.sdk.openadsdk.core.lw.uef$uef, reason: collision with other inner class name */
    public static class C0098uef {
        private static final uef uef = new uef();
    }

    private boolean yo(String str) {
        return !this.uef.contains(str);
    }

    public File oa(String str) {
        String strUef = lw.uef(str);
        if (strUef == null) {
            return null;
        }
        File fileUef = uef(sy.uef());
        fileUef.getAbsoluteFile();
        return new File(fileUef, strUef);
    }

    public void yo() {
        moa.uef("music_preload_start", false, new oa() { // from class: com.bytedance.sdk.openadsdk.core.lw.uef.2
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                com.bytedance.sdk.openadsdk.ab.uef.moa moaVarUef = com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("music_preload_start");
                moaVarUef.uef();
                return moaVarUef;
            }
        });
    }

    public static uef uef() {
        return C0098uef.uef;
    }

    public void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar) throws JSONException {
        List<gzw> listLw = uefVar.lw();
        if (listLw == null || listLw.size() == 0) {
            return;
        }
        for (int i5 = 0; i5 < listLw.size(); i5++) {
            gzw gzwVar = listLw.get(i5);
            if (gzwVar != null) {
                uef(gzwVar);
            }
        }
    }

    public void oa() {
        File fileUef = uef(sy.uef());
        fileUef.getAbsolutePath();
        try {
            this.f25629oa.uef(fileUef);
        } catch (IOException e7) {
            dhk.uef("MusicCacheManager", "trimFileCache fail", e7);
        }
    }

    public InputStream uef(String str) {
        File fileOa = oa(str);
        if (fileOa == null || !uef(fileOa)) {
            return null;
        }
        try {
            return new FileInputStream(fileOa);
        } catch (Exception e7) {
            dhk.yo("MusicCacheManager", e7.getMessage());
            return null;
        }
    }

    private void uef(gzw gzwVar) throws JSONException {
        gzw.uef uefVarVep;
        String strCz;
        if (gzwVar == null || (uefVarVep = gzwVar.vep()) == null || (strCz = uefVarVep.cz()) == null || !strCz.contains("music_url")) {
            return;
        }
        yo();
        String strOa = uefVarVep.oa();
        if (TextUtils.isEmpty(strOa)) {
            try {
                new JSONObject().put("result", 0);
            } catch (JSONException e7) {
                dhk.yo("MusicCacheManager", e7.getMessage());
            }
            uef(0, -1L, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "music url string is null");
            return;
        }
        File fileOa = oa(strOa);
        if (fileOa == null) {
            return;
        }
        fileOa.getPath();
        if (uef(fileOa)) {
            uef(2, -1L, -1, null);
        } else {
            uef(gzwVar, strOa, fileOa);
        }
    }

    private File uef(Context context) {
        return xs.oa(context, new File(CacheDirFactory.getRootDir()).getName() + "/music");
    }

    private boolean uef(File file) {
        return file.exists() && file.length() != 0;
    }

    private void uef(gzw gzwVar, String str, File file) {
        if (yo(str)) {
            this.yo.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
            com.bytedance.sdk.component.xs.oa.uef uefVarMoa = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().moa();
            uefVarMoa.yo(str);
            uefVarMoa.uef(file.getParent(), file.getName());
            uefVarMoa.moa(str);
            this.uef.add(str);
            uefVarMoa.oa(new com.bytedance.sdk.component.xs.uef.uef() { // from class: com.bytedance.sdk.openadsdk.core.lw.uef.1
                @Override // com.bytedance.sdk.component.xs.uef.uef
                public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, com.bytedance.sdk.component.xs.oa oaVar) {
                    oaVar.yo();
                    oaVar.uef();
                    String strMoa = yoVar.moa();
                    Long l10 = (Long) uef.this.yo.get(strMoa);
                    if (oaVar.ivm() && oaVar.lw() != null && oaVar.lw().exists()) {
                        oaVar.lw();
                        if (l10 != null) {
                            uef.this.yo.remove(strMoa);
                            uef.this.uef(1, SystemClock.elapsedRealtime() - l10.longValue(), -1, null);
                        }
                        try {
                            xs.oa(oaVar.lw());
                        } catch (IOException e7) {
                            dhk.yo("MusicCacheManager", e7.getMessage());
                        }
                    }
                    if (oaVar.ivm() || l10 == null) {
                        return;
                    }
                    uef.this.uef(0, SystemClock.elapsedRealtime() - l10.longValue(), -2, "http response status code isn't 200");
                }

                @Override // com.bytedance.sdk.component.xs.uef.uef
                public void uef(com.bytedance.sdk.component.xs.oa.yo yoVar, IOException iOException) {
                    Long l10 = (Long) uef.this.yo.get(yoVar.moa());
                    if (l10 != null) {
                        uef.this.uef(0, SystemClock.elapsedRealtime() - l10.longValue(), -2, "http response status code isn't 200");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(final int i5, final long j8, final int i10, final String str) {
        moa.uef("music_preload_finish", false, new oa() { // from class: com.bytedance.sdk.openadsdk.core.lw.uef.3
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", i5);
                long j10 = j8;
                if (j10 != -1) {
                    jSONObject.put("load_duration", j10);
                }
                com.bytedance.sdk.openadsdk.ab.uef.moa moaVarOa = com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("music_preload_finish").oa(jSONObject.toString());
                if (!TextUtils.isEmpty(str)) {
                    moaVarOa.oa(i10);
                    moaVarOa.ivm(str);
                }
                moaVarOa.uef();
                return moaVarOa;
            }
        });
    }

    public void uef(final boolean z2) {
        moa.uef("music_cache", false, new oa() { // from class: com.bytedance.sdk.openadsdk.core.lw.uef.4
            @Override // com.bytedance.sdk.openadsdk.ab.oa
            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", z2);
                com.bytedance.sdk.openadsdk.ab.uef.moa moaVarOa = com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("music_cache").oa(jSONObject.toString());
                moaVarOa.uef();
                return moaVarOa;
            }
        });
    }
}
