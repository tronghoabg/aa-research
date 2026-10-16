package com.google.android.recaptcha.internal;

import A7.AbstractC0279p0;
import com.google.android.recaptcha.internal.zzif;
import com.google.android.recaptcha.internal.zzig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class zzig<MessageType extends zzig<MessageType, BuilderType>, BuilderType extends zzif<MessageType, BuilderType>> implements zzlx {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void zzc(Iterable iterable, List list) {
        byte[] bArr = zzla.zzb;
        iterable.getClass();
        if (!(iterable instanceof zzlj)) {
            if (iterable instanceof zzmf) {
                list.addAll(iterable);
                return;
            }
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(iterable.size() + list.size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String strI = AbstractC0279p0.i(list.size() - size, "Element at index ", " is null.");
                    int size2 = list.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(strI);
                        }
                        list.remove(size2);
                    }
                } else {
                    list.add(obj);
                }
            }
            return;
        }
        List listZza = ((zzlj) iterable).zza();
        zzlj zzljVar = (zzlj) list;
        int size3 = list.size();
        for (Object obj2 : listZza) {
            if (obj2 == null) {
                String strI2 = AbstractC0279p0.i(zzljVar.size() - size3, "Element at index ", " is null.");
                int size4 = zzljVar.size();
                while (true) {
                    size4--;
                    if (size4 < size3) {
                        throw new NullPointerException(strI2);
                    }
                    zzljVar.remove(size4);
                }
            } else if (obj2 instanceof zziv) {
                zzljVar.zzb();
            } else if (obj2 instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj2;
                zziv.zzk(bArr2, 0, bArr2.length);
                zzljVar.zzb();
            } else {
                zzljVar.add((String) obj2);
            }
        }
    }

    public int zza(zzmk zzmkVar) {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzlx
    public final zziv zzb() {
        try {
            int iZzn = zzn();
            zziv zzivVar = zziv.zzb;
            byte[] bArr = new byte[iZzn];
            zzjg zzjgVarZzz = zzjg.zzz(bArr, 0, iZzn);
            zze(zzjgVarZzz);
            zzjgVarZzz.zzA();
            return new zziu(bArr);
        } catch (IOException e7) {
            throw new RuntimeException(AbstractC0279p0.l("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e7);
        }
    }

    public final byte[] zzd() {
        try {
            int iZzn = zzn();
            byte[] bArr = new byte[iZzn];
            zzjg zzjgVarZzz = zzjg.zzz(bArr, 0, iZzn);
            zze(zzjgVarZzz);
            zzjgVarZzz.zzA();
            return bArr;
        } catch (IOException e7) {
            throw new RuntimeException(AbstractC0279p0.l("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e7);
        }
    }
}
