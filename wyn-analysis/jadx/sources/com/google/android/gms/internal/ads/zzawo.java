package com.google.android.gms.internal.ads;

import cb.AbstractC1593a;
import j$.util.Optional;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class zzawo {
    public final zzavj zza;
    public final zzawk zzb;
    public final zzawh zzc;
    public final zzawc zzd;

    public zzawo(zzavj zzavjVar, zzawk zzawkVar, zzawc zzawcVar) {
        int[] iArr = {343945053, 300943123, 276960570, 1098387973, 1376531620, 1545514151, 271059426, 857490000, 454333378};
        int i5 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        this.zza = zzavjVar;
        this.zzb = zzawkVar;
        this.zzd = zzawcVar;
        this.zzc = new zzawh(AbstractC1593a.b((i10 & (~i5)) | i11, (i5 & i12) | i13, i14, i15) ^ (i16 % 454333378));
    }

    public final Optional zza() {
        zzavd zzavdVar;
        try {
            ArrayDeque arrayDeque = this.zzc.zza;
            if (arrayDeque.isEmpty()) {
                throw new zzawg();
            }
            zzawe zzaweVar = (zzawe) arrayDeque.pop();
            long j8 = zzaweVar.zza;
            long j10 = zzaweVar.zzb;
            long j11 = zzaweVar.zzc;
            zzawk zzawkVar = this.zzb;
            if (zzawkVar.zzb < j10) {
                return Optional.of(zzavd.zzG);
            }
            this.zzd.zza(j8);
            if (j11 == 0) {
                while (zzawkVar.zzb > j10) {
                    zzawkVar.zzc();
                }
            }
            return Optional.empty();
        } catch (zzawa e7) {
            e = e7;
            throw new AssertionError(zzavv.zza("CEiv6BFfPnitUE+D"), e);
        } catch (zzawb e10) {
            e = e10;
            throw new AssertionError(zzavv.zza("CEiv6BFfPnitUE+D"), e);
        } catch (zzawg unused) {
            zzavdVar = zzavd.zzw;
            return Optional.of(zzavdVar);
        } catch (zzawi unused2) {
            zzavdVar = zzavd.zzG;
            return Optional.of(zzavdVar);
        }
    }
}
