package A7;

import G5.C0527h;
import N1.C0754c;
import N1.C0765n;
import Va.C0974fb;
import Va.C1105q;
import Va.InterfaceC1026jb;
import a4.C1329b;
import a4.C1331d;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.work.OverwritingInputMerger;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.mlkit_vision_text_common.zzh;
import com.google.android.gms.internal.mlkit_vision_text_common.zzj;
import com.google.android.gms.internal.mlkit_vision_text_common.zzp;
import ff.AbstractC2641B;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import k8.C3200i;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import q7.BinderC3877b;
import r7.C3931a;
import r7.C3934d;
import z4.C4612b;
import z4.C4613c;

/* renamed from: A7.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0237b0 implements Ea.e, He.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f811a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f812b;

    /* renamed from: c, reason: collision with root package name */
    public Object f813c;

    /* renamed from: d, reason: collision with root package name */
    public Object f814d;

    /* renamed from: e, reason: collision with root package name */
    public Object f815e;

    public C0237b0(Context context, int i5) {
        this.f811a = i5;
        switch (i5) {
            case 4:
                this.f812b = false;
                this.f815e = new C8.i(context, this);
                break;
            default:
                this.f814d = new zzp(null);
                this.f813c = context;
                break;
        }
    }

    public static void m(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        float f12 = fArr2[10] / fSqrt;
        fArr[0] = f12;
        float f13 = fArr2[8];
        fArr[2] = f13 / fSqrt;
        fArr[8] = (-f13) / fSqrt;
        fArr[10] = f12;
    }

    @Override // He.j
    public void a(Je.b bVar) {
        ((Je.c) this.f815e).c(bVar);
    }

    @Override // He.j
    public void b(Object obj) {
        if (this.f812b) {
            this.f812b = false;
        }
        ((He.j) this.f813c).b(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02e9  */
    @Override // Ea.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Ca.f c(Aa.a r31) throws ua.a {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.C0237b0.c(Aa.a):Ca.f");
    }

    public void d() {
        C4613c.a((C4613c) this.f815e, this, false);
    }

    public void e(long j8, String str) {
        h(str, String.valueOf(j8));
    }

    public void f(Object obj, String str) {
        G9.e eVar = new G9.e(28);
        ((G9.e) this.f815e).f4687d = eVar;
        this.f815e = eVar;
        eVar.f4686c = obj;
        eVar.f4685b = str;
    }

    public void g(String str, boolean z2) {
        h(str, String.valueOf(z2));
    }

    public void h(String str, String str2) {
        C3200i c3200i = new C3200i(28);
        ((G9.e) this.f815e).f4687d = c3200i;
        this.f815e = c3200i;
        c3200i.f4686c = str2;
        c3200i.f4685b = str;
    }

    public J3.s i() {
        if (this.f812b && ((S3.p) this.f814d).f10986j.f5557c) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        J3.s sVar = new J3.s((UUID) this.f813c, (S3.p) this.f814d, (Set) this.f815e);
        J3.d dVar = ((S3.p) this.f814d).f10986j;
        boolean z2 = (Build.VERSION.SDK_INT >= 24 && !dVar.f5562h.isEmpty()) || dVar.f5558d || dVar.f5556b || dVar.f5557c;
        S3.p pVar = (S3.p) this.f814d;
        if (pVar.f10992q) {
            if (z2) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (pVar.f10983g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC3340k.d(uuidRandomUUID, "randomUUID()");
        this.f813c = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        AbstractC3340k.d(string, "id.toString()");
        S3.p other = (S3.p) this.f814d;
        AbstractC3340k.e(other, "other");
        int i5 = other.f10978b;
        String str = other.f10980d;
        J3.h hVar = new J3.h(other.f10981e);
        J3.h hVar2 = new J3.h(other.f10982f);
        J3.d other2 = other.f10986j;
        AbstractC3340k.e(other2, "other");
        this.f814d = new S3.p(string, i5, other.f10979c, str, hVar, hVar2, other.f10983g, other.f10984h, other.f10985i, new J3.d(other2.f5555a, other2.f5556b, other2.f5557c, other2.f5558d, other2.f5559e, other2.f5560f, other2.f5561g, other2.f5562h), other.k, other.f10987l, other.f10988m, other.f10989n, other.f10990o, other.f10991p, other.f10992q, other.f10993r, other.f10994s, 524288, 0);
        return sVar;
    }

    public boolean j(E5.T t10, C0527h c0527h) throws IllegalArgumentException {
        boolean zEquals = "audio/eac3-joc".equals(t10.f3238l);
        int i5 = t10.f3251y;
        if (zEquals && i5 == 16) {
            i5 = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(u6.v.k(i5));
        int i10 = t10.f3252z;
        if (i10 != -1) {
            channelMask.setSampleRate(i10);
        }
        return ((Spatializer) this.f813c).canBeSpatialized((AudioAttributes) c0527h.a().f152b, channelMask.build());
    }

    public boolean k(C0754c c0754c, C0765n c0765n) throws IllegalArgumentException {
        boolean zEquals = Objects.equals(c0765n.f8232n, "audio/eac3-joc");
        int i5 = c0765n.f8210C;
        if (!zEquals) {
            String str = c0765n.f8232n;
            if (Objects.equals(str, "audio/iamf")) {
                if (i5 == -1) {
                    i5 = 6;
                }
            } else if (Objects.equals(str, "audio/ac4") && (i5 == 18 || i5 == 21)) {
                i5 = 24;
            }
        } else if (i5 == 16) {
            i5 = 12;
        }
        int iQ = Q1.x.q(i5);
        if (iQ == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iQ);
        int i10 = c0765n.f8211D;
        if (i10 != -1) {
            channelMask.setSampleRate(i10);
        }
        return ((Spatializer) this.f813c).canBeSpatialized((AudioAttributes) c0754c.a().f48001b, channelMask.build());
    }

    public void l(boolean z2) {
        a4.f fVar = (a4.f) this.f815e;
        synchronized (fVar) {
            try {
                if (this.f812b) {
                    throw new IllegalStateException("editor is closed");
                }
                if (AbstractC3340k.a(((C1329b) this.f813c).f17348g, this)) {
                    a4.f.a(fVar, this, z2);
                }
                this.f812b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public cg.y n(int i5) {
        cg.y yVar;
        a4.f fVar = (a4.f) this.f815e;
        synchronized (fVar) {
            if (this.f812b) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.f814d)[i5] = true;
            Object obj = ((C1329b) this.f813c).f17345d.get(i5);
            C1331d c1331d = fVar.f17371p;
            cg.y yVar2 = (cg.y) obj;
            if (!c1331d.c(yVar2)) {
                k4.e.a(c1331d.h(yVar2));
            }
            yVar = (cg.y) obj;
        }
        return yVar;
    }

    public File o() {
        File file;
        synchronized (((C4613c) this.f815e)) {
            try {
                C4612b c4612b = (C4612b) this.f813c;
                if (c4612b.f48346f != this) {
                    throw new IllegalStateException();
                }
                if (!c4612b.f48345e) {
                    ((boolean[]) this.f814d)[0] = true;
                }
                file = c4612b.f48344d[0];
                if (!((C4613c) this.f815e).f48348a.exists()) {
                    ((C4613c) this.f815e).f48348a.mkdirs();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    @Override // He.j
    public void onComplete() {
        if (!this.f812b) {
            ((He.j) this.f813c).onComplete();
        } else {
            this.f812b = false;
            ((Te.n) this.f814d).c(this);
        }
    }

    @Override // He.j
    public void onError(Throwable th) {
        ((He.j) this.f813c).onError(th);
    }

    public int[] p() {
        synchronized (this) {
            try {
                if (!this.f812b) {
                    return null;
                }
                long[] jArr = (long[]) this.f813c;
                int length = jArr.length;
                int i5 = 0;
                int i10 = 0;
                while (i5 < length) {
                    int i11 = i10 + 1;
                    int i12 = 1;
                    boolean z2 = jArr[i5] > 0;
                    boolean[] zArr = (boolean[]) this.f814d;
                    if (z2 != zArr[i10]) {
                        int[] iArr = (int[]) this.f815e;
                        if (!z2) {
                            i12 = 2;
                        }
                        iArr[i10] = i12;
                    } else {
                        ((int[]) this.f815e)[i10] = 0;
                    }
                    zArr[i10] = z2;
                    i5++;
                    i10 = i11;
                }
                this.f812b = false;
                return (int[]) ((int[]) this.f815e).clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean q() {
        boolean z2;
        synchronized (this.f813c) {
            z2 = this.f812b;
        }
        return z2;
    }

    public void r(int i5) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC3256n.m(i5, "backoffPolicy");
        AbstractC3340k.e(timeUnit, "timeUnit");
        this.f812b = true;
        S3.p pVar = (S3.p) this.f814d;
        pVar.f10987l = i5;
        long millis = timeUnit.toMillis(10000L);
        String str = S3.p.f10976u;
        if (millis > 18000000) {
            J3.r.d().g(str, "Backoff delay duration exceeds maximum value");
        }
        if (millis < 10000) {
            J3.r.d().g(str, "Backoff delay duration less than minimum value");
        }
        pVar.f10988m = android.support.v4.media.session.b.T(millis, 10000L, 18000000L);
    }

    public boolean s(String str, String str2) {
        synchronized (this) {
            try {
                if (!((T8.d) ((AtomicMarkableReference) this.f813c).getReference()).c(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.f813c;
                atomicMarkableReference.set((T8.d) atomicMarkableReference.getReference(), true);
                C8.g gVar = new C8.g(this, 13);
                AtomicReference atomicReference = (AtomicReference) this.f814d;
                while (!atomicReference.compareAndSet(null, gVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((S8.f) ((X8.c) this.f815e).f16186c).f11035b.b(gVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void t(Runnable runnable, Executor executor) {
        synchronized (this.f813c) {
            try {
                if (this.f812b) {
                    ((ArrayDeque) this.f814d).add(new ya.r(runnable, executor));
                } else {
                    this.f812b = true;
                    w(runnable, executor);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        switch (this.f811a) {
            case 10:
                boolean z2 = this.f812b;
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f813c);
                sb2.append('{');
                String str = "";
                for (G9.e eVar = (G9.e) ((G9.e) this.f814d).f4687d; eVar != null; eVar = (G9.e) eVar.f4687d) {
                    Object obj = eVar.f4686c;
                    if ((eVar instanceof C3200i) || obj != null || !z2) {
                        sb2.append(str);
                        String str2 = (String) eVar.f4685b;
                        if (str2 != null) {
                            sb2.append(str2);
                            sb2.append('=');
                        }
                        if (obj == null || !obj.getClass().isArray()) {
                            sb2.append(obj);
                        } else {
                            String strDeepToString = Arrays.deepToString(new Object[]{obj});
                            sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                        }
                        str = ", ";
                    }
                }
                sb2.append('}');
                return sb2.toString();
            case 11:
            default:
                return super.toString();
            case 12:
                StringBuilder sb3 = new StringBuilder("DatabaseInfo(databaseId:");
                sb3.append((s9.f) this.f815e);
                sb3.append(" host:");
                return wg.b.c(sb3, (String) this.f814d, ")");
        }
    }

    public String u() {
        if (!this.f812b) {
            this.f812b = true;
            this.f814d = ((Z) this.f815e).l0().getString((String) this.f813c, null);
        }
        return (String) this.f814d;
    }

    public void v(String str) {
        SharedPreferences.Editor editorEdit = ((Z) this.f815e).l0().edit();
        editorEdit.putString((String) this.f813c, str);
        editorEdit.apply();
        this.f814d = str;
    }

    public void w(Runnable runnable, Executor executor) {
        try {
            executor.execute(new ya.m(2, this, runnable));
        } catch (RejectedExecutionException unused) {
            zzc();
        }
    }

    public void x() {
        ((Handler) this.f814d).removeCallbacksAndMessages(null);
        if (((C1105q) this.f815e) != null) {
            C0974fb.e().k((C1105q) this.f815e);
            this.f815e = null;
        }
    }

    @Override // Ea.e
    public void zzb() throws ua.a {
        Context context = (Context) this.f813c;
        if (((zzh) this.f815e) != null) {
            return;
        }
        try {
            zzh zzhVarZzd = zzj.zza(C3934d.c(context, C3934d.f44523b, "com.google.android.gms.vision.dynamite").b("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator")).zzd(new BinderC3877b(context), (zzp) this.f814d);
            this.f815e = zzhVarZzd;
            if (zzhVarZzd != null || this.f812b) {
                return;
            }
            Log.d("LegacyTextDelegate", "Request OCR optional module download.");
            ya.j.a(context);
            this.f812b = true;
        } catch (RemoteException e7) {
            throw new ua.a("Failed to create legacy text recognizer.", e7);
        } catch (C3931a e10) {
            throw new ua.a("Failed to load deprecated vision dynamite module.", e10);
        }
    }

    @Override // Ea.e
    public void zzc() {
        switch (this.f811a) {
            case 1:
                zzh zzhVar = (zzh) this.f815e;
                if (zzhVar != null) {
                    try {
                        zzhVar.zzd();
                    } catch (RemoteException e7) {
                        Log.e("LegacyTextDelegate", "Failed to release legacy text recognizer.", e7);
                    }
                    this.f815e = null;
                    return;
                }
                return;
            default:
                synchronized (this.f813c) {
                    try {
                        if (((ArrayDeque) this.f814d).isEmpty()) {
                            this.f812b = false;
                            return;
                        }
                        ya.r rVar = (ya.r) ((ArrayDeque) this.f814d).remove();
                        w(rVar.f48072b, rVar.f48071a);
                        return;
                    } finally {
                    }
                }
        }
    }

    public C0237b0(Z z2, String str) {
        this.f811a = 0;
        this.f815e = z2;
        AbstractC1732v.f(str);
        this.f813c = str;
    }

    public C0237b0(InterfaceC1026jb interfaceC1026jb) {
        this.f811a = 7;
        this.f812b = false;
        this.f813c = interfaceC1026jb;
        this.f814d = new Handler(Looper.getMainLooper());
        C1105q c1105q = new C1105q(4);
        c1105q.f14517b = this;
        this.f815e = c1105q;
        C0974fb.e().f((C1105q) this.f815e);
    }

    public C0237b0(byte b5, int i5) {
        this.f811a = i5;
        switch (i5) {
            case 15:
                this.f813c = new float[16];
                this.f814d = new float[16];
                this.f815e = new Q1.t(1);
                break;
            case 16:
                this.f813c = new Object();
                this.f814d = new ArrayDeque();
                this.f815e = new AtomicReference();
                break;
            default:
                this.f813c = new Object();
                this.f814d = new ArrayList();
                this.f815e = new ArrayList();
                this.f812b = true;
                break;
        }
    }

    public C0237b0(s9.f fVar, String str, String str2, boolean z2) {
        this.f811a = 12;
        this.f815e = fVar;
        this.f813c = str;
        this.f814d = str2;
        this.f812b = z2;
    }

    public C0237b0(He.j jVar, Te.n nVar) {
        this.f811a = 6;
        this.f813c = jVar;
        this.f814d = nVar;
        this.f812b = true;
        this.f815e = new Je.c(1);
    }

    public C0237b0(s9.i iVar, a2.v vVar, c9.d dVar, boolean z2) {
        this.f811a = 13;
        this.f813c = iVar;
        this.f814d = vVar;
        this.f815e = dVar;
        this.f812b = z2;
    }

    public C0237b0(Class cls) {
        this.f811a = 2;
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC3340k.d(uuidRandomUUID, "randomUUID()");
        this.f813c = uuidRandomUUID;
        String string = ((UUID) this.f813c).toString();
        AbstractC3340k.d(string, "id.toString()");
        this.f814d = new S3.p(string, 0, cls.getName(), null, null, null, 0L, 0L, 0L, null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 1048570, 0);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC2641B.D(1));
        ff.m.F0(strArr, linkedHashSet);
        this.f815e = linkedHashSet;
        ((S3.p) this.f814d).f10980d = OverwritingInputMerger.class.getName();
    }

    public C0237b0(String str) {
        this.f811a = 10;
        G9.e eVar = new G9.e(28);
        this.f814d = eVar;
        this.f815e = eVar;
        this.f812b = false;
        this.f813c = str;
    }

    public C0237b0(X8.c cVar, boolean z2) {
        this.f811a = 5;
        this.f815e = cVar;
        this.f814d = new AtomicReference(null);
        this.f812b = z2;
        this.f813c = new AtomicMarkableReference(new T8.d(z2 ? Segment.SIZE : Segment.SHARE_MINIMUM), false);
    }

    public C0237b0(int i5) {
        this.f811a = 9;
        this.f813c = new long[i5];
        this.f814d = new boolean[i5];
        this.f815e = new int[i5];
    }

    public C0237b0(a4.f fVar, C1329b c1329b) {
        this.f811a = 8;
        this.f815e = fVar;
        this.f813c = c1329b;
        fVar.getClass();
        this.f814d = new boolean[2];
    }

    public C0237b0(C4613c c4613c, C4612b c4612b) {
        this.f811a = 17;
        this.f815e = c4613c;
        this.f813c = c4612b;
        this.f814d = c4612b.f48345e ? null : new boolean[c4613c.f48354g];
    }

    public C0237b0(Spatializer spatializer, int i5) {
        this.f811a = i5;
        switch (i5) {
            case 14:
                this.f813c = spatializer;
                this.f812b = spatializer.getImmersiveAudioLevel() != 0;
                break;
            default:
                this.f813c = spatializer;
                this.f812b = spatializer.getImmersiveAudioLevel() != 0;
                break;
        }
    }
}
