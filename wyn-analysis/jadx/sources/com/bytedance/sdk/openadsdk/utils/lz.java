package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;

/* loaded from: classes3.dex */
public class lz implements Thread.UncaughtExceptionHandler {
    public static volatile boolean uef;

    /* renamed from: oa, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f26157oa = Thread.getDefaultUncaughtExceptionHandler();
    private String yo;

    private lz() {
        Thread.setDefaultUncaughtExceptionHandler(this);
        oa();
    }

    private void oa() {
        Context contextUef = com.bytedance.sdk.openadsdk.core.sy.uef();
        if (contextUef == null) {
            return;
        }
        try {
            File file = new File(contextUef.getFilesDir(), "TTCache");
            file.mkdirs();
            this.yo = file.getPath();
        } catch (Throwable unused) {
        }
    }

    public static lz uef() {
        return new lz();
    }

    private void yo() {
        try {
            com.bytedance.sdk.openadsdk.component.xs.uef.uef(com.bytedance.sdk.openadsdk.core.sy.uef());
        } catch (Throwable unused) {
        }
        try {
            if (oa.yo()) {
                com.bytedance.sdk.openadsdk.component.reward.sy.uef(com.bytedance.sdk.openadsdk.core.sy.uef()).lw();
            } else {
                com.bytedance.sdk.openadsdk.component.reward.bs.uef(com.bytedance.sdk.openadsdk.core.sy.uef()).uef();
            }
        } catch (Throwable unused2) {
        }
        try {
            if (oa.yo()) {
                com.bytedance.sdk.openadsdk.component.reward.xs.uef(com.bytedance.sdk.openadsdk.core.sy.uef()).lw();
            } else {
                com.bytedance.sdk.openadsdk.component.reward.ivm.uef(com.bytedance.sdk.openadsdk.core.sy.uef()).uef();
            }
        } catch (Throwable unused3) {
        }
        try {
            com.bytedance.sdk.openadsdk.core.settings.dj.oa().uef();
        } catch (Throwable unused4) {
        }
        try {
            com.bytedance.sdk.component.adexpress.uef.oa.oa.oa();
        } catch (Throwable unused5) {
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        uef = true;
        com.bytedance.sdk.component.utils.bcc.uef = true;
        com.bytedance.sdk.component.bcc.oa.lw.yo = true;
        boolean zContains = false;
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            if (string != null) {
                zContains = string.contains(AdSlot.class.getPackage().getName());
            }
        } catch (Throwable unused) {
        }
        if (zContains) {
            uef(thread, th);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f26157oa;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.Properties] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.Properties] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void uef(java.lang.Thread r12, java.lang.Throwable r13) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.lz.uef(java.lang.Thread, java.lang.Throwable):void");
    }
}
