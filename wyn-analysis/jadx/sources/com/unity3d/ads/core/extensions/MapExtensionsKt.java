package com.unity3d.ads.core.extensions;

import Bf.a;
import com.applovin.shadow.okio.Segment;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"sizeInKb", "", "", "", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MapExtensionsKt {
    public static final int sizeInKb(@NotNull Map<String, String> map) {
        AbstractC3340k.e(map, "<this>");
        Iterator<T> it = map.entrySet().iterator();
        int length = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Charset charset = a.f1670a;
            byte[] bytes = str.getBytes(charset);
            AbstractC3340k.d(bytes, "this as java.lang.String).getBytes(charset)");
            int length2 = bytes.length;
            byte[] bytes2 = str2.getBytes(charset);
            AbstractC3340k.d(bytes2, "this as java.lang.String).getBytes(charset)");
            length += length2 + bytes2.length;
        }
        return length / Segment.SHARE_MINIMUM;
    }
}
