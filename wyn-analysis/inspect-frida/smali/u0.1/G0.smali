.class public final Lu0/G0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/t;


# instance fields
.field public final synthetic a:LKd/a;

.field public final synthetic b:LN/a0;

.field public final synthetic c:LN/p0;

.field public final synthetic d:Lkotlin/jvm/internal/G;

.field public final synthetic e:Landroid/view/View;


# direct methods
.method public constructor <init>(LKd/a;LN/a0;LN/p0;Lkotlin/jvm/internal/G;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu0/G0;->a:LKd/a;

    .line 5
    .line 6
    iput-object p2, p0, Lu0/G0;->b:LN/a0;

    .line 7
    .line 8
    iput-object p3, p0, Lu0/G0;->c:LN/p0;

    .line 9
    .line 10
    iput-object p4, p0, Lu0/G0;->d:Lkotlin/jvm/internal/G;

    .line 11
    .line 12
    iput-object p5, p0, Lu0/G0;->e:Landroid/view/View;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/v;Landroidx/lifecycle/m;)V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    sget-object v1, Lu0/D0;->a:[I

    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    aget p2, v1, p2

    .line 9
    .line 10
    if-eq p2, v0, :cond_6

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    if-eq p2, p1, :cond_2

    .line 14
    .line 15
    const/4 p1, 0x3

    .line 16
    if-eq p2, p1, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x4

    .line 19
    if-eq p2, p1, :cond_0

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_0
    iget-object p1, p0, Lu0/G0;->c:LN/p0;

    .line 23
    .line 24
    invoke-virtual {p1}, LN/p0;->w()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    iget-object p1, p0, Lu0/G0;->b:LN/a0;

    .line 29
    .line 30
    if-eqz p1, :cond_5

    .line 31
    .line 32
    invoke-virtual {p1}, LN/a0;->a()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    iget-object p1, p0, Lu0/G0;->b:LN/a0;

    .line 37
    .line 38
    if-eqz p1, :cond_5

    .line 39
    .line 40
    iget-object p1, p1, LN/a0;->b:LA7/b0;

    .line 41
    .line 42
    iget-object p2, p1, LA7/b0;->c:Ljava/lang/Object;

    .line 43
    .line 44
    monitor-enter p2

    .line 45
    :try_start_0
    invoke-virtual {p1}, LA7/b0;->q()Z

    .line 46
    .line 47
    .line 48
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    monitor-exit p2

    .line 52
    return-void

    .line 53
    :cond_3
    :try_start_1
    iget-object v1, p1, LA7/b0;->d:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Ljava/util/ArrayList;

    .line 56
    .line 57
    iget-object v2, p1, LA7/b0;->e:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, Ljava/util/ArrayList;

    .line 60
    .line 61
    iput-object v2, p1, LA7/b0;->d:Ljava/lang/Object;

    .line 62
    .line 63
    iput-object v1, p1, LA7/b0;->e:Ljava/lang/Object;

    .line 64
    .line 65
    iput-boolean v0, p1, LA7/b0;->b:Z

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    const/4 v2, 0x0

    .line 72
    :goto_0
    if-ge v2, p1, :cond_4

    .line 73
    .line 74
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    check-cast v3, Ljf/c;

    .line 79
    .line 80
    sget-object v4, Lef/C;->a:Lef/C;

    .line 81
    .line 82
    invoke-interface {v3, v4}, Ljf/c;->resumeWith(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    add-int/2addr v2, v0

    .line 86
    goto :goto_0

    .line 87
    :catchall_0
    move-exception v0

    .line 88
    move-object p1, v0

    .line 89
    goto :goto_1

    .line 90
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    .line 92
    .line 93
    monitor-exit p2

    .line 94
    return-void

    .line 95
    :goto_1
    monitor-exit p2

    .line 96
    throw p1

    .line 97
    :cond_5
    :goto_2
    return-void

    .line 98
    :cond_6
    iget-object p2, p0, Lu0/G0;->a:LKd/a;

    .line 99
    .line 100
    sget-object v1, LEf/F;->a:LEf/F;

    .line 101
    .line 102
    new-instance v2, Lu0/F0;

    .line 103
    .line 104
    iget-object v3, p0, Lu0/G0;->d:Lkotlin/jvm/internal/G;

    .line 105
    .line 106
    iget-object v4, p0, Lu0/G0;->c:LN/p0;

    .line 107
    .line 108
    iget-object v7, p0, Lu0/G0;->e:Landroid/view/View;

    .line 109
    .line 110
    const/4 v8, 0x0

    .line 111
    move-object v6, p0

    .line 112
    move-object v5, p1

    .line 113
    invoke-direct/range {v2 .. v8}, Lu0/F0;-><init>(Lkotlin/jvm/internal/G;LN/p0;Landroidx/lifecycle/v;Lu0/G0;Landroid/view/View;Ljf/c;)V

    .line 114
    .line 115
    .line 116
    const/4 p1, 0x0

    .line 117
    invoke-static {p2, p1, v2, v0}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 118
    .line 119
    .line 120
    return-void
.end method
