package com.bytedance.sdk.component.adexpress.uef.oa;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bcc {
    private static com.bytedance.sdk.component.adexpress.uef.yo.uef uef;

    public static void moa() {
        yo.oa(lw.bcc(), oa(), "temp_pkg_info.json");
        uef = null;
    }

    public static synchronized com.bytedance.sdk.component.adexpress.uef.yo.uef oa() {
        return uef;
    }

    public static void uef() throws IOException {
        FileInputStream fileInputStream = null;
        try {
            try {
                File file = new File(lw.bcc(), "temp_pkg_info.json");
                long length = file.length();
                Long lValueOf = Long.valueOf(length);
                if (length > 0 && file.exists() && file.isFile()) {
                    byte[] bArr = new byte[lValueOf.intValue()];
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        fileInputStream2.read(bArr);
                        com.bytedance.sdk.component.adexpress.uef.yo.uef uefVarUef = com.bytedance.sdk.component.adexpress.uef.yo.uef.uef(new JSONObject(new String(bArr, "utf-8")));
                        if (uefVarUef != null) {
                            uef = uefVarUef;
                            uefVarUef.yo();
                        }
                        fileInputStream = fileInputStream2;
                    } catch (Throwable unused) {
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                            return;
                        }
                        return;
                    }
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException unused2) {
            }
        } catch (Throwable unused3) {
        }
    }

    public static void yo() throws IOException {
        yo.uef(lw.bcc(), oa(), "temp_pkg_info.json");
    }

    public static boolean oa(com.bytedance.sdk.component.adexpress.uef.yo.uef uefVar) {
        return yo.yo(oa(), uefVar);
    }

    public static synchronized void uef(com.bytedance.sdk.component.adexpress.uef.yo.uef uefVar) {
        if (uefVar != null) {
            if (uefVar.bcc()) {
                uef = uefVar;
            }
        }
    }

    public static boolean uef(String str) {
        return yo.uef(oa(), str);
    }
}
