.class public final Lhb/c;
.super Lhb/d;
.source "SourceFile"


# instance fields
.field public final synthetic h:I

.field public i:Lhb/r;

.field public final synthetic j:[Ljava/lang/reflect/Type;

.field public final synthetic k:Ljava/lang/reflect/Type;

.field public final synthetic l:Ljava/util/Set;

.field public final synthetic m:Ljava/util/Set;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/Object;Ljava/lang/reflect/Method;IZ[Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/util/Set;I)V
    .locals 0

    .line 1
    iput p11, p0, Lhb/c;->h:I

    iput-object p7, p0, Lhb/c;->j:[Ljava/lang/reflect/Type;

    iput-object p8, p0, Lhb/c;->k:Ljava/lang/reflect/Type;

    iput-object p9, p0, Lhb/c;->l:Ljava/util/Set;

    iput-object p10, p0, Lhb/c;->m:Ljava/util/Set;

    const/4 p7, 0x1

    move p8, p6

    move p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p8}, Lhb/d;-><init>(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/Object;Ljava/lang/reflect/Method;IIZ)V

    return-void
.end method


# virtual methods
.method public final a(Lhb/K;Lhb/e;)V
    .locals 4

    .line 1
    iget v0, p0, Lhb/c;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lhb/d;->a(Lhb/K;Lhb/e;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lhb/c;->j:[Ljava/lang/reflect/Type;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    aget-object v2, v0, v1

    .line 13
    .line 14
    iget-object v3, p0, Lhb/c;->k:Ljava/lang/reflect/Type;

    .line 15
    .line 16
    invoke-static {v2, v3}, Lhb/P;->b(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    iget-object v3, p0, Lhb/c;->l:Ljava/util/Set;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    iget-object v2, p0, Lhb/c;->m:Ljava/util/Set;

    .line 25
    .line 26
    invoke-interface {v3, v2}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    aget-object v0, v0, v1

    .line 33
    .line 34
    invoke-virtual {p1, p2, v0, v3}, Lhb/K;->d(Lhb/e;Ljava/lang/reflect/Type;Ljava/util/Set;)Lhb/r;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    aget-object p2, v0, v1

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-virtual {p1, p2, v3, v0}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    :goto_0
    iput-object p1, p0, Lhb/c;->i:Lhb/r;

    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_0
    invoke-super {p0, p1, p2}, Lhb/d;->a(Lhb/K;Lhb/e;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lhb/c;->j:[Ljava/lang/reflect/Type;

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    aget-object v0, v0, v1

    .line 56
    .line 57
    iget-object v1, p0, Lhb/c;->k:Ljava/lang/reflect/Type;

    .line 58
    .line 59
    invoke-static {v0, v1}, Lhb/P;->b(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iget-object v2, p0, Lhb/c;->m:Ljava/util/Set;

    .line 64
    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    iget-object v0, p0, Lhb/c;->l:Ljava/util/Set;

    .line 68
    .line 69
    invoke-interface {v0, v2}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_1

    .line 74
    .line 75
    invoke-virtual {p1, p2, v1, v2}, Lhb/K;->d(Lhb/e;Ljava/lang/reflect/Type;Ljava/util/Set;)Lhb/r;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    goto :goto_1

    .line 80
    :cond_1
    const/4 p2, 0x0

    .line 81
    invoke-virtual {p1, v1, v2, p2}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    :goto_1
    iput-object p1, p0, Lhb/c;->i:Lhb/r;

    .line 86
    .line 87
    return-void

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lhb/w;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lhb/c;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lhb/d;->b(Lhb/w;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    iget-object v0, p0, Lhb/c;->i:Lhb/r;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, p1}, Lhb/d;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public d(Lhb/C;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lhb/c;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lhb/d;->d(Lhb/C;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p0, p2}, Lhb/d;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    iget-object v0, p0, Lhb/c;->i:Lhb/r;

    .line 15
    .line 16
    invoke-virtual {v0, p1, p2}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
