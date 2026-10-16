package com.google.android.libraries.phenotype.client;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f6012a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f6013b = false;

    /* renamed from: c, reason: collision with root package name */
    private static volatile i f6014c = null;

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f6015d = false;

    /* renamed from: e, reason: collision with root package name */
    private static volatile i f6016e;

    static void a() {
        f6015d = true;
    }

    static void b() {
        if (f6016e == null) {
            f6016e = new i();
        }
    }

    static void c() {
        if (f6014c == null) {
            f6014c = new i();
        }
    }

    static void d() {
        synchronized (f6012a) {
        }
    }
}
