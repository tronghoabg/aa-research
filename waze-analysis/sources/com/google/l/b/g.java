package com.google.l.b;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g implements Cloneable, com.google.l.v {

    /* renamed from: a, reason: collision with root package name */
    public static final g f12371a = new g();

    /* renamed from: b, reason: collision with root package name */
    private final List f12372b = Collections.EMPTY_LIST;

    /* renamed from: c, reason: collision with root package name */
    private final List f12373c = Collections.EMPTY_LIST;

    @Override // com.google.l.v
    public final com.google.l.u a(com.google.l.d dVar, com.google.l.c.a aVar) {
        Class clsC = aVar.c();
        boolean zC = c(clsC, true);
        boolean zC2 = c(clsC, false);
        if (zC || zC2) {
            return new f(this, zC2, zC, dVar, aVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final g clone() {
        try {
            return (g) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final boolean c(Class cls, boolean z) {
        List list;
        if (z) {
            list = this.f12372b;
        } else {
            if (!Enum.class.isAssignableFrom(cls) && com.google.l.b.b.d.j(cls)) {
                return true;
            }
            list = this.f12373c;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((com.google.l.a) it.next()).a()) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(Field field, boolean z) {
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || c(field.getType(), z)) {
            return true;
        }
        List list = z ? this.f12372b : this.f12373c;
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((com.google.l.a) it.next()).b()) {
                return true;
            }
        }
        return false;
    }
}
