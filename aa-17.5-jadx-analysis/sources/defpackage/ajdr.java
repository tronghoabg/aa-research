package defpackage;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes3.dex */
public final class ajdr {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ajdr(String str) {
        String strConcat = "RequestPerformanceNumTries".concat(str);
        qbt qbtVar = qbt.aS;
        this.d = new qbu(strConcat, qbtVar);
        int i = qbj.a;
        new qbv("RequestPerformanceNetworkLatency".concat(str), qbtVar, null);
        this.e = new qbv("RequestPerformanceEndToEndLatency".concat(str), qbtVar, null);
        this.a = new qbv("RequestPerformanceEndToEndSuccessLatency".concat(str), qbtVar, null);
        new qbv("RequestPerformanceSentBytes".concat(str), qbtVar, null);
        new qbv("RequestPerformanceReceivedBytes".concat(str), qbtVar, null);
        new qbv("RequestPerformanceMetadataSentBytes".concat(str), qbtVar, null);
        this.b = new qbv("RequestPerformanceServerTime".concat(str), qbtVar, null);
        this.c = new qbu("RequestPerformanceStatus".concat(str), qbtVar);
    }

    public final int a() {
        return ((aisv) this.c).b - ((aisv) this.d).b;
    }

    public final ajdn b(ajdn ajdnVar) {
        if (a() == 127) {
            return ajdnVar;
        }
        if (ajdnVar.h) {
            ((aisv) this.e).a();
        }
        aisv aisvVar = (aisv) this.c;
        int i = 127 & aisvVar.b;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, ajdnVar);
                aisvVar.a();
                return null;
            }
            Thread.yield();
        }
    }

    public final ajdn c() {
        ajdn ajdnVar;
        while (true) {
            Object obj = this.d;
            Object obj2 = this.c;
            aisv aisvVar = (aisv) obj;
            int i = aisvVar.b;
            if (i - ((aisv) obj2).b == 0) {
                return null;
            }
            int i2 = i & 127;
            if (aisvVar.b(i, i + 1) && (ajdnVar = (ajdn) ((AtomicReferenceArray) this.a).getAndSet(i2, null)) != null) {
                if (ajdnVar.h) {
                    ((aisv) this.e).c();
                    boolean z = aitz.a;
                }
                return ajdnVar;
            }
        }
    }

    public final ajdn d(int i, boolean z) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.a;
        int i2 = i & 127;
        ajdn ajdnVar = (ajdn) atomicReferenceArray.get(i2);
        if (ajdnVar != null && ajdnVar.h == z) {
            while (!atomicReferenceArray.compareAndSet(i2, ajdnVar, null)) {
                if (atomicReferenceArray.get(i2) != ajdnVar) {
                }
            }
            if (z) {
                ((aisv) this.e).c();
            }
            return ajdnVar;
        }
        return null;
    }

    public final /* synthetic */ void e(Runnable runnable) {
        ((fov) this.e).execute(runnable);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void f(String str, Object obj) {
        str.getClass();
        this.a.put(str, obj);
        ajab ajabVar = (ajab) this.e.get(str);
        if (ajabVar != null) {
            ajabVar.d(obj);
        }
        ajab ajabVar2 = (ajab) this.d.get(str);
        if (ajabVar2 != null) {
            ajabVar2.d(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final Object g(Class cls) {
        RuntimeException runtimeException = (RuntimeException) this.a.get(cls);
        if (runtimeException != null) {
            throw runtimeException;
        }
        ?? r0 = this.b;
        sg sgVar = (sg) r0.get(cls);
        if (sgVar != null) {
            return sgVar;
        }
        sh shVar = (sh) this.d.get(cls);
        if (shVar == null) {
            throw new IllegalArgumentException(a.bm(cls, "The class '", "' does not correspond to a car service"));
        }
        try {
            sg sgVarA = shVar.a();
            r0.put(cls, sgVarA);
            return sgVarA;
        } catch (RuntimeException e) {
            this.a.put(cls, e);
            throw e;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public final void h(Class cls, String str, sh shVar) {
        this.d.put(cls, shVar);
        if (str != null) {
            this.e.put(str, cls);
            this.c.put(cls, str);
        }
    }

    public ajdr(List list, List list2, List list3, List list4, List list5) {
        this.d = list;
        this.c = list2;
        this.b = list3;
        this.a = list4;
        this.e = list5;
    }

    public ajdr(byte[] bArr) {
        this.e = new float[16];
        this.d = new float[16];
        this.c = new float[16];
        this.b = new float[16];
        this.a = new float[4];
    }

    public ajdr(byte[] bArr, byte[] bArr2) {
        this.e = "r";
        this.a = "s";
        this.d = "t";
        this.b = "u";
        this.c = "v";
    }

    public ajdr(char[] cArr) {
        this.a = new too();
        this.c = new too();
        this.d = new too();
        this.b = new too();
        this.e = new float[8];
    }

    public ajdr(char[] cArr, byte[] bArr) {
        this.d = null;
        this.e = null;
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public ajdr(short[] sArr) {
        this.b = "c";
        this.c = "d";
        this.d = "e";
        this.e = "f";
        this.a = "j";
    }

    public ajdr() {
        this.a = new AtomicReferenceArray(128);
        aisy aisyVar = aisy.a;
        this.b = new aisx(null, aisyVar);
        this.c = new aisv(0, aisyVar);
        this.d = new aisv(0, aisyVar);
        this.e = new aisv(0, aisyVar);
    }

    public ajdr(Context context, MediaSessionCompat.Token token) {
        this.d = new Object();
        this.b = new ArrayList();
        this.c = new HashMap();
        this.a = token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) token.b);
        this.e = mediaController;
        if (token.a() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ResultReceiver(this) { // from class: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
                private final WeakReference a;

                {
                    super(null);
                    this.a = new WeakReference(this);
                }

                /* JADX WARN: Removed duplicated region for block: B:61:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
                /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.List] */
                @Override // android.os.ResultReceiver
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                protected final void onReceiveResult(int r6, android.os.Bundle r7) {
                    /*
                        Method dump skipped, instructions count: 203
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.onReceiveResult(int, android.os.Bundle):void");
                }
            });
        }
    }

    public ajdr(String str, String str2, IconCompat iconCompat, afdr afdrVar, afdr afdrVar2) {
        this.d = str;
        this.a = str2;
        this.e = iconCompat;
        this.c = afdrVar;
        this.b = afdrVar2;
    }

    public ajdr(tqv tqvVar, rjs rjsVar, Context context, ackk ackkVar) {
        this.e = new AtomicInteger();
        new SparseArray();
        this.d = tqvVar;
        this.b = rjsVar;
        this.a = context;
        this.c = ackkVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    public ajdr(ws wsVar) {
        this.c = new eqm();
        this.d = new eqm();
        this.e = wsVar.c;
        this.a = wsVar.b;
        zgs zgsVarAI = yrm.aI(wsVar.a);
        Thread thread = Looper.getMainLooper().getThread();
        zgsVarAI.getClass();
        thread.getClass();
        this.b = new tdu(zgsVarAI, thread);
    }

    public ajdr(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.b = new HashMap();
        this.a = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
        this.c = new HashMap();
    }

    public ajdr(aezk aezkVar, aezk aezkVar2, aezk aezkVar3, aezk aezkVar4, aezk aezkVar5) {
        this.d = aezkVar;
        this.b = aezkVar2;
        this.a = aezkVar3;
        this.c = aezkVar4;
        aezkVar5.getClass();
        this.e = aezkVar5;
    }

    public ajdr(ackk ackkVar, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5) {
        this.a = new AtomicBoolean(true);
        this.e = new AtomicBoolean(false);
        this.d = new psr(new ojk(ackkVar, 20));
        this.c = (pxc) optional.orElse(null);
        this.b = (ackk) optional3.orElse(null);
    }

    public ajdr(Map map) {
        this.a = woy.be(map);
        this.c = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.b = new ewk(this, 1);
    }

    public ajdr(Executor executor) {
        this.b = new Handler(Looper.getMainLooper());
        this.d = new fpe(this, 0, null);
        fov fovVar = new fov(executor);
        this.e = fovVar;
        aitu aituVarB = aiji.b(fovVar);
        this.c = aituVarB;
        aiji.b(new fov(executor));
        this.a = ahni.b(aituVarB);
    }

    public ajdr(tmb tmbVar, qap qapVar, qau qauVar, xxh xxhVar) {
        this.d = new sm((byte[]) null, (byte[]) null, (byte[]) null);
        new HashSet();
        this.c = qauVar;
        this.a = tmbVar;
        this.b = qapVar;
        wub.L(new qfe(this, 1));
        this.e = xxhVar;
    }
}
