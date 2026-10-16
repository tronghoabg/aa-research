package com.google.gson.internal;

import Va.M6;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import la.InterfaceC3449A;
import la.l;
import la.z;
import na.f;
import p7.AbstractC3772b;
import pa.c;
import qa.C3883a;

/* loaded from: classes4.dex */
public final class Excluder implements InterfaceC3449A, Cloneable {

    /* renamed from: c, reason: collision with root package name */
    public static final Excluder f27385c = new Excluder();

    /* renamed from: a, reason: collision with root package name */
    public final List f27386a;

    /* renamed from: b, reason: collision with root package name */
    public final List f27387b;

    public Excluder() {
        List list = Collections.EMPTY_LIST;
        this.f27386a = list;
        this.f27387b = list;
    }

    public final boolean a(Class cls, boolean z2) {
        if (!z2 && !Enum.class.isAssignableFrom(cls)) {
            AbstractC3772b abstractC3772b = c.f43447a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z2 ? this.f27386a : this.f27387b).iterator();
        if (it.hasNext()) {
            throw M6.j(it);
        }
        return false;
    }

    public final Object clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override // la.InterfaceC3449A
    public final z create(l lVar, C3883a c3883a) {
        Class cls = c3883a.f44183a;
        boolean zA = a(cls, true);
        boolean zA2 = a(cls, false);
        if (zA || zA2) {
            return new f(this, zA2, zA, lVar, c3883a);
        }
        return null;
    }
}
