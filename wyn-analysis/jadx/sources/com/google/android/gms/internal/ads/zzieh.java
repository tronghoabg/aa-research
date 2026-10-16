package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class zzieh {
    public static zzidz zzb(Class cls) {
        ClassLoader classLoader = zzieh.class.getClassLoader();
        if (cls.equals(zzidz.class)) {
            try {
                try {
                    return (zzidz) cls.cast(((zzieh) Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).zza());
                } catch (ReflectiveOperationException e7) {
                    throw new IllegalStateException(e7);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        Iterator it = ServiceLoader.load(zzieh.class, classLoader).iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            try {
                arrayList.add((zzidz) cls.cast(((zzieh) it.next()).zza()));
            } catch (ServiceConfigurationError e10) {
                Logger.getLogger(zzidu.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e10);
            }
        }
        if (arrayList.size() == 1) {
            return (zzidz) arrayList.get(0);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        try {
            return (zzidz) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
        } catch (ReflectiveOperationException e11) {
            throw new IllegalStateException(e11);
        }
    }

    public abstract zzidz zza();
}
