package com.google.android.gms.internal.ads;

import ef.C2515C;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u1.InterfaceC4224m;

/* loaded from: classes3.dex */
public final class zzgbl implements InterfaceC4224m {

    @NotNull
    public static final zzgbl zza = new zzgbl();

    @NotNull
    private static final zzgbi zzb;

    static {
        zzgbi zzgbiVarZzd = zzgbi.zzd();
        AbstractC3340k.d(zzgbiVarZzd, "getDefaultInstance(...)");
        zzb = zzgbiVarZzd;
    }

    private zzgbl() {
    }

    @Override // u1.InterfaceC4224m
    public final /* synthetic */ Object getDefaultValue() {
        return zzb;
    }

    @Override // u1.InterfaceC4224m
    @Nullable
    public final Object readFrom(@NotNull InputStream inputStream, @NotNull InterfaceC3103c interfaceC3103c) {
        try {
            zzgbi zzgbiVarZzc = zzgbi.zzc(inputStream);
            AbstractC3340k.b(zzgbiVarZzc);
            return zzgbiVarZzc;
        } catch (Exception unused) {
            return zzb;
        }
    }

    @Override // u1.InterfaceC4224m
    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, InterfaceC3103c interfaceC3103c) throws IOException {
        ((zzgbi) obj).zzaO(outputStream);
        return C2515C.f34653a;
    }
}
