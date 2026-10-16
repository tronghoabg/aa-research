package com.google.android.recaptcha.internal;

import com.unity3d.services.core.fid.Constants;

/* loaded from: classes4.dex */
final class zzlp implements zzml {
    private static final zzlv zza = new zzln();
    private final zzlv zzb;

    public zzlp() {
        zzlv zzlvVar;
        zzkl zzklVarZza = zzkl.zza();
        try {
            zzlvVar = (zzlv) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzlvVar = zza;
        }
        zzlo zzloVar = new zzlo(zzklVarZza, zzlvVar);
        byte[] bArr = zzla.zzb;
        this.zzb = zzloVar;
    }

    private static boolean zzb(zzlu zzluVar) {
        return zzluVar.zzc() + (-1) != 1;
    }

    @Override // com.google.android.recaptcha.internal.zzml
    public final zzmk zza(Class cls) {
        zzmm.zzs(cls);
        zzlu zzluVarZzb = this.zzb.zzb(cls);
        if (zzluVarZzb.zzb()) {
            return zzks.class.isAssignableFrom(cls) ? zzmb.zzc(zzmm.zzn(), zzkg.zzb(), zzluVarZzb.zza()) : zzmb.zzc(zzmm.zzm(), zzkg.zza(), zzluVarZzb.zza());
        }
        if (zzks.class.isAssignableFrom(cls)) {
            return zzma.zzm(cls, zzluVarZzb, zzme.zzb(), zzll.zzb(), zzmm.zzn(), zzb(zzluVarZzb) ? zzkg.zzb() : null, zzlt.zzb());
        }
        zzke zzkeVarZza = null;
        zzmd zzmdVarZza = zzme.zza();
        zzlk zzlkVarZza = zzll.zza();
        zznb zznbVarZzm = zzmm.zzm();
        if (zzb(zzluVarZzb)) {
            zzkeVarZza = zzkg.zza();
        }
        return zzma.zzm(cls, zzluVarZzb, zzmdVarZza, zzlkVarZza, zznbVarZzm, zzkeVarZza, zzlt.zza());
    }
}
