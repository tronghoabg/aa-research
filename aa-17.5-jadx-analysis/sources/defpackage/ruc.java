package defpackage;

import android.os.IBinder;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public final class ruc extends ijo implements rud {
    private final Object a;

    public ruc(Object obj) {
        super("com.google.android.gms.car.senderprotocol.IObjectWrapper");
        this.a = obj;
    }

    public static Object a(rud rudVar) {
        if (rudVar instanceof ruc) {
            return ((ruc) rudVar).a;
        }
        IBinder iBinderAsBinder = rudVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1 || field == null) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }

    public ruc() {
        throw null;
    }
}
