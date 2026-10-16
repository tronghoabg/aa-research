package G6;

import com.google.android.gms.internal.ads.zzauo;
import j$.util.Objects;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: G6.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0557v extends zzauo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte[] f4642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f4643b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H6.i f4644c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0557v(C0560y c0560y, int i5, String str, C0558w c0558w, S3.s sVar, byte[] bArr, HashMap map, H6.i iVar) {
        super(i5, str, c0558w, sVar);
        this.f4642a = bArr;
        this.f4643b = map;
        this.f4644c = iVar;
        Objects.requireNonNull(c0560y);
    }

    @Override // com.google.android.gms.internal.ads.zzatl
    public final Map zzm() {
        HashMap map = this.f4643b;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    @Override // com.google.android.gms.internal.ads.zzatl
    public final byte[] zzn() {
        byte[] bArr = this.f4642a;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzauo, com.google.android.gms.internal.ads.zzatl
    /* renamed from: zzz */
    public final void zzs(String str) throws IOException {
        H6.i iVar = this.f4644c;
        if (H6.i.c() && str != null) {
            iVar.e("onNetworkResponseBody", new S3.l(str.getBytes()));
        }
        super.zzs(str);
    }
}
