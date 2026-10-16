package com.google.android.gms.internal.p002firebaseauthapi;

import R8.v;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public class zzadr {
    private zzadr() {
    }

    public static Object zza(String str, Type type) throws zzabg {
        if (type != String.class) {
            if (type == Void.class) {
                return null;
            }
            try {
                try {
                    return ((zzadt) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0])).zza(str);
                } catch (Exception e7) {
                    throw new zzabg(v.f("Json conversion failed! ", e7.getMessage()), e7);
                }
            } catch (Exception e10) {
                throw new zzabg("Instantiation of JsonResponse failed! ".concat(String.valueOf(type)), e10);
            }
        }
        try {
            zzafj zzafjVar = (zzafj) new zzafj().zza(str);
            if (zzafjVar.zzb()) {
                return zzafjVar.zza();
            }
            throw new zzabg("No error message: " + str);
        } catch (Exception e11) {
            throw new zzabg(v.f("Json conversion failed! ", e11.getMessage()), e11);
        }
    }
}
