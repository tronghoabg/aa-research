package androidx.fragment.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import be.EnumC1525a;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.unity3d.services.core.device.MimeTypes;
import ge.InterfaceC2753a;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3340k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import uc.C4278o;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;
import za.C4658a;

/* loaded from: classes.dex */
public final class X implements b2.p, com.google.android.libraries.vision.visionkit.pipeline.alt.a, d2.t, InterfaceC2753a, l2.m, o2.n, r9.w, InterfaceC4279p, L8.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18347a;

    public /* synthetic */ X(int i5) {
        this.f18347a = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    public static Object j(String str) throws be.b {
        try {
            try {
                try {
                    str = Fe.g.L(new JSONArray(str));
                    return str;
                } catch (JSONException e7) {
                    throw new be.b(EnumC1525a.f19463f, "Failed to parse json array", e7);
                }
            } catch (JSONException unused) {
                return Fe.g.M(new JSONObject(str));
            }
        } catch (JSONException e10) {
            throw new be.b(EnumC1525a.f19463f, "Failed to parse json object", e10);
        }
    }

    @Override // b2.p
    public o2.o D() {
        return new b2.o(b2.l.f19220n, null);
    }

    @Override // b2.p
    public o2.o N(b2.l lVar, b2.i iVar) {
        return new b2.o(lVar, iVar);
    }

    @Override // d2.t
    public MediaCodecInfo b(int i5) {
        return MediaCodecList.getCodecInfoAt(i5);
    }

    @Override // d2.t
    public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && MimeTypes.VIDEO_H264.equals(str2);
    }

    @Override // d2.t
    public boolean d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // d2.t
    public int e() {
        return MediaCodecList.getCodecCount();
    }

    @Override // l2.m
    public long f() {
        throw new NoSuchElementException();
    }

    @Override // d2.t
    public boolean g() {
        return false;
    }

    @Override // l2.m
    public long h() {
        throw new NoSuchElementException();
    }

    @Override // ge.InterfaceC2753a
    public Object i(Map map) {
        Object next;
        ae.e eVar;
        Object next2;
        String strG = Fe.e.G("type", map);
        ae.e.f17637b.getClass();
        LinkedHashMap linkedHashMap = null;
        if (AbstractC3340k.a(strG, "makePurchase")) {
            eVar = ae.e.f17642g;
        } else {
            Iterator<E> it = ae.e.f17646l.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ae.e) next).f17647a.equals(strG)) {
                    break;
                }
            }
            eVar = (ae.e) next;
            if (eVar == null) {
                eVar = ae.e.f17638c;
            }
        }
        if (map.containsKey("parameters")) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Object obj = map.get("parameters");
            Map map2 = obj instanceof Map ? (Map) obj : null;
            if (map2 != null) {
                for (Map.Entry entry : map2.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (!(key instanceof String)) {
                        key = null;
                    }
                    if (key != null) {
                        String str = (String) key;
                        ae.c.f17627b.getClass();
                        Iterator<E> it2 = ae.c.f17634i.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                            if (((ae.c) next2).f17635a.equals(str)) {
                                break;
                            }
                        }
                        ae.c cVar = (ae.c) next2;
                        if (cVar != null && value != null) {
                            linkedHashMap2.put(cVar, value);
                        }
                    }
                }
            }
            linkedHashMap = linkedHashMap2;
        }
        return new ae.f(eVar, linkedHashMap);
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public long initialize(byte[] bArr, long j8, long j10, long j11, long j12, long j13) {
        return 1L;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public long initializeFrameBufferReleaseCallback(long j8) {
        return 1L;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public long initializeFrameManager() {
        return 1L;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public long initializeIsolationCallback() {
        return 1L;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public long initializeResultsCallback() {
        return 1L;
    }

    @Override // l2.m
    public boolean next() {
        return false;
    }

    @Override // L8.e
    public Object o(C6.l lVar) {
        switch (this.f18347a) {
            case 14:
                return new C4658a(0);
            case 15:
                return AnalyticsConnectorRegistrar.lambda$getComponents$0(lVar);
            default:
                return new ya.k((Context) lVar.a(Context.class));
        }
    }

    @Override // uc.InterfaceC4279p
    public void onMethodCall(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        ((tc.g) interfaceC4280q).a(null);
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public byte[] process(long j8, long j10, long j11, byte[] bArr, int i5, int i10, int i11, int i12) {
        return H7.E.a().zbl();
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public byte[] processBitmap(long j8, long j10, Bitmap bitmap, int i5, int i10, int i11, int i12) {
        return H7.E.a().zbl();
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public byte[] processYuvFrame(long j8, long j10, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i5, int i10, int i11, int i12, int i13, int i14) {
        return H7.E.a().zbl();
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public boolean stop(long j8) {
        return true;
    }

    @Override // o2.n
    public void a() {
    }

    @Override // r9.w
    public void run() {
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public void zba() {
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public void start(long j8) {
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public void waitUntilIdle(long j8) {
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public void close(long j8, long j10, long j11, long j12, long j13) {
    }
}
