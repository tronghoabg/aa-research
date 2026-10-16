.class public final Lc4/c;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:Lc4/h;

.field public b:Lh4/h;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Lkotlin/jvm/internal/G;

.field public f:Lkotlin/jvm/internal/G;

.field public g:Lkotlin/jvm/internal/G;

.field public h:Lkotlin/jvm/internal/G;

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lc4/h;

.field public k:I


# direct methods
.method public constructor <init>(Lc4/h;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc4/c;->j:Lc4/h;

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
    .locals 6

    .line 1
    iput-object p1, p0, Lc4/c;->i:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lc4/c;->k:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lc4/c;->k:I

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    iget-object v0, p0, Lc4/c;->j:Lc4/h;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    move-object v5, p0

    .line 17
    invoke-static/range {v0 .. v5}, Lc4/h;->b(Lc4/h;Lh4/h;Ljava/lang/Object;Lh4/l;LX3/c;Llf/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method
