package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jau extends defpackage.ijw implements defpackage.jav {
    private final java.lang.Object a;

    public jau(java.lang.Object obj) {
        super("com.google.android.apps.auto.carservice.car.senderprotocol.IObjectWrapper");
        this.a = obj;
    }

    public static java.lang.Object a(defpackage.jav javVar) {
        if (javVar instanceof defpackage.jau) {
            return ((defpackage.jau) javVar).a;
        }
        android.os.IBinder iBinderAsBinder = javVar.asBinder();
        java.lang.reflect.Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        java.lang.reflect.Field field = null;
        int i = 0;
        for (java.lang.reflect.Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1 || field == null) {
            throw new java.lang.IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        if (field.isAccessible()) {
            throw new java.lang.IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (java.lang.NullPointerException e2) {
            throw new java.lang.IllegalArgumentException("Binder object is null.", e2);
        }
    }

    public jau() {
        throw null;
    }
}
