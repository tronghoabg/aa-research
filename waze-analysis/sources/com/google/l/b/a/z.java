package com.google.l.b.a;

import androidx.camera.video.AudioStats;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class z extends v {

    /* renamed from: a, reason: collision with root package name */
    static final Map f12326a;

    /* renamed from: b, reason: collision with root package name */
    private final Constructor f12327b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f12328c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f12329d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, false);
        f12326a = map;
    }

    z(Class cls, y yVar, boolean z) throws SecurityException {
        super(yVar);
        this.f12329d = new HashMap();
        Constructor constructorG = com.google.l.b.b.d.g(cls);
        this.f12327b = constructorG;
        if (z) {
            aa.b(null, constructorG);
        } else {
            com.google.l.b.b.d.i(constructorG);
        }
        String[] strArrL = com.google.l.b.b.d.l(cls);
        for (int i2 = 0; i2 < strArrL.length; i2++) {
            this.f12329d.put(strArrL[i2], Integer.valueOf(i2));
        }
        Class<?>[] parameterTypes = this.f12327b.getParameterTypes();
        this.f12328c = new Object[parameterTypes.length];
        for (int i3 = 0; i3 < parameterTypes.length; i3++) {
            this.f12328c[i3] = f12326a.get(parameterTypes[i3]);
        }
    }

    @Override // com.google.l.b.a.v
    final /* bridge */ /* synthetic */ Object a() {
        return (Object[]) this.f12328c.clone();
    }

    @Override // com.google.l.b.a.v
    final /* bridge */ /* synthetic */ void f(Object obj, com.google.l.d.b bVar, w wVar) {
        Map map = this.f12329d;
        String str = wVar.f12315c;
        Object[] objArr = (Object[]) obj;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + com.google.l.b.b.d.c(this.f12327b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        com.google.l.u uVar = wVar.f12319g;
        int iIntValue = num.intValue();
        Object objB = uVar.b(bVar);
        if (objB != null || !wVar.f12320h) {
            objArr[iIntValue] = objB;
            return;
        }
        throw new com.google.l.m("null is not allowed as value for record component '" + str + "' of primitive type; at path " + bVar.e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.l.b.a.v
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object c(Object[] objArr) {
        try {
            return this.f12327b.newInstance(objArr);
        } catch (IllegalAccessException e2) {
            throw com.google.l.b.b.d.b(e2);
        } catch (IllegalArgumentException e3) {
            e = e3;
            throw new RuntimeException("Failed to invoke constructor '" + com.google.l.b.b.d.c(this.f12327b) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e4) {
            e = e4;
            throw new RuntimeException("Failed to invoke constructor '" + com.google.l.b.b.d.c(this.f12327b) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException("Failed to invoke constructor '" + com.google.l.b.b.d.c(this.f12327b) + "' with args " + Arrays.toString(objArr), e5.getCause());
        }
    }
}
