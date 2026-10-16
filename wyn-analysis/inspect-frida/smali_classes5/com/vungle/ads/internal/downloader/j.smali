.class public final enum Lcom/vungle/ads/internal/downloader/j;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:Lcom/vungle/ads/internal/downloader/j;

.field public static final enum c:Lcom/vungle/ads/internal/downloader/j;

.field public static final synthetic d:[Lcom/vungle/ads/internal/downloader/j;


# instance fields
.field public final a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lcom/vungle/ads/internal/downloader/j;

    .line 2
    .line 3
    const v1, -0x7fffffff

    .line 4
    .line 5
    .line 6
    const-string v2, "CRITICAL"

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v0, v2, v3, v1}, Lcom/vungle/ads/internal/downloader/j;-><init>(Ljava/lang/String;II)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lcom/vungle/ads/internal/downloader/j;->b:Lcom/vungle/ads/internal/downloader/j;

    .line 13
    .line 14
    new-instance v1, Lcom/vungle/ads/internal/downloader/j;

    .line 15
    .line 16
    const-string v2, "HIGHEST"

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    invoke-direct {v1, v2, v4, v3}, Lcom/vungle/ads/internal/downloader/j;-><init>(Ljava/lang/String;II)V

    .line 20
    .line 21
    .line 22
    sput-object v1, Lcom/vungle/ads/internal/downloader/j;->c:Lcom/vungle/ads/internal/downloader/j;

    .line 23
    .line 24
    new-instance v2, Lcom/vungle/ads/internal/downloader/j;

    .line 25
    .line 26
    const-string v5, "HIGH"

    .line 27
    .line 28
    const/4 v6, 0x2

    .line 29
    invoke-direct {v2, v5, v6, v4}, Lcom/vungle/ads/internal/downloader/j;-><init>(Ljava/lang/String;II)V

    .line 30
    .line 31
    .line 32
    new-instance v5, Lcom/vungle/ads/internal/downloader/j;

    .line 33
    .line 34
    const/4 v7, 0x3

    .line 35
    const v8, 0x7fffffff

    .line 36
    .line 37
    .line 38
    const-string v9, "LOWEST"

    .line 39
    .line 40
    invoke-direct {v5, v9, v7, v8}, Lcom/vungle/ads/internal/downloader/j;-><init>(Ljava/lang/String;II)V

    .line 41
    .line 42
    .line 43
    const/4 v8, 0x4

    .line 44
    new-array v8, v8, [Lcom/vungle/ads/internal/downloader/j;

    .line 45
    .line 46
    aput-object v0, v8, v3

    .line 47
    .line 48
    aput-object v1, v8, v4

    .line 49
    .line 50
    aput-object v2, v8, v6

    .line 51
    .line 52
    aput-object v5, v8, v7

    .line 53
    .line 54
    sput-object v8, Lcom/vungle/ads/internal/downloader/j;->d:[Lcom/vungle/ads/internal/downloader/j;

    .line 55
    .line 56
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/vungle/ads/internal/downloader/j;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/vungle/ads/internal/downloader/j;
    .locals 1

    const-class v0, Lcom/vungle/ads/internal/downloader/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/vungle/ads/internal/downloader/j;

    return-object p0
.end method

.method public static values()[Lcom/vungle/ads/internal/downloader/j;
    .locals 1

    sget-object v0, Lcom/vungle/ads/internal/downloader/j;->d:[Lcom/vungle/ads/internal/downloader/j;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/vungle/ads/internal/downloader/j;

    return-object v0
.end method
