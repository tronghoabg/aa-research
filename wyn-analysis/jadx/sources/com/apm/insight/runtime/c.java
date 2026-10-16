package com.apm.insight.runtime;

import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final List<ICrashCallback> f20632a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<ICrashCallback> f20633b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<ICrashCallback> f20634c = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List<ICrashCallback> f20635d = new CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final List<IOOMCallback> f20636e = new CopyOnWriteArrayList();

    /* renamed from: com.apm.insight.runtime.c$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20637a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f20637a = iArr;
            try {
                iArr[CrashType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20637a[CrashType.ANR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20637a[CrashType.JAVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20637a[CrashType.LAUNCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20637a[CrashType.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public final void a(ICrashCallback iCrashCallback, CrashType crashType) {
        int i5 = AnonymousClass1.f20637a[crashType.ordinal()];
        if (i5 == 1) {
            this.f20632a.add(iCrashCallback);
            this.f20633b.add(iCrashCallback);
            this.f20634c.add(iCrashCallback);
            this.f20635d.add(iCrashCallback);
            return;
        }
        if (i5 == 2) {
            this.f20635d.add(iCrashCallback);
            return;
        }
        if (i5 == 3) {
            this.f20633b.add(iCrashCallback);
        } else if (i5 == 4) {
            this.f20632a.add(iCrashCallback);
        } else {
            if (i5 != 5) {
                return;
            }
            this.f20634c.add(iCrashCallback);
        }
    }

    public final void b(ICrashCallback iCrashCallback, CrashType crashType) {
        int i5 = AnonymousClass1.f20637a[crashType.ordinal()];
        if (i5 == 1) {
            this.f20632a.remove(iCrashCallback);
            this.f20633b.remove(iCrashCallback);
            this.f20634c.remove(iCrashCallback);
            this.f20635d.remove(iCrashCallback);
            return;
        }
        if (i5 == 2) {
            this.f20635d.remove(iCrashCallback);
            return;
        }
        if (i5 == 3) {
            this.f20633b.remove(iCrashCallback);
        } else if (i5 == 4) {
            this.f20632a.remove(iCrashCallback);
        } else {
            if (i5 != 5) {
                return;
            }
            this.f20634c.remove(iCrashCallback);
        }
    }

    public final List<ICrashCallback> c() {
        return this.f20633b;
    }

    public final List<ICrashCallback> d() {
        return this.f20634c;
    }

    public final List<ICrashCallback> e() {
        return this.f20635d;
    }

    public final void a(IOOMCallback iOOMCallback) {
        this.f20636e.add(iOOMCallback);
    }

    public final void b(IOOMCallback iOOMCallback) {
        this.f20636e.remove(iOOMCallback);
    }

    public final List<IOOMCallback> a() {
        return this.f20636e;
    }

    public final List<ICrashCallback> b() {
        return this.f20632a;
    }
}
