package androidx.camera.camera2.pipe;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.core.Log;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.a.r;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RequestsKt {
    public static final Map<CaptureRequest.Key<?>, Object> filterToCaptureRequestParameters(Map<Object, ? extends Object> map) {
        x.f(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Object, ? extends Object> entry : map.entrySet()) {
            if (entry.getKey() instanceof CaptureRequest.Key) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(r.a(linkedHashMap2.size()));
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            Object key = entry2.getKey();
            x.d(key, "null cannot be cast to non-null type android.hardware.camera2.CaptureRequest.Key<*>");
            linkedHashMap3.put((CaptureRequest.Key) key, entry2.getValue());
        }
        return linkedHashMap3;
    }

    public static final Map<Metadata.Key<?>, Object> filterToMetadataParameters(Map<Object, ? extends Object> map) {
        x.f(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Object, ? extends Object> entry : map.entrySet()) {
            if (entry.getKey() instanceof Metadata.Key) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(r.a(linkedHashMap2.size()));
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            Object key = entry2.getKey();
            x.d(key, "null cannot be cast to non-null type androidx.camera.camera2.pipe.Metadata.Key<*>");
            linkedHashMap3.put((Metadata.Key) key, entry2.getValue());
        }
        return linkedHashMap3;
    }

    public static final String formatForLogs(Request request) {
        x.f(request, "<this>");
        return "Request(" + request.getStreams() + ")@" + Integer.toHexString(request.hashCode());
    }

    public static final <T> T getOrDefault(Request request, CaptureRequest.Key<T> key, T t) {
        x.f(request, "<this>");
        x.f(key, "key");
        T t2 = (T) request.get(key);
        return t2 == null ? t : t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void putAllMetadata(Map<Object, Object> map, Map<?, ? extends Object> map2) {
        x.f(map, "<this>");
        x.f(map2, TtmlNode.TAG_METADATA);
        map.putAll(map2);
    }

    public static final void writeParameter(CaptureRequest.Builder builder, Object obj, Object obj2) {
        x.f(builder, "<this>");
        if (obj == null || !(obj instanceof CaptureRequest.Key)) {
            return;
        }
        try {
            builder.set((CaptureRequest.Key) obj, obj2);
        } catch (IllegalArgumentException e2) {
            IllegalArgumentException illegalArgumentException = e2;
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Failed to set [" + ((CaptureRequest.Key) obj).getName() + ": " + obj2 + "] on CaptureRequest.Builder", illegalArgumentException);
            }
        }
    }

    public static final void writeParameters(CaptureRequest.Builder builder, Map<?, ? extends Object> map) {
        x.f(builder, "<this>");
        x.f(map, "parameters");
        for (Map.Entry<?, ? extends Object> entry : map.entrySet()) {
            writeParameter(builder, entry.getKey(), entry.getValue());
        }
    }

    public static final <T> T getOrDefault(Request request, Metadata.Key<T> key, T t) {
        x.f(request, "<this>");
        x.f(key, "key");
        T t2 = (T) request.get(key);
        return t2 == null ? t : t2;
    }
}
