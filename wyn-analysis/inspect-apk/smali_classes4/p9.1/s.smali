.class public Lp9/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lm9/H;

.field public final b:LC8/i;

.field public c:Lp7/b;

.field public d:Lr9/l;

.field public e:Lp9/z;

.field public f:LE5/n0;

.field public g:LQ1/n;

.field public h:Lr9/e;

.field public i:Lr9/P;


# direct methods
.method public constructor <init>(Lm9/H;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LC8/i;

    .line 5
    .line 6
    const/16 v1, 0x13

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, v1, v2}, LC8/i;-><init>(IZ)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lp9/s;->b:LC8/i;

    .line 13
    .line 14
    iput-object p1, p0, Lp9/s;->a:Lm9/H;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public a(Lme/a;)Lr9/P;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public b(Lme/a;)Lr9/e;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public c(Lme/a;)Lp7/b;
    .locals 1

    .line 1
    iget-object p1, p0, Lp9/s;->a:Lm9/H;

    .line 2
    .line 3
    iget-object p1, p1, Lm9/H;->e:Lm9/P;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    instance-of v0, p1, Lm9/Q;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p1, Lm9/Q;

    .line 12
    .line 13
    :cond_0
    new-instance p1, Lr9/t;

    .line 14
    .line 15
    invoke-direct {p1}, Lr9/t;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lme/a;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, Lme/a;->b:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object v0, p1, Lr9/t;->k:Lr9/z;

    .line 26
    .line 27
    return-object p1
.end method

.method public final d()Lr9/l;
    .locals 3

    .line 1
    iget-object v0, p0, Lp9/s;->d:Lr9/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v2, "localStore not initialized yet"

    .line 7
    .line 8
    invoke-static {v0, v2, v1}, LA6/c;->A(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final e()Lp9/z;
    .locals 3

    .line 1
    iget-object v0, p0, Lp9/s;->e:Lp9/z;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v2, "syncEngine not initialized yet"

    .line 7
    .line 8
    invoke-static {v0, v2, v1}, LA6/c;->A(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
