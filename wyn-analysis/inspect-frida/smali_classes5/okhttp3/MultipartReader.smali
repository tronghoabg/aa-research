.class public final Lokhttp3/MultipartReader;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/MultipartReader$PartSource;,
        Lokhttp3/MultipartReader$Part;,
        Lokhttp3/MultipartReader$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lokhttp3/MultipartReader;",
        "Ljava/io/Closeable;",
        "Companion",
        "Part",
        "PartSource",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lokhttp3/MultipartReader$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lokhttp3/MultipartReader$Companion;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lcg/j;->d:Lcg/j;

    .line 8
    .line 9
    const-string v0, "\r\n"

    .line 10
    .line 11
    invoke-static {v0}, Lab/b;->c(Ljava/lang/String;)Lcg/j;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v2, "--"

    .line 16
    .line 17
    invoke-static {v2}, Lab/b;->c(Ljava/lang/String;)Lcg/j;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const-string v3, " "

    .line 22
    .line 23
    invoke-static {v3}, Lab/b;->c(Ljava/lang/String;)Lcg/j;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const-string v4, "\t"

    .line 28
    .line 29
    invoke-static {v4}, Lab/b;->c(Ljava/lang/String;)Lcg/j;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    const/4 v5, 0x4

    .line 34
    new-array v5, v5, [Lcg/j;

    .line 35
    .line 36
    aput-object v0, v5, v1

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    aput-object v2, v5, v0

    .line 40
    .line 41
    const/4 v0, 0x2

    .line 42
    aput-object v3, v5, v0

    .line 43
    .line 44
    const/4 v0, 0x3

    .line 45
    aput-object v4, v5, v0

    .line 46
    .line 47
    invoke-static {v5}, Lcg/b;->h([Lcg/j;)Lcg/x;

    .line 48
    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method
