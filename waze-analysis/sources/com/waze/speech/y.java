package com.waze.speech;

import android.app.Application;
import android.content.Context;
import android.os.ParcelFileDescriptor;
import androidx.media3.common.MimeTypes;
import com.waze.a.af;
import h.ab;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Objects;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.bu;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class y implements com.waze.h.b.i {

    /* renamed from: a, reason: collision with root package name */
    private final Application f40484a;

    /* renamed from: b, reason: collision with root package name */
    private final w f40485b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.t.a.k f40486c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40487d;

    /* renamed from: e, reason: collision with root package name */
    private final bm f40488e;

    /* renamed from: f, reason: collision with root package name */
    private final bq f40489f;

    /* renamed from: g, reason: collision with root package name */
    private a f40490g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f40491h;

    public y(Application application, w wVar, com.waze.t.a.k kVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(application, MimeTypes.BASE_TYPE_APPLICATION);
        h.g.b.x.f(wVar, "speechRecognizerService");
        h.g.b.x.f(kVar, "currentAudioLocaleProvider");
        h.g.b.x.f(eVar, "logger");
        this.f40484a = application;
        this.f40485b = wVar;
        this.f40486c = kVar;
        this.f40487d = eVar;
        bm bmVarE = bu.e(0, 1, kotlinx.coroutines.a.a.f51272b, 1);
        this.f40488e = bmVarE;
        this.f40489f = ai.S(bmVarE);
    }

    public static final /* synthetic */ void d(y yVar, s sVar) {
        Objects.toString(sVar);
        yVar.f40487d.a("received event from speech recognizer : ".concat(String.valueOf(sVar)));
        if (h.g.b.x.n(sVar, q.f40469a) || (sVar instanceof r)) {
            return;
        }
        if (h.g.b.x.n(sVar, o.f40467a)) {
            yVar.f(com.waze.h.b.g.f24323a);
            yVar.close();
            return;
        }
        if (!(sVar instanceof p)) {
            throw new h.i();
        }
        n nVarA = ((p) sVar).a();
        n nVar = n.f40462a;
        int iOrdinal = nVarA.ordinal();
        if (iOrdinal == 0) {
            yVar.e(new Throwable("unknown error from speech recognizer"));
            return;
        }
        if (iOrdinal == 1) {
            yVar.e(new Throwable("no permission error from speech recognizer"));
        } else {
            if (iOrdinal != 2 && iOrdinal != 3) {
                throw new h.i();
            }
            yVar.f(com.waze.h.b.h.f24324a);
            yVar.close();
        }
    }

    private final void e(Throwable th) {
        f(new com.waze.h.b.f(th));
        close();
    }

    private final void f(af afVar) {
        Objects.toString(afVar);
        this.f40487d.a("sendEvent : ".concat(afVar.toString()));
        this.f40488e.c(afVar);
    }

    @Override // com.waze.h.b.i
    public final bq a() {
        return this.f40489f;
    }

    @Override // com.waze.h.b.i
    public final void b(com.waze.h.c.a aVar) {
        Object objA;
        h.g.b.x.f(aVar, "inputAudioConfig");
        if (this.f40491h) {
            this.f40487d.a("start called but already running, call close() before starting a new one.");
            return;
        }
        try {
            y yVar = this;
            this.f40491h = true;
            h.g.b.x.f(aVar, "inputAudioConfig");
            ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
            ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
            h.g.b.x.e(parcelFileDescriptor, "get(...)");
            FileChannel channel = autoCloseOutputStream.getChannel();
            h.g.b.x.e(channel, "getChannel(...)");
            a aVar2 = new a(aVar, parcelFileDescriptor, channel);
            this.f40490g = aVar2;
            w wVar = this.f40485b;
            Context applicationContext = this.f40484a.getApplicationContext();
            h.g.b.x.e(applicationContext, "getApplicationContext(...)");
            wVar.k(applicationContext, null);
            wVar.j(aVar2, (String) this.f40486c.b(), new x(this));
            objA = wVar;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            this.f40487d.b("failed to start silence detector");
            e(thC);
        }
    }

    @Override // com.waze.h.b.i
    public final void c(byte[] bArr, int i2) {
        Object objA;
        FileChannel fileChannelC;
        h.g.b.x.f(bArr, MimeTypes.BASE_TYPE_AUDIO);
        try {
            y yVar = this;
            a aVar = this.f40490g;
            if (aVar == null || (fileChannelC = aVar.c()) == null) {
                this.f40487d.g("processAudioData called but audioSource is not initialized or is null. Make sure to call start() first.");
                objA = ab.f48028a;
            } else {
                objA = Integer.valueOf(fileChannelC.write(ByteBuffer.wrap(bArr, 0, i2)));
            }
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            e(thC);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Object objA;
        Object objA2;
        if (this.f40491h) {
            this.f40487d.a("close");
            try {
                y yVar = this;
                a aVar = this.f40490g;
                if (aVar != null) {
                    aVar.close();
                    objA = ab.f48028a;
                } else {
                    objA = null;
                }
            } catch (Throwable th) {
                objA = e.b.c.a(th);
            }
            Throwable thC = h.m.c(objA);
            if (thC != null) {
                this.f40487d.h("failed to close custom audio source", thC);
            }
            try {
                y yVar2 = this;
                this.f40485b.h();
                objA2 = ab.f48028a;
            } catch (Throwable th2) {
                objA2 = e.b.c.a(th2);
            }
            Throwable thC2 = h.m.c(objA2);
            if (thC2 != null) {
                this.f40487d.h("failed to shutdown speech recognizer", thC2);
            }
            this.f40491h = false;
        }
    }
}
