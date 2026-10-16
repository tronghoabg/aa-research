package com.google.gson.internal.bind;

import Va.M6;
import ba.C1521a;
import com.google.gson.internal.Excluder;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;
import la.InterfaceC3449A;
import p7.AbstractC3772b;
import qa.C3883a;

/* loaded from: classes4.dex */
public final class ReflectiveTypeAdapterFactory implements InterfaceC3449A {

    /* renamed from: a, reason: collision with root package name */
    public final C1521a f27399a;

    /* renamed from: b, reason: collision with root package name */
    public final la.h f27400b;

    /* renamed from: c, reason: collision with root package name */
    public final Excluder f27401c;

    /* renamed from: d, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f27402d;

    /* renamed from: e, reason: collision with root package name */
    public final List f27403e;

    public ReflectiveTypeAdapterFactory(C1521a c1521a, la.h hVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List list) {
        this.f27399a = c1521a;
        this.f27400b = hVar;
        this.f27401c = excluder;
        this.f27402d = jsonAdapterAnnotationTypeAdapterFactory;
        this.f27403e = list;
    }

    public static void a(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + pa.c.c(field) + " and " + pa.c.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015f  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.gson.internal.bind.r b(la.l r29, qa.C3883a r30, java.lang.Class r31, boolean r32) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b(la.l, qa.a, java.lang.Class, boolean):com.google.gson.internal.bind.r");
    }

    public final boolean c(Field field, boolean z2) {
        boolean z10;
        Excluder excluder = this.f27401c;
        excluder.getClass();
        if ((field.getModifiers() & Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE) != 0 || field.isSynthetic() || excluder.a(field.getType(), z2)) {
            z10 = true;
        } else {
            List list = z2 ? excluder.f27386a : excluder.f27387b;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw M6.j(it);
                }
            }
            z10 = false;
        }
        return !z10;
    }

    @Override // la.InterfaceC3449A
    public final la.z create(la.l lVar, C3883a c3883a) {
        Class cls = c3883a.f44183a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        AbstractC3772b abstractC3772b = pa.c.f43447a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new C1768n(0);
        }
        na.d.f(this.f27403e);
        return pa.c.f43447a.I(cls) ? new C1772s(cls, b(lVar, c3883a, cls, true)) : new C1771q(this.f27399a.t(c3883a), b(lVar, c3883a, cls, false));
    }
}
