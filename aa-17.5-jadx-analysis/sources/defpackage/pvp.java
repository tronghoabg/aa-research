package defpackage;

/* loaded from: classes2.dex */
public final class pvp {
    public static final qbv a;
    public static final qbv b;

    static {
        new qbr("NetworkSentGmmAllBytes", qbt.aM);
        new qbr("NetworkSentGmmAllMessages", qbt.aM);
        new qbr("NetworkSentGmmCompressedBytes", qbt.aM);
        new qbr("NetworkSentGmmCompressedMessages", qbt.aM);
        new qbr("NetworkSentGmmVersionHeaderBytes", qbt.aM);
        new qbr("NetworkSentGmmVersionHeaderMessages", qbt.aM);
        qbt qbtVar = qbt.aM;
        int i = qbj.a;
        new qbv("NetworkLatency", qbtVar, null);
        new qbv("NetworkSentHttpBytes", qbt.aM, null);
        new qbv("NetworkReceivedHttpBytes", qbt.aM, null);
        new qbv("NetworkSentProtoBytes", qbt.aM, null);
        new qbv("NetworkReceivedProtoBytes", qbt.aM, null);
        new qbv("NetworkReceivedBytesPerSecond", qbt.aM, null);
        qbt qbtVar2 = qbt.aM;
        sid sidVar = sio.a;
        new qbv("NetworkReceivedBytesPerSession", qbtVar2, null);
        new qbv("NetworkSentBytesPerSession", qbt.aM, null);
        new qbv("NetworkProtosPerSession", qbt.aM, null);
        new qbv("NetworkHttpPerSession", qbt.aM, null);
        new qbv("NetworkSentBytesPerSecondDuringSession", qbt.aM, null);
        new qbv("NetworkReceivedBytesPerSecondDuringSession", qbt.aM, null);
        a = new qbv("TotalRequestSizeBytesCompressed", qbt.aM, null);
        b = new qbv("TotalResponseSizeBytesCompressed", qbt.aM, null);
    }
}
