package com.bytedance.sdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import org.apache.tika.metadata.TikaCoreProperties;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class oa {
    private static ArrayMap<File, oa> cq = null;

    /* renamed from: oa, reason: collision with root package name */
    private static boolean f25052oa = false;
    protected static uef uef;
    private static ArrayMap<String, File> wrv;
    private long bcc;
    private long cz;
    private final File dj;
    private volatile boolean ivm;
    private Properties lw;
    private final Object moa;
    private int xs;
    private final Object yo;
    private final File zjm;

    /* renamed from: com.bytedance.sdk.component.oa$oa, reason: collision with other inner class name */
    public static class C0063oa {
        boolean lw;
        volatile boolean moa;

        /* renamed from: oa, reason: collision with root package name */
        final Properties f25054oa;
        final long uef;
        final CountDownLatch yo;

        public void uef(boolean z2, boolean z10) {
            this.lw = z2;
            this.moa = z10;
            this.yo.countDown();
        }

        private C0063oa(long j8, Properties properties) {
            this.yo = new CountDownLatch(1);
            this.moa = false;
            this.lw = false;
            this.uef = j8;
            this.f25054oa = properties;
        }
    }

    public interface uef {
        HandlerThread uef(String str, int i5);

        ExecutorService uef();
    }

    private oa(File file) {
        Object obj = new Object();
        this.yo = obj;
        this.moa = new Object();
        this.lw = new Properties();
        this.ivm = false;
        this.xs = 0;
        this.zjm = file;
        this.dj = uef(file);
        synchronized (obj) {
            this.ivm = false;
        }
        uef uefVar = uef;
        if (uefVar == null || uefVar.uef() == null) {
            new Thread("TTPropHelper") { // from class: com.bytedance.sdk.component.oa.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    oa.this.uef();
                }
            }.start();
        } else {
            uef.uef().execute(new Runnable() { // from class: com.bytedance.sdk.component.oa.2
                @Override // java.lang.Runnable
                public void run() {
                    oa.this.uef();
                }
            });
        }
    }

    public static /* synthetic */ int cz(oa oaVar) {
        int i5 = oaVar.xs;
        oaVar.xs = i5 - 1;
        return i5;
    }

    public static /* synthetic */ long ivm(oa oaVar) {
        long j8 = oaVar.bcc;
        oaVar.bcc = 1 + j8;
        return j8;
    }

    public static /* synthetic */ int lw(oa oaVar) {
        int i5 = oaVar.xs;
        oaVar.xs = i5 + 1;
        return i5;
    }

    private void moa() throws InterruptedException {
        while (!this.ivm) {
            try {
                this.yo.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public yo oa() {
        return new yo();
    }

    public class yo implements SharedPreferences.Editor {

        /* renamed from: oa, reason: collision with root package name */
        private final Object f25079oa = new Object();
        private final Map<String, Object> yo = new HashMap();
        private boolean moa = false;

        public yo() {
        }

        private C0063oa oa() {
            Properties properties;
            long j8;
            Object obj;
            boolean z2;
            synchronized (oa.this.yo) {
                try {
                    if (oa.this.xs > 0) {
                        Properties properties2 = new Properties();
                        properties2.putAll(oa.this.lw);
                        oa.this.lw = properties2;
                    }
                    properties = oa.this.lw;
                    oa.lw(oa.this);
                    synchronized (this.f25079oa) {
                        try {
                            boolean z10 = false;
                            if (this.moa) {
                                if (properties.isEmpty()) {
                                    z2 = false;
                                } else {
                                    properties.clear();
                                    z2 = true;
                                }
                                this.moa = false;
                                z10 = z2;
                            }
                            for (Map.Entry<String, Object> entry : this.yo.entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if (value == this || value == null) {
                                    if (properties.containsKey(key)) {
                                        properties.remove(key);
                                        z10 = true;
                                    }
                                } else if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(String.valueOf(value))) {
                                    properties.put(key, String.valueOf(value));
                                    z10 = true;
                                }
                            }
                            this.yo.clear();
                            if (z10) {
                                oa.ivm(oa.this);
                            }
                            j8 = oa.this.bcc;
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new C0063oa(j8, properties);
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            oa.this.uef(oa(), false);
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            long jCurrentTimeMillis = oa.f25052oa ? System.currentTimeMillis() : 0L;
            C0063oa c0063oaOa = oa();
            oa.this.uef(c0063oaOa, true);
            try {
                c0063oaOa.yo.await();
                if (oa.f25052oa) {
                    Log.d("TTPropHelper", oa.this.zjm.getName() + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + c0063oaOa.uef + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                }
                return c0063oaOa.moa;
            } catch (InterruptedException unused) {
                if (!oa.f25052oa) {
                    return false;
                }
                Log.d("TTPropHelper", oa.this.zjm.getName() + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + c0063oaOa.uef + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                return false;
            } catch (Throwable th) {
                if (oa.f25052oa) {
                    Log.d("TTPropHelper", oa.this.zjm.getName() + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + c0063oaOa.uef + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                }
                throw th;
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
            return uef(str, (Set<String>) set);
        }

        public yo uef(String str, Set<String> set) {
            synchronized (this.f25079oa) {
                this.yo.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public yo putInt(String str, int i5) {
            synchronized (this.f25079oa) {
                this.yo.put(str, Integer.valueOf(i5));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public yo putLong(String str, long j8) {
            synchronized (this.f25079oa) {
                this.yo.put(str, Long.valueOf(j8));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public yo putFloat(String str, float f10) {
            synchronized (this.f25079oa) {
                this.yo.put(str, Float.valueOf(f10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public yo putString(String str, String str2) {
            synchronized (this.f25079oa) {
                this.yo.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public yo putBoolean(String str, boolean z2) {
            synchronized (this.f25079oa) {
                this.yo.put(str, Boolean.valueOf(z2));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public yo remove(String str) {
            synchronized (this.f25079oa) {
                this.yo.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public yo clear() {
            synchronized (this.f25079oa) {
                this.moa = true;
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0126 A[Catch: all -> 0x012b, TryCatch #8 {all -> 0x012b, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x0122, B:80:0x0126, B:84:0x012f, B:86:0x0138, B:88:0x0140, B:90:0x014c, B:98:0x0197, B:99:0x0198, B:59:0x00f0, B:77:0x0121, B:62:0x00f5, B:63:0x00fb, B:76:0x011a, B:97:0x0196, B:96:0x018d), top: B:121:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0138 A[Catch: all -> 0x012b, TryCatch #8 {all -> 0x012b, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x0122, B:80:0x0126, B:84:0x012f, B:86:0x0138, B:88:0x0140, B:90:0x014c, B:98:0x0197, B:99:0x0198, B:59:0x00f0, B:77:0x0121, B:62:0x00f5, B:63:0x00fb, B:76:0x011a, B:97:0x0196, B:96:0x018d), top: B:121:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014c A[Catch: all -> 0x012b, TRY_LEAVE, TryCatch #8 {all -> 0x012b, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x0122, B:80:0x0126, B:84:0x012f, B:86:0x0138, B:88:0x0140, B:90:0x014c, B:98:0x0197, B:99:0x0198, B:59:0x00f0, B:77:0x0121, B:62:0x00f5, B:63:0x00fb, B:76:0x011a, B:97:0x0196, B:96:0x018d), top: B:121:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void oa(com.bytedance.sdk.component.oa.C0063oa r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.oa.oa(com.bytedance.sdk.component.oa$oa, boolean):void");
    }

    public static void uef(@NotNull uef uefVar) {
        uef = uefVar;
    }

    public static oa uef(@NotNull Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_prop";
        }
        synchronized (oa.class) {
            try {
                if (wrv == null) {
                    wrv = new ArrayMap<>();
                }
                File file = wrv.get(str);
                if (file == null) {
                    file = new File(context.getFilesDir(), str);
                    wrv.put(str, file);
                }
                if (cq == null) {
                    cq = new ArrayMap<>();
                }
                oa oaVar = cq.get(file);
                if (oaVar != null) {
                    return oaVar;
                }
                oa oaVar2 = new oa(file);
                cq.put(file, oaVar2);
                return oaVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static File uef(File file) {
        return new File(file.getPath() + ".bak");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a1 -> B:62:0x00bb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uef() {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.oa.uef():void");
    }

    public String uef(String str, String str2) {
        String property;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        synchronized (this.yo) {
            moa();
            property = this.lw.getProperty(str, str2);
        }
        return property;
    }

    public int uef(String str, int i5) {
        int i10;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.yo) {
                try {
                    try {
                        moa();
                        i10 = Integer.parseInt(this.lw.getProperty(str, String.valueOf(i5)));
                    } catch (NumberFormatException e7) {
                        Log.e("TTPropHelper", e7.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i10;
        }
        return i5;
    }

    public long uef(String str, long j8) {
        long j10;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.yo) {
                try {
                    try {
                        moa();
                        j10 = Long.parseLong(this.lw.getProperty(str, String.valueOf(j8)));
                    } catch (NumberFormatException e7) {
                        Log.e("TTPropHelper", e7.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return j10;
        }
        return j8;
    }

    public boolean uef(String str, boolean z2) {
        boolean z10;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.yo) {
                try {
                    try {
                        moa();
                        z10 = Boolean.parseBoolean(this.lw.getProperty(str, String.valueOf(z2)));
                    } catch (NumberFormatException e7) {
                        Log.e("TTPropHelper", e7.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z10;
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(final C0063oa c0063oa, final boolean z2) {
        boolean z10;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.oa.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (oa.this.moa) {
                    try {
                        oa.this.oa(c0063oa, z2);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                synchronized (oa.this.yo) {
                    oa.cz(oa.this);
                }
            }
        };
        if (z2) {
            synchronized (this.yo) {
                z10 = this.xs == 1;
            }
            if (z10) {
                runnable.run();
                return;
            }
        }
        com.bytedance.sdk.component.yo.uef(runnable, true ^ z2);
    }
}
