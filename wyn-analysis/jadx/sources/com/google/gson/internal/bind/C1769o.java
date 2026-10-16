package com.google.gson.internal.bind;

import A7.AbstractC0279p0;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import ra.C3963b;

/* renamed from: com.google.gson.internal.bind.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1769o {

    /* renamed from: a, reason: collision with root package name */
    public final String f27477a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f27478b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27479c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Method f27480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ la.z f27481e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ la.z f27482f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f27483g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f27484h;

    public C1769o(String str, Field field, Method method, la.z zVar, la.z zVar2, boolean z2, boolean z10) {
        this.f27480d = method;
        this.f27481e = zVar;
        this.f27482f = zVar2;
        this.f27483g = z2;
        this.f27484h = z10;
        this.f27477a = str;
        this.f27478b = field;
        this.f27479c = field.getName();
    }

    public final void a(C3963b c3963b, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        Field field = this.f27478b;
        Method method = this.f27480d;
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, new Object[0]);
            } catch (InvocationTargetException e7) {
                throw new la.p(AbstractC0279p0.l("Accessor ", pa.c.d(method, false), " threw exception"), e7.getCause(), 13);
            }
        } else {
            objInvoke = field.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        c3963b.w(this.f27477a);
        this.f27481e.c(c3963b, objInvoke);
    }
}
