.class public final Ll8/S;
.super Ll8/a;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final d:Ljava/util/Iterator;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;Lk8/k;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ll8/S;->c:I

    .line 1
    iput-object p1, p0, Ll8/S;->d:Ljava/util/Iterator;

    iput-object p2, p0, Ll8/S;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ll8/a;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll8/n0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ll8/S;->c:I

    .line 2
    iput-object p1, p0, Ll8/S;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ll8/a;-><init>()V

    .line 3
    iget-object p1, p1, Ll8/n0;->c:Ljava/util/Set;

    check-cast p1, Ll8/P;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Ll8/S;->d:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Ll8/S;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :cond_0
    iget-object v0, p0, Ll8/S;->d:Ljava/util/Iterator;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Ll8/S;->e:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ll8/n0;

    .line 21
    .line 22
    iget-object v1, v1, Ll8/n0;->d:Ljava/util/Set;

    .line 23
    .line 24
    check-cast v1, Ll8/P;

    .line 25
    .line 26
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v0, 0x3

    .line 34
    iput v0, p0, Ll8/a;->a:I

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    :goto_0
    return-object v0

    .line 38
    :cond_2
    :pswitch_0
    iget-object v0, p0, Ll8/S;->d:Ljava/util/Iterator;

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v1, p0, Ll8/S;->e:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Lk8/k;

    .line 53
    .line 54
    invoke-interface {v1, v0}, Lk8/k;->apply(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    const/4 v0, 0x3

    .line 62
    iput v0, p0, Ll8/a;->a:I

    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    :goto_1
    return-object v0

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
