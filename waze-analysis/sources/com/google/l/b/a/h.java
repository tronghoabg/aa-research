package com.google.l.b.a;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class h extends com.google.l.u {

    /* renamed from: a, reason: collision with root package name */
    static final com.google.l.v f12280a = new g(0);

    /* renamed from: b, reason: collision with root package name */
    private final Map f12281b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f12282c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f12283d;

    /* synthetic */ h(Class cls) throws SecurityException {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i2 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i2] = field;
                    i2++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i2);
            int iCeil = (int) Math.ceil(i2 / 0.75f);
            this.f12281b = new HashMap(iCeil);
            this.f12282c = new HashMap(iCeil);
            this.f12283d = new HashMap(iCeil);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r4 = (Enum) field2.get(null);
                String strName = r4.name();
                String string = r4.toString();
                com.google.l.a.b bVar = (com.google.l.a.b) field2.getAnnotation(com.google.l.a.b.class);
                if (bVar != null) {
                    strName = bVar.a();
                    for (String str : bVar.b()) {
                        this.f12281b.put(str, r4);
                    }
                }
                this.f12281b.put(strName, r4);
                this.f12282c.put(string, r4);
                this.f12283d.put(r4, strName);
            }
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ Object b(com.google.l.d.b bVar) throws IOException {
        if (bVar.r() == 9) {
            bVar.m();
            return null;
        }
        String strH = bVar.h();
        Enum r0 = (Enum) this.f12281b.get(strH);
        return r0 != null ? r0 : (Enum) this.f12282c.get(strH);
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ void d(com.google.l.d.c cVar, Object obj) throws IOException {
        Enum r2 = (Enum) obj;
        cVar.l(r2 == null ? null : (String) this.f12283d.get(r2));
    }
}
