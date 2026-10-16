.class public Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/yo;


# instance fields
.field private volatile bcc:I

.field private volatile cq:J

.field private volatile cz:Z

.field private dj:Ljava/io/RandomAccessFile;

.field private ivm:J

.field private lw:Ljava/io/File;

.field private moa:Ljava/io/File;

.field private volatile oa:J

.field private uef:Z

.field private final wrv:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

.field private volatile xs:J

.field private final yo:Ljava/lang/Object;

.field private volatile zjm:Z


# direct methods
.method public constructor <init>(Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/32 v0, -0x80000000

    .line 5
    .line 6
    .line 7
    iput-wide v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->oa:J

    .line 8
    .line 9
    new-instance v0, Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->yo:Ljava/lang/Object;

    .line 15
    .line 16
    const-wide/16 v0, 0x0

    .line 17
    .line 18
    iput-wide v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->ivm:J

    .line 19
    .line 20
    const-wide/16 v0, -0x1

    .line 21
    .line 22
    iput-wide v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->xs:J

    .line 23
    .line 24
    const/16 v0, -0x64

    .line 25
    .line 26
    iput v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->bcc:I

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->cz:Z

    .line 30
    .line 31
    iput-boolean v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->zjm:Z

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    iput-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->dj:Ljava/io/RandomAccessFile;

    .line 35
    .line 36
    iput-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->wrv:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    .line 37
    .line 38
    :try_start_0
    invoke-virtual {p1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->lw()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {p1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->bs()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-static {v1, v2}, Lcom/bykv/vk/openvk/uef/uef/oa/moa/oa;->oa(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    iput-object v3, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->moa:Ljava/io/File;

    .line 51
    .line 52
    invoke-static {v1, v2}, Lcom/bykv/vk/openvk/uef/uef/oa/moa/oa;->yo(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iput-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->lw:Ljava/io/File;

    .line 57
    .line 58
    invoke-direct {p0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->moa()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_0

    .line 63
    .line 64
    new-instance v1, Ljava/io/RandomAccessFile;

    .line 65
    .line 66
    iget-object v2, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->lw:Ljava/io/File;

    .line 67
    .line 68
    const-string v3, "r"

    .line 69
    .line 70
    invoke-direct {v1, v2, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iput-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->dj:Ljava/io/RandomAccessFile;

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    new-instance v1, Ljava/io/RandomAccessFile;

    .line 77
    .line 78
    iget-object v2, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->moa:Ljava/io/File;

    .line 79
    .line 80
    const-string v3, "rw"

    .line 81
    .line 82
    invoke-direct {v1, v2, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    iput-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->dj:Ljava/io/RandomAccessFile;

    .line 86
    .line 87
    :goto_0
    invoke-direct {p0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->moa()Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-nez v1, :cond_1

    .line 92
    .line 93
    iget-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->moa:Ljava/io/File;

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 96
    .line 97
    .line 98
    move-result-wide v1

    .line 99
    iput-wide v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->ivm:J

    .line 100
    .line 101
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->uef()V

    .line 102
    .line 103
    .line 104
    :cond_1
    invoke-static {}, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->ivm()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    const/4 v2, 0x2

    .line 109
    if-ne v1, v2, :cond_2

    .line 110
    .line 111
    const/4 v0, 0x1

    .line 112
    :cond_2
    iput-boolean v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->uef:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    .line 114
    return-void

    .line 115
    :catchall_0
    invoke-virtual {p1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->ab()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public static synthetic bcc(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->uef:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic cz(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)Ljava/io/File;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->moa:Ljava/io/File;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic ivm(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->yo:Ljava/lang/Object;

    return-object p0
.end method

.method private ivm()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->yo:Ljava/lang/Object;

    monitor-enter v0

    .line 3
    :try_start_0
    invoke-direct {p0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->moa()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    iget-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->wrv:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    invoke-virtual {v1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->ab()Ljava/lang/String;

    iget-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->wrv:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    invoke-virtual {v1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->bs()Ljava/lang/String;

    .line 5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_3

    .line 6
    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->moa:Ljava/io/File;

    iget-object v2, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->lw:Ljava/io/File;

    invoke-virtual {v1, v2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 7
    iget-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->dj:Ljava/io/RandomAccessFile;

    if-eqz v1, :cond_1

    .line 8
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    goto :goto_0

    :catchall_1
    move-exception v1

    goto :goto_1

    .line 9
    :cond_1
    :goto_0
    new-instance v1, Ljava/io/RandomAccessFile;

    iget-object v2, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->lw:Ljava/io/File;

    const-string v3, "rw"

    invoke-direct {v1, v2, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->dj:Ljava/io/RandomAccessFile;

    .line 10
    iget-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->wrv:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    invoke-virtual {v1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->bs()Ljava/lang/String;

    iget-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->wrv:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    invoke-virtual {v1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->ab()Ljava/lang/String;

    goto :goto_2

    .line 11
    :cond_2
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error renaming file "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->moa:Ljava/io/File;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->lw:Ljava/io/File;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " for completion!"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 12
    :goto_1
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 13
    :goto_2
    :try_start_3
    monitor-exit v0

    return-void

    :catchall_2
    move-exception v1

    .line 14
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 15
    :goto_3
    monitor-exit v0

    throw v1
.end method

.method private lw()J
    .locals 2

    .line 2
    invoke-direct {p0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->moa()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->lw:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    return-wide v0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->moa:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic lw(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->cq:J

    return-wide v0
.end method

.method public static synthetic moa(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->wrv:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    return-object p0
.end method

.method private moa()Z
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->lw:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    return v0
.end method

.method public static synthetic oa(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->ivm:J

    return-wide v0
.end method

.method public static synthetic uef(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->oa:J

    return-wide p1
.end method

.method private uef(ILjava/lang/String;)V
    .locals 4

    const/4 v0, 0x0

    .line 26
    iput-boolean v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->zjm:Z

    .line 27
    iput p1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->bcc:I

    .line 28
    iget-wide v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->xs:J

    iput-wide v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->oa:J

    .line 29
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "handleFailResponse: "

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v2, v3, v0

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const-string v0, " "

    const/4 v1, 0x2

    aput-object v0, v3, v1

    const/4 v0, 0x3

    aput-object p2, v3, v0

    const-string v0, "CSJ_MediaDLPlay"

    invoke-static {v0, v3}, Lcom/bytedance/sdk/component/utils/dhk;->oa(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    iget-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->wrv:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->uef()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 31
    iget-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->wrv:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    invoke-virtual {v1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->yo()Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 32
    :try_start_0
    const-string v3, "error_real_code"

    invoke-virtual {v1, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 33
    const-string p1, "error_real_msg"

    invoke-virtual {v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 34
    invoke-static {v0, v2, p1}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static synthetic uef(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;ILjava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->uef(ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic uef(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)Z
    .locals 0

    .line 3
    iget-boolean p0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->zjm:Z

    return p0
.end method

.method public static synthetic uef(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;Z)Z
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->zjm:Z

    return p1
.end method

.method public static synthetic xs(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)Ljava/io/RandomAccessFile;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->dj:Ljava/io/RandomAccessFile;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic yo(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->oa:J

    return-wide v0
.end method

.method public static synthetic zjm(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->ivm()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public oa()V
    .locals 3

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->cz:Z

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->dj:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->moa:Ljava/io/File;

    if-eqz v0, :cond_1

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/io/File;->setLastModified(J)Z

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->lw:Ljava/io/File;

    if-eqz v0, :cond_2

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/io/File;->setLastModified(J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_2
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->cz:Z

    return-void
.end method

.method public uef(J[BII)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 35
    :try_start_0
    iget-wide v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->oa:J

    cmp-long v0, p1, v0

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    move v2, v0

    .line 36
    :goto_0
    iget-boolean v3, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->cz:Z

    if-nez v3, :cond_6

    .line 37
    iget-object v3, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->yo:Ljava/lang/Object;

    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 38
    :try_start_1
    invoke-direct {p0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->lw()J

    move-result-wide v4

    cmp-long v4, p1, v4

    if-gez v4, :cond_1

    .line 39
    iget-object v2, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->dj:Ljava/io/RandomAccessFile;

    invoke-virtual {v2, p1, p2}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 40
    iget-object v2, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->dj:Ljava/io/RandomAccessFile;

    invoke-virtual {v2, p3, p4, p5}, Ljava/io/RandomAccessFile;->read([BII)I

    move-result v2

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    add-int/lit8 v0, v0, 0x21

    .line 41
    iput-wide p1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->cq:J

    .line 42
    iget-object v4, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->yo:Ljava/lang/Object;

    const-wide/16 v5, 0x21

    invoke-virtual {v4, v5, v6}, Ljava/lang/Object;->wait(J)V

    const-wide/16 v4, -0x1

    .line 43
    iput-wide v4, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->cq:J

    .line 44
    :goto_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-lez v2, :cond_2

    return v2

    .line 45
    :cond_2
    :try_start_2
    iget-object v3, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->wrv:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->uef()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 46
    iget v3, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->bcc:I

    const/16 v4, -0x64

    if-eq v3, v4, :cond_4

    iget-boolean v3, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->zjm:Z

    if-eqz v3, :cond_3

    iget-wide v3, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->oa:J

    iget-wide v5, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->xs:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_3

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_4

    .line 47
    :cond_3
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    throw p1

    :cond_4
    :goto_2
    const/16 v3, 0x4e20

    if-ge v0, v3, :cond_5

    goto :goto_0

    .line 48
    :cond_5
    new-instance p1, Ljava/net/SocketTimeoutException;

    invoke-direct {p1}, Ljava/net/SocketTimeoutException;-><init>()V

    throw p1

    .line 49
    :goto_3
    monitor-exit v3

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_6
    return v1

    .line 50
    :goto_4
    instance-of p2, p1, Ljava/io/IOException;

    if-eqz p2, :cond_7

    .line 51
    check-cast p1, Ljava/io/IOException;

    throw p1

    .line 52
    :cond_7
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    throw p1
.end method

.method public uef()V
    .locals 6

    .line 5
    invoke-static {}, Lcom/bykv/vk/openvk/uef/uef/uef/yo;->yo()Lcom/bytedance/sdk/component/oa/uef/dj;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 6
    invoke-static {}, Lcom/bykv/vk/openvk/uef/uef/uef/yo;->yo()Lcom/bytedance/sdk/component/oa/uef/dj;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dj;->yo()Lcom/bytedance/sdk/component/oa/uef/dj$uef;

    move-result-object v0

    goto :goto_0

    .line 7
    :cond_0
    new-instance v0, Lcom/bytedance/sdk/component/oa/uef/dj$uef;

    const-string v1, "v_cache"

    invoke-direct {v0, v1}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;-><init>(Ljava/lang/String;)V

    .line 8
    :goto_0
    iget-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->wrv:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    invoke-virtual {v1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->oib()I

    move-result v1

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->uef(JLjava/util/concurrent/TimeUnit;)Lcom/bytedance/sdk/component/oa/uef/dj$uef;

    move-result-object v1

    iget-object v2, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->wrv:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    .line 9
    invoke-virtual {v2}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->dhk()I

    move-result v2

    int-to-long v4, v2

    invoke-virtual {v1, v4, v5, v3}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->oa(JLjava/util/concurrent/TimeUnit;)Lcom/bytedance/sdk/component/oa/uef/dj$uef;

    move-result-object v1

    iget-object v2, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->wrv:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    .line 10
    invoke-virtual {v2}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->tpx()I

    move-result v2

    int-to-long v4, v2

    invoke-virtual {v1, v4, v5, v3}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->yo(JLjava/util/concurrent/TimeUnit;)Lcom/bytedance/sdk/component/oa/uef/dj$uef;

    .line 11
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->uef()Lcom/bytedance/sdk/component/oa/uef/dj;

    move-result-object v0

    .line 12
    iget-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->wrv:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    invoke-virtual {v1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->bs()Ljava/lang/String;

    .line 13
    new-instance v1, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    invoke-direct {v1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;-><init>()V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "bytes="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v3, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->ivm:J

    const-string v5, "-"

    .line 14
    invoke-static {v2, v3, v4, v5}, LVa/M6;->s(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 15
    const-string v3, "RANGE"

    invoke-virtual {v1, v3, v2}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object v1

    iget-object v2, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->wrv:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    .line 16
    invoke-virtual {v2}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->ab()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef()Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object v1

    const-string v2, "videoLoadWhenPlaying"

    .line 18
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object v1

    const/16 v2, 0x9

    .line 19
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(I)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object v1

    .line 20
    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa()Lcom/bytedance/sdk/component/oa/uef/wrv;

    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/oa/uef/dj;->uef(Lcom/bytedance/sdk/component/oa/uef/wrv;)Lcom/bytedance/sdk/component/oa/uef/oa;

    move-result-object v0

    .line 22
    new-instance v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;

    invoke-direct {v1, p0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;-><init>(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)V

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/component/oa/uef/oa;->uef(Lcom/bytedance/sdk/component/oa/uef/yo;)V

    return-void
.end method

.method public yo()J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->moa()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->lw:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->oa:J

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->yo:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 5
    :cond_1
    :try_start_0
    iget-wide v2, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->oa:J

    const-wide/32 v4, -0x80000000

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-boolean v2, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->cz:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_2

    add-int/lit8 v1, v1, 0xf

    .line 6
    :try_start_1
    iget-object v2, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->yo:Ljava/lang/Object;

    const-wide/16 v3, 0x5

    invoke-virtual {v2, v3, v4}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/16 v2, 0x4e20

    if-le v1, v2, :cond_1

    const-wide/16 v1, -0x1

    .line 7
    :try_start_2
    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 8
    :catch_0
    new-instance v1, Ljava/io/IOException;

    const-string v2, "total length InterruptException"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 9
    :cond_2
    monitor-exit v0

    .line 10
    :goto_0
    iget-wide v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->oa:J

    return-wide v0

    .line 11
    :goto_1
    monitor-exit v0

    throw v1
.end method
