package A7;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.internal.measurement.zzgu;
import com.google.android.gms.internal.measurement.zzhk;
import com.google.android.gms.internal.measurement.zzjg;
import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzlb;
import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpo;
import com.google.android.gms.internal.measurement.zzpu;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import f7.C2615b;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes4.dex */
public final class S1 extends G1 {
    public static void A0(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                z0(builder, str3, string, set);
            }
        }
    }

    public static void B0(zzfy.zzf.zza zzaVar, String str, Long l10) {
        List<zzfy.zzh> listZzf = zzaVar.zzf();
        int i5 = 0;
        while (true) {
            if (i5 >= listZzf.size()) {
                i5 = -1;
                break;
            } else if (str.equals(listZzf.get(i5).zzg())) {
                break;
            } else {
                i5++;
            }
        }
        zzfy.zzh.zza zzaVarZza = zzfy.zzh.zze().zza(str);
        if (l10 instanceof Long) {
            zzaVarZza.zza(l10.longValue());
        }
        if (i5 >= 0) {
            zzaVar.zza(i5, zzaVarZza);
        } else {
            zzaVar.zza(zzaVarZza);
        }
    }

    public static void E0(StringBuilder sb2, int i5) {
        for (int i10 = 0; i10 < i5; i10++) {
            sb2.append("  ");
        }
    }

    public static void G0(StringBuilder sb2, int i5, String str, zzfo.zzd zzdVar) {
        if (zzdVar == null) {
            return;
        }
        E0(sb2, i5);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzdVar.zzh()) {
            H0(sb2, i5, "comparison_type", zzdVar.zza().name());
        }
        if (zzdVar.zzj()) {
            H0(sb2, i5, "match_as_float", Boolean.valueOf(zzdVar.zzg()));
        }
        if (zzdVar.zzi()) {
            H0(sb2, i5, "comparison_value", zzdVar.zzd());
        }
        if (zzdVar.zzl()) {
            H0(sb2, i5, "min_comparison_value", zzdVar.zzf());
        }
        if (zzdVar.zzk()) {
            H0(sb2, i5, "max_comparison_value", zzdVar.zze());
        }
        E0(sb2, i5);
        sb2.append("}\n");
    }

    public static void H0(StringBuilder sb2, int i5, String str, Object obj) {
        if (obj == null) {
            return;
        }
        E0(sb2, i5 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public static void J0(StringBuilder sb2, String str, zzfy.zzm zzmVar) {
        if (zzmVar == null) {
            return;
        }
        E0(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzmVar.zzb() != 0) {
            E0(sb2, 4);
            sb2.append("results: ");
            int i5 = 0;
            for (Long l10 : zzmVar.zzi()) {
                int i10 = i5 + 1;
                if (i5 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i5 = i10;
            }
            sb2.append('\n');
        }
        if (zzmVar.zzd() != 0) {
            E0(sb2, 4);
            sb2.append("status: ");
            int i11 = 0;
            for (Long l11 : zzmVar.zzk()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (zzmVar.zza() != 0) {
            E0(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i13 = 0;
            for (zzfy.zze zzeVar : zzmVar.zzh()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzeVar.zzf() ? Integer.valueOf(zzeVar.zza()) : null);
                sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                sb2.append(zzeVar.zze() ? Long.valueOf(zzeVar.zzb()) : null);
                i13 = i14;
            }
            sb2.append("}\n");
        }
        if (zzmVar.zzc() != 0) {
            E0(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i15 = 0;
            for (zzfy.zzn zznVar : zzmVar.zzj()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zznVar.zzf() ? Integer.valueOf(zznVar.zzb()) : null);
                sb2.append(": [");
                Iterator<Long> it = zznVar.zze().iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    long jLongValue = it.next().longValue();
                    int i18 = i17 + 1;
                    if (i17 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(jLongValue);
                    i17 = i18;
                }
                sb2.append("]");
                i15 = i16;
            }
            sb2.append("}\n");
        }
        E0(sb2, 3);
        sb2.append("}\n");
    }

    public static boolean K0(int i5, List list) {
        if (i5 < (list.size() << 6)) {
            return ((1 << (i5 % 64)) & ((Long) list.get(i5 / 64)).longValue()) != 0;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.os.Bundle[], java.io.Serializable] */
    public static Serializable M0(zzfy.zzf zzfVar, String str) {
        zzfy.zzh zzhVarS0 = s0(zzfVar, str);
        if (zzhVarS0 == null) {
            return null;
        }
        if (zzhVarS0.zzn()) {
            return zzhVarS0.zzh();
        }
        if (zzhVarS0.zzl()) {
            return Long.valueOf(zzhVarS0.zzd());
        }
        if (zzhVarS0.zzj()) {
            return Double.valueOf(zzhVarS0.zza());
        }
        if (zzhVarS0.zzc() > 0) {
            return P0(zzhVarS0.zzi());
        }
        return null;
    }

    public static boolean N0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static Bundle[] P0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfy.zzh zzhVar = (zzfy.zzh) it.next();
            if (zzhVar != null) {
                Bundle bundle = new Bundle();
                for (zzfy.zzh zzhVar2 : zzhVar.zzi()) {
                    if (zzhVar2.zzn()) {
                        bundle.putString(zzhVar2.zzg(), zzhVar2.zzh());
                    } else if (zzhVar2.zzl()) {
                        bundle.putLong(zzhVar2.zzg(), zzhVar2.zzd());
                    } else if (zzhVar2.zzj()) {
                        bundle.putDouble(zzhVar2.zzg(), zzhVar2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static int k0(zzfy.zzk.zza zzaVar, String str) {
        if (zzaVar == null) {
            return -1;
        }
        for (int i5 = 0; i5 < zzaVar.zzd(); i5++) {
            if (str.equals(zzaVar.zzk(i5).zzg())) {
                return i5;
            }
        }
        return -1;
    }

    public static C0301x m0(zzad zzadVar) {
        Object obj;
        Bundle bundleP0 = p0(zzadVar.zzc(), true);
        String string = (!bundleP0.containsKey("_o") || (obj = bundleP0.get("_o")) == null) ? "app" : obj.toString();
        String strC = I0.c(zzadVar.zzb(), I0.f523a, I0.f525c);
        if (strC == null) {
            strC = zzadVar.zzb();
        }
        return new C0301x(strC, new C0298w(bundleP0), string, zzadVar.zza());
    }

    public static Bundle o0(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfy.zzh zzhVar = (zzfy.zzh) it.next();
            String strZzg = zzhVar.zzg();
            if (zzhVar.zzj()) {
                bundle.putDouble(strZzg, zzhVar.zza());
            } else if (zzhVar.zzk()) {
                bundle.putFloat(strZzg, zzhVar.zzb());
            } else if (zzhVar.zzn()) {
                bundle.putString(strZzg, zzhVar.zzh());
            } else if (zzhVar.zzl()) {
                bundle.putLong(strZzg, zzhVar.zzd());
            }
        }
        return bundle;
    }

    public static Bundle p0(Map map, boolean z2) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z2) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj2 = arrayList.get(i5);
                    i5++;
                    arrayList2.add(p0((Map) obj2, false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static zzfy.zzh s0(zzfy.zzf zzfVar, String str) {
        for (zzfy.zzh zzhVar : zzfVar.zzh()) {
            if (zzhVar.zzg().equals(str)) {
                return zzhVar;
            }
        }
        return null;
    }

    public static zzlb t0(zzjt.zzb zzbVar, byte[] bArr) {
        zzjg zzjgVarZza = zzjg.zza();
        return zzjgVarZza != null ? zzbVar.zza(bArr, zzjgVarZza) : zzbVar.zza(bArr);
    }

    public static String v0(boolean z2, boolean z10, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        if (z2) {
            sb2.append("Dynamic ");
        }
        if (z10) {
            sb2.append("Sequence ");
        }
        if (z11) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    public static ArrayList w0(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i5 = 0; i5 < length; i5++) {
            long j8 = 0;
            for (int i10 = 0; i10 < 64; i10++) {
                int i11 = (i5 << 6) + i10;
                if (i11 < bitSet.length()) {
                    if (bitSet.get(i11)) {
                        j8 |= 1 << i10;
                    }
                }
            }
            arrayList.add(Long.valueOf(j8));
        }
        return arrayList;
    }

    public static HashMap x0(Bundle bundle, boolean z2) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z10 = obj instanceof Parcelable[];
            if (z10 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z2) {
                    ArrayList arrayList = new ArrayList();
                    if (z10) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(x0((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj2 = arrayList2.get(i5);
                            i5++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(x0((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(x0((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public static void z0(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public final void C0(zzfy.zzh.zza zzaVar, Object obj) {
        zzaVar.zze().zzc().zzb().zzd();
        if (obj instanceof String) {
            zzaVar.zzb((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzaVar.zza(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzaVar.zza(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            zzj().f605f.d("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                zzfy.zzh.zza zzaVarZze = zzfy.zzh.zze();
                for (String str : bundle.keySet()) {
                    zzfy.zzh.zza zzaVarZza = zzfy.zzh.zze().zza(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        zzaVarZza.zza(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        zzaVarZza.zzb((String) obj2);
                    } else if (obj2 instanceof Double) {
                        zzaVarZza.zza(((Double) obj2).doubleValue());
                    }
                    zzaVarZze.zza(zzaVarZza);
                }
                if (zzaVarZze.zza() > 0) {
                    arrayList.add((zzfy.zzh) ((zzjt) zzaVarZze.zzai()));
                }
            }
        }
        zzaVar.zza(arrayList);
    }

    public final void D0(zzfy.zzo.zza zzaVar, Object obj) {
        AbstractC1732v.i(obj);
        zzaVar.zzc().zzb().zza();
        if (obj instanceof String) {
            zzaVar.zzb((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzaVar.zza(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzaVar.zza(((Double) obj).doubleValue());
        } else {
            zzj().f605f.d("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final void F0(StringBuilder sb2, int i5, zzfo.zzc zzcVar) {
        if (zzcVar == null) {
            return;
        }
        E0(sb2, i5);
        sb2.append("filter {\n");
        if (zzcVar.zzg()) {
            H0(sb2, i5, "complement", Boolean.valueOf(zzcVar.zzf()));
        }
        if (zzcVar.zzi()) {
            H0(sb2, i5, "param_name", ((C0273n0) this.f421a).f984m.f(zzcVar.zze()));
        }
        if (zzcVar.zzj()) {
            int i10 = i5 + 1;
            zzfo.zzf zzfVarZzd = zzcVar.zzd();
            if (zzfVarZzd != null) {
                E0(sb2, i10);
                sb2.append("string_filter");
                sb2.append(" {\n");
                if (zzfVarZzd.zzj()) {
                    H0(sb2, i10, "match_type", zzfVarZzd.zzb().name());
                }
                if (zzfVarZzd.zzi()) {
                    H0(sb2, i10, "expression", zzfVarZzd.zze());
                }
                if (zzfVarZzd.zzh()) {
                    H0(sb2, i10, "case_sensitive", Boolean.valueOf(zzfVarZzd.zzg()));
                }
                if (zzfVarZzd.zza() > 0) {
                    E0(sb2, i5 + 2);
                    sb2.append("expression_list {\n");
                    for (String str : zzfVarZzd.zzf()) {
                        E0(sb2, i5 + 3);
                        sb2.append(str);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                E0(sb2, i10);
                sb2.append("}\n");
            }
        }
        if (zzcVar.zzh()) {
            G0(sb2, i5 + 1, "number_filter", zzcVar.zzc());
        }
        E0(sb2, i5);
        sb2.append("}\n");
    }

    public final void I0(StringBuilder sb2, int i5, List list) {
        if (list == null) {
            return;
        }
        int i10 = i5 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfy.zzh zzhVar = (zzfy.zzh) it.next();
            if (zzhVar != null) {
                E0(sb2, i10);
                sb2.append("param {\n");
                H0(sb2, i10, MediationMetaData.KEY_NAME, zzhVar.zzm() ? ((C0273n0) this.f421a).f984m.f(zzhVar.zzg()) : null);
                H0(sb2, i10, "string_value", zzhVar.zzn() ? zzhVar.zzh() : null);
                H0(sb2, i10, "int_value", zzhVar.zzl() ? Long.valueOf(zzhVar.zzd()) : null);
                H0(sb2, i10, "double_value", zzhVar.zzj() ? Double.valueOf(zzhVar.zza()) : null);
                if (zzhVar.zzc() > 0) {
                    I0(sb2, i10, zzhVar.zzi());
                }
                E0(sb2, i10);
                sb2.append("}\n");
            }
        }
    }

    public final boolean L0(long j8, long j10) {
        if (j8 == 0 || j10 <= 0) {
            return true;
        }
        ((C0273n0) this.f421a).f985n.getClass();
        return Math.abs(System.currentTimeMillis() - j8) > j10;
    }

    public final byte[] O0(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e7) {
            zzj().f605f.d("Failed to gzip content", e7);
            throw e7;
        }
    }

    public final byte[] Q0(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[Segment.SHARE_MINIMUM];
            while (true) {
                int i5 = gZIPInputStream.read(bArr2);
                if (i5 <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, i5);
            }
        } catch (IOException e7) {
            zzj().f605f.d("Failed to ungzip content", e7);
            throw e7;
        }
    }

    public final ArrayList R0() throws NumberFormatException {
        Context context = this.f509b.f577l.f973a;
        List list = AbstractC0304y.f1166a;
        zzgu zzguVarZza = zzgu.zza(context.getContentResolver(), zzhk.zza("com.google.android.gms.measurement"), new RunnableC0307z(0));
        Map<String, String> mapZza = zzguVarZza == null ? Collections.EMPTY_MAP : zzguVarZza.zza();
        if (mapZza != null && !mapZza.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int iIntValue = ((Integer) AbstractC0304y.f1151S.a(null)).intValue();
            for (Map.Entry<String, String> entry : mapZza.entrySet()) {
                if (entry.getKey().startsWith("measurement.id.")) {
                    try {
                        int i5 = Integer.parseInt(entry.getValue());
                        if (i5 != 0) {
                            arrayList.add(Integer.valueOf(i5));
                            if (arrayList.size() >= iIntValue) {
                                zzj().f608i.d("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                                break;
                            }
                            continue;
                        } else {
                            continue;
                        }
                    } catch (NumberFormatException e7) {
                        zzj().f608i.d("Experiment ID NumberFormatException", e7);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return null;
    }

    @Override // A7.G1
    public final boolean j0() {
        return false;
    }

    public final long l0(byte[] bArr) {
        AbstractC1732v.i(bArr);
        b0().c0();
        MessageDigest messageDigestQ1 = U1.q1();
        if (messageDigestQ1 != null) {
            return U1.l0(messageDigestQ1.digest(bArr));
        }
        zzj().f605f.c("Failed to get MD5");
        return 0L;
    }

    public final E1 n0(String str, zzfy.zzk.zza zzaVar, zzfy.zzf.zza zzaVar2, String str2) {
        int iIndexOf;
        if (zzpn.zza()) {
            C0273n0 c0273n0 = (C0273n0) this.f421a;
            if (c0273n0.f979g.o0(str, AbstractC0304y.f1131H0)) {
                c0273n0.f985n.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                D d3 = AbstractC0304y.f1187h0;
                C0245e c0245e = c0273n0.f979g;
                String[] strArrSplit = c0245e.l0(str, d3).split(",");
                HashSet hashSet = new HashSet(strArrSplit.length);
                for (String str3 : strArrSplit) {
                    Objects.requireNonNull(str3);
                    if (!hashSet.add(str3)) {
                        throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
                    }
                }
                Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
                I1 i12 = this.f509b.f576j;
                String strY0 = i12.g0().y0(str);
                Uri.Builder builder = new Uri.Builder();
                C0273n0 c0273n02 = (C0273n0) i12.f421a;
                builder.scheme(c0273n02.f979g.l0(str, AbstractC0304y.f1167a0));
                boolean zIsEmpty = TextUtils.isEmpty(strY0);
                C0245e c0245e2 = c0273n02.f979g;
                if (zIsEmpty) {
                    builder.authority(c0245e2.l0(str, AbstractC0304y.f1170b0));
                } else {
                    builder.authority(strY0 + "." + c0245e2.l0(str, AbstractC0304y.f1170b0));
                }
                builder.path(c0245e2.l0(str, AbstractC0304y.f1173c0));
                z0(builder, "gmp_app_id", zzaVar.zzx(), setUnmodifiableSet);
                z0(builder, "gmp_version", "106000", setUnmodifiableSet);
                String strZzu = zzaVar.zzu();
                D d5 = AbstractC0304y.f1137K0;
                if (c0245e.o0(str, d5) && g0().z0(str)) {
                    strZzu = "";
                }
                z0(builder, "app_instance_id", strZzu, setUnmodifiableSet);
                z0(builder, "rdid", zzaVar.zzz(), setUnmodifiableSet);
                z0(builder, "bundle_id", zzaVar.zzt(), setUnmodifiableSet);
                String strZze = zzaVar2.zze();
                String strC = I0.c(strZze, I0.f525c, I0.f523a);
                if (!TextUtils.isEmpty(strC)) {
                    strZze = strC;
                }
                z0(builder, "app_event_name", strZze, setUnmodifiableSet);
                z0(builder, "app_version", String.valueOf(zzaVar.zzb()), setUnmodifiableSet);
                String strZzy = zzaVar.zzy();
                if (c0245e.o0(str, d5) && g0().A0(str) && !TextUtils.isEmpty(strZzy) && (iIndexOf = strZzy.indexOf(".")) != -1) {
                    strZzy = strZzy.substring(0, iIndexOf);
                }
                z0(builder, "os_version", strZzy, setUnmodifiableSet);
                z0(builder, "timestamp", String.valueOf(zzaVar2.zzc()), setUnmodifiableSet);
                boolean zZzad = zzaVar.zzad();
                String str4 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
                if (zZzad) {
                    z0(builder, "lat", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION, setUnmodifiableSet);
                }
                z0(builder, "privacy_sandbox_version", String.valueOf(zzaVar.zza()), setUnmodifiableSet);
                z0(builder, "trigger_uri_source", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION, setUnmodifiableSet);
                z0(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
                z0(builder, "request_uuid", str2, setUnmodifiableSet);
                List<zzfy.zzh> listZzf = zzaVar2.zzf();
                Bundle bundle = new Bundle();
                for (zzfy.zzh zzhVar : listZzf) {
                    String strZzg = zzhVar.zzg();
                    if (zzhVar.zzj()) {
                        bundle.putString(strZzg, String.valueOf(zzhVar.zza()));
                    } else if (zzhVar.zzk()) {
                        bundle.putString(strZzg, String.valueOf(zzhVar.zzb()));
                    } else if (zzhVar.zzn()) {
                        bundle.putString(strZzg, zzhVar.zzh());
                    } else if (zzhVar.zzl()) {
                        bundle.putString(strZzg, String.valueOf(zzhVar.zzd()));
                    }
                }
                A0(builder, c0245e.l0(str, AbstractC0304y.f1184g0).split("\\|"), bundle, setUnmodifiableSet);
                List<zzfy.zzo> listZzab = zzaVar.zzab();
                Bundle bundle2 = new Bundle();
                for (zzfy.zzo zzoVar : listZzab) {
                    String strZzg2 = zzoVar.zzg();
                    if (zzoVar.zzi()) {
                        bundle2.putString(strZzg2, String.valueOf(zzoVar.zza()));
                    } else if (zzoVar.zzj()) {
                        bundle2.putString(strZzg2, String.valueOf(zzoVar.zzb()));
                    } else if (zzoVar.zzm()) {
                        bundle2.putString(strZzg2, zzoVar.zzh());
                    } else if (zzoVar.zzk()) {
                        bundle2.putString(strZzg2, String.valueOf(zzoVar.zzc()));
                    }
                }
                A0(builder, c0245e.l0(str, AbstractC0304y.f1182f0).split("\\|"), bundle2, setUnmodifiableSet);
                if (!zzaVar.zzac()) {
                    str4 = "0";
                }
                z0(builder, "dma", str4, setUnmodifiableSet);
                if (!zzaVar.zzw().isEmpty()) {
                    z0(builder, "dma_cps", zzaVar.zzw(), setUnmodifiableSet);
                }
                if (c0245e.o0(null, AbstractC0304y.f1140M0) && zzaVar.zzae()) {
                    zzfy.zza zzaVarZzg = zzaVar.zzg();
                    if (!zzaVarZzg.zzh().isEmpty()) {
                        z0(builder, "dl_gclid", zzaVarZzg.zzh(), setUnmodifiableSet);
                    }
                    if (!zzaVarZzg.zzg().isEmpty()) {
                        z0(builder, "dl_gbraid", zzaVarZzg.zzg(), setUnmodifiableSet);
                    }
                    if (!zzaVarZzg.zzf().isEmpty()) {
                        z0(builder, "dl_gs", zzaVarZzg.zzf(), setUnmodifiableSet);
                    }
                    if (zzaVarZzg.zza() > 0) {
                        z0(builder, "dl_ss_ts", String.valueOf(zzaVarZzg.zza()), setUnmodifiableSet);
                    }
                    if (!zzaVarZzg.zzk().isEmpty()) {
                        z0(builder, "mr_gclid", zzaVarZzg.zzk(), setUnmodifiableSet);
                    }
                    if (!zzaVarZzg.zzj().isEmpty()) {
                        z0(builder, "mr_gbraid", zzaVarZzg.zzj(), setUnmodifiableSet);
                    }
                    if (!zzaVarZzg.zzi().isEmpty()) {
                        z0(builder, "mr_gs", zzaVarZzg.zzi(), setUnmodifiableSet);
                    }
                    if (zzaVarZzg.zzb() > 0) {
                        z0(builder, "mr_click_ts", String.valueOf(zzaVarZzg.zzb()), setUnmodifiableSet);
                    }
                }
                return new E1(builder.build().toString(), jCurrentTimeMillis, 1);
            }
        }
        return null;
    }

    public final Parcelable q0(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (C2615b unused) {
            zzj().f605f.c("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    public final zzfy.zzf r0(C0292u c0292u) {
        zzfy.zzf.zza zzaVarZza = zzfy.zzf.zze().zza(c0292u.f1070c);
        C0298w c0298w = (C0298w) c0292u.f1074g;
        c0298w.getClass();
        Bundle bundle = c0298w.f1091a;
        for (String str : bundle.keySet()) {
            zzfy.zzh.zza zzaVarZza2 = zzfy.zzh.zze().zza(str);
            Object obj = bundle.get(str);
            AbstractC1732v.i(obj);
            C0(zzaVarZza2, obj);
            zzaVarZza.zza(zzaVarZza2);
        }
        if (((C0273n0) this.f421a).f979g.o0(null, AbstractC0304y.f1191i1)) {
            String str2 = (String) c0292u.f1073f;
            if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
                zzaVarZza.zza((zzfy.zzh) ((zzjt) zzfy.zzh.zze().zza("_o").zzb(str2).zzai()));
            }
        }
        return (zzfy.zzf) ((zzjt) zzaVarZza.zzai());
    }

    public final String u0(zzfy.zzj zzjVar) {
        zzfy.zzc zzcVarZzv;
        if (zzjVar == null) {
            return "";
        }
        StringBuilder sbJ = N0.a.j("\nbatch {\n");
        boolean zZza = zzpu.zza();
        C0273n0 c0273n0 = (C0273n0) this.f421a;
        if (zZza && c0273n0.f979g.o0(null, AbstractC0304y.f1222x0) && zzjVar.zza() > 0) {
            b0();
            if (U1.h1(zzjVar.zza(0).zzz())) {
                if (zzjVar.zzh()) {
                    H0(sbJ, 0, "upload_subdomain", zzjVar.zze());
                }
                if (zzjVar.zzg()) {
                    H0(sbJ, 0, "sgtm_join_id", zzjVar.zzd());
                }
            }
        }
        for (zzfy.zzk zzkVar : zzjVar.zzf()) {
            if (zzkVar != null) {
                E0(sbJ, 1);
                sbJ.append("bundle {\n");
                if (zzkVar.zzbp()) {
                    H0(sbJ, 1, "protocol_version", Integer.valueOf(zzkVar.zzf()));
                }
                if (zzpo.zza() && c0273n0.f979g.o0(zzkVar.zzz(), AbstractC0304y.f1220w0) && zzkVar.zzbs()) {
                    H0(sbJ, 1, "session_stitching_token", zzkVar.zzao());
                }
                H0(sbJ, 1, "platform", zzkVar.zzam());
                if (zzkVar.zzbk()) {
                    H0(sbJ, 1, "gmp_version", Long.valueOf(zzkVar.zzn()));
                }
                if (zzkVar.zzbx()) {
                    H0(sbJ, 1, "uploading_gmp_version", Long.valueOf(zzkVar.zzt()));
                }
                if (zzkVar.zzbi()) {
                    H0(sbJ, 1, "dynamite_version", Long.valueOf(zzkVar.zzl()));
                }
                if (zzkVar.zzbb()) {
                    H0(sbJ, 1, "config_version", Long.valueOf(zzkVar.zzj()));
                }
                H0(sbJ, 1, "gmp_app_id", zzkVar.zzaj());
                H0(sbJ, 1, "admob_app_id", zzkVar.zzy());
                H0(sbJ, 1, "app_id", zzkVar.zzz());
                H0(sbJ, 1, "app_version", zzkVar.zzac());
                if (zzkVar.zzay()) {
                    H0(sbJ, 1, "app_version_major", Integer.valueOf(zzkVar.zzb()));
                }
                H0(sbJ, 1, "firebase_instance_id", zzkVar.zzai());
                if (zzkVar.zzbg()) {
                    H0(sbJ, 1, "dev_cert_hash", Long.valueOf(zzkVar.zzk()));
                }
                H0(sbJ, 1, "app_store", zzkVar.zzab());
                if (zzkVar.zzbw()) {
                    H0(sbJ, 1, "upload_timestamp_millis", Long.valueOf(zzkVar.zzs()));
                }
                if (zzkVar.zzbt()) {
                    H0(sbJ, 1, "start_timestamp_millis", Long.valueOf(zzkVar.zzq()));
                }
                if (zzkVar.zzbj()) {
                    H0(sbJ, 1, "end_timestamp_millis", Long.valueOf(zzkVar.zzm()));
                }
                if (zzkVar.zzbo()) {
                    H0(sbJ, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzkVar.zzp()));
                }
                if (zzkVar.zzbn()) {
                    H0(sbJ, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzkVar.zzo()));
                }
                H0(sbJ, 1, "app_instance_id", zzkVar.zzaa());
                H0(sbJ, 1, "resettable_device_id", zzkVar.zzan());
                H0(sbJ, 1, "ds_id", zzkVar.zzah());
                if (zzkVar.zzbm()) {
                    H0(sbJ, 1, "limited_ad_tracking", Boolean.valueOf(zzkVar.zzav()));
                }
                H0(sbJ, 1, "os_version", zzkVar.zzal());
                H0(sbJ, 1, "device_model", zzkVar.zzag());
                H0(sbJ, 1, "user_default_language", zzkVar.zzap());
                if (zzkVar.zzbv()) {
                    H0(sbJ, 1, "time_zone_offset_minutes", Integer.valueOf(zzkVar.zzh()));
                }
                if (zzkVar.zzba()) {
                    H0(sbJ, 1, "bundle_sequential_index", Integer.valueOf(zzkVar.zzc()));
                }
                if (zzpu.zza()) {
                    b0();
                    if (U1.h1(zzkVar.zzz()) && c0273n0.f979g.o0(null, AbstractC0304y.f1222x0) && zzkVar.zzbf()) {
                        H0(sbJ, 1, "delivery_index", Integer.valueOf(zzkVar.zzd()));
                    }
                }
                if (zzkVar.zzbr()) {
                    H0(sbJ, 1, "service_upload", Boolean.valueOf(zzkVar.zzaw()));
                }
                H0(sbJ, 1, "health_monitor", zzkVar.zzak());
                if (zzkVar.zzbq()) {
                    H0(sbJ, 1, "retry_counter", Integer.valueOf(zzkVar.zzg()));
                }
                if (zzkVar.zzbd()) {
                    H0(sbJ, 1, "consent_signals", zzkVar.zzae());
                }
                if (zzkVar.zzbl()) {
                    H0(sbJ, 1, "is_dma_region", Boolean.valueOf(zzkVar.zzau()));
                }
                if (zzkVar.zzbe()) {
                    H0(sbJ, 1, "core_platform_services", zzkVar.zzaf());
                }
                if (zzkVar.zzbc()) {
                    H0(sbJ, 1, "consent_diagnostics", zzkVar.zzad());
                }
                if (zzkVar.zzbu()) {
                    H0(sbJ, 1, "target_os_version", Long.valueOf(zzkVar.zzr()));
                }
                if (zzpn.zza() && c0273n0.f979g.o0(zzkVar.zzz(), AbstractC0304y.f1131H0)) {
                    H0(sbJ, 1, "ad_services_version", Integer.valueOf(zzkVar.zza()));
                    if (zzkVar.zzaz() && (zzcVarZzv = zzkVar.zzv()) != null) {
                        E0(sbJ, 2);
                        sbJ.append("attribution_eligibility_status {\n");
                        H0(sbJ, 2, "eligible", Boolean.valueOf(zzcVarZzv.zzf()));
                        H0(sbJ, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzcVarZzv.zzh()));
                        H0(sbJ, 2, "pre_r", Boolean.valueOf(zzcVarZzv.zzi()));
                        H0(sbJ, 2, "r_extensions_too_old", Boolean.valueOf(zzcVarZzv.zzj()));
                        H0(sbJ, 2, "adservices_extension_too_old", Boolean.valueOf(zzcVarZzv.zze()));
                        H0(sbJ, 2, "ad_storage_not_allowed", Boolean.valueOf(zzcVarZzv.zzd()));
                        H0(sbJ, 2, "measurement_manager_disabled", Boolean.valueOf(zzcVarZzv.zzg()));
                        E0(sbJ, 2);
                        sbJ.append("}\n");
                    }
                }
                if (zzov.zza() && c0273n0.f979g.o0(null, AbstractC0304y.f1156U0) && zzkVar.zzax()) {
                    zzfy.zza zzaVarZzu = zzkVar.zzu();
                    E0(sbJ, 2);
                    sbJ.append("ad_campaign_info {\n");
                    if (zzaVarZzu.zzn()) {
                        H0(sbJ, 2, "deep_link_gclid", zzaVarZzu.zzh());
                    }
                    if (zzaVarZzu.zzm()) {
                        H0(sbJ, 2, "deep_link_gbraid", zzaVarZzu.zzg());
                    }
                    if (zzaVarZzu.zzl()) {
                        H0(sbJ, 2, "deep_link_gad_source", zzaVarZzu.zzf());
                    }
                    if (zzaVarZzu.zzo()) {
                        H0(sbJ, 2, "deep_link_session_millis", Long.valueOf(zzaVarZzu.zza()));
                    }
                    if (zzaVarZzu.zzs()) {
                        H0(sbJ, 2, "market_referrer_gclid", zzaVarZzu.zzk());
                    }
                    if (zzaVarZzu.zzr()) {
                        H0(sbJ, 2, "market_referrer_gbraid", zzaVarZzu.zzj());
                    }
                    if (zzaVarZzu.zzq()) {
                        H0(sbJ, 2, "market_referrer_gad_source", zzaVarZzu.zzi());
                    }
                    if (zzaVarZzu.zzp()) {
                        H0(sbJ, 2, "market_referrer_click_millis", Long.valueOf(zzaVarZzu.zzb()));
                    }
                    E0(sbJ, 2);
                    sbJ.append("}\n");
                }
                List<zzfy.zzo> listZzas = zzkVar.zzas();
                if (listZzas != null) {
                    for (zzfy.zzo zzoVar : listZzas) {
                        if (zzoVar != null) {
                            E0(sbJ, 2);
                            sbJ.append("user_property {\n");
                            H0(sbJ, 2, "set_timestamp_millis", zzoVar.zzl() ? Long.valueOf(zzoVar.zzd()) : null);
                            H0(sbJ, 2, MediationMetaData.KEY_NAME, c0273n0.f984m.g(zzoVar.zzg()));
                            H0(sbJ, 2, "string_value", zzoVar.zzh());
                            H0(sbJ, 2, "int_value", zzoVar.zzk() ? Long.valueOf(zzoVar.zzc()) : null);
                            H0(sbJ, 2, "double_value", zzoVar.zzi() ? Double.valueOf(zzoVar.zza()) : null);
                            E0(sbJ, 2);
                            sbJ.append("}\n");
                        }
                    }
                }
                List<zzfy.zzd> listZzaq = zzkVar.zzaq();
                zzkVar.zzz();
                if (listZzaq != null) {
                    for (zzfy.zzd zzdVar : listZzaq) {
                        if (zzdVar != null) {
                            E0(sbJ, 2);
                            sbJ.append("audience_membership {\n");
                            if (zzdVar.zzg()) {
                                H0(sbJ, 2, "audience_id", Integer.valueOf(zzdVar.zza()));
                            }
                            if (zzdVar.zzh()) {
                                H0(sbJ, 2, "new_audience", Boolean.valueOf(zzdVar.zzf()));
                            }
                            J0(sbJ, "current_data", zzdVar.zzd());
                            if (zzdVar.zzi()) {
                                J0(sbJ, "previous_data", zzdVar.zze());
                            }
                            E0(sbJ, 2);
                            sbJ.append("}\n");
                        }
                    }
                }
                List<zzfy.zzf> listZzar = zzkVar.zzar();
                if (listZzar != null) {
                    for (zzfy.zzf zzfVar : listZzar) {
                        if (zzfVar != null) {
                            E0(sbJ, 2);
                            sbJ.append("event {\n");
                            H0(sbJ, 2, MediationMetaData.KEY_NAME, c0273n0.f984m.c(zzfVar.zzg()));
                            if (zzfVar.zzk()) {
                                H0(sbJ, 2, "timestamp_millis", Long.valueOf(zzfVar.zzd()));
                            }
                            if (zzfVar.zzj()) {
                                H0(sbJ, 2, "previous_timestamp_millis", Long.valueOf(zzfVar.zzc()));
                            }
                            if (zzfVar.zzi()) {
                                H0(sbJ, 2, "count", Integer.valueOf(zzfVar.zza()));
                            }
                            if (zzfVar.zzb() != 0) {
                                I0(sbJ, 2, zzfVar.zzh());
                            }
                            E0(sbJ, 2);
                            sbJ.append("}\n");
                        }
                    }
                }
                E0(sbJ, 1);
                sbJ.append("}\n");
            }
        }
        sbJ.append("} // End-of-batch\n");
        return sbJ.toString();
    }

    public final List y0(List list, List list2) {
        int i5;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                zzj().f608i.d("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    zzj().f608i.b(num, "Ignoring bit index greater than bitSet size", Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i10 = size2;
            i5 = size;
            size = i10;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i5);
    }
}
