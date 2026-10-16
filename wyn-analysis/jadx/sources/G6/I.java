package G6;

import A7.V1;
import D6.C0395s;
import H7.C0580t;
import H7.C0581u;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbbb;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbbe;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbiu;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbix;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpg;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpi;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpk;
import com.google.android.libraries.vision.visionkit.pipeline.AndroidAssetUtil;
import com.google.android.libraries.vision.visionkit.pipeline.alt.PipelineException;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public Context f4509a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4510b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4511c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4512d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4513e;

    public I(Context context, Ga.c cVar) {
        this.f4511c = true;
        this.f4509a = context;
        this.f4512d = cVar;
    }

    public Ga.b a() throws PipelineException {
        if (this.f4510b) {
            return new Ga.b(0, zbki.zbd());
        }
        if (((Ga.d) this.f4513e) == null) {
            if (!AndroidAssetUtil.a(this.f4509a)) {
                Log.d("PipelineManager", "Failed to initiate native asset manager.");
            }
            Ga.c cVar = (Ga.c) this.f4512d;
            C0580t c0580tB = C0581u.b();
            int i5 = 4;
            char c10 = cVar.f4699d ? (char) 4 : (char) 0;
            H7.J jA = H7.K.a();
            zbbb zbbbVarZba = zbbe.zba();
            zbbbVarZba.zbd(cVar.f4697b);
            zbbbVarZba.zba(cVar.f4696a);
            zbbbVarZba.zbe(true);
            zbbbVarZba.zbb(true);
            String str = cVar.f4698c;
            if (!str.isEmpty()) {
                zbpf zbpfVarZba = zbpg.zba();
                zbpi zbpiVarZba = zbpk.zba();
                zbpiVarZba.zba(str);
                zbpfVarZba.zba(zbpiVarZba);
                zbbbVarZba.zbc(zbpfVarZba);
            }
            jA.b(zbbbVarZba);
            if (c10 == 0) {
                i5 = 1;
            } else if (c10 == 1) {
                i5 = 2;
            } else if (c10 == 2) {
                i5 = 3;
            } else if (c10 != 3) {
                i5 = c10 != 4 ? 0 : 5;
            }
            H7.B bA = H7.C.a();
            bA.a(i5);
            jA.c(bA);
            zbiu zbiuVarZba = zbix.zba();
            zbiuVarZba.zba("PassThroughCoarseClassifier");
            jA.a(zbiuVarZba);
            c0580tB.a(jA);
            H7.a0 a0VarA = H7.b0.a();
            a0VarA.a();
            c0580tB.b(a0VarA);
            this.f4513e = new Ga.d((C0581u) c0580tB.zbk());
        }
        try {
            Ga.d dVar = (Ga.d) this.f4513e;
            AbstractC1732v.i(dVar);
            com.google.android.libraries.vision.visionkit.pipeline.alt.a aVar = dVar.f26753b;
            long j8 = dVar.f26754c;
            if (j8 == 0) {
                throw new PipelineException(9, "Pipeline has been closed or was not initialized");
            }
            try {
                aVar.start(j8);
                aVar.waitUntilIdle(dVar.f26754c);
                this.f4510b = true;
                return new Ga.b(0, zbki.zbd());
            } catch (PipelineException e7) {
                aVar.stop(dVar.f26754c);
                throw e7;
            }
        } catch (PipelineException e10) {
            return new Ga.b(1, zbki.zbe(new RemoteException("Failed to initialize detector. ".concat((String) e10.getRootCauseMessage().zbb("")))));
        }
    }

    public synchronized void b(Context context) {
        try {
            if (this.f4510b) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f4509a = applicationContext;
            if (applicationContext == null) {
                this.f4509a = context;
            }
            zzbix.zza(this.f4509a);
            zzbio zzbioVar = zzbix.zzeR;
            C0395s c0395s = C0395s.f2489e;
            this.f4511c = ((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) c0395s.f2492c.zzd(zzbix.zzmF)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                this.f4509a.registerReceiver((V1) this.f4512d, intentFilter);
            } else {
                this.f4509a.registerReceiver((V1) this.f4512d, intentFilter, 4);
            }
            this.f4510b = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void c(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f4511c) {
            ((WeakHashMap) this.f4513e).remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    public I() {
        this.f4510b = false;
        this.f4513e = new WeakHashMap();
        this.f4512d = new V1(this);
    }
}
