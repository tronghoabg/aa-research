package defpackage;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes3.dex */
final class adqx extends BidirectionalStream.Callback {
    final /* synthetic */ adrb a;
    private List b;

    public adqx(adrb adrbVar) {
        this.a = adrbVar;
    }

    private final void a(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add((String) entry.getKey());
            arrayList.add((String) entry.getValue());
        }
        byte[][] bArr = new byte[arrayList.size()][];
        for (int i = 0; i < arrayList.size(); i += 2) {
            bArr[i] = ((String) arrayList.get(i)).getBytes(StandardCharsets.UTF_8);
            int i2 = i + 1;
            bArr[i2] = ((String) arrayList.get(i2)).getBytes(StandardCharsets.UTF_8);
        }
        byte[][] bArrB = aeab.b(bArr);
        Charset charset = adkp.a;
        admc admcVar = new admc(bArrB);
        adrb adrbVar = this.a;
        int i3 = adra.i;
        adra adraVar = adrbVar.p;
        synchronized (adraVar.a) {
            if (z) {
                adraVar.p(admcVar);
            } else {
                adraVar.o(admcVar);
            }
        }
    }

    private static final adnq b(UrlResponseInfo urlResponseInfo) {
        return adue.a(urlResponseInfo.getHttpStatusCode());
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onCanceled(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        adnq adnqVarB;
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onCanceled");
        }
        adrb adrbVar = this.a;
        int i = adra.i;
        adra adraVar = adrbVar.p;
        synchronized (adraVar.a) {
            adnqVarB = adraVar.e;
            if (adnqVarB == null) {
                adnqVarB = urlResponseInfo != null ? b(urlResponseInfo) : adnq.c.e("stream cancelled without reason");
            }
        }
        this.a.r(adnqVarB);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onFailed(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onFailed");
        }
        this.a.r(adnq.m.d(cronetException));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onReadCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        List list;
        byteBuffer.flip();
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onReadCompleted. Size=" + byteBuffer.remaining());
        }
        adrb adrbVar = this.a;
        int i = adra.i;
        adra adraVar = adrbVar.p;
        synchronized (adraVar.a) {
            adraVar.f = z;
            if (byteBuffer.remaining() != 0) {
                adraVar.f(byteBuffer);
            }
        }
        if (!z || (list = this.b) == null) {
            return;
        }
        a(list, true);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onResponseHeadersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onResponseHeadersReceived. Header=".concat(String.valueOf(String.valueOf(urlResponseInfo.getAllHeadersAsList()))));
            Log.v("grpc-java-cronet", "BidirectionalStream.read");
        }
        a(urlResponseInfo.getAllHeadersAsList(), false);
        bidirectionalStream.read(ByteBuffer.allocateDirect(this.a.q));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onResponseTrailersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, UrlResponseInfo.HeaderBlock headerBlock) {
        boolean z;
        List<Map.Entry<String, String>> asList = headerBlock.getAsList();
        this.b = asList;
        int i = adra.i;
        adra adraVar = this.a.p;
        synchronized (adraVar.a) {
            z = adraVar.f;
        }
        if (z) {
            a(asList, true);
        }
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onResponseTrailersReceived. Trailer=".concat(String.valueOf(asList.toString())));
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onStreamReady(BidirectionalStream bidirectionalStream) {
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onStreamReady");
        }
        adrb adrbVar = this.a;
        int i = adra.i;
        adra adraVar = adrbVar.p;
        synchronized (adraVar.a) {
            adraVar.d();
            adraVar.c = true;
            Collection<adqy> collection = adraVar.b;
            for (adqy adqyVar : collection) {
                adraVar.h.s((ByteBuffer) adqyVar.c, adqyVar.a, adqyVar.b);
            }
            collection.clear();
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onSucceeded(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        boolean z;
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onSucceeded");
        }
        adrb adrbVar = this.a;
        int i = adra.i;
        adra adraVar = adrbVar.p;
        synchronized (adraVar.a) {
            z = false;
            if (this.b != null && adraVar.f) {
                z = true;
            }
        }
        if (!z) {
            List list = this.b;
            if (list != null) {
                a(list, true);
            } else {
                if (urlResponseInfo == null) {
                    throw new AssertionError("No response header or trailer");
                }
                a(urlResponseInfo.getAllHeadersAsList(), true);
            }
        }
        this.a.r(b(urlResponseInfo));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onWriteCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onWriteCompleted");
        }
        adrb adrbVar = this.a;
        int i = adra.i;
        adra adraVar = adrbVar.p;
        synchronized (adraVar.a) {
            if (!adraVar.g) {
                adraVar.g = true;
                adrbVar.g.a();
            }
            adraVar.h(byteBuffer.position());
        }
    }
}
