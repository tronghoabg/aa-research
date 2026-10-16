.class public final Lcom/vungle/ads/internal/downloader/g;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic a:Lcom/vungle/ads/internal/downloader/h;


# direct methods
.method public constructor <init>(Lcom/vungle/ads/internal/downloader/h;)V
    .locals 0

    iput-object p1, p0, Lcom/vungle/ads/internal/downloader/g;->a:Lcom/vungle/ads/internal/downloader/h;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/vungle/ads/internal/downloader/g;->a:Lcom/vungle/ads/internal/downloader/h;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/vungle/ads/internal/downloader/h;->b:Lcom/vungle/ads/internal/util/PathProvider;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/vungle/ads/internal/downloader/e;->a(Lcom/vungle/ads/internal/util/PathProvider;)Lokhttp3/OkHttpClient;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
