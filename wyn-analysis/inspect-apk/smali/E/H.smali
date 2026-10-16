.class public final LE/H;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:LP/a;

.field public final synthetic j:[Lr0/t;

.field public final synthetic k:Lkotlin/jvm/internal/n;

.field public final synthetic l:I

.field public final synthetic m:Lt0/r;

.field public final synthetic n:[I

.field public final synthetic o:I

.field public final synthetic p:[Lic/d;

.field public final synthetic q:Landroid/support/v4/media/session/b;

.field public final synthetic r:I


# direct methods
.method public constructor <init>(LP/a;[Lr0/t;Ltf/s;ILt0/r;[II[Lic/d;Landroid/support/v4/media/session/b;ILkotlin/jvm/internal/E;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE/H;->i:LP/a;

    .line 2
    .line 3
    iput-object p2, p0, LE/H;->j:[Lr0/t;

    .line 4
    .line 5
    check-cast p3, Lkotlin/jvm/internal/n;

    .line 6
    .line 7
    iput-object p3, p0, LE/H;->k:Lkotlin/jvm/internal/n;

    .line 8
    .line 9
    iput p4, p0, LE/H;->l:I

    .line 10
    .line 11
    iput-object p5, p0, LE/H;->m:Lt0/r;

    .line 12
    .line 13
    iput-object p6, p0, LE/H;->n:[I

    .line 14
    .line 15
    iput p7, p0, LE/H;->o:I

    .line 16
    .line 17
    iput-object p8, p0, LE/H;->p:[Lic/d;

    .line 18
    .line 19
    iput-object p9, p0, LE/H;->q:Landroid/support/v4/media/session/b;

    .line 20
    .line 21
    iput p10, p0, LE/H;->r:I

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p1, Lr0/s;

    .line 2
    .line 3
    const-string v0, "$this$layout"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, LE/H;->i:LP/a;

    .line 9
    .line 10
    iget-object p1, p1, LP/a;->a:LP/d;

    .line 11
    .line 12
    iget p1, p1, LP/d;->c:I

    .line 13
    .line 14
    new-array v2, p1, [I

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    move v0, v6

    .line 18
    :goto_0
    iget-object v7, p0, LE/H;->j:[Lr0/t;

    .line 19
    .line 20
    const/4 v8, 0x1

    .line 21
    iget v9, p0, LE/H;->o:I

    .line 22
    .line 23
    if-ge v0, p1, :cond_1

    .line 24
    .line 25
    aget-object v1, v7, v0

    .line 26
    .line 27
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    if-ne v9, v8, :cond_0

    .line 31
    .line 32
    iget v1, v1, Lr0/t;->a:I

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    iget v1, v1, Lr0/t;->b:I

    .line 36
    .line 37
    :goto_1
    aput v1, v2, v0

    .line 38
    .line 39
    add-int/lit8 v0, v0, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iget p1, p0, LE/H;->l:I

    .line 43
    .line 44
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-object v4, p0, LE/H;->m:Lt0/r;

    .line 49
    .line 50
    iget-object p1, v4, Lt0/r;->a:Lt0/t;

    .line 51
    .line 52
    iget-object v3, p1, Lt0/t;->p:LL0/i;

    .line 53
    .line 54
    iget-object v5, p0, LE/H;->n:[I

    .line 55
    .line 56
    iget-object v0, p0, LE/H;->k:Lkotlin/jvm/internal/n;

    .line 57
    .line 58
    invoke-interface/range {v0 .. v5}, Ltf/s;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    array-length p1, v7

    .line 62
    move v0, v6

    .line 63
    :goto_2
    if-ge v6, p1, :cond_5

    .line 64
    .line 65
    aget-object v1, v7, v6

    .line 66
    .line 67
    add-int/lit8 v2, v0, 0x1

    .line 68
    .line 69
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object v3, p0, LE/H;->p:[Lic/d;

    .line 73
    .line 74
    aget-object v3, v3, v0

    .line 75
    .line 76
    if-ne v9, v8, :cond_2

    .line 77
    .line 78
    iget v3, v1, Lr0/t;->b:I

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_2
    iget v3, v1, Lr0/t;->a:I

    .line 82
    .line 83
    :goto_3
    iget v4, p0, LE/H;->r:I

    .line 84
    .line 85
    sub-int/2addr v4, v3

    .line 86
    if-ne v9, v8, :cond_3

    .line 87
    .line 88
    sget-object v3, LL0/i;->a:LL0/i;

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_3
    iget-object v3, p0, LE/H;->m:Lt0/r;

    .line 92
    .line 93
    iget-object v3, v3, Lt0/r;->a:Lt0/t;

    .line 94
    .line 95
    iget-object v3, v3, Lt0/t;->p:LL0/i;

    .line 96
    .line 97
    :goto_4
    iget-object v10, p0, LE/H;->q:Landroid/support/v4/media/session/b;

    .line 98
    .line 99
    invoke-virtual {v10, v4, v3, v1}, Landroid/support/v4/media/session/b;->J(ILL0/i;Lr0/t;)I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    const/4 v4, 0x0

    .line 104
    if-ne v9, v8, :cond_4

    .line 105
    .line 106
    aget v0, v5, v0

    .line 107
    .line 108
    invoke-static {v1, v0, v3, v4}, Lr0/s;->a(Lr0/t;IIF)V

    .line 109
    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_4
    aget v0, v5, v0

    .line 113
    .line 114
    invoke-static {v1, v3, v0, v4}, Lr0/s;->a(Lr0/t;IIF)V

    .line 115
    .line 116
    .line 117
    :goto_5
    add-int/lit8 v6, v6, 0x1

    .line 118
    .line 119
    move v0, v2

    .line 120
    goto :goto_2

    .line 121
    :cond_5
    sget-object p1, Lef/C;->a:Lef/C;

    .line 122
    .line 123
    return-object p1
.end method
