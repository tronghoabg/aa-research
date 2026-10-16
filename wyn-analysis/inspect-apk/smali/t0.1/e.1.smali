.class public final Lt0/e;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# static fields
.field public static final j:Lt0/e;

.field public static final k:Lt0/e;

.field public static final l:Lt0/e;

.field public static final m:Lt0/e;

.field public static final n:Lt0/e;

.field public static final o:Lt0/e;

.field public static final p:Lt0/e;


# instance fields
.field public final synthetic i:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lt0/e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lt0/e;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lt0/e;->j:Lt0/e;

    .line 9
    .line 10
    new-instance v0, Lt0/e;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-direct {v0, v1, v2}, Lt0/e;-><init>(II)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lt0/e;->k:Lt0/e;

    .line 18
    .line 19
    new-instance v0, Lt0/e;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    const/4 v2, 0x2

    .line 23
    invoke-direct {v0, v1, v2}, Lt0/e;-><init>(II)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lt0/e;->l:Lt0/e;

    .line 27
    .line 28
    new-instance v0, Lt0/e;

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    const/4 v2, 0x3

    .line 32
    invoke-direct {v0, v1, v2}, Lt0/e;-><init>(II)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lt0/e;->m:Lt0/e;

    .line 36
    .line 37
    new-instance v0, Lt0/e;

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    const/4 v2, 0x4

    .line 41
    invoke-direct {v0, v1, v2}, Lt0/e;-><init>(II)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lt0/e;->n:Lt0/e;

    .line 45
    .line 46
    new-instance v0, Lt0/e;

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    const/4 v2, 0x5

    .line 50
    invoke-direct {v0, v1, v2}, Lt0/e;-><init>(II)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lt0/e;->o:Lt0/e;

    .line 54
    .line 55
    new-instance v0, Lt0/e;

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    const/4 v2, 0x6

    .line 59
    invoke-direct {v0, v1, v2}, Lt0/e;-><init>(II)V

    .line 60
    .line 61
    .line 62
    sput-object v0, Lt0/e;->p:Lt0/e;

    .line 63
    .line 64
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Lt0/e;->i:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lt0/e;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lt0/t;

    .line 7
    .line 8
    const-string v0, "layoutNode"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lt0/t;->r()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p1, v0}, Lt0/t;->z(Z)V

    .line 21
    .line 22
    .line 23
    :cond_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 24
    .line 25
    return-object p1

    .line 26
    :pswitch_0
    check-cast p1, Lt0/t;

    .line 27
    .line 28
    const-string v0, "layoutNode"

    .line 29
    .line 30
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lt0/t;->r()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-virtual {p1, v0}, Lt0/t;->y(Z)V

    .line 41
    .line 42
    .line 43
    :cond_1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 44
    .line 45
    return-object p1

    .line 46
    :pswitch_1
    check-cast p1, Lt0/t;

    .line 47
    .line 48
    const-string v0, "layoutNode"

    .line 49
    .line 50
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lt0/t;->r()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    invoke-virtual {p1, v0}, Lt0/t;->y(Z)V

    .line 61
    .line 62
    .line 63
    :cond_2
    sget-object p1, Lef/C;->a:Lef/C;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_2
    check-cast p1, Lt0/B;

    .line 67
    .line 68
    const-string v0, "node"

    .line 69
    .line 70
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Lt0/B;->b()V

    .line 74
    .line 75
    .line 76
    sget-object p1, Lef/C;->a:Lef/C;

    .line 77
    .line 78
    return-object p1

    .line 79
    :pswitch_3
    check-cast p1, Lt0/y;

    .line 80
    .line 81
    const-string v0, "wrapper"

    .line 82
    .line 83
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Lt0/y;->n()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_3

    .line 91
    .line 92
    invoke-virtual {p1}, Lt0/y;->f0()V

    .line 93
    .line 94
    .line 95
    :cond_3
    sget-object p1, Lef/C;->a:Lef/C;

    .line 96
    .line 97
    return-object p1

    .line 98
    :pswitch_4
    check-cast p1, Lt0/y;

    .line 99
    .line 100
    const-string v0, "wrapper"

    .line 101
    .line 102
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    iget-object p1, p1, Lt0/y;->v:Lt0/G;

    .line 106
    .line 107
    if-eqz p1, :cond_4

    .line 108
    .line 109
    invoke-interface {p1}, Lt0/G;->invalidate()V

    .line 110
    .line 111
    .line 112
    :cond_4
    sget-object p1, Lef/C;->a:Lef/C;

    .line 113
    .line 114
    return-object p1

    .line 115
    :pswitch_5
    check-cast p1, Lt0/f;

    .line 116
    .line 117
    const-string v0, "drawEntity"

    .line 118
    .line 119
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    iget-object v0, p1, LX0/E;->b:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v0, Lt0/y;

    .line 125
    .line 126
    invoke-virtual {v0}, Lt0/y;->S()Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_5

    .line 131
    .line 132
    const/4 v1, 0x1

    .line 133
    iput-boolean v1, p1, Lt0/f;->g:Z

    .line 134
    .line 135
    invoke-virtual {v0}, Lt0/y;->R()V

    .line 136
    .line 137
    .line 138
    :cond_5
    sget-object p1, Lef/C;->a:Lef/C;

    .line 139
    .line 140
    return-object p1

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
