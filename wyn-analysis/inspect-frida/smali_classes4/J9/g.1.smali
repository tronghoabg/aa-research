.class public final LJ9/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA9/b;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ldf/a;

.field public final d:Ldf/a;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ldf/a;Ldf/a;I)V
    .locals 0

    .line 1
    iput p4, p0, LJ9/g;->a:I

    iput-object p1, p0, LJ9/g;->b:Ljava/lang/Object;

    iput-object p2, p0, LJ9/g;->c:Ldf/a;

    iput-object p3, p0, LJ9/g;->d:Ldf/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LJ9/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LJ9/g;->c:Ldf/a;

    .line 7
    .line 8
    check-cast v0, LL9/b;

    .line 9
    .line 10
    invoke-virtual {v0}, LL9/b;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, LJ9/Y;

    .line 15
    .line 16
    iget-object v1, p0, LJ9/g;->d:Ldf/a;

    .line 17
    .line 18
    check-cast v1, LK9/a;

    .line 19
    .line 20
    invoke-virtual {v1}, LK9/a;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ll9/d;

    .line 25
    .line 26
    iget-object v2, p0, LJ9/g;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, LDd/c;

    .line 29
    .line 30
    new-instance v3, LJ9/i;

    .line 31
    .line 32
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, v3, LJ9/i;->a:LJ9/Y;

    .line 36
    .line 37
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 38
    .line 39
    iget-object v2, v2, LDd/c;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v2, Ls8/g;

    .line 42
    .line 43
    invoke-virtual {v2}, Ls8/g;->k()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 48
    .line 49
    .line 50
    iput-object v0, v3, LJ9/i;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 51
    .line 52
    new-instance v0, LJ9/h;

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    invoke-direct {v0, v3, v2}, LJ9/h;-><init>(Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    check-cast v1, LL8/n;

    .line 59
    .line 60
    iget-object v2, v1, LL8/n;->c:Ljava/util/concurrent/Executor;

    .line 61
    .line 62
    invoke-virtual {v1, v2, v0}, LL8/n;->c(Ljava/util/concurrent/Executor;Ll9/b;)V

    .line 63
    .line 64
    .line 65
    return-object v3

    .line 66
    :pswitch_0
    iget-object v0, p0, LJ9/g;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Ldf/a;

    .line 69
    .line 70
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, LHe/m;

    .line 75
    .line 76
    iget-object v1, p0, LJ9/g;->c:Ldf/a;

    .line 77
    .line 78
    invoke-interface {v1}, Ldf/a;->get()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast v1, LHe/m;

    .line 83
    .line 84
    iget-object v1, p0, LJ9/g;->d:Ldf/a;

    .line 85
    .line 86
    invoke-interface {v1}, Ldf/a;->get()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, LHe/m;

    .line 91
    .line 92
    new-instance v2, LJ9/X;

    .line 93
    .line 94
    invoke-direct {v2, v0, v1}, LJ9/X;-><init>(LHe/m;LHe/m;)V

    .line 95
    .line 96
    .line 97
    return-object v2

    .line 98
    :pswitch_1
    iget-object v0, p0, LJ9/g;->b:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, Ldf/a;

    .line 101
    .line 102
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, LJ9/I;

    .line 107
    .line 108
    iget-object v1, p0, LJ9/g;->c:Ldf/a;

    .line 109
    .line 110
    invoke-interface {v1}, Ldf/a;->get()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    check-cast v1, Landroid/app/Application;

    .line 115
    .line 116
    iget-object v2, p0, LJ9/g;->d:Ldf/a;

    .line 117
    .line 118
    check-cast v2, LL9/g;

    .line 119
    .line 120
    invoke-virtual {v2}, LL9/g;->get()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    check-cast v2, LM9/a;

    .line 125
    .line 126
    new-instance v3, LJ9/f;

    .line 127
    .line 128
    invoke-direct {v3, v0, v1, v2}, LJ9/f;-><init>(LJ9/I;Landroid/app/Application;LM9/a;)V

    .line 129
    .line 130
    .line 131
    return-object v3

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
