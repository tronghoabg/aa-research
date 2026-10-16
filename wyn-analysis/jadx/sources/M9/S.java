package m9;

import A7.InterfaceC0248f;
import J9.C0664x;
import Va.C1077na;
import Va.InterfaceC1064ma;
import Va.InterfaceC1129rb;
import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.WebChromeClient;
import com.google.android.gms.internal.measurement.zzng;
import com.google.android.gms.internal.measurement.zzoe;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.internal.measurement.zzow;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3340k;
import l8.AbstractC3409K;

/* loaded from: classes4.dex */
public final class S implements InterfaceC0248f, A7.C, zzu, L8.e, G0.d, I5.i, J5.m, L4.A, InterfaceC1129rb, InterfaceC1064ma, Z4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40454a;

    public /* synthetic */ S(int i5) {
        this.f40454a = i5;
    }

    public static byte[] d(long j8, AbstractC3409K abstractC3409K) {
        C0664x c0664x = new C0664x(18);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(abstractC3409K.size());
        Iterator<E> it = abstractC3409K.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) c0664x.apply(it.next()));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j8);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    @Override // A7.InterfaceC0248f
    public String a(String str, String str2) {
        return null;
    }

    @Override // G0.d
    public List b() {
        LocaleList localeList = LocaleList.getDefault();
        AbstractC3340k.d(localeList, "getDefault()");
        ArrayList arrayList = new ArrayList();
        int size = localeList.size();
        for (int i5 = 0; i5 < size; i5++) {
            Locale locale = localeList.get(i5);
            AbstractC3340k.d(locale, "localeList[i]");
            arrayList.add(new G0.a(locale));
        }
        return arrayList;
    }

    @Override // Z4.a
    public Object c() {
        return new ArrayList();
    }

    @Override // Va.InterfaceC1064ma
    public boolean e(C1077na c1077na) {
        return WebChromeClient.class.equals(c1077na.t0().getType());
    }

    public boolean equals(Object obj) {
        switch (this.f40454a) {
            case 0:
                if (this == obj) {
                    return true;
                }
                return obj != null && S.class == obj.getClass();
            default:
                return super.equals(obj);
        }
    }

    @Override // I5.i
    public /* synthetic */ void f() {
    }

    @Override // I5.i
    public /* synthetic */ I5.h h(I5.f fVar, E5.T t10) {
        return I5.h.f5395a;
    }

    @Override // I5.i
    public A.e0 i(I5.f fVar, E5.T t10) {
        if (t10.f3241o == null) {
            return null;
        }
        return new A.e0(new I5.d(new I5.k(), 6001), 10);
    }

    @Override // L4.A
    public void j(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // I5.i
    public int k(E5.T t10) {
        return t10.f3241o != null ? 1 : 0;
    }

    @Override // J5.m
    public void l() {
        throw new UnsupportedOperationException();
    }

    @Override // J5.m
    public J5.w m(int i5, int i10) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01ff  */
    @Override // Va.InterfaceC1129rb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(java.lang.String r17, org.json.JSONObject r18) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.S.n(java.lang.String, org.json.JSONObject):java.lang.Object");
    }

    @Override // L8.e
    public Object o(C6.l lVar) {
        return new Ea.h((ya.g) lVar.a(ya.g.class));
    }

    @Override // I5.i
    public /* synthetic */ void release() {
    }

    public String toString() {
        switch (this.f40454a) {
            case 0:
                return "MemoryEagerGcSettings{}";
            default:
                return super.toString();
        }
    }

    @Override // J5.m
    public void x(J5.t tVar) {
        throw new UnsupportedOperationException();
    }

    @Override // A7.C
    public Object zza() {
        switch (this.f40454a) {
            case 2:
                return Boolean.valueOf(zzpn.zzh());
            case 3:
                return Boolean.valueOf(zzov.zzc());
            case 4:
                return Boolean.valueOf(zzop.zza());
            case 5:
                return Integer.valueOf((int) zzng.zzk());
            case 6:
                return Long.valueOf(zzng.zzad());
            case 7:
                return Long.valueOf(zzng.zzt());
            case 8:
                return zzph.zze();
            case 9:
                return Long.valueOf(zzng.zzz());
            case 10:
                return zzng.zzax();
            case 11:
                return zzng.zzar();
            case 12:
                return Boolean.valueOf(zzoe.zzd());
            case 13:
                return Boolean.valueOf(zzpu.zzc());
            default:
                return Boolean.valueOf(zzow.zzc());
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
    public Object zza(Object obj) {
        return new Ca.e((zzuz) obj);
    }

    @Override // I5.i
    public void g(Looper looper, F5.l lVar) {
    }
}
