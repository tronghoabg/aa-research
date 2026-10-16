.class public final LD9/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LD9/n;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(III)V
    .locals 0

    .line 2
    iput p3, p0, LD9/n;->a:I

    iput p1, p0, LD9/n;->b:I

    iput p2, p0, LD9/n;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 2

    .line 1
    iget v0, p0, LD9/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    iget v1, p0, LD9/n;->c:I

    .line 8
    .line 9
    if-eq v1, v0, :cond_5

    .line 10
    .line 11
    const/4 v0, 0x5

    .line 12
    if-eq v1, v0, :cond_4

    .line 13
    .line 14
    const/16 v0, 0x1d

    .line 15
    .line 16
    if-eq v1, v0, :cond_3

    .line 17
    .line 18
    const/16 v0, 0x2a

    .line 19
    .line 20
    if-eq v1, v0, :cond_2

    .line 21
    .line 22
    const/16 v0, 0x16

    .line 23
    .line 24
    if-eq v1, v0, :cond_1

    .line 25
    .line 26
    const/16 v0, 0x17

    .line 27
    .line 28
    if-eq v1, v0, :cond_0

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/16 v0, 0xf

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/high16 v0, 0x40000000    # 2.0f

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    const/16 v0, 0x10

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_3
    const/16 v0, 0xc

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    const/16 v0, 0xb

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_5
    const/16 v0, 0xa

    .line 48
    .line 49
    :goto_0
    return v0

    .line 50
    :pswitch_0
    const/4 v0, 0x2

    .line 51
    iget v1, p0, LD9/n;->c:I

    .line 52
    .line 53
    if-eq v1, v0, :cond_b

    .line 54
    .line 55
    const/4 v0, 0x5

    .line 56
    if-eq v1, v0, :cond_a

    .line 57
    .line 58
    const/16 v0, 0x1d

    .line 59
    .line 60
    if-eq v1, v0, :cond_9

    .line 61
    .line 62
    const/16 v0, 0x2a

    .line 63
    .line 64
    if-eq v1, v0, :cond_8

    .line 65
    .line 66
    const/16 v0, 0x16

    .line 67
    .line 68
    if-eq v1, v0, :cond_7

    .line 69
    .line 70
    const/16 v0, 0x17

    .line 71
    .line 72
    if-eq v1, v0, :cond_6

    .line 73
    .line 74
    const/4 v0, 0x0

    .line 75
    goto :goto_1

    .line 76
    :cond_6
    const/16 v0, 0xf

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_7
    const/high16 v0, 0x40000000    # 2.0f

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_8
    const/16 v0, 0x10

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_9
    const/16 v0, 0xc

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_a
    const/16 v0, 0xb

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_b
    const/16 v0, 0xa

    .line 92
    .line 93
    :goto_1
    return v0

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, LD9/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "MutableRange(start="

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget v1, p0, LD9/n;->b:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", end="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget v1, p0, LD9/n;->c:I

    .line 29
    .line 30
    const/16 v2, 0x29

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, LVa/M6;->r(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0

    .line 37
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
