package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetEngine;

/* loaded from: classes3.dex */
final class adqz implements adrg {
    final /* synthetic */ adrb a;

    public adqz(adrb adrbVar) {
        this.a = adrbVar;
    }

    @Override // defpackage.adrg
    public final void a(adnq adnqVar) {
        int i = adra.i;
        adrb adrbVar = this.a;
        adra adraVar = adrbVar.p;
        synchronized (adraVar.a) {
            if (adraVar.d) {
                return;
            }
            adraVar.d = true;
            adraVar.e = adnqVar;
            Collection collection = adraVar.b;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((ByteBuffer) ((adqy) it.next()).c).clear();
            }
            collection.clear();
            BidirectionalStream bidirectionalStream = adrbVar.l;
            if (bidirectionalStream != null) {
                bidirectionalStream.cancel();
            } else {
                adrbVar.j.a(adrbVar, adnqVar);
            }
        }
    }

    @Override // defpackage.adrg
    public final void b(aeag aeagVar, boolean z, boolean z2, int i) {
        ByteBuffer byteBuffer;
        int i2 = adra.i;
        adrb adrbVar = this.a;
        adra adraVar = adrbVar.p;
        synchronized (adraVar.a) {
            if (adraVar.d) {
                return;
            }
            if (aeagVar != null) {
                byteBuffer = ((adre) aeagVar).a;
                byteBuffer.flip();
            } else {
                byteBuffer = adrb.a;
            }
            adrbVar.w(byteBuffer.remaining());
            if (adraVar.c) {
                adrbVar.s(byteBuffer, z, z2);
            } else {
                adraVar.b.add(new adqy(byteBuffer, z, z2));
            }
        }
    }

    @Override // defpackage.adrg
    public final void c(admc admcVar) {
        adrb adrbVar = this.a;
        adrbVar.k.run();
        sm smVar = adrbVar.r;
        if (smVar == null) {
            return;
        }
        adqx adqxVar = new adqx(adrbVar);
        BidirectionalStream.Builder builderNewBidirectionalStreamBuilder = ((CronetEngine) smVar.a).newBidirectionalStreamBuilder(adrbVar.e, adqxVar, adrbVar.h);
        if (adrbVar.m) {
            builderNewBidirectionalStreamBuilder.delayRequestHeadersUntilFirstFlush(true);
        }
        Object obj = adrbVar.n;
        if (obj != null || adrbVar.o != null) {
            if (obj != null) {
                builderNewBidirectionalStreamBuilder.addRequestAnnotation(obj);
            }
            Collection collection = adrbVar.o;
            if (collection != null) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    builderNewBidirectionalStreamBuilder.addRequestAnnotation(it.next());
                }
            }
        }
        String str = adue.j.a;
        builderNewBidirectionalStreamBuilder.addHeader(str, adrbVar.f);
        String str2 = adue.h.a;
        builderNewBidirectionalStreamBuilder.addHeader(str2, "application/grpc");
        builderNewBidirectionalStreamBuilder.addHeader("te", "trailers");
        byte[][] bArrA = aeab.a(adrbVar.i);
        for (int i = 0; i < bArrA.length; i += 2) {
            String str3 = new String(bArrA[i], StandardCharsets.UTF_8);
            if (!str2.equalsIgnoreCase(str3) && !str.equalsIgnoreCase(str3) && !adue.i.a.equalsIgnoreCase(str3)) {
                builderNewBidirectionalStreamBuilder.addHeader(str3, new String(bArrA[i + 1], StandardCharsets.UTF_8));
            }
        }
        adrbVar.l = builderNewBidirectionalStreamBuilder.build();
        adrbVar.l.start();
    }
}
