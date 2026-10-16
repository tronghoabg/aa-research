package Ca;

import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvd;
import java.util.List;

/* loaded from: classes4.dex */
public final class b extends d {

    /* renamed from: e, reason: collision with root package name */
    public final List f1965e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1966f;

    /* renamed from: g, reason: collision with root package name */
    public final float f1967g;

    public b(zzvd zzvdVar, float f10, float f11) {
        super(zzvdVar.zze(), zzvdVar.zzc(), zzvdVar.zzf(), zzvdVar.zzd());
        this.f1965e = zzbu.zza(zzvdVar.zzg(), new x4.d(15));
        this.f1966f = f10;
        this.f1967g = f11;
    }

    public final synchronized List q() {
        return this.f1965e;
    }

    public b(String str, Rect rect, List list, String str2, List list2, float f10, float f11) {
        super(str, rect, list, str2);
        this.f1965e = list2;
        this.f1966f = f10;
        this.f1967g = f11;
    }
}
