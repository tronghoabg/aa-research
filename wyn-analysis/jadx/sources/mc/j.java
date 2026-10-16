package mc;

import ac.C1346a;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import ld.AbstractC3459a;
import s3.AbstractC3994a;
import uc.C4276m;
import uc.InterfaceC4267d;
import uc.InterfaceC4268e;
import uc.InterfaceC4269f;

/* loaded from: classes5.dex */
public final class j implements InterfaceC4269f, k {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f40547a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f40548b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f40549c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f40550d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f40551e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f40552f;

    /* renamed from: g, reason: collision with root package name */
    public int f40553g;

    /* renamed from: h, reason: collision with root package name */
    public final l f40554h;

    /* renamed from: i, reason: collision with root package name */
    public final WeakHashMap f40555i;

    /* renamed from: j, reason: collision with root package name */
    public final C1346a f40556j;

    public j(FlutterJNI flutterJNI) {
        C1346a c1346a = new C1346a(13, false);
        c1346a.f17489b = (ExecutorService) b7.k.z().f19398d;
        this.f40548b = new HashMap();
        this.f40549c = new HashMap();
        this.f40550d = new Object();
        this.f40551e = new AtomicBoolean(false);
        this.f40552f = new HashMap();
        this.f40553g = 1;
        this.f40554h = new l();
        this.f40555i = new WeakHashMap();
        this.f40547a = flutterJNI;
        this.f40556j = c1346a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [mc.c] */
    public final void a(final String str, final f fVar, final ByteBuffer byteBuffer, int i5, final long j8) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i10;
        e eVar = fVar != null ? fVar.f40538b : null;
        String strA = AbstractC3459a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            i10 = i5;
            AbstractC3994a.a(i10, tg.b.U(strA));
        } else {
            i10 = i5;
            String strU = tg.b.U(strA);
            try {
                if (tg.b.f46046e == null) {
                    tg.b.f46046e = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                tg.b.f46046e.invoke(null, Long.valueOf(tg.b.f46044c), strU, Integer.valueOf(i10));
            } catch (Exception e7) {
                tg.b.C("asyncTraceBegin", e7);
            }
        }
        final int i11 = i10;
        ?? r02 = new Runnable() { // from class: mc.c
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                long j10 = j8;
                FlutterJNI flutterJNI = this.f40528a.f40547a;
                StringBuilder sb2 = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb2.append(str2);
                String strA2 = AbstractC3459a.a(sb2.toString());
                int i12 = Build.VERSION.SDK_INT;
                int i13 = i11;
                if (i12 >= 29) {
                    AbstractC3994a.b(i13, tg.b.U(strA2));
                } else {
                    String strU2 = tg.b.U(strA2);
                    try {
                        if (tg.b.f46047f == null) {
                            tg.b.f46047f = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        tg.b.f46047f.invoke(null, Long.valueOf(tg.b.f46044c), strU2, Integer.valueOf(i13));
                    } catch (Exception e10) {
                        tg.b.C("asyncTraceEnd", e10);
                    }
                }
                try {
                    AbstractC3459a.b("DartMessenger#handleMessageFromDart on " + str2);
                    f fVar2 = fVar;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (fVar2 != null) {
                            try {
                                try {
                                    fVar2.f40537a.d(byteBuffer2, new g(flutterJNI, i13));
                                } catch (Error e11) {
                                    Thread threadCurrentThread = Thread.currentThread();
                                    if (threadCurrentThread.getUncaughtExceptionHandler() == null) {
                                        throw e11;
                                    }
                                    threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, e11);
                                }
                            } catch (Exception e12) {
                                Log.e("DartMessenger", "Uncaught exception in binary message listener", e12);
                                flutterJNI.invokePlatformMessageEmptyResponseCallback(i13);
                            }
                        } else {
                            flutterJNI.invokePlatformMessageEmptyResponseCallback(i13);
                        }
                        if (byteBuffer2 != null && byteBuffer2.isDirect()) {
                            byteBuffer2.limit(0);
                        }
                        Trace.endSection();
                    } finally {
                    }
                } finally {
                    flutterJNI.cleanupMessageData(j10);
                }
            }
        };
        e eVar2 = eVar;
        if (eVar == null) {
            eVar2 = this.f40554h;
        }
        eVar2.a(r02);
    }

    @Override // uc.InterfaceC4269f
    public final ab.b b() {
        C1346a c1346a = this.f40556j;
        c1346a.getClass();
        i iVar = new i((ExecutorService) c1346a.f17489b);
        ab.b bVar = new ab.b();
        this.f40555i.put(bVar, iVar);
        return bVar;
    }

    public final ab.b c(C4276m c4276m) {
        C1346a c1346a = this.f40556j;
        c1346a.getClass();
        i iVar = new i((ExecutorService) c1346a.f17489b);
        ab.b bVar = new ab.b();
        this.f40555i.put(bVar, iVar);
        return bVar;
    }

    @Override // uc.InterfaceC4269f
    public final void i(String str, InterfaceC4267d interfaceC4267d, ab.b bVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        e eVar;
        if (interfaceC4267d == null) {
            synchronized (this.f40550d) {
                this.f40548b.remove(str);
            }
            return;
        }
        if (bVar != null) {
            eVar = (e) this.f40555i.get(bVar);
            if (eVar == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            eVar = null;
        }
        synchronized (this.f40550d) {
            try {
                this.f40548b.put(str, new f(interfaceC4267d, eVar));
                List<d> list = (List) this.f40549c.remove(str);
                if (list == null) {
                    return;
                }
                for (d dVar : list) {
                    a(str, (f) this.f40548b.get(str), dVar.f40534a, dVar.f40535b, dVar.f40536c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // uc.InterfaceC4269f
    public final void j(String str, ByteBuffer byteBuffer, InterfaceC4268e interfaceC4268e) {
        AbstractC3459a.b("DartMessenger#send on " + str);
        try {
            int i5 = this.f40553g;
            this.f40553g = i5 + 1;
            if (interfaceC4268e != null) {
                this.f40552f.put(Integer.valueOf(i5), interfaceC4268e);
            }
            FlutterJNI flutterJNI = this.f40547a;
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, i5);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i5);
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // uc.InterfaceC4269f
    public final void l(String str, InterfaceC4267d interfaceC4267d) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        i(str, interfaceC4267d, null);
    }

    @Override // uc.InterfaceC4269f
    public final void q(String str, ByteBuffer byteBuffer) {
        j(str, byteBuffer, null);
    }
}
