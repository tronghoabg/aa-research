.class public final LA/G;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:LA/j;

.field public b:LA/L;

.field public c:Ltf/l;

.field public d:Lkotlin/jvm/internal/G;

.field public synthetic e:Ljava/lang/Object;

.field public f:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iput-object p1, p0, LA/G;->e:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LA/G;->f:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LA/G;->f:I

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    const/4 v1, 0x0

    .line 12
    const-wide/16 v2, 0x0

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    move-object v5, p0

    .line 16
    invoke-static/range {v0 .. v5}, LA/t;->b(LA/j;LA/L;JLA/a;Llf/c;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method
