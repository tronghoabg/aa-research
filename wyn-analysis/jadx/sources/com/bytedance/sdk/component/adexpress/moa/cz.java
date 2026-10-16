package com.bytedance.sdk.component.adexpress.moa;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class cz {

    public enum uef {
        HTML("text/html"),
        CSS("text/css"),
        JS("application/x-javascript"),
        IMAGE("image/*"),
        VIDEO("video/mp4");

        private String ivm;

        uef(String str) {
            this.ivm = str;
        }

        public String uef() {
            return this.ivm;
        }
    }

    public static uef uef(String str) {
        uef uefVar = uef.IMAGE;
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = Uri.parse(str).getPath();
                if (path != null) {
                    if (path.endsWith(".css")) {
                        return uef.CSS;
                    }
                    if (path.endsWith(".js")) {
                        return uef.JS;
                    }
                    if (!path.endsWith(".jpg") && !path.endsWith(".gif") && !path.endsWith(".png") && !path.endsWith(".jpeg") && !path.endsWith(".webp") && !path.endsWith(".bmp") && !path.endsWith(".ico")) {
                        if (path.endsWith(".html")) {
                            return uef.HTML;
                        }
                        if (path.endsWith(".mp4")) {
                            return uef.VIDEO;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return uefVar;
    }
}
