package androidx.compose.ui.tooling;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.tooling.data.Group;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import androidx.compose.ui.tooling.preview.PreviewWrapperProvider;
import com.waze.c.e.u;
import h.a.i;
import h.ab;
import h.g.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b;
import h.g.b.x;
import h.m.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PreviewUtils_androidKt {
    public static final Class<? extends PreviewParameterProvider<?>> asPreviewProviderClass(String str) throws ClassNotFoundException {
        try {
            Class cls = Class.forName(str);
            if (cls instanceof Class) {
                return cls;
            }
            return null;
        } catch (ClassNotFoundException e2) {
            PreviewLogger.Companion.logError$ui_tooling("Unable to find PreviewProvider '" + str + '\'', e2);
            return null;
        }
    }

    public static final Class<? extends PreviewWrapperProvider> asPreviewWrapperProviderClass(String str) throws ClassNotFoundException {
        try {
            Class cls = Class.forName(str);
            if (cls instanceof Class) {
                return cls;
            }
            return null;
        } catch (ClassNotFoundException e2) {
            PreviewLogger.Companion.logError$ui_tooling("Unable to find PreviewWrapperProvider '" + str + '\'', e2);
            return null;
        }
    }

    public static final List<Group> findAll(Group group, l<? super Group, Boolean> lVar) {
        return findGroupsThatMatchPredicate$default(group, lVar, false, 4, null);
    }

    private static final List<Group> findGroupsThatMatchPredicate(Group group, l<? super Group, Boolean> lVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        List listL = i.l(group);
        while (!listL.isEmpty()) {
            Group group2 = (Group) i.w(listL);
            if (lVar.invoke(group2).booleanValue()) {
                if (z) {
                    return i.d(group2);
                }
                arrayList.add(group2);
            }
            listL.addAll(group2.getChildren());
        }
        return arrayList;
    }

    static /* synthetic */ List findGroupsThatMatchPredicate$default(Group group, l lVar, boolean z, int i2, Object obj) {
        return findGroupsThatMatchPredicate(group, lVar, z & ((i2 & 4) == 0));
    }

    public static final Group firstOrNull(Group group, l<? super Group, Boolean> lVar) {
        return (Group) i.R(findGroupsThatMatchPredicate(group, lVar, true));
    }

    public static final Object[] getPreviewProviderParameters(Class<? extends PreviewParameterProvider<?>> cls, int i2) throws IllegalAccessException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        if (cls == null) {
            return new Object[0];
        }
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            int i3 = 0;
            boolean z = false;
            Constructor<?> constructor = null;
            while (true) {
                if (i3 >= length) {
                    if (!z) {
                        break;
                    }
                } else {
                    Constructor<?> constructor2 = constructors[i3];
                    if (constructor2.getParameterTypes().length == 0) {
                        if (z) {
                            break;
                        }
                        z = true;
                        constructor = constructor2;
                    }
                    i3++;
                }
            }
            constructor = null;
            if (constructor == null) {
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            }
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(null);
            x.d(objNewInstance, "null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>");
            PreviewParameterProvider previewParameterProvider = (PreviewParameterProvider) objNewInstance;
            if (i2 < 0) {
                return toArray(previewParameterProvider.getValues(), previewParameterProvider.getCount());
            }
            h values = previewParameterProvider.getValues();
            x.f(values, "<this>");
            u uVar = new u(i2, 11);
            x.f(values, "<this>");
            x.f(uVar, "defaultValue");
            Iterator it = values.iterator();
            int i4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    objInvoke = uVar.invoke(Integer.valueOf(i2));
                    break;
                }
                objInvoke = it.next();
                int i5 = i4 + 1;
                if (i2 == i4) {
                    break;
                }
                i4 = i5;
            }
            List listD = i.d(objInvoke);
            ArrayList arrayList = new ArrayList(i.q(listD, 10));
            Iterator it2 = listD.iterator();
            while (it2.hasNext()) {
                arrayList.add(unwrapIfInline(it2.next()));
            }
            return arrayList.toArray(new Object[0]);
        } catch (b unused) {
            throw new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
        }
    }

    public static final PreviewWrapperProvider instantiatePreviewWrapperProvider(Class<? extends PreviewWrapperProvider> cls) throws IllegalAccessException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (cls == null) {
            return new PreviewWrapperProvider() { // from class: androidx.compose.ui.tooling.PreviewUtils_androidKt.instantiatePreviewWrapperProvider.1
                @Override // androidx.compose.ui.tooling.preview.PreviewWrapperProvider
                public void Wrap(p<? super Composer, ? super Integer, ab> pVar, Composer composer, int i2) {
                    composer.startReplaceGroup(39400850);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(39400850, i2, -1, "androidx.compose.ui.tooling.instantiatePreviewWrapperProvider.<no name provided>.Wrap (PreviewUtils.android.kt:106)");
                    }
                    pVar.invoke(composer, Integer.valueOf(i2 & 14));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                }
            };
        }
        Constructor<?>[] constructors = cls.getConstructors();
        int length = constructors.length;
        int i2 = 0;
        boolean z = false;
        Constructor<?> constructor = null;
        while (true) {
            if (i2 >= length) {
                if (!z) {
                    break;
                }
            } else {
                Constructor<?> constructor2 = constructors[i2];
                if (constructor2.getParameterTypes().length == 0) {
                    if (z) {
                        break;
                    }
                    z = true;
                    constructor = constructor2;
                }
                i2++;
            }
        }
        constructor = null;
        if (constructor == null) {
            throw new IllegalArgumentException("PreviewWrapperProvider constructor can not have parameters");
        }
        constructor.setAccessible(true);
        Object objNewInstance = constructor.newInstance(null);
        x.d(objNewInstance, "null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewWrapperProvider");
        return (PreviewWrapperProvider) objNewInstance;
    }

    private static final Object[] toArray(h<? extends Object> hVar, int i2) {
        Iterator<? extends Object> it = hVar.iterator();
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = it.next();
        }
        return objArr;
    }

    private static final Object unwrapIfInline(Object obj) throws NoSuchFieldException {
        if (obj != null) {
            for (Annotation annotation : obj.getClass().getAnnotations()) {
                if (annotation instanceof a) {
                    for (Field field : obj.getClass().getDeclaredFields()) {
                        if (field.getType().isPrimitive()) {
                            Field declaredField = obj.getClass().getDeclaredField(field.getName());
                            declaredField.setAccessible(true);
                            return declaredField.get(obj);
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
        }
        return obj;
    }
}
