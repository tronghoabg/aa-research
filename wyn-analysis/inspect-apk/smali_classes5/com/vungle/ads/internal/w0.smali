.class public final Lcom/vungle/ads/internal/w0;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# static fields
.field public static final a:Lcom/vungle/ads/internal/w0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/vungle/ads/internal/w0;

    invoke-direct {v0}, Lcom/vungle/ads/internal/w0;-><init>()V

    sput-object v0, Lcom/vungle/ads/internal/w0;->a:Lcom/vungle/ads/internal/w0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lcom/vungle/ads/internal/v0;->a:Lcom/vungle/ads/internal/v0;

    .line 2
    .line 3
    invoke-static {v0}, LFe/e;->a(Ltf/l;)LXf/o;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
