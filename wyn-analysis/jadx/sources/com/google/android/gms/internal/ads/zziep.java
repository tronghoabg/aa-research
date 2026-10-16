package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zziej;
import com.google.android.gms.internal.ads.zziep;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public abstract class zziep<MessageType extends zziep<MessageType, BuilderType>, BuilderType extends zziej<MessageType, BuilderType>> extends zzicu<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static final Map<Class<?>, zziep<?, ?>> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc = -1;
    protected zzihe zzt = zzihe.zza();

    public static Method zzbA(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e7) {
            String name = cls.getName();
            int length = name.length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + length + 43 + 2);
            AbstractC3256n.p(sb2, "Generated message class \"", name, "\" missing method \"", str);
            sb2.append("\".");
            throw new RuntimeException(sb2.toString(), e7);
        }
    }

    public static Object zzbB(Method method, Object obj, Object... objArr) {
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

    public static zziex zzbC() {
        return zzieq.zzd();
    }

    public static zziex zzbD(zziex zziexVar) {
        int size = zziexVar.size();
        return zziexVar.zzh(size + size);
    }

    public static zzifa zzbE() {
        return zzifn.zzg();
    }

    public static zzifa zzbF(zzifa zzifaVar) {
        int size = zzifaVar.size();
        return zzifaVar.zzh(size + size);
    }

    public static zziew zzbG() {
        return zzieg.zzd();
    }

    public static zziew zzbH(zziew zziewVar) {
        int size = zziewVar.size();
        return zziewVar.zzh(size + size);
    }

    public static zzies zzbI() {
        return zzidw.zzd();
    }

    public static zzies zzbJ(zzies zziesVar) {
        int size = zziesVar.size();
        return zziesVar.zzh(size + size);
    }

    public static zzier zzbK() {
        return zzidb.zzd();
    }

    public static zzier zzbL(zzier zzierVar) {
        int size = zzierVar.size();
        return zzierVar.zzh(size + size);
    }

    public static <E> zzifb<E> zzbM() {
        return zzigk.zzd();
    }

    public static <E> zzifb<E> zzbN(zzifb<E> zzifbVar) {
        int size = zzifbVar.size();
        return zzifbVar.zzh(size + size);
    }

    public static <T extends zziep<T, ?>> T zzbO(T t10, zzidp zzidpVar, zzidz zzidzVar) throws zzifh {
        T t11 = (T) t10.zzbg();
        try {
            zzigr zzigrVarZzb = zzigj.zza().zzb(t11.getClass());
            zzigrVarZzb.zzg(t11, zzidq.zza(zzidpVar), zzidzVar);
            zzigrVarZzb.zzk(t11);
            return t11;
        } catch (zzifh e7) {
            if (e7.zzb()) {
                throw new zzifh(e7);
            }
            throw e7;
        } catch (zzihc e10) {
            throw e10.zza();
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzifh) {
                throw ((zzifh) e11.getCause());
            }
            throw new zzifh(e11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof zzifh) {
                throw ((zzifh) e12.getCause());
            }
            throw e12;
        }
    }

    public static <T extends zziep<T, ?>> T zzbP(T t10, zzidp zzidpVar) throws zzifh {
        int i5 = zzidz.zzb;
        int i10 = zzicy.zza;
        return (T) zzbO(t10, zzidpVar, zzidz.zza);
    }

    public static <T extends zziep<T, ?>> T zzbQ(T t10, ByteBuffer byteBuffer, zzidz zzidzVar) throws zzifh {
        zzidp zzidpVarZzI;
        if (byteBuffer.hasArray()) {
            zzidpVarZzI = zzidp.zzI(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            zzidpVarZzI = zzidp.zzI(bArr, 0, iRemaining, true);
        }
        T t11 = (T) zzbZ(t10, zzidpVarZzI, zzidzVar);
        zzi(t11);
        return t11;
    }

    public static <T extends zziep<T, ?>> T zzbR(T t10, ByteBuffer byteBuffer) throws zzifh {
        int i5 = zzidz.zzb;
        int i10 = zzicy.zza;
        return (T) zzbQ(t10, byteBuffer, zzidz.zza);
    }

    public static <T extends zziep<T, ?>> T zzbS(T t10, zzidl zzidlVar) throws zzifh {
        int i5 = zzidz.zzb;
        int i10 = zzicy.zza;
        T t11 = (T) zzbT(t10, zzidlVar, zzidz.zza);
        zzi(t11);
        return t11;
    }

    public static <T extends zziep<T, ?>> T zzbT(T t10, zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        T t11 = (T) zzj(t10, zzidlVar, zzidzVar);
        zzi(t11);
        return t11;
    }

    public static <T extends zziep<T, ?>> T zzbU(T t10, byte[] bArr) throws zzifh {
        int length = bArr.length;
        int i5 = zzidz.zzb;
        int i10 = zzicy.zza;
        T t11 = (T) zzh(t10, bArr, 0, length, zzidz.zza);
        zzi(t11);
        return t11;
    }

    public static <T extends zziep<T, ?>> T zzbV(T t10, byte[] bArr, zzidz zzidzVar) throws zzifh {
        T t11 = (T) zzh(t10, bArr, 0, bArr.length, zzidzVar);
        zzi(t11);
        return t11;
    }

    public static <T extends zziep<T, ?>> T zzbW(T t10, InputStream inputStream) throws zzifh {
        zzidp zzidpVarZzH = zzidp.zzH(inputStream, 4096);
        int i5 = zzidz.zzb;
        int i10 = zzicy.zza;
        T t11 = (T) zzbO(t10, zzidpVarZzH, zzidz.zza);
        zzi(t11);
        return t11;
    }

    public static <T extends zziep<T, ?>> T zzbX(T t10, InputStream inputStream, zzidz zzidzVar) throws zzifh {
        T t11 = (T) zzbO(t10, zzidp.zzH(inputStream, 4096), zzidzVar);
        zzi(t11);
        return t11;
    }

    public static <T extends zziep<T, ?>> T zzbY(T t10, zzidp zzidpVar) throws zzifh {
        int i5 = zzidz.zzb;
        int i10 = zzicy.zza;
        return (T) zzbZ(t10, zzidpVar, zzidz.zza);
    }

    public static <T extends zziep<T, ?>> T zzbZ(T t10, zzidp zzidpVar, zzidz zzidzVar) throws zzifh {
        T t11 = (T) zzbO(t10, zzidpVar, zzidzVar);
        zzi(t11);
        return t11;
    }

    public static <T extends zziep> T zzbt(Class<T> cls) throws ClassNotFoundException {
        Map<Class<?>, zziep<?, ?>> map = zzd;
        zziep<?, ?> zziepVar = map.get(cls);
        if (zziepVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zziepVar = map.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (zziepVar != null) {
            return zziepVar;
        }
        zziep<?, ?> zziepVarZzbw = ((zziep) zzihk.zzb(cls)).zzbw();
        if (zziepVarZzbw == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zziepVarZzbw);
        return zziepVarZzbw;
    }

    public static <T extends zziep> void zzbu(Class<T> cls, T t10) {
        t10.zzaY();
        zzd.put(cls, t10);
    }

    public static Object zzbv(zzifz zzifzVar, String str, Object[] objArr) {
        return new zzigl(zzifzVar, str, objArr);
    }

    public static <ContainingType extends zzifz, Type> zzien<ContainingType, Type> zzby(ContainingType containingtype, Type type, zzifz zzifzVar, zzieu zzieuVar, int i5, zzihq zzihqVar, Class cls) {
        return new zzien<>(containingtype, type, zzifzVar, new zziem(zzieuVar, i5, zzihqVar, false, false), cls);
    }

    public static <ContainingType extends zzifz, Type> zzien<ContainingType, Type> zzbz(ContainingType containingtype, zzifz zzifzVar, zzieu zzieuVar, int i5, zzihq zzihqVar, boolean z2, Class cls) {
        return new zzien<>(containingtype, zzigk.zzd(), zzifzVar, new zziem(zzieuVar, i5, zzihqVar, true, z2), cls);
    }

    private void zzc() {
        if (this.zzt == zzihe.zza()) {
            this.zzt = zzihe.zzb();
        }
    }

    public static <T extends zziep<T, ?>> T zzca(T t10, InputStream inputStream) throws zzifh {
        int i5 = zzidz.zzb;
        int i10 = zzicy.zza;
        T t11 = (T) zzk(t10, inputStream, zzidz.zza);
        zzi(t11);
        return t11;
    }

    public static <T extends zziep<T, ?>> T zzcb(T t10, InputStream inputStream, zzidz zzidzVar) throws zzifh {
        T t11 = (T) zzk(t10, inputStream, zzidzVar);
        zzi(t11);
        return t11;
    }

    private int zzd(zzigr<?> zzigrVar) {
        if (zzigrVar != null) {
            return zzigrVar.zze(this);
        }
        return zzigj.zza().zzb(getClass()).zze(this);
    }

    private static <MessageType extends zziel<MessageType, BuilderType>, BuilderType, T> zzien<MessageType, T> zze(zzidx<MessageType, T> zzidxVar) {
        return (zzien) zzidxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends zziep<T, ?>> boolean zzg(T t10, boolean z2) {
        byte bByteValue = ((Byte) t10.zzdc(zzieo.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzigj.zza().zzb(t10.getClass()).zzl(t10);
        if (z2) {
            t10.zzdc(zzieo.SET_MEMOIZED_IS_INITIALIZED, true != zZzl ? null : t10, null);
        }
        return zZzl;
    }

    private static <T extends zziep<T, ?>> T zzh(T t10, byte[] bArr, int i5, int i10, zzidz zzidzVar) throws zzifh {
        if (i10 == 0) {
            return t10;
        }
        T t11 = (T) t10.zzbg();
        try {
            zzigr zzigrVarZzb = zzigj.zza().zzb(t11.getClass());
            zzigrVarZzb.zzj(t11, bArr, i5, i5 + i10, new zzicz(zzidzVar));
            zzigrVarZzb.zzk(t11);
            return t11;
        } catch (zzifh e7) {
            if (e7.zzb()) {
                throw new zzifh(e7);
            }
            throw e7;
        } catch (zzihc e10) {
            throw e10.zza();
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzifh) {
                throw ((zzifh) e11.getCause());
            }
            throw new zzifh(e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static <T extends zziep<T, ?>> T zzi(T t10) throws zzifh {
        if (t10 == null || t10.zzbi()) {
            return t10;
        }
        throw t10.zzaU().zza();
    }

    private static <T extends zziep<T, ?>> T zzj(T t10, zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        zzidp zzidpVarZzm = zzidlVar.zzm();
        T t11 = (T) zzbO(t10, zzidpVarZzm, zzidzVar);
        zzidpVarZzm.zzb(0);
        return t11;
    }

    private static <T extends zziep<T, ?>> T zzk(T t10, InputStream inputStream, zzidz zzidzVar) throws IOException {
        try {
            int i5 = inputStream.read();
            if (i5 == -1) {
                return null;
            }
            zzidp zzidpVarZzH = zzidp.zzH(new zzics(inputStream, zzidp.zzO(i5, inputStream)), 4096);
            T t11 = (T) zzbO(t10, zzidpVarZzH, zzidzVar);
            zzidpVarZzH.zzb(0);
            return t11;
        } catch (zzifh e7) {
            if (e7.zzb()) {
                throw new zzifh(e7);
            }
            throw e7;
        } catch (IOException e10) {
            throw new zzifh(e10);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzigj.zza().zzb(getClass()).zzb(this, (zziep) obj);
    }

    public int hashCode() {
        if (zzaX()) {
            return zzbh();
        }
        if (zzbc()) {
            zzba(zzbh());
        }
        return zzaZ();
    }

    public String toString() {
        return zzigb.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzicu
    public final int zzaQ() {
        return this.zzc & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.ads.zzicu
    public void zzaR(int i5) {
        if (i5 < 0) {
            throw new IllegalStateException(N0.a.d(i5, "serialized size must be non-negative, was ", new StringBuilder(String.valueOf(i5).length() + 42)));
        }
        this.zzc = i5 | (this.zzc & Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzicu
    public int zzaT(zzigr zzigrVar) {
        if (zzaX()) {
            int iZzd = zzd(zzigrVar);
            if (iZzd >= 0) {
                return iZzd;
            }
            throw new IllegalStateException(N0.a.d(iZzd, "serialized size must be non-negative, was ", new StringBuilder(String.valueOf(iZzd).length() + 42)));
        }
        if (zzaQ() != Integer.MAX_VALUE) {
            return zzaQ();
        }
        int iZzd2 = zzd(zzigrVar);
        zzaR(iZzd2);
        return iZzd2;
    }

    public final boolean zzaX() {
        return (this.zzc & Integer.MIN_VALUE) != 0;
    }

    public final void zzaY() {
        this.zzc &= com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public final int zzaZ() {
        return this.zzq;
    }

    public final void zzba(int i5) {
        this.zzq = i5;
    }

    public final void zzbb() {
        this.zzq = 0;
    }

    public final boolean zzbc() {
        return zzaZ() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzifz
    public final zzigh<MessageType> zzbd() {
        return (zzigh) zzdc(zzieo.GET_PARSER, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zziga
    /* renamed from: zzbe, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbw() {
        return (MessageType) zzdc(zzieo.GET_DEFAULT_INSTANCE, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzifz
    /* renamed from: zzbf, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcY() {
        return (BuilderType) zzdc(zzieo.NEW_BUILDER, null, null);
    }

    public final MessageType zzbg() {
        return (MessageType) zzdc(zzieo.NEW_MUTABLE_INSTANCE, null, null);
    }

    public final int zzbh() {
        return zzigj.zza().zzb(getClass()).zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zziga
    public final boolean zzbi() {
        return zzg(this, true);
    }

    public final boolean zzbj(int i5, zzidp zzidpVar) throws IOException {
        if ((i5 & 7) == 4) {
            return false;
        }
        zzc();
        return this.zzt.zzl(i5, zzidpVar);
    }

    public final void zzbk(int i5, int i10) {
        zzc();
        zzihe zziheVar = this.zzt;
        zziheVar.zze();
        if (i5 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zziheVar.zzk(i5 << 3, Long.valueOf(i10));
    }

    public final void zzbl(int i5, zzidl zzidlVar) {
        zzc();
        zzihe zziheVar = this.zzt;
        zziheVar.zze();
        if (i5 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zziheVar.zzk((i5 << 3) | 2, zzidlVar);
    }

    public final void zzbm() {
        zzigj.zza().zzb(getClass()).zzk(this);
        zzaY();
    }

    public final <MessageType2 extends zziep<MessageType2, BuilderType2>, BuilderType2 extends zziej<MessageType2, BuilderType2>> BuilderType2 zzbn() {
        return (BuilderType2) zzdc(zzieo.NEW_BUILDER, null, null);
    }

    public final <MessageType2 extends zziep<MessageType2, BuilderType2>, BuilderType2 extends zziej<MessageType2, BuilderType2>> BuilderType2 zzbo(MessageType2 messagetype2) {
        BuilderType2 buildertype2 = (BuilderType2) zzbn();
        buildertype2.zzbo(messagetype2);
        return buildertype2;
    }

    /* renamed from: zzbp, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcc() {
        BuilderType buildertype = (BuilderType) zzdc(zzieo.NEW_BUILDER, null, null);
        buildertype.zzbo(this);
        return buildertype;
    }

    public final void zzbq() {
        zzaR(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    @Override // com.google.android.gms.internal.ads.zzifz
    public int zzbr() {
        return zzaT(null);
    }

    public final Object zzbs() throws Exception {
        return zzdc(zzieo.BUILD_MESSAGE_INFO, null, null);
    }

    public final void zzbx(zzihe zziheVar) {
        this.zzt = zzihe.zzc(this.zzt, zziheVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifz
    public void zzcX(zzidu zziduVar) throws IOException {
        zzigj.zza().zzb(getClass()).zzf(this, zzidv.zza(zziduVar));
    }

    public abstract Object zzdc(zzieo zzieoVar, Object obj, Object obj2);
}
