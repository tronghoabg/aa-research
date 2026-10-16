package q7;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.common.zzb;
import java.lang.reflect.Field;

/* renamed from: q7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC3877b extends zzb implements InterfaceC3876a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f44169a;

    public BinderC3877b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.f44169a = obj;
    }

    public static InterfaceC3876a R(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3876a ? (InterfaceC3876a) iInterfaceQueryLocalInterface : new e(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static Object S(InterfaceC3876a interfaceC3876a) throws SecurityException {
        if (interfaceC3876a instanceof BinderC3877b) {
            return ((BinderC3877b) interfaceC3876a).f44169a;
        }
        IBinder iBinderAsBinder = interfaceC3876a.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i5 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i5++;
                field = field2;
            }
        }
        if (i5 != 1) {
            int length = declaredFields.length;
            throw new IllegalArgumentException(N0.a.d(length, "Unexpected number of IObjectWrapper declared fields: ", new StringBuilder(String.valueOf(length).length() + 53)));
        }
        AbstractC1732v.i(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e7) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e7);
        } catch (NullPointerException e10) {
            throw new IllegalArgumentException("Binder object is null.", e10);
        }
    }
}
