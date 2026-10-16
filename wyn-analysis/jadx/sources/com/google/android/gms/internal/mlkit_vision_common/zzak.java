package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.internal.consent_sdk.a;
import com.unity3d.services.UnityAdsConstants;
import h9.b;
import h9.d;
import h9.e;
import h9.f;
import h9.g;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;

/* loaded from: classes4.dex */
final class zzak implements f {
    private static final Charset zza = Charset.forName("UTF-8");
    private static final d zzb;
    private static final d zzc;
    private static final e zzd;
    private OutputStream zze;
    private final Map zzf;
    private final Map zzg;
    private final e zzh;
    private final zzao zzi = new zzao(this);

    static {
        zzai zzaiVarQ = a.q(1);
        HashMap map = new HashMap();
        map.put(zzaiVarQ.annotationType(), zzaiVarQ);
        zzb = new d(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, pd.f.n(map));
        zzai zzaiVarQ2 = a.q(2);
        HashMap map2 = new HashMap();
        map2.put(zzaiVarQ2.annotationType(), zzaiVarQ2);
        zzc = new d(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, pd.f.n(map2));
        zzd = new e() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzaj
            @Override // h9.InterfaceC2794a
            public final void encode(Object obj, Object obj2) throws IOException {
                zzak.zzg((Map.Entry) obj, (f) obj2);
            }
        };
    }

    public zzak(OutputStream outputStream, Map map, Map map2, e eVar) {
        this.zze = outputStream;
        this.zzf = map;
        this.zzg = map2;
        this.zzh = eVar;
    }

    public static /* synthetic */ void zzg(Map.Entry entry, f fVar) throws IOException {
        fVar.add(zzb, entry.getKey());
        fVar.add(zzc, entry.getValue());
    }

    private static int zzh(d dVar) {
        zzai zzaiVar = (zzai) dVar.b(zzai.class);
        if (zzaiVar != null) {
            return zzaiVar.zza();
        }
        throw new b("Field has no @Protobuf config");
    }

    private final long zzi(e eVar, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        zzaf zzafVar = new zzaf();
        try {
            OutputStream outputStream = this.zze;
            this.zze = zzafVar;
            try {
                eVar.encode(obj, this);
                this.zze = outputStream;
                long jZza = zzafVar.zza();
                zzafVar.close();
                return jZza;
            } catch (Throwable th) {
                this.zze = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                zzafVar.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    private static zzai zzj(d dVar) {
        zzai zzaiVar = (zzai) dVar.b(zzai.class);
        if (zzaiVar != null) {
            return zzaiVar;
        }
        throw new b("Field has no @Protobuf config");
    }

    private final zzak zzk(e eVar, d dVar, Object obj, boolean z2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        long jZzi = zzi(eVar, obj);
        if (z2 && jZzi == 0) {
            return this;
        }
        zzn((zzh(dVar) << 3) | 2);
        zzo(jZzi);
        eVar.encode(obj, this);
        return this;
    }

    private final zzak zzl(g gVar, d dVar, Object obj, boolean z2) throws IOException {
        this.zzi.zza(dVar, z2);
        gVar.encode(obj, this.zzi);
        return this;
    }

    private static ByteBuffer zzm(int i5) {
        return ByteBuffer.allocate(i5).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void zzn(int i5) throws IOException {
        while ((i5 & (-128)) != 0) {
            this.zze.write((i5 & 127) | 128);
            i5 >>>= 7;
        }
        this.zze.write(i5 & 127);
    }

    private final void zzo(long j8) throws IOException {
        while (((-128) & j8) != 0) {
            this.zze.write((((int) j8) & 127) | 128);
            j8 >>>= 7;
        }
        this.zze.write(((int) j8) & 127);
    }

    @Override // h9.f
    public final f add(d dVar, double d3) throws IOException {
        zza(dVar, d3, true);
        return this;
    }

    public final f inline(Object obj) throws IOException {
        zzf(obj);
        return this;
    }

    public final f nested(d dVar) throws IOException {
        throw new b("nested() is not implemented for protobuf encoding.");
    }

    public final f zza(d dVar, double d3, boolean z2) throws IOException {
        if (z2 && d3 == 0.0d) {
            return this;
        }
        zzn((zzh(dVar) << 3) | 1);
        this.zze.write(zzm(8).putDouble(d3).array());
        return this;
    }

    public final f zzb(d dVar, float f10, boolean z2) throws IOException {
        if (z2 && f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return this;
        }
        zzn((zzh(dVar) << 3) | 5);
        this.zze.write(zzm(4).putFloat(f10).array());
        return this;
    }

    public final f zzc(d dVar, Object obj, boolean z2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z2 || charSequence.length() != 0) {
                    zzn((zzh(dVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(zza);
                    zzn(bytes.length);
                    this.zze.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    zzc(dVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    zzk(zzd, dVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    zza(dVar, ((Double) obj).doubleValue(), z2);
                    return this;
                }
                if (obj instanceof Float) {
                    zzb(dVar, ((Float) obj).floatValue(), z2);
                    return this;
                }
                if (obj instanceof Number) {
                    zze(dVar, ((Number) obj).longValue(), z2);
                    return this;
                }
                if (obj instanceof Boolean) {
                    zzd(dVar, ((Boolean) obj).booleanValue() ? 1 : 0, z2);
                    return this;
                }
                if (!(obj instanceof byte[])) {
                    e eVar = (e) this.zzf.get(obj.getClass());
                    if (eVar != null) {
                        zzk(eVar, dVar, obj, z2);
                        return this;
                    }
                    g gVar = (g) this.zzg.get(obj.getClass());
                    if (gVar != null) {
                        zzl(gVar, dVar, obj, z2);
                        return this;
                    }
                    if (obj instanceof zzag) {
                        zzd(dVar, ((zzag) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        zzd(dVar, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    zzk(this.zzh, dVar, obj, z2);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z2 || bArr.length != 0) {
                    zzn((zzh(dVar) << 3) | 2);
                    zzn(bArr.length);
                    this.zze.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    public final zzak zzd(d dVar, int i5, boolean z2) throws IOException {
        if (!z2 || i5 != 0) {
            zzai zzaiVarZzj = zzj(dVar);
            zzah zzahVar = zzah.DEFAULT;
            int iOrdinal = zzaiVarZzj.zzb().ordinal();
            if (iOrdinal == 0) {
                zzn(zzaiVarZzj.zza() << 3);
                zzn(i5);
                return this;
            }
            if (iOrdinal == 1) {
                zzn(zzaiVarZzj.zza() << 3);
                zzn((i5 + i5) ^ (i5 >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                zzn((zzaiVarZzj.zza() << 3) | 5);
                this.zze.write(zzm(4).putInt(i5).array());
                return this;
            }
        }
        return this;
    }

    public final zzak zze(d dVar, long j8, boolean z2) throws IOException {
        if (!z2 || j8 != 0) {
            zzai zzaiVarZzj = zzj(dVar);
            zzah zzahVar = zzah.DEFAULT;
            int iOrdinal = zzaiVarZzj.zzb().ordinal();
            if (iOrdinal == 0) {
                zzn(zzaiVarZzj.zza() << 3);
                zzo(j8);
                return this;
            }
            if (iOrdinal == 1) {
                zzn(zzaiVarZzj.zza() << 3);
                zzo((j8 >> 63) ^ (j8 + j8));
                return this;
            }
            if (iOrdinal == 2) {
                zzn((zzaiVarZzj.zza() << 3) | 1);
                this.zze.write(zzm(8).putLong(j8).array());
                return this;
            }
        }
        return this;
    }

    public final zzak zzf(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        e eVar = (e) this.zzf.get(obj.getClass());
        if (eVar == null) {
            throw new b("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        eVar.encode(obj, this);
        return this;
    }

    public final f add(d dVar, float f10) throws IOException {
        zzb(dVar, f10, true);
        return this;
    }

    @Override // h9.f
    public final /* synthetic */ f add(d dVar, int i5) throws IOException {
        zzd(dVar, i5, true);
        return this;
    }

    @Override // h9.f
    public final /* synthetic */ f add(d dVar, long j8) throws IOException {
        zze(dVar, j8, true);
        return this;
    }

    public final f nested(String str) throws IOException {
        return nested(d.c(str));
    }

    @Override // h9.f
    public final f add(d dVar, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        zzc(dVar, obj, true);
        return this;
    }

    @Override // h9.f
    public final /* synthetic */ f add(d dVar, boolean z2) throws IOException {
        zzd(dVar, z2 ? 1 : 0, true);
        return this;
    }

    public final f add(String str, double d3) throws IOException {
        zza(d.c(str), d3, true);
        return this;
    }

    public final f add(String str, int i5) throws IOException {
        zzd(d.c(str), i5, true);
        return this;
    }

    public final f add(String str, long j8) throws IOException {
        zze(d.c(str), j8, true);
        return this;
    }

    public final f add(String str, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        zzc(d.c(str), obj, true);
        return this;
    }

    public final f add(String str, boolean z2) throws IOException {
        zzd(d.c(str), z2 ? 1 : 0, true);
        return this;
    }
}
