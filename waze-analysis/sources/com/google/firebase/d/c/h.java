package com.google.firebase.d.c;

import androidx.camera.video.AudioStats;
import androidx.work.WorkInfo;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class h implements com.google.firebase.d.g {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f9847a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.d.e f9848b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.firebase.d.e f9849c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.firebase.d.f f9850d;

    /* renamed from: e, reason: collision with root package name */
    private OutputStream f9851e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f9852f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f9853g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.firebase.d.f f9854h;

    /* renamed from: i, reason: collision with root package name */
    private final k f9855i = new k(this);

    static {
        com.google.firebase.d.d dVarA = com.google.firebase.d.e.a("key");
        b bVar = new b();
        bVar.b(1);
        dVarA.b(bVar.a());
        f9848b = dVarA.a();
        com.google.firebase.d.d dVarA2 = com.google.firebase.d.e.a("value");
        b bVar2 = new b();
        bVar2.b(2);
        dVarA2.b(bVar2.a());
        f9849c = dVarA2.a();
        f9850d = new g(0);
    }

    h(OutputStream outputStream, Map map, Map map2, com.google.firebase.d.f fVar) {
        this.f9851e = outputStream;
        this.f9852f = map;
        this.f9853g = map2;
        this.f9854h = fVar;
    }

    static /* synthetic */ void f(Map.Entry entry, com.google.firebase.d.g gVar) {
        gVar.d(f9848b, entry.getKey());
        gVar.d(f9849c, entry.getValue());
    }

    private static int m(com.google.firebase.d.e eVar) {
        f fVar = (f) eVar.d(f.class);
        if (fVar != null) {
            return fVar.a();
        }
        throw new com.google.firebase.d.c("Field has no @Protobuf config");
    }

    private final long n(com.google.firebase.d.f fVar, Object obj) {
        c cVar = new c();
        try {
            OutputStream outputStream = this.f9851e;
            this.f9851e = cVar;
            try {
                fVar.a(obj, this);
                this.f9851e = outputStream;
                long jA = cVar.a();
                cVar.close();
                return jA;
            } catch (Throwable th) {
                this.f9851e = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                cVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static f o(com.google.firebase.d.e eVar) {
        f fVar = (f) eVar.d(f.class);
        if (fVar != null) {
            return fVar;
        }
        throw new com.google.firebase.d.c("Field has no @Protobuf config");
    }

    private static ByteBuffer p(int i2) {
        return ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void q(int i2) throws IOException {
        while (true) {
            long j2 = i2 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
            int i3 = i2 & 127;
            OutputStream outputStream = this.f9851e;
            if (j2 == 0) {
                outputStream.write(i3);
                return;
            } else {
                outputStream.write(i3 | 128);
                i2 >>>= 7;
            }
        }
    }

    private final void r(long j2) throws IOException {
        while (true) {
            long j3 = (-128) & j2;
            int i2 = ((int) j2) & 127;
            OutputStream outputStream = this.f9851e;
            if (j3 == 0) {
                outputStream.write(i2);
                return;
            } else {
                outputStream.write(i2 | 128);
                j2 >>>= 7;
            }
        }
    }

    private final void s(com.google.firebase.d.f fVar, com.google.firebase.d.e eVar, Object obj, boolean z) throws IOException {
        long jN = n(fVar, obj);
        if (z && jN == 0) {
            return;
        }
        q((m(eVar) << 3) | 2);
        r(jN);
        fVar.a(obj, this);
    }

    private final void t(com.google.firebase.d.h hVar, com.google.firebase.d.e eVar, Object obj, boolean z) {
        k kVar = this.f9855i;
        kVar.a(eVar, z);
        hVar.a(obj, kVar);
    }

    @Override // com.google.firebase.d.g
    public final void a(com.google.firebase.d.e eVar, double d2) throws IOException {
        g(eVar, d2, true);
    }

    @Override // com.google.firebase.d.g
    public final /* bridge */ /* synthetic */ void c(com.google.firebase.d.e eVar, long j2) throws IOException {
        i(eVar, j2, true);
    }

    @Override // com.google.firebase.d.g
    public final void d(com.google.firebase.d.e eVar, Object obj) throws IOException {
        l(eVar, obj, true);
    }

    @Override // com.google.firebase.d.g
    public final /* bridge */ /* synthetic */ void e(com.google.firebase.d.e eVar, boolean z) throws IOException {
        h(eVar, z ? 1 : 0, true);
    }

    final void g(com.google.firebase.d.e eVar, double d2, boolean z) throws IOException {
        if (z && d2 == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return;
        }
        q((m(eVar) << 3) | 1);
        this.f9851e.write(p(8).putDouble(d2).array());
    }

    final void h(com.google.firebase.d.e eVar, int i2, boolean z) throws IOException {
        if (z && i2 == 0) {
            return;
        }
        f fVarO = o(eVar);
        int iOrdinal = fVarO.b().ordinal();
        if (iOrdinal == 0) {
            q(fVarO.a() << 3);
            q(i2);
        } else if (iOrdinal == 1) {
            q(fVarO.a() << 3);
            q((i2 + i2) ^ (i2 >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            q((fVarO.a() << 3) | 5);
            this.f9851e.write(p(4).putInt(i2).array());
        }
    }

    final void i(com.google.firebase.d.e eVar, long j2, boolean z) throws IOException {
        if (z && j2 == 0) {
            return;
        }
        f fVarO = o(eVar);
        int iOrdinal = fVarO.b().ordinal();
        if (iOrdinal == 0) {
            q(fVarO.a() << 3);
            r(j2);
        } else if (iOrdinal == 1) {
            q(fVarO.a() << 3);
            r((j2 >> 63) ^ (j2 + j2));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            q((fVarO.a() << 3) | 1);
            this.f9851e.write(p(8).putLong(j2).array());
        }
    }

    final void j(Object obj) {
        com.google.firebase.d.f fVar = (com.google.firebase.d.f) this.f9852f.get(obj.getClass());
        if (fVar == null) {
            throw new com.google.firebase.d.c("No encoder for ".concat(String.valueOf(String.valueOf(obj.getClass()))));
        }
        fVar.a(obj, this);
    }

    @Override // com.google.firebase.d.g
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void b(com.google.firebase.d.e eVar, int i2) throws IOException {
        h(eVar, i2, true);
    }

    final void l(com.google.firebase.d.e eVar, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            q((m(eVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f9847a);
            q(bytes.length);
            this.f9851e.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                l(eVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                s(f9850d, eVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            g(eVar, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            q((m(eVar) << 3) | 5);
            this.f9851e.write(p(4).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            i(eVar, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            h(eVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            q((m(eVar) << 3) | 2);
            q(bArr.length);
            this.f9851e.write(bArr);
            return;
        }
        com.google.firebase.d.f fVar = (com.google.firebase.d.f) this.f9852f.get(obj.getClass());
        if (fVar != null) {
            s(fVar, eVar, obj, z);
            return;
        }
        com.google.firebase.d.h hVar = (com.google.firebase.d.h) this.f9853g.get(obj.getClass());
        if (hVar != null) {
            t(hVar, eVar, obj, z);
            return;
        }
        if (obj instanceof d) {
            b(eVar, ((d) obj).a());
        } else if (obj instanceof Enum) {
            b(eVar, ((Enum) obj).ordinal());
        } else {
            s(this.f9854h, eVar, obj, z);
        }
    }
}
