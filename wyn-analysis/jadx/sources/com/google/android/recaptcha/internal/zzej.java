package com.google.android.recaptcha.internal;

import Fe.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class zzej {
    @NotNull
    public static final Class zza(@Nullable Object obj) throws zzby, ClassNotFoundException {
        if (obj instanceof Class) {
            return (Class) obj;
        }
        if (obj instanceof Integer) {
            int iIntValue = ((Number) obj).intValue();
            Class cls = iIntValue == 1 ? Integer.TYPE : iIntValue == 2 ? Short.TYPE : iIntValue == 3 ? Byte.TYPE : iIntValue == 4 ? Long.TYPE : iIntValue == 5 ? Character.TYPE : iIntValue == 6 ? Float.TYPE : iIntValue == 7 ? Double.TYPE : iIntValue == 8 ? Boolean.TYPE : null;
            if (cls != null) {
                return cls;
            }
            throw new zzby(4, 6, null);
        }
        if (!(obj instanceof String)) {
            throw new zzby(4, 5, null);
        }
        try {
            String str = (String) obj;
            Class<?> cls2 = Class.forName(str);
            int i5 = zzbb.zza;
            if (((zzeb) c.z(zzei.zza).getValue()).zzb(str)) {
                return cls2;
            }
            throw new zzby(6, 47, null);
        } catch (Exception e7) {
            throw new zzby(6, 8, e7);
        }
    }
}
