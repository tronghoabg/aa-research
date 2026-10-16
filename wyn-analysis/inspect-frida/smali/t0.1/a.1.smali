.class public final Lt0/a;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# static fields
.field public static final j:Lt0/a;

.field public static final k:Lt0/a;

.field public static final l:Lt0/a;

.field public static final m:Lt0/a;

.field public static final n:Lt0/a;


# instance fields
.field public final synthetic i:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lt0/a;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lt0/a;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lt0/a;->j:Lt0/a;

    .line 9
    .line 10
    new-instance v0, Lt0/a;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-direct {v0, v1, v2}, Lt0/a;-><init>(II)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lt0/a;->k:Lt0/a;

    .line 18
    .line 19
    new-instance v0, Lt0/a;

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    const/4 v2, 0x2

    .line 23
    invoke-direct {v0, v1, v2}, Lt0/a;-><init>(II)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lt0/a;->l:Lt0/a;

    .line 27
    .line 28
    new-instance v0, Lt0/a;

    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    const/4 v2, 0x3

    .line 32
    invoke-direct {v0, v1, v2}, Lt0/a;-><init>(II)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lt0/a;->m:Lt0/a;

    .line 36
    .line 37
    new-instance v0, Lt0/a;

    .line 38
    .line 39
    const/4 v1, 0x2

    .line 40
    const/4 v2, 0x4

    .line 41
    invoke-direct {v0, v1, v2}, Lt0/a;-><init>(II)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lt0/a;->n:Lt0/a;

    .line 45
    .line 46
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Lt0/a;->i:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lt0/a;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lt0/c;

    .line 7
    .line 8
    check-cast p2, Lu0/p0;

    .line 9
    .line 10
    const-string v0, "$this$null"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "it"

    .line 16
    .line 17
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    check-cast p1, Lt0/t;

    .line 21
    .line 22
    iput-object p2, p1, Lt0/t;->q:Lu0/p0;

    .line 23
    .line 24
    sget-object p1, Lef/C;->a:Lef/C;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_0
    check-cast p1, Lt0/c;

    .line 28
    .line 29
    check-cast p2, LZ/k;

    .line 30
    .line 31
    const-string v0, "$this$null"

    .line 32
    .line 33
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "it"

    .line 37
    .line 38
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    check-cast p1, Lt0/t;

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Lt0/t;->D(LZ/k;)V

    .line 44
    .line 45
    .line 46
    sget-object p1, Lef/C;->a:Lef/C;

    .line 47
    .line 48
    return-object p1

    .line 49
    :pswitch_1
    check-cast p1, Lt0/c;

    .line 50
    .line 51
    check-cast p2, Lr0/n;

    .line 52
    .line 53
    const-string v0, "$this$null"

    .line 54
    .line 55
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const-string v0, "it"

    .line 59
    .line 60
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    check-cast p1, Lt0/t;

    .line 64
    .line 65
    invoke-virtual {p1, p2}, Lt0/t;->C(Lr0/n;)V

    .line 66
    .line 67
    .line 68
    sget-object p1, Lef/C;->a:Lef/C;

    .line 69
    .line 70
    return-object p1

    .line 71
    :pswitch_2
    check-cast p1, Lt0/c;

    .line 72
    .line 73
    check-cast p2, LL0/i;

    .line 74
    .line 75
    const-string v0, "$this$null"

    .line 76
    .line 77
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const-string v0, "it"

    .line 81
    .line 82
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    check-cast p1, Lt0/t;

    .line 86
    .line 87
    iget-object v0, p1, Lt0/t;->p:LL0/i;

    .line 88
    .line 89
    if-eq v0, p2, :cond_1

    .line 90
    .line 91
    iput-object p2, p1, Lt0/t;->p:LL0/i;

    .line 92
    .line 93
    const/4 p2, 0x0

    .line 94
    invoke-virtual {p1, p2}, Lt0/t;->z(Z)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Lt0/t;->j()Lt0/t;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    if-eqz p2, :cond_0

    .line 102
    .line 103
    invoke-virtual {p2}, Lt0/t;->o()V

    .line 104
    .line 105
    .line 106
    :cond_0
    invoke-virtual {p1}, Lt0/t;->p()V

    .line 107
    .line 108
    .line 109
    :cond_1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 110
    .line 111
    return-object p1

    .line 112
    :pswitch_3
    check-cast p1, Lt0/c;

    .line 113
    .line 114
    check-cast p2, LL0/b;

    .line 115
    .line 116
    const-string v0, "$this$null"

    .line 117
    .line 118
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    const-string v0, "it"

    .line 122
    .line 123
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    check-cast p1, Lt0/t;

    .line 127
    .line 128
    invoke-virtual {p1, p2}, Lt0/t;->B(LL0/b;)V

    .line 129
    .line 130
    .line 131
    sget-object p1, Lef/C;->a:Lef/C;

    .line 132
    .line 133
    return-object p1

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
