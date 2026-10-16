package com.google.android.recaptcha.internal;

import ef.C2515C;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public abstract class zzee implements InvocationHandler {

    @Nullable
    private final Object zza;

    public zzee(@Nullable Object obj) {
        this.zza = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    @NotNull
    public final Object invoke(@NotNull Object obj, @NotNull Method method, @Nullable Object[] objArr) {
        Object obj2;
        if (AbstractC3340k.a(method.getName(), "toString") && method.getParameterTypes().length == 0) {
            return "Proxy@".concat(String.valueOf(Integer.toHexString(obj.hashCode())));
        }
        if (AbstractC3340k.a(method.getName(), "hashCode") && method.getParameterTypes().length == 0) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if (AbstractC3340k.a(method.getName(), "equals") && method.getParameterTypes().length != 0) {
            boolean z2 = false;
            if (objArr != null && objArr.length != 0) {
                Object obj3 = objArr[0];
                if ((obj3 != null ? obj3.hashCode() : 0) == obj.hashCode()) {
                    z2 = true;
                }
            }
            return Boolean.valueOf(z2);
        }
        boolean zZza = zza(obj, method, objArr);
        C2515C c2515c = C2515C.f34653a;
        if (!zZza) {
            return c2515c;
        }
        if ((this.zza == null && AbstractC3340k.a(method.getReturnType(), Void.TYPE)) || ((obj2 = this.zza) != null && AbstractC3340k.a(zzie.zza(obj2.getClass()), zzie.zza(method.getReturnType())))) {
            Object obj4 = this.zza;
            return obj4 == null ? c2515c : obj4;
        }
        throw new IllegalArgumentException(this.zza + " cannot be returned from method with return type " + method.getReturnType());
    }

    public abstract boolean zza(@NotNull Object obj, @NotNull Method method, @Nullable Object[] objArr);
}
