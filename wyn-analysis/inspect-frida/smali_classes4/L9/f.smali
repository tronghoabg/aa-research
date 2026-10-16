.class public final LL9/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA9/b;


# instance fields
.field public final synthetic a:I

.field public final b:LXd/c;

.field public final c:Ldf/a;


# direct methods
.method public synthetic constructor <init>(LXd/c;Ldf/a;I)V
    .locals 0

    .line 1
    iput p3, p0, LL9/f;->a:I

    iput-object p1, p0, LL9/f;->b:LXd/c;

    iput-object p2, p0, LL9/f;->c:Ldf/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LL9/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LL9/f;->c:Ldf/a;

    .line 7
    .line 8
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroid/app/Application;

    .line 13
    .line 14
    iget-object v1, p0, LL9/f;->b:LXd/c;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v1, LJ9/I;

    .line 20
    .line 21
    const-string v2, "rate_limit_store_file"

    .line 22
    .line 23
    invoke-direct {v1, v0, v2}, LJ9/I;-><init>(Landroid/app/Application;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v1

    .line 27
    :pswitch_0
    iget-object v0, p0, LL9/f;->c:Ldf/a;

    .line 28
    .line 29
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Landroid/app/Application;

    .line 34
    .line 35
    iget-object v1, p0, LL9/f;->b:LXd/c;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance v1, LJ9/I;

    .line 41
    .line 42
    const-string v2, "fiam_impressions_store_file"

    .line 43
    .line 44
    invoke-direct {v1, v0, v2}, LJ9/I;-><init>(Landroid/app/Application;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v1

    .line 48
    :pswitch_1
    iget-object v0, p0, LL9/f;->c:Ldf/a;

    .line 49
    .line 50
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Landroid/app/Application;

    .line 55
    .line 56
    iget-object v1, p0, LL9/f;->b:LXd/c;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    new-instance v1, LJ9/I;

    .line 62
    .line 63
    const-string v2, "fiam_eligible_campaigns_cache_file"

    .line 64
    .line 65
    invoke-direct {v1, v0, v2}, LJ9/I;-><init>(Landroid/app/Application;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-object v1

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
