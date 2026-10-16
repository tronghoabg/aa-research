package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.os.SystemClock;
import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* loaded from: classes3.dex */
public final class zzboq implements zzbpx {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z]([a-zA-Z0-9]|:|-|_)*$");
    private static final Pattern zzb = Pattern.compile("^[0-9]*(,[0-9]*)*$");

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) throws NumberFormatException {
        zzclb zzclbVar = (zzclb) obj;
        String str = (String) map.get(HandleInvocationsFromAdViewer.KEY_ACTION);
        if (!"tick".equals(str)) {
            if ("experiment".equals(str)) {
                String str2 = (String) map.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
                if (TextUtils.isEmpty(str2)) {
                    int i5 = G6.L.f4523b;
                    H6.l.f("No value given for CSI experiment.");
                    return;
                }
                if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcQ)).booleanValue() || zzb.matcher(str2).matches()) {
                    zzclbVar.zzq().zzc().zzd("e", str2);
                    return;
                } else {
                    int i10 = G6.L.f4523b;
                    H6.l.a("Invalid value given for CSI experiment. Should be a comma separated list of numbers.");
                    return;
                }
            }
            if ("extra".equals(str)) {
                String str3 = (String) map.get(MediationMetaData.KEY_NAME);
                String str4 = (String) map.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
                if (TextUtils.isEmpty(str4)) {
                    int i11 = G6.L.f4523b;
                    H6.l.f("No value given for CSI extra.");
                    return;
                }
                if (TextUtils.isEmpty(str3)) {
                    int i12 = G6.L.f4523b;
                    H6.l.f("No name given for CSI extra.");
                    return;
                }
                if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcQ)).booleanValue() || zza.matcher(str3).matches()) {
                    zzclbVar.zzq().zzc().zzd(str3, str4);
                    return;
                } else {
                    int i13 = G6.L.f4523b;
                    H6.l.a("Invalid name given for CSI extra. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                    return;
                }
            }
            return;
        }
        String str5 = (String) map.get("label");
        String str6 = (String) map.get("start_label");
        String str7 = (String) map.get("timestamp");
        if (TextUtils.isEmpty(str5)) {
            int i14 = G6.L.f4523b;
            H6.l.f("No label given for CSI tick.");
            return;
        }
        zzbio zzbioVar = zzbix.zzcQ;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() && !zza.matcher(str5).matches()) {
            int i15 = G6.L.f4523b;
            H6.l.a("Invalid label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
            return;
        }
        if (TextUtils.isEmpty(str7)) {
            int i16 = G6.L.f4523b;
            H6.l.f("No timestamp given for CSI tick.");
            return;
        }
        try {
            long j8 = Long.parseLong(str7);
            C6.n nVar = C6.n.f1857D;
            nVar.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            nVar.k.getClass();
            long jElapsedRealtime = (j8 - jCurrentTimeMillis) + SystemClock.elapsedRealtime();
            if (true == TextUtils.isEmpty(str6)) {
                str6 = "native:view_load";
            }
            if (!((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() || zza.matcher(str6).matches()) {
                zzclbVar.zzq().zzb(str5, str6, jElapsedRealtime);
            } else {
                int i17 = G6.L.f4523b;
                H6.l.a("Invalid start label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
            }
        } catch (NumberFormatException e7) {
            int i18 = G6.L.f4523b;
            H6.l.g("Malformed timestamp for CSI tick.", e7);
        }
    }
}
