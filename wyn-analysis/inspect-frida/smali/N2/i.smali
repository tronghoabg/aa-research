.class public abstract LN2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:J

.field public c:J

.field public d:J

.field public e:I

.field public f:I

.field public g:J

.field public h:Z

.field public i:Z

.field public final j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    iput p1, p0, LN2/i;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p1, LN2/e;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p1, v0}, LN2/e;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, LN2/i;->j:Ljava/lang/Object;

    .line 16
    .line 17
    new-instance p1, LS3/c;

    .line 18
    .line 19
    const/16 v0, 0xe

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {p1, v0, v1}, LS3/c;-><init>(IZ)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, LN2/i;->n:Ljava/lang/Object;

    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance p1, LN2/e;

    .line 32
    .line 33
    const/4 v0, 0x2

    .line 34
    invoke-direct {p1, v0}, LN2/e;-><init>(I)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, LN2/i;->j:Ljava/lang/Object;

    .line 38
    .line 39
    new-instance p1, LS3/s;

    .line 40
    .line 41
    const/16 v0, 0x15

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-direct {p1, v0, v1}, LS3/s;-><init>(IC)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, LN2/i;->n:Ljava/lang/Object;

    .line 48
    .line 49
    return-void

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(J)V
    .locals 1

    .line 1
    iget v0, p0, LN2/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iput-wide p1, p0, LN2/i;->d:J

    .line 7
    .line 8
    return-void

    .line 9
    :pswitch_0
    iput-wide p1, p0, LN2/i;->d:J

    .line 10
    .line 11
    return-void

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public abstract b(LQ1/o;)J
.end method

.method public abstract c(LY4/b;)J
.end method

.method public abstract d(LQ1/o;JLS3/c;)Z
.end method

.method public abstract e(LY4/b;JLS3/s;)Z
.end method

.method public f(Z)V
    .locals 4

    .line 1
    iget v0, p0, LN2/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    new-instance p1, LS3/s;

    .line 11
    .line 12
    const/16 v2, 0x15

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-direct {p1, v2, v3}, LS3/s;-><init>(IC)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, LN2/i;->n:Ljava/lang/Object;

    .line 19
    .line 20
    iput-wide v0, p0, LN2/i;->c:J

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    iput p1, p0, LN2/i;->e:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x1

    .line 27
    iput p1, p0, LN2/i;->e:I

    .line 28
    .line 29
    :goto_0
    const-wide/16 v2, -0x1

    .line 30
    .line 31
    iput-wide v2, p0, LN2/i;->b:J

    .line 32
    .line 33
    iput-wide v0, p0, LN2/i;->d:J

    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_0
    const-wide/16 v0, 0x0

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    new-instance p1, LS3/c;

    .line 41
    .line 42
    const/16 v2, 0xe

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-direct {p1, v2, v3}, LS3/c;-><init>(IZ)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, LN2/i;->n:Ljava/lang/Object;

    .line 49
    .line 50
    iput-wide v0, p0, LN2/i;->c:J

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    iput p1, p0, LN2/i;->e:I

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const/4 p1, 0x1

    .line 57
    iput p1, p0, LN2/i;->e:I

    .line 58
    .line 59
    :goto_1
    const-wide/16 v2, -0x1

    .line 60
    .line 61
    iput-wide v2, p0, LN2/i;->b:J

    .line 62
    .line 63
    iput-wide v0, p0, LN2/i;->d:J

    .line 64
    .line 65
    return-void

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
