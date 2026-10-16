package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzict;
import com.google.android.gms.internal.ads.zzicu;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public abstract class zzicu<MessageType extends zzicu<MessageType, BuilderType>, BuilderType extends zzict<MessageType, BuilderType>> implements zzifz {
    protected transient int zzq = 0;

    public static void zzaV(zzidl zzidlVar) throws IllegalArgumentException {
        if (!zzidlVar.zzi()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    public static <T> void zzaW(Iterable<T> iterable, List<? super T> list) {
        zzict.zzaT(iterable, list);
    }

    private String zzdV(String str) {
        String name = getClass().getName();
        StringBuilder sb2 = new StringBuilder(name.length() + 18 + String.valueOf(str).length() + 44);
        AbstractC3256n.p(sb2, "Serializing ", name, " to a ", str);
        sb2.append(" threw an IOException (should never happen).");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzifz
    public zzidl zzaM() {
        try {
            int iZzbr = zzbr();
            zzidl zzidlVar = zzidl.zza;
            byte[] bArr = new byte[iZzbr];
            int i5 = zzidu.zzb;
            zzidr zzidrVar = new zzidr(bArr, 0, iZzbr);
            zzcX(zzidrVar);
            return zzidh.zza(zzidrVar, bArr);
        } catch (IOException e7) {
            throw new RuntimeException(zzdV("ByteString"), e7);
        }
    }

    public byte[] zzaN() {
        try {
            int iZzbr = zzbr();
            byte[] bArr = new byte[iZzbr];
            int i5 = zzidu.zzb;
            zzidr zzidrVar = new zzidr(bArr, 0, iZzbr);
            zzcX(zzidrVar);
            zzidrVar.zzI();
            return bArr;
        } catch (IOException e7) {
            throw new RuntimeException(zzdV("byte array"), e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzifz
    public void zzaO(OutputStream outputStream) throws IOException {
        zzidt zzidtVar = new zzidt(outputStream, zzidu.zzE(zzbr()));
        zzcX(zzidtVar);
        zzidtVar.zzx();
    }

    public void zzaP(OutputStream outputStream) throws IOException {
        int iZzbr = zzbr();
        zzidt zzidtVar = new zzidt(outputStream, zzidu.zzE(zzidu.zzF(iZzbr) + iZzbr));
        zzidtVar.zzr(iZzbr);
        zzcX(zzidtVar);
        zzidtVar.zzx();
    }

    public int zzaQ() {
        throw new UnsupportedOperationException();
    }

    public void zzaR(int i5) {
        throw new UnsupportedOperationException();
    }

    public zzige zzaS() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    public int zzaT(zzigr zzigrVar) {
        return zzaQ();
    }

    public zzihc zzaU() {
        return new zzihc(this);
    }
}
