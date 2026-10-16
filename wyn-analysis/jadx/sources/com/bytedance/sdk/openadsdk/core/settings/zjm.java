package com.bytedance.sdk.openadsdk.core.settings;

import R8.v;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.core.settings.lw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.utils.cq;
import com.bytedance.sdk.openadsdk.utils.km;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class zjm implements lw {
    private boolean dj;
    private final String xs;
    private final uef zjm;
    private final ConcurrentHashMap<String, Object> yo = new ConcurrentHashMap<>();
    private final Object moa = new Object();
    private final Object lw = new Object();
    private final CountDownLatch ivm = new CountDownLatch(1);
    private Properties bcc = new Properties();
    private volatile boolean cz = false;

    public interface uef {
        void oa();

        void uef();
    }

    public zjm(uef uefVar) {
        String strUef = uef();
        this.xs = strUef;
        this.zjm = uefVar;
        km.uef(new com.bytedance.sdk.component.bcc.oa.yo(v.f("SetL_", strUef)) { // from class: com.bytedance.sdk.openadsdk.core.settings.zjm.1
            @Override // java.lang.Runnable
            public void run() {
                zjm.this.uef(false);
            }
        });
    }

    private void ivm() throws InterruptedException {
        if (this.dj && sy.uef() != null) {
            uef(true);
        }
        if (this.cz) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            this.ivm.await(km.ivm() ? 4 : 8, TimeUnit.SECONDS);
        } catch (InterruptedException e7) {
            dhk.uef("SdkSettings.Prop", "awaitLoadedLocked: ", e7);
        }
    }

    private File xs() {
        Context contextUef = sy.uef();
        if (contextUef != null) {
            return new File(contextUef.getFilesDir(), this.xs);
        }
        return null;
    }

    public void lw() {
        uef uefVar = this.zjm;
        if (uefVar != null) {
            uefVar.oa();
        }
    }

    public void moa() {
        File fileXs = xs();
        if (fileXs == null || !fileXs.exists()) {
            return;
        }
        fileXs.delete();
    }

    public abstract String uef();

    public boolean yo() {
        return this.cz;
    }

    public lw.uef oa() {
        return new oa();
    }

    public String uef(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return str2;
        }
        ivm();
        return this.bcc.getProperty(str, str2);
    }

    public int uef(String str, int i5) {
        if (str != null && !str.isEmpty()) {
            ivm();
            try {
                return Integer.parseInt(this.bcc.getProperty(str, String.valueOf(i5)));
            } catch (NumberFormatException e7) {
                dhk.uef("SdkSettings.Prop", "", e7);
            }
        }
        return i5;
    }

    public long uef(String str, long j8) {
        if (str != null && !str.isEmpty()) {
            ivm();
            try {
                return Long.parseLong(this.bcc.getProperty(str, String.valueOf(j8)));
            } catch (NumberFormatException e7) {
                dhk.uef("SdkSettings.Prop", "", e7);
            }
        }
        return j8;
    }

    public float uef(String str, float f10) throws InterruptedException {
        if (str != null && !str.isEmpty()) {
            ivm();
            try {
                return Float.parseFloat(this.bcc.getProperty(str, String.valueOf(f10)));
            } catch (NumberFormatException e7) {
                dhk.uef("SdkSettings.Prop", "", e7);
            }
        }
        return f10;
    }

    public class oa implements lw.uef {

        /* renamed from: oa, reason: collision with root package name */
        private final Map<String, Object> f25751oa = new HashMap();
        private final Object yo = new Object();

        public oa() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.lw.uef
        public void uef() {
            Object obj;
            Properties properties = new Properties();
            synchronized (this.yo) {
                try {
                    properties.putAll(zjm.this.bcc);
                    boolean z2 = false;
                    for (Map.Entry<String, Object> entry : this.f25751oa.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value != this && value != null) {
                            if (properties.containsKey(key) && (obj = properties.get(key)) != null && obj.equals(value)) {
                            }
                            properties.put(key, String.valueOf(value));
                            z2 = true;
                        } else if (properties.containsKey(key)) {
                            properties.remove(key);
                            z2 = true;
                        }
                    }
                    this.f25751oa.clear();
                    if (z2) {
                        zjm.this.uef(properties);
                        zjm.this.bcc = properties;
                        zjm.this.yo.clear();
                        zjm.this.dj = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.lw.uef
        public lw.uef uef(String str, String str2) {
            synchronized (this.yo) {
                this.f25751oa.put(str, str2);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.lw.uef
        public lw.uef uef(String str, int i5) {
            synchronized (this.yo) {
                this.f25751oa.put(str, Integer.valueOf(i5));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.lw.uef
        public lw.uef uef(String str, long j8) {
            synchronized (this.yo) {
                this.f25751oa.put(str, Long.valueOf(j8));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.lw.uef
        public lw.uef uef(String str) {
            synchronized (this.yo) {
                this.f25751oa.put(str, this);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.lw.uef
        public lw.uef uef(String str, float f10) {
            synchronized (this.yo) {
                this.f25751oa.put(str, Float.valueOf(f10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.lw.uef
        public lw.uef uef(String str, boolean z2) {
            synchronized (this.yo) {
                this.f25751oa.put(str, Boolean.valueOf(z2));
            }
            return this;
        }
    }

    public boolean uef(String str, boolean z2) throws InterruptedException {
        if (str != null && !str.isEmpty()) {
            ivm();
            try {
                return Boolean.parseBoolean(this.bcc.getProperty(str, String.valueOf(z2)));
            } catch (Exception e7) {
                dhk.uef("SdkSettings.Prop", "", e7);
            }
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x009d A[Catch: all -> 0x000b, TryCatch #3 {all -> 0x000b, blocks: (B:4:0x0003, B:7:0x0009, B:11:0x000e, B:13:0x0015, B:15:0x001e, B:17:0x0024, B:26:0x0054, B:27:0x0059, B:33:0x0069, B:34:0x006c, B:46:0x0087, B:47:0x008a, B:48:0x008f, B:43:0x007f, B:44:0x0082, B:50:0x0092, B:52:0x009d, B:54:0x00a1, B:55:0x00a4, B:49:0x0090, B:31:0x0060, B:41:0x0076), top: B:62:0x0003, inners: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uef(boolean r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.moa
            monitor-enter(r0)
            boolean r1 = r6.cz     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Le
            if (r7 != 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r7 = move-exception
            goto La6
        Le:
            android.content.Context r7 = com.bytedance.sdk.openadsdk.core.sy.uef()     // Catch: java.lang.Throwable -> Lb
            r1 = 1
            if (r7 == 0) goto L90
            r7 = 0
            r6.dj = r7     // Catch: java.lang.Throwable -> Lb
            java.io.File r7 = r6.xs()     // Catch: java.lang.Throwable -> Lb
            if (r7 == 0) goto L92
            boolean r2 = r7.exists()     // Catch: java.lang.Throwable -> Lb
            if (r2 == 0) goto L92
            java.util.Properties r2 = new java.util.Properties     // Catch: java.lang.Throwable -> Lb
            r2.<init>()     // Catch: java.lang.Throwable -> Lb
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L5f java.lang.OutOfMemoryError -> L71
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L5f java.lang.OutOfMemoryError -> L71
            r2.load(r4)     // Catch: java.lang.Throwable -> L51 java.lang.OutOfMemoryError -> L5d
            r2.size()     // Catch: java.lang.Throwable -> L51 java.lang.OutOfMemoryError -> L5d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51 java.lang.OutOfMemoryError -> L5d
            java.lang.String r5 = "items from "
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L51 java.lang.OutOfMemoryError -> L5d
            java.lang.String r5 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L51 java.lang.OutOfMemoryError -> L5d
            r3.append(r5)     // Catch: java.lang.Throwable -> L51 java.lang.OutOfMemoryError -> L5d
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L51 java.lang.OutOfMemoryError -> L5d
            if (r3 != 0) goto L54
            r6.bcc = r2     // Catch: java.lang.Throwable -> L51 java.lang.OutOfMemoryError -> L5d
            j$.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r2 = r6.yo     // Catch: java.lang.Throwable -> L51 java.lang.OutOfMemoryError -> L5d
            r2.clear()     // Catch: java.lang.Throwable -> L51 java.lang.OutOfMemoryError -> L5d
            goto L54
        L51:
            r7 = move-exception
            r3 = r4
            goto L60
        L54:
            com.bytedance.sdk.openadsdk.utils.cq.uef(r4)     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r7 = r6.moa     // Catch: java.lang.Throwable -> Lb
        L59:
            r7.notifyAll()     // Catch: java.lang.Throwable -> Lb
            goto L92
        L5d:
            r3 = r4
            goto L71
        L5f:
            r7 = move-exception
        L60:
            java.lang.String r2 = "SdkSettings.Prop"
            java.lang.String r4 = "reload: "
            com.bytedance.sdk.component.utils.dhk.uef(r2, r4, r7)     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L6c
            com.bytedance.sdk.openadsdk.utils.cq.uef(r3)     // Catch: java.lang.Throwable -> Lb
        L6c:
            java.lang.Object r7 = r6.moa     // Catch: java.lang.Throwable -> Lb
            goto L59
        L6f:
            r7 = move-exception
            goto L85
        L71:
            com.bytedance.sdk.component.utils.xs.yo(r7)     // Catch: java.lang.Throwable -> L75
            goto L7d
        L75:
            r7 = move-exception
            java.lang.String r2 = "SdkSettings.Prop"
            java.lang.String r4 = "delete: "
            com.bytedance.sdk.component.utils.dhk.uef(r2, r4, r7)     // Catch: java.lang.Throwable -> L6f
        L7d:
            if (r3 == 0) goto L82
            com.bytedance.sdk.openadsdk.utils.cq.uef(r3)     // Catch: java.lang.Throwable -> Lb
        L82:
            java.lang.Object r7 = r6.moa     // Catch: java.lang.Throwable -> Lb
            goto L59
        L85:
            if (r3 == 0) goto L8a
            com.bytedance.sdk.openadsdk.utils.cq.uef(r3)     // Catch: java.lang.Throwable -> Lb
        L8a:
            java.lang.Object r1 = r6.moa     // Catch: java.lang.Throwable -> Lb
            r1.notifyAll()     // Catch: java.lang.Throwable -> Lb
            throw r7     // Catch: java.lang.Throwable -> Lb
        L90:
            r6.dj = r1     // Catch: java.lang.Throwable -> Lb
        L92:
            boolean r7 = r6.cz     // Catch: java.lang.Throwable -> Lb
            java.util.concurrent.CountDownLatch r2 = r6.ivm     // Catch: java.lang.Throwable -> Lb
            r2.countDown()     // Catch: java.lang.Throwable -> Lb
            r6.cz = r1     // Catch: java.lang.Throwable -> Lb
            if (r7 != 0) goto La4
            com.bytedance.sdk.openadsdk.core.settings.zjm$uef r7 = r6.zjm     // Catch: java.lang.Throwable -> Lb
            if (r7 == 0) goto La4
            r7.uef()     // Catch: java.lang.Throwable -> Lb
        La4:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        La6:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.settings.zjm.uef(boolean):void");
    }

    public <T> T uef(String str, T t10, lw.oa<T> oaVar) throws InterruptedException {
        T tOa;
        if (str != null && !str.isEmpty()) {
            T t11 = (T) this.yo.get(str);
            if (t11 != null) {
                return t11;
            }
            ivm();
            String property = this.bcc.getProperty(str, null);
            if (property != null && oaVar != null && (tOa = oaVar.oa(property)) != null) {
                this.yo.put(str, tOa);
                return tOa;
            }
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(Properties properties) {
        FileOutputStream fileOutputStream;
        synchronized (this.lw) {
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(xs());
                } catch (Exception e7) {
                    e = e7;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                properties.store(fileOutputStream, (String) null);
                cq.uef(fileOutputStream);
            } catch (Exception e10) {
                e = e10;
                fileOutputStream2 = fileOutputStream;
                dhk.uef("SdkSettings.Prop", "saveToLocal: ", e);
                if (fileOutputStream2 != null) {
                    cq.uef(fileOutputStream2);
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    cq.uef(fileOutputStream2);
                }
                throw th;
            }
        }
    }
}
