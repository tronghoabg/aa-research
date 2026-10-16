package com.google.firebase.concurrent;

import J9.C0664x;
import L8.a;
import L8.b;
import L8.g;
import L8.p;
import L8.t;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import y8.InterfaceC4566a;
import y8.InterfaceC4567b;
import y8.InterfaceC4568c;
import y8.d;

/* loaded from: classes4.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final p f27314a = new p(new g(2));

    /* renamed from: b, reason: collision with root package name */
    public static final p f27315b = new p(new g(3));

    /* renamed from: c, reason: collision with root package name */
    public static final p f27316c = new p(new g(4));

    /* renamed from: d, reason: collision with root package name */
    public static final p f27317d = new p(new g(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        t tVar = new t(InterfaceC4566a.class, ScheduledExecutorService.class);
        t[] tVarArr = {new t(InterfaceC4566a.class, ExecutorService.class), new t(InterfaceC4566a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(tVar);
        for (t tVar2 : tVarArr) {
            Fe.g.u(tVar2, "Null interface");
        }
        Collections.addAll(hashSet, tVarArr);
        b bVar = new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C0664x(10), hashSet3);
        t tVar3 = new t(InterfaceC4567b.class, ScheduledExecutorService.class);
        t[] tVarArr2 = {new t(InterfaceC4567b.class, ExecutorService.class), new t(InterfaceC4567b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(tVar3);
        for (t tVar4 : tVarArr2) {
            Fe.g.u(tVar4, "Null interface");
        }
        Collections.addAll(hashSet4, tVarArr2);
        b bVar2 = new b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new C0664x(11), hashSet6);
        t tVar5 = new t(InterfaceC4568c.class, ScheduledExecutorService.class);
        t[] tVarArr3 = {new t(InterfaceC4568c.class, ExecutorService.class), new t(InterfaceC4568c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(tVar5);
        for (t tVar6 : tVarArr3) {
            Fe.g.u(tVar6, "Null interface");
        }
        Collections.addAll(hashSet7, tVarArr3);
        b bVar3 = new b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new C0664x(12), hashSet9);
        a aVarA = b.a(new t(d.class, Executor.class));
        aVarA.f6989g = new C0664x(13);
        return Arrays.asList(bVar, bVar2, bVar3, aVarA.d());
    }
}
