package E5;

import A7.C0234a0;
import U1.C0855z;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuq;
import com.google.android.gms.internal.mlkit_vision_text_common.zzut;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuv;
import com.google.android.gms.internal.mlkit_vision_text_common.zzux;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvh;
import java.nio.ByteBuffer;
import ka.AbstractC3256n;
import p7.AbstractC3772b;
import q7.BinderC3877b;
import r7.C3931a;
import r7.C3934d;

/* renamed from: E5.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0461l implements u6.j, Ea.e, U1.D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3451a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3452b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3453c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3454d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3455e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3456f;

    /* renamed from: g, reason: collision with root package name */
    public Object f3457g;

    public C0461l(Context context, Ca.h hVar, zzuc zzucVar) {
        this.f3451a = 1;
        this.f3454d = context;
        this.f3455e = hVar;
        this.f3456f = zzucVar;
    }

    public static zzvh b(Ca.h hVar, String str) {
        boolean z2 = false;
        if ((hVar instanceof Ea.c) && ((Ea.c) hVar).zza()) {
            z2 = true;
        }
        return new zzvh(hVar.b(), "optional-module-text-latin", str, true, 1, "en", z2);
    }

    @Override // u6.j
    public void a(r0 r0Var) {
        u6.j jVar = (u6.j) this.f3457g;
        if (jVar != null) {
            jVar.a(r0Var);
            r0Var = ((u6.j) this.f3457g).e();
        }
        ((C0234a0) this.f3454d).a(r0Var);
    }

    @Override // Ea.e
    public Ca.f c(Aa.a aVar) throws ua.a {
        BinderC3877b binderC3877b;
        BinderC3877b binderC3877b2;
        if (((zzuv) this.f3457g) == null) {
            zzb();
        }
        zzuv zzuvVar = (zzuv) this.f3457g;
        AbstractC1732v.i(zzuvVar);
        if (!this.f3452b) {
            try {
                zzuvVar.zze();
                this.f3452b = true;
            } catch (RemoteException e7) {
                throw new ua.a("Failed to init text recognizer ".concat(((Ca.h) this.f3455e).a()), e7);
            }
        }
        zzuq zzuqVar = new zzuq(aVar.f1252f, aVar.f1249c, aVar.f1250d, AbstractC3772b.k(aVar.f1251e), SystemClock.elapsedRealtime());
        Ba.a.f1647b.getClass();
        int i5 = aVar.f1252f;
        try {
            if (i5 != -1) {
                if (i5 != 17) {
                    if (i5 == 35) {
                        binderC3877b2 = new BinderC3877b(null);
                        return new Ca.f(zzuvVar.zzd(binderC3877b2, zzuqVar));
                    }
                    if (i5 != 842094169) {
                        throw new ua.a(AbstractC3256n.g(aVar.f1252f, "Unsupported image format: "), 3);
                    }
                }
                ByteBuffer byteBuffer = aVar.f1248b;
                AbstractC1732v.i(byteBuffer);
                binderC3877b = new BinderC3877b(byteBuffer);
            } else {
                Bitmap bitmap = aVar.f1247a;
                AbstractC1732v.i(bitmap);
                binderC3877b = new BinderC3877b(bitmap);
            }
            return new Ca.f(zzuvVar.zzd(binderC3877b2, zzuqVar));
        } catch (RemoteException e10) {
            throw new ua.a("Failed to run text recognizer ".concat(((Ca.h) this.f3455e).a()), e10);
        }
        binderC3877b2 = binderC3877b;
    }

    @Override // u6.j
    public r0 e() {
        u6.j jVar = (u6.j) this.f3457g;
        return jVar != null ? jVar.e() : (r0) ((C0234a0) this.f3454d).f797f;
    }

    @Override // u6.j
    public long g() {
        switch (this.f3451a) {
            case 0:
                if (this.f3452b) {
                    return ((C0234a0) this.f3454d).g();
                }
                u6.j jVar = (u6.j) this.f3457g;
                jVar.getClass();
                return jVar.g();
            default:
                if (this.f3452b) {
                    return ((C0234a0) this.f3454d).g();
                }
                U1.D d3 = (U1.D) this.f3457g;
                d3.getClass();
                return d3.g();
        }
    }

    @Override // U1.D
    public boolean n() {
        if (this.f3452b) {
            ((C0234a0) this.f3454d).getClass();
            return false;
        }
        U1.D d3 = (U1.D) this.f3457g;
        d3.getClass();
        return d3.n();
    }

    @Override // U1.D
    public void q(N1.F f10) {
        U1.D d3 = (U1.D) this.f3457g;
        if (d3 != null) {
            d3.q(f10);
            f10 = ((U1.D) this.f3457g).mo3e();
        }
        ((C0234a0) this.f3454d).q(f10);
    }

    @Override // Ea.e
    public void zzb() throws ua.a {
        zzuv zzuvVarZzd;
        zzuc zzucVar = (zzuc) this.f3456f;
        Context context = (Context) this.f3454d;
        Ca.h hVar = (Ca.h) this.f3455e;
        if (((zzuv) this.f3457g) != null) {
            return;
        }
        try {
            boolean z2 = hVar instanceof Ea.b;
            String strZza = z2 ? ((Ea.b) hVar).zza() : null;
            if (hVar.c()) {
                Log.d("DecoupledTextDelegate", "Start loading thick OCR module.");
                zzuvVarZzd = zzux.zza(C3934d.c(context, C3934d.f44524c, hVar.e()).b("com.google.mlkit.vision.text.bundled.common.BundledTextRecognizerCreator")).zze(new BinderC3877b(context), b(hVar, strZza));
            } else if (z2) {
                Log.d("DecoupledTextDelegate", "Start loading custom OCR module.");
                zzuvVarZzd = zzut.zza(C3934d.c(context, C3934d.f44523b, hVar.e()).b("com.google.android.gms.vision.text.mlkit.CommonTextRecognizerCreator")).zzd(new BinderC3877b(context), null, b(hVar, strZza));
            } else {
                Log.d("DecoupledTextDelegate", "Start loading thin OCR module.");
                zzuvVarZzd = zzux.zza(C3934d.c(context, C3934d.f44523b, hVar.e()).b("com.google.android.gms.vision.text.mlkit.TextRecognizerCreator")).zzd(new BinderC3877b(context));
            }
            this.f3457g = zzuvVarZzd;
            zzucVar.zzf(new E4.F(hVar.c(), zzou.NO_ERROR), zzov.ON_DEVICE_TEXT_LOAD);
        } catch (RemoteException e7) {
            zzucVar.zzf(new E4.F(hVar.c(), zzou.OPTIONAL_MODULE_INIT_ERROR), zzov.ON_DEVICE_TEXT_LOAD);
            throw new ua.a("Failed to create text recognizer ".concat(hVar.a()), e7);
        } catch (C3931a e10) {
            zzucVar.zzf(new E4.F(hVar.c(), zzou.OPTIONAL_MODULE_NOT_AVAILABLE), zzov.ON_DEVICE_TEXT_LOAD);
            if (hVar.c()) {
                throw new ua.a(N0.a.h("Failed to load text module ", hVar.a(), ". ", e10.getMessage()), e10);
            }
            if (!this.f3453c) {
                ya.j.b(context, A6.h.T(hVar));
                this.f3453c = true;
            }
            throw new ua.a("Waiting for the text optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override // Ea.e
    public void zzc() {
        zzuv zzuvVar = (zzuv) this.f3457g;
        if (zzuvVar != null) {
            try {
                zzuvVar.zzf();
            } catch (RemoteException e7) {
                Log.e("DecoupledTextDelegate", "Failed to release text recognizer ".concat(((Ca.h) this.f3455e).a()), e7);
            }
            this.f3457g = null;
        }
        this.f3452b = false;
    }

    public C0461l(O o7, u6.q qVar) {
        this.f3451a = 0;
        this.f3455e = o7;
        this.f3454d = new C0234a0(qVar);
        this.f3452b = true;
    }

    @Override // U1.D
    /* renamed from: e */
    public N1.F mo3e() {
        U1.D d3 = (U1.D) this.f3457g;
        if (d3 != null) {
            return d3.mo3e();
        }
        return (N1.F) ((C0234a0) this.f3454d).f797f;
    }

    public C0461l(C0855z c0855z, Q1.q qVar) {
        this.f3451a = 2;
        this.f3455e = c0855z;
        this.f3454d = new C0234a0(qVar);
        this.f3452b = true;
    }

    public C0461l(Context context) {
        this.f3451a = 3;
        this.f3452b = true;
        this.f3453c = false;
        this.f3454d = context;
    }
}
