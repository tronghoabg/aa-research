.class public final Lcom/vungle/ads/internal/presenter/l;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic a:Lcom/vungle/ads/internal/presenter/r;

.field public final synthetic b:J

.field public final synthetic c:J


# direct methods
.method public constructor <init>(Lcom/vungle/ads/internal/presenter/r;JJ)V
    .locals 0

    iput-object p1, p0, Lcom/vungle/ads/internal/presenter/l;->a:Lcom/vungle/ads/internal/presenter/r;

    iput-wide p2, p0, Lcom/vungle/ads/internal/presenter/l;->b:J

    iput-wide p4, p0, Lcom/vungle/ads/internal/presenter/l;->c:J

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/vungle/ads/internal/presenter/l;->a:Lcom/vungle/ads/internal/presenter/r;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/vungle/ads/internal/presenter/r;->d:Lcom/vungle/ads/internal/ui/z;

    .line 4
    .line 5
    iget-wide v1, p0, Lcom/vungle/ads/internal/presenter/l;->b:J

    .line 6
    .line 7
    iget-wide v3, p0, Lcom/vungle/ads/internal/presenter/l;->c:J

    .line 8
    .line 9
    iget-object v5, v0, Lcom/vungle/ads/internal/ui/z;->m:Landroid/webkit/WebView;

    .line 10
    .line 11
    if-eqz v5, :cond_0

    .line 12
    .line 13
    new-instance v6, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v7, "window.vungle.mraidBridgeExt.notifyAvailableDiskSpace("

    .line 16
    .line 17
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v6, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/16 v1, 0x2d

    .line 24
    .line 25
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const/16 v1, 0x29

    .line 29
    .line 30
    invoke-static {v6, v3, v4, v1}, LA/f;->e(Ljava/lang/StringBuilder;JC)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v5, v1}, Lcom/vungle/ads/internal/ui/z;->a(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    sget-object v0, Lef/C;->a:Lef/C;

    .line 38
    .line 39
    return-object v0
.end method
