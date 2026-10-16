package Va;

import c8.C1581e;
import com.google.android.gms.internal.measurement.zzng;
import com.google.android.gms.internal.measurement.zznr;
import com.google.android.gms.internal.measurement.zzny;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpt;
import com.google.android.gms.internal.measurement.zzqf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboi;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzv;
import com.google.android.gms.internal.mlkit_vision_text_common.zzy;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import u6.AbstractC4256a;

/* renamed from: Va.ka, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1038ka implements InterfaceC1064ma, A7.C, C5.a, zzu, zbkf, I4.q, K6.c, N2.g, Le.b, V5.j, InterfaceC1142sb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14344a;

    public /* synthetic */ C1038ka(int i5) {
        this.f14344a = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean g(A1.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1038ka.g(A1.b, android.text.Editable, int, int, boolean):boolean");
    }

    @Override // N2.g
    /* renamed from: a */
    public s2.w mo1a() {
        return new s2.q(-9223372036854775807L);
    }

    @Override // Le.b, Q1.c
    public void accept(Object obj) {
        S3.f.A(new Ke.d((Throwable) obj));
    }

    @Override // C5.a
    public long c() {
        return System.currentTimeMillis();
    }

    @Override // I4.q
    public I4.p d(I4.v vVar) {
        return new I4.y(vVar.b(I4.f.class, InputStream.class), 1);
    }

    @Override // Va.InterfaceC1064ma
    public boolean e(C1077na c1077na) {
        return c1077na.s0() instanceof String;
    }

    @Override // N2.g
    public long f(s2.j jVar) {
        return -1L;
    }

    @Override // V5.j
    public V5.k j(V5.i iVar) {
        int i5 = u6.v.f46721a;
        if (i5 < 23 || i5 < 31) {
            return new C1581e(27).j(iVar);
        }
        int iF = u6.k.f(iVar.f13057c.f3238l);
        AbstractC4256a.u("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + u6.v.t(iF));
        return new S3.s(iF).j(iVar);
    }

    @Override // Va.InterfaceC1142sb
    public /* synthetic */ Object u(JSONArray jSONArray, int i5) {
        return AbstractC1152t8.a(jSONArray.optString(i5));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkf
    public Object zba(Object obj) {
        return ((zboi) obj).zbc();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
    public Object zza(Object obj) {
        zzl zzlVar = (zzl) obj;
        zzv zzvVar = Ea.d.f3636a;
        List listX = Ba.c.X(zzlVar.zzb);
        return new Ca.b(zzy.zzb(zzlVar.zze) ? "" : zzlVar.zze, Ba.c.W(listX), listX, zzy.zzb(zzlVar.zzg) ? "und" : zzlVar.zzg, zzbu.zza(Arrays.asList(zzlVar.zza), new C1581e(17)), zzlVar.zzf, zzlVar.zzb.zze);
    }

    public C1038ka() {
        this.f14344a = 16;
        new D0.b();
    }

    @Override // A7.C
    public Object zza() {
        switch (this.f14344a) {
            case 2:
                return Boolean.valueOf(zzpn.zzf());
            case 3:
                return Boolean.valueOf(zzpt.zzb());
            case 4:
                return Boolean.valueOf(zznr.zzc());
            case 5:
                return Boolean.valueOf(zzqf.zza());
            case 6:
                return Long.valueOf(zzng.zzb());
            case 7:
                return Long.valueOf(zzng.zzv());
            case 8:
                return Boolean.valueOf(zzph.zzf());
            case 9:
                return Double.valueOf(zzph.zza());
            case 10:
                return zzng.zzas();
            case 11:
                return Boolean.valueOf(zzpn.zzd());
            case 12:
                return Boolean.valueOf(zzpn.zzc());
            case 13:
                return Boolean.valueOf(zzny.zzb());
            default:
                return Integer.valueOf((int) zzng.zzan());
        }
    }

    @Override // N2.g, S5.d
    public void b(long j8) {
    }
}
