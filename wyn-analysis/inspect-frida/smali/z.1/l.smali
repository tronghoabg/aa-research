.class public final Lz/l;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:Lr0/t;

.field public final synthetic j:J

.field public final synthetic k:J


# direct methods
.method public constructor <init>(Lr0/t;JJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz/l;->i:Lr0/t;

    .line 2
    .line 3
    iput-wide p2, p0, Lz/l;->j:J

    .line 4
    .line 5
    iput-wide p4, p0, Lz/l;->k:J

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
    .locals 7

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
    sget p1, LL0/g;->c:I

    .line 9
    .line 10
    iget-wide v0, p0, Lz/l;->j:J

    .line 11
    .line 12
    const/16 p1, 0x20

    .line 13
    .line 14
    shr-long v2, v0, p1

    .line 15
    .line 16
    long-to-int v2, v2

    .line 17
    iget-wide v3, p0, Lz/l;->k:J

    .line 18
    .line 19
    shr-long v5, v3, p1

    .line 20
    .line 21
    long-to-int p1, v5

    .line 22
    add-int/2addr v2, p1

    .line 23
    const-wide v5, 0xffffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    and-long/2addr v0, v5

    .line 29
    long-to-int p1, v0

    .line 30
    and-long v0, v3, v5

    .line 31
    .line 32
    long-to-int v0, v0

    .line 33
    add-int/2addr p1, v0

    .line 34
    iget-object v0, p0, Lz/l;->i:Lr0/t;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-static {v0, v2, p1, v1}, Lr0/s;->a(Lr0/t;IIF)V

    .line 38
    .line 39
    .line 40
    sget-object p1, Lef/C;->a:Lef/C;

    .line 41
    .line 42
    return-object p1
.end method
