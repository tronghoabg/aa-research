.class public final Lu1/v;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Lu1/G;

.field public c:LEf/u;

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lu1/G;

.field public f:I


# direct methods
.method public constructor <init>(Lu1/G;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu1/v;->e:Lu1/G;

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

    .line 1
    iput-object p1, p0, Lu1/v;->d:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lu1/v;->f:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lu1/v;->f:I

    .line 9
    .line 10
    iget-object p1, p0, Lu1/v;->e:Lu1/G;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p1, v0, p0}, Lu1/G;->b(Lu1/G;Lu1/p;Llf/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
