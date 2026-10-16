package wa;

import A7.C;
import B4.d;
import Ea.g;
import Ea.h;
import L4.A;
import L4.z;
import L8.e;
import N1.C0765n;
import P2.j;
import P2.l;
import R2.i;
import R8.v;
import T2.b;
import Va.C1077na;
import Va.InterfaceC1064ma;
import Va.InterfaceC1142sb;
import Va.Y7;
import Z4.c;
import android.media.MediaMetadataRetriever;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.measurement.zzng;
import com.google.android.gms.internal.measurement.zzns;
import com.google.android.gms.internal.measurement.zzok;
import com.google.android.gms.internal.measurement.zzoq;
import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzqa;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvj;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import j$.util.Objects;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import org.json.JSONArray;

/* renamed from: wa.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4398a implements C, zzu, e, G4.a, A, j, InterfaceC1142sb, InterfaceC1064ma, c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47456a;

    public /* synthetic */ C4398a(int i5) {
        this.f47456a = i5;
    }

    @Override // Z4.c
    public void a(Object obj) {
        ((List) obj).clear();
    }

    @Override // P2.j
    public boolean d(C0765n c0765n) {
        String str = c0765n.f8232n;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // Va.InterfaceC1064ma
    public boolean e(C1077na c1077na) {
        return WebViewClient.class.equals(c1077na.t0().getType());
    }

    @Override // P2.j
    public int g(C0765n c0765n) {
        String str = c0765n.f8232n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(v.f("Unsupported MIME type: ", str));
    }

    @Override // G4.a
    public File h(d dVar) {
        return null;
    }

    @Override // P2.j
    public l i(C0765n c0765n) {
        List list;
        String str = c0765n.f8232n;
        if (str != null) {
            list = c0765n.f8235q;
            switch (str) {
                case "application/dvbsubs":
                    return new i(list);
                case "application/pgs":
                    return new Y7(3);
                case "application/x-mp4-vtt":
                    return new X2.a(0);
                case "text/vtt":
                    return new X2.j(0);
                case "application/x-quicktime-tx3g":
                    return new W2.a(list);
                case "text/x-ssa":
                    return new b(list);
                case "application/x-subrip":
                    return new U2.a();
                case "application/ttml+xml":
                    return new V2.e();
            }
        }
        throw new IllegalArgumentException(v.f("Unsupported MIME type: ", str));
    }

    @Override // L4.A
    public void j(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        mediaMetadataRetriever.setDataSource(new z((ByteBuffer) obj));
    }

    @Override // L8.e
    public Object o(C6.l lVar) {
        return new g((h) lVar.a(h.class), (ya.d) lVar.a(ya.d.class));
    }

    @Override // Va.InterfaceC1142sb
    public /* synthetic */ Object u(JSONArray jSONArray, int i5) {
        return ISAdQualityAdType.fromInt(jSONArray.optInt(i5));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
    public Object zza(Object obj) {
        return new Ca.c((zzvj) obj);
    }

    @Override // A7.C
    public Object zza() {
        switch (this.f47456a) {
            case 1:
                return Long.valueOf(zzng.zza());
            case 2:
                return Boolean.valueOf(zzpn.zzl());
            case 3:
                return Boolean.valueOf(zzov.zzb());
            case 4:
                return Boolean.valueOf(zzoq.zza());
            case 5:
                return Integer.valueOf((int) zzng.zzam());
            case 6:
                return Long.valueOf(zzng.zzs());
            case 7:
                return Integer.valueOf((int) zzng.zzao());
            case 8:
                return Long.valueOf(zzph.zzb());
            case 9:
                return Integer.valueOf((int) zzng.zzc());
            case 10:
                return zzng.zzav();
            case 11:
                return Integer.valueOf((int) zzng.zzo());
            case 12:
                return Boolean.valueOf(zzqa.zza());
            case 13:
                return Boolean.valueOf(zzns.zzb());
            default:
                return Boolean.valueOf(zzok.zzb());
        }
    }

    @Override // G4.a
    public void f(d dVar, G9.e eVar) {
    }
}
