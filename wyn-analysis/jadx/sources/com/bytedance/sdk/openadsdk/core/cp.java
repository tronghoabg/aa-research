package com.bytedance.sdk.openadsdk.core;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.internal.consent_sdk.a;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class cp {
    private static cp uef;
    private com.bytedance.sdk.openadsdk.uef.yo.oa ivm;
    private com.bytedance.sdk.openadsdk.uef.lw.uef lw;
    private com.bytedance.sdk.openadsdk.uef.moa.oa xs;

    /* renamed from: oa, reason: collision with root package name */
    private final AtomicInteger f25499oa = new AtomicInteger(0);
    private Map<Integer, com.bytedance.sdk.openadsdk.core.model.uef> yo = new ConcurrentHashMap();
    private final ConcurrentHashMap<String, uef<?>> moa = new ConcurrentHashMap<>();
    private final Map<String, oa> bcc = new HashMap();

    public interface oa {
        void uef();
    }

    public static class uef<T> {

        /* renamed from: oa, reason: collision with root package name */
        public final String f25500oa;
        public final T uef;
        public final long yo = System.currentTimeMillis();

        public uef(T t10, String str) {
            this.uef = t10;
            this.f25500oa = str;
        }
    }

    private cp() {
    }

    public void lw() {
        this.lw = null;
        this.ivm = null;
        this.xs = null;
    }

    public com.bytedance.sdk.openadsdk.uef.moa.oa moa() {
        return this.xs;
    }

    public com.bytedance.sdk.openadsdk.uef.lw.uef oa() {
        return this.lw;
    }

    public <T> void uef(String str, T t10) {
        if (TextUtils.isEmpty(str) || t10 == null) {
            return;
        }
        this.moa.put(str, new uef<>(t10, str));
    }

    public com.bytedance.sdk.openadsdk.uef.yo.oa yo() {
        return this.ivm;
    }

    private static String moa(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        if (gzwVar == null) {
            return null;
        }
        String strOfp = gzwVar.ofp();
        return TextUtils.isEmpty(strOfp) ? String.valueOf(gzwVar.hashCode()) : strOfp;
    }

    public com.bytedance.sdk.openadsdk.core.model.uef oa(int i5) {
        return this.yo.remove(Integer.valueOf(i5));
    }

    public void yo(int i5) {
        this.yo.remove(Integer.valueOf(i5));
    }

    public void oa(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        oa oaVar;
        if (gzwVar == null) {
            return;
        }
        String strMoa = moa(gzwVar);
        if (TextUtils.isEmpty(strMoa) || (oaVar = this.bcc.get(strMoa)) == null) {
            return;
        }
        oaVar.uef();
    }

    public <T> T uef(String str, Class<T> cls) {
        uef<?> uefVar;
        if (TextUtils.isEmpty(str) || cls == null || (uefVar = this.moa.get(str)) == null || !cls.isInstance(uefVar.uef)) {
            return null;
        }
        return cls.cast(uefVar.uef);
    }

    public void yo(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        String strMoa = moa(gzwVar);
        if (TextUtils.isEmpty(strMoa)) {
            return;
        }
        this.bcc.remove(strMoa);
    }

    public uef<?> uef(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.moa.remove(str);
    }

    public static cp uef() {
        if (uef == null) {
            uef = new cp();
        }
        return uef;
    }

    public com.bytedance.sdk.openadsdk.core.model.gzw uef(int i5) {
        com.bytedance.sdk.openadsdk.core.model.uef uefVarRemove = this.yo.remove(Integer.valueOf(i5));
        if (uefVarRemove != null) {
            return uefVarRemove.cq();
        }
        return null;
    }

    public int uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        com.bytedance.sdk.openadsdk.core.model.uef uefVar = new com.bytedance.sdk.openadsdk.core.model.uef();
        uefVar.oa(gzwVar);
        return uef(uefVar);
    }

    public void uef(com.bytedance.sdk.openadsdk.uef.yo.oa oaVar) {
        this.ivm = oaVar;
    }

    public void uef(com.bytedance.sdk.openadsdk.uef.lw.uef uefVar) {
        this.lw = uefVar;
    }

    public void uef(com.bytedance.sdk.openadsdk.uef.moa.oa oaVar) {
        this.xs = oaVar;
    }

    public int uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
        int iIncrementAndGet = this.f25499oa.incrementAndGet();
        this.yo.put(Integer.valueOf(iIncrementAndGet), uefVar);
        return iIncrementAndGet;
    }

    public static int uef(Intent intent) {
        if (intent != null) {
            return intent.getIntExtra("meta_index", -1);
        }
        return -1;
    }

    public void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, oa oaVar) {
        if (gzwVar == null || oaVar == null) {
            return;
        }
        String strMoa = moa(gzwVar);
        if (TextUtils.isEmpty(strMoa)) {
            return;
        }
        this.bcc.put(strMoa, oaVar);
    }

    public void uef(String str, boolean z2, boolean z10) {
        boolean z11 = z2 || !z10;
        boolean zWk = zjm.oa().wk();
        if (zWk) {
            com.bytedance.sdk.component.utils.dhk.uef("BVA", "cleanListener: isFinish = " + z2 + ",isConfigChange = " + z10);
        }
        if (z11) {
            uef(str, zWk);
        } else if (z2 || !z10) {
            uef(str, zWk);
        }
    }

    private void uef(String str, boolean z2) {
        uef<?> uefVarUef = uef(str);
        if (z2) {
            if (uefVarUef == null) {
                com.bytedance.sdk.component.utils.dhk.uef("BVA", "cleanListener: removeCallback failed,listenerKey=".concat(String.valueOf(str)));
                return;
            }
            StringBuilder sbW = a.w("cleanListener: removeCallback success,listenerKey=", str, ",callback=");
            sbW.append(uefVarUef.uef);
            com.bytedance.sdk.component.utils.dhk.uef("BVA", sbW.toString());
        }
    }
}
