package com.bytedance.sdk.component.xs.oa;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.bytedance.sdk.component.oa.uef.cq;
import com.bytedance.sdk.component.oa.uef.cz;
import com.bytedance.sdk.component.oa.uef.dj;
import com.bytedance.sdk.component.oa.uef.dz;
import com.bytedance.sdk.component.oa.uef.ivm;
import com.bytedance.sdk.component.oa.uef.wk;
import com.bytedance.sdk.component.oa.uef.wrv;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import org.apache.tika.metadata.HttpHeaders;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class moa extends yo {
    cq uef;

    public moa(dj djVar) {
        super(djVar);
        this.uef = null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:7|(4:53|8|51|9)|(4:55|10|45|11)|12|49|13|33) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte[] ivm(java.lang.String r5) throws java.lang.Throwable {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L4c
            int r1 = r5.length()
            if (r1 != 0) goto La
            goto L4c
        La:
            r1 = 0
            byte[] r1 = new byte[r1]
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L42
            r2.<init>()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L42
            java.util.zip.GZIPOutputStream r3 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L43
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L43
            java.lang.String r0 = "utf-8"
            byte[] r5 = r5.getBytes(r0)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            r3.write(r5)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            r3.close()     // Catch: java.io.IOException -> L23
        L23:
            byte[] r1 = r2.toByteArray()
            r2.close()     // Catch: java.io.IOException -> L4b
            goto L4b
        L2b:
            r5 = move-exception
            r0 = r3
            goto L34
        L2e:
            r0 = r3
            goto L43
        L30:
            r5 = move-exception
            goto L34
        L32:
            r5 = move-exception
            r2 = r0
        L34:
            if (r0 == 0) goto L39
            r0.close()     // Catch: java.io.IOException -> L39
        L39:
            if (r2 == 0) goto L41
            r2.toByteArray()
            r2.close()     // Catch: java.io.IOException -> L41
        L41:
            throw r5
        L42:
            r2 = r0
        L43:
            if (r0 == 0) goto L48
            r0.close()     // Catch: java.io.IOException -> L48
        L48:
            if (r2 == 0) goto L4b
            goto L23
        L4b:
            return r1
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.xs.oa.moa.ivm(java.lang.String):byte[]");
    }

    public void lw(String str) {
        if (TextUtils.isEmpty(str)) {
            str = JsonUtils.EMPTY_JSON;
        }
        this.uef = cq.uef(cz.uef("application/json; charset=utf-8"), str);
    }

    public void uef(JSONObject jSONObject) {
        String string;
        if (jSONObject != null) {
            string = jSONObject.toString();
        } else {
            string = JsonUtils.EMPTY_JSON;
        }
        this.uef = cq.uef(cz.uef("application/json; charset=utf-8"), string);
    }

    public void uef(String str, byte[] bArr) {
        this.uef = cq.uef(cz.uef(str), bArr);
    }

    @Override // com.bytedance.sdk.component.xs.oa.yo
    public void uef(final com.bytedance.sdk.component.xs.uef.uef uefVar) {
        try {
            wrv.uef uefVar2 = new wrv.uef();
            if (TextUtils.isEmpty(this.bcc)) {
                uefVar.uef(this, new IOException("Url is Empty"));
                return;
            }
            if (!TextUtils.isEmpty(this.lw)) {
                uefVar2.uef(this.lw);
            }
            int i5 = this.ivm;
            if (i5 > 0) {
                uefVar2.uef(i5);
            }
            uefVar2.oa(this.bcc);
            if (this.uef == null) {
                if (uefVar != null) {
                    uefVar.uef(this, new IOException("RequestBody is null, content type is not support!!"));
                }
            } else {
                oa(uefVar2);
                uefVar2.uef((Object) moa());
                uef(uefVar2);
                this.yo.uef(uefVar2.uef(this.uef).oa()).uef(new com.bytedance.sdk.component.oa.uef.yo() { // from class: com.bytedance.sdk.component.xs.oa.moa.1
                    @Override // com.bytedance.sdk.component.oa.uef.yo
                    public void uef(com.bytedance.sdk.component.oa.uef.oa oaVar, IOException iOException) {
                        com.bytedance.sdk.component.xs.uef.uef uefVar3 = uefVar;
                        if (uefVar3 != null) {
                            uefVar3.uef(moa.this, iOException);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x00f5  */
                    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
                    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.sdk.component.oa.uef.ivm] */
                    /* JADX WARN: Type inference failed for: r13v6, types: [com.bytedance.sdk.component.xs.uef.uef] */
                    /* JADX WARN: Type inference failed for: r2v0 */
                    /* JADX WARN: Type inference failed for: r2v1, types: [com.bytedance.sdk.component.xs.oa] */
                    /* JADX WARN: Type inference failed for: r2v11 */
                    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
                    /* JADX WARN: Type inference failed for: r2v14 */
                    /* JADX WARN: Type inference failed for: r2v15 */
                    /* JADX WARN: Type inference failed for: r2v16 */
                    /* JADX WARN: Type inference failed for: r2v17 */
                    /* JADX WARN: Type inference failed for: r2v18 */
                    /* JADX WARN: Type inference failed for: r2v5 */
                    /* JADX WARN: Type inference failed for: r2v9, types: [com.bytedance.sdk.component.xs.oa] */
                    @Override // com.bytedance.sdk.component.oa.uef.yo
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public void uef(com.bytedance.sdk.component.oa.uef.oa r13, com.bytedance.sdk.component.oa.uef.dz r14) throws java.io.IOException {
                        /*
                            Method dump skipped, instructions count: 316
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.xs.oa.moa.AnonymousClass1.uef(com.bytedance.sdk.component.oa.uef.oa, com.bytedance.sdk.component.oa.uef.dz):void");
                    }
                });
            }
        } catch (Throwable th) {
            uefVar.uef(this, new IOException(th.getMessage()));
        }
    }

    @Override // com.bytedance.sdk.component.xs.oa.yo
    public com.bytedance.sdk.component.xs.oa uef() {
        com.bytedance.sdk.component.xs.oa oaVar;
        try {
            wrv.uef uefVar = new wrv.uef();
            if (TextUtils.isEmpty(this.bcc)) {
                return new com.bytedance.sdk.component.xs.oa(false, 5000, "URL_NULL_MSG", null, "URL_NULL_BODY", 1L, 1L);
            }
            uefVar.oa(this.bcc);
            if (this.uef == null) {
                return new com.bytedance.sdk.component.xs.oa(false, 5000, "BODY_NULL_MSG", null, "BODY_NULL_BODY", 1L, 1L);
            }
            oa(uefVar);
            uefVar.uef((Object) moa());
            uef(uefVar);
            dz dzVarOa = this.yo.uef(uefVar.uef(this.uef).oa()).oa();
            if (dzVarOa == null) {
                return null;
            }
            uef(dzVarOa.cz());
            HashMap map = new HashMap();
            ivm ivmVarXs = dzVarOa.xs();
            if (ivmVarXs != null) {
                for (int i5 = 0; i5 < ivmVarXs.uef(); i5++) {
                    String strUef = ivmVarXs.uef(i5);
                    String strOa = ivmVarXs.oa(i5);
                    map.put(strUef, strOa);
                    if (strUef != null && strUef.equalsIgnoreCase("content-type")) {
                        map.put("content-type", strOa == null ? "" : strOa.toLowerCase());
                    }
                }
            }
            wk wkVarIvm = dzVarOa.ivm();
            if (com.bytedance.sdk.component.xs.yo.uef.uef(map)) {
                byte[] bArrMoa = wkVarIvm.moa();
                oaVar = new com.bytedance.sdk.component.xs.oa(dzVarOa.moa(), dzVarOa.yo(), dzVarOa.lw(), map, null, dzVarOa.oa(), dzVarOa.uef());
                oaVar.uef(bArrMoa);
            } else if (this.zjm) {
                byte[] bArrMoa2 = wkVarIvm.moa();
                oaVar = new com.bytedance.sdk.component.xs.oa(dzVarOa.moa(), dzVarOa.yo(), dzVarOa.lw(), map, new String(bArrMoa2, uef(uef(wkVarIvm))), dzVarOa.oa(), dzVarOa.uef());
                oaVar.uef(bArrMoa2);
            } else if (wkVarIvm != null) {
                oaVar = new com.bytedance.sdk.component.xs.oa(dzVarOa.moa(), dzVarOa.yo(), dzVarOa.lw(), map, wkVarIvm.oa(), dzVarOa.oa(), dzVarOa.uef());
            } else {
                throw new IOException(dzVarOa.lw());
            }
            uef(oaVar, dzVarOa);
            return oaVar;
        } catch (Throwable th) {
            return new com.bytedance.sdk.component.xs.oa(false, 5001, th.getMessage(), null, "BODY_NULL_BODY", 1L, 1L);
        }
    }

    public void uef(String str, boolean z2) {
        if (z2) {
            uef("application/json; charset=utf-8", ivm(str));
            oa(HttpHeaders.CONTENT_ENCODING, "gzip");
        } else {
            lw(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Charset uef(cz czVar) {
        try {
            return czVar != null ? czVar.uef(com.bytedance.sdk.component.oa.uef.oa.cz.uef) : com.bytedance.sdk.component.oa.uef.oa.cz.uef;
        } catch (Exception unused) {
            return com.bytedance.sdk.component.oa.uef.oa.cz.uef;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public cz uef(wk wkVar) {
        try {
            return wkVar.lw();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(com.bytedance.sdk.component.xs.oa oaVar, dz dzVar) {
        if (oaVar == null || dzVar == null) {
            return;
        }
        oaVar.uef(dzVar.bcc());
    }
}
