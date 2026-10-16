package com.google.l.b.a;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a extends com.google.l.u {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.l.v f12222a = new g(1);

    /* renamed from: b, reason: collision with root package name */
    private final Class f12223b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.l.u f12224c;

    public a(com.google.l.d dVar, com.google.l.u uVar, Class cls) {
        this.f12224c = new af(dVar, uVar, cls);
        this.f12223b = cls;
    }

    @Override // com.google.l.u
    public final Object b(com.google.l.d.b bVar) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (bVar.r() == 9) {
            bVar.m();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        bVar.i();
        while (bVar.p()) {
            arrayList.add(this.f12224c.b(bVar));
        }
        bVar.k();
        int size = arrayList.size();
        Class cls = this.f12223b;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(objNewInstance, i2, arrayList.get(i2));
        }
        return objNewInstance;
    }

    @Override // com.google.l.u
    public final void d(com.google.l.d.c cVar, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == null) {
            cVar.g();
            return;
        }
        cVar.b();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.f12224c.d(cVar, Array.get(obj, i2));
        }
        cVar.d();
    }
}
