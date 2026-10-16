package defpackage;

import android.content.Context;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Optional;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class zre {
    private static volatile zre d;
    public final Object a;
    public final Object b;
    public final Object c;

    public zre(Context context, byte[] bArr) {
        this.a = wub.L(new vdv(context, 2));
        byte[] bArr2 = null;
        this.b = wub.L(new plm(this, context, 10, bArr2));
        this.c = wub.L(new plm(this, context, 11, bArr2));
        wub.L(new vdv(context, 3));
    }

    public static zre a(Context context) {
        if (d == null) {
            synchronized (zre.class) {
                if (d == null) {
                    d = new zre(context);
                }
            }
        }
        return d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, zpc] */
    private final synchronized void j(String str) {
        InputStream inputStreamOpen;
        List list;
        if (this.a.contains(str)) {
            return;
        }
        try {
            try {
                inputStreamOpen = ((zov) this.b).b.open(str, 3);
            } catch (FileNotFoundException unused) {
                zov.a.logp(Level.WARNING, "com.google.i18n.phonenumbers.metadata.init.AndroidAssetMetadataLoader", "loadMetadata", String.format("File %s not found", str));
                inputStreamOpen = null;
            } catch (IOException e) {
                throw new zow(String.format("Error while opening %s: ", str), e);
            }
            InputStream inputStream = inputStreamOpen;
            if (inputStream == null) {
                list = Collections.EMPTY_LIST;
            } else {
                try {
                    try {
                        aboh abohVar = ((zoj) abnv.z(zoj.a, inputStream, abnj.a())).b;
                        woy.O(!abohVar.isEmpty(), "Empty metadata");
                        try {
                            inputStream.close();
                        } catch (IOException e2) {
                            zox.a.logp(Level.WARNING, "com.google.i18n.phonenumbers.metadata.init.MetadataParser", "parse", "Error closing input stream (ignored)", (Throwable) e2);
                        }
                        list = abohVar;
                    } catch (IOException e3) {
                        throw new IllegalStateException("Unable to parse metadata file", e3);
                    }
                } finally {
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.c.a((zoi) it.next());
            }
            this.a.add(str);
        } catch (IllegalArgumentException | IllegalStateException e4) {
            throw new IllegalStateException("Failed to read file ".concat(str), e4);
        }
    }

    private final Method k(Class cls) throws NoSuchMethodException, SecurityException {
        Object obj;
        Method methodL = l(cls, (String) this.b, (Class[]) this.c);
        if (methodL != null && (obj = this.a) != null) {
            if (!((Class) obj).isAssignableFrom(methodL.getReturnType())) {
                return null;
            }
        }
        return methodL;
    }

    private static Method l(Class cls, String str, Class[] clsArr) throws NoSuchMethodException, SecurityException {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return l(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if (1 != (method.getModifiers() & 1)) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xyc] */
    public final Optional b() {
        return Optional.ofNullable((Integer) this.b.gu());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, zpc] */
    @ResultIgnorabilityUnspecified
    public final zpc c(String str) {
        if (!this.a.contains(str)) {
            j(str);
        }
        return this.c;
    }

    public final Object d(Object obj, Object... objArr) {
        try {
            Method methodK = k(obj.getClass());
            if (methodK != null) {
                try {
                    return methodK.invoke(obj, objArr);
                } catch (IllegalAccessException e) {
                    AssertionError assertionError = new AssertionError("Unexpectedly could not call: ".concat(methodK.toString()));
                    assertionError.initCause(e);
                    throw assertionError;
                }
            }
            Object obj2 = this.b;
            throw new AssertionError("Method " + ((String) obj2) + " not supported for object " + String.valueOf(obj));
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError2 = new AssertionError("Unexpected exception");
            assertionError2.initCause(targetException);
            throw assertionError2;
        }
    }

    public final boolean e(Object obj) {
        return k(obj.getClass()) != null;
    }

    public final void f(Object obj, Object... objArr) {
        try {
            Method methodK = k(obj.getClass());
            if (methodK == null) {
                return;
            }
            try {
                methodK.invoke(obj, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public final IllegalArgumentException g() {
        Object obj = this.b;
        Object obj2 = this.a;
        Object obj3 = this.c;
        return new IllegalArgumentException("Multiple entries with same key: " + obj3.toString() + "=" + obj2.toString() + " and " + obj3.toString() + "=" + obj.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(com.google.android.libraries.surveys.internal.model.Answer r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zre.h(com.google.android.libraries.surveys.internal.model.Answer, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xyc] */
    public final String i() {
        return (String) this.a.gu();
    }

    public zre(Context context, String str, abzc abzcVar) {
        this.b = context;
        this.a = str;
        this.c = abzcVar;
    }

    public zre(Class cls, String str, Class... clsArr) {
        this.a = cls;
        this.b = str;
        this.c = clsArr;
    }

    public zre(Object obj, Object obj2, Object obj3) {
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public zre(adnq adnqVar, adsi adsiVar, admc admcVar) {
        this.b = adnqVar;
        this.c = adsiVar;
        this.a = admcVar;
    }

    public zre(zob zobVar, zpc zpcVar) {
        this.b = zobVar;
        this.c = zpcVar;
        this.a = yrm.t();
    }

    public zre(Context context) {
        this.a = wub.L(new vdv(context, 17));
        this.b = wub.L(new vdv(this, 18));
        this.c = wub.L(new vdv(this, 19));
    }
}
