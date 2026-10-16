.class public final LAf/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Luf/a;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LAf/j;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LAf/i;->a:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, LAf/i;->d:Ljava/lang/Object;

    const/4 p1, -0x2

    .line 9
    iput p1, p0, LAf/i;->b:I

    return-void
.end method

.method public constructor <init>(LAf/x;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LAf/i;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, LAf/i;->d:Ljava/lang/Object;

    .line 5
    iget-object p1, p1, LAf/x;->a:LAf/k;

    .line 6
    invoke-interface {p1}, LAf/k;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, LAf/i;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LAf/i;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAf/i;->c:Ljava/lang/Object;

    .line 2
    iput-object p2, p0, LAf/i;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lx/r;)V
    .locals 2

    const/4 v0, 0x3

    iput v0, p0, LAf/i;->a:I

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, LAf/i;->d:Ljava/lang/Object;

    const/4 v0, -0x1

    .line 12
    iput v0, p0, LAf/i;->b:I

    .line 13
    new-instance v0, Lx/p;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lx/p;-><init>(Lx/r;LAf/i;Ljf/c;)V

    invoke-static {v0}, LS3/f;->x(Ltf/p;)LAf/l;

    move-result-object p1

    iput-object p1, p0, LAf/i;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget v0, p0, LAf/i;->b:I

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    iget-object v2, p0, LAf/i;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v2, LAf/j;

    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, v2, LAf/j;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ltf/a;

    .line 13
    .line 14
    invoke-interface {v0}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, v2, LAf/j;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ltf/l;

    .line 22
    .line 23
    iget-object v1, p0, LAf/i;->c:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, v1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :goto_0
    iput-object v0, p0, LAf/i;->c:Ljava/lang/Object;

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/4 v0, 0x1

    .line 39
    :goto_1
    iput v0, p0, LAf/i;->b:I

    .line 40
    .line 41
    return-void
.end method

