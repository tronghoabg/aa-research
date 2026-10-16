.class public final Lz/u;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:Lz/v;

.field public final synthetic j:Lr0/t;

.field public final synthetic k:J


# direct methods
.method public constructor <init>(Lz/v;Lr0/t;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz/u;->i:Lz/v;

    .line 2
    .line 3
    iput-object p2, p0, Lz/u;->j:Lr0/t;

    .line 4
    .line 5
    iput-wide p3, p0, Lz/u;->k:J

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Lr0/s;

    .line 2
    .line 3
    const-string v0, "$this$layout"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lz/u;->i:Lz/v;

    .line 9
    .line 10
    iget-object v0, p1, Lz/v;->a:LA/M;

    .line 11
    .line 12
    iget-object v1, p1, Lz/v;->d:Lz/t;

    .line 13
    .line 14
    new-instance v2, Lz/t;

    .line 15
    .line 16
    iget-wide v3, p0, Lz/u;->k:J

    .line 17
    .line 18
    invoke-direct {v2, p1, v3, v4}, Lz/t;-><init>(Lz/v;J)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, LA/M;->a(Ltf/l;Ltf/l;)LS3/i;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, LS3/i;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, LL0/g;

    .line 30
    .line 31
    iget-wide v0, p1, LL0/g;->a:J

    .line 32
    .line 33
    sget p1, Lr0/v;->b:I

    .line 34
    .line 35
    sget-object p1, Lr0/u;->j:Lr0/u;

    .line 36
    .line 37
    iget-object v2, p0, Lz/u;->j:Lr0/t;

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-static {v2, v0, v1, v3, p1}, Lr0/s;->f(Lr0/t;JFLtf/l;)V

    .line 41
    .line 42
    .line 43
    sget-object p1, Lef/C;->a:Lef/C;

    .line 44
    .line 45
    return-object p1
.end method
