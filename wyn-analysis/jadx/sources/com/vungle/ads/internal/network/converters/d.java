package com.vungle.ads.internal.network.converters;

import Fe.e;
import Yf.C;
import Yf.C1302h;
import Yf.D;
import Yf.I;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.moloco.sdk.internal.publisher.H;
import com.vungle.ads.internal.network.j;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
public final class d implements a {

    /* renamed from: b, reason: collision with root package name */
    public static final Xf.c f33395b = e.a(c.f33394a);

    /* renamed from: a, reason: collision with root package name */
    public final KType f33396a;

    public d(KType kType) {
        AbstractC3340k.e(kType, "kType");
        this.f33396a = kType;
    }

    @Override // com.vungle.ads.internal.network.converters.a
    public final Object a(j jVar) throws IOException {
        try {
            InputStream inputStreamByteStream = jVar.byteStream();
            if (inputStreamByteStream == null) {
                jVar.close();
                return null;
            }
            Xf.c cVar = f33395b;
            KSerializer kSerializerN0 = H.n0(Xf.c.f16251d.f16253b, this.f33396a);
            AbstractC3340k.e(cVar, "<this>");
            xa.d dVar = new xa.d(inputStreamByteStream);
            try {
                C c10 = new C(dVar, C1302h.f16858c.f(Http2.INITIAL_MAX_FRAME_SIZE));
                try {
                    Object objZ = new D(cVar, I.f16834c, c10, kSerializerN0.getDescriptor()).z(kSerializerN0);
                    c10.p();
                    jVar.close();
                    return objZ;
                } finally {
                    c10.J();
                }
            } finally {
                dVar.C();
            }
        } finally {
        }
    }
}
