package com.bytedance.sdk.openadsdk.core.cz;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.core.settings.dj;
import com.bytedance.sdk.openadsdk.core.sy;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes3.dex */
public class uef {

    /* renamed from: oa, reason: collision with root package name */
    private static volatile boolean f25563oa;
    private static volatile uef uef;
    private static volatile long yo;
    private Handler lw;
    private final Queue<C0091uef> moa = new LinkedList();
    private final dj ivm = sy.moa();

    /* renamed from: com.bytedance.sdk.openadsdk.core.cz.uef$uef, reason: collision with other inner class name */
    public static class C0091uef {

        /* renamed from: oa, reason: collision with root package name */
        private final String f25564oa;
        private final long uef;

        private C0091uef(long j8, String str) {
            this.uef = j8;
            this.f25564oa = str;
        }
    }

    private uef() {
    }

    private synchronized boolean oa(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iDxx = this.ivm.dxx();
        long jFz = this.ivm.fz();
        if (this.moa.size() <= 0 || this.moa.size() < iDxx) {
            this.moa.offer(new C0091uef(jCurrentTimeMillis, str));
        } else {
            long jAbs = Math.abs(jCurrentTimeMillis - this.moa.peek().uef);
            if (jAbs <= jFz) {
                oa(jFz - jAbs);
                return true;
            }
            this.moa.poll();
            this.moa.offer(new C0091uef(jCurrentTimeMillis, str));
        }
        return false;
    }

    public synchronized String yo() {
        String str;
        try {
            HashMap map = new HashMap();
            for (C0091uef c0091uef : this.moa) {
                if (map.containsKey(c0091uef.f25564oa)) {
                    map.put(c0091uef.f25564oa, Integer.valueOf(((Integer) map.get(c0091uef.f25564oa)).intValue() + 1));
                } else {
                    map.put(c0091uef.f25564oa, 1);
                }
            }
            str = "";
            int i5 = Integer.MIN_VALUE;
            for (String str2 : map.keySet()) {
                int iIntValue = ((Integer) map.get(str2)).intValue();
                if (i5 < iIntValue) {
                    str = str2;
                    i5 = iIntValue;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return str;
    }

    public static uef uef() {
        if (uef == null) {
            synchronized (uef.class) {
                try {
                    if (uef == null) {
                        uef = new uef();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }

    public synchronized boolean uef(String str) {
        try {
            if (oa(str)) {
                uef(true);
                uef(yo);
            } else {
                uef(false);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f25563oa;
    }

    private synchronized void uef(long j8) {
        try {
            if (this.lw == null) {
                this.lw = new Handler(Looper.getMainLooper());
            }
            this.lw.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cz.uef.1
                @Override // java.lang.Runnable
                public void run() {
                    uef.this.uef(false);
                }
            }, j8);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean oa() {
        return f25563oa;
    }

    private synchronized void oa(long j8) {
        yo = j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void uef(boolean z2) {
        f25563oa = z2;
    }
}
