.class public final synthetic LA8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL8/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LL8/t;

.field public final synthetic c:LL8/t;

.field public final synthetic d:LL8/t;


# direct methods
.method public synthetic constructor <init>(LL8/t;LL8/t;LL8/t;I)V
    .locals 0

    .line 1
    iput p4, p0, LA8/a;->a:I

    iput-object p1, p0, LA8/a;->b:LL8/t;

    iput-object p2, p0, LA8/a;->c:LL8/t;

    iput-object p3, p0, LA8/a;->d:LL8/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final o(LC6/l;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, LA8/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LI8/b;

    .line 7
    .line 8
    const-class v1, Ls8/g;

    .line 9
    .line 10
    invoke-virtual {p1, v1}, LC6/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ls8/g;

    .line 15
    .line 16
    iget-object v2, p0, LA8/a;->b:LL8/t;

    .line 17
    .line 18
    invoke-virtual {p1, v2}, LC6/l;->b(LL8/t;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Ljava/util/concurrent/Executor;

    .line 23
    .line 24
    iget-object v3, p0, LA8/a;->c:LL8/t;

    .line 25
    .line 26
    invoke-virtual {p1, v3}, LC6/l;->b(LL8/t;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ljava/util/concurrent/Executor;

    .line 31
    .line 32
    iget-object v4, p0, LA8/a;->d:LL8/t;

    .line 33
    .line 34
    invoke-virtual {p1, v4}, LC6/l;->b(LL8/t;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Ljava/util/concurrent/Executor;

    .line 39
    .line 40
    invoke-direct {v0, v1, v2, v3, p1}, LI8/b;-><init>(Ls8/g;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    .line 41
    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_0
    new-instance v4, LB8/d;

    .line 45
    .line 46
    const-class v0, Ls8/g;

    .line 47
    .line 48
    invoke-virtual {p1, v0}, LC6/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    move-object v5, v0

    .line 53
    check-cast v5, Ls8/g;

    .line 54
    .line 55
    const-class v0, LA8/b;

    .line 56
    .line 57
    invoke-virtual {p1, v0}, LC6/l;->c(Ljava/lang/Class;)LO9/b;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    iget-object v0, p0, LA8/a;->b:LL8/t;

    .line 62
    .line 63
    invoke-virtual {p1, v0}, LC6/l;->b(LL8/t;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    move-object v7, v0

    .line 68
    check-cast v7, Ljava/util/concurrent/Executor;

    .line 69
    .line 70
    iget-object v0, p0, LA8/a;->c:LL8/t;

    .line 71
    .line 72
    invoke-virtual {p1, v0}, LC6/l;->b(LL8/t;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    move-object v8, v0

    .line 77
    check-cast v8, Ljava/util/concurrent/Executor;

    .line 78
    .line 79
    iget-object v0, p0, LA8/a;->d:LL8/t;

    .line 80
    .line 81
    invoke-virtual {p1, v0}, LC6/l;->b(LL8/t;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    move-object v9, p1

    .line 86
    check-cast v9, Ljava/util/concurrent/Executor;

    .line 87
    .line 88
    invoke-direct/range {v4 .. v9}, LB8/d;-><init>(Ls8/g;LO9/b;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    .line 89
    .line 90
    .line 91
    return-object v4

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
