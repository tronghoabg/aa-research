package com.google.firebase.components;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final Object f8941a;

    /* renamed from: b, reason: collision with root package name */
    private final e f8942b;

    f(Object obj, e eVar) {
        this.f8941a = obj;
        this.f8942b = eVar;
    }

    public static f a(Context context, Class cls) {
        return new f(context, new e(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ComponentRegistrar d(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new v(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e2) {
            throw new v(String.format("Could not instantiate %s.", str), e2);
        } catch (InstantiationException e3) {
            throw new v(String.format("Could not instantiate %s.", str), e3);
        } catch (NoSuchMethodException e4) {
            throw new v(String.format("Could not instantiate %s", str), e4);
        } catch (InvocationTargetException e5) {
            throw new v(String.format("Could not instantiate %s", str), e5);
        }
    }

    public final List c() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f8942b.a((Context) this.f8941a).iterator();
        while (it.hasNext()) {
            arrayList.add(new l((String) it.next(), 1));
        }
        return arrayList;
    }
}
