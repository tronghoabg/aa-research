package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import com.google.android.gms.internal.ads.zzict;
import com.google.android.gms.internal.ads.zzicu;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public abstract class zzict<MessageType extends zzicu<MessageType, BuilderType>, BuilderType extends zzict<MessageType, BuilderType>> implements zzify {
    private String zza(String str) {
        String name = getClass().getName();
        StringBuilder sb2 = new StringBuilder(name.length() + 16 + String.valueOf(str).length() + 44);
        AbstractC3256n.p(sb2, "Reading ", name, " from a ", str);
        sb2.append(" threw an IOException (should never happen).");
        return sb2.toString();
    }

    public static zzihc zzaR(zzifz zzifzVar) {
        return new zzihc(zzifzVar);
    }

    @Deprecated
    public static <T> void zzaS(Iterable<T> iterable, Collection<? super T> collection) {
        zzaT(iterable, (List) collection);
    }

    public static <T> void zzaT(Iterable<T> iterable, List<? super T> list) {
        iterable.getClass();
        if (!(iterable instanceof zzifk)) {
            if (iterable instanceof zzigi) {
                list.addAll((Collection) iterable);
                return;
            } else {
                zzb(iterable, list);
                return;
            }
        }
        List listZza = ((zzifk) iterable).zza();
        zzifk zzifkVar = (zzifk) list;
        int size = list.size();
        for (Object obj : listZza) {
            if (obj == null) {
                int size2 = zzifkVar.size() - size;
                String strO = AbstractC0279p0.o(new StringBuilder(String.valueOf(size2).length() + 26), "Element at index ", size2, " is null.");
                int size3 = zzifkVar.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(strO);
                    }
                    zzifkVar.remove(size3);
                }
            } else if (obj instanceof zzidl) {
                zzifkVar.zzb();
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                zzidl.zzt(bArr, 0, bArr.length);
                zzifkVar.zzb();
            } else {
                zzifkVar.add((String) obj);
            }
        }
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof zzigk) {
                ((zzigk) list).zze(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    zzc(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i5 = 0; i5 < size3; i5++) {
            A.I i10 = (Object) list2.get(i5);
            if (i10 == null) {
                zzc(list, size2);
            }
            list.add(i10);
        }
    }

    private static void zzc(List<?> list, int i5) {
        int size = list.size() - i5;
        String strO = AbstractC0279p0.o(new StringBuilder(String.valueOf(size).length() + 26), "Element at index ", size, " is null.");
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i5) {
                throw new NullPointerException(strO);
            }
            list.remove(size2);
        }
    }

    @Override // 
    /* renamed from: zzaC, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract BuilderType zzbf();

    /* renamed from: zzaD, reason: merged with bridge method [inline-methods] */
    public BuilderType zzbe(zzidp zzidpVar) throws IOException {
        int i5 = zzidz.zzb;
        int i10 = zzicy.zza;
        return (BuilderType) zzbd(zzidpVar, zzidz.zza);
    }

    @Override // 
    /* renamed from: zzaE, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzbd(zzidp zzidpVar, zzidz zzidzVar) throws IOException;

    public BuilderType zzaF(zzidl zzidlVar) throws zzifh {
        try {
            zzidp zzidpVarZzm = zzidlVar.zzm();
            zzbe(zzidpVarZzm);
            zzidpVarZzm.zzb(0);
            return this;
        } catch (zzifh e7) {
            throw e7;
        } catch (IOException e10) {
            throw new RuntimeException(zza("ByteString"), e10);
        }
    }

    public BuilderType zzaG(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        try {
            zzidp zzidpVarZzm = zzidlVar.zzm();
            zzbd(zzidpVarZzm, zzidzVar);
            zzidpVarZzm.zzb(0);
            return this;
        } catch (zzifh e7) {
            throw e7;
        } catch (IOException e10) {
            throw new RuntimeException(zza("ByteString"), e10);
        }
    }

    /* renamed from: zzaH, reason: merged with bridge method [inline-methods] */
    public BuilderType zzba(byte[] bArr) throws zzifh {
        return (BuilderType) zzaZ(bArr, 0, bArr.length);
    }

    @Override // 
    /* renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaZ(byte[] bArr, int i5, int i10) throws zzifh {
        try {
            zzidp zzidpVarZzI = zzidp.zzI(bArr, i5, i10, false);
            zzbe(zzidpVarZzI);
            zzidpVarZzI.zzb(0);
            return this;
        } catch (zzifh e7) {
            throw e7;
        } catch (IOException e10) {
            throw new RuntimeException(zza("byte array"), e10);
        }
    }

    /* renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaY(byte[] bArr, zzidz zzidzVar) throws zzifh {
        return (BuilderType) zzaX(bArr, 0, bArr.length, zzidzVar);
    }

    @Override // 
    /* renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaX(byte[] bArr, int i5, int i10, zzidz zzidzVar) throws zzifh {
        try {
            zzidp zzidpVarZzI = zzidp.zzI(bArr, i5, i10, false);
            zzbd(zzidpVarZzI, zzidzVar);
            zzidpVarZzI.zzb(0);
            return this;
        } catch (zzifh e7) {
            throw e7;
        } catch (IOException e10) {
            throw new RuntimeException(zza("byte array"), e10);
        }
    }

    public BuilderType zzaL(InputStream inputStream) throws IOException {
        zzidp zzidpVarZzH = zzidp.zzH(inputStream, 4096);
        zzbe(zzidpVarZzH);
        zzidpVarZzH.zzb(0);
        return this;
    }

    public BuilderType zzaM(InputStream inputStream, zzidz zzidzVar) throws IOException {
        zzidp zzidpVarZzH = zzidp.zzH(inputStream, 4096);
        zzbd(zzidpVarZzH, zzidzVar);
        zzidpVarZzH.zzb(0);
        return this;
    }

    public boolean zzaN(InputStream inputStream, zzidz zzidzVar) throws IOException {
        int i5 = inputStream.read();
        if (i5 == -1) {
            return false;
        }
        zzaM(new zzics(inputStream, zzidp.zzO(i5, inputStream)), zzidzVar);
        return true;
    }

    public boolean zzaO(InputStream inputStream) throws IOException {
        int i5 = zzidz.zzb;
        int i10 = zzicy.zza;
        return zzaN(inputStream, zzidz.zza);
    }

    /* renamed from: zzaP, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaU(zzifz zzifzVar) {
        if (zzbw().getClass().isInstance(zzifzVar)) {
            return (BuilderType) zzaQ((zzicu) zzifzVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public abstract BuilderType zzaQ(MessageType messagetype);

    public /* bridge */ /* synthetic */ zzify zzaV(InputStream inputStream, zzidz zzidzVar) throws IOException {
        zzaM(inputStream, zzidzVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzify zzaW(InputStream inputStream) throws IOException {
        zzaL(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzify zzbb(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        zzaG(zzidlVar, zzidzVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzify zzbc(zzidl zzidlVar) throws zzifh {
        zzaF(zzidlVar);
        return this;
    }
}
