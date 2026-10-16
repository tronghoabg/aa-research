package com.google.android.gms.g;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.internal.av;
import java.lang.reflect.Field;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b extends com.google.android.a.b implements c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f5473a;

    private b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.f5473a = obj;
    }

    public static c a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new a(iBinder);
    }

    public static c b(Object obj) {
        return new b(obj);
    }

    public static Object c(c cVar) {
        if (cVar instanceof b) {
            return ((b) cVar).f5473a;
        }
        IBinder iBinderAsBinder = cVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i2 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i2++;
                field = field2;
            }
        }
        if (i2 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        av.m(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
        } catch (NullPointerException e3) {
            throw new IllegalArgumentException("Binder object is null.", e3);
        }
    }

    public b() {
        super("com.google.android.gms.dynamic.IObjectWrapper");
    }
}
