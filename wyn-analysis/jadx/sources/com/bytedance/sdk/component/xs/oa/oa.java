package com.bytedance.sdk.component.xs.oa;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.oa.uef.dj;
import com.bytedance.sdk.component.oa.uef.dz;
import com.bytedance.sdk.component.oa.uef.ivm;
import com.bytedance.sdk.component.oa.uef.uef;
import com.bytedance.sdk.component.oa.uef.wk;
import com.bytedance.sdk.component.oa.uef.wrv;
import com.bytedance.sdk.component.oa.uef.xs;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class oa extends yo {
    private Map<String, String> cq;
    private com.bytedance.sdk.component.oa.uef.uef dj;
    private boolean wrv;
    public static final com.bytedance.sdk.component.oa.uef.uef uef = new uef.C0064uef().uef().oa();

    /* renamed from: oa, reason: collision with root package name */
    public static final com.bytedance.sdk.component.oa.uef.uef f25108oa = new uef.C0064uef().oa();

    public oa(dj djVar) {
        super(djVar);
        this.dj = uef;
        this.wrv = false;
        this.cq = new HashMap();
    }

    public void uef(boolean z2) {
        this.wrv = z2;
    }

    @Override // com.bytedance.sdk.component.xs.oa.yo
    public void uef(final com.bytedance.sdk.component.xs.uef.uef uefVar) {
        try {
            wrv.uef uefVar2 = new wrv.uef();
            if (this.wrv) {
                uefVar2.oa(this.bcc);
            } else {
                xs.uef uefVar3 = new xs.uef();
                Uri uri = Uri.parse(this.bcc);
                uefVar3.uef(uri.getScheme());
                uefVar3.oa(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    uefVar3.yo(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.cq.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.cq.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        uefVar3.uef(strEncode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                uefVar2.uef(uefVar3.oa());
            }
            oa(uefVar2);
            uef(uefVar2);
            uefVar2.uef(this.dj);
            uefVar2.uef((Object) moa());
            if (!TextUtils.isEmpty(this.lw)) {
                uefVar2.uef(this.lw);
            }
            int i5 = this.ivm;
            if (i5 > 0) {
                uefVar2.uef(i5);
            }
            this.yo.uef(uefVar2.uef().oa()).uef(new com.bytedance.sdk.component.oa.uef.yo() { // from class: com.bytedance.sdk.component.xs.oa.oa.1
                @Override // com.bytedance.sdk.component.oa.uef.yo
                public void uef(com.bytedance.sdk.component.oa.uef.oa oaVar, IOException iOException) {
                    com.bytedance.sdk.component.xs.uef.uef uefVar4 = uefVar;
                    if (uefVar4 != null) {
                        uefVar4.uef(oa.this, iOException);
                    }
                }

                @Override // com.bytedance.sdk.component.oa.uef.yo
                public void uef(com.bytedance.sdk.component.oa.uef.oa oaVar, dz dzVar) throws IOException {
                    String strOa;
                    if (uefVar != null) {
                        HashMap map = new HashMap();
                        if (dzVar != null) {
                            oa.this.uef(dzVar.cz());
                            ivm ivmVarXs = dzVar.xs();
                            if (ivmVarXs != null) {
                                for (int i10 = 0; i10 < ivmVarXs.uef(); i10++) {
                                    map.put(ivmVarXs.uef(i10), ivmVarXs.oa(i10));
                                }
                            }
                            wk wkVarIvm = dzVar.ivm();
                            if (wkVarIvm == null) {
                                strOa = "";
                            } else {
                                strOa = wkVarIvm.oa();
                            }
                            uefVar.uef(oa.this, new com.bytedance.sdk.component.xs.oa(dzVar.moa(), dzVar.yo(), dzVar.lw(), map, strOa, dzVar.oa(), dzVar.uef()));
                        }
                    }
                }
            });
        } catch (Throwable th) {
            if (uefVar != null) {
                uefVar.uef(this, new IOException(th.getMessage()));
            }
        }
    }

    @Override // com.bytedance.sdk.component.xs.oa.yo
    public com.bytedance.sdk.component.xs.oa uef() {
        try {
            wrv.uef uefVar = new wrv.uef();
            if (this.wrv) {
                uefVar.oa(this.bcc);
            } else {
                xs.uef uefVar2 = new xs.uef();
                Uri uri = Uri.parse(this.bcc);
                uefVar2.uef(uri.getScheme());
                uefVar2.oa(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    uefVar2.yo(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.cq.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.cq.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        uefVar2.uef(strEncode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                uefVar.uef(uefVar2.oa());
            }
            oa(uefVar);
            uef(uefVar);
            uefVar.uef(this.dj);
            uefVar.uef((Object) moa());
            dz dzVarOa = this.yo.uef(uefVar.uef().oa()).oa();
            if (dzVarOa == null) {
                return null;
            }
            uef(dzVarOa.cz());
            HashMap map = new HashMap();
            ivm ivmVarXs = dzVarOa.xs();
            if (ivmVarXs != null) {
                for (int i5 = 0; i5 < ivmVarXs.uef(); i5++) {
                    map.put(ivmVarXs.uef(i5), ivmVarXs.oa(i5));
                }
            }
            wk wkVarIvm = dzVarOa.ivm();
            return new com.bytedance.sdk.component.xs.oa(dzVarOa.moa(), dzVarOa.yo(), dzVarOa.lw(), map, wkVarIvm != null ? wkVarIvm.oa() : "", dzVarOa.oa(), dzVarOa.uef());
        } catch (Throwable unused) {
            return null;
        }
    }
}
