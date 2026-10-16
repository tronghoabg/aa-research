package com.google.firebase.components;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f8933a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f8934b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f8935c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8936d;

    /* renamed from: e, reason: collision with root package name */
    private final int f8937e;

    /* renamed from: f, reason: collision with root package name */
    private final g f8938f;

    /* renamed from: g, reason: collision with root package name */
    private final Set f8939g;

    private c(String str, Set set, Set set2, int i2, int i3, g gVar, Set set3) {
        this.f8933a = str;
        this.f8934b = DesugarCollections.unmodifiableSet(set);
        this.f8935c = DesugarCollections.unmodifiableSet(set2);
        this.f8936d = i2;
        this.f8937e = i3;
        this.f8938f = gVar;
        this.f8939g = DesugarCollections.unmodifiableSet(set3);
    }

    public static b a(ae aeVar) {
        return new b(aeVar, new ae[0]);
    }

    public static b b(Class cls) {
        return new b(cls, new Class[0]);
    }

    @SafeVarargs
    public static b c(ae aeVar, ae... aeVarArr) {
        return new b(aeVar, aeVarArr);
    }

    @SafeVarargs
    public static b d(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    public static b e(Class cls) {
        b bVarB = b(cls);
        bVarB.f8930e = 1;
        return bVarB;
    }

    public static c f(Object obj, Class cls) {
        b bVarE = e(cls);
        bVarE.c(new a(obj, 1));
        return bVarE.a();
    }

    @SafeVarargs
    public static c g(Object obj, Class cls, Class... clsArr) {
        b bVar = new b(cls, clsArr);
        bVar.c(new a(obj, 0));
        return bVar.a();
    }

    public final c h(g gVar) {
        return new c(this.f8933a, this.f8934b, this.f8935c, this.f8936d, this.f8937e, gVar, this.f8939g);
    }

    public final g i() {
        return this.f8938f;
    }

    public final String j() {
        return this.f8933a;
    }

    public final Set k() {
        return this.f8935c;
    }

    public final Set l() {
        return this.f8934b;
    }

    public final Set m() {
        return this.f8939g;
    }

    public final boolean n() {
        return this.f8936d == 1;
    }

    public final boolean o() {
        return this.f8936d == 2;
    }

    public final boolean p() {
        return this.f8937e == 0;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f8934b.toArray()) + ">{" + this.f8936d + ", type=" + this.f8937e + ", deps=" + Arrays.toString(this.f8935c.toArray()) + "}";
    }

    /* synthetic */ c(String str, Set set, Set set2, int i2, int i3, g gVar, Set set3, byte[] bArr) {
        this(str, set, set2, i2, i3, gVar, set3);
    }
}
