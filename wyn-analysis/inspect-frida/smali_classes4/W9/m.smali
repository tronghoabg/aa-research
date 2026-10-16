.class public final synthetic LW9/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL8/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LL8/t;


# direct methods
.method public synthetic constructor <init>(LL8/t;I)V
    .locals 0

    .line 1
    iput p2, p0, LW9/m;->a:I

    iput-object p1, p0, LW9/m;->b:LL8/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final o(LC6/l;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, LW9/m;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, Lx9/c;

    .line 7
    .line 8
    const-class v0, Landroid/content/Context;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, LC6/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    move-object v2, v0

    .line 15
    check-cast v2, Landroid/content/Context;

    .line 16
    .line 17
    const-class v0, Ls8/g;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, LC6/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ls8/g;

    .line 24
    .line 25
    invoke-virtual {v0}, Ls8/g;->g()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const-class v0, Lx9/d;

    .line 30
    .line 31
    invoke-virtual {p1, v0}, LC6/l;->B(Ljava/lang/Class;)Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    const-class v0, LY9/b;

    .line 36
    .line 37
    invoke-virtual {p1, v0}, LC6/l;->c(Ljava/lang/Class;)LO9/b;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    iget-object v0, p0, LW9/m;->b:LL8/t;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, LC6/l;->b(LL8/t;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    move-object v6, p1

    .line 48
    check-cast v6, Ljava/util/concurrent/Executor;

    .line 49
    .line 50
    invoke-direct/range {v1 .. v6}, Lx9/c;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;LO9/b;Ljava/util/concurrent/Executor;)V

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    :pswitch_0
    iget-object v0, p0, LW9/m;->b:LL8/t;

    .line 55
    .line 56
    invoke-static {v0, p1}, Lcom/google/firebase/remoteconfig/RemoteConfigRegistrar;->a(LL8/t;LC6/l;)LZ9/k;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    return-object p1

    .line 61
    :pswitch_1
    iget-object v0, p0, LW9/m;->b:LL8/t;

    .line 62
    .line 63
    invoke-static {v0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;->a(LL8/t;LC6/l;)Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    return-object p1

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
