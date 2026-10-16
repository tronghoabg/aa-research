.class public final Lcom/moloco/sdk/internal/publisher/nativead/model/i;
.super Lcom/moloco/sdk/internal/publisher/nativead/model/m;
.source "SourceFile"


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/publisher/nativead/model/a;)V
    .locals 1

    .line 1
    const-string v0, "originAsset"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/moloco/sdk/internal/publisher/nativead/model/m;-><init>(Lcom/moloco/sdk/internal/publisher/nativead/model/e;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p1, Lcom/moloco/sdk/internal/publisher/nativead/model/a;->c:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/nativead/model/i;->b:Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method
