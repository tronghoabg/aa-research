.class public final Lokhttp3/internal/cache2/Relay;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/cache2/Relay$RelaySource;,
        Lokhttp3/internal/cache2/Relay$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lokhttp3/internal/cache2/Relay;",
        "",
        "Companion",
        "RelaySource",
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
    .locals 2

    .line 1
    new-instance v0, Lokhttp3/internal/cache2/Relay$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lokhttp3/internal/cache2/Relay$Companion;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lcg/j;->d:Lcg/j;

    .line 8
    .line 9
    const-string v0, "OkHttp cache v1\n"

    .line 10
    .line 11
    invoke-static {v0}, Lab/b;->c(Ljava/lang/String;)Lcg/j;

    .line 12
    .line 13
    .line 14
    const-string v0, "OkHttp DIRTY :(\n"

    .line 15
    .line 16
    invoke-static {v0}, Lab/b;->c(Ljava/lang/String;)Lcg/j;

    .line 17
    .line 18
    .line 19
    return-void
.end method
