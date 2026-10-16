.class public final Lt0/w;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic i:Lt0/y;

.field public final synthetic j:LX0/E;

.field public final synthetic k:Lt0/j;

.field public final synthetic l:J

.field public final synthetic m:Lt0/h;

.field public final synthetic n:Z

.field public final synthetic o:Z


# direct methods
.method public constructor <init>(Lt0/y;LX0/E;Lt0/j;JLt0/h;ZZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt0/w;->i:Lt0/y;

    .line 2
    .line 3
    iput-object p2, p0, Lt0/w;->j:LX0/E;

    .line 4
    .line 5
    iput-object p3, p0, Lt0/w;->k:Lt0/j;

    .line 6
    .line 7
    iput-wide p4, p0, Lt0/w;->l:J

    .line 8
    .line 9
    iput-object p6, p0, Lt0/w;->m:Lt0/h;

    .line 10
    .line 11
    iput-boolean p7, p0, Lt0/w;->n:Z

    .line 12
    .line 13
    iput-boolean p8, p0, Lt0/w;->o:Z

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Lt0/w;->j:LX0/E;

    .line 2
    .line 3
    iget-object v0, v0, LX0/E;->d:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v3, v0

    .line 6
    check-cast v3, LX0/E;

    .line 7
    .line 8
    iget-boolean v8, p0, Lt0/w;->n:Z

    .line 9
    .line 10
    iget-boolean v9, p0, Lt0/w;->o:Z

    .line 11
    .line 12
    iget-object v2, p0, Lt0/w;->i:Lt0/y;

    .line 13
    .line 14
    iget-object v4, p0, Lt0/w;->k:Lt0/j;

    .line 15
    .line 16
    iget-wide v5, p0, Lt0/w;->l:J

    .line 17
    .line 18
    iget-object v7, p0, Lt0/w;->m:Lt0/h;

    .line 19
    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    move v10, v9

    .line 23
    move v9, v8

    .line 24
    move-object v8, v7

    .line 25
    move-wide v6, v5

    .line 26
    move-object v5, v4

    .line 27
    move-object v4, v2

    .line 28
    invoke-virtual/range {v4 .. v10}, Lt0/y;->Q(Lt0/j;JLt0/h;ZZ)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4, v3}, Lt0/j;->b(LX0/E;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v1, Lt0/w;

    .line 40
    .line 41
    invoke-direct/range {v1 .. v9}, Lt0/w;-><init>(Lt0/y;LX0/E;Lt0/j;JLt0/h;ZZ)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    const/high16 v2, -0x40800000    # -1.0f

    .line 48
    .line 49
    invoke-virtual {v7, v0, v2, v9, v1}, Lt0/h;->c(Ljava/lang/Object;FZLtf/a;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    sget-object v0, Lef/C;->a:Lef/C;

    .line 53
    .line 54
    return-object v0
.end method
