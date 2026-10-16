.class public final Lcom/moloco/sdk/internal/services/bidtoken/e;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:La2/v;

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:La2/v;

.field public d:I


# direct methods
.method public constructor <init>(La2/v;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/e;->c:La2/v;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Llf/c;-><init>(Ljf/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/e;->b:Ljava/lang/Object;

    iget p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/e;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/e;->d:I

    iget-object p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/e;->c:La2/v;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, La2/v;->i(La2/v;Ljava/lang/String;Llf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
