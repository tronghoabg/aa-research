.class public Lorg/apache/tika/exception/TikaMemoryLimitException;
.super Lorg/apache/tika/exception/TikaException;
.source "SourceFile"


# direct methods
.method public constructor <init>(JJ)V
    .locals 0

    .line 2
    invoke-static {p1, p2, p3, p4}, Lorg/apache/tika/exception/TikaMemoryLimitException;->msg(JJ)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/tika/exception/TikaException;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method private static msg(JJ)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "Tried to allocate "

    .line 2
    .line 3
    const-string v1, " bytes, but "

    .line 4
    .line 5
    invoke-static {p0, p1, v0, v1}, LVa/M6;->u(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string p1, " is the maximum allowed. Please open an issue https://issues.apache.org/jira/projects/TIKA if you believe this file is not corrupt."

    .line 10
    .line 11
    invoke-static {p0, p2, p3, p1}, LVa/M6;->s(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
