package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import ka.AbstractC3256n;

/* loaded from: classes4.dex */
public abstract class zbuf<MessageType extends zbuf<MessageType, BuilderType>, BuilderType extends zbtz<MessageType, BuilderType>> extends zbsj<MessageType, BuilderType> {
    private static final Map zbb = new ConcurrentHashMap();
    private int zbd = -1;
    protected zbwm zbc = zbwm.zbc();

    public static Object zbA(zbvm zbvmVar, String str, Object[] objArr) {
        return new zbvw(zbvmVar, str, objArr);
    }

    public static void zbD(Class cls, zbuf zbufVar) {
        zbufVar.zbC();
        zbb.put(cls, zbufVar);
    }

    public static final boolean zbF(zbuf zbufVar, boolean z2) {
        byte bByteValue = ((Byte) zbufVar.zbb(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZbk = zbvu.zba().zbb(zbufVar.getClass()).zbk(zbufVar);
        if (z2) {
            zbufVar.zbb(2, true != zZbk ? null : zbufVar, null);
        }
        return zZbk;
    }

    private final int zbc(zbvx zbvxVar) {
        return zbvu.zba().zbb(getClass()).zba(this);
    }

    private static zbuf zbe(zbuf zbufVar, byte[] bArr, int i5, int i10, zbtp zbtpVar) throws zbuq {
        if (i10 == 0) {
            return zbufVar;
        }
        zbuf zbufVarZbt = zbufVar.zbt();
        try {
            zbvx zbvxVarZbb = zbvu.zba().zbb(zbufVarZbt.getClass());
            zbvxVarZbb.zbh(zbufVarZbt, bArr, 0, i10, new zbsq(zbtpVar));
            zbvxVarZbb.zbf(zbufVarZbt);
            return zbufVarZbt;
        } catch (zbuq e7) {
            throw e7;
        } catch (zbwk e10) {
            throw e10.zba();
        } catch (IOException e11) {
            if (e11.getCause() instanceof zbuq) {
                throw ((zbuq) e11.getCause());
            }
            throw new zbuq(e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new zbuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static zbud zbr(zbvm zbvmVar, Object obj, zbvm zbvmVar2, zbui zbuiVar, int i5, zbww zbwwVar, Class cls) {
        return new zbud(zbvmVar, obj, zbvmVar2, new zbuc(null, 32149011, zbwwVar, false, false), cls);
    }

    public static zbuf zbs(Class cls) throws ClassNotFoundException {
        Map map = zbb;
        zbuf zbufVar = (zbuf) map.get(cls);
        if (zbufVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zbufVar = (zbuf) map.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (zbufVar != null) {
            return zbufVar;
        }
        zbuf zbufVar2 = (zbuf) ((zbuf) zbws.zbe(cls)).zbb(6, null, null);
        if (zbufVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zbufVar2);
        return zbufVar2;
    }

    public static zbuf zbu(zbuf zbufVar, byte[] bArr, zbtp zbtpVar) throws zbuq {
        zbuf zbufVarZbe = zbe(zbufVar, bArr, 0, bArr.length, zbtpVar);
        if (zbufVarZbe == null || zbF(zbufVarZbe, true)) {
            return zbufVarZbe;
        }
        throw new zbwk(zbufVarZbe).zba();
    }

    public static zbuk zbv() {
        return zbtw.zbf();
    }

    public static zbul zbw() {
        return zbug.zbf();
    }

    public static zbum zbx() {
        return zbva.zbf();
    }

    public static zbun zby() {
        return zbvv.zbe();
    }

    public static Object zbz(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zbvu.zba().zbb(getClass()).zbj(this, (zbuf) obj);
    }

    public final int hashCode() {
        if (zbG()) {
            return zbn();
        }
        int i5 = this.zba;
        if (i5 != 0) {
            return i5;
        }
        int iZbn = zbn();
        this.zba = iZbn;
        return iZbn;
    }

    public final String toString() {
        return zbvo.zba(this, super.toString());
    }

    public final void zbB() {
        zbvu.zba().zbb(getClass()).zbf(this);
        zbC();
    }

    public final void zbC() {
        this.zbd &= f.API_PRIORITY_OTHER;
    }

    public final void zbE(int i5) {
        this.zbd = (this.zbd & Integer.MIN_VALUE) | f.API_PRIORITY_OTHER;
    }

    public final boolean zbG() {
        return (this.zbd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm
    public final /* synthetic */ zbvl zbJ() {
        return (zbtz) zbb(5, null, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm
    public final /* synthetic */ zbvl zbK() {
        zbtz zbtzVar = (zbtz) zbb(5, null, null);
        zbtzVar.zbh(this);
        return zbtzVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm
    public final void zbL(zbtk zbtkVar) throws IOException {
        zbvu.zba().zbb(getClass()).zbi(this, zbtl.zba(zbtkVar));
    }

    public abstract Object zbb(int i5, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsj
    public final int zbj(zbvx zbvxVar) {
        if (zbG()) {
            int iZba = zbvxVar.zba(this);
            if (iZba >= 0) {
                return iZba;
            }
            throw new IllegalStateException(AbstractC3256n.g(iZba, "serialized size must be non-negative, was "));
        }
        int i5 = this.zbd & f.API_PRIORITY_OTHER;
        if (i5 != Integer.MAX_VALUE) {
            return i5;
        }
        int iZba2 = zbvxVar.zba(this);
        if (iZba2 < 0) {
            throw new IllegalStateException(AbstractC3256n.g(iZba2, "serialized size must be non-negative, was "));
        }
        this.zbd = (this.zbd & Integer.MIN_VALUE) | iZba2;
        return iZba2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn
    public final /* synthetic */ zbvm zbm() {
        return (zbuf) zbb(6, null, null);
    }

    public final int zbn() {
        return zbvu.zba().zbb(getClass()).zbb(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm
    public final int zbo() {
        if (zbG()) {
            int iZbc = zbc(null);
            if (iZbc >= 0) {
                return iZbc;
            }
            throw new IllegalStateException(AbstractC3256n.g(iZbc, "serialized size must be non-negative, was "));
        }
        int i5 = this.zbd & f.API_PRIORITY_OTHER;
        if (i5 != Integer.MAX_VALUE) {
            return i5;
        }
        int iZbc2 = zbc(null);
        if (iZbc2 < 0) {
            throw new IllegalStateException(AbstractC3256n.g(iZbc2, "serialized size must be non-negative, was "));
        }
        this.zbd = (this.zbd & Integer.MIN_VALUE) | iZbc2;
        return iZbc2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn
    public final boolean zbp() {
        return zbF(this, true);
    }

    public final zbtz zbq() {
        return (zbtz) zbb(5, null, null);
    }

    public final zbuf zbt() {
        return (zbuf) zbb(4, null, null);
    }
}
