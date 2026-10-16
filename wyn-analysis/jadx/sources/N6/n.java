package N6;

import com.google.android.gms.internal.ads.zzimz;
import com.google.android.gms.internal.ads.zzinh;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class n implements zzimz {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8527a;

    /* renamed from: b, reason: collision with root package name */
    public final l f8528b;

    public /* synthetic */ n(l lVar, int i5) {
        this.f8527a = i5;
        this.f8528b = lVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final Object zzb() {
        switch (this.f8527a) {
            case 0:
                String lowerCase = this.f8528b.f8525a.toLowerCase(Locale.ROOT);
                zzinh.zzb(lowerCase);
                return lowerCase;
            default:
                l lVar = this.f8528b;
                lVar.getClass();
                HashSet hashSet = new HashSet();
                hashSet.add(lVar.f8525a.toLowerCase(Locale.ROOT));
                return hashSet;
        }
    }
}
