.class public final Lb0/i;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:F

.field public final synthetic j:Le0/E;

.field public final synthetic k:J

.field public final synthetic l:J


# direct methods
.method public constructor <init>(FLe0/E;JJ)V
    .locals 0

    .line 1
    iput p1, p0, Lb0/i;->i:F

    .line 2
    .line 3
    iput-object p2, p0, Lb0/i;->j:Le0/E;

    .line 4
    .line 5
    iput-wide p3, p0, Lb0/i;->k:J

    .line 6
    .line 7
    iput-wide p5, p0, Lb0/i;->l:J

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Le0/B;

    .line 2
    .line 3
    const-string v0, "$this$graphicsLayer"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p1, Le0/B;->k:LL0/b;

    .line 9
    .line 10
    invoke-interface {v0}, LL0/b;->b()F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget v1, p0, Lb0/i;->i:F

    .line 15
    .line 16
    mul-float/2addr v0, v1

    .line 17
    iput v0, p1, Le0/B;->d:F

    .line 18
    .line 19
    const-string v0, "<set-?>"

    .line 20
    .line 21
    iget-object v1, p0, Lb0/i;->j:Le0/E;

    .line 22
    .line 23
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p1, Le0/B;->i:Le0/E;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p1, Le0/B;->j:Z

    .line 30
    .line 31
    iget-wide v0, p0, Lb0/i;->k:J

    .line 32
    .line 33
    iput-wide v0, p1, Le0/B;->e:J

    .line 34
    .line 35
    iget-wide v0, p0, Lb0/i;->l:J

    .line 36
    .line 37
    iput-wide v0, p1, Le0/B;->f:J

    .line 38
    .line 39
    sget-object p1, Lef/C;->a:Lef/C;

    .line 40
    .line 41
    return-object p1
.end method
