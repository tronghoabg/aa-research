package com.google.l.b.a;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aa implements com.google.l.v {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.l.b.e f12226a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.l.b.g f12227b;

    /* renamed from: c, reason: collision with root package name */
    private final i f12228c;

    /* renamed from: d, reason: collision with root package name */
    private final List f12229d;

    /* renamed from: e, reason: collision with root package name */
    private final int f12230e;

    public aa(com.google.l.b.e eVar, int i2, com.google.l.b.g gVar, i iVar, List list) {
        this.f12226a = eVar;
        this.f12230e = i2;
        this.f12227b = gVar;
        this.f12228c = iVar;
        this.f12229d = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* bridge */ /* synthetic */ void b(Object obj, AccessibleObject accessibleObject) {
        if (true == Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!com.google.l.b.ac.e(accessibleObject, obj)) {
            throw new com.google.l.j(com.google.l.b.b.d.e(accessibleObject, true).concat(" is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c5  */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.l.b.a.y c(com.google.l.d r27, com.google.l.c.a r28, java.lang.Class r29, boolean r30, boolean r31) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.l.b.a.aa.c(com.google.l.d, com.google.l.c.a, java.lang.Class, boolean, boolean):com.google.l.b.a.y");
    }

    private static IllegalArgumentException d(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + com.google.l.b.b.d.d(field) + " and " + com.google.l.b.b.d.d(field2) + "\nSee " + com.google.l.b.ac.a("duplicate-fields"));
    }

    private final boolean e(Field field, boolean z) {
        return !this.f12227b.d(field, z);
    }

    @Override // com.google.l.v
    public final com.google.l.u a(com.google.l.d dVar, com.google.l.c.a aVar) {
        Class clsC = aVar.c();
        if (!Object.class.isAssignableFrom(clsC)) {
            return null;
        }
        if (com.google.l.b.b.d.j(clsC)) {
            return new u(this);
        }
        int iF = com.google.l.b.ac.f(this.f12229d);
        if (iF != 4) {
            boolean z = iF == 3;
            return com.google.l.b.b.d.k(clsC) ? new z(clsC, c(dVar, aVar, clsC, z, true), z) : new x(this.f12226a.a(aVar, true), c(dVar, aVar, clsC, z, false));
        }
        throw new com.google.l.j("ReflectionAccessFilter does not permit using reflection for " + String.valueOf(clsC) + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
