package F6;

import A7.C0237b0;
import A7.RunnableC0299w0;
import D6.C0395s;
import G6.L;
import M.y;
import Va.C0921ba;
import Va.C0986ga;
import android.content.Context;
import android.text.TextUtils;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.common.api.internal.C1688b;
import com.google.android.gms.common.api.internal.C1695i;
import com.google.android.gms.common.api.internal.H;
import com.google.android.gms.common.api.internal.e0;
import com.google.android.gms.common.internal.InterfaceC1715d;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzclb;
import com.google.android.gms.internal.ads.zzgrg;
import com.google.android.gms.internal.ads.zzgrh;
import com.google.android.gms.internal.ads.zzgsa;
import com.google.android.gms.internal.ads.zzgse;
import com.google.android.gms.internal.ads.zzgsf;
import com.google.android.gms.internal.ads.zzgss;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import f6.C2598k;
import f6.C2599l;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReferenceArray;
import k2.G;
import k8.InterfaceC3207p;
import ka.AbstractC3256n;
import md.I;
import md.c0;
import md.k0;
import td.C4157a;
import wa.C4398a;

/* loaded from: classes3.dex */
public final class r implements InterfaceC1715d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4010a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4011b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4012c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4013d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4014e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4015f;

    /* renamed from: g, reason: collision with root package name */
    public Object f4016g;

    public /* synthetic */ r() {
        this.f4010a = 0;
    }

    public static String a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        Fe.e.t(str, "fullServiceName");
        sb2.append(str);
        sb2.append("/");
        Fe.e.t(str2, "methodName");
        sb2.append(str2);
        return sb2.toString();
    }

    public static y d() {
        y yVar = new y();
        yVar.f7227b = null;
        yVar.f7228c = null;
        return yVar;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1715d
    public void b(d7.b bVar) {
        ((C1695i) this.f4016g).f26543n.post(new e0(1, this, bVar));
    }

    public InterfaceC3207p c(int i5) {
        InterfaceC3207p interfaceC3207p;
        InterfaceC3207p c2598k;
        HashMap map = (HashMap) this.f4013d;
        InterfaceC3207p interfaceC3207p2 = (InterfaceC3207p) map.get(Integer.valueOf(i5));
        if (interfaceC3207p2 != null) {
            return interfaceC3207p2;
        }
        final S3.c cVar = (S3.c) this.f4015f;
        cVar.getClass();
        if (i5 == 0) {
            final Class clsAsSubclass = DashMediaSource$Factory.class.asSubclass(G.class);
            final int i10 = 0;
            interfaceC3207p = new InterfaceC3207p() { // from class: k2.u
                @Override // k8.InterfaceC3207p
                public final Object get() {
                    switch (i10) {
                    }
                    return C3164v.d(clsAsSubclass, cVar);
                }
            };
        } else if (i5 == 1) {
            final Class clsAsSubclass2 = SsMediaSource$Factory.class.asSubclass(G.class);
            final int i11 = 1;
            interfaceC3207p = new InterfaceC3207p() { // from class: k2.u
                @Override // k8.InterfaceC3207p
                public final Object get() {
                    switch (i11) {
                    }
                    return C3164v.d(clsAsSubclass2, cVar);
                }
            };
        } else {
            if (i5 != 2) {
                if (i5 == 3) {
                    c2598k = new C2598k(1, RtspMediaSource$Factory.class.asSubclass(G.class));
                } else {
                    if (i5 != 4) {
                        throw new IllegalArgumentException(AbstractC3256n.g(i5, "Unrecognized contentType: "));
                    }
                    c2598k = new C2599l(1, this, cVar);
                }
                map.put(Integer.valueOf(i5), c2598k);
                return c2598k;
            }
            final Class clsAsSubclass3 = HlsMediaSource$Factory.class.asSubclass(G.class);
            final int i12 = 2;
            interfaceC3207p = new InterfaceC3207p() { // from class: k2.u
                @Override // k8.InterfaceC3207p
                public final Object get() {
                    switch (i12) {
                    }
                    return C3164v.d(clsAsSubclass3, cVar);
                }
            };
        }
        c2598k = interfaceC3207p;
        map.put(Integer.valueOf(i5), c2598k);
        return c2598k;
    }

    public MessageLite e(InputStream inputStream) throws IOException {
        CodedInputStream codedInputStreamNewInstance;
        byte[] bArr;
        td.b bVar = (td.b) this.f4016g;
        bVar.getClass();
        if ((inputStream instanceof C4157a) && ((C4157a) inputStream).f46033b == bVar.f46036a) {
            try {
                MessageLite messageLite = ((C4157a) inputStream).f46032a;
                if (messageLite != null) {
                    return messageLite;
                }
                throw new IllegalStateException("message not available");
            } catch (IllegalStateException unused) {
            }
        }
        try {
            if (inputStream instanceof I) {
                int iAvailable = inputStream.available();
                if (iAvailable <= 0 || iAvailable > 4194304) {
                    if (iAvailable == 0) {
                        return bVar.f46037b;
                    }
                    codedInputStreamNewInstance = null;
                } else {
                    ThreadLocal threadLocal = td.b.f46035d;
                    Reference reference = (Reference) threadLocal.get();
                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                        bArr = new byte[iAvailable];
                        threadLocal.set(new WeakReference(bArr));
                    }
                    int i5 = iAvailable;
                    while (i5 > 0) {
                        int i10 = inputStream.read(bArr, iAvailable - i5, i5);
                        if (i10 == -1) {
                            break;
                        }
                        i5 -= i10;
                    }
                    if (i5 != 0) {
                        throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i5));
                    }
                    codedInputStreamNewInstance = CodedInputStream.newInstance(bArr, 0, iAvailable);
                }
            } else {
                codedInputStreamNewInstance = null;
            }
            if (codedInputStreamNewInstance == null) {
                codedInputStreamNewInstance = CodedInputStream.newInstance(inputStream);
            }
            codedInputStreamNewInstance.setSizeLimit(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
            int i11 = bVar.f46038c;
            if (i11 >= 0) {
                codedInputStreamNewInstance.setRecursionLimit(i11);
            }
            try {
                MessageLite messageLite2 = (MessageLite) bVar.f46036a.parseFrom(codedInputStreamNewInstance, td.c.f46039a);
                try {
                    codedInputStreamNewInstance.checkLastTagWas(0);
                    return messageLite2;
                } catch (InvalidProtocolBufferException e7) {
                    e7.setUnfinishedMessage(messageLite2);
                    throw e7;
                }
            } catch (InvalidProtocolBufferException e10) {
                throw k0.f40681m.h("Invalid protobuf byte sequence").g(e10).a();
            }
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    public C4157a f(Object obj) {
        td.b bVar = (td.b) this.f4015f;
        bVar.getClass();
        return new C4157a((MessageLite) obj, bVar.f46036a);
    }

    public void g(d7.b bVar) {
        H h10 = (H) ((C1695i) this.f4016g).f26540j.get((C1688b) this.f4013d);
        if (h10 != null) {
            h10.n(bVar);
        }
    }

    public synchronized boolean h(Context context) {
        if (!zzgss.zza(context)) {
            return false;
        }
        try {
            this.f4015f = zzgrh.zza(context);
        } catch (NullPointerException e7) {
            L.k("Error connecting LMD Overlay service");
            C6.n.f1857D.f1868h.zzh(e7, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (((zzgrg) this.f4015f) == null) {
            this.f4011b = false;
            return false;
        }
        if (((S3.l) this.f4016g) == null) {
            this.f4016g = new S3.l(this);
        }
        this.f4011b = true;
        return true;
    }

    public void i(zzclb zzclbVar, zzgsa zzgsaVar) {
        if (zzclbVar == null) {
            j("adWebview missing", "onLMDShow");
            return;
        }
        this.f4014e = zzclbVar;
        if (!this.f4011b && !h(zzclbVar.getContext())) {
            j("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznh)).booleanValue()) {
            this.f4013d = zzgsaVar.zzb();
        }
        if (((S3.l) this.f4016g) == null) {
            this.f4016g = new S3.l(this);
        }
        zzgrg zzgrgVar = (zzgrg) this.f4015f;
        if (zzgrgVar != null) {
            zzgrgVar.zza(zzgsaVar, (S3.l) this.f4016g);
        }
    }

    public void j(String str, String str2) {
        L.k(str);
        if (((zzclb) this.f4014e) != null) {
            HashMap map = new HashMap();
            map.put(PglCryptUtils.KEY_MESSAGE, str);
            map.put(HandleInvocationsFromAdViewer.KEY_ACTION, str2);
            zzcfy.zzf.execute(new RunnableC0299w0(11, this, "onError", map, false));
        }
    }

    public zzgsf k() {
        zzgse zzgseVarZzc = zzgsf.zzc();
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznh)).booleanValue() || TextUtils.isEmpty((String) this.f4013d)) {
            String str = (String) this.f4012c;
            if (str != null) {
                zzgseVarZzc.zza(str);
            } else {
                j("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzgseVarZzc.zzb((String) this.f4013d);
        }
        return zzgseVarZzc.zzc();
    }

    public String toString() {
        switch (this.f4010a) {
            case 4:
                C0237b0 c0237b0S = Ba.c.S(this);
                c0237b0S.f((String) this.f4012c, "fullMethodName");
                c0237b0S.f((c0) this.f4014e, "type");
                c0237b0S.g("idempotent", false);
                c0237b0S.g("safe", false);
                c0237b0S.g("sampledToLocalTracing", this.f4011b);
                c0237b0S.f((td.b) this.f4015f, "requestMarshaller");
                c0237b0S.f((td.b) this.f4016g, "responseMarshaller");
                c0237b0S.f(null, "schemaDescriptor");
                c0237b0S.f812b = true;
                return c0237b0S.toString();
            default:
                return super.toString();
        }
    }

    public r(C1695i c1695i, com.google.android.gms.common.api.g gVar, C1688b c1688b) {
        this.f4010a = 2;
        this.f4016g = c1695i;
        this.f4014e = null;
        this.f4015f = null;
        this.f4011b = false;
        this.f4012c = gVar;
        this.f4013d = c1688b;
    }

    public r(C0921ba c0921ba) {
        this.f4010a = 1;
        this.f4012c = c0921ba;
        C0986ga c0986ga = new C0986ga();
        ArrayList arrayList = new ArrayList();
        c0986ga.f14220a = arrayList;
        c0986ga.f14221b = 0;
        arrayList.add(0, new ArrayList());
        this.f4013d = c0986ga;
        this.f4014e = new HashSet();
        this.f4015f = new HashSet();
        this.f4016g = new HashSet();
    }

    public r(c0 c0Var, String str, td.b bVar, td.b bVar2, boolean z2) {
        this.f4010a = 4;
        new AtomicReferenceArray(2);
        Fe.e.t(c0Var, "type");
        this.f4014e = c0Var;
        Fe.e.t(str, "fullMethodName");
        this.f4012c = str;
        int iLastIndexOf = str.lastIndexOf(47);
        this.f4013d = iLastIndexOf == -1 ? null : str.substring(0, iLastIndexOf);
        Fe.e.t(bVar, "requestMarshaller");
        this.f4015f = bVar;
        Fe.e.t(bVar2, "responseMarshaller");
        this.f4016g = bVar2;
        this.f4011b = z2;
    }

    public r(s2.k kVar, C4398a c4398a) {
        this.f4010a = 3;
        this.f4012c = kVar;
        this.f4016g = c4398a;
        this.f4013d = new HashMap();
        this.f4014e = new HashMap();
        this.f4011b = true;
    }
}
