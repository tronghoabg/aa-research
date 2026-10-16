package Ca;

import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvf;
import java.util.ArrayList;
import m9.S;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1975a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1976b;

    public f(zzvf zzvfVar) {
        ArrayList arrayList = new ArrayList();
        this.f1975a = arrayList;
        this.f1976b = zzvfVar.zza();
        arrayList.addAll(zzbu.zza(zzvfVar.zzb(), new S(15)));
    }

    public f(String str, zzbk zzbkVar) {
        ArrayList arrayList = new ArrayList();
        this.f1975a = arrayList;
        arrayList.addAll(zzbkVar);
        this.f1976b = str;
    }
}
