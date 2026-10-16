package com.apm.insight.k;

import com.apm.insight.CrashType;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static ConcurrentLinkedQueue<c> f20454a = new ConcurrentLinkedQueue<>();

    /* renamed from: com.apm.insight.k.c$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20455a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f20455a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20455a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20455a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private JSONObject f20456a;

        /* renamed from: b, reason: collision with root package name */
        private JSONObject f20457b;

        /* renamed from: c, reason: collision with root package name */
        private CrashType f20458c;

        public a(JSONObject jSONObject, CrashType crashType) {
            this.f20458c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f20456a = ((JSONArray) jSONObject.opt(JsonStorageKeyNames.DATA_KEY)).optJSONObject(0);
            } else {
                this.f20456a = jSONObject;
            }
            this.f20457b = jSONObject.optJSONObject("header");
        }

        public final String a() {
            return this.f20456a.optString("crash_thread_name", null);
        }

        public final long b() {
            return this.f20456a.optInt("app_start_time", -1);
        }

        public final String c() {
            int i5 = AnonymousClass1.f20455a[this.f20458c.ordinal()];
            if (i5 == 1) {
                return this.f20456a.optString(JsonStorageKeyNames.DATA_KEY, null);
            }
            if (i5 == 2) {
                return this.f20456a.optString("stack", null);
            }
            if (i5 != 3) {
                return null;
            }
            return this.f20456a.optString(JsonStorageKeyNames.DATA_KEY, null);
        }
    }

    public static void a(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<c> concurrentLinkedQueue = f20454a;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        new a(jSONObject, crashType);
        while (!f20454a.isEmpty()) {
            f20454a.poll();
        }
        f20454a = null;
    }
}
