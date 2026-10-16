.class public final Lcom/vungle/ads/internal/bidding/d;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# static fields
.field public static final a:Lcom/vungle/ads/internal/bidding/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/vungle/ads/internal/bidding/d;

    invoke-direct {v0}, Lcom/vungle/ads/internal/bidding/d;-><init>()V

    sput-object v0, Lcom/vungle/ads/internal/bidding/d;->a:Lcom/vungle/ads/internal/bidding/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, LXf/f;

    .line 2
    .line 3
    const-string v0, "$this$Json"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p1, LXf/f;->c:Z

    .line 10
    .line 11
    iput-boolean v0, p1, LXf/f;->a:Z

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p1, LXf/f;->b:Z

    .line 15
    .line 16
    sget-object p1, Lef/C;->a:Lef/C;

    .line 17
    .line 18
    return-object p1
.end method
