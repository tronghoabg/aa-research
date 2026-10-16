package com.google.firebase.concurrent;

import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ae;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    static final com.google.firebase.components.w f8981a;

    /* renamed from: b, reason: collision with root package name */
    static final com.google.firebase.components.w f8982b;

    /* renamed from: c, reason: collision with root package name */
    static final com.google.firebase.components.w f8983c;

    /* renamed from: d, reason: collision with root package name */
    static final com.google.firebase.components.w f8984d;

    static {
        final int i2 = 1;
        f8981a = new com.google.firebase.components.w(new com.google.firebase.g.c() { // from class: com.google.firebase.concurrent.s
            @Override // com.google.firebase.g.c
            public final Object a() {
                int i3 = i2;
                return i3 != 0 ? i3 != 1 ? i3 != 2 ? Executors.newSingleThreadScheduledExecutor(new b("Firebase Scheduler", 0, null)) : ExecutorsRegistrar.d(Executors.newCachedThreadPool(new b("Firebase Blocking", 11, null))) : ExecutorsRegistrar.a() : ExecutorsRegistrar.d(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new b("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())));
            }
        });
        final int i3 = 0;
        f8982b = new com.google.firebase.components.w(new com.google.firebase.g.c() { // from class: com.google.firebase.concurrent.s
            @Override // com.google.firebase.g.c
            public final Object a() {
                int i32 = i3;
                return i32 != 0 ? i32 != 1 ? i32 != 2 ? Executors.newSingleThreadScheduledExecutor(new b("Firebase Scheduler", 0, null)) : ExecutorsRegistrar.d(Executors.newCachedThreadPool(new b("Firebase Blocking", 11, null))) : ExecutorsRegistrar.a() : ExecutorsRegistrar.d(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new b("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())));
            }
        });
        final int i4 = 2;
        f8983c = new com.google.firebase.components.w(new com.google.firebase.g.c() { // from class: com.google.firebase.concurrent.s
            @Override // com.google.firebase.g.c
            public final Object a() {
                int i32 = i4;
                return i32 != 0 ? i32 != 1 ? i32 != 2 ? Executors.newSingleThreadScheduledExecutor(new b("Firebase Scheduler", 0, null)) : ExecutorsRegistrar.d(Executors.newCachedThreadPool(new b("Firebase Blocking", 11, null))) : ExecutorsRegistrar.a() : ExecutorsRegistrar.d(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new b("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())));
            }
        });
        final int i5 = 3;
        f8984d = new com.google.firebase.components.w(new com.google.firebase.g.c() { // from class: com.google.firebase.concurrent.s
            @Override // com.google.firebase.g.c
            public final Object a() {
                int i32 = i5;
                return i32 != 0 ? i32 != 1 ? i32 != 2 ? Executors.newSingleThreadScheduledExecutor(new b("Firebase Scheduler", 0, null)) : ExecutorsRegistrar.d(Executors.newCachedThreadPool(new b("Firebase Blocking", 11, null))) : ExecutorsRegistrar.a() : ExecutorsRegistrar.d(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new b("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())));
            }
        });
    }

    static /* synthetic */ ScheduledExecutorService a() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        builderDetectNetwork.detectResourceMismatches();
        builderDetectNetwork.detectUnbufferedIo();
        return d(Executors.newFixedThreadPool(4, new b("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScheduledExecutorService d(ExecutorService executorService) {
        return new o(executorService, (ScheduledExecutorService) f8984d.a());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<com.google.firebase.components.c<?>> getComponents() {
        final int i2 = 2;
        final int i3 = 0;
        final int i4 = 1;
        com.google.firebase.components.b bVarC = com.google.firebase.components.c.c(new ae(com.google.firebase.b.a.a.class, ScheduledExecutorService.class), new ae(com.google.firebase.b.a.a.class, ExecutorService.class), new ae(com.google.firebase.b.a.a.class, Executor.class));
        bVarC.c(new com.google.firebase.components.g() { // from class: com.google.firebase.concurrent.t
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                int i5 = i4;
                return i5 != 0 ? i5 != 1 ? (ScheduledExecutorService) ExecutorsRegistrar.f8982b.a() : (ScheduledExecutorService) ExecutorsRegistrar.f8981a.a() : (ScheduledExecutorService) ExecutorsRegistrar.f8983c.a();
            }
        });
        com.google.firebase.components.b bVarC2 = com.google.firebase.components.c.c(new ae(com.google.firebase.b.a.b.class, ScheduledExecutorService.class), new ae(com.google.firebase.b.a.b.class, ExecutorService.class), new ae(com.google.firebase.b.a.b.class, Executor.class));
        bVarC2.c(new com.google.firebase.components.g() { // from class: com.google.firebase.concurrent.t
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                int i5 = i3;
                return i5 != 0 ? i5 != 1 ? (ScheduledExecutorService) ExecutorsRegistrar.f8982b.a() : (ScheduledExecutorService) ExecutorsRegistrar.f8981a.a() : (ScheduledExecutorService) ExecutorsRegistrar.f8983c.a();
            }
        });
        com.google.firebase.components.b bVarC3 = com.google.firebase.components.c.c(new ae(com.google.firebase.b.a.c.class, ScheduledExecutorService.class), new ae(com.google.firebase.b.a.c.class, ExecutorService.class), new ae(com.google.firebase.b.a.c.class, Executor.class));
        bVarC3.c(new com.google.firebase.components.g() { // from class: com.google.firebase.concurrent.t
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                int i5 = i2;
                return i5 != 0 ? i5 != 1 ? (ScheduledExecutorService) ExecutorsRegistrar.f8982b.a() : (ScheduledExecutorService) ExecutorsRegistrar.f8981a.a() : (ScheduledExecutorService) ExecutorsRegistrar.f8983c.a();
            }
        });
        com.google.firebase.components.b bVarA = com.google.firebase.components.c.a(new ae(com.google.firebase.b.a.d.class, Executor.class));
        bVarA.c(new com.google.firebase.abt.component.b(1));
        return Arrays.asList(bVarC.a(), bVarC2.a(), bVarC3.a(), bVarA.a());
    }
}
