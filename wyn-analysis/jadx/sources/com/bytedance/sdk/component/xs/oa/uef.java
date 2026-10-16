package com.bytedance.sdk.component.xs.oa;

import N0.a;
import Va.M6;
import android.text.TextUtils;
import com.bytedance.sdk.component.oa.uef.dj;
import com.bytedance.sdk.component.oa.uef.wrv;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import org.apache.tika.metadata.HttpHeaders;

/* loaded from: classes.dex */
public class uef extends yo {
    private volatile boolean dj;

    /* renamed from: oa, reason: collision with root package name */
    public File f25110oa;
    public File uef;

    public uef(dj djVar) {
        super(djVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long ivm(Map<String, String> map) {
        String str = map.containsKey("content-length") ? map.get("content-length") : map.containsKey(HttpHeaders.CONTENT_LENGTH) ? map.get(HttpHeaders.CONTENT_LENGTH) : null;
        if (!TextUtils.isEmpty(str) && str != null) {
            try {
                return Long.valueOf(str).longValue();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lw(Map<String, String> map) {
        if (TextUtils.equals(map.get("Accept-Ranges"), "bytes") || TextUtils.equals(map.get("accept-ranges"), "bytes")) {
            return true;
        }
        String str = map.get("Content-Range");
        if (TextUtils.isEmpty(str)) {
            str = map.get("content-range");
        }
        return str != null && str.startsWith("bytes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean xs(Map<String, String> map) {
        return TextUtils.equals(map.get(HttpHeaders.CONTENT_ENCODING), "gzip");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zjm() {
        try {
            this.uef.delete();
        } catch (Throwable unused) {
        }
        try {
            this.f25110oa.delete();
        } catch (Throwable unused2) {
        }
    }

    @Override // com.bytedance.sdk.component.xs.oa.yo
    public void oa() {
        this.dj = true;
        super.oa();
    }

    public void uef(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.uef = new File(str, str2);
        this.f25110oa = new File(str, a.f(str2, ".temp"));
    }

    @Override // com.bytedance.sdk.component.xs.oa.yo
    public void uef(final com.bytedance.sdk.component.xs.uef.uef uefVar) {
        File file = this.uef;
        if (file == null || this.f25110oa == null) {
            if (uefVar != null) {
                uefVar.uef(this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
                return;
            }
            return;
        }
        if (file.exists() && this.uef.length() != 0 && uefVar != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.xs.oa oaVar = new com.bytedance.sdk.component.xs.oa(true, 200, "Success", null, null, jCurrentTimeMillis, jCurrentTimeMillis);
            oaVar.uef(this.uef);
            uefVar.uef(this, oaVar);
            return;
        }
        long length = this.f25110oa.length();
        final long j8 = length >= 0 ? length : 0L;
        wrv.uef uefVar2 = new wrv.uef();
        uefVar2.uef((Object) moa());
        uef(uefVar2);
        oa("Range", M6.s(new StringBuilder("bytes="), j8, "-"));
        if (TextUtils.isEmpty(this.bcc)) {
            uefVar.uef(this, new IOException("Url is Empty"));
            return;
        }
        try {
            uefVar2.oa(this.bcc);
            if (!TextUtils.isEmpty(this.lw)) {
                uefVar2.uef(this.lw);
            }
            int i5 = this.ivm;
            if (i5 > 0) {
                uefVar2.uef(i5);
            }
            oa(uefVar2);
            com.bytedance.sdk.component.oa.uef.oa oaVarUef = this.yo.uef(uefVar2.uef().oa());
            if (oaVarUef == null) {
                uefVar.uef(this, new IOException("new call error"));
            } else {
                oaVarUef.uef(new com.bytedance.sdk.component.oa.uef.yo() { // from class: com.bytedance.sdk.component.xs.oa.uef.1
                    @Override // com.bytedance.sdk.component.oa.uef.yo
                    public void uef(com.bytedance.sdk.component.oa.uef.oa oaVar2, IOException iOException) {
                        com.bytedance.sdk.component.xs.uef.uef uefVar3 = uefVar;
                        if (uefVar3 != null) {
                            uefVar3.uef(uef.this, iOException);
                        }
                        uef.this.zjm();
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:82:0x0203, code lost:
                    
                        r9.close();
                     */
                    /* JADX WARN: Removed duplicated region for block: B:119:0x0188 A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:54:0x0158 A[Catch: all -> 0x0144, TryCatch #1 {all -> 0x0144, blocks: (B:44:0x012b, B:46:0x0139, B:48:0x013d, B:51:0x0147, B:52:0x014e, B:54:0x0158, B:56:0x0164, B:59:0x0175, B:62:0x0180, B:63:0x0187, B:58:0x016c, B:65:0x018a, B:67:0x0192, B:70:0x019e, B:72:0x01a8, B:74:0x01b4, B:76:0x01c0, B:77:0x01cf, B:78:0x01dc, B:81:0x01f6), top: B:106:0x012b }] */
                    @Override // com.bytedance.sdk.component.oa.uef.yo
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public void uef(com.bytedance.sdk.component.oa.uef.oa r21, com.bytedance.sdk.component.oa.uef.dz r22) throws java.io.IOException {
                        /*
                            Method dump skipped, instructions count: 568
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.xs.oa.uef.AnonymousClass1.uef(com.bytedance.sdk.component.oa.uef.oa, com.bytedance.sdk.component.oa.uef.dz):void");
                    }
                });
            }
        } catch (IllegalArgumentException unused) {
            uefVar.uef(this, new IOException("Url is not a valid HTTP or HTTPS URL"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013a A[PHI: r10
  0x013a: PHI (r10v4 long) = (r10v3 long), (r10v8 long) binds: [B:43:0x0100, B:46:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a8  */
    @Override // com.bytedance.sdk.component.xs.oa.yo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.sdk.component.xs.oa uef() {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.xs.oa.uef.uef():com.bytedance.sdk.component.xs.oa");
    }
}
