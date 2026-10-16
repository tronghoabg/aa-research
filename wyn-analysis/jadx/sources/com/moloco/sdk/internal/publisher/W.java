package com.moloco.sdk.internal.publisher;

import android.util.Base64;
import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class W extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.X f28971a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28972b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(androidx.fragment.app.X x5, String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28971a = x5;
        this.f28972b = str;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new W(this.f28971a, this.f28972b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((W) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws IOException {
        String string;
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, "Base64GzippedBidProcessor", "Starting bid response pre-process with base64 decode and gunzip", false, 4, null);
        String str = this.f28972b;
        this.f28971a.getClass();
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            AbstractC3340k.d(bArrDecode, "decode(...)");
            MolocoLogger.debug$default(molocoLogger, "Base64GzippedBidProcessor", "Base64 decoded bidresponse: " + bArrDecode, false, 4, null);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrDecode);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 2048);
            StringBuilder sb2 = new StringBuilder();
            byte[] bArr = new byte[2048];
            while (true) {
                try {
                    try {
                        int i5 = gZIPInputStream.read(bArr);
                        if (i5 == -1) {
                            break;
                        }
                        sb2.append(new String(bArr, 0, i5, Bf.a.f1670a));
                    } catch (Exception unused) {
                        MolocoLogger.warn$default(MolocoLogger.INSTANCE, "Base64GzippedBidProcessor", "Failed to unzip bidresponse, perhaps a non-gzipped response", null, false, 12, null);
                        byteArrayInputStream.close();
                        gZIPInputStream.close();
                        string = null;
                        MolocoLogger.debug$default(molocoLogger, "Base64GzippedBidProcessor", R8.v.f("Processed bidresponse: ", string), false, 4, null);
                        return string;
                    }
                } catch (Throwable th) {
                    byteArrayInputStream.close();
                    gZIPInputStream.close();
                    throw th;
                }
            }
            byteArrayInputStream.close();
            gZIPInputStream.close();
            string = sb2.toString();
        } catch (Exception unused2) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "Base64GzippedBidProcessor", "Failed to base64 decode bidresponse, perhpas a non-base64 encoded response", null, false, 12, null);
            string = null;
            MolocoLogger.debug$default(molocoLogger, "Base64GzippedBidProcessor", R8.v.f("Processed bidresponse: ", string), false, 4, null);
            return string;
        }
        MolocoLogger.debug$default(molocoLogger, "Base64GzippedBidProcessor", R8.v.f("Processed bidresponse: ", string), false, 4, null);
        return string;
    }
}
