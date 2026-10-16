package com.google.android.recaptcha.internal;

import ff.m;
import ff.v;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class zzeh extends zzee {

    @NotNull
    private final zzeg zza;

    @NotNull
    private final String zzb;

    public zzeh(@NotNull zzeg zzegVar, @NotNull String str, @Nullable Object obj) {
        super(obj);
        this.zza = zzegVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzee
    public final boolean zza(@NotNull Object obj, @NotNull Method method, @Nullable Object[] objArr) {
        if (!AbstractC3340k.a(method.getName(), this.zzb)) {
            return false;
        }
        this.zza.zzb(objArr != null ? m.c0(objArr) : v.f35432a);
        return true;
    }
}
