package com.google.v;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class dk {
    static de b(Class cls) {
        ClassLoader classLoader = dk.class.getClassLoader();
        if (cls.equals(de.class)) {
            try {
                try {
                    return (de) cls.cast(((dk) Class.forName("com.google.v.m", true, classLoader).getConstructor(null).newInstance(null)).a());
                } catch (ReflectiveOperationException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        Iterator it = Collections.singletonList(gp.class.getDeclaredConstructor(null).newInstance(null)).iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            try {
                arrayList.add((de) cls.cast(((dk) it.next()).a()));
            } catch (ServiceConfigurationError e3) {
                Logger.getLogger(ae.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(String.valueOf(cls.getSimpleName())), (Throwable) e3);
            }
        }
        if (arrayList.size() == 1) {
            return (de) arrayList.get(0);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        try {
            return (de) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
        } catch (ReflectiveOperationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    protected abstract de a();
}
