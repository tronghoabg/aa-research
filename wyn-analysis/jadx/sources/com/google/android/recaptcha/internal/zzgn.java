package com.google.android.recaptcha.internal;

import android.content.Context;
import com.unity3d.services.core.device.MimeTypes;
import ef.C2527k;
import ff.AbstractC2640A;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class zzgn implements zzgm {

    @NotNull
    private final Context zza;

    @NotNull
    private final Map zzb = AbstractC2640A.R(new C2527k(2, "activity"), new C2527k(3, "phone"), new C2527k(4, "input_method"), new C2527k(5, MimeTypes.BASE_TYPE_AUDIO));

    public zzgn(@NotNull Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzgm
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzgl.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzgm
    @Nullable
    public final Object zza(@NotNull Object... objArr) throws zzby {
        Object obj = objArr[0];
        if (true != (obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num == null) {
            throw new zzby(4, 5, null);
        }
        Object obj2 = this.zzb.get(Integer.valueOf(num.intValue()));
        if (obj2 != null) {
            return this.zza.getSystemService((String) obj2);
        }
        throw new zzby(4, 4, null);
    }
}
