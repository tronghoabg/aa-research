package Ca;

import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvb;
import java.util.ArrayList;
import java.util.List;
import wa.C4398a;

/* loaded from: classes4.dex */
public final class a extends d {

    /* renamed from: e, reason: collision with root package name */
    public final List f1962e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1963f;

    /* renamed from: g, reason: collision with root package name */
    public final float f1964g;

    public a(zzvb zzvbVar) {
        super(zzvbVar.zze(), zzvbVar.zzc(), zzvbVar.zzf(), zzvbVar.zzd());
        this.f1963f = zzvbVar.zzb();
        this.f1964g = zzvbVar.zza();
        List listZzg = zzvbVar.zzg();
        this.f1962e = zzbu.zza(listZzg == null ? new ArrayList() : listZzg, new C4398a(15));
    }

    public final synchronized List q() {
        return this.f1962e;
    }

    public a(String str, Rect rect, List list, String str2, float f10, float f11, zzbk zzbkVar) {
        super(str, rect, list, str2);
        this.f1963f = f10;
        this.f1964g = f11;
        this.f1962e = zzbkVar;
    }
}
