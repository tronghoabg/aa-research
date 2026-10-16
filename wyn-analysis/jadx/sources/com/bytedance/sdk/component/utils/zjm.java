package com.bytedance.sdk.component.utils;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes.dex */
public class zjm {
    public static void uef(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e7) {
                throw e7;
            } catch (Exception unused) {
            }
        }
    }
}
