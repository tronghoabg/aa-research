package com.waze.network;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.v.eu;
import com.waze.jni.protos.network.MessageRequestMetadata;
import com.waze.jni.protos.network.ResultStructMessage;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class af {
    public static final int $stable = 0;

    protected final void AbortTransactionsByQueueJNI(int i2) {
        ((NetworkManager) this).AbortTransactionsByQueue(i2);
    }

    protected final void AbortTransactionsJNI(int[] iArr) {
        ((NetworkManager) this).AbortTransactions(iArr);
    }

    protected final boolean HTTPGetJNI(String str, long j2, long j3) {
        return ((NetworkManager) this).HTTPGet(str, j2, j3);
    }

    protected final boolean HTTPPostFileJNI(String str, String str2, String str3, long j2) {
        return ((NetworkManager) this).HTTPPostFile(str, str2, str3, j2);
    }

    protected final boolean HTTPPostJNI(String str, String str2, byte[] bArr, long j2) {
        return ((NetworkManager) this).HTTPPost(str, str2, bArr, j2);
    }

    protected final void SendMessageJNI(byte[] bArr, byte[] bArr2) {
        h.g.b.x.f(bArr, TtmlNode.TAG_METADATA);
        try {
            ((NetworkManager) this).SendMessage((MessageRequestMetadata) MessageRequestMetadata.parser().c(bArr), bArr2);
        } catch (eu unused) {
        }
    }

    protected final Object newResultStructJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "message");
        try {
            return ((NetworkManager) this).newResultStruct((ResultStructMessage) ResultStructMessage.parser().c(bArr));
        } catch (eu unused) {
            return null;
        }
    }
}
