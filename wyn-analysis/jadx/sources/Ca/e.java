package Ca;

import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuz;
import java.util.List;
import x9.C4504d;

/* loaded from: classes4.dex */
public final class e extends d {

    /* renamed from: e, reason: collision with root package name */
    public final List f1974e;

    public e(zzuz zzuzVar) {
        super(zzuzVar.zzc(), zzuzVar.zza(), zzuzVar.zzd(), zzuzVar.zzb());
        this.f1974e = zzbu.zza(zzuzVar.zze(), new C4504d(15));
    }

    public e(String str, Rect rect, List list, String str2, List list2) {
        super(str, rect, list, str2);
        this.f1974e = list2;
    }
}
