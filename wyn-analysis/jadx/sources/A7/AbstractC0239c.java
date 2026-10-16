package A7;

import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.measurement.zzfo;
import j$.util.DesugarCollections;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: A7.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0239c {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f822a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f823b;

    /* renamed from: c, reason: collision with root package name */
    public Long f824c;

    /* renamed from: d, reason: collision with root package name */
    public Long f825d;

    public static Boolean b(long j8, zzfo.zzd zzdVar) {
        try {
            return e(new BigDecimal(j8), zzdVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean c(Boolean bool, boolean z2) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean d(String str, zzfo.zzf zzfVar, N n10) {
        List<String> listZzf;
        AbstractC1732v.i(zzfVar);
        if (str != null && zzfVar.zzj() && zzfVar.zzb() != zzfo.zzf.zzb.UNKNOWN_MATCH_TYPE) {
            zzfo.zzf.zzb zzbVarZzb = zzfVar.zzb();
            zzfo.zzf.zzb zzbVar = zzfo.zzf.zzb.IN_LIST;
            if (zzbVarZzb != zzbVar ? zzfVar.zzi() : zzfVar.zza() != 0) {
                zzfo.zzf.zzb zzbVarZzb2 = zzfVar.zzb();
                boolean zZzg = zzfVar.zzg();
                String strZze = (zZzg || zzbVarZzb2 == zzfo.zzf.zzb.REGEXP || zzbVarZzb2 == zzbVar) ? zzfVar.zze() : zzfVar.zze().toUpperCase(Locale.ENGLISH);
                if (zzfVar.zza() == 0) {
                    listZzf = null;
                } else {
                    listZzf = zzfVar.zzf();
                    if (!zZzg) {
                        ArrayList arrayList = new ArrayList(listZzf.size());
                        Iterator<String> it = listZzf.iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
                        }
                        listZzf = DesugarCollections.unmodifiableList(arrayList);
                    }
                }
                zzfo.zzf.zzb zzbVar2 = zzfo.zzf.zzb.REGEXP;
                String str2 = zzbVarZzb2 == zzbVar2 ? strZze : null;
                if (zzbVarZzb2 != zzfo.zzf.zzb.IN_LIST ? strZze != null : listZzf != null && !listZzf.isEmpty()) {
                    if (!zZzg && zzbVarZzb2 != zzbVar2) {
                        str = str.toUpperCase(Locale.ENGLISH);
                    }
                    switch (Y1.f760a[zzbVarZzb2.ordinal()]) {
                        case 1:
                            if (str2 != null) {
                                try {
                                    return Boolean.valueOf(Pattern.compile(str2, zZzg ? 0 : 66).matcher(str).matches());
                                } catch (PatternSyntaxException unused) {
                                    n10.f608i.d("Invalid regular expression in REGEXP audience filter. expression", str2);
                                    break;
                                }
                            }
                            break;
                        case 2:
                            return Boolean.valueOf(str.startsWith(strZze));
                        case 3:
                            return Boolean.valueOf(str.endsWith(strZze));
                        case 4:
                            return Boolean.valueOf(str.contains(strZze));
                        case 5:
                            return Boolean.valueOf(str.equals(strZze));
                        case 6:
                            if (listZzf != null) {
                                return Boolean.valueOf(listZzf.contains(str));
                            }
                            break;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean e(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.zzfo.zzd r9, double r10) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.AbstractC0239c.e(java.math.BigDecimal, com.google.android.gms.internal.measurement.zzfo$zzd, double):java.lang.Boolean");
    }

    public abstract int a();

    public abstract boolean f();

    public abstract boolean g();
}