.method public final hasNext()Z
    .locals 5

    .line 1
    iget v0, p0, LAf/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LAf/i;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LAf/l;

    .line 9
    .line 10
    invoke-virtual {v0}, LAf/l;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0

    .line 15
    :pswitch_0
    iget v0, p0, LAf/i;->b:I

    .line 16
    .line 17
    iget-object v1, p0, LAf/i;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Ljava/util/Map;

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-ge v0, v1, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    :goto_0
    return v0

    .line 31
    :goto_1
    :pswitch_1
    iget v0, p0, LAf/i;->b:I

    .line 32
    .line 33
    iget-object v1, p0, LAf/i;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, LAf/x;

    .line 36
    .line 37
    iget v2, v1, LAf/x;->b:I

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    iget-object v4, p0, LAf/i;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v4, Ljava/util/Iterator;

    .line 43
    .line 44
    if-ge v0, v2, :cond_1

    .line 45
    .line 46
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    iget v0, p0, LAf/i;->b:I

    .line 56
    .line 57
    add-int/2addr v0, v3

    .line 58
    iput v0, p0, LAf/i;->b:I

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    iget v0, p0, LAf/i;->b:I

    .line 62
    .line 63
    iget v1, v1, LAf/x;->c:I

    .line 64
    .line 65
    if-ge v0, v1, :cond_2

    .line 66
    .line 67
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    const/4 v3, 0x0

    .line 75
    :goto_2
    return v3

    .line 76
    :pswitch_2
    iget v0, p0, LAf/i;->b:I

    .line 77
    .line 78
    if-gez v0, :cond_3

    .line 79
    .line 80
    invoke-virtual {p0}, LAf/i;->a()V

    .line 81
    .line 82
    .line 83
    :cond_3
    iget v0, p0, LAf/i;->b:I

    .line 84
    .line 85
    const/4 v1, 0x1

    .line 86
    if-ne v0, v1, :cond_4

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_4
    const/4 v1, 0x0

    .line 90
    :goto_3
    return v1

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LAf/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LAf/i;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LAf/l;

    .line 9
    .line 10
    invoke-virtual {v0}, LAf/l;->next()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :pswitch_0
    invoke-virtual {p0}, LAf/i;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, LAf/i;->c:Ljava/lang/Object;

    .line 22
    .line 23
    iget v1, p0, LAf/i;->b:I

    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    iput v1, p0, LAf/i;->b:I

    .line 28
    .line 29
    iget-object v1, p0, LAf/i;->d:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Ljava/util/Map;

    .line 32
    .line 33
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    check-cast v1, LT/a;

    .line 40
    .line 41
    iget-object v1, v1, LT/a;->b:Ljava/lang/Object;

    .line 42
    .line 43
    iput-object v1, p0, LAf/i;->c:Ljava/lang/Object;

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_0
    new-instance v1, Ljava/util/ConcurrentModificationException;

    .line 47
    .line 48
    new-instance v2, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const-string v3, "Hash code of an element ("

    .line 51
    .line 52
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v0, ") has changed after it was added to the persistent set."

    .line 59
    .line 60
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-direct {v1, v0}, Ljava/util/ConcurrentModificationException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw v1

    .line 71
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 72
    .line 73
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 74
    .line 75
    .line 76
    throw v0

    .line 77
    :goto_0
    :pswitch_1
    iget v0, p0, LAf/i;->b:I

    .line 78
    .line 79
    iget-object v1, p0, LAf/i;->d:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v1, LAf/x;

    .line 82
    .line 83
    iget v2, v1, LAf/x;->b:I

    .line 84
    .line 85
    iget-object v3, p0, LAf/i;->c:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v3, Ljava/util/Iterator;

    .line 88
    .line 89
    if-ge v0, v2, :cond_2

    .line 90
    .line 91
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_2

    .line 96
    .line 97
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    iget v0, p0, LAf/i;->b:I

    .line 101
    .line 102
    add-int/lit8 v0, v0, 0x1

    .line 103
    .line 104
    iput v0, p0, LAf/i;->b:I

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_2
    iget v0, p0, LAf/i;->b:I

    .line 108
    .line 109
    iget v1, v1, LAf/x;->c:I

    .line 110
    .line 111
    if-ge v0, v1, :cond_3

    .line 112
    .line 113
    add-int/lit8 v0, v0, 0x1

    .line 114
    .line 115
    iput v0, p0, LAf/i;->b:I

    .line 116
    .line 117
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    return-object v0

    .line 122
    :cond_3
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 123
    .line 124
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 125
    .line 126
    .line 127
    throw v0

    .line 128
    :pswitch_2
    iget v0, p0, LAf/i;->b:I

    .line 129
    .line 130
    if-gez v0, :cond_4

    .line 131
    .line 132
    invoke-virtual {p0}, LAf/i;->a()V

    .line 133
    .line 134
    .line 135
    :cond_4
    iget v0, p0, LAf/i;->b:I

    .line 136
    .line 137
    if-eqz v0, :cond_5

    .line 138
    .line 139
    iget-object v0, p0, LAf/i;->c:Ljava/lang/Object;

    .line 140
    .line 141
    const-string v1, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence"

    .line 142
    .line 143
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    const/4 v1, -0x1

    .line 147
    iput v1, p0, LAf/i;->b:I

    .line 148
    .line 149
    return-object v0

    .line 150
    :cond_5
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 151
    .line 152
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 153
    .line 154
    .line 155
    throw v0

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 3

    .line 1
    iget v0, p0, LAf/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, LAf/i;->b:I

    .line 7
    .line 8
    const/4 v1, -0x1

    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v2, p0, LAf/i;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Lx/r;

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Lx/r;->k(I)V

    .line 16
    .line 17
    .line 18
    iput v1, p0, LAf/i;->b:I

    .line 19
    .line 20
    :cond_0
    return-void

    .line 21
    :pswitch_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 22
    .line 23
    const-string v1, "Operation is not supported for read-only collection"

    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v0

    .line 29
    :pswitch_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 30
    .line 31
    const-string v1, "Operation is not supported for read-only collection"

    .line 32
    .line 33
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0

    .line 37
    :pswitch_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 38
    .line 39
    const-string v1, "Operation is not supported for read-only collection"

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
